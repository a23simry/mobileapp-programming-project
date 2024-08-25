package com.example.project;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class Plant {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private String auxdata;



    public Plant() {
        name="No Name";
    }



    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return "Category: " + this.category;
    }
    public String getLocation() {
        return "Can be found around: " + this.location;
    }

    public String getAuxdata(){
        return this.auxdata;
    }



}
