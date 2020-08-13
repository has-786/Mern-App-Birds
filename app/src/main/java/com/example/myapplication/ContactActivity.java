package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setTitle("Contacts"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

       final TextView email=findViewById(R.id.email);
        final TextView phone=findViewById(R.id.phone);
        final TextView youtube=findViewById(R.id.youtube);
        final TextView facebook=findViewById(R.id.facebook);
        final  TextView insta=findViewById(R.id.insta);
        final TextView address=findViewById(R.id.address);



    }
    public void openWeb(View v) {
        Intent intent = new Intent();
        TextView t=(TextView)v;
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(t.getText().toString()));
        startActivity(intent);
    }
}
