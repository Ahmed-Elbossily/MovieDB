package com.ahmedelbossily.moviedb;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class VideoWrapper {

    @Json(name = "results")
    private List<Video> videos;

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
