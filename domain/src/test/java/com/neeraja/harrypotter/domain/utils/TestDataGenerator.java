package com.neeraja.harrypotter.domain.utils;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataGenerator {
    public static CharacterEntity getCharacter() {
        CharacterEntity character = new CharacterEntity(
                "5a0fa5deae5bc100213c2330",
                "Ludo Bagman",
                "Head, Department of Magical Games and Sports",
                0,
                true,
                false,
                false,
                false,
                "unknown",
                "human");
        return character;
    }

    public static HouseEntity getHouse() {
        HouseEntity houseEntity1 = new HouseEntity(
                "5a05e2b252f721a3cf2ea33f",
                "Gryffindor",
                "lion",
                "Minerva McGonagall",
                "Nearly Headless Nick",
                "Goderic Gryffindor",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new String[]{
                        "5a0fa648ae5bc100213c2332",
                        "5a0fa67dae5bc100213c2333"
                },
                new String[]{
                        "courage",
                        "bravery",
                        "nerve",
                        "chivalry"},
                new String[]{"scarlet",
                        "gold"}
        );
        return houseEntity1;
    }

    public static List<HouseEntity> getAllHousesData() {
        List<HouseEntity> houses = new ArrayList<>();

        HouseEntity houseEntity1 = new HouseEntity(
                "5a05e2b252f721a3cf2ea33f",
                "Gryffindor",
                "lion",
                "Minerva McGonagall",
                "Nearly Headless Nick",
                "Goderic Gryffindor",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new String[]{
                        "5a0fa648ae5bc100213c2332",
                        "5a0fa67dae5bc100213c2333"
                },
                new String[]{
                        "courage",
                        "bravery",
                        "nerve",
                        "chivalry"},
                new String[]{"scarlet",
                        "gold"}
        );
        HouseEntity houseEntity2 = new HouseEntity(
                "5a05da69d45bd0a11bd5e06f",
                "Ravenclaw",
                "eagle",
                "Fillius Flitwick",
                "The Grey Lady",
                "Rowena Ravenclaw",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new String[]{
                        "5a0fa8a6ae5bc100213c233b",
                        "5a107ffee0686c0021283b21"
                },
                new String[]{
                        "intelligence",
                        "creativity",
                        "learning",
                        "wit"},
                new String[]{"blue",
                        " bronze"}
        );
        houses.add(houseEntity1);
        houses.add(houseEntity2);
        return houses;
    }

}
