package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CornStalkTest {

    @Test
    void cornStalkShouldYieldCorn() {
        CornStalk cornStalk = new CornStalk();

        cornStalk.fertilize();
        cornStalk.harvest();

        assertNotNull(cornStalk.yield());
    }
}