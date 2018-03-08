package com.example.android.chandigarh_letstakeaview;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.android.chandigarh_letstakeaview.list_view;
import com.example.android.chandigarh_letstakeaview.list_item;

import java.util.ArrayList;

public class rose_garden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose_garden);


        ArrayList<list_item> words = new ArrayList<list_item>();

        words.add(new list_item(R.string.rose_event1,R.string.rose_description1));
        words.add(new list_item(R.string.high_event2,R.string.rose_description2));
        words.add(new list_item(R.string.rose_event3,R.string.rose_description3));
        words.add(new list_item(R.string.rose_event4,R.string.rose_description4));
        words.add(new list_item(R.string.rose_event5,R.string.rose_description5));



        list_view adapter = new list_view(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
    }
