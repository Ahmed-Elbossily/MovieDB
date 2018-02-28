package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.Movie;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MovieDetailsPresenter {

    void showDetails(Movie movie);
    void showTrailers(Movie movie);
    void showReviews(Movie movie);
    void showFavoriteButton(Movie movie);
    void onFavoriteClick(Movie movie);
    void setView(MovieDetailsView view);
    void destroy();
}
