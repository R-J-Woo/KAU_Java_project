package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class novelListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel_list);

        Button button1 = (Button) findViewById(R.id.ButtonNovel1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonNovel2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonNovel3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonNovel4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonNovel5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonNovel6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonNovel7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonNovel8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonNovel9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonNovel10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), novel10Activity.class);
                startActivity(intent);
            }
        });

    }
}