package com.docdoku.daggerappsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by romainz on 20/03/18.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
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
