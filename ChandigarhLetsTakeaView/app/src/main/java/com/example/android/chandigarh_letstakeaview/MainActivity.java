package com.example.android.chandigarh_letstakeaview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //onclick event listener for numbers
        ImageView rockg=(ImageView) findViewById(R.id.rock);

        rockg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,rock_garden.class);
                startActivity(numbersIntent);
            }
        });
        //on click event listner for colors
        ImageView sukhnal=(ImageView) findViewById(R.id.sukna);
        sukhnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,sukhna_lake.class);
                startActivity(colorsIntent);
            }
        });
        //onclick event listner for family
        ImageView roseg=(ImageView) findViewById(R.id.rose);
        roseg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,rose_garden.class);
                startActivity(familyIntent);
            }
        });

        ImageView high=(ImageView) findViewById(R.id.high_court);
        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this,high_court.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
