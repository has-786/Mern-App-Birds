package com.example.myapplication.adapterBio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BioNextActivity;
import com.example.myapplication.CountryAdapter;
import com.example.myapplication.CountryItem;
import com.example.myapplication.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.example.myapplication.BioActivity.MSG3;
import static com.example.myapplication.BioActivity.biolang;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> implements Filterable {
    public static final String MSG2="com.example.myapplication.BIO";
    public static final String MSG1="com.example.myapplication.BIO1";

    private Context context;
    private JSONArray arr,constArr;


   CountryAdapter  mAdapter ;
    static int position=0;

    // spinnerCountries.set


    private static int images[]=new int[6];


    public RecyclerViewAdapter(Context context,JSONArray arr) {
        this.context = context;
        this.arr = arr;
        this.constArr=arr;


    }

    // Where to get the single card as viewholder Object
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowbio, parent, false);
        return new ViewHolder(view);
    }

    // What will happen after we create the viewholder object
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder,final int position) {

        try {
            JSONObject obj = arr.getJSONObject(position);

            mAdapter= new CountryAdapter(context, (ArrayList<CountryItem>)obj.get("bio"));
            holder.spinner.setAdapter(mAdapter);
            holder.spinner.setSelection(0);
            holder.id.setText(obj.getString("id"));

            //holder.spinner.setDropDownWidth(300);

        }
        catch(Exception e){}
    }

    // How many items?
    @Override
    public int getItemCount() {
        return arr.length();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
       public Spinner spinner;
        public  ImageView img;
        public TextView id;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            position=this.getAdapterPosition();
            itemView.setOnClickListener(this);
            spinner = itemView.findViewById(R.id.spinner_countries);
            id=itemView.findViewById(R.id.id);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int pos, long id1) {
                  //  final int position=getAdapterPosition();

                try {
                    if (pos > 0) {

                        Intent i = new Intent(context, BioNextActivity.class);
                        String name = id.getText().toString();//(CountryItem) parent.getAdapter().getItem(0);
                        String subname = Integer.toString(pos-1);

                        i.putExtra(MSG1, name);
                        i.putExtra(MSG2, subname);
                        i.putExtra(MSG3,biolang);
                        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                        //  Toast.makeText(context, name+ " " + subname, Toast.LENGTH_SHORT).show();
                        context.startActivity(i);
                    }
                    spinner.setSelection(0);

                }catch (Exception e){}
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }

        @Override
        public void onClick(View view) {
       /*     Log.d("ClickFromViewHolder", "Clicked");
            Intent i=new Intent(context, BioNextActivity.class);
            i.putExtra(MSG,Integer.toString(this.getAdapterPosition()));
            context.startActivity(i);*/

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
                try{
                     String filterPattern = constraint.toString().toLowerCase().trim();
                     String[] p=filterPattern.split(" ");
                     for(int j=0;j<p.length;j++)
                     {
                         for (int i=0;i<constArr.length();i++) {
                             ArrayList<CountryItem> item=(ArrayList<CountryItem>)constArr.getJSONObject(i).get("bio");
                             if (item.get(0).getCountryName().toLowerCase().contains(p[j])
                                     || item.get(0).getFlagImage().toLowerCase().contains(p[j])) {

                                 filteredList.put(constArr.get(i));}
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


