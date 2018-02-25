package com.example.android.musicalstructure;

/**
 * {@link SongArtist} represents an association of a song title and the artist that sings said song.
 */

public class SongArtist {

    /** The title of the song */
    private String mSongTitle;

    /** The name of the artist */
    private String mArtistName;

    public SongArtist(String songTitle, String artistName){
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /** Get the song title. */
    public String getSongTitle(){
        return mSongTitle;
    }

    /** Get the artist's name. */
    public String getArtistName(){
        return mArtistName;
    }
}
