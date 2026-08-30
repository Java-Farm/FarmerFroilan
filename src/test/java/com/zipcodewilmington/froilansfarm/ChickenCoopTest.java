package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ChickenCoopTest {

    @Test
    void chickenCoopShouldStoreChickens() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();

        chickenCoop.add(chicken);

        assertEquals(1, chickenCoop.size());
        assertSame(chicken, chickenCoop.getResidents().get(0));
    }
}