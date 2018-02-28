package com.ahmedelbossily.moviedb.listing.sorting;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface SortingDialogView {

    void setPopularChecked();
    void setHighestRatedChecked();
    void setFavoritesChecked();
    void dismissDialog();
}
