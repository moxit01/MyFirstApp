package com.example.hp.myfirstapp;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyViewPagerFrag extends Fragment {
    ImageView PagerImage;
    TextView PagerText;


    public MyViewPagerFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PagerImage=(ImageView) view.findViewById(R.id.eventimage);
        PagerText=(TextView) view.findViewById(R.id.eventtext);
        PagerImage.setImageDrawable(getResources().getDrawable(getArguments().getInt("Event_Image")));
        PagerText.setText(getArguments().getString("Event_Name"));

    }
}
