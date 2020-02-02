package com.neeraja.harrypotter.data.utils;

import android.content.ClipData;

import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.data.models.MemberData;
import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.entities.MemberEntity;

import java.util.ArrayList;
import java.util.List;

public class TestDataGenerator {
    public static CharacterData getCharacter() {
        CharacterData character = new CharacterData(
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

    public static HouseData getHouse() {
        HouseData houseData = new HouseData(
                "5a05e2b252f721a3cf2ea33f",
                "Gryffindor",
                "lion",
                "Minerva McGonagall",
                "Nearly Headless Nick",
                "Goderic Gryffindor",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new MemberData[]{
                        new MemberData("test1", "5a0fa648ae5bc100213c2332"),
                        new MemberData("test2", "5a0fa67dae5bc100213c2333")
                },
                new String[]{
                        "courage",
                        "bravery",
                        "nerve",
                        "chivalry"},
                new String[]{"scarlet",
                        "gold"}
        );
        return houseData;
    }

    public static List<HouseData> getAllHousesData() {
        List<HouseData> houses = new ArrayList<>();

        HouseData houseData1 = new HouseData(
                "5a05e2b252f721a3cf2ea33f",
                "Gryffindor",
                "lion",
                "Minerva McGonagall",
                "Nearly Headless Nick",
                "Goderic Gryffindor",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new MemberData[]{
                        new MemberData("test1", "5a0fa648ae5bc100213c2332"),
                        new MemberData("test2", "5a0fa67dae5bc100213c2333")
                },
                new String[]{
                        "courage",
                        "bravery",
                        "nerve",
                        "chivalry"},
                new String[]{"scarlet",
                        "gold"}
        );
        HouseData houseData2 = new HouseData(
                "5a05da69d45bd0a11bd5e06f",
                "Ravenclaw",
                "eagle",
                "Fillius Flitwick",
                "The Grey Lady",
                "Rowena Ravenclaw",
                0,
                "Hogwarts School of Witchcraft and Wizardry",
                new MemberData[]{
                        new MemberData("test3", "5a0fa8a6ae5bc100213c233b"),
                        new MemberData("test4", "5a107ffee0686c0021283b21")
                },
                new String[]{
                        "intelligence",
                        "creativity",
                        "learning",
                        "wit"},
                new String[]{"blue",
                        " bronze"}
        );
        houses.add(houseData1);
        houses.add(houseData2);
        return houses;
    }

}
