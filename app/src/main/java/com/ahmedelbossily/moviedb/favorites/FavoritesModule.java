package com.ahmedelbossily.moviedb.favorites;

import com.ahmedelbossily.moviedb.AppModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Module(includes = AppModule.class)
public class FavoritesModule {

    @Provides
    @Singleton
    FavoritesInteractor provideFavouritesInteractor(FavoritesStore store) {
        return new FavoritesInteractorImpl(store);
    }
}
