package com.ahmedelbossily.moviedb.details;

import com.ahmedelbossily.moviedb.Review;
import com.ahmedelbossily.moviedb.Video;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface MovieDetailsInteractor {

    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
