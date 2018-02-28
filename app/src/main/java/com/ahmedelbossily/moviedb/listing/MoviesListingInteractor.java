package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.Movie;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MoviesListingInteractor {

    Observable<List<Movie>> fetchMovies();
}
