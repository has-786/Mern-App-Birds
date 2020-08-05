package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SearchEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myapplication.adapterDua.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class DuaActivity extends AppCompatActivity {
    public static final String MSG="com.example.myapplication.DUA_AHAD";
     RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        getSupportActionBar().setTitle("Duas"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        final RecyclerView recyclerView = findViewById(R.id.recycle);
       // Toast.makeText(DuaActivity.this, "Hi Syed", Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr = new JSONArray();

        try {

            JSONObject obj = new JSONObject();
            obj.put("english", "DUA E AHAD\n");
            obj.put("urdu", "دعائے عہد حضرت امامِ عصرؑ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA E NUDBAH\n");
            obj.put("urdu","دعائے ندبہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", " DUA E FARAJ\n");
            obj.put("urdu", "دعائے فرج امام زمان ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", " DUA E FARAJ - DUA SAHIB AL AMR (A.T.F.S.)\n");
            obj.put("urdu", "دعائے فرج حضرت حجۃ عجل اللہ تعالیٰ فرجہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "AL ISTIGHATHAH BIL HUJJAH\n");
            obj.put("urdu", "استغاثہ بحضرت مہدی قائم عجل اللہ تعالیٰ فرجہ الشریف\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", " DUA AL-HUJJAH\n");
            obj.put("urdu", "دعاء حضرت حجۃ علیہ السلام\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA DURING THE OCCULTATION OF IMAM MAHDI (A) - LONG\n");
            obj.put("urdu", "دعاء در غیبت امام زمان علیہ السَّلام\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA DURING THE OCCULTATION OF IMAM MAHDI (A) - SHORT\n");
            obj.put("urdu", "دعاء در غیبت امام زمان علیہ السَّلام مختصر\n");
            arr.put(obj);


            obj = new JSONObject();
            obj.put("english", "SALAWAT UPON THE AWAITED IMAM\n");
            obj.put("urdu", "صلوات بر ولی امر منتظر علیہ السلام\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA AL MAHDI\n");
            obj.put("urdu", "دعاءحضرت مہدی عجل اللہ تعالیٰ فرجہٗ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "HADEESE KISA\n");
            obj.put("urdu", "حدیث کساء\nؑ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA KUMAYL\n");
            obj.put("urdu","دُعائے کمیل بن زیاد علیہ الرحمہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA TAWASSUL\n");
            obj.put("urdu", "دُعائے توسّل\n ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA JAWSHAN AL KABIR\n");
            obj.put("urdu", "دعائے جوشن کبیر\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA JAWSHAN AL SAGIR\n");
            obj.put("urdu", "دعائے ابو حمزۂ ثمالی\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "DUA ABU HAMZAH AL THUMALI\n");
            obj.put("urdu", "دعائے ابو حمزۂ ثمالی\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA AL NOOR\n");
            obj.put("urdu", "دعائے نور\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA ADILAH\n");
            obj.put("urdu", "دعائے عدیلہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA E HIFZ E IMAAN\n");
            obj.put("urdu", "دعائے حفظ الايمان\n");
                       arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "Dua e Arafah of Imam Hussain\n");
            obj.put("urdu", "دعاءِ امام حسین علیہ السَّلام روزِ عرفہ\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA MUJEER\n");
            obj.put("urdu", "دعائے مجیر\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "DUA AL SABAH\n");
            obj.put("urdu", "دعائے صَباح حضرتْ امیرؑ\nٗ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);



        } catch (Exception e) {
        }


        for(int i=0;i<arr.length();i++)
        {
            try{arr.getJSONObject(i).put("id",i);}catch (Exception e){}
            try{
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





        recyclerViewAdapter = new RecyclerViewAdapter(DuaActivity.this, arr);
        recyclerView.setAdapter(recyclerViewAdapter);

          final   SearchView searchView = findViewById(R.id.search);
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
