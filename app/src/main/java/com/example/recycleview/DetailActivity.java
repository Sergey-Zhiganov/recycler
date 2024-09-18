package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImageView);
        TextView titleView = findViewById(R.id.detailTitleView);
        TextView descriptionView = findViewById(R.id.detailDescriptionView);
        TextView locationView = findViewById(R.id.detailLocationView);
        RatingBar ratingBar = findViewById(R.id.detailRatingBar);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String location = intent.getStringExtra("location");
        float rating = intent.getFloatExtra("rating", 0);
        int imageResource = intent.getIntExtra("imageResource", 0);

        titleView.setText(title);
        descriptionView.setText(description);
        locationView.setText("Место: " + location);
        ratingBar.setRating(rating);
        imageView.setImageResource(imageResource);
    }
}
