package com.docdoku.daggerappsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.docdoku.daggerappsample.model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycyclerView = findViewById(R.id.rv_list_images);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Jean Laffitte", "Le grand denier", "Un super bouquin", "Policier", new Date()));
        books.add(new Book("Serge Lebrochant", "Le dernier cheval", "Un super bouquin", "Romain", new Date()));
        books.add(new Book("Monique Ranou", "Lardon d'exception", "Une claque", "Policier", new Date()));

        BooksAdapter adapter = new BooksAdapter(this, books);
        recycyclerView.setAdapter(adapter);
    }
}
