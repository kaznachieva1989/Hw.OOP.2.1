package com.company;

public final class Children extends Parents {
    private String behavior;

    public Children() {
    }

    public Children(Family_connections connections, String name, int age, House house, String profession, String behavior) {
        super(connections, name, age, house, profession);
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Behavior: " + behavior;
    }
}
