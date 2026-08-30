package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final List<Stable> stables = new ArrayList<>();
    private final List<ChickenCoop> chickenCoops = new ArrayList<>();
    private FarmHouse farmHouse;

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}