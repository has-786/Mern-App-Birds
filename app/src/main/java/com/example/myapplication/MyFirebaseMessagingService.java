package com.example.myapplication;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.example.myapplication.BlogActivity.MSG;
import static com.example.myapplication.MainActivity.iconImg;
import static com.example.myapplication.VideoActivity.MSGv;

//class extending FirebaseMessagingService
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
     //   remoteMessage.getNotification().
        if(remoteMessage.getNotification()!=null) {
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();
            Uri image=null;
            image=remoteMessage.getNotification().getImageUrl();
            //Log.d("myapp1",image.getPath());

            //f.setIconImage(new ImageIcon(image).getImage());
            NotificationManager notificationManager;//(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            Intent intent=new Intent();
            if(remoteMessage.getData()==null){}
            else {
                if (title.equals("News & Blogs Updates")) {
                    String id = remoteMessage.getData().get("id");
                    intent = new Intent(this, BlognextActivity.class);
                    intent.putExtra(MSG, id);
                } else if (title.equals("Videos Updates")) {
                    String id = remoteMessage.getData().get("id");
                    intent = new Intent(this, VideonextActivity.class);
                    intent.putExtra(MSG, id);
                } else {
                    String link = remoteMessage.getData().get("link");
                    if(link==null){startActivity(new Intent(this,MainActivity.class));}
                    intent = new Intent("OPEN_ACTIVITY_NOTIFY");
                    Bundle b = new Bundle();
                    b.putString("link", link);
                    intent.putExtras(b);
                }
            }


            PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);

            Notification n = new NotificationCompat.Builder(this,"channelID")
                    .setContentTitle(title)
                    .setContentText(body)
                    .setSmallIcon(R.drawable.marefat)
                    .setContentIntent(pIntent)
                    .setSound(Uri.parse("android.resource://com.example.myapplication/raw/correct"))
                    .setVibrate(new long[]{0,500,500,500,500})
                    .setPriority(1)
                    .build();


            notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.notify(0, n);


        }
    }

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    @Override
    public void onNewToken(String token) {
        Log.d("myapp1", "Refreshed token: " + token);
        //final String token = task.getResult().getToken();
        JSONObject obj = new JSONObject();
        try {
            obj.put("token", token);
        } catch (Exception e) {
        }
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
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
                Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_LONG).show();
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
    }

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(token);
    }
