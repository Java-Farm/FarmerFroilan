package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShelterTest {

    @Test
    void shelterShouldStoreAnimal() {
        Shelter<Horse> shelter = new Shelter<>();
        Horse horse = new Horse();

        shelter.add(horse);

        assertEquals(1, shelter.size());
    }

    @Test
    void shelterShouldReturnItsResidents() {
        Shelter<Horse> shelter = new Shelter<>();
        Horse horse = new Horse();

        shelter.add(horse);

        assertSame(horse, shelter.getResidents().get(0));
    }

    @Test
    void shelterShouldMakeAllResidentsCreateNoise() {
        Shelter<TestAnimal> shelter = new Shelter<>();
        TestAnimal firstAnimal = new TestAnimal();
        TestAnimal secondAnimal = new TestAnimal();

        shelter.add(firstAnimal);
        shelter.add(secondAnimal);

        shelter.makeAllNoise();

        assertTrue(firstAnimal.hasMadeNoise());
        assertTrue(secondAnimal.hasMadeNoise());
    }

    private static class TestAnimal extends Animal {

        private boolean madeNoise;

        @Override
        public String makeNoise() {
            madeNoise = true;
            return "test noise";
        }

        boolean hasMadeNoise() {
            return madeNoise;
        }
    }
}