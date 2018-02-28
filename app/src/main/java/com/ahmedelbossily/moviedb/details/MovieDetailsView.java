package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.Movie;
import com.ahmedelbossily.moviedb.Review;
import com.ahmedelbossily.moviedb.Video;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MovieDetailsView {

    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
