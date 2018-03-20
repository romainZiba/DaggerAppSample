package com.docdoku.daggerappsample.data;

import com.docdoku.daggerappsample.model.Book;

import java.util.List;

/**
 * Created by romainz on 20/03/18.
 */

public interface IDataManager {
    List<Book> getBooks();

}
