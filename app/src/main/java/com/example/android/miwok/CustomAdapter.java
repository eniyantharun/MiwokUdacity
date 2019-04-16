package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<ModelClass> {
    private int mColorResourceId;


    public CustomAdapter(@NonNull Context context, int resource, ArrayList<ModelClass> words, int ColorResourceId) {
        super(context, resource, words);
        mColorResourceId = ColorResourceId;
    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ModelClass PositionWord = getItem(position);

        TextView miwokText = listItemView.findViewById(R.id.miwokText);
        if (PositionWord != null) {
            miwokText.setText(PositionWord.getmMiwokTranslation());
        }

        TextView defaultText = listItemView.findViewById(R.id.defaultText);
        if (PositionWord != null) {
            defaultText.setText(PositionWord.getDefaultTranslation());
        }

        ImageView imageView = listItemView.findViewById(R.id.imageViewPlaceholder);
        if(PositionWord.hasImage()) {
            imageView.setImageResource(PositionWord.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
