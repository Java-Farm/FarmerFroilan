package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FarmHouseTest {

    @Test
    void farmHouseShouldStorePeople() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Froilanda();

        farmHouse.add(person);

        assertEquals(1, farmHouse.size());
        assertSame(person, farmHouse.getResidents().get(0));
    }
}