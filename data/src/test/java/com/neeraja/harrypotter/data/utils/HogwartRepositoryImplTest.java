package com.neeraja.harrypotter.data.utils;

import com.neeraja.harrypotter.data.mapper.CharacterDomainDataMapper;
import com.neeraja.harrypotter.data.mapper.HouseDomainDataMapper;
import com.neeraja.harrypotter.data.repository.HogwartsRepositoryImpl;
import com.neeraja.harrypotter.data.repository.RemoteDataSource;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class HogwartRepositoryImplTest {
    @Mock
    private RemoteDataSource remoteDataSource;
    private HogwartsRepository hogwartsRepository;
    private CharacterDomainDataMapper characterMapper = new CharacterDomainDataMapper();
    private HouseDomainDataMapper houseMapper = new HouseDomainDataMapper();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        hogwartsRepository = new HogwartsRepositoryImpl(houseMapper, characterMapper, remoteDataSource);
    }

    //TO-DO
}
