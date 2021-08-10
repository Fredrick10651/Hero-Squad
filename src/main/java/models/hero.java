package models;

import java.util.ArrayList;

class Hero {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero (String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }




    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPower() {
        return this.power;
    }

    public String getWeakness() {
        return this.weakness;
    }

    public static ArrayList<Hero> getInstances() {
        return instances;
    }

    public static ArrayList<Hero> getAllInstances() {

        return instances;
    }

    public static void clearHeroes() {
        instances.clear();
    }

    public int getId() {
        return id;
    }

    public static Hero findById(int id) {
        return instances.get(id-1);
    }

    public static Hero buildNewHero() {
        return new Hero("Superman", 45, "Lasers", "Water");
    }

    public static Hero buildNewHero1() {
        return new Hero("Spiderman", 25, "Web", "Venom");
    }

    public static Hero buildNewHero2() {
        return new Hero("Batman", 27, "Judo", "Women");
    }

    public static Hero buildNewHero3() {
        return new Hero("Iron man", 36, "Robot", "Power");
    }

    public static Hero buildNewHero4() {
        return new Hero("Flash", 17, "Speed", "Height");
    }

}

