package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieReviewResponse {

    @SerializedName("id")
    private int id;

    @SerializedName("results")
    private List<MovieReview> reviews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<MovieReview> getReviews() {
        return reviews;
    }
}