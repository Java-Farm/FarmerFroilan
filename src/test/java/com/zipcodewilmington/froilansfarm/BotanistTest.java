package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BotanistTest {

    @Test
    public void botanistShouldHavePlantMethod() throws NoSuchMethodException {
        Method method = Botanist.class.getMethod(
                "plant",
                Crop.class,
                CropRow.class
        );

        assertNotNull(method);
    }
}