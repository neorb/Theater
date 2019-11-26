package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

public class MovieCast {
    @SerializedName("character")
    private String characterName;

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String actorName;

    @SerializedName("profile_path")
    private String profileImagePath;

    public String getCharacterName() {
        return characterName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

}
