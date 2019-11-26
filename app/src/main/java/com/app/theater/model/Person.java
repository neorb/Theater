package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Person {

    @SerializedName("birthday")
    public String birthDay;

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("biography")
    public String biography;

    @SerializedName("profile_path")
    public String profileImagePath;

    public String getBirthDay() {
        return birthDay;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getBiography() {
        return biography;
    }


    public String getProfileImagePath() {
        return profileImagePath;
    }

}