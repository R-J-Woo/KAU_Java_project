package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class genreListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_list);

        Button button1 = (Button) findViewById(R.id.ButtonGenre1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonGenre2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonGenre3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonGenre4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonGenre5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonGenre6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonGenre7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonGenre8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonGenre9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonGenre10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), genre10Activity.class);
                startActivity(intent);
            }
        });

    }
}