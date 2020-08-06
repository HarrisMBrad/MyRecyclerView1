package com.gmail.myrecyclerview1.bmichaelh13;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        //ListItem item1 = new ListItem("One Star", "Movie 1", "A one hour satire that lands flat");
        //ListItem item2 = new ListItem("Five Star", "Movie 2", "A two hour tour de force");

        for (int i = 0; i < 10; i++) {
            ListItem item = new ListItem("Rating",
                    "Item" + (i + 1), "Excellent!"

            );

            listItems.add(item);
            //listItems.add(item2);


        }
        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);

    }


}













