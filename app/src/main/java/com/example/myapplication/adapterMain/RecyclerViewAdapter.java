package com.example.myapplication.adapterMain;

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
import com.example.myapplication.QuizActivity;
import com.example.myapplication.R;
import com.example.myapplication.VideoActivity;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    public static final String MSG="com.example.myapplication.MAIN";

    private Context context;
    private JSONArray arr;

    private static int images[]=new int[7];


    private  static ArrayList<Class> activities=new ArrayList<>();


    public RecyclerViewAdapter(Context context,JSONArray arr) {
        this.context = context;
        this.arr = arr;
        activities.add(DNZActivity.class);
        activities.add(MeetActivity.class);
        activities.add(MarefatActivity.class);
        activities.add(BlogActivity.class);
        activities.add(QuizActivity.class);
        activities.add(VideoActivity.class);
        activities.add(BioActivity.class);

        images[0]=R.drawable.imam4;
        images[1]=R.drawable.imam2;
        images[2]=R.drawable.imam5;
        images[3]=R.drawable.imam1;
        images[4]=R.drawable.imam3;
        images[5]=R.drawable.imam5;
        images[6]=R.drawable.imam5;

    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowmain, parent, false);
        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.english.setText(obj.getString("english"));
            holder.urdu.setText(obj.getString("urdu"));
            holder.img.setImageResource(images[position]);
            int height=holder.itemView.getLayoutParams().height;
             Picasso.get().load(images[position]).resize(95,95).into(holder.img);
        }
        catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView english,urdu;
        public ImageView img;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            english = itemView.findViewById(R.id.t1);
            urdu = itemView.findViewById(R.id.t2);
            img=itemView.findViewById(R.id.img);

        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");
            Intent i=new Intent(context, activities.get(this.getAdapterPosition()));
            i.putExtra(MSG,Integer.toString(this.getAdapterPosition()));
            context.startActivity(i);
        }
    }
}


