package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop<EarCorn> {

@Override
public EarCorn yield() {
    if (!isReadyToYield()) {
        return null;
    }

    return new EarCorn();
}
    }
