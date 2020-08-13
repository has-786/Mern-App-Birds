package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.adapterAbout.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("About The App"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        final RecyclerView recyclerView=findViewById(R.id.recycle);
        // Toast.makeText(MainActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();

        try{

            JSONObject obj=new JSONObject();
            obj.put("topic","Duas Namaz & Ziyarat");
            obj.put("desc","Find Duas, Namaz & Ziyarat here");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Meetings With Imam");
            obj.put("desc","Read about The Meetings with Imam Mahdi (atfs)");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Marefat of Imam");
            obj.put("desc","Marefat of Imam Mahdi (atfs) is one of the most important factors");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("topic","News & Blogs");
            obj.put("desc","Read Daily News & Blogs, especially related to Islam and Imam Mahdi (atfs)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("topic","Quiz On Imam");
            obj.put("desc","Find lots of Questions and Answers based on Imam Mahdi (atfs)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("topic","Videos");
            obj.put("desc","Watch Islamic Videos especially related to Imam Mahdi (atfs)");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Biographies");
            obj.put("desc","Read Biographies of Masumeen");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Important Notices");
            obj.put("desc","Get Notified About All the Islamic Events");
            arr.put(obj);


        }catch (Exception e){}
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(AboutActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
