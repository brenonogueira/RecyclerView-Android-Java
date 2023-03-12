package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private GameAdapter adapter;
    private ArrayList<Game> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recycler);
        itens = new ArrayList<Game>();
        itens.add(new Game("Counter Strike: Global Offensive", "PC"));
        itens.add(new Game("The Last Of Us", "PlayStation"));
        itens.add(new Game("Gears of War", "Xbox"));
        adapter = new GameAdapter(MainActivity.this, itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL,
                false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}