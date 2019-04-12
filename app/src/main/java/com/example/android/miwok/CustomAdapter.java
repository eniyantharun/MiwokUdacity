package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<ModelClass> {

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<ModelClass> words) {
        super(context, resource,words);
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

        return listItemView;
    }
}
