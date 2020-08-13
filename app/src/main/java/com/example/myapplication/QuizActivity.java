package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myapplication.adapterQuiz.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setTitle("Quiz On Imam"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        final RecyclerView recyclerView=findViewById(R.id.recycle);
        //Toast.makeText(QuizActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        JSONArray arr=new JSONArray();
        JSONArray arr1=new JSONArray();

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        try{
            JSONObject obj=new JSONObject();
            obj.put("ques","1. IMAME ZAMANA (ATFS) KI WALEDA GIRAMI KE NARJIS KHATUN KE ALAWA JIN NAAMO \n" +
                    "KA TAZKERA HAI, WO BAYAN KARE ?");
            obj.put("ans","SHIQAL, REHANA, SOSAN");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","2. IMAM MAHDI (AS) EK LAKH CHOBIS HAZAR NABIYO ME SE KIS NABI KE HAMNAM HAI \n" +
                    "?");
            obj.put("ans","RASUL ALLAH (SAW) KE");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","3. MASHAHOOR AYATE QURANI JO IMAME ZAMANA (ATFS) KI HUKUMAT KE SILSILE ME \n" +
                    "PESH KI JATI HAI, WO KAUN SI HAI ?");
            obj.put("ans"," “WA NURIDO .… WA NAJALHUMUL WARESEEN” - SURA E KASAS AYAT NO. 5");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","4. IMAME ZAMANA (ATFS) KI KUNIYAT KYA HAI ?");
            obj.put("ans","ABUL QASIM");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","5. AHADIS ME IMAME ZAMANA (ATFS) KI JISMANI SAKHAT KIS QAUM KE MANIND ZIKR \n" +
                    "HUI HAI ?\n");
            obj.put("ans","BANI ISRAIL");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","6. NAMAZE JANAZA ME 5 TAKBEER HOTI HAI, KAUN SE DO AIMMA(AS) HAI JINKI \n" +
                    "NAMAZE JANAZA KE LIYE 7 TAKBEER WARID HUI HAI ?");
            obj.put("ans","IMAM ALI (AS) AUR IMAME ZAMANA (ATFS)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","7. IMAME ZAMANA (ATFS) JIS WAQT ZAAHIR HONGE TO WO DEKHNE ME KITNI UMR KE \n" +
                    "MEHSUS HONGE ?");
            obj.put("ans"," 40 SAAL KE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","8. RIWAYAAT ME ZAHOOR KE BAAD IMAME ZAMANA (ATFS) KA JEHAD KITNE MAH PAR \n" +
                    "MOHIT HOGA ?\n");
            obj.put("ans","8 MAAH MUSALSAL");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","9. IMAM MOHAMMAD TAQI (AS) NE ZAMANA E GAIBAT ME SHIO KE LIYE AFZAL TAREEN \n" +
                    "AMAL KAUN SA BATAYA HAI ?");
            obj.put("ans","INTEZARE ZAHOOR E IMAME ZAMANA (ATFS)");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","10. IMAM HASAN ASKARI (AS) KI SHADI BIBI NARJIS KHATUN KE SATH KIS IMAM KI \n" +
                    "KHWAHISH SE HUI ?");
            obj.put("ans","IMAM ALI NAQI (AS)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","11. BIBI NARJIS KHATUN KA EK LAQAB ‘ MALIKA ‘ KYU HAI ?\n");
            obj.put("ans","KYUNKI AAP MAIKA AUR SASURAL DONO KI TARAF SE MALIKA HAI, MAIKE \n" +
                    "KE ETBAR SE SHAHENSHAHE RUM KI DUKHTAR HAI AUR SASURAL KE LIHAZ SE \n" +
                    "RASULE KHUDA (SAW) SE LEKAR IMAM NAQI (AS) TAK 12 MASUM KI BAHU HAI \n" +
                    "AUR RUHE ZAMEEN KE TAJDAR KI MAA HAI");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","12. BIBI NARJIS KHATUN KA SILSILA E NASAB KIS NABI E KHUDA KE WALI SE JAA MILTA \n" +
                    "HAI ?");
            obj.put("ans"," WASI E HAZARAT ISA (AS), HAZRAT SHAMUN SE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","13. BIBI NARJIS KHATUN KA DASWE IMAM (AS) KE PAS AANE KA JO WAQEA EK KHAS \n" +
                    "SAHABI E IMAM (AS) JO ABU AYUB ANSARI KI AULAD ME SE THE NAQL HUWA HAI, IS \n" +
                    "SAHABI KA NAAM BATAYE ?");
            obj.put("ans","BASHEER IBNE SULEMAN");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","14. BASHEER IBNE SULEMAN KIS ILAAKE KE REHNE WALE THE ?\n");
            obj.put("ans","SAMARRA");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","15. IMAME ZAMANA (ATFS) KE BAZU PAR WILADAT KE WAQT KYA TAHREER THA ?\n");
            obj.put("ans"," “WA QUL JA’AL HAQ WA ZAHAQAL BATIL INNAL BATIL KA’ANA ZAHUQA” –\n" +
                    "SURAH BANI ISRAEL, AYAT 81");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","16. HAZRAT HUJJAT (ATFS) NE WILDAT KE BAAD APNI WALEDA KE DAMANE ISMAT ME KIS \n" +
                    "SURE KI TILAWAT KI ?");
            obj.put("ans","SURA E QADR");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("ques","17. TARIKH KI EK AUR AZEEM HASTI JO WILADAT SE BHI PEHLE APNI MAA SE KHITAB \n" +
                    "KARTI THI, INKA NAAM BATAYE?");
            obj.put("ans"," HAZRAT FATEMA ZAHRA (SA)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","18. HAZRAT IMAM HASAN ASKARI (AS) NE IMAME ZAMANA (ATFS) KI WILADAT KE BAAD \n" +
                    "KITNI MARTABA INKA AQIQA KIYA ?");
            obj.put("ans"," 300 MARTABA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","19. WO WAQEA BATAYE JAB PAYGAMBAR (SAW) LOGO KE SAMNE SE GUZRE LEKIN KISI \n" +
                    "KO NAZAR NA AA SAKE ?\n");
            obj.put("ans","WAQEA E SHABE HIJRAT");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","20. IMAM HASAN ASKARI (AS) KI SHAHADAT KE WAQT IMAME ZAMANA (ATFS) KI UMR \n" +
                    "KITNI THI ?");
            obj.put("ans","5 SAAL\n");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","21. IMAME ZAMANA (ATFS) EK MAUKE PAR LOGO KI KASEER TADAD KE SAMNE ZAHIR \n" +
                    "HUWE WO MASHAHOOR WAQEA KAUNSA THA ?");
            obj.put("ans"," IMAM HASAN ASKARI (AS) KI SHAHADAT PAR INKI NAMAZE JANAZA \n" +
                    "PADHANE KA WAQEA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","22. IMAME ZAMANA (ATFS) NE APNE CHACHA KO NAMAZE JANAZA PADHANE SE ROKTE \n" +
                    "WAQT KYA JUMLA ISTEMAL KIYA ?");
            obj.put("ans"," “CHACHA PICHHE HAT JAYE, APNE WALID PAR JANAZA PADHANE KA AAP KI \n" +
                    "NISBAT MAIN ZYADA HAQDAR HU”");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","23. GAIBATE KUBRA KA AAGAZ KIS SAN SE HUWA ?\n");
            obj.put("ans","329 HIJRI SE");
            arr.put(obj);

            obj=new JSONObject();


            obj.put("ques","24. IMAME ZAMANA (ATFS) KE CHARO NAEBEEN KO MAJMUAN KYA KAHA JATA HAI ?");
            obj.put("ans"," NAWWABE ARBA\n");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","25. GAIBATE SUGRA ME JIN JUTHE LOGO NE SIFARAT WA NIYABAT KA DAWA KIYA INME SE CHAND KE NAAM BATAYE ?\n");
            obj.put("ans","MANSOOR HALAJ, MOHAMMAD IBNE ALI SHULMAGANI, MOHAMMAD IBNE \n" +
                    "NASEER NAMRI");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques", "26.IMAME ZAMANA(ATFS)KI SAB SE PEHLE ZIYARAT KARNE WALI KHUSHNASEEB \n" +
                    "SHAKHSIYAT KA NAAM BATAYE.");
            obj.put("ans"," BIBI HAKIMA KHATUN");
            arr.put(obj);
            obj=new JSONObject();


            obj.put("ques","27. IMAM HASAN ASKARI (AS) KI EK KANEEZ BHI IMAME ZAMANA (ATFS) KI ZIYARAT SE \n" +
                    "MUSHARRAF HUI INKA NAAM KYA THA ?");
            obj.put("ans","NASEEM");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","28. IMAM ALI NAQI (AS) KE KIS SAHABI NE IMAME ZAMANA (ATFS) KE HATH AUR SAR KA \n" +
                    "BOSA LENE KA SHARAF HASEEL KIYA ?");
            obj.put("ans"," IBRAHEEM IBNE IDREES");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","29. IMAME ZAMANA (ATFS) SE MANSUB SARDAB YA TEKHANA KITNE AIMMA (AS) KI \n" +
                    "IBADATGAH RAHA HAI ?");
            obj.put("ans","TEEN AIMMA KI IMAM ALI NAQI (AS), IMAM HASAN ASKARI (AS), IMAME \n" +
                    "ZAMANA (ATFS))");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","30. GAIBATE KUBRA ME MARJAEEYAT KA AGAAZ KIS AALIME DEEN SE SHURU HUWA ?");
            obj.put("ans"," HASAN IBNE ALI IBNE AQEEL AMMANI");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","31. GAIBAT ME KHUD IMAME ZAMANA (ATFS) NE KIS AALIME DEEN KO 3 KHAT TEHREER \n" +
                    "FARMAYE ?");
            obj.put("ans","SHEKH MUFEED (AR)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","32. SHEKH MUFEED (AR) KO LIKHE GAYE KHAT ME IMAME ZAMANA (ATFS) NE KIS TARAH KE AAMAL KARNE KI TAAKEED KI HAI AUR KIN ALFAAZ ME KI HAI ?");
            obj.put("ans","AAP LOGO ME HAR EK KO SIRF WAHI AMAAL KARNE CHAHIYE JO AAPKO \n" +
                    "HAMARI MOHABBAT SE QAREEB KARE AUR HAR IS AMAL SE \n");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","33. MAULA ALI (AS) NE APNE EK KHUTBE ME IMAME ZAMANA (ATFS) KI BAHOT SI CHIZO \n" +
                    "KO AMBIYA (AS) SE MANSUB KIYA HAI, KYA AAP BATA SAKTE HAI KI WO KIS NABI E \n" +
                    "KHUDA KI QAMEEZ ZAIBE TAN KIYE HONGE AUR PAAV ME NAALAIN PAK KIS NABI E \n" +
                    "KHUDA KI HONGI ?");
            obj.put("ans","QAMEEZ – HAZRAT IBRAHEEM (AS) KI, NALAIN(JUTE) – HAZRAT SEES (AS)\n" +
                    "KE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","34. ZAHOORE IMAME ZAMANA (ATFS) KI ALAAMAT ME SURAJ AUR CHAND GRAHAN KIN TAARIKHO ME ISHARA KIYE GAYE HAI ?");
            obj.put("ans"," SURAJ GRAHAN – 15 RAMZAN, CHAND GRAHAN – 25 RAMZAN");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","35. ALAAMATE ZAHOOR ME KUCH PARCHAMO KI AAMAD KA TAZKERA HAI IN PARCHAMO \n" +
                    "KA RANG KAISA HAI ?");
            obj.put("ans","SIYAH (KAALA)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","36. ALAAMATE ZAHOOR ME KHURASAN KA TAZKERA MILTA HAI YE JAGAH MAUJUDA \n" +
                    "GEOGRAPHIA KE HISAB SE KAHA PAEE JATI HAI ?");
            obj.put("ans","YE JAGAH 3 MAMALIK ME FAILI HUWI HAI, RUSSIA-IRAN-AFGHANISTAN");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","37. IMAME SADIQ (AS) NE KAUNSI ALAMATE ZAHOOR KO HATMI KARAR DIYA HAI ?\n");
            obj.put("ans"," 5 ALAMATO KO 1,2 – YAMANI AUR SUFYANI KA KHURUJ\n" +
                    "3 - NIDA E ASMANI\n" +
                    "4 - WADI E BAIDA KA ZAMEEN ME DHAS JANA\n" +
                    "5 - NAFSE ZAKAIYYA KA QATL");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","38. NIDA E ASMANI KE LIYE KIS MAH, TARIKH AUR DEEN KA ZIKR RIWAYAT ME AYA HAI ?\n");
            obj.put("ans","23 RAMZAN, SHABE JUMA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","39. NIDA E ASMANI KE ALFAAZ KYA HONGE ?\n");
            obj.put("ans","YAQEEN KIJIYE KE HAQ ALI (AS) AUR SHIYANE ALI (AS) KE SATH HAI");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","40. NIDA E IBLEES KYA HONGI ?\n");
            obj.put("ans","HAQ SUFYANI AUR USKE CHAHNE WALO KE SATH HAI");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","41. BAHOT SI RIWAYAT ME SUFYANI KE NAAM KA ZIKR HUWA HAI WO BAYAN KARE.\n");
            obj.put("ans","  USMAAN BIN ATIBA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","42. SUFYANI KUCH MAKHSUS NAAM WALO KO QATL KAREGA WO NAAM KAUN KAUN SE \n" +
                    "HONGE ?");
            obj.put("ans","MOHAMMAD, ALI, FATEMA, HASAN, HUSAIN, JAFAR, MUSA, ZAYNAB, \n" +
                    "KHADIJA, RUKAYYA");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","43. NAFSE ZAKAIYYA KI SHAHADAT AUR IMAM (AS) KE ZAHUR ME KITNA FASALA HOGA ?\n");
            obj.put("ans","15 DEEN KA\n");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","44. RIWAYAT ME ASAHABE IMAM (AS) ME SINDH SE TA’ALUK RAKHNE WALI SHAKHSIYAT \n" +
                    "KA BHI ZIKR AAYA HAI INKA NAAM KYA BATAYA GAYA HAI ?");
            obj.put("ans","ABDUR RAHMAN");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","45. GAIBAT ME KAUNSI DUA KA PADHANA IS BAAT KA SABAB BANEGA KI KABRO SE \n" +
                    "BAWAQTE ZAHOOR UTHAYA JAYEGA ?");
            obj.put("ans"," DUA E AHAD");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","46. SAB SE PEHLE IMAME ZAMANA (ATFS) KE HATH PAR KAUN BAY’AT KAREGA ?\n");
            obj.put("ans","HAZRAT JIBRAEL (AS)");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("ques","47. JIBRAEL (AS) KE BAAD KAUN LOG IMAME ZAMANA (ATFS) KI BAY’AT KAREGE ?\n");
            obj.put("ans","IMAM (AS) KE 313 KHAS ASAHAB");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","48. KAM AZ KAM KITNA LASHKAR JAMA HONE KE BAAD IMAM (AS) MAKKA SE BAHAR \n" +
                    "NIKLEGE ?");
            obj.put("ans","KAM AZ KAM 10 HAZAR");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","49. IMAME ZAMANA (ATFS) KE PAS KAUN KAUN SE TABRRUKATE AMBIYA (AS) HOGE ?");
            obj.put("ans","  RASULE KUDA (SAW) KA PARCHAM,\n" +
                    "HAZRAT SULEMAN (AS) KI ANGUTHI,\n" +
                    "HAZRAT MUSA (AS) KA ASA AUR PATHTHAR,\n" +
                    "PAYGAMBARE ISLAM (SAW) KI KHUN AALUDA QAMEEZ JO JUNGE OHAD \n" +
                    "ME AAPNE PEHNI THI, AMAMA, ZIRA AUR TALWAR,\n" +
                    "HAZRAT YUSUF (AS) KI QAMEEZ");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","50. IMAME ZAMANA (ATFS) ZAHOOR KE BAAD ISLAAHAT JO MAKKA ME KAREGE INME SE \n" +
                    "KAM AZ KAM 4 BAYAN KARE.");
            obj.put("ans","SIRF WAJIB TAWAF KI LOGO KO HIDAYAT,\n" +
                    "KABA KE KHAAEN MUTAWALLI BANI SHAIBA KE LOGO KE HATH KATNA,\n" +
                    "MAKAME IBRAHEEM (AS) KA ISKI ASL JAGAH PE RAKHNA,\n" +
                    "MASJIDUL HARAM AUR KABA KO ISKI ASL HADBANDI TAK LE JANA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","51. KAUNSA SHAHAR IMAME ZAMANA (ATFS) KI HUKUMAT KA DARUL KHILAFA RAHEGA ?\n");
            obj.put("ans","KUFA");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","52. SUFYANI KO IMAME ZAMANA (ATFS) KIS JAGAH PAR SHIKST DEGE ?\n");
            obj.put("ans"," FILISTEEN ME");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","53.HAZRAT ISA(AS)KIS JAGAH NUZUL KARKE IMAME ZAMANA(ATFS)KE HATHO PAR BAY’AT KAREGE ?");
            obj.put("ans","  EK RIWAYAT KE MUTABIQ FILISTEEN KE ‘LUD’ NAAMI SHAHAR KE HAR \n" +
                    "DARWAZE PAR, DUSRI RIWAYAT ME DAMISHQ KA ZIKR HAI");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","54. DAJJAL KO KAUN QATL KAREGA ?\n");
            obj.put("ans","EK RIWAYAT KE MUTABIQ IMAME ZAMANA (ATFS) HAZRAT ISA (AS) KO \n" +
                    "DAJJAL KO QATL KARNE KA HUKM DEGE. ");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","55. IMAME ZAMANA (ATFS) YAHUDIO KO KYA CHIZ DIKHAKAR ISLAM PAR LAYEGE ?\n");
            obj.put("ans","GAIR MUNHARIF TAURET KE WO NUSKHE JO PAHADO ME DAFN HAI, NIKAL \n" +
                    "KAR DIKHAYEGE JIS SE TAMAM YAHUDI IMAAN LE AAYEGE.");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","56. WO KAUN HAI JINHONE IMAME ZAMANA (ATFS) KI ZIYARAT KE SHOQ ME 20 \n" +
                    "MARTABA HAJJ KIYA AUR BIL AAKHIR KAMYAB HO GAYA ?");
            obj.put("ans","ALI BIN MAHAZYAR AHWAZI");
            arr.put(obj);



            obj=new JSONObject();


            obj.put("ques","57. BIBI NARJIS KHATUN KAISARE RUM KI KYA THI ?\n");
            obj.put("ans"," NAWASI");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","58. IMAM HASAN ASKARI (AS) AUR BIBI NARJIS KHATUN KA KHUTBA E AQD KISNE \n" +
                    "PADHA ?");
            obj.put("ans","PAYGAMBARE AKRAM (SAW)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","59. IMAM ALI NAQI (AS) NE BIBI NARJIS KHATUN KO LANE KI ZIMMEDARI KISE SONPI \n" +
                    "THI ?");
            obj.put("ans","BASHEER IBNE SULEMAN KO");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","60. BASHEER IBNE SULEMAN RASULE KHUDA (SAW) KE KIS SAHABI KE NAWASE THE ?\n");
            obj.put("ans"," JANABE ABU AYUB ANSARI ");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","61. BIBI HAKIMA KHATUN KA IMAM NAQI (AS), IMAM JAWAD (AS) AUR IMAM HASAN \n" +
                    "ASKARI (AS) SE KYA RISHTA THA ?");
            obj.put("ans","IMAM NAQI (AS) KI BAHAN, IMAM JAWAD (AS) KI BETI AUR IMAM HASAN \n" +
                    "ASKARI (AS) KI FUFI THE.");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","62. IMAME ZAMANA (ATFS) NE WILADAT KE FAURAN BAAD QURANE KAREEM KI KAUNSI \n" +
                    "AYAT KI TILAWAT KI ?");
            obj.put("ans","SURA E QASAS KI AYAT NO. 5");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("ques","63. GAIBATE SUGRA KA QUL DAUR KITNA THA ?\n");
            obj.put("ans"," 74 SAAL");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","64. IMAME ZAMANA (ATFS) KI TARAF SE JO PAYGAM TAHRIRI TOR PAR AAYE UNHE KYA \n" +
                    "KAHTE HAI ?");
            obj.put("ans"," TAWQIA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","65. IMAME ZAMANA (ATFS) KI IQTEDA ME NAMAZ PADHNE WALO ME SAB SE PEHLI SAF \n" +
                    "KE NAMAZIYO ME KAUN KAUN SE AMBIYA SHAMIL HOGE ?");
            obj.put("ans","HAZRAT ISA (AS), HAZRAT KHIZR (AS) AUR HAZRAT ILYAS (AS)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","66. SUFYANI KISKI AUVLAD ME SE HOGA ?\n");
            obj.put("ans","SUFYANI YAZEED IBNE MAWIYA KI AUVLAD ME SE HOGA");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","67. SAIYED HASANI KA NASAB KAUN SE IMAM SE MILTA HOGA ?\n");
            obj.put("ans"," IMAM HASAN MUJTABA (AS)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","68. SAIYED HASANI KA TAALUK KAUNSE ILAAKE SE HOGA ?\n");
            obj.put("ans","IRAN KE SHAHAR QAZWEEN SE");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","69. IMAME ZAMANA (ATFS) KE HAQIQI INTEZAR KARNE WALO KA RUTBA KYA HAI ?\n");
            obj.put("ans"," AGAR KOI DIL KI GAHRAIYO KE SATH IMAME ZAMANA (ATFS) KE DIDAR KI \n" +
                    "TAMANNA RAKHTA HO AUR ISI TAMANNA KE SATH DUNIYA SE CHALA JAYE TO \n" +
                    "WO GOYA AISA HAI KI JAISE IMAM (AS) KE MUQADDAS KHAIME ME MAUJUD HAI \n" +
                    "AUR IMAM (AS) KE SATH RAAHE KHUDA ME SHAHEED HUWA HO.");
            arr.put(obj);


            obj=new JSONObject();

            obj.put("ques","70. KYA ASHABE QAHAF BHI NUSARATE IMAME ZAMANA (ATFS) KE LIYE AYEGE ?\n");
            obj.put("ans","JI HAA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","71. ZAMANA E GAIBAT ME IMAME ZAMANA (ATFS) KI TANHAEE KO KAUN DOOR KARTA \n" +
                    "HAI ?");
            obj.put("ans","HAZRAT KHIZR (AS)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques", "72. IMAME ZAMANA (ATFS) KI UMRE MUBARAK IS WAQT KITNI HAI ?\n");
            obj.put("ans","1185 SAAL");
            arr.put(obj);


            obj=new JSONObject();

            obj.put("ques","73. IMAME ZAMANA (ATFS) KIS DEEN ZAHOOR FARMAYEGE ?\n");
            obj.put("ans","ROZE ASHURA BA ROZE JUMA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","74. IMAME ZAMANA (ATFSS) KO 'QAYEM' KYU KAHA JATA HAI ?\n");
            obj.put("ans","IMAME ZAMANA (ATFS) IMAME HUSAIN (AS) KE QATILO SE INTEQAM LEGE \n" +
                    "AUR INKE KHILAF QAYAM KAREGE ISLIYE AAPKO QAYEM KAHA JATA HAI");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","75. KAUNSE AALIM IMAME ZAMANA (ATFS) KI DUA SE PAIDA HUWE ?");
            obj.put("ans"," SHEIKH SADUQ (AR)");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","76. KYA IMAM (AS) KE DAURE HUKUMAT ME ZARA E AMADO RAFT MASALAN SADKO \n" +
                    "WAGERA PAR KHAS TAWAJJO DI JAYEGI ?");
            obj.put("ans","JI HAA, AUR KISI RASTE ME MASJID BHI AAYEGI TO ISKA BHI KHAYAL NA \n" +
                    "KIYA JAYEGA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","77. MERAJ PAR KIN ALFAZ ME KHUDA NE IMAME ZAMANA (ATFS) KA TAZKERA KIYA ?");
            obj.put("ans","ALLAH (SWT) NE HUZURE AKRAM (SAW) SE FARMAYA ME IMAME QAYEM \n" +
                    "(AS) KE ZARIYE APNI ZAMEEN KO TASBEEH WA TAQDEES WA TAHLEEL WA \n" +
                    "TAKBEER SE AABAD KARUNGA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","78. KYA IMAME ZAMANA (ATFS) KO ASL NAAM SE YAAD KARNA MANA HAI ?");
            obj.put("ans","  JI HAA, RIWAYAT ME MANA KIYA GAYA HAI KI IMAME ZAMANA (ATFS) KO \n" +
                    "INKE ASLI NAAM (MEEM, HA, MEEM, DAAL) SE NA PUKARA JAYE, ALBATTA NAAM \n" +
                    "LENA HARAM NAHI HAI.");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","79. TAARIKHE ISLAM ME KHANDAANE ISMAT KI KHAWATEEN KO TALAB KARNE WALE \n" +
                    "HAAKEEM KAUN KAUN THE ?");
            obj.put("ans","YAZEED IBNE MAWIYA AUR MOATAMID IBNE MUTAWAKKIL");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","80. IMAME ZAMANA (ATFS) KA SANE WILADAT ISAVI AUR HIJRI CALENDAR KE ETBAR SE \n" +
                    "KYA HAI ?");
            obj.put("ans","ISAVI SAN 869, HIJRI SAN 255");
            arr.put(obj);

            obj=new JSONObject();
