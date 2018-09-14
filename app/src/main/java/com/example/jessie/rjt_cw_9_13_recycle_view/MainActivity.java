package com.example.jessie.rjt_cw_9_13_recycle_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyRecycleAdapter adapter;
    ArrayList<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        adapter = new MyRecycleAdapter(movies);

        recyclerView.LayoutManager manager = new LinearLayouttManger(MainActivity.this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        setMovieData();
    }

    private void setMovieData() {
        Movie movieItem = new Movie("Movie", "drama", "1984");
        movies.add(movieItem);

        adapter.notifyDataSetChanges();

    }


}
