package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HorseTest {

    @Test
    public void horseShouldMakeNoise() {
        Horse horse = new Horse();

        String actual = horse.makeNoise();

        assertEquals("Neigh", actual);
    }
}