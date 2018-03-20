package com.docdoku.daggerappsample.ui.books;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.docdoku.daggerappsample.R;
import com.docdoku.daggerappsample.ui.books.adapter.BooksAdapter;

public class BooksActivity extends AppCompatActivity implements IBooksView {

    //TODO: use dependency injection to acquire an instance of IBooksPresenter
    private IBooksPresenter mPresenter = new BooksPresenter();

    private BooksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv_list_images);
        adapter = new BooksAdapter(mPresenter);
        recyclerView.setAdapter(adapter);

        mPresenter.bind(this);
        mPresenter.loadBooks();
    }

    @Override
    public void notifyDataChanged() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onUnbind();
    }
}
