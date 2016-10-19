package com.example.iem.volkswagen;

/**
 * Created by iem on 19/10/2016.
 */

public class Truck extends Vehicule {

    protected int maxWeightTrailer;

    public Truck(int maxWeightTrailer, String color, String model) {
        this.maxWeightTrailer = maxWeightTrailer;
        this.color = color;
        this.model = model;
    }
}
