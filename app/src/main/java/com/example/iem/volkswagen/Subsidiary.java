package com.example.iem.volkswagen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Subsidiary {

    private String name;
    private double revenue2015;
    private String origin;
    private int nbrEmplyees;
    private int buyingDate;

    private List<Vehicule> productedVehicules = new ArrayList<>();

    public Subsidiary(String name, double revenue2015, String origin, int nbrEmplyees, int buyingDate) {
        this.name = name;
        this.revenue2015 = revenue2015;
        this.origin = origin;
        this.nbrEmplyees = nbrEmplyees;
        this.buyingDate = buyingDate;
    }

    public List<Vehicule> getProductedVehicules() {
        return productedVehicules;
    }

}
