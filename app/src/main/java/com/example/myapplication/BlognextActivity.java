package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
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
import com.example.myapplication.adapterRelated.RecyclerViewAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

public class BlognextActivity extends AppCompatActivity {
    JSONObject arr1 = new JSONObject();
    RecyclerViewAdapter recyclerViewAdapter;
    public static String MSG1 = "com.example.myapplication.BLOGNEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blognext);
        getSupportActionBar().setTitle("News 313 Blogs"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
         String id1 = getIntent().getStringExtra(MSG);
        if(id1==null)id1="1";
        Bundle b = getIntent().getExtras();// add these lines of code to get data from notification
        String someData = b.getString("id");

        if(someData!=null)
        id1=someData;
        Toast.makeText(this,id1,Toast.LENGTH_LONG).show();

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
        final TextView t2 = findViewById(R.id.t2);
        final TextView rm = findViewById(R.id.rm);
        final TextView t3 = findViewById(R.id.t3);
        final ImageView img = findViewById(R.id.img);
        //if(findViewById(R.id.nestedScrollView).getAlpha()==1)
        rm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (rm.getText().toString().equals("Read More")) {
                        t2.setText(arr1.getString("data"));
                        rm.setText("Read Less");
                    } else {
                        t2.setText(arr1.getString("data").substring(0, Math.min(300, arr1.getString("data").length())));
                        rm.setText("Read More");
                    }
                } catch (Exception e) {
                }
            }
        });
        final String id=id1;
        try {
            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(id1));
            JSONArray req = new JSONArray();
            requestQueue = Volley.newRequestQueue(this);
            jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                    "http://thelasthope.site/showAllblognext", obj, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    String result;
                    try {
                        arr1 = response.getJSONArray("msg").getJSONObject(0);
                        Toast.makeText(BlognextActivity.this, arr1.getString("tag"), Toast.LENGTH_LONG).show();
                        JSONObject obj = new JSONObject();
                        obj.put("id", Integer.parseInt(id));
                        String[] r = arr1.getString("tag").split(" |,");
                        obj.put("tag", arr1.getString("tag"));
                        for (int i = 0; i < r.length; i++) Log.d("myapp1", r[i]);

                        RequestQueue requestQueue = Volley.newRequestQueue(BlognextActivity.this);
                        JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                                "http://thelasthope.site/showRelatedblogmobile", obj, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                String result;
                                JSONArray arr;
                                try {
                                    arr = response.getJSONArray("msg");
                                    // Log.d("myapp1",response.getString("body"));
                                    Log.d("myapp1", arr.length() + "");

                                    recyclerViewAdapter = new RecyclerViewAdapter(BlognextActivity.this, arr);
                                    recyclerView.setAdapter(recyclerViewAdapter);

                                } catch (Exception e) {
                                }

                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("myapp", "Something went wrong Haha");
                                Toast.makeText(BlognextActivity.this, "error", Toast.LENGTH_LONG).show();
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
                        Picasso.get().load("http://thelasthope.site/uploads//" + arr1.getString("img")).resize(400, 325).into(img);
                        t1.setText(arr1.getString("topic"));
                        t2.setText(arr1.getString("data").substring(0, Math.min(arr1.getString("data").length(), 300)));
                        t3.setText("Published On: " + arr1.getString("timestamp"));
                        Log.d("myapp", arr1.getString("topic"));
                        //  Toast.makeText(BlognextActivity.this, arr.getString("topic"), Toast.LENGTH_LONG).show();

                        // For Related Articles Now


                    } catch (Exception e) {
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("myapp", "Something went wrong Haha");
                    Toast.makeText(BlognextActivity.this, "error", Toast.LENGTH_LONG);
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
           String s=arr1.getString("topic");
           s=s.replace(" ","-");
           intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/News313Blogs/"+s+"/"+arr1.getString("id"));}
       catch (Exception e){}
       intent.putExtra(Intent.EXTRA_SUBJECT,"News & Blogs");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }


}