package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MorningRoutineTest extends FarmTestSetup {

    @Test
    void froilanAndFroilandaShouldCompleteMorningRoutine() {

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getResidents()) {

                froilan.mount(horse);
                assertTrue(horse.isMounted());
                froilan.dismount(horse);
                assertFalse(horse.isMounted());

                froilanda.mount(horse);
                assertTrue(horse.isMounted());
                froilanda.dismount(horse);
                assertFalse(horse.isMounted());

                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());

                assertEquals(3, horse.getConsumedFood().size());
            }
        }

        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());

        for (int i = 0; i < 5; i++) {
            froilan.eat(new EdibleEgg());
        }

        froilanda.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new Tomato());

        for (int i = 0; i < 2; i++) {
            froilanda.eat(new EdibleEgg());
        }

        assertEquals(8, froilan.getConsumedFood().size());
        assertEquals(5, froilanda.getConsumedFood().size());
    }
}