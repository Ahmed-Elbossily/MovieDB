package com.ahmedelbossily.moviedb.listing.sorting;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

class SortingDialogInteractorImpl implements SortingDialogInteractor {

    private SortingOptionStore sortingOptionStore;

    SortingDialogInteractorImpl(SortingOptionStore store) {
        sortingOptionStore = store;
    }

    @Override
    public int getSelectedSortingOption() {
        return sortingOptionStore.getSelectedOption();
    }

    @Override
    public void setSortingOption(SortType sortType) {
        sortingOptionStore.setSelectedOption(sortType);
    }
}
