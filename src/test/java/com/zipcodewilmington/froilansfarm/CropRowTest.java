package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CropRowTest {

    @Test
    void cropRowShouldStoreCrop() {
        CropRow<CornStalk> cropRow = new CropRow<>();

        cropRow.addCrop(new CornStalk());

        assertEquals(1, cropRow.getCrops().size());
    }
}