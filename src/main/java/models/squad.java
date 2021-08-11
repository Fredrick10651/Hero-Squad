
package models;

import java.util.ArrayList;

public class squad {

    private int squadId;
    private String squadTag;
    private int squadTotal;
    private String Motive;

    private ArrayList<hero> squadMembers = new ArrayList<>();
    private static ArrayList<squad> instances = new ArrayList<>();

    public squad(String tag, int total, String motive ) {
        squadTag = tag;
        squadTotal = total;
        this.Motive = motive;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();
    }

    public int getSquadId() {
        return squadId;
    }
    public static squad findBySquadId(int id) {
        return instances.get(id-1);
    }

    public String getSquadTag() {
        return squadTag;
    }

    public int getSquadTotal() {
        return squadTotal;
    }

    public String getMotive() {
        return this.Motive;
    }

    public  static ArrayList<squad>getInstances() {
        return instances;
    }

    public ArrayList<hero> getSquadMembers() {
        return squadMembers;
    }

    public void setSquadMembers(hero newHero) {
        squadMembers.add(newHero);
    }

    public static void clearAllSquads() {
        instances.clear();
    }

    public void clearAllSquadsMembers() {
        getSquadMembers().clear();
    }

    public static squad buildNewSquad() {
        return new squad("Avengers", 5, "Drug trafficking");
    }

    public static squad buildNewSquad1() {
        return new squad("Justice League", 5, "Protect Humans");
    }

    public static squad buildNewSquad2() {
        return new squad("Liberty Saviours", 3, "Defenders of the Space");
    }

}
