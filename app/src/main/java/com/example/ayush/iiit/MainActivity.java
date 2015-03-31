package com.example.ayush.iiit;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
            Button button;

Button mbtn;
@Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                addListenerOnButton();
            }
 public void addListenerOnButton() {
                mbtn = (Button) findViewById(
                        R.id.button4);
                mbtn.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((Button) v).getText();

                        Uri uri = Uri.parse("https://www.google.co.in/maps/place/IIIT+Bhubaneswar,+Gothapatna,+PO+Malipada,+Bhubaneshwar,+Odisha+751003/@20.294468,85.743768,17z/data=!4m2!3m1!1s0x3a1907923fc9c557:0xd3b0b05336a9dfaa?hl=en-IN");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
     Button btn;
     btn = (Button) findViewById(R.id.button);
btn.setOnClickListener(new OnClickListener() {
                           @Override
                           public void onClick(View v) {Intent i= new Intent(MainActivity.this,Welcome.class);
                               startActivity(i);

                           }
                       });
     Button rbtn;
     rbtn = (Button) findViewById(R.id.button2);
     rbtn.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i = new Intent(MainActivity.this, Admissions.class);
             startActivity(i);
         } });
     Button abtn;
     abtn = (Button) findViewById(R.id.button5);
     abtn.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i = new Intent(MainActivity.this, Academics.class);
             startActivity(i);
         } });

     button = (Button) findViewById(R.id.button3);
     button.setOnClickListener(new OnClickListener() {

         @Override
         public void onClick(View arg0) {

             Intent browserIntent =
                     new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.iiit-bh.ac.in"));
             startActivity(browserIntent);

         }


     });

 }


}











