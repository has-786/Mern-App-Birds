package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;

import static com.example.myapplication.BlogActivity.MSG;
import static com.example.myapplication.VideoActivity.MSGv;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);


        String link=null,act = null, id = null;

        Bundle b = getIntent().getExtras();// add these lines of code to get data from notification
        String temp=b.getString("link");
        if(temp!=null)link=temp;
        else {
            Intent intent = getIntent();
            Uri data = intent.getData();
            link = data.toString();
        }
        if(link!=null)Log.d("myapp1", link);
        else Log.d("myapp1", "lol");

        if(link==null || link.equals("X")){startActivity(new Intent(this,MainActivity.class));finish();}
        else {
            int pos1 = link.indexOf('/');
            String protocol = link.substring(0, pos1);
            Log.d("myapp", protocol);
            int pos2 = link.indexOf('/', pos1 + 2);
            int pos3 = link.indexOf('/', pos2 + 1);
            act = link.substring(pos2 + 1, pos3);

            int pos4 = link.indexOf('/', pos3 + 1);
            id = link.substring(pos4 + 1);
            Log.d("myapp1", act);
            Log.d("myapp1", id);


            if (act.toLowerCase().equals("news313blogs")) {
                Intent i = new Intent(this, BlognextActivity.class);
                i.putExtra(BlogActivity.MSG, id);
                startActivity(i);
                finish();
            } else if (act.toLowerCase().equals("watchvideo")) {
                Intent i = new Intent(this, VideonextActivity.class);
                i.putExtra(MSGv, id);
                startActivity(i);
                finish();
            }
            else if (act.toLowerCase().equals("readdua")) {
                Intent i = new Intent(this, DuaAhadActivity.class);
                i.putExtra(DuaActivity.MSG, id);
                startActivity(i);
                finish();
            }
            else if (act.toLowerCase().equals("readnamaz")) {
                Intent i = new Intent(this, NamazAhadActivity.class);
                i.putExtra(NamazActivity.MSG, id);
                startActivity(i);
                finish();
            }
            else if (act.toLowerCase().equals("readziyarat")) {
                Intent i = new Intent(this, ZiyaratAhadActivity.class);
                i.putExtra(ZiyaratActivity.MSG, id);
                startActivity(i);
                finish();
            }
            else if (act.toLowerCase().equals("marefat313")) {
                Intent i = new Intent(this, MarefatNextActivity.class);
                i.putExtra(MarefatActivity.MSG, id);
                startActivity(i);
                finish();
            }

            else if (act.toLowerCase().equals("meeting313")) {
                Intent i = new Intent(this, MeetNextActivity.class);
                i.putExtra(MeetActivity.MSG, id);
                startActivity(i);
                finish();
            }


            else {
                Intent i = new Intent(this, MainActivity.class);
                i.putExtra(MSG, id);
                startActivity(i);
                finish();

            }
        }
        }

}
