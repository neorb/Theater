package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

public class MovieLang {

    @SerializedName("name")
    private String name;
    @SerializedName("iso_639_1")
    private String abbreviation;
    @SerializedName("english_name")
    private String englishName;

    public MovieLang(String abbreviation, String englishName, String name) {
        this.abbreviation = abbreviation;
        this.englishName = englishName;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
