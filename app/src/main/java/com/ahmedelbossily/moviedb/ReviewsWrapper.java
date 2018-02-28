package com.ahmedelbossily.moviedb;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class ReviewsWrapper {

    @Json(name = "results")
    private List<Review> reviews;

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
