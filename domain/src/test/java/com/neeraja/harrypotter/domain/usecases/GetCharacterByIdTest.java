package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.utils.TestDataGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;

@RunWith(JUnit4.class)
public class GetCharacterByIdTest {
    private GetCharacterByIdTask getCharacterByIdTask;
    @Mock
    private HogwartsRepository hogwartsRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        getCharacterByIdTask = new GetCharacterByIdTask(hogwartsRepository,
                Schedulers.trampoline(),
                Schedulers.trampoline());
    }

    @Test
    public void test_getCharacterById_success() {
        String apiKey = "test";
        String id = "Test";
        final CharacterEntity character = TestDataGenerator.getCharacter();

        Mockito.when(hogwartsRepository.getCharacterByID(id))
                .thenReturn(Observable.just(character));
        TestObserver testObserver = getCharacterByIdTask.buildUsecase(id).test();
        testObserver.assertSubscribed()
                .assertValue((Predicate)(new Predicate() {
                    @Override
                    public boolean test(Object o) throws Exception {
                        return this.test((CharacterEntity)o);
                    }

                    public final boolean test(CharacterEntity characterEntity) {
                        return characterEntity == character;
                    }
                }));
    }

    @Test
    public void test_getCharacterById_error() {
        String apiKey = "Test";
        String id = "test";
        final String errorMsg = "Error occured";

        Mockito.when(hogwartsRepository.getCharacterByID(id))
                .thenReturn(Observable.<CharacterEntity>error(new Throwable(errorMsg)));
        TestObserver testObserver = getCharacterByIdTask.buildUsecase(id).test();
        testObserver.assertSubscribed()
                .assertError((Predicate)(new Predicate() {
                    @Override
                    public boolean test(Object o) throws Exception {
                        return this.test((Throwable)o);
                    }

                    public final boolean test(Throwable it) {
                        String message = it.getMessage();
                        return message != null ? message.equals(errorMsg) : false;
                    }
                }));
    }

    @Test(expected =
            IllegalArgumentException.class
    )
    public void test_getCharacterByIdNoParams_error() {
        TestObserver testObserver = getCharacterByIdTask.buildUsecase(null).test();
        testObserver.assertSubscribed();
    }
}
