package com.example.tinh.listview;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView myListView;
    private List<String> ds;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.myListView);
        ds = new ArrayList<>();
        ds.add("dsf");
        ds.add("dsf");
        ds.add("dsf");
        ds.add("dsf");
        ds.add("dsf");
        ds.add("dsf");
        ds.add("dsf");
        adapter = new CustomAdapter(this,R.layout.item_list,ds);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       
                view.setSelected(true);

            }
        });

    }
}
