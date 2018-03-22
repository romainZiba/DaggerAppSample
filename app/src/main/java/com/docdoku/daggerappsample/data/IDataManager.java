package com.docdoku.daggerappsample.data;


import com.docdoku.daggerappsample.model.Book;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by romainz on 20/03/18.
 */

public interface IDataManager {
    Observable<List<Book>> getBooks();

}
