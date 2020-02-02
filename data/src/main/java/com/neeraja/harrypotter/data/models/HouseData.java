package com.neeraja.harrypotter.data.models;

import java.util.Arrays;

public class HouseData {

    private String id;
    private String name;

    private String mascot;

    private String headOfHouse;

    private String houseGhost;

    private String founder;

    private int __v;

    private String school;

    private MemberData[] members;

    private String[] values;

    private String[] colors;

    public HouseData(String id, String name, String mascot, String headOfHouse, String houseGhost, String founder, int __v, String school, MemberData[] members, String[] values, String[] colors) {
        this.id = id;
        this.name = name;
        this.mascot = mascot;
        this.headOfHouse = headOfHouse;
        this.houseGhost = houseGhost;
        this.founder = founder;
        this.__v = __v;
        this.school = school;
        this.members = members;
        this.values = values;
        this.colors = colors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(String headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    public String getHouseGhost() {
        return houseGhost;
    }

    public void setHouseGhost(String houseGhost) {
        this.houseGhost = houseGhost;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public MemberData[] getMembers() {
        return members;
    }

    public void setMembers(MemberData[] members) {
        this.members = members;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "HouseEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mascot='" + mascot + '\'' +
                ", headOfHouse='" + headOfHouse + '\'' +
                ", houseGhost='" + houseGhost + '\'' +
                ", founder='" + founder + '\'' +
                ", __v=" + __v +
                ", members=" + Arrays.toString(members) +
                ", values=" + Arrays.toString(values) +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}
