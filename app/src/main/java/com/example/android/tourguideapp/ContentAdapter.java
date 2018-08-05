package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(Context context, ArrayList<Content> content) {
        super(context, 0, content);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Content currentContent = getItem(position);

        ImageView contentImageView = listItem.findViewById(R.id.content_image_view);
        contentImageView.setImageResource(currentContent.getmImageResourceId());

        TextView contentDescription = listItem.findViewById(R.id.content_text_view);
        contentDescription.setText(currentContent.getmDescription());

        return listItem;
    }
}
