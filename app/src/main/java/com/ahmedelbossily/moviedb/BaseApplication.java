package com.ahmedelbossily.moviedb;

import android.app.Application;
import android.os.StrictMode;

import com.ahmedelbossily.moviedb.favorites.FavoritesModule;
import com.ahmedelbossily.moviedb.listing.ListingComponent;
import com.ahmedelbossily.moviedb.listing.ListingModule;
import com.ahmedelbossily.moviedb.network.NetworkModule;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class BaseApplication extends Application {

    private AppComponent appComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.enableDefaults();
        //appComponent = createAppComponent();
    }

//    private AppComponent createAppComponent() {
//        return DaggerAppComponent.builder()
//                .appModule(new AppModule(this))
//                .networkModule(new NetworkModule())
//                .favoritesModule(new FavoritesModule())
//                .build();
//    }

    public ListingComponent createListingComponent() {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent() {
        listingComponent = null;
    }

    public ListingComponent getListingComponent() {
        return listingComponent;
    }
}
