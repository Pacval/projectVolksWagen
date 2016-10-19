package com.example.iem.volkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public abstract class Vehicule {

    protected String color;
    protected String model;
    protected int nbrWheels;


    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getNbrWheels() {
        return nbrWheels;
    }
}
