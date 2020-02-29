package com.example.cobarecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;
    private ArrayList<HeroesModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activitymain_rv);
        rvHero.setHasFixedSize(true);
        list.addAll(HeroesData.getHeroList());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHero.setLayoutManager(new LinearLayoutManager(this));
        HeroesAdapter heroesAdapter = new HeroesAdapter(this);
        heroesAdapter.setListHero(list);
        rvHero.setAdapter(heroesAdapter);
    }








}
