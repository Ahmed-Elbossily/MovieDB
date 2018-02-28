package com.ahmedelbossily.moviedb;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class MoviesWrapper {

    @Json(name = "results")
    private List<Movie> movies;

    public List<Movie> getMovieList() {
        return movies;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movies = movieList;
    }
}
