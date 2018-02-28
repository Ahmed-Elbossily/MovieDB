package com.ahmedelbossily.moviedb.listing.sorting;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface SortingDialogPresenter {

    void setLastSavedOption();
    void onPopularMoviesSelected();
    void onHighestRatedMoviesSelected();
    void onFavoritesSelected();
    void setView(SortingDialogView view);
    void destroy();
}
