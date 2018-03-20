package com.docdoku.daggerappsample.ui.books.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.docdoku.daggerappsample.R;

public class BookViewHolder extends RecyclerView.ViewHolder implements IBookViewHolder {
    private View mView;

    public BookViewHolder(View itemView) {
        super(itemView);
        this.mView = itemView;
    }

    public void setAuthor(String author) {
        TextView textView = mView.findViewById(R.id.tv_author);
        textView.setText(author);
    }

    public void setTitle(String title) {
        TextView textView = mView.findViewById(R.id.tv_title);
        textView.setText(title);
    }
}
