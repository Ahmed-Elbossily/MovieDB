package com.ahmedelbossily.moviedb;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Module
public class AppModule {

    private Context context;

    AppModule(Application application) {
        context = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public Resources provideResources(Context context) {
        return context.getResources();
    }
}
