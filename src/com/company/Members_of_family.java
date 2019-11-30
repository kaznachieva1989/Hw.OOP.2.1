package com.company;

public class Members_of_family {
    private String name;
    private int age;
    House house;
    Family_connections connections;

    public void setHouse(House house) {
        this.house = house;
    }

    public Members_of_family() {
    }

    public Members_of_family(Family_connections connections, String name, int age, House house) {
        this.connections = connections;
        this.name = name;
        this.age = age;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public House getHouse() {
        return house;
    }

    public Family_connections getConnections() {
        return connections;
    }
}
