package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import static com.example.myapplication.BlogActivity.MSG;
import static com.example.myapplication.VideoActivity.MSGv;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);


        String link=null,act = null, id = null;

        Bundle b = getIntent().getExtras();// add these lines of code to get data from notification
        if(b!=null) {
            String temp = b.getString("link");
            if (temp != null) link = temp;
        }
       // else { startActivity(new Intent(this,MainActivity.class)); finish(); return;}

        if(link==null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            link = data.toString();
        }

        if(link!=null)Log.d("myapp1", link);
        else Log.d("myapp1", "lol");

        if(link==null || link.equals("X")){startActivity(new Intent(this,MainActivity.class));finish();}
        else {

          if(link.equals("http://thelasthope.site")){
              Toast.makeText(this,"It is The lastHope App",Toast.LENGTH_SHORT).show();
              //startActivity(new Intent(this,MainActivity.class));
              finish();
          }
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
              } else if (act.toLowerCase().equals("readdua")) {
                  Intent i = new Intent(this, DuaActivity.class);
                  i.putExtra(DuaActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("readnamaz")) {
                  Intent i = new Intent(this, NamazActivity.class);
                  i.putExtra(NamazActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("readziyarat")) {
                  Intent i = new Intent(this, ZiyaratActivity.class);
                  i.putExtra(ZiyaratActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("marefat313")) {
                  Intent i = new Intent(this, MarefatActivity.class);
                  i.putExtra(MarefatActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("meeting313")) {
                  Intent i = new Intent(this, MeetActivity.class);
                  i.putExtra(MeetActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("readbiography")) {
                  Intent i = new Intent(this, BioActivity.class);
                  i.putExtra(BioActivity.MSG1, id);
                  i.putExtra(BioActivity.MSG2, Integer.toString(0));
                  i.putExtra(BioActivity.MSG3, 0);
                  startActivity(i);
                  finish();
              } else if (act.toLowerCase().equals("readnotice")) {
                  Intent i = new Intent(this, NoticeAhadActivity.class);
                  i.putExtra(NoticeActivity.MSG, id);
                  startActivity(i);
                  finish();
              } else {
                  Intent i = new Intent(this, MainActivity.class);
                  i.putExtra(MSG, id);
                  startActivity(i);
                  finish();

              }
          }
        }
        }

}
