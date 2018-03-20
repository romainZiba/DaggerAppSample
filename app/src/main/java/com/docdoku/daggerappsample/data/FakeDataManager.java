package com.docdoku.daggerappsample.data;

import com.docdoku.daggerappsample.model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by romainz on 20/03/18.
 */

public class FakeDataManager implements IDataManager {

    private List<Book> mBooks = new ArrayList<>();

    public FakeDataManager() {
        mBooks.add(new Book(0, "Jean Laffitte", "Le grand denier", "Un super bouquin", "Policier", new Date()));
        mBooks.add(new Book(1, "Serge Lebrochant", "Le dernier cheval", "Un super bouquin", "Romain", new Date()));
        mBooks.add(new Book(2, "Monique Ranou", "Lardon d'exception", "Une claque", "Policier", new Date()));
    }

    @Override
    public List<Book> getBooks() {
        return mBooks;
    }
}
