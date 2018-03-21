package com.docdoku.daggerappsample.ui.books;

import com.docdoku.daggerappsample.data.FakeDataManager;
import com.docdoku.daggerappsample.data.IDataManager;
import com.docdoku.daggerappsample.model.Book;
import com.docdoku.daggerappsample.ui.books.adapter.IBookViewHolder;

import java.util.ArrayList;
import java.util.List;

public class BooksPresenter implements IBooksPresenter {

    private List<Book> mBooks = new ArrayList<>();

    //TODO: use dependency injection to acquire an instance of IDataManager and ISchedulerProvider
    private IDataManager mDataManager;
    private IBooksView mView;


    public BooksPresenter() {
        mDataManager = new FakeDataManager();
    }

    public BooksPresenter(IDataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void loadBooks() {
        mBooks = mDataManager.getBooks();
        if (mView != null) {
            mView.notifyDataChanged();
        }
    }

    @Override
    public int getBooksCount() {
        return mBooks.size();
    }

    @Override
    public void onBindBooksView(int position, IBookViewHolder holder) {
        Book book = mBooks.get(position);
        holder.setAuthor(book.getAuthor());
        holder.setTitle(book.getTitle());
        holder.setListener();
    }

    @Override
    public void bind(IBooksView view) {
        mView = view;
    }

    @Override
    public void onUnbind() {
        mView = null;
    }


    @Override
    public void onItemClicked(int adapterPosition) {
        mView.showBookDetails(mBooks.get(adapterPosition));
    }
}
