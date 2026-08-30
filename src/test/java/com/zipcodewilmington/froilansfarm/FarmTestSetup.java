package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;

public class FarmTestSetup {

    protected Farm farm;
    protected Farmer froilan;
    protected Froilanda froilanda;
    protected Field field;
    protected CropDuster cropDuster;
    protected Tractor tractor;

    protected CropRow<CornStalk> firstRow;
    protected CropRow<TomatoPlant> secondRow;
    protected CropRow<WheatPlant> thirdRow;
    protected CropRow<CornStalk> fourthRow;
    protected CropRow<TomatoPlant> fifthRow;

    @BeforeEach
    void setUpFarm() {
        farm = new Farm();
        froilan = new Farmer();
        froilanda = new Froilanda();
        field = new Field();
        cropDuster = new CropDuster();
        tractor = new Tractor();

        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
        farm.setFarmHouse(farmHouse);

        createStablesAndHorses();
        createChickenCoopsAndChickens();
        createField();
    }

    private void createStablesAndHorses() {
        Stable firstStable = new Stable();
        Stable secondStable = new Stable();
        Stable thirdStable = new Stable();

        farm.addStable(firstStable);
        farm.addStable(secondStable);
        farm.addStable(thirdStable);

        for (int i = 0; i < 10; i++) {
            farm.getStables().get(i % 3).add(new Horse());
        }
    }

    private void createChickenCoopsAndChickens() {
        for (int i = 0; i < 4; i++) {
            farm.addChickenCoop(new ChickenCoop());
        }

        for (int i = 0; i < 15; i++) {
            farm.getChickenCoops().get(i % 4).add(new Chicken());
        }
    }

    private void createField() {
        firstRow = new CropRow<>();
        secondRow = new CropRow<>();
        thirdRow = new CropRow<>();
        fourthRow = new CropRow<>();
        fifthRow = new CropRow<>();

        field.addCropRow(firstRow);
        field.addCropRow(secondRow);
        field.addCropRow(thirdRow);
        field.addCropRow(fourthRow);
        field.addCropRow(fifthRow);
    }
}