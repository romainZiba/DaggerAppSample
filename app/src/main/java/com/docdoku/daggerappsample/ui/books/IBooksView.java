package com.docdoku.daggerappsample.ui.books;

import com.docdoku.daggerappsample.model.Book;

public interface IBooksView {
    void notifyDataChanged();

    void showBookDetails(Book book);
}
