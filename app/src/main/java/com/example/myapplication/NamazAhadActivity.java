package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;

import static com.example.myapplication.NamazActivity.etitle;
import static com.example.myapplication.NamazActivity.utitle;
import static com.example.myapplication.NamazActivity.etrans;
import static com.example.myapplication.NamazActivity.id;
import static com.example.myapplication.NamazActivity.utrans;
import static com.example.myapplication.NamazActivity.uarab;
import static com.example.myapplication.NamazActivity.earab;
import static com.example.myapplication.NamazActivity.udesc;
import static com.example.myapplication.NamazActivity.edesc;

public class NamazAhadActivity extends AppCompatActivity {
    TextView t0,t1,t2,t3;
    public static int id1;
    public static int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_ahad);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));


        Intent intent = getIntent();
        id1= Integer.parseInt(intent.getStringExtra(NamazActivity.MSG));



        for(int i=0;i<etitle.size();i++)
        {
               id.add(i);
                String s=etitle.get(i);
                String res="";
                for(int j=0;j<s.length();j++)
                {
                    if((s.charAt(j)>='A' && s.charAt(j)<='Z' )|| (s.charAt(j)>='a' && s.charAt(j)<='z')){
                     if(j==0 || s.charAt(j-1)==' ')res+=Character.toUpperCase(s.charAt(j));
                    else res+=Character.toLowerCase(s.charAt(j));}
                    else res+=s.charAt(j);
                }
            etitle.set(i,res.trim());

             s=earab.get(i); int j=0;
              while(j<s.length() && s.charAt(j)=='\n')j++;
             if(j<s.length()) earab.set(i,s.substring(j));
            s=uarab.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) uarab.set(i,s.substring(j));

            s=etrans.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) etrans.set(i,s.substring(j));

            s=utrans.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) utrans.set(i,s.substring(j));


        }



        pos=id.indexOf(id1);
        Log.d("myapp",Integer.toString(pos));


        getSupportActionBar().setTitle("Read Namaz"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        t3=findViewById(R.id.t3);
        t3.setText(etitle.get(pos));

        t1=findViewById(R.id.t1);
        t1.setText(edesc.get(pos));

        t2=findViewById(R.id.t2);
        t2.setText(earab.get(pos));
        try{
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Amiri-Bold.ttf");
            t2.setTypeface(custom_font);
            t2.setTextSize(25);
            t2.setLineSpacing(0,1.3f);


        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
        }
    }


    public void change(View v)
    {
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);

        String t=b1.getText().toString();
        if(t.equals("SHOW TRANSLATION") || t.equals("ترجمہ دکھائیں")){
            if(b2.getText().toString().equals("ENGLISH"))
            {
                b1.setText("عربی دکھائیں");
                t2.setText(utrans.get(pos));
                t2.setTextSize(25);
                t2.setTypeface(Typeface.create("sans-serif-condensed-medium", Typeface.BOLD));

            }
            else
            {
                b1.setText("SHOW ARABIC");
                t2.setText(etrans.get(pos));
                t2.setTextSize(20);
                t2.setTypeface(Typeface.create("sans-serif-condensed-medium", Typeface.BOLD));

            }
            // t2.setTypeface(Typeface.create("sans-serif-condensed-light", Typeface.NORMAL));
        }
        else {

            if(b2.getText().toString().equals("ENGLISH")) {
                t2.setText(uarab.get(pos));
                Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Amiri-Bold.ttf");
                t2.setTypeface(custom_font);
                t2.setTextSize(25);
                b1.setText("ترجمہ دکھائیں");
            }
            else {t2.setText(earab.get(pos));
                Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Amiri-Bold.ttf");
                t2.setTypeface(custom_font);
                t2.setTextSize(25);
                b1.setText("SHOW TRANSLATION");

            }

        }
    }



    public void lang(View v)
    {
        Button b2=findViewById(R.id.b2);
        Button b1=findViewById(R.id.b1);

        String t=b2.getText().toString();

        String x=utitle.get(pos);
        String y=uarab.get(pos);

        if(x.equals("") || x.equals("Sorry Not Available") || y.equals("") || y.equals("Sorry Not Available")){
            Toast.makeText(this,"Sorry Urdu is Currently Unavailable",Toast.LENGTH_SHORT).show();
            return;
        }

        if(t.equals("ENGLISH")){
            b2.setText("اردو");
            t3.setText(etitle.get(pos));
            t1.setText(edesc.get(pos));
            if(b1.getText().toString().equals("ترجمہ دکھائیں"))
            {
                t2.setText(earab.get(pos));
                b1.setText("SHOW TRANSLATION");
                Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Amiri-Bold.ttf");
                t2.setTypeface(custom_font);
                t2.setTextSize(25);
            }
            else{
                t2.setText(etrans.get(pos));
                b1.setText("SHOW ARABIC");
                t2.setTypeface(Typeface.create("sans-serif-condensed-medium", Typeface.BOLD));
                t2.setTextSize(20);
            }



        }
        else {
            b2.setText("ENGLISH");
            t3.setText(utitle.get(pos));
            t1.setText(udesc.get(pos));
            if(b1.getText().toString().equals("SHOW TRANSLATION"))
            {
                t2.setText(uarab.get(pos));
                b1.setText("ترجمہ دکھائیں");
                Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Amiri-Bold.ttf");
                t2.setTypeface(custom_font);
                t2.setTextSize(25);
            }
            else{
                t2.setText(utrans.get(pos));
                b1.setText("عربی دکھائیں");
                t2.setTypeface(Typeface.create("sans-serif-condensed-medium", Typeface.BOLD));
                t2.setTextSize(25);

            }
        }
    }
    public void fab(View v) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        String s=etitle.get(pos);

        s=s.replace(" ","-");

        try{
            intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/ReadNamaz/"+s+"/"+id1+"");}
        catch (Exception e){}
        intent.putExtra(Intent.EXTRA_SUBJECT,"Duas");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }

}
