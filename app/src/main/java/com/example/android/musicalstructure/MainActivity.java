package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Now Playing category
        TextView nowPlaying = findViewById(R.id.nowplaying_bar);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

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
                Intent titlesIntent = new Intent(MainActivity.this, TitlesActivity.class);

                // Start the new activity
                startActivity(titlesIntent);
            }
        });

        // Find the View that shows the GenreNames category
        TextView genres = findViewById(R.id.genres);

        // Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the GenreNames category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenresActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });

        // Find the View at the bottom of the screen that shows the Now Playing category
        TextView nowPlayingButton = (TextView) findViewById(R.id.now_playing_button);

        // Set a click listener on that View
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
