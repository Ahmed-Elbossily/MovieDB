package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.Movie;
import com.ahmedelbossily.moviedb.MoviesWrapper;
import com.ahmedelbossily.moviedb.favorites.FavoritesInteractor;
import com.ahmedelbossily.moviedb.listing.sorting.SortType;
import com.ahmedelbossily.moviedb.listing.sorting.SortingOptionStore;
import com.ahmedelbossily.moviedb.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

class MoviesListingInteractorImpl implements MoviesListingInteractor {

    private FavoritesInteractor favoritesInteractor;
    private TmdbWebService tmdbWebService;
    private SortingOptionStore sortingOptionStore;

    MoviesListingInteractorImpl(FavoritesInteractor favoritesInteractor,
                                TmdbWebService tmdbWebService,
                                SortingOptionStore store) {
        this.favoritesInteractor = favoritesInteractor;
        this.tmdbWebService = tmdbWebService;
        sortingOptionStore = store;
    }

    @Override
    public Observable<List<Movie>> fetchMovies() {
        int selectedOption = sortingOptionStore.getSelectedOption();

        if (selectedOption == SortType.MOST_POPULAR.getValue()) {
            return tmdbWebService.popularMovies().map(MoviesWrapper::getMovieList);
        } else if (selectedOption == SortType.HIGHEST_RATED.getValue()) {
            return tmdbWebService.highestRatedMovies().map(MoviesWrapper::getMovieList);
        } else {
            return Observable.just(favoritesInteractor.getFavorites());
        }
    }
}
