package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.Movie;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MoviesListingView {

    void showMovies(List<Movie> movies);
    void loadingStarted();
    void loadingFailed(String errorMessage);
    void onMovieClicked(Movie movie);
}
