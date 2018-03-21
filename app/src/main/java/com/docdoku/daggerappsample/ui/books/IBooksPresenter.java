package com.docdoku.daggerappsample.ui.books;

import com.docdoku.daggerappsample.ui.books.adapter.IBookViewHolder;

public interface IBooksPresenter {
    void loadBooks();
    int getBooksCount();
    void onBindBooksView(int position, IBookViewHolder holder);
    void bind(IBooksView view);
    void onUnbind();
    void onItemClicked(int adapterPosition);
}
