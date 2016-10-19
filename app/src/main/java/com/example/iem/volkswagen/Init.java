package com.example.iem.volkswagen;

/**
 * Created by iem on 19/10/2016.
 */
public class Init {
    private static Init ourInstance = new Init();

    public static Init getInstance() {
        return ourInstance;
    }

    private Init() {

        Group volkswagen = new Group("VolksWagen");

        // SUBSIDIARY : AUDI
        Subsidiary audi = new Subsidiary("Audi", 49.6, "Germany", 59513, 1964);

        Vehicule audiA1 = new Car("A1", "Supermini");



    }
}
