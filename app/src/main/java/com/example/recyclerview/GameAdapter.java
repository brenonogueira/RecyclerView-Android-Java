package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {

    private Context context;
    private ArrayList<Game> itens;

    public GameAdapter(Context context, ArrayList<Game> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.game_line, parent, false);
        GameViewHolder viewHolder = new GameViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game game = itens.get(position);
        holder.name.setText(game.getName());
        holder.platform.setText(game.getPlatform());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
