package com.company;

import java.util.Random;

public class Parents extends Members_of_family {
    private String profession;

    public void tellSomething(String voice) {
        Random r = new Random();
        int number = r.nextInt();
        if (number == 0) {
            System.out.println(voice + "Доброе утро");
        } else {
            System.out.println(voice + "Спокойной ночи");
        }
    }

    public final void tellSomething(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Всем привет!");
        }
    }

    public String getInfo() {
        return "Members_of_Family: " + connections + " Name: " + getName() + " Age: " + getAge()
                + " Address: " + house.getAddress() + " Profession: " + profession;
    }

    public Parents() {
    }

    public Parents(Family_connections connections, String name, int age, House house, String profession) {
        super(connections, name, age, house);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
