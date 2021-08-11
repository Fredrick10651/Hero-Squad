package models;

import java.util.ArrayList;

public class hero {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<hero> instances = new ArrayList<>();

    public hero(String name, Integer age, String power, String weakness) {
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

    public static ArrayList<hero> getInstances() {
        return instances;
    }

    public static ArrayList<hero> getAllInstances() {

        return instances;
    }

    public static void clearHeroes() {
        instances.clear();
    }

    public int getId() {
        return id;
    }

    public static hero findById(int id) {
        return instances.get(id-1);
    }

    public static hero buildNewHero() {
        return new hero("Superman", 45, "Lasers", "Water");
    }

    public static hero buildNewHero1() {
        return new hero("Spiderman", 25, "Web", "Venom");
    }

    public static hero buildNewHero2() {
        return new hero("Batman", 27, "Judo", "Women");
    }

    public static hero buildNewHero3() {
        return new hero("Iron man", 36, "Robot", "Power");
    }

    public static hero buildNewHero4() {
        return new hero("Flash", 17, "Speed", "Height");
    }

}

