package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class SquadTest {

    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = Squad.buildNewSquad();
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void newSquad_getTag_String() {
        Squad newSquad = Squad.buildNewSquad();
        assertEquals("Avengers", newSquad.getSquadTag());
    }

    @Test
    public void newSquad_getTotal_Integer() {
        Squad newSquad = Squad.buildNewSquad();
        assertEquals(5, newSquad.getSquadTotal());
    }

    @Test
    public void newSquad_getMotive_String() {
        Squad newSquad = Squad.buildNewSquad();
        assertEquals("Drug trafficking", newSquad.getMotive());
    }

    @Test
    public void newSquad_getInstances_true() {
        Squad newSquad = Squad.buildNewSquad();
        Squad newChar = Squad.buildNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(newChar));
    }

    @Test
    public void  newSquad_getSquadMembers_List() {
        Squad newSquad = Squad.buildNewSquad();
        Hero newHero = Hero.buildNewHero();
        Hero newHero1 = Hero.buildNewHero1();
        newSquad.setSquadMembers(newHero);
        assertEquals("Batman", newSquad.getSquadMembers().get(0).getName());
    }
}
