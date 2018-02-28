package com.ahmedelbossily.moviedb.details;

import dagger.Subcomponent;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@DetailsScope
@Subcomponent(modules = {DetailsModule.class})
public interface DetailsComponent {

    void inject(MovieDetailsFragment target);
}
