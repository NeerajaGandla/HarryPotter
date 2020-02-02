package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.utils.TestDataGenerator;

import net.bytebuddy.implementation.bytecode.Throw;

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
public class GetHouseByIdTest {
    private GetHouseByIdTask getHouseByIdTask;

    @Mock
    private HogwartsRepository hogwartsRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        getHouseByIdTask = new GetHouseByIdTask(hogwartsRepository,
                Schedulers.trampoline(),
                Schedulers.trampoline());
    }

    @Test
    public void test_getHouseByIdTask_success() {
        String apiKey = "test";
        String id = "testId";
        final HouseEntity house = TestDataGenerator.getHouse();

        Mockito.when(hogwartsRepository.getHouseByID(apiKey, id))
                .thenReturn(Observable.just(house));

        TestObserver testObserver = getHouseByIdTask.buildUsecase(new GetHouseByIdTask.Params(apiKey, id)).test();

        testObserver.assertSubscribed()
                .assertValue((Predicate)(new Predicate() {
                    @Override
                    public boolean test(Object o) throws Exception {
                        return this.test((HouseEntity)o);
                    }

                    public final boolean test(HouseEntity it) {
                        return it == house;
                    }
                }));
    }

    @Test
    public void test_getHouseByIdTask_error() {
        String apiKey = "test";
        String id = "testId";
        final String errorMsg = "Error Occured";

        Mockito.when(hogwartsRepository.getHouseByID(apiKey, id))
                .thenReturn(Observable.<HouseEntity>error(new Throwable(errorMsg)));

        TestObserver testObserver = getHouseByIdTask.buildUsecase(new GetHouseByIdTask.Params(apiKey, id)).test();
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

    @Test(
            expected = IllegalArgumentException.class
    )
    public void test_getHouseByIdTaskNoParams_error() {
        TestObserver testObserver = getHouseByIdTask.buildUsecase(null).test();
        testObserver.assertSubscribed();
    }
}
