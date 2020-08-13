package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.adapterDNZ.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

public class DNZActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnz);
        getSupportActionBar().setTitle("Duas Namaz & Ziyarat"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        final RecyclerView recyclerView=findViewById(R.id.recycle);
       // Toast.makeText(DNZActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();

        try{

            JSONObject obj=new JSONObject();
            obj.put("english","Duas");
            obj.put("urdu","دعائیں");
            obj.put("img","drawable/imam2.png");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","Namaz");
            obj.put("urdu","نماز");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);obj=new JSONObject();

            obj.put("english","Ziyarat");
            obj.put("urdu","زیارت");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);

        }catch (Exception e){}
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(DNZActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
