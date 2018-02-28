package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.Movie;
import com.ahmedelbossily.moviedb.util.RxUtils;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class MoviesListingPresenterImpl implements MoviesListingPresenter {

    private MoviesListingView view;
    private MoviesListingInteractor moviesInteractor;
    private Disposable fetchSubscription;

    MoviesListingPresenterImpl(MoviesListingInteractor interactor) {
        this.moviesInteractor = interactor;
    }

    @Override
    public void setView(MoviesListingView view) {
        this.view = view;
        displayMovies();
    }

    @Override
    public void destroy() {
        view = null;
        RxUtils.unsubscribe(fetchSubscription);
    }

    @Override
    public void displayMovies() {
        showLoading();
        fetchSubscription = moviesInteractor.fetchMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onMovieFetchSuccess, this::onMovieFetchFailed);
    }

    private void showLoading() {
        if (isViewAttached()) {
            view.loadingStarted();
        }
    }

    private void onMovieFetchSuccess(List<Movie> movies) {
        if (isViewAttached()) {
            view.showMovies(movies);
        }
    }

    private void onMovieFetchFailed(Throwable e) {
        if (isViewAttached()) {
            view.loadingFailed(e.getMessage());
        }
    }

    private boolean isViewAttached() {
        return view != null;
    }
}
