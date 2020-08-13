package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MeetNextActivity extends AppCompatActivity {
    private static int pos,id1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_next);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));


        Intent i = getIntent();
            id1= Integer.parseInt(i.getStringExtra(MeetActivity.MSG));
            pos=MeetActivity.id.indexOf(id1);

            TextView t1=findViewById(R.id.t1);
            TextView t3=findViewById(R.id.t3);
            TextView t4=findViewById(R.id.t2);

            getSupportActionBar().setTitle("Meeting 313"); // for set actionbar title
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

            t1.setText(MeetActivity.etitle.get(pos));
            t3.setText(MeetActivity.esrc.get(pos));
            t4.setText(MeetActivity.edetails.get(pos));



    }


    public void lang(View v)
    {
        Button b2=findViewById(R.id.b2);
        TextView t1=findViewById(R.id.t1);
        TextView t3=findViewById(R.id.t3);
        TextView t4=findViewById(R.id.t2);
        String t=b2.getText().toString();
        String x=MeetActivity.utitle.get(pos);
        if(x.equals("") || x.equals("Sorry Not Available")){
            Toast.makeText(this,"Sorry Urdu is Currently Unavailable",Toast.LENGTH_SHORT).show();
            return;
        }

        if(t.equals("English")){
            b2.setText("اردو");
            getSupportActionBar().setTitle(MeetActivity.etitle.get(pos)); // for set actionbar title
            t1.setText(MeetActivity.etitle.get(pos));
            t3.setText(MeetActivity.esrc.get(pos));
            t4.setText(MeetActivity.edetails.get(pos));
        }
        else {
            b2.setText("English");
            getSupportActionBar().setTitle(MeetActivity.utitle.get(pos)); // for set actionbar title
            t1.setText(MeetActivity.utitle.get(pos));
            t3.setText(MeetActivity.usrc.get(pos));
            t4.setText(MeetActivity.udetails.get(pos));
        }
    }

    public void fab(View v) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        String s=MeetActivity.etitle.get(pos);

        s=s.replace(" ","-");

        try{
            intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/Meeting313/"+s+"/"+id1);}
        catch (Exception e){}
        intent.putExtra(Intent.EXTRA_SUBJECT,"Duas");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }
}
