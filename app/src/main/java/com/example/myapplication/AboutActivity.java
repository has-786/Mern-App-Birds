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
            obj.put("desc","دعائیں  نماز  اور  زیارت");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Meetings With Imam");
            obj.put("desc","امام سے ملاقات");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Marefat of Imam");
            obj.put("desc","امام کی معرفت");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("topic","News & Blogs");
            obj.put("desc","خبریں اور بلاگ");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("topic","Quiz On Imam");
            obj.put("desc","امام پر کوئز");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("topic","Videos");
            obj.put("desc","ویڈیوز");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("topic","Biographies");
            obj.put("desc","سوانح حیات");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("topic","Important Notices");
            obj.put("desc","اہم نوٹس");
            arr.put(obj);


        }catch (Exception e){}
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(AboutActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
