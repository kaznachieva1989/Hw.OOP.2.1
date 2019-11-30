package com.company;

public class Main {

    public static void main(String[] args) {
        Parents parent1 = new Parents(Family_connections.FATHER, "Zhanibek", 52, new House("5-66"),
                "businessman");
        System.out.println(parent1.getInfo());
        parent1.tellSomething(" ");
        parent1.tellSomething(2);
        Children child1 = new Children(Family_connections.BROTHER, "Mirlan", 28, new House("5-66"),
                "Government worker", "Good");
        System.out.println(child1.getInfo());
        child1.tellSomething(" ");
        child1.tellSomething(3);

        Children child2 = new Children(Family_connections.SISTER, "Nurzhamal", 30, new House("5-66"),
                "Housekeeping", "Nice");
        System.out.println(child2.getInfo());
    }
}

