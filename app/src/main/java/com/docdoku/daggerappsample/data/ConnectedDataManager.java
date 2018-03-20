package com.docdoku.daggerappsample.data;

import com.docdoku.daggerappsample.model.Book;

import java.util.List;

/**
 * Created by romainz on 20/03/18.
 */

public class ConnectedDataManager implements IDataManager {
    @Override
    public List<Book> getBooks() {
        //TODO: implements a fake http call
        return null;
    }
}
