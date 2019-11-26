package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

public class MovieCrew {

    @SerializedName("id")
    private int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}