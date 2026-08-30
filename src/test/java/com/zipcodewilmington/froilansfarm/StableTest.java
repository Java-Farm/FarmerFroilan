package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class StableTest {

    @Test
    void stableShouldStoreHorses() {
        Stable stable = new Stable();
        Horse horse = new Horse();

        stable.add(horse);

        assertEquals(1, stable.size());
        assertSame(horse, stable.getResidents().get(0));
    }
}