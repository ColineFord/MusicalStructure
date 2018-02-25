package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class GenresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genres);

        //Create an array of words
        final ArrayList<GenreNames> genreNames = new ArrayList<GenreNames>();
        genreNames.add(new GenreNames("Pop"));
        genreNames.add(new GenreNames("Rock"));
        genreNames.add(new GenreNames("Hip Hop"));
        genreNames.add(new GenreNames("Electro"));

        final GenreNamesAdapter adapter = new GenreNamesAdapter(this, genreNames);

        final GridView gridView = findViewById(R.id.grid_genres);

        gridView.setAdapter(adapter);

        // Find the View at the bottom of the screen that shows the Now Playing button
        TextView nowPlayingButton = findViewById(R.id.now_playing_button);

        // Set a click listener on that View
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(GenresActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the home category
        TextView home = findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(GenresActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Now Playing category
        TextView nowPlaying =  findViewById(R.id.nowplaying_bar);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(GenresActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
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
                Intent titlesIntent = new Intent(GenresActivity.this, TitlesActivity.class);

                // Start the new activity
                startActivity(titlesIntent);
            }
        });
    }
}
