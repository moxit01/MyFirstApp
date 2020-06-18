package com.example.hp.myfirstapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.hp.myfirstapp.R.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragContact extends Fragment{
Button BtnJson;


    public FragContact() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(layout.fragment_frag_contact, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BtnJson=(Button)view.findViewById(id.BtnJson);


    }
}
