package com.example.iem.volkswagen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Group {

    private String name;
    public List<Subsidiary> subsidiaries;



    public Group(String name) {
        this.name = name;
        this.subsidiaries = new ArrayList<>();
    }

    public Group(String name, List<Subsidiary> subsidiaries) {
        this.name = name;
        this.subsidiaries = subsidiaries;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
