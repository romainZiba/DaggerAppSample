package com.docdoku.daggerappsample.rx;

import io.reactivex.Scheduler;

/**
 * Created by romainz on 22/03/18.
 */

public interface AppSchedulers {
    Scheduler ui();
    Scheduler io();
    Scheduler newThread();
}