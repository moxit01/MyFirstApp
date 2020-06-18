package com.example.hp.myfirstapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragTeams extends Fragment {


    public FragTeams() {
        // Required empty public constructor
    }
    ListView lstview;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_teams, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lstview=(ListView)view.findViewById(R.id.lstview);
        ArrayList<String> teams=new ArrayList<>();
        teams.add("Moxit Shah");
        teams.add("Dharmik Rami");
        teams.add("Jay Rudani");
        teams.add("Meet vora");
        teams.add("Pritam Prajapati");
        teams.add("Saumil Ajmera");
        lstview.setAdapter(new TeamBaseAdapter_CLS(getActivity(),teams));

    }
}
