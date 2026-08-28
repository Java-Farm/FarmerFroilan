package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void personShouldMakeNoise() {
        Person person = new Person() {
        };

        assertEquals("Hello", person.makeNoise());
    }

    @Test
    public void personShouldEat() {
        Person person = new Person() {
        };

        Edible food = new EarCorn();

        person.eat(food);

        assertEquals("Hello", person.makeNoise());
    }
}