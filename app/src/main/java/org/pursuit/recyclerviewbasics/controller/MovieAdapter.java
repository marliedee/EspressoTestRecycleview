package org.pursuit.recyclerviewbasics.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.pursuit.recyclerviewbasics.model.Movie;
import org.pursuit.recyclerviewbasics.view.MovieViewHolder;
import org.pursuit.recyclerviewbasics.R;


import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter <MovieViewHolder> {

    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList){
        this.movieList = movieList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item_view, parent, false);
        return new MovieViewHolder(childView);    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.onBind(movie);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
