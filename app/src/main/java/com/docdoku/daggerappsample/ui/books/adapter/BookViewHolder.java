package com.docdoku.daggerappsample.ui.books.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.docdoku.daggerappsample.R;
import com.docdoku.daggerappsample.ui.books.IBooksPresenter;

public class BookViewHolder extends RecyclerView.ViewHolder implements IBookViewHolder {
    private View mView;
    private IBooksPresenter mPresenter;

    public BookViewHolder(View itemView, IBooksPresenter presenter) {
        super(itemView);
        this.mView = itemView;
        this.mPresenter = presenter;
    }

    public void setAuthor(String author) {
        TextView textView = mView.findViewById(R.id.tv_author);
        textView.setText(author);
    }

    public void setTitle(String title) {
        TextView textView = mView.findViewById(R.id.tv_title);
        textView.setText(title);
    }

    @Override
    public void setListener() {
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onItemClicked(getAdapterPosition());
            }
        });
    }
}
