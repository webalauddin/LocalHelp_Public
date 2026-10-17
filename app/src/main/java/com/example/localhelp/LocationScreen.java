package com.example.localhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LocationScreen extends AppCompatActivity {

    ImageButton btnBack;
    ImageView location_icon;
    Button btnConfirmLocation;
    LinearLayout btnCurrentLocation;
    RelativeLayout locationBackground;
    TextView tvSelectedAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_screen);


        btnBack = findViewById(R.id.btnBack);
        btnConfirmLocation = findViewById(R.id.btnConfirmLocation);
        btnCurrentLocation = findViewById(R.id.btnCurrentLocation);
        tvSelectedAddress = findViewById(R.id.tvSelectedAddress);
        locationBackground = findViewById(R.id.locationBackground);
        location_icon = findViewById(R.id.location_icon);



        btnBack.setOnClickListener(v -> {

            startActivity(new Intent(LocationScreen.this, OnBoarding.class));

        });

        btnCurrentLocation.setOnClickListener(v -> {


            tvSelectedAddress.setText("Current Location: GXHJ+G85, Nowapara, khanzia Bazar Rd, Debhata 9430");
            Toast.makeText(LocationScreen.this, "Location fetched successfully!", Toast.LENGTH_SHORT).show();

            locationBackground.setBackgroundResource(R.drawable.location_image);
            location_icon.setVisibility(View.GONE);

        });

        btnConfirmLocation.setOnClickListener(v -> {

            startActivity(new Intent(LocationScreen.this, MainActivity.class));

            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

            finish();

        });





    }
}