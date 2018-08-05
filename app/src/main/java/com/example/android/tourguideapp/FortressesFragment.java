package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FortressesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.content_list, container, false);

        //Create contents
        final ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content(R.drawable.stmichael, R.string.stmichael));
        contents.add(new Content(R.drawable.barone, R.string.barone));
        contents.add(new Content(R.drawable.stnicholas, R.string.stnicholas));
        contents.add(new Content(R.drawable.stjohn, R.string.stjohnfortress));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contents);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Fortresses");
    }
}
