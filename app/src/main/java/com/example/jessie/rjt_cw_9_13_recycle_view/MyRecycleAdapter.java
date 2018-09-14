package com.example.jessie.rjt_cw_9_13_recycle_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>{

    List<Movie> movieList;

    public MyRecycleAdapter(List<Movie> list)

    {
        this.movieList = list;

    }

    @NonNull@Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movie = movieList.get(position);
        holder.tvMovie.setText(movie.getsTitle());
        holder.tvGenre.setText(movie.getsGenre());
        holder.tvYear.setText(movie.getsYear());
    }


    @Override
    public int getItemCount()
    {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMovie;
        TextView tvGenre;
        TextView tvYear;



        public MyViewHolder(View itemView) {
            super(itemView);

            tvMovie = itemView.findViewById(R.id.tvMovie);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            tvYear = itemView.findViewById(R.id.tvYear);
        }
    }
}
