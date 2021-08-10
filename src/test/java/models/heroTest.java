package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class HeroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = Hero.buildNewHero();
        assertTrue(true);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.buildNewHero();
        assertEquals("Superman", newHero.getName());
    }

    @Test
    public void newHero_getAge_Integer() {
        Hero newHero = Hero.buildNewHero();
        assertEquals(45, newHero.getAge());
    }

    @Test
    public void newHero_getPower_String() {
        Hero newHero = Hero.buildNewHero();
        assertEquals("Iron man", newHero.getPower());
    }

    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.buildNewHero();
        assertEquals("Arrow", newHero.getWeakness());
    }

    @Test
    public void newHero_getInstances_true() {
        Hero newHero = Hero.buildNewHero();
        Hero newChar = Hero.buildNewHero();
        Hero newChar1 = Hero.buildNewHero();
        Hero newChar2 = Hero.buildNewHero();
        Hero newChar3 = Hero.buildNewHero();

    }
}