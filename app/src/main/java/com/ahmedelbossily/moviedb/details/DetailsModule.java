package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.favorites.FavoritesInteractor;
import com.ahmedelbossily.moviedb.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Module
public class DetailsModule {

    @Provides
    @DetailsScope
    MovieDetailsInteractor provideInteractor(TmdbWebService tmdbWebService) {
        return new MovieDetailsInteractorImpl(tmdbWebService);
    }

    @Provides
    @DetailsScope
    MovieDetailsPresenter providePresenter(MovieDetailsInteractor detailsInteractor,
                                           FavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenterImpl(detailsInteractor, favoritesInteractor);
    }
}
