package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.content_list, container, false);

        //Create contents
        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.drawable.drazen, R.string.drazen));
        contents.add(new Content(R.drawable.jd, R.string.juraj));
        contents.add(new Content(R.drawable.wells, R.string.fourwells));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Landmarks");
    }
}
