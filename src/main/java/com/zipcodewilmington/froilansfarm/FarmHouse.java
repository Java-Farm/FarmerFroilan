package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private final List<Person> residents = new ArrayList<>();

    public void add(Person resident) {
        residents.add(resident);
    }

    public List<Person> getResidents() {
        return residents;
    }

    public int size() {
        return residents.size();
    }
}