package com.example.iem.volkswagen;

import android.widget.ImageView;

import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

public class Subsidiary {

    private String name;
    private ImageView logo;
    private int revenue2015;
    private String origin;
    private int nbrEmplyees;
    private Date buyingDate;

    public Subsidiary(String name, ImageView logo, int revenue2015, String origin, int nbrEmplyees, Date buyingDate) {
        this.name = name;
        this.logo = logo;
        this.revenue2015 = revenue2015;
        this.origin = origin;
        this.nbrEmplyees = nbrEmplyees;
        this.buyingDate = buyingDate;
    }
}
