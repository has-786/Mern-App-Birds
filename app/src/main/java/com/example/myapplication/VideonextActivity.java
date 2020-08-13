package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapterRelatedVideo.RecyclerViewAdapter;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.ErrorListener;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.myapplication.BlogActivity.MSG;


public class VideonextActivity extends AppCompatActivity {
    JSONObject arr1 = new JSONObject();
    RecyclerViewAdapter recyclerViewAdapter;
    public static String MSGv="com.example.myapplication.Video";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videonext);
        getSupportActionBar().setTitle("Watch Video"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        String id1 = getIntent().getStringExtra(MSGv);
        if(id1==null)id1="1";
       // Bundle b = getIntent().getExtras();// add these lines of code to get data from notification
       // String someData = b.getString("id");


   //     Toast.makeText(this,id1,Toast.LENGTH_LONG).show();

        final ProgressBar pb = findViewById(R.id.pb);

        findViewById(R.id.nestedScrollView).setAlpha(0);
        pb.setTransitionAlpha(1);

        final RecyclerView recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        JsonObjectRequest jsonArrayRequest = null;
        RequestQueue requestQueue = null;
        //

        final TextView t1 = findViewById(R.id.t1);
        final WebView video=findViewById(R.id.video);
        //if(findViewById(R.id.nestedScrollView).getAlpha()==1)


        try {
            final String id=id1;
            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(id1));
            requestQueue = Volley.newRequestQueue(this);
            jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                    "http://thelasthope.site/showonevideo", obj, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        arr1 = response.getJSONArray("msg").getJSONObject(0);
                        //Toast.makeText(VideonextActivity.this, arr1.getString("tag"), Toast.LENGTH_LONG).show();
                        JSONObject obj = new JSONObject();
                        obj.put("id", Integer.parseInt(id));
                        obj.put("tag",arr1.getString("tag"));

                        RequestQueue requestQueue = Volley.newRequestQueue(VideonextActivity.this);
                        JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                                "http://thelasthope.site/showRelatedvideomobile", obj, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                JSONArray arr;
                                try {
                                    arr = response.getJSONArray("msg");

                                    recyclerViewAdapter=new RecyclerViewAdapter(VideonextActivity.this,arr);
                                    recyclerView.setAdapter(recyclerViewAdapter);

                                } catch (Exception e) {
                                }

                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("myapp", "Something went wrong Haha");
                          //      Toast.makeText(VideonextActivity.this, "error", Toast.LENGTH_LONG).show();
                            }
                        }) {

                            @Override
                            public Map<String, String> getHeaders() throws AuthFailureError {
                                HashMap<String, String> headers = new HashMap<>();
                                headers.put("Content-Type", "application/json; charset=utf-8");
                                return headers;
                            }
                        };
                        requestQueue.add(jsonArrayRequest);

                        pb.setTransitionAlpha(0);
                        findViewById(R.id.nestedScrollView).setAlpha(1);

                        t1.setText(arr1.getString("name"));
                        video.loadUrl(arr1.getString("link1"));
                        WebSettings webSettings = video.getSettings();
                        webSettings.setJavaScriptEnabled(true);
                        webSettings.setAllowFileAccess(true);
                        webSettings.setAppCacheEnabled(true);



                    } catch (Exception e) {
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("myapp", "Something went wrong Haha");
                  //  Toast.makeText(VideonextActivity.this, "error", Toast.LENGTH_LONG);
                }
            }) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            requestQueue.add(jsonArrayRequest);


        } catch (Exception e) {
        }


    }



    public void fab(View v) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);



        try{
            String s=arr1.getString("name");
            s=s.replace(" ","-");
            intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/Watchvideo/"+s+"/"+arr1.getString("id"));}
        catch (Exception e){}
        intent.putExtra(Intent.EXTRA_SUBJECT,"Videos");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }


}




