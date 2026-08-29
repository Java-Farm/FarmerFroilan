package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FroilandaTest {

    @Test
    public void froilandaShouldBePerson() {
        Froilanda froilanda = new Froilanda();

        assertTrue(froilanda instanceof Person);
    }

    @Test
    public void froilandaShouldBeRider() {
        Froilanda froilanda = new Froilanda();

        assertTrue(froilanda instanceof Rider);
    }

    @Test
    public void froilandaShouldBePilot() {
        Froilanda froilanda = new Froilanda();

        assertTrue(froilanda instanceof Pilot);
    }

    @Test
    public void froilandaShouldMountHorse() {
        Froilanda froilanda = new Froilanda();
        Horse horse = new Horse();

        froilanda.mount(horse);

        assertTrue(horse.isMounted());
    }
}