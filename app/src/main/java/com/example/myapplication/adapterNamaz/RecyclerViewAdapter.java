package com.example.myapplication.adapterNamaz;

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

import com.example.myapplication.DuaAhadActivity;
import com.example.myapplication.MeetNextActivity;
import com.example.myapplication.NamazActivity;
import com.example.myapplication.NamazAhadActivity;
import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONObject;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {
    public static final String MSG="com.example.myapplication.NAMAZ_AHAD";
    private Context context;
    private JSONArray arr;
    private JSONArray constArr;

    public RecyclerViewAdapter(Context context,JSONArray arr) {
        this.context = context;
        this.arr = arr;
        this.constArr=arr;
    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rownamaz, parent, false);
        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.english.setText(obj.getString("english"));
            holder.urdu.setText(obj.getString("urdu"));
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
        public TextView english,urdu,id;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            english= itemView.findViewById(R.id.t1);
            urdu= itemView.findViewById(R.id.t2);
            id= itemView.findViewById(R.id.id);

        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");
            Intent i=new Intent(context, NamazAhadActivity.class);
            try{ i.putExtra(MSG,arr.getJSONObject(this.getAdapterPosition()).getString("id"));}catch (Exception e){}
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

                        if (constArr.getJSONObject(i).getString("english").toLowerCase().contains(filterPattern)
                                || constArr.getJSONObject(i).getString("urdu").toLowerCase().contains(filterPattern)) {
                            filteredList.put(constArr.getJSONObject(i));}
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


