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
 * Created by Coline on 24/02/2018.
 */

public class GenreNamesAdapter extends ArrayAdapter<GenreNames> {

    /**
     * Create a new {@link GenreNamesAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param genreNames is the list of {@link GenreNames}s to be displayed.
     */
    public GenreNamesAdapter(Context context, ArrayList<GenreNames> genreNames) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, genreNames);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }


        // Get the {@link GenreNames} object located at this position in the list
        GenreNames currentGenreName = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView genreTextView = listItemView.findViewById(R.id.genre_text_view);
        // Get the song title from the current GenreNames object and
        // set this text on the genre TextView
        genreTextView.setText(currentGenreName.getGenreName());

        // Return the whole list item layout (containing 1 TextView )
        // so that it can be shown in the GridView
        return listItemView;
    }
}
