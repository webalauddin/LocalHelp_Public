package com.example.localhelp;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {


                for(progress=20; progress<=100; progress=progress+20 ){

                    try {
                        sleep(500);
                        progressBar.setProgress(progress);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

                startActivity(new Intent(SplashScreen.this, OnBoarding.class));
                finish();


            }
        });

        thread.start();








    }
}