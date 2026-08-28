package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldTest {

    @Test
    void fieldShouldStoreCropRow() {
        Field field = new Field();

        field.addCropRow(new CropRow<CornStalk>());

        assertEquals(1, field.getCropRows().size());
    }
}