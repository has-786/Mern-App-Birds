package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
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
import android.widget.Toolbar;

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
import java.util.Collections;
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


public class NoticeAhadActivity extends AppCompatActivity {
    JSONObject arr1 = new JSONObject();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_ahad);
        getSupportActionBar().setTitle("Read Notice"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        String id1 = getIntent().getStringExtra(NoticeActivity.MSG);
        if(id1==null)id1="1";

        //  Toast.makeText(this,id1,Toast.LENGTH_LONG).show();


        final ProgressBar pb=findViewById(R.id.pb);
        findViewById(R.id.nestedScrollView).setAlpha(0);
        pb.setTransitionAlpha(1);

        final TextView t1 = findViewById(R.id.t1);
        final TextView t2 = findViewById(R.id.t2);
        final ImageView img = findViewById(R.id.img);


        try {
            final String id=id1;
            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(id1));
            JSONArray req = new JSONArray();
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                    "http://thelasthope.site/showonenotice", obj, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    String result;
                    try {
                        arr1 = response.getJSONArray("msg").getJSONObject(0);
                        // Toast.makeText(NoticeNextActivity.this, arr1.getString("tag"), Toast.LENGTH_LONG).show();

                        pb.setTransitionAlpha(0);
                        findViewById(R.id.nestedScrollView).setAlpha(1);

                        t1.setText(arr1.getString("name"));
                        t2.setText(arr1.getString("data"));
                        int w=findViewById(R.id.img).getWidth();

                        //Toast.makeText(this,width+"",Toast.LENGTH_SHORT).show();
                        Picasso.get().load("http://thelasthope.site/uploads//"+arr1.getString("img")).resize(w,w).into(img);



                    } catch (Exception e) {
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.d("myapp", "Something went wrong Haha");
                    Toast.makeText(NoticeAhadActivity.this, "error", Toast.LENGTH_LONG);
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
        String s="";
        try{
             s=arr1.getString("name");
            s=s.replace(" ","-");
           intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/ReadNotice/"+s+"/"+arr1.getString("id"));
            }
        catch (Exception e){Log.d("myapp1","error");}

        intent.putExtra(Intent.EXTRA_SUBJECT,"Video");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");
        Log.d("myapp1",arr1+"");
        startActivity(Intent.createChooser(intent, "Share via"));


    }


}




