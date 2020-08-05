package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myapplication.adapterNamaz.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

public class NamazActivity extends AppCompatActivity {
    public static final String MSG="com.example.myapplication.NAMAZ_AHAD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);

        getSupportActionBar().setTitle("Namaz"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        final RecyclerView recyclerView=findViewById(R.id.recycle);
        Toast.makeText(NamazActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();

        try{

            JSONObject obj=new JSONObject();
            obj.put("english","MERITS OF THE NAMAZ E SHAB\n");
            obj.put("urdu","نیند سے بیدار ہو کر نماز شب کا بیان\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","NAMAZ E SHAB\n");
            obj.put("urdu","نمازِ شب کا طریقہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","NAMAZ OF IMAM MAHDI (A.T.F.S)\n");
            obj.put("urdu","نماز حضر ت صاحب الزمان عجل اللہ فرجہ الشریف\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","NAMAZ OF JAFAR E TAYYAR\n");
            obj.put("urdu","نماز حضرت جعفر طیار علیہ السلام\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","NAMAZ OF IMAM AL-MAHDI (A) AT THE JAMKARAN MOSQUE\n");
            obj.put("urdu","" );


            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("english","PRAYER OF IMAM MAHDI ON NIGHT OF FRIDAY (SHAB E JUMUAH)\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("english","Prayer for Concentration\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","Prayer for relief and it's Supplication\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","Prayer seeking for Imam Mahdi's Help\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","Dedication of Prayer to Imam Mahdi atfs on Thursdays\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("english","Prayer for request on Friday\n");
            obj.put("urdu","" );


            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("english","NAMAZ E AYAAT\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","NAMAZ E WAHSHAT\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("english","NAMAZ E NAWAFIL\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("english","NAMAZ E MAYYAT\n");
            obj.put("urdu","");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);


        }catch (Exception e){}

        for(int i=0;i<arr.length();i++)
        {

            try{
                arr.getJSONObject(i).put("id",i);
                JSONObject obj=arr.getJSONObject(i);
                String s=obj.getString("english");
                String res="";
                for(int j=0;j<s.length();j++)
                {
                    if((s.charAt(j)>='A' && s.charAt(j)<='Z' )|| (s.charAt(j)>='a' && s.charAt(j)<='z')){
                        if(j==0 || s.charAt(j-1)==' ')res+=Character.toUpperCase(s.charAt(j));
                        else res+=Character.toLowerCase(s.charAt(j));}
                    else res+=s.charAt(j);
                }
                obj.put("english",res.trim());

                arr.put(i,obj);



            }catch(Exception e){}
        }


       final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(NamazActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);

        final SearchView searchView = findViewById(R.id.search);
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setClickable(true);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerViewAdapter.getFilter().filter(newText);
                return false;
            }

        });
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });


    }
}
