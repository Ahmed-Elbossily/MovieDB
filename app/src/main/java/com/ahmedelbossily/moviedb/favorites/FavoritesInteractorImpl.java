package com.ahmedelbossily.moviedb.favorites;

import com.ahmedelbossily.moviedb.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

class FavoritesInteractorImpl implements FavoritesInteractor {

    private FavoritesStore favoritesStore;

    FavoritesInteractorImpl(FavoritesStore store) {
        favoritesStore = store;
    }

    @Override
    public void setFavorite(Movie movie) {
        favoritesStore.setFavorite(movie);
    }

    @Override
    public boolean isFavorite(String id) {
        return favoritesStore.isFavorite(id);
    }

    @Override
    public List<Movie> getFavorites() {
        try {
            return favoritesStore.getFavorites();
        } catch (IOException ignored) {
            return new ArrayList<>(0);
        }
    }

    @Override
    public void unFavorite(String id) {
        favoritesStore.unfavorite(id);
    }
}
