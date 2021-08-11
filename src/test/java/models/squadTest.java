package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class squadTest {

    @Test
    public void newSquad_instantiatesCorrectly_true() {
        squad newSquad = squad.buildNewSquad();
        assertTrue(newSquad instanceof squad);
    }

    @Test
    public void newSquad_getTag_String() {
        squad newSquad = squad.buildNewSquad();
        assertEquals("Avengers", newSquad.getSquadTag());
    }

    @Test
    public void newSquad_getTotal_Integer() {
        squad newSquad = squad.buildNewSquad();
        assertEquals(5, newSquad.getSquadTotal());
    }

    @Test
    public void newSquad_getMotive_String() {
        squad newSquad =squad.buildNewSquad();
        assertEquals("Drug trafficking", newSquad.getMotive());
    }

    @Test
    public void newSquad_getInstances_true() {
        squad newSquad = squad.buildNewSquad();
        squad newChar = squad.buildNewSquad();
        assertTrue(squad.getInstances().contains(newSquad));
        assertTrue(squad.getInstances().contains(newChar));
    }

    @Test
    public void  newSquad_getSquadMembers_List() {
        squad newSquad = squad.buildNewSquad();
        hero newHero = hero.buildNewHero();
        hero newHero1 = hero.buildNewHero1();
        newSquad.setSquadMembers(newHero);
        assertEquals("Superman", newSquad.getSquadMembers().get(0).getName());
    }
}
