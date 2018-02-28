package com.ahmedelbossily.moviedb.listing;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MoviesListingPresenter {

    void displayMovies();
    void setView(MoviesListingView view);
    void destroy();
}
