package com.ahmedelbossily.moviedb.network;

import com.ahmedelbossily.moviedb.MoviesWrapper;
import com.ahmedelbossily.moviedb.ReviewsWrapper;
import com.ahmedelbossily.moviedb.VideoWrapper;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public interface TmdbWebService {

    @GET("3/discover/movie?language=en&sort_by=popularity.desc")
    Observable<MoviesWrapper> popularMovies();

    @GET("3/discover/movie?vote_count.gte=500&language=en&sort_by=vote_average.desc")
    Observable<MoviesWrapper> highestRatedMovies();

    @GET("3/movie/{movieId}/videos")
    Observable<VideoWrapper> trailers(@Path("movieId") String movieId);

    @GET("3/movie/{movieId}/reviews")
    Observable<ReviewsWrapper> reviews(@Path("movieId") String movieId);
}
