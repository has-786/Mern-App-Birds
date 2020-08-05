package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.adapterMain.RecyclerViewAdapter;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {
static  ImageView iconImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iconImg=new ImageView(MainActivity.this);
        FirebaseMessaging.getInstance().subscribeToTopic("chat");
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);


        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                        if (!task.isSuccessful()) {
                            Log.d("myapp", "getInstanceId failed", task.getException());
                            return;
                        }

                        // Get new Instance ID token
                        final String token = task.getResult().getToken();
                             Log.d("myapp1","Registered Token: "+token);

                        JSONObject obj = new JSONObject();
                        try {
                            obj.put("token", token);
                        } catch (Exception e) {
                        }
                        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                        JsonObjectRequest jsonArrayRequest = new JsonObjectRequest(Request.Method.POST,
                                "http://thelasthope.site/uploadToken", obj, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                // JSONObject arr = response;
                                try {
                                    Log.d("myapp1", response.getString("msg")+response.getString("res"));
                                } catch (Exception e) {
                                }

                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Log.d("myapp", "Something went wrong Haha");
                                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
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
                    }});

                                    // Log and toast
                       // String msg = getString(R.string.msg_token_fmt, token);
                  //      Log.d("myapp1","Registered Token: "+token);
                        //
                        // Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();


        getSupportActionBar().setTitle("The lastHope"); // for set actionbar title
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));
        final RecyclerView recyclerView=findViewById(R.id.recycle);
       // Toast.makeText(MainActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();

        try{

            JSONObject obj=new JSONObject();
            obj.put("english","Duas Namaz & Ziyarat");
            obj.put("urdu","دعائیں  نماز  اور  زیارت");
             obj.put("img","drawable/imam2.png");
            arr.put(obj);

           obj=new JSONObject();
            obj.put("english","Meetings With Imam");
            obj.put("urdu","امام سے ملاقات");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","Recognition(Marefat) of Imam");
            obj.put("urdu","امام کے معرفت");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("english","News & Blogs");
            obj.put("urdu","خبریں اور بلاگ");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","Quiz On Imam");
            obj.put("urdu","امام پر کوئز");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam2.png");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","Videos");
            obj.put("urdu","ویڈیوز");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","Biographies");
            obj.put("urdu","سوانح حیات");
            obj.put("img","C:\\Users\\SYED MD HASNAIN JAH\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\drawable\\imam1.jpg");
            arr.put(obj);


        }catch (Exception e){}
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
                Intent i=new Intent("com.example.EXAMPLE_INTENT");
                sendBroadcast(i);
                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
      //  Toast.makeText(this,"Unregistered",Toast.LENGTH_LONG).show();
    }
}
