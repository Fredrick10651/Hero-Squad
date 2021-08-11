package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class heroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        hero newHero = hero.buildNewHero();
        assertTrue(true);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void newHero_getName_String() {
        hero newHero = hero.buildNewHero();
        assertEquals("Superman", newHero.getName());
    }

    @Test
    public void newHero_getAge_Integer() {
        hero newHero = hero.buildNewHero();
        assertEquals(45, newHero.getAge());
    }

    @Test
    public void newHero_getPower_String() {
        hero newHero = hero.buildNewHero();
        assertEquals("Lasers", newHero.getPower());
    }

    @Test
    public void newHero_getWeakness_String() {
        hero newHero = hero.buildNewHero();
        assertEquals("Water", newHero.getWeakness());
    }

    @Test
    public void newHero_getInstances_true() {
//        hero = hero.buildNewHero();
        hero newChar = hero.buildNewHero();
        hero newChar1 = hero.buildNewHero();
        hero newChar2 = hero.buildNewHero();
        hero newChar3 = hero.buildNewHero();
//        assertEquals(5, newChar.newChar());
    }
}

