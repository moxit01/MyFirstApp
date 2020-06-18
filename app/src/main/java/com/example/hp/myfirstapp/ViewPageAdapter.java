package com.example.hp.myfirstapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by HP on 22-08-2018.
 */
public class ViewPageAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> texts;
    ArrayList<Integer> images;
    Context c;
    public ViewPageAdapter(FragmentManager fm,Context c,ArrayList<String> texts, ArrayList<Integer> images) {
        super(fm);
        this.texts=texts;
        this.images=images;
        this.c=c;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        MyViewPagerFrag myFragment=new MyViewPagerFrag();
        Bundle b= new Bundle();
        b.putString("Event_Name",texts.get(position));
        b.putInt("Event_Image",images.get(position));
        myFragment.setArguments(b);
        return myFragment;
    }

    @Override
    public int getCount() {
        return texts.size();
    }


}
