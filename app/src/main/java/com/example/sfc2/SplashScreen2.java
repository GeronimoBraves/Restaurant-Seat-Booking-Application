package com.example.sfc2;

    import android.content.Intent;
    import android.os.Bundle;
    import android.os.Handler;
    import androidx.appcompat.app.AppCompatActivity;

    public class SplashScreen2 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(com.example.sfc2.SplashScreen2.this, Menu2.class));
                    finish();
                }
            }, 5000);

        }

    }


