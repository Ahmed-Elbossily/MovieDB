package com.ahmedelbossily.moviedb.listing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ListingScope {
}
