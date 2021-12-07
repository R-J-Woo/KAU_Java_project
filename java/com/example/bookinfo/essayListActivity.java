package com.example.bookinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class essayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_list);

        Button button1 = (Button) findViewById(R.id.ButtonEssay1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay1Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.ButtonEssay2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay2Activity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.ButtonEssay3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay3Activity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.ButtonEssay4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay4Activity.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.ButtonEssay5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay5Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.ButtonEssay6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay6Activity.class);
                startActivity(intent);
            }
        });

        Button button7 = (Button) findViewById(R.id.ButtonEssay7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay7Activity.class);
                startActivity(intent);
            }
        });

        Button button8 = (Button) findViewById(R.id.ButtonEssay8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay8Activity.class);
                startActivity(intent);
            }
        });

        Button button9 = (Button) findViewById(R.id.ButtonEssay9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay9Activity.class);
                startActivity(intent);
            }
        });

        Button button10 = (Button) findViewById(R.id.ButtonEssay10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), essay10Activity.class);
                startActivity(intent);
            }
        });

    }
}