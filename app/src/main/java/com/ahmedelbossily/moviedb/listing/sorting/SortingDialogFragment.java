package com.ahmedelbossily.moviedb.listing.sorting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ahmedelbossily.moviedb.R;
import com.ahmedelbossily.moviedb.listing.MoviesListingPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class SortingDialogFragment extends DialogFragment implements SortingDialogView, RadioGroup.OnCheckedChangeListener {

    @Inject
    SortingDialogPresenter sortingDialogPresenter;

    @BindView(R.id.most_popular)
    RadioButton mostPopular;
    @BindView(R.id.highest_rated)
    RadioButton highestRated;
    @BindView(R.id.favorites)
    RadioButton favorites;
    @BindView(R.id.sorting_group)
    RadioGroup sortingOptionsGroup;

    private static MoviesListingPresenter moviesListingPresenter;
    private Unbinder unbinder;

    public static SortingDialogFragment newInstance(MoviesListingPresenter moviesListingPresenter) {
        SortingDialogFragment.moviesListingPresenter = moviesListingPresenter;
        return new SortingDialogFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        //getActivity().getApplication().getListingComponent()
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }

    @Override
    public void setPopularChecked() {

    }

    @Override
    public void setHighestRatedChecked() {

    }

    @Override
    public void setFavoritesChecked() {

    }

    @Override
    public void dismissDialog() {

    }
}
