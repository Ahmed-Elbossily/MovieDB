package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.Review;
import com.ahmedelbossily.moviedb.ReviewsWrapper;
import com.ahmedelbossily.moviedb.Video;
import com.ahmedelbossily.moviedb.VideoWrapper;
import com.ahmedelbossily.moviedb.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }
}
