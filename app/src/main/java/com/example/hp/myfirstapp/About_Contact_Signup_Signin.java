package com.example.hp.myfirstapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About_Contact_Signup_Signin extends AppCompatActivity {
    // refernce variable of the widgets that are used in XML layout
    Button BtnAbout,BtnContact,BtnSignUp,BtnSignIn,BtnEvents,BtnTeams,BtnFAQ,BtnTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__contact__signup__signin);

        //initialization of widget by findviewbyid

        BtnAbout = (Button) findViewById(R.id.BtnAbout);
        BtnContact = (Button) findViewById(R.id.BtnContact);
        BtnSignUp = (Button) findViewById(R.id.BtnSignUp);
        BtnSignIn = (Button) findViewById(R.id.BtnSignIn);
        BtnEvents= (Button) findViewById(R.id.BtnEvents);
        BtnTeams = (Button) findViewById(R.id.BtnTeams);
        BtnFAQ = (Button) findViewById(R.id.BtnFAQ);
        BtnTerms = (Button) findViewById(R.id.BtnTerms);

        //Single fragment object with final keyword for all fragments transaction

        final FragmentManager FM=getSupportFragmentManager();

        //Fragment transcation to replace the fragment on framelayout

        FragmentTransaction FT=FM.beginTransaction();

        //first argument - id of the frame layout,
        FT.replace(R.id.FrmLyt,new FragAbout());
        FT.commit();

        //thi is to set button's onCLicklistener using setonclick listener
        //setonclicklistener is the class
        BtnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragAbout());
                FT.commit();


            }
        });
        BtnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragContact());
                FT.commit();

            }
        });

        BtnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragSignUp());
                FT.commit();

            }
        });

        BtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragSignIn());
                FT.commit();
            }
        });

        BtnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragEvents());
                FT.commit();
            }
        });
        BtnTeams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragTeams());
                FT.commit();
            }
        });
        BtnFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragFAQ());
                FT.commit();
            }
        });
        BtnTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction FT=FM.beginTransaction();
                FT.replace(R.id.FrmLyt,new FragTerms());
                FT.commit();
            }
        });
    }
}
