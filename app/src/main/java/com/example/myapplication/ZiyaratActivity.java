package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myapplication.adapterZiyarat.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

public class ZiyaratActivity extends AppCompatActivity {
    public static final String MSG="com.example.myapplication.ZIYARAT_AHAD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziyarat);

        getSupportActionBar().setTitle("Ziyarat"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        final RecyclerView recyclerView=findViewById(R.id.recycle);
        Toast.makeText(ZiyaratActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();

        try{
            JSONObject obj = new JSONObject();
            obj.put("english", "ZIYARAT E WARITHA\n");
            obj.put("urdu", "زیارتِ وارثہ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH ON THE DAY OF ASHURA\n");
            obj.put("urdu", "زیارت عاشورا\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAT E AALE YASEEN\n");
            obj.put("urdu", "زیارت اٰلِ يٰسٓ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH AL JAMIAH AL SAGHEERAH\n");
            obj.put("urdu", " زیارت جامعہ صغيره\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH AL JAMIAH AL KABEERAH\n");
            obj.put("urdu", "زیارت جامعہ کبیرہ");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAT E NAHIYA\n");
            obj.put("urdu", " زيارة الناحية المقدسة\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM AL MAHDI (A.T.F.S.) ON FRIDAY\n");
            obj.put("urdu", "روز جمعہ زیارت امام زمانہ علیہ السلام");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAT AMEENULLAH\n");
            obj.put("urdu", "زیارت امین اللہ\n");

            arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "ZIYARAH ON THE DAY OF ARBAEEN; THE TWENTIETH OF SAFAR\n");
            obj.put("urdu", "زيارت اربعين");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM MEHDI (A) AFTER THE FAJR PRAYERS\n");
            obj.put("urdu", "زیراہ امام مہندی فجر نامز کے بعد\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "Ziyarat of Imam Mahdi Just Before Dawn\n");
            obj.put("urdu", "زیراہ امام مہندی  سبھا سے پہلے");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "VISITING THE GRAVES OF THE FAITHFUL BELIEVERS\n");
            obj.put("urdu", "زیارت قبور مومنین\n");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF PROPHET ON SATURDAYS\n");
            obj.put("urdu", "");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF AMIR AL MUMININ (A) ON SUNDAYS\n");
            obj.put("urdu", "روز جمعہ زیارت امام زمانہ علیہ السلام");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF LADY FATIMAH AL ZAHRA (S) ON SUNDAYS\n");
            obj.put("urdu", "");

            arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM AL HASAN(A) ON MONDAYS\n");
            obj.put("urdu", "");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM AL HUSAYN (A) ON MONDAYS\n");
            obj.put("urdu", "");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM ZAYN AL ABIDIN, IMAM MUHAMMAD AL BAQIR & IMAM JAFAR AL SADIQ (A) ON TUESDAY\n");
            obj.put("urdu", "");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);

            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM MUSA AL KAZIM, ALI AL RIDA, MUHAMMAD AL TAQI, ALI AL NAQI (A) ON WEDNESDAY\n");
            obj.put("urdu", "");

            //obj.put("tags","Tag of Jamkaran");
            // obj.put("details","It is Jamkaran");
            arr.put(obj);
            obj = new JSONObject();
            obj.put("english", "ZIYARAH OF IMAM HASAN AL ASKARI (A) ON THURSDAY\n");
            obj.put("urdu", "");

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





        final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(ZiyaratActivity.this, arr);
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
