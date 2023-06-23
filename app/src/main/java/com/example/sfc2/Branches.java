package com.example.sfc2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Branches extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch_select);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Button button1 = findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Branches.this, Menu2.class);
                startActivity(intent);
            }
        });
        Button button2 = findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Branches.this, About2.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Branches.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}


