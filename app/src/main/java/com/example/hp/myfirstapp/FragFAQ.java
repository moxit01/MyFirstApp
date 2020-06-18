package com.example.hp.myfirstapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragFAQ extends Fragment {
    ListView Faq;





    public FragFAQ() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_faq, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Faq=(ListView)view.findViewById(R.id.Faq);
        ArrayList<String> faqs=new ArrayList<>();
        faqs.add("Question: Is Engineering at LJIET good?");
        faqs.add("Answer: no,not at all.You should try for dropout from LJIET, its quite good :) ");
        faqs.add("Question: Do Classrooms have A.C?");
        faqs.add("Answer: Yeah,classrooms have A.C. but will not be used");
        faqs.add("Question: Do LJIET promote bunking?");
        faqs.add("Answer: No, not at all, if any students bunk their class parents will be informed immediately");
        faqs.add("Question: Do LJIET have wifi?");
        faqs.add("Answer: What a joke.LOL");
        faqs.add("Question: Ane saheb gujarati medium valane inglish nah aavde toh en su upaay che?");
        faqs.add("Answer: saheb toh emne gharej besadi rakho.:)");
        faqs.add("Question: Do ljiet gives holidays on holidays declared by government ");
        faqs.add("Answer: No, LJIET will be working as per schedule");
        faqs.add("Question: Sir, its too much heavily raining in our area.is ljiet working?");
        faqs.add("Answer: Meet me personally next day in my cabin,with your parents.Asking irrelevant question in FAQ.");


        Faq.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,faqs));

    }
}


