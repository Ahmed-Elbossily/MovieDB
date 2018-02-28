package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.Movie;
import com.ahmedelbossily.moviedb.favorites.FavoritesInteractor;

import io.reactivex.disposables.Disposable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class MovieDetailsPresenterImpl implements MovieDetailsPresenter {

    private MovieDetailsView view;
    private MovieDetailsInteractor movieDetailsInteractor;
    private FavoritesInteractor favoritesInteractor;
    private Disposable trailersSubscription;
    private Disposable reviewSubscription;

    MovieDetailsPresenterImpl(MovieDetailsInteractor movieDetailsInteractor, FavoritesInteractor favoritesInteractor) {
        this.movieDetailsInteractor = movieDetailsInteractor;
        this.favoritesInteractor = favoritesInteractor;
    }

    @Override
    public void setView(MovieDetailsView view) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void showDetails(Movie movie) {

    }

    private boolean isViewAttached() {
        return view != null;
    }

    @Override
    public void showTrailers(Movie movie) {

    }

    @Override
    public void showReviews(Movie movie) {

    }

    @Override
    public void showFavoriteButton(Movie movie) {

    }

    @Override
    public void onFavoriteClick(Movie movie) {

    }
}
