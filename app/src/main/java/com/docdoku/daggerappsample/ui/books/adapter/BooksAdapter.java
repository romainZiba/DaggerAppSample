package com.docdoku.daggerappsample.ui.books.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.docdoku.daggerappsample.R;
import com.docdoku.daggerappsample.ui.books.IBooksPresenter;

public class BooksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private IBooksPresenter mPresenter;

    public BooksAdapter(IBooksPresenter presenter) {
        mPresenter = presenter;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_book, parent, false);
        return new BookViewHolder(view, mPresenter);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        mPresenter.onBindBooksView(position, (IBookViewHolder) holder);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mPresenter.getBooksCount();
    }

}
