package com.ahmedelbossily.moviedb.favorites;

import com.ahmedelbossily.moviedb.Movie;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface FavoritesInteractor {

    void setFavorite(Movie movie);
    boolean isFavorite(String id);
    List<Movie> getFavorites();
    void unFavorite(String id);
}
