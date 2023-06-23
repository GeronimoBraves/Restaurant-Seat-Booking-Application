package com.example.sfc2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class About2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us_2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Button button1 = findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About2.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.button7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About2.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.button8);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About2.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button4 = findViewById(R.id.button9);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About2.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About2.this, About3.class);
                startActivity(intent);
            }
        });


    }
}


