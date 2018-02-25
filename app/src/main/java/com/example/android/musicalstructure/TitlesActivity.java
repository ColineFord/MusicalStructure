package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TitlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titles);

        //Create an array of words
        final ArrayList<SongArtist> songArtists = new ArrayList<SongArtist>();
        songArtists.add(new SongArtist("IDGAF", "Dua Lipa"));
        songArtists.add(new SongArtist("Hoping", "X Ambassadors"));
        songArtists.add(new SongArtist("Mine", "Bazzi"));
        songArtists.add(new SongArtist("Somebody Special", "Nina Nesbitt"));
        songArtists.add(new SongArtist("Unwritten", "Natasha Bedingfield"));
        songArtists.add(new SongArtist("Supernova", "Ansel Elgort"));
        songArtists.add(new SongArtist("All Night", "Big Boi"));
        songArtists.add(new SongArtist("superlit", "gnash"));
        songArtists.add(new SongArtist("Real Friends", "Camila Cabello"));

        final SongArtistAdapter adapter = new SongArtistAdapter(this, songArtists);

        final ListView listView = findViewById(R.id.list_titles);

        listView.setAdapter(adapter);

        // Find the View at the bottom of the screen that shows the Now Playing button
        TextView nowPlayingButton = findViewById(R.id.now_playing_button);

        // Set a click listener on that View
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NowPlayingNames category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(TitlesActivity.this, NowPlayingActivity.class);

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
                Intent homeIntent = new Intent(TitlesActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Now Playing category
        TextView nowPlaying = findViewById(R.id.nowplaying_bar);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(TitlesActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
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
                Intent genresIntent = new Intent(TitlesActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });
    }

}
