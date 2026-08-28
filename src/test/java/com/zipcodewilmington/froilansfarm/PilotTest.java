package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PilotTest {

    @Test
    public void pilotShouldHaveFlyMethod() throws NoSuchMethodException {
        Method method = Pilot.class.getMethod(
                "fly",
                Aircraft.class
        );

        assertNotNull(method);
    }
}