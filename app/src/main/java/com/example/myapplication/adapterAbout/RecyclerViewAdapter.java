package com.example.myapplication.adapterAbout;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BioActivity;
import com.example.myapplication.BlogActivity;
import com.example.myapplication.DNZActivity;
import com.example.myapplication.MarefatActivity;
import com.example.myapplication.MeetActivity;
import com.example.myapplication.NoticeActivity;
import com.example.myapplication.QuizActivity;
import com.example.myapplication.R;
import com.example.myapplication.VideoActivity;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context context;
    private JSONArray arr;


    public RecyclerViewAdapter(Context context,JSONArray arr) {
        this.context = context;
        this.arr = arr;


    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowabout, parent, false);
        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.topic.setText(obj.getString("topic")+":");
            holder.desc.setText(obj.getString("desc"));
        }
        catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView topic,desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topic = itemView.findViewById(R.id.t1);
            desc = itemView.findViewById(R.id.t2);

        }

    }
}


