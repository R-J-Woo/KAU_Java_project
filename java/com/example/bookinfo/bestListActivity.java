package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class bestListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_list);

        Button button1 = (Button) findViewById(R.id.ButtonNovel1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonBest2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonBest3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonBest4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonBest5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonBest6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonBest7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonBest8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonBest9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonBest10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), best10Activity.class);
                startActivity(intent);
            }
        });

    }
}