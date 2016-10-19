package com.example.iem.volkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Car extends Vehicule {

    private String type;

    public Car(String model, String type) {
        this.color = color;
        this.model = model;
        this.nbrWheels = 4;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
