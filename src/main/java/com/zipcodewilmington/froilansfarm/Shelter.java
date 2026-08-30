package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Shelter<T extends Animal> {

    private final List<T> residents = new ArrayList<>();

    public void add(T resident) {
        residents.add(resident);
    }

    public List<T> getResidents() {
        return residents;
    }
    public void makeAllNoise() {
        for (T resident : residents) {
            resident.makeNoise();
        }
    }

    public int size() {
        return residents.size();
    }
}