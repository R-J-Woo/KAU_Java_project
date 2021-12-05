package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class steadyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steady_list);

        Button button1 = (Button) findViewById(R.id.ButtonStd1);
        button1.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonStd2);
        button2.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonStd3);
        button3.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonStd4);
        button4.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonStd5);
        button5.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonStd6);
        button6.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonStd7);
        button7.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonStd8);
        button8.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonStd9);
        button9.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonStd10);
        button10.setOnClickListener(new View.OnClickListener() { // 스테디셀러 4위
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), std10Activity.class);
                startActivity(intent);
            }
        });
    }
}