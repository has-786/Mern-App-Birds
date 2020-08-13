package com.example.myapplication.adapterRelated;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BlognextActivity;
import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import static com.example.myapplication.BlogActivity.MSG;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    static int width = 0;
    private Context context;
    private JSONArray arr, constArr;

    public RecyclerViewAdapter(Context context, JSONArray arr) {
        this.context = context;
        this.arr = arr;
        this.constArr = arr;

    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowrelated, parent, false);
        //  width=view.findViewById(R.id.layout).getLayoutParams().width;

        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.topic.setText(position+1+". "+obj.getString("topic"));
            holder.id.setText(obj.getString("id"));



        } catch (Exception e) {
        }
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView topic, id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            topic = itemView.findViewById(R.id.t5);
            id = itemView.findViewById(R.id.id);


        //    Toast.makeText(context, Integer.toString(width), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");
            Intent i = new Intent(context, BlognextActivity.class);
            i.putExtra(MSG, id.getText().toString());
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}