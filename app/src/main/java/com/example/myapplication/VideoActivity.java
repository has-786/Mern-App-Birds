package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapterVideo.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Collections;

public class VideoActivity extends AppCompatActivity {
    JSONArray arr=new JSONArray();
    RecyclerViewAdapter recyclerViewAdapter;
        public static String MSGv="com.example.myapplication.Video";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().setTitle("Videos"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        final RecyclerView recyclerView=findViewById(R.id.recycle);
        final ProgressBar pb=findViewById(R.id.pb);
        final SearchView searchView = findViewById(R.id.search);

        pb.setTransitionAlpha(1);
        searchView.setAlpha(0);

        //  Toast.makeText(BlogActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JsonArrayRequest jsonArrayRequest=null;
        RequestQueue requestQueue=null;
        try {
            requestQueue = Volley.newRequestQueue(this);
            jsonArrayRequest = new JsonArrayRequest(Request.Method.POST,
                    "http://thelasthope.site/showAllVideos", null, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    String result;
                    Log.d("myapp", "The response is");
                    //JSONObject obj=new JSONObject();
                     try {
                         for (int i = response.length() - 1; i >= 0; i--) arr.put(response.getJSONObject(i));
                         // arr= Collections.reverse(response);


                         pb.setTransitionAlpha(0);
                         searchView.setAlpha(1);
                         recyclerViewAdapter = new RecyclerViewAdapter(VideoActivity.this, arr, VideoActivity.this);
                         recyclerView.setAdapter(recyclerViewAdapter);
                     }catch (Exception e){}
                    try{ result=arr.getJSONObject(0).getString("topic");

                        //Toast.makeText(VideoActivity.this,result+arr.length(), Toast.LENGTH_LONG).show();
                         }
                         catch (Exception e){}
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("myapp", "Something went wrong Haha");
                    Toast.makeText(VideoActivity.this, "error", Toast.LENGTH_LONG);
                }
            });
            requestQueue.add(jsonArrayRequest);
        }catch (Exception e){}

      /*  JSONArray x=new JSONArray();
      try{
          JSONObject obj=new JSONObject();

          obj.put("title","afsgesgg");
        obj.put("tags","gsgesggegege");
        obj.put("video","faf");
      x.put(obj);

        obj=new JSONObject();
        obj.put("title","afsgesgg");
        obj.put("tags","gsgesggegege");
        obj.put("video","faf");
      x.put(obj);
    obj=new JSONObject();
    obj.put("title","afsgesgg");
        obj.put("tags","gsgesggegege");
        obj.put("video","faf");
        x.put(obj);obj.put("title","afsgesgg");
        obj.put("tags","gsgesggegege");
        obj.put("video","faf");
        x.put(obj);

        }catch (Exception e){}*/


        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setClickable(true);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerViewAdapter.getFilter().filter(newText);
                return false;
            }

        });
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });

    }

}
