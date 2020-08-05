package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.myapplication.BioActivity.MSG3;
import static com.example.myapplication.BioActivity.edesc;
import static com.example.myapplication.BioActivity.etitle;
import static com.example.myapplication.BioActivity.etitleH;
import static com.example.myapplication.BioActivity.id;
import static com.example.myapplication.BioActivity.utitle;
import static com.example.myapplication.BioActivity.utitleH;

public class BioNextActivity extends AppCompatActivity {
    TextView t0,t1,t2,t3;
    ImageView img1;
    public static int pos=0,pos1=0,id1=0,lang=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_next);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        Intent i=getIntent();

        final String subname=i.getStringExtra(BioActivity.MSG2);
         id1=Integer.parseInt(i.getStringExtra(BioActivity.MSG1));
        Toast.makeText(this,id1+" "+subname,Toast.LENGTH_SHORT).show();
         lang=i.getIntExtra(MSG3,0);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        img1=findViewById(R.id.imageView);



       pos=BioActivity.id.indexOf(id1);

       pos1=Integer.parseInt(subname);

        getSupportActionBar().setTitle("Read Biography"); // for set actionbar title
        img1.setImageResource(BioActivity.images.get(pos).get(pos1));

        if(lang==0) {
            t2.setText(BioActivity.edesc.get(pos).get(pos1));
            t1.setText(etitleH.get(pos) + ": " + etitle.get(pos).get(pos1));
            t3.setText(etitleH.get(pos) + ": " + etitle.get(pos).get((pos1 + 1) % etitle.get(pos).size()));

        }
        else{
            t2.setText(BioActivity.udesc.get(pos).get(pos1));
            t1.setText(utitleH.get(pos) + ": " + utitle.get(pos).get(pos1));
            t3.setText(utitleH.get(pos) + ": " + utitle.get(pos).get((pos1 + 1) % utitle.get(pos).size()));
            Button b2=findViewById(R.id.b2);
            b2.setText("English");

        }


    }

    public  void next(View v){
        Intent intent=new Intent(BioNextActivity.this,BioNextActivity.class);
        intent.putExtra(BioActivity.MSG1,Integer.toString(id1));
        intent.putExtra(BioActivity.MSG2,Integer.toString((pos1+1)%etitle.get(pos).size()));
        intent.putExtra(MSG3,lang);
        Toast.makeText(BioNextActivity.this,Integer.toString(id1)+" "+Integer.toString((pos1+1)%etitle.get(pos).size()),Toast.LENGTH_SHORT).show();
        startActivity(intent);


    }




    public void lang(View v)
    {
        Button b2=findViewById(R.id.b2);
        String t=b2.getText().toString();
        if(t.equals("English")){
            b2.setText("اردو");
            t2.setText(edesc.get(pos).get(pos1));
            t1.setText(BioActivity.etitle.get(pos).get(pos1));
            t3.setText(etitleH.get(pos) + ": " + etitle.get(pos).get((pos1 + 1) % etitle.get(pos).size()));

            lang=0;

        }
        else {
            b2.setText("English");
            t2.setText(BioActivity.udesc.get(pos).get(pos1));
            t1.setText(utitle.get(pos).get(pos1));
            t3.setText(utitleH.get(pos) + ": " + utitle.get(pos).get((pos1 + 1) % utitle.get(pos).size()));

            lang=1;

        }
    }

}
