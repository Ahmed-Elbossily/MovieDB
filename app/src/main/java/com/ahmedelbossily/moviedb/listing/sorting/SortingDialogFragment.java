package com.ahmedelbossily.moviedb.listing.sorting;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ahmedelbossily.moviedb.BaseApplication;
import com.ahmedelbossily.moviedb.R;
import com.ahmedelbossily.moviedb.listing.MoviesListingPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
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
        ((BaseApplication) getActivity().getApplication()).getListingComponent().inject(this);
        sortingDialogPresenter.setView(this);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialogView = inflater.inflate(R.layout.sorting_options, null);
        unbinder = ButterKnife.bind(this, dialogView);
        initViews();

        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(dialogView);
        dialog.setTitle(R.string.sort_by);
        dialog.show();
        return dialog;
    }

    private void initViews() {
        sortingDialogPresenter.setLastSavedOption();
        sortingOptionsGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void setPopularChecked() {
        mostPopular.setChecked(true);
    }

    @Override
    public void setHighestRatedChecked() {
        highestRated.setChecked(true);
    }

    @Override
    public void setFavoritesChecked() {
        favorites.setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.most_popular:
                sortingDialogPresenter.onPopularMoviesSelected();
                moviesListingPresenter.displayMovies();
                break;
            case R.id.highest_rated:
                sortingDialogPresenter.onHighestRatedMoviesSelected();
                moviesListingPresenter.displayMovies();
                break;
            case R.id.favorites:
                sortingDialogPresenter.onFavoritesSelected();
                moviesListingPresenter.displayMovies();
                break;
        }
    }

    @Override
    public void dismissDialog() {
        dismiss();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        sortingDialogPresenter.destroy();
        unbinder.unbind();
    }
}
