package com.example.myapplication.adapter;

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


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {

    public  static String MSG="com.example.myapplication.BLOG";
    static int width=0;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
      //  width=view.findViewById(R.id.layout).getLayoutParams().width;

        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
          try {
                 JSONObject obj = arr.getJSONObject(position);
                 holder.topic.setText(obj.getString("topic"));
              holder.tag.setText(obj.getString("tag"));
              holder.id.setText(obj.getString("id"));

              Picasso.get().load("http://thelasthope.site/uploads//"+obj.getString("img")).resize(100,100).error(R.drawable.candle).into(holder.img);

              //holder.img.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
              Picasso.get().setLoggingEnabled(true);




          }
            catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView topic,data,tag,id;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            topic= itemView.findViewById(R.id.t1);
            tag= itemView.findViewById(R.id.t2);
            img = itemView.findViewById(R.id.img);
            id=itemView.findViewById(R.id.id);



         //   Toast.makeText(context,Integer.toString(width),Toast.LENGTH_SHORT).show();
            img.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d("ClickFromViewHolder", "Clicked");
            Intent i=new Intent(context, BlognextActivity.class);
            i.putExtra(MSG,id.getText().toString());
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
                    String[] p=filterPattern.split(" ");
                    for(int j=0;j<p.length;j++)
                    {
                        for (int i=0;i<constArr.length();i++) {

                            if (constArr.getJSONObject(i).getString("topic").toLowerCase().contains(p[j])
                                    || constArr.getJSONObject(i).getString("tag").toLowerCase().contains(p[j])) {
                                filteredList.put(constArr.getJSONObject(i));}
                        }
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


