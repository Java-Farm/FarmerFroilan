package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FarmerTest {

    @Test
    public void farmerShouldBePerson() {
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Person);
    }

    @Test
    public void farmerShouldBeRider() {
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Rider);
    }

    @Test
    public void farmerShouldBeBotanist() {
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Botanist);
    }

    @Test
    public void farmerShouldMountHorse() {
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        farmer.mount(horse);

        assertTrue(horse.isMounted());
    }
}