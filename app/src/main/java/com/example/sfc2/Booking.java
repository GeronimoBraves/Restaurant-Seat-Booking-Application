package com.example.sfc2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Booking extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        Button button4 = findViewById(R.id.button9);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Booking.this, Menu2.class);
                startActivity(intent);
            }
        });
        ImageButton button = findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Booking.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}


