package com.app.theater.adapter;

import android.widget.ImageView;

import com.app.theater.model.Movie;

public interface MovieClickListener {
    void onMovieClick(int pos, Movie movie, ImageView shareImageView);
}