///Again Starting

            obj.put("ques","81. KYA IMAME ZAMANA (ATFS) KA KOI BAHAN YA BHAI HAI ?\n");
            obj.put("ans"," JI NAHI, AAP IMAME HASAN ASKARI (AS) KI PEHLI AUR AKHARI AUVLAD \n" +
                    "HAI");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("ques","82. KIS KITAB NE SAB SE PEHLE IMAME ZAMANA (ATFS) KI HUKUMAT KI BASHARAT DI ?\n");
            obj.put("ans","TAURET");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","83. IMAME ZAMANA (ATFS) KO QAYEM KA LAQAB KISNE DIYA ?\n");
            obj.put("ans"," IMAME ZAMANA (ATFS) KO YE LAQAB KHUDA NE DIYA. WAQAE MERAJ KI \n" +
                    "AHADIS ME PARWARDIGARE AALAM KI TARAF SE YE LAQAB ATA HUWA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","84. HAFTE KA KAUNSA DEEN IMAME ZAMANA (ATFS) SE MANSUB HAI ?\n");
            obj.put("ans","ROZE JUMA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","85. ZIYARATE NAHIYA KIS IMAM (AS) SE RIWAYAT HUYI HAI ?");
            obj.put("ans"," IMAME ZAMANA (ATFS) SE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","86. NAWWABE ARBA KI QABRE KAHA HAI ?\n");
            obj.put("ans","BAGHDAD (IRAQ) ME");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","87. KYA MAS'ALA E GAIBAT SIRF IMAME ZAMANA (ATFS) SE MANSUB HAI ?\n");
            obj.put("ans","JI NAHI, BALKI GUZISHTA AMBIYA (AS) ME BHI GAIBAT KE NAMUNE \n" +
                    "MAUJUD HAI");
            arr.put(obj);

            obj=new JSONObject();


            obj.put("ques","88. SAB SE PEHLE MAHDI HONE KA DAWA KISNE KIYA ?\n");
            obj.put("ans","BANI ABABS KE PEHLE KHALIFA SAFAH NE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","89. IMAME ZAMANA (ATFS) KI KOI HADIS BATAYE.\n");
            obj.put("ans","IMAME ZAMANA (ATFS) KA EK FARMAN HAI \"NAYE MASA'EL ME HAMARE \n" +
                    "ULUM KE HAMIL AFRAD SE RUJU KRO KYUNKI WO MERI TARAF SE TUM PAR \n" +
                    "HUJJAT HAI AUR ME KHUDA KI TARAF SE TUM PAR HUJJAT HU\" (KAMALUD DIN \n" +
                    "WA TAMAMUL NEAMAA - SHEIKH SADUQ AR)");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","90. IMAME ZAMANA (ATFS) KA NAAM KISNE RAKHA THA ?\n");
            obj.put("ans","RASULE AKRAM (SAW) NE");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","91. IMAME ZAMANA (ATFS) KI KITNI TAWQIAAT (KHAT) NAQL HUI HAI ?\n");
            obj.put("ans","80");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","92. IMAME ZAMANA (ATFS) KE ALQAAB KHUSUSAN \"AL QAYEM\" AUR \"QAYEME AALE \n" +
                    "MUHAMMAD\" SUNE TO HAME KYA KARNA CHAHIYE ?");
            obj.put("ans","BEHTAR HAI KI EHTERAM ME TAAZIMAN KHADE HO JAYE");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","93. ISAVI CALENDAR KE ETBAAR SE IMAME ZAMANA (ATFS) KI WILADAT KI TARIKH KYA \n" +
                    "HAI ?");
            obj.put("ans"," 29 JULY");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","94. SHAHADATE IMAM ASKARI (AS) KE WAQT HUKAMARAN KAUN THA ?\n");
            obj.put("ans","ABDUR RAHMAN");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","95. IMAME ZAMANA (ATFS) KI MAKHSUS NASHIHATGAHE KAUN KAUN SI HAI ?\n");
            obj.put("ans"," DUA E AHAD");
            arr.put(obj);


            obj=new JSONObject();
            obj.put("ques","96. KYA IMAME ZAMANA (ATFS) KO APNE ZAHOOR KA HATMI WAQT MAALUM HAI ?\n");
            obj.put("ans"," KHUDA AUR IMAME ZAMANA (ATFS) HI BEHTAR JANTE HAI.\n");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","97. IMAME ZAMANA (ATFS) KO KIS TARAH ZAHOOR KA ILM HOGA ?\n");
            obj.put("ans","IMAME ZAMANA (ATFS) KE PAS JO TALWAR AUR ALAM HAI WO GOYA HOGE \n" +
                    "KE AEY WALI E KHUDA QAYAM KARO AUR KHUDA KE DUSHMAN KO QATL KARO.");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("ques","98. ZAHOOR KE BAAD IMAME ZAMANA (ATFS) KA PEHLA JUMLA KYA HOGA ?");
            obj.put("ans","BAQIYATULLAHE KHAIRUL LAKUM, IN KUNTUM MOAMENEEN. (SURE HUD \n" +
                    "AYAT 86)");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","99. KYA IMAME ZAMANA (ATFS) GUZISHATA AASMANI KITABO KI BHI TILAWAT KAREGE?\n");
            obj.put("ans","JI HAA IMAME ZAMANA (ATFS) HAZRAT ADAM (AS), HAZARAT SIS (AS) KE \n" +
                    "SAHIFO KE SATH SATH TAURET, ZABUR, INJEEL AUR QURANE MAJEED KI BHI \n" +
                    "TILAWAT KAREGE.");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","100. SAIYEDE HASANI, IMAM (AS) SE KIN TABRRUKAT KE BARE ME PUCHHEGE ?\n");
            obj.put("ans"," RASULE KHUDA (SAW) KA AMAMA, ASA AUR LIBAS AUR MAULA ALI (AS) KE \n" +
                    "HATH JAMA KIYE HUWE QURAN KE BARE ME PUCHHEGE.");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","101. IMAME ZAMANA (ATFS) KE ASAHAB KIS TARAH APNI BHUKH AUR PYAAS MITAEGE ?\n");
            obj.put("ans","IMAME ZAMANA (ATFS) HAZRAT ISA (AS) KI ASA ZAMEEN PAR MARENGE TO \n" +
                    "12 CHASHME ZARI HO JAYENGE, IMAME ZAMANA (ATFS) KE ASAHAB US SE APNI \n" +
                    "BHUKH AUR PYAAS MITAEGE.");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","102. IMAME ZAMANA (ATFS) KE WAZIR KAUN KAUN HOGE, UNKE NAAM BATAYE ?\n");
            obj.put("ans"," HAZRAT ISA (AS), ASHABE QAHAF, HAZRAT USHEA (WASI E HAZRAT MUSA \n" +
                    "AS), SALMANE FARSI, MALIKE ASHTAR AUR MOAMEENE AALE FIRON");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","103. IMAME ZAMANA (ATFS) KI FAUZ KE SALAAR KAUN KAUN HOGE ?\n");
            obj.put("ans","SHOEB BIN SALEH, IMAM SADIQ (AS) KE FARZAND HAZRAT ISMAEEL, \n" +
                    "HAZRAT AQEEL AUR IMAM SADIQ (AS) KE SAHABI MUFAZZAL IBNE UMAR ");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","104. RIWAYAT ME IMAME ZAMANA (ATFS) KI MUDDATE HUKUMAT ZYADA SE ZYADA KITNI \n" +
                    "BAYAN HUI HAI ?");
            obj.put("ans","309 SAAL");
            arr.put(obj);

            obj=new JSONObject();


            obj.put("ques","105. 15 RAMZAN KO AANE WALI NIDA E ASMANI KO SUNNE KE FAURAN BAAD KAUNSA AMAL RASULE KHUDA (SAW) NE ADA KARNE KO BAYAN FARMAYA HAI ?\n");
            obj.put("ans", "                            APNE GHARO ME DAKHIL HO JAO, DARWAJO, KHIDKIO AUR SURAKHO KO\n" +
                    "                    BAND KARLO AUR KHUD KO CHHUPALO. APNE KAANO KO BAND KARLO AUR JAB\n" +
                    "                    TUM IS AWAZ KA EHSAS KARLO KI WO AWAZ AA GAYI HAI TO FAURAN SAJDO ME\n" +
                    "                    GIR PADO AUR YE ZIKR KARNA SHURU KARO : 'SUBHANAL QUDDUSO, RABBONAL  QUDDUSO'");
            arr.put(obj);
            obj=new JSONObject();


            obj.put("ques","106. KYA NIDA E ASMAANI KA ZIKR IMAME ZAMANA (ATFS) KI TAWQIYAT (KHATO) ME \n" +
                    "BHI MILTA HAI ?");
            obj.put("ans","JI HAAN");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","107. TAWQIYAT (KHATO) ME NIDA E ASMAANI KA ZIKR KIN ALFAZ ME MILTA HAI ?\n");
            obj.put("ans","IMAME ZAMANA (ATFS) NE FARMAYA KI : “ AGAH HO JAO KE JO BHI \n" +
                    "KHURUJE SUFYANI AUR NIDA E ASMAANI SE PEHLE MUJE SE MULAQAT KA DAWA \n" +
                    "KARE WO JUTHA HOGA”");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","108. NIDA E ASMAANI KI KHAS PEHCHAN KYA HOGI ?\n");
            obj.put("ans","NIDA E ASMAANI ME IMAME QAYEM (AS) AUR INKE WALID KA NAAM HOGA.");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","109. IMAME ZAMANA (ATFS) KA GUSL WA KAFAN KAUN SI AZEEM HASHTI KAREGI ?\n");
            obj.put("ans"," IMAME HUSAIN (AS) ");
            arr.put(obj);

            obj=new JSONObject();
            obj.put("ques","110. AAKHRI ZAMANE KI ALAMAAT KI RIWAYAAT ME KAUN SE SHAITAN KA ZIKR HAI JO \n" +
                    "AMARAAT KI CHHATO PAR BETHA HOGA ?");
            obj.put("ans"," RIWAYAT ME “ENTENA” KA ZIKR HAI ");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","111. AAKHARI ZAMANE KI RIWAYAAT ME KYA YE BHI MILTA HAI KI LOG AALATE MOSIQI \n" +
                    "(MUSIC) KO JAIB ME DAAL KARE GHUMA KARENGE ?");
            obj.put("ans"," JI HAA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","112. KYA IMAME ZAMANA (ATFS) HAR SAAL HAJ PAR ZARUR JATE HAI ?\n");
            obj.put("ans","JI HAA");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","113. NAFSE ZAKAIYYA KE KAUN KAUN SE RISHTEDARO KO BHI SHAHEED KIYA JAYEGA ?\n");
            obj.put("ans"," NAFSE ZAKAIYYA KE BHAI KO MADINA ME AUR BAHAN KO BHI INTEHAI \n" +
                    "MAZLUMANA ANDAZ ME SHAHEED KIYA JAYEGA");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","114. IMAME ZAMANA (ATFS) KO KAUN SHAHEED KAREGA ?\n");
            obj.put("ans"," KUCH ZAEEF RIWAYAAT ME MILTA HAI KI QABILA E BANI TAMEEM KI EK \n" +
                    "AURAT JISKA NAAM ‘SAEEDA’ HOGA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","115. AAKHARI ZAMAANE KI RIWAYAAT ME AURTO KE LIBAS KE BARE ME KYA KAHA GAYA \n" +
                    "HAI ?");
            obj.put("ans"," AURATE JISM CHHUPANE KE LIYE NAHI BALKE JISM ZAHIR KARNE KE LIYE \n" +
                    "KAPDE PEHNEGI");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","116. AAKHARI ZAMANE KI ALAAMAT AUR RIWAYAAT ME ‘KHAT WA KITABAT’ KE BARE ME \n" +
                    "KYA KAHA GAYA HAI ?");
            obj.put("ans","RIWAYAAT ME MILTA HAI KI KHAT WA KITABAT INSANI HATHELIO PAR KI JAYEGI\n");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","117. KYA AISE SHAKHS KO JUTHLAYA JAYE JO ZAHURE IMAM (AS) KA WAQT MOAYYAN \n" +
                    "KARE ?");
            obj.put("ans","JI HAA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","118. KYA JUNG KE BAAD SUFYANI KO ZINDA GIRAFTAR KIYA JAYEGA ?\n");
            obj.put("ans","JI HAA");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques","119. ASAHABE IMAM (AS) KIS WAQT SUFYANI KO GIRAFTAR KARKE INKE HUZUR PESH \n" +
                    "KAREGE ?");
            obj.put("ans"," IS WAQT IMAME ZAMANA (ATFS) NAMAZE ISHA PADH RAHE HOGE");
            arr.put(obj);


            obj=new JSONObject();

            obj.put("ques","120. KYA SUFYANI KE QATL KE BAAD TAMAM FITNE KHATM HO JAYEGE ?\n");
            obj.put("ans","JI HAA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","121. WADI E BAIDA KAHA WAQE’ HAI ?\n");
            obj.put("ans","MAKKA AUR MADINA KE DARMIYAN");
            arr.put(obj);
            obj=new JSONObject();
            obj.put("ques", "122. SUFYANI KA LASHKAR APNE TAMAM JUNGI SAAZ WA SAAMAN KE SATH KAUNSI \n" +
                    "ZAMEEN ME DHAS JAYEGA ?");
            obj.put("ans","WADI E BAIDA ME");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","123. WADI E BAIDA ME GARQ HUWE SUFYANI LASHKAR ME SE KITNE AFRAD BACHEGE ?\n");
            obj.put("ans","2…. EK IMAM (AS) KO KHABAR DEGA…. DUSRA SUFIYANI KO");
            arr.put(obj);

            obj=new JSONObject();


            obj.put("ques","124. ZAHOOR KE BAAD IMAME ZAMANA (ATFS) KA PEHLA HADAF KYA HOGA ?\n");
            obj.put("ans","QIBLA E AWWAL KI AZADI");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","125. KYA SUFYANI BAZAHIR MUSALMANO ME SE HOGA ?\n");
            obj.put("ans"," JI HAA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","126. KYA IMAME ZAMANA (ATFS) AAJ KAL BILKUL AKELE HAI ?\n");
            obj.put("ans","JI NAHI RIWAYAT ME MILTA HAI KI 130 AFRAAD KI JAMA’AT HAR WAQT \n" +
                    "IMAM (AS) KE SATH REHTI HAI");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","127. DAS HAZAR KA LASHKAR JAMA HO JANE KE BAAD IMAME ZAMANA (ATFS) MAKKA SE \n" +
                    "BAHAR NIKLEGE ?");
            obj.put("ans"," JI HAA");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","128. IMAME ZAMANA (ATFS) APNE MANANE WALO SE KIN KIN BAATO KA AHAD LEGE ?\n");
            obj.put("ans","1. GEEBAT NA KARNE KA\n" +
                    "2. ZARURAT SE ZYADA MAAL JAMA NA KARNE KA\n" +
                    "3. QANA’AT KARNE KA\n" +
                    "4. LAALACH NA KARNE KA\n" +
                    "5. SADA ZINDAGI GUZARNE KA\n" +
                    "6. KHUSHBU KE ISTEMAL KA \n" +
                    "7. NEKI KA HUKM DENE KA AUR BURAI SE ROKNE KA");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","129. IMAME ZAMANA (ATFS) KHUD APNE AAP SE KYA AHAD LEGE ?\n");
            obj.put("ans","1. JAISA LIBAS TUM PEHNOGE, ME BHI WAISA HI PAHENUGA\n" +
                    "2. JAISI ZINDAGI TUM GUZARTE HO, MAIN BHI AISI HI GUZARUGA\n" +
                    "3. JAISI SAWARI TUMHARE PAS HOGI, WAISI HI MERE PAS HOGI\n" +
                    "4. JISKA JAB JI CHAHE MUJSE RABETA KAR SAKTA HAI");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","130. HAZRAT ISA (AS) YAHUDIO AUR ISAIO KO QAEL KARTE WAQT KAUN SI AYAT \n" +
                    "PADHENGE ?");
            obj.put("ans","“WA INNA MIN EHLE KITABE……… SARIUL HESAB” ( SURE AALE IMRAN \n" +
                    "AYAT 199)\n" +
                    "“KOI EHLE KITAB AISA NA HOGA SIVAYE ISKE KE WO IMAAN LE AYEGE”");
            arr.put(obj);



            obj=new JSONObject();

            obj.put("ques","131. RIWAYAT ME NUZULE HAZRAT ISA (AS) KE WAQT INKA HULIYA MUBARAK KYA BAYAN \n" +
                    "KIYA GAYA HAI ?");
            obj.put("ans"," HAZRAT ISA (AS) HAZRAT IBRAHIM (AS) KI SHAKL KE MUSHABA HONGE, \n" +
                    "SHURKH LIBAS, KANGHI KI HUI HOGI, BALO ME PANI KE QATRAT HONGE");
            arr.put(obj);

            obj=new JSONObject();


            obj.put("ques","132. IMAME ZAMANA (ATFS) TAURET AUR INJEEL KE GAIR TAHREEF SHUDA NUSKHE KAHA \n" +
                    "SE NIKALENGE ?");
            obj.put("ans","INTAKIYA KE PAHADO SE");
            arr.put(obj);
            obj=new JSONObject();

            obj.put("ques","133. HAZRAT ISA (AS) ZAHOORE IMAME ZAMANA (ATFS) KE KITNE SAAL BAAD TAK ZINDA \n" +
                    "RAHENGE ?");
            obj.put("ans","ZAHOORE IMAME ZAMANA (ATFS) KE 40 SAAL BAAD TAK");
            arr.put(obj);

            obj=new JSONObject();

            obj.put("ques","134. HAZRAT ISA (AS) KI TAKFEEN KAUN KAREGA AUR KIS KAPDE KA KAFAN DIYA \n" +
                    "JAYEGA ?");
            obj.put("ans","HAZRAT ISA (AS) KI TAKFEEN IMAME ZAMANA (ATFS) KHUD KARENGE AUR \n" +
                    "UNHE US UNI KAPDE KA ");
            arr.put(obj);
            int len=arr.length();
            Log.d("myapp2",""+len);
            for(int i=0;i<len;i++)
            {
                Log.d("myapp2","fs"+i);

                String s1=arr.getJSONObject(i).getString("ques");
                String s2=arr.getJSONObject(i).getString("ans");
                String res1="",res2="";
                for(int j=0;j<s1.length();j++)
                {
                    if((s1.charAt(j)>='A' && s1.charAt(j)<='Z' )|| (s1.charAt(j)>='a' && s1.charAt(j)<='z')){
                        if(j==0 || s1.charAt(j-1)==' ')res1+=Character.toUpperCase(s1.charAt(j));
                        else res1+=Character.toLowerCase(s1.charAt(j));}
                    else res1+=s1.charAt(j);

                }
                for(int j=0;j<s2.length();j++) {
                    if ((s2.charAt(j) >= 'A' && s2.charAt(j) <= 'Z') || (s2.charAt(j) >= 'a' && s2.charAt(j) <= 'z')) {
                        if (j == 0 || s2.charAt(j - 1) == ' ')
                            res2 += Character.toUpperCase(s2.charAt(j));
                        else res2 += Character.toLowerCase(s2.charAt(j));
                    } else res2 += s2.charAt(j);
                }
                Log.d("myapp2",res1+" "+res2);
                JSONObject obj1=new JSONObject();
                obj1.put("ques",res1);
                obj1.put("ans",res2);

                arr.put(i,obj1);



            }


        }catch (Exception e){}

        String res = "";


Log.d("myapp1",res+arr.length());


        arr1=new JSONArray();
       try{
           for(int i=0;i<arr.length();i++)
           {
               arr1.put(arr1.getJSONObject(i));
           }
       }        catch (Exception e){}
        final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(QuizActivity.this, arr);
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
