package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class poetryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poetry_list);

        Button button1 = (Button) findViewById(R.id.ButtonPoetry1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonPoetry2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonPoetry3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonPoetry4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonPoetry5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonPoetry6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonPoetry7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonPoetry8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonPoetry9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonPoetry10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), poetry10Activity.class);
                startActivity(intent);
            }
        });

    }
}