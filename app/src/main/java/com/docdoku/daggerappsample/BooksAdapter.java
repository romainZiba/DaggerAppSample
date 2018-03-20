package com.docdoku.daggerappsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.docdoku.daggerappsample.model.Book;

import java.util.List;

/**
 * Created by romainz on 20/03/18.
 */
public class BooksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Book> mBooks;

    public BooksAdapter(List<Book> books) {
        mBooks = books;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_book, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Book book = mBooks.get(position);
        ((BookViewHolder) holder).setAuthor(book.getAuthor());
        ((BookViewHolder) holder).setTitle(book.getTitle());

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

}
