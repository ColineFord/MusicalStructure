package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Coline on 23/02/2018.
 */

public class SongArtistAdapter extends ArrayAdapter<SongArtist> {

    /**
     * Create a new {@link SongArtistAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param songArtists is the list of {@link SongArtist}s to be displayed.
     */
    public SongArtistAdapter(Context context, ArrayList<SongArtist> songArtists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songArtists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link SongArtist} object located at this position in the list
        SongArtist currentSongArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the song title from the current SongArtist object and
        // set this text on the song TextView
        songTextView.setText(currentSongArtist.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the artist's name from the current SongArtist object and
        // set this text on the artist TextView
        artistTextView.setText(currentSongArtist.getArtistName());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
