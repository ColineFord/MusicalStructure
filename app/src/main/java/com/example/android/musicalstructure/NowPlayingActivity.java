package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // Find the View that shows the home category
        TextView home = findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Titles category
        TextView titles = findViewById(R.id.titles);

        // Set a click listener on that View
        titles.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Titles category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TitlesActivity}
                Intent titlesIntent = new Intent(NowPlayingActivity.this, TitlesActivity.class);

                // Start the new activity
                startActivity(titlesIntent);
            }
        });

        // Find the View that shows the GenreNames category
        TextView genres = (TextView) findViewById(R.id.genres);

        // Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the GenreNames category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(NowPlayingActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });


    }
}
