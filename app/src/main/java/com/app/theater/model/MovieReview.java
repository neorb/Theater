package com.app.theater.model;

import com.google.gson.annotations.SerializedName;

public class MovieReview {

    @SerializedName("author")
    private String reviewer;

    @SerializedName("content")
    private String reviewContent;



    public String getReviewer() {
        return reviewer;
    }

    public String getReviewContent() {
        return reviewContent;
    }

}
