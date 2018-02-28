package com.ahmedelbossily.moviedb.listing;

import com.ahmedelbossily.moviedb.listing.sorting.SortingDialogFragment;
import com.ahmedelbossily.moviedb.listing.sorting.SortingModule;

import dagger.Subcomponent;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {

    MoviesListingFragment inject(MoviesListingFragment fragment);
    SortingDialogFragment inject(SortingDialogFragment fragment);
}
