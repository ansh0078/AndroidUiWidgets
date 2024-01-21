package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarDemo extends AppCompatActivity {

    RatingBar rb_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);

        rb_progress = (RatingBar) findViewById(R.id.rb_progress);
    }
    public void getRatings(View view) {
        float f = rb_progress.getRating();
        Toast.makeText(this, "Rating is : "+f, Toast.LENGTH_SHORT).show();
    }
}