package com.example.myapplication.adapterQuiz;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONObject;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {

    private Context context;
    private JSONArray arr,constArr;

    public RecyclerViewAdapter(Context context,JSONArray arr) {
        this.context = context;
        this.arr = arr;
        this.constArr=arr;
    }


    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowquiz, parent, false);
        return new RecyclerViewAdapter.ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        try {
            JSONObject obj = arr.getJSONObject(position);
            holder.ques.setText(obj.getString("ques"));
            holder.ans.setText(obj.getString("ans"));


        }
        catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView ques;
        public TextView ans;
        public Button b;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            ques = itemView.findViewById(R.id.ques);
            ans = itemView.findViewById(R.id.ans);
            b = itemView.findViewById(R.id.b);
            ans.setAlpha(0);
            b.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.b:
                    if(b.getText().toString().equals("Show Answer")){ans.setAlpha(1);b.setText("Hide Answer");   }
                    else {ans.setAlpha(0);b.setText("Show Answer");}
                    break;

            }
            Log.d("ClickFromViewHolder", "Clicked");

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

                        if (constArr.getJSONObject(i).getString("ques").toLowerCase().contains(filterPattern)
                        || constArr.getJSONObject(i).getString("ans").toLowerCase().contains(filterPattern)) {
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
