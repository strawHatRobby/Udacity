package com.rob.udacityfree;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by MAC on 08/12/16.
 */

public class WordAdapter<W> extends ArrayAdapter<Word> {


    public WordAdapter(Context context, List<Word> objects) {
        // passed in 0 for resource id because we are inflating it ourselves as this view won't
        // be used for anyt other type of listView

        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // find the current Position from where to build the listVIew
        Word currentWord = getItem(position);

        //Check if there is an exisiting View for the current data
        View listItemView = convertView;
        // View will be null if there is no view we can resus in which case inflate a new one
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_text_view_1, parent, false);
        }



        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text);

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text);

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.word_image);


        miwokTextView.setText(currentWord.getMiwokWord());
        defaultTextView.setText(currentWord.getDefaultWord());
        imageView.setImageResource(currentWord.getImageSource());


        return listItemView;
    }
}
