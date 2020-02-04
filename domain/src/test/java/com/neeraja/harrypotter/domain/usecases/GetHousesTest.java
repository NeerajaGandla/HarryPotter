package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.utils.TestDataGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;

@RunWith(JUnit4.class)
public class GetHousesTest {
    private GetAllHousesTask getAllHousesTask;

    @Mock
    private HogwartsRepository hogwartsRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        getAllHousesTask = new GetAllHousesTask(hogwartsRepository,
                Schedulers.trampoline(),
                Schedulers.trampoline());
    }

    @Test
    public void test_getAllHousesTask_success() {
        String apiKey = "test";
        final List<HouseEntity> houses = TestDataGenerator.getAllHousesData();
        Mockito.when(hogwartsRepository.getAllHouses())
                .thenReturn(Observable.just(houses));
        TestObserver testObserver = getAllHousesTask.buildUsecase(apiKey).test();
        testObserver.assertSubscribed()
               .assertValue((Predicate)(new Predicate() {

                   @Override
                   public boolean test(Object o) throws Exception {
                       return this.test((List)o);
                   }

                   public final boolean test(List it) {
                       return it.containsAll(houses);
                   }
               }));
    }

    @Test
    public void test_getAllHousesTask_error() {
        String apiKey = "test";
        final String errorMsg = "Error Occured";
        Mockito.when(hogwartsRepository.getAllHouses())
                .thenReturn(Observable.<List<HouseEntity>>error(new Throwable(errorMsg)));
        TestObserver testObserver = getAllHousesTask.buildUsecase(apiKey).test();
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

    @Test (
            expected =  IllegalArgumentException.class
    )
    public void test_getAllHousesTask_NoParams_error() {
        TestObserver testObserver = getAllHousesTask.buildUsecase(null).test();
        testObserver.assertSubscribed();
    }
}
