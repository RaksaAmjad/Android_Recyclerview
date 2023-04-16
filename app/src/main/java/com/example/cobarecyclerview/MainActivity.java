package com.example.cobarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("France","Europe",R.drawable.a));
        items.add(new Item("Portugal","Europe",R.drawable.b));
        items.add(new Item("Egypt","Africa",R.drawable.c));
        items.add(new Item("Senegal","Africa",R.drawable.d));
        items.add(new Item("Japan","Asia",R.drawable.e));
        items.add(new Item("South Korea","Asia",R.drawable.f));
        items.add(new Item("Brazil","South America",R.drawable.g));
        items.add(new Item("Argentina","South America",R.drawable.h));
        items.add(new Item("Spain","Europe",R.drawable.i));
        items.add(new Item("Germany","Europe",R.drawable.j));
        items.add(new Item("Iran","Asia",R.drawable.k));
        items.add(new Item("Saudi Arabia","Asia",R.drawable.l));
        items.add(new Item("Colombia","South America",R.drawable.m));
        items.add(new Item("Chile","South America",R.drawable.n));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }

}