package com.example.recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter adapter;
    private List<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        placeList = new ArrayList<>();
        placeList.add(new Place("Эйфелева башня", "Одно из самых известных мест Парижа.", "Париж, Франция", 4.8f, R.drawable.eiffel_tower));
        placeList.add(new Place("Великая Китайская стена", "Исторический памятник, протянувшийся на тысячи километров.", "Китай", 4.7f, R.drawable.great_wall));
        placeList.add(new Place("Статуя Свободы", "Символ свободы и демократии.", "Нью-Йорк, США", 4.6f, R.drawable.statue_of_liberty));

        adapter = new PlaceAdapter(this, placeList);
        recyclerView.setAdapter(adapter);
    }
}
