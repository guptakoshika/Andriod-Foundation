package com.example.android.chandigarh_letstakeaview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.android.chandigarh_letstakeaview.list_item;
import com.example.android.chandigarh_letstakeaview.list_view;
import java.util.ArrayList;
public class sukhna_lake extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukhna_lake);


        ArrayList<list_item> words = new ArrayList<list_item>();

        words.add(new list_item(R.string.sukhna_event1, R.string.sukhna_description1));
        words.add(new list_item(R.string.sukhna_event2, R.string.sukhna_description2));
        words.add(new list_item(R.string.sukhna_event3, R.string.sukhna_description3));


        list_view adapter = new list_view(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
