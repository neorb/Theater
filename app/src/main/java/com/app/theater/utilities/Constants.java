package com.app.theater.utilities;

import com.app.theater.networking.ConnectivityReceiver;

import butterknife.BuildConfig;

public class Constants {

    // Constants of The Movie Database API
    public static final String API_KEY = "c85ab2a1c9c6d08342596b61d621f43c";
    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String POPULAR_MOVIES_URL = "movie/popular";
    public static final String TOP_RATED_MOVIES_URL = "movie/top_rated";
    public static final String UPCOMING_MOVIES_URL = "movie/upcoming";
    public static final String NOW_PLAYING_MOVIES_URL = "movie/now_playing";
    public static final String LATEST_MOVIES_URL = "movie/latest";
    public static final String MOVIE_DETAILS_URL = "movie/{id}";
    public static final String LANGUAGES = "configuration/languages";
    public static final String CREDITS_URL = "movie/{movie_id}/credits";
    public static final String TRAILERS_URL = "movie/{movie_id}/videos";
    public static final String REVIEWS_URL = "movie/{movie_id}/reviews";
    public static final String PERSON_URL = "person/{person_id}";

    public static final String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/";
    public static final String IMAGE_SIZE_185 = "w185";
    public static final String IMAGE_SIZE_342 = "w342";

    public static final String CATEGORY_MOST_POPULAR = "Most Popular";
    public static final String CATEGORY_TOP_RATED = "Top Rated";
    public static final String CATEGORY_FAVOURITE = "Favourite";

    // Grid arrangement types
    public static final String ARRANGEMENT_COMPACT = "compact";
    public static final String ARRANGEMENT_COZY = "cozy";

    public static final String EXTRA_MOVIE_ITEM = "movie_image_url";
    public static final String EXTRA_MOVIE_IMAGE_TRANSITION_NAME = "movie_image_transition_name";

    //public static final String EXTRA_PERSON_ITEM = "person";

    public static final String SORT_TYPE = "sort_type";
    public static final String ADAPTER_POSITION = "adapter_position";
    public static final String ARRANGEMENT_TYPE = "arrangement_type";
    public static final String CALL_PAGE = "call_page";
    public static final String CALL_PAGE_PENDING = "call_page_pending";
    public static final String RESUME_NORMAL = "normal";
    public static final String RESUME_AFTER_ROTATION = "rotated";
}
