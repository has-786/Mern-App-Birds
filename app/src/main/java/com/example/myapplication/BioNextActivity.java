package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class BioNextActivity extends AppCompatActivity {
    TextView t0,t1,t2,t3;
    ImageView img1;
    public static int pos=0,pos1=0,id1=0,lang=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_next);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        getSupportActionBar().setTitle("Read Biography"); // for set actionbar title
    }

    public  void next(View v){
        Intent intent=new Intent(BioNextActivity.this,BioNextActivity.class);
        intent.putExtra(BioActivity.MSG1,Integer.toString(id1));
        intent.putExtra(BioActivity.MSG2,Integer.toString((pos1+1)%BioActivity.etitle.get(pos).size()));
        intent.putExtra(BioActivity.MSG3,lang);
        startActivity(intent);
    }

    @Override
protected   void onStart()
{
    super.onStart();
    Intent i=getIntent();

    final String subname=i.getStringExtra(BioActivity.MSG2);

    if(i!=null)id1=Integer.parseInt(i.getStringExtra(BioActivity.MSG1));
    //lang=i.getIntExtra(MSG3,0);
    t1=findViewById(R.id.t1);
    t2=findViewById(R.id.t2);
    t3=findViewById(R.id.t3);
    img1=findViewById(R.id.imageView);




    pos=BioActivity.id.indexOf(id1);

    if(subname!=null)pos1=Integer.parseInt(subname);


    //img1.setImageResource(BioActivity.images.get(pos).get(pos1));
    if(pos==13) Picasso.get().load("http://thelasthope.site//uploads//"+BioActivity.img.get(pos)).resize(230,280).error(R.drawable.candle).into(img1);


    else Picasso.get().load("http://thelasthope.site//uploads//"+BioActivity.img.get(pos)).resize(280,280).error(R.drawable.candle).into(img1);
Log.d("myapp1",BioActivity.img.get(pos));
    if(lang==0) {
        t2.setText(BioActivity.edesc.get(pos).get(pos1));
        t1.setText(BioActivity.etitleH.get(pos) + ": " + BioActivity.etitle.get(pos).get(pos1));
        t3.setText(BioActivity.etitleH.get(pos) + ": " + BioActivity.etitle.get(pos).get((pos1 + 1) % BioActivity.etitle.get(pos).size()));
        t2.setLineSpacing(0,1f);

    }
    else{
        t2.setText(BioActivity.udesc.get(pos).get(pos1));
        t1.setText(BioActivity.utitleH.get(pos) + ": " + BioActivity.utitle.get(pos).get(pos1));
        t3.setText(BioActivity.utitleH.get(pos) + ": " + BioActivity.utitle.get(pos).get((pos1 + 1) % BioActivity.utitle.get(pos).size()));
        Button b2=findViewById(R.id.b2);
        b2.setText("English");
        t2.setLineSpacing(0,1.2f);

    }


}

    public void lang(View v)
    {
        Button b2=findViewById(R.id.b2);
        String t=b2.getText().toString();
        if(t.equals("English")){
            b2.setText("اردو");
            t2.setText(BioActivity.edesc.get(pos).get(pos1));
            t1.setText(BioActivity.etitleH.get(pos) + ": " +BioActivity.etitle.get(pos).get(pos1));
            t3.setText(BioActivity.etitleH.get(pos) + ": " + BioActivity.etitle.get(pos).get((pos1 + 1) % BioActivity.etitle.get(pos).size()));
            t2.setLineSpacing(0,1f);

            lang=0;

        }
        else {
            b2.setText("English");
            t2.setText(BioActivity.udesc.get(pos).get(pos1));
            t1.setText(BioActivity.utitleH.get(pos) + ": " +BioActivity.utitle.get(pos).get(pos1));
            t3.setText(BioActivity.utitleH.get(pos) + ": " + BioActivity.utitle.get(pos).get((pos1 + 1) % BioActivity.utitle.get(pos).size()));
            t2.setLineSpacing(0,1.2f);


            lang=1;

        }
    }



    public void fab(View v) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);



        try{
            String s=BioActivity.etitleH.get(pos);
            s=s.replace(" ","-");
            s.trim();
            intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/ReadBiography/"+s+"/"+pos);}
        catch (Exception e){}
        intent.putExtra(Intent.EXTRA_SUBJECT,"News & Blogs");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }

}
