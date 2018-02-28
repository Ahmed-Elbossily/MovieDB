package com.ahmedelbossily.moviedb.util;

import io.reactivex.disposables.Disposable;

/**
 * Created by AhmedElbossily on 28/02/2018.
 */

public class RxUtils {

    public static void unsubscribe(Disposable subscription) {
        if (subscription != null && !subscription.isDisposed()) {
            subscription.dispose();
        }
    }

    public static void unsubscribe(Disposable... subscriptions) {
        for (Disposable subscription : subscriptions) {
            unsubscribe(subscription);
        }
    }
}
