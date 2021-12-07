package com.example.bookinfo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class fieldListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_list);

        Button button = (Button) findViewById(R.id.ButtonNovel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novelListActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonPoetry);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetryListActivity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonEssay);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essayListActivity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonGenre);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genreListActivity.class);
                startActivity(intent);
            }
        });
    }
}