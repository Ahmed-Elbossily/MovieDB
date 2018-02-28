package com.ahmedelbossily.moviedb.listing.sorting;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Module
public class SortingModule {

    @Provides
    SortingDialogInteractor providesSortingDialogInteractor(SortingOptionStore store) {
        return new SortingDialogInteractorImpl(store);
    }

    @Provides
    SortingDialogPresenter providePresenter(SortingDialogInteractor interactor) {
        return new SortingDialogPresenterImpl(interactor);
    }
}
