package com.example.android.musicalstructure;

/**
 * {@link GenreNames} represents the genre name of the music in the app.
 */

public class GenreNames {
    /**
     * The genre name.
     */
    private String genreNames;

    public GenreNames(String genreName) {
        genreNames = genreName;
    }

    /**
     * Get the genre name.
     */
    public String getGenreName() {
        return genreNames;
    }
}
