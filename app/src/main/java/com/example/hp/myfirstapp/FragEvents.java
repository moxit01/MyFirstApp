package com.example.hp.myfirstapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragEvents extends Fragment {

    ViewPager vp;

    public FragEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_events, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vp = (ViewPager) view.findViewById(R.id.eventpager);
        ArrayList<String> texts = new ArrayList<>();
        texts.add("Lumina");
        texts.add("Lamhe");
        texts.add("Navaratri");
        texts.add("LJ Innovation");
        ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.lumina);
        images.add(R.drawable.lamhe);
        images.add(R.drawable.ljnav);
        images.add(R.drawable.ljinnovation);
        vp.setAdapter(new ViewPageAdapter(getChildFragmentManager(),getActivity(),texts,images));
    }
}
