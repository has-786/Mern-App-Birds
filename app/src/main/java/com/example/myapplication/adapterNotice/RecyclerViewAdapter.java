package com.example.myapplication.adapterNotice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.NoticeActivity;
import com.example.myapplication.NoticeAhadActivity;
import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONObject;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {

    private Context context;
    private JSONArray arr;
    private JSONArray  constArr;
    private Activity act;

    public RecyclerViewAdapter(Context context,JSONArray arr,Activity act) {
        this.context = context;
        this.arr = arr;
        this.constArr=arr;
        this.act=act;
    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rownotice, parent, false);
        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.name.setText(obj.getString("name"));
            holder.id.setText(obj.getString("id"));
        }
        catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name,id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            id=itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.t1);

        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");
            Intent i=new Intent(context, NoticeAhadActivity.class);
            i.putExtra(NoticeActivity.MSG,id.getText().toString());
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            JSONArray filteredList = new JSONArray();

            if (constraint == null || constraint.length() == 0) {
                filteredList=constArr;
            } else {
                try{  String filterPattern = constraint.toString().toLowerCase().trim();
                    for (int i=0;i<constArr.length();i++) {

                        if (constArr.getJSONObject(i).getString("name").toLowerCase().contains(filterPattern)
                               ) {
                            filteredList.put(constArr.getJSONObject(i)); }
                    }
                }catch (Exception e){}
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            arr=new JSONArray();
            arr=(JSONArray) results.values;
            notifyDataSetChanged();
        }
    };

}


