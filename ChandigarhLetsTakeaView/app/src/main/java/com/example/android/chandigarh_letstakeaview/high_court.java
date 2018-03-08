package com.example.android.chandigarh_letstakeaview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class high_court extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_high_court);

        ArrayList<com.example.android.chandigarh_letstakeaview.list_item> words = new ArrayList<com.example.android.chandigarh_letstakeaview.list_item>();

        words.add(new com.example.android.chandigarh_letstakeaview.list_item(R.string.high_event1,R.string.high_description1));
        words.add(new com.example.android.chandigarh_letstakeaview.list_item(R.string.high_event2,R.string.high_description2));
        words.add(new com.example.android.chandigarh_letstakeaview.list_item(R.string.high_event3,R.string.high_description3));
        words.add(new com.example.android.chandigarh_letstakeaview.list_item(R.string.high_event4,R.string.high_description14));

        com.example.android.chandigarh_letstakeaview.list_view adapter = new com.example.android.chandigarh_letstakeaview.list_view(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
