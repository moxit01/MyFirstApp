package com.example.hp.myfirstapp;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 22-08-2018.
 */
public class TeamBaseAdapter_CLS extends BaseAdapter {

    Context c;
    ArrayList<String> arrStr;

    public TeamBaseAdapter_CLS(Context c,ArrayList arrStr) {
        this.c=c;
        this.arrStr=arrStr;

    }

    @Override
    public int getCount() {
        return arrStr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(c).inflate(R.layout.teambase,viewGroup,false);
        TextView tv=(TextView)view.findViewById(R.id.teamid);
        tv.setText(arrStr.get(i));
        return view;
    }
}
