package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.favorites.FavoritesInteractor;
import com.ahmedelbossily.moviedb.listing.sorting.SortingOptionStore;
import com.ahmedelbossily.moviedb.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Module
public class ListingModule {

    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
