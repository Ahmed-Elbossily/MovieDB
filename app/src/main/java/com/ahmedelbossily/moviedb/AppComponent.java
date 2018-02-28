package com.ahmedelbossily.moviedb;

import com.ahmedelbossily.moviedb.favorites.FavoritesModule;
import com.ahmedelbossily.moviedb.listing.ListingComponent;
import com.ahmedelbossily.moviedb.listing.ListingModule;
import com.ahmedelbossily.moviedb.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent
{
    //DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}