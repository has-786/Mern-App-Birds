package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;

public class NamazAhadActivity extends AppCompatActivity {
    TextView t0,t1,t2,t3;
    String es0,es1,es2,es3,us0,us1,us2,us3;
    public static int id1;
    public static int pos;
    ArrayList<String> etitle=new ArrayList<>();
    ArrayList<String> edesc=new ArrayList<>();
    ArrayList<String> earab=new ArrayList<>();
    ArrayList<String> uarab=new ArrayList<>();

    ArrayList<String> etrans=new ArrayList<>();
    ArrayList<String> utitle=new ArrayList<>();
    ArrayList<String> udesc=new ArrayList<>();
    ArrayList<String> utrans=new ArrayList<>();
    ArrayList<Integer> id=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_ahad);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));


        Intent intent = getIntent();
        id1= Integer.parseInt(intent.getStringExtra(NamazActivity.MSG));


        es0="MERITS OF THE NAMAZ E SHAB\n";
        es1="The Holy Infallibles (a.s.) are reported to have said innumerable words about the merits of offering the Night Prayer; they have therefore described it as the honor of the true faithful believers. It brings about good health, erases the sins committed in days, saves from the loneliness in graves, beautifies the face, perfumes the body smell, and produces sustenance. Wealth and sons are the ornament of this worldly life, and to offer eight units of prayer at the last hours of night, in addition to a one-unit prayer, is the ornament of the Hereafter. These two ornaments may be granted together by Almighty Allah to some people. Other traditions have it that one who claims that he offers prayers regularly at night and still he suffers hunger is liar, because the night prayer guarantees the sustenance of the next day.\n" +
                "Imam al-Sadiq(a.s.) has reported that the Holy Prophet (s.a.w.a.) said to Imam Ali(a.s.), “O Ali! I shall give you some moralities that you should observe... Abide by the night prayer. Abide by the night prayer. Abide by the night prayer. Abide by the midday (zohr) prayer. Abide by the midday (zohr) prayer. Abide by the midday (zohr) prayer.”\n" +
                "It is apparently understood from this tradition that the night prayer stands for the thirteen units of prayer while the midday (zohr) prayer is the eight units of the supererogatory (mustahab / nafilah) noon prayer.\n" +
                "Anas ibn Malik has reported that he heard the Holy Prophet (s.a.w.a.) saying, “To offer two units of prayer in the midst of night is more favorable to me than possessing this world and whatever therein.”\n" +
                "When he was asked why those who practice the night worship had shining faces, Imam Ali ibn al-Husayn Zayn al-’Abidin (a.s.) answered, “As they withdrew themselves with their Lord, He granted them of His Light.”\n" +
                "In conclusion, traditions about the merits of offering the night prayer are very numerous. It is thus discommended to avoid the night acts of worship.\n" +
                "Shaykh has reported through an authentic chain of authority that Imam al-Sadiq(a.s.) said, “All servants (of Allah) wake up once, twice, or even more times at night. If a servant does not go for the night worship, Satan will open his legs and urinate in his ear. This is why those who do not do the night worship wake up in the morning heavy and lazy.”\n" +
                "Al-Barqi has reported through a valid chain of authority that Imam al-Baqir (a.s.) said, “There is a devil called al-Raha appointed for the night. When a servant (of Allah) intends to get up for the night prayer, this devil inspires to him that the time of prayer has not yet come. When the servant tries to get up again, the devil repeats the same evil inspiration and prevents the servant from offering the prayer until the day dawn (fajr)s. When it dawn (fajr)s, the devil urinates in the ear of that servant and goes back moving its tail in joy.”\n" +
                "Ibn Abi-Jumhur reported the Holy Prophet (s.a.w.a.) as saying to his companions, “When you go to sleep, Satan ties three knots at your head. Each knot inspires to you that the night is still long; therefore, you would better sleep. When you wake up and mention Almighty Allah, one knot is untied. When you do the ritual ablution, another knot is untied. When you perform the prayer, the third knot is untied. Hence, you will find yourselves active and positive in the morning; lest, you find yourselves inactive and frowning.”\n" +
                "This tradition is reported in Sunni books of hadith, too.\n" +
                "Al-Qutb al-Rawandi reported Imam AliAmeer al-Momineen(a.s.) as saying, “Do not expect three matters as long as you have been engaged in three: Do not expect ability to do night worship as long as you overeat. Do not expect bright-facedness as long as you spend the whole night sleeping. Do not expect security in your life as long as you accompany sinful people.”\n" +
                "Al-Qutb al-Rawandi has also reported that Prophet Jesus (a.s.) called his mother (a.s.) after her death and asked, “Mother, do you wish to return to life?” His mother answered, “Yes, I do, so that I will offer prayers to Almighty Allah in the midst of night and observe fasting in the extremely hot days. O son, this path is horrifying.”\n" +
                "\n" +
                "\n";
        es2="";
        es3="";
        us0="نیند سے بیدار ہو کر نماز شب کا بیان\n";
        us1="\n" +
                "یاد رہے کہ نماز شب کی فضیلت اور اس کے لئے رات کو نیند سے بیدار ہونے کے لئے ائمہ علیہم السلام سے بہت سی روایات وارد ہوئی ہیں جن میں یہ صراحت ہے کہ یہ مومن کا شرف ہے۔ اس نماز سے انسان صحت مند رہتا ہے اور یہ دن کے گناہوں کا کفارہ اور وحشتِ قبر کو دور کرنے کا ذریعہ ہے۔ چہرہ کو نورانی، بو کو اچھا بناتی ہے اور روزی میں اضافہ کرتی ہے اور جس طرح مال واولاد دنیاوی زندگی کی زینت ہیں اسی طرح آٹھ رکعت نماز شب نماز وتر کے ساتھ آخرت کی زینت ہیں۔ اور کبھی کبھی خداوند عالم ان دونوں کو جمع کر دیتا ہے اور جو شخص یہ کہے کہ وہ نماز شب پڑھتا ہے اور دن میں بھوکا رہتا ہے وہ جھوٹا ہے کیوں کہ نماز شب دن کے رزق کی ضامن ہے حضرت امام جعفر صادق علیہ السلام سے روایت ہے کہ رسولِؐ خدا نے حضرت علیؑ سے یہ روایت فرمائی کہ اے علیؑ میں تمہارے نفس کے بارے میں چند چیزوں کی وصیت کر رہا ہوں لہٰذا ان پر عمل کے ذریعہ انھیں محفوظ رکھنا۔\n" +
                "اس کے بعد فرمایا پروردگار ان کی مدد فرما۔ اس کے بعد چند چیزیں بیان کیں اور فرمایا وعلیک بصلوٰۃ اللیل۔ ظاہر یہ کہ حضرتؐ نے نماز شب سے ۱۳ رکعت نماز امراد لیٰ ہےاور نماز زوال سے مراد وہ آٹھ رکعت نافلہ جو زوال کے وقت پڑھی جاتی ہے مراد لیا ہے اور انس سے روایت ہے کہ میں نے سنا ہے کہ رسولؐ اکرم نے فرمایا کہ رات کے سناٹے میں دو رکعت نماز پڑھنا میرے نزدیک دنیا اور اس کی تمام چیزوں سے بہتر ہے اور روایت میں ہے کہ امام زین العابدینؑ سے سوال کیا گیا ہے کہ کیا وجہ ہے کہ جو لوگ نماز شب پڑھتے ہیں ان کے چہرےدوسروں سے زیادہ نورانی ہیں؟ فرمایا کہ لوگ اپنے پروردگار سے تنہائی میں راز ونیاز کی باتیں کرتے ہیں اور اسی بنا پر وہ انھیں اپنے نور کی چادر اوڑھا دیتا ہے اور اس بارے میں بے شمار روایات ہیں کہ رات کو اس نماز کے لئے نہ اٹھنا مکروہ ہے۔\n" +
                "اور شیخؒ نے صحیح سند کے ساتھ حضرت امام جعفر صادقؑ سے روایت کی ہے کہ آپؑ نے فرمایا کہ کوئی شخص ایسا نہیں ہے جو ہر را ت ایک یا چند مرتبہ بیدار نہ ہوتا ہو تو اٹھ گیا تو اٹھ ہی گیا اور اگر نہیں اٹھا تو شیطان اس کے کان میں پیشاب کر دیتا ہے۔ کیا تم نہیں دیکھتے ہو کہ جو شخص نمازِ شب کے لئے نہیں اٹھتا ہے جب صبح کو بیدار ہوتا ہے وہ دن اس کے لئے بہت گراں اور مشکل ہوتا ہے اور وہ سست رہتا ہے۔ اور شیخ برقیؒ نے امام محمد باقرؑ سے معتبر سند کے نماز شب پڑھتے ہیں ان کے چہرےدوسروں سے زیادہ نورانی ہیں؟ فرمایا کہ لوگ اپنے پروردگار سے تنہائی میں راز ونیاز کی باتیں کرتے ہیں اور اسی بنا پر وہ انھیں اپنے نور کی چادر اوڑھا دیتا ہے اور اس بارے میں بے شمار روایات ہیں کہ رات کو اس نماز کے لئے نہ اٹھنا مکروہ ہے۔ اور شیخؒ نے صحیح سند کے ساتھ حضرت امام جعفر صادقؑ سے روایت کی ہے کہ آپؑ نے فرمایا کہ کوئی شخص ایسا نہیں ہے جو ہر را ت ایک یا چند مرتبہ بیدار نہ ہوتا ہو تو اٹھ گیا تو اٹھ ہی گیا اور اگر نہیں اٹھا تو شیطان اس کے کان میں پیشاب کر دیتا ہے۔ کیا تم نہیں دیکھتے ہو کہ جو شخص نمازِ شب کے لئے نہیں اٹھتا ہے جب صبح کو بیدار ہوتا ہے وہ دن اس کے لئے بہت گراں اور مشکل ہوتا ہے اور وہ سست رہتا ہے۔\n" +
                "اور شیخ برقیؒ نے امام محمد باقرؑ سے معتبر سند کے ساتھ روایت کی ہے کہ آپؑ نے فرمایا کہ ایک شیطان ہے جس کا کام یہ ہے کہ جب کوئی بندہ نمازِ شب کے لئے اٹھنا چاہتا ہے تو وہ کہتا ہے کہ ابھی اٹھنے کا وقت نہیں ہوا ہے پھر جب دوسری بار بیدار ہوتا ہے اور اٹھنا چاہتا ہے تو کہتا ہے کہ ابھی وقت نہیں ہوا ہے اور اسی طرح اسے مسلسل اٹھنے سے روکتا رہتا ہے۔ یہاں تک کہ طلوع فجر کا وقت آ جاتا ہے تو اس کے کان میں پیشاب کر دیتا ہے اور اس کے حال پر چھوڑ دیتا ہے اور اپنی دُم کو ہلاتے ہوئے اپنے اوپرناز کرتا ہے۔ ابن ابی جمہور نے رسولؐ خدا سے نقل کیا ہے کہ آپؐ نے ایک دن اپنے اصحاب سے فرمایٍا کہ جب تم میں سے کوئی سوتا ہے تو شیطان اس کے سرہانے تین گرہیں باندھ دیتا ہے اور ہر گروہ پر لکھتا ہے علیک لیلٌ طویل فارتُد یعنی رات لمبی ہے آرام سے سو جاؤ۔ پھر جب انسان بیدار ہو کر ذکرِ خدا کرتا ہے تو اس کی ایک گرہ کھل جاتی ہے اور اگر وضو کر لیا تو دوسری بھی کھل جاتی ہے اور نماز پڑھ لی تو آخری گرہ بھی کھل جاتی ہے۔اور نماز پڑھ لی تو آخری گرہ بھی کھل جاتی ہے پھر جب صبح ہوتی ہے تو وہ با نشاط اور پاکیزہ نفس ہوتا ہے اور اگر بیدار نہ ہو تو خبیث النفس اور سست ہو جاتا ہے۔ واضح رہے کہ یہ روایت اہلسنت کی کتابوں میں بھی مذکور ہے اور قطب راوندی نے حضرت امیرالمومنینؑ سے روایت کی ہے کہ آپؑ نے فرمایا کہ تین چیزوں کے بعد تین چیزوں کی امید نہ کرو پیٹ بھر کے کھانے کے بعد رات میں جاگنے کی پوری رات سونے کے بعد چہرے کو نورانیت اور دنیا سے امان کی اور قطب رواندیؒ نے ہی روایت کی ہے کہ حضرت عیسیٰؑ نے جناب مریم کے انتقال کے بعد ان کو آواز دی اور کہا۔ اے والدۂ گرامی مجھ سے بات کیجئے۔کیا آپؑ دنیا میں واپس آنا چاہتی ہیں؟ کہا، ہاں تا کہ نماز پڑھوں خداوند عالم کے لئے انتہائی سرد راتوں میں اور گرم دنوں میں روزہ رکھوں اے میرے نورِ نظر یہ رات بہت دشوار ہے۔\n";
        us2="";
        us3="";


        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="NAMAZ E SHAB\n";
        es1="The following is an easy-to-do method of offering the Night Prayer that everyone can do:\n";
        es2="When you wake up at night, it is recommended to prostrate yourself before Almighty Allah. It is recommended that you say the following doxology (zikr) during or after the prostration:\n" +
                "اَلْحَمْدُلِلّٰهِ الَّذِىْ اَحْيَانِىْ بَعْدَ مَا اَمَاتَنِىْ وَ اِلَيْهِ النُّشُوْرُ اَلْحَمْدُ لِلّٰهِ الَّذِىْ رَدَّ عَلَىَّ رُوْحِىْ لِاَحْمَدَهُ وَاَعْبُدَهُ۔\n" +
                "When you get up and stand up, say the following supplication:\n" +
                "اَللّٰهُمَّ اَعِنِّىْ عَلٰى هَوْلِ الْمُطَّلَعِ وَ وَسِّعْ عَلَىَّ الْمَضْجَعَ وَارْزُقْنِىْ خَيْرَمَا بَعْدَ الْمَوْتِ۔\n" +
                "When you hear the sounds of roosters, say the following:\n" +
                "سُبُّوْحٌ قُدُّوْسٌ رَبُّ الْمَلَاۤئِكَةِ وَالرُّوْحِ سَبَقَتْ رَحْمَتُكَ غَضَبَكَ لَا اِلٰهَ اِلَّا اَنْتَ عَمِلْتُ سُوْءًا وَظَلَمْتُ نَفْسِىْ فَاغْفِرْلِىْ اِنَّهُ لَايَغْفِرُ الذُّنُوْبَ اِلَّا اَنْتَ فَتُبْ عَلَىَّ اِنَّكَ اَنْتَ التَّوَّابُ الرَّحِيْمُ۔\n" +
                "When you raise your sight towards the sky, say the following supplication:\n" +
                "اَللّٰهُمَّ اِنَّهُ لَايُوَارِىْ مِنْكَ لَيْلٌ سَاجٍ وَلَاسَمَاۤءٌ ذَاتُ اَبْرَاجٍ وَلَا اَرْضٌ ذَاتُ مِهَادٍ وَلَاظُلُمَاتٌ بَعْضُهَا فَوْقَ بَعْضٍ وَ لَابَحْرٌ لُجِّىٌّ تُدْلِجُ بَيْنَ يَدَىِ الْمُدْلِجِ مِنْ خَلْقِكَ تُدْلِجُ الرَّحْمَةَ عَلٰى مَنْ تَشَاۤءُ مِنْ خَلْقِكَ تَعْلَمُ خَاۤئِنَةَ الْاَعْيُنِ وَ مَا تُخْفِىْ الصُّدُوْرُ غَارَتِ النُّجُوْمُ وَنامَتِ الْعُيُوْنُ وَ اَنْتَ الْحَىُّ الْقَيُّوْمُ لَا تَاْخُذُكَ سِنَةٌ وَّلَانَوْمٌ سُبْحَانَ اللهِ رَبِّ الْعَالَمِيْنَ وَ اِلٰهِ الْمُرْسَلِيْنَ وَالْحَمْدُلِلّٰهِ رَبِّ الْعَالَمِيْنَ۔\n" +
                "After that, you may recite the following five Quranic verses from SurahAl-’Imran (No. 3):\n" +
                "اِنَّ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ وَاخْتِلَافِ اللَّيْلِ وَالنَّهَارِ لَاٰ يَاتٍ لِاُ وْلىِ الْاَلْبَابِ الَّذِيْنَ يَذْكُرُوْنَ اللهَ قِيَامًا وَ قُعُوْدًا وَ عَلٰى جُنُوْبِهِمْ وَ يَتَفَكَّرُوْنَ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلًا سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ رَبَّنَا اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهَ وَ مَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ رَبَّنَا اِنَّنَا سَمِعْنَا مُنَادِيًا يُنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا رَبَّنَا فَاغْفِرْ لَنَا ذُ نُوْبَنَا وَ كَفِّرْ عَنَّا سَيِّئَاۤتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَنَا عَلٰى رُسُلِكَ وَلَاتُخْزِنَا يَوْمَ الْقِيَامَةِ اِنَّكَ لَاتُخْلِفُ الْمِيْعَادَ۔\n" +
                "When you intend to take initiative to the night worship but you need to go to toilet, you may start with it. When you go out of toilet, cleanse your teeth with the traditional stick of Miswak. Afterward, you may perform the ritual ablution as completely as possible and then perfume and ready yourself for the Night Prayer.\n" +
                "THE TIME OF NAMAZ E SHAB\n" +
                "The time of the Night Prayer begins after midnight; yet, it is recommended to perform it as near as possible to dawn (fajr). However, when dawn (fajr) comes while one has still four units of the prayer to perform, one may recite only Surah al-Faatehah in the rest of the prayer.\n" +
                "The Night Prayer consists of eight units of prayer; each two alone. Taslim should be said at the end of each two units with the intention of offering the Night Prayer. It is advisable to repeat Surah al-Tawheed thirty times in each unit of the first couple after reciting Surah al-Faatehah.\n" +
                "By doing such, one’s all sins will be forgiven as soon as he finishes the prayer. It is also recommended to recite (after Surah al-Faatehah) Surah al-Tawheed in the first unit and Surah al-Kafirun in the second.\n" +
                "In the other units of the prayer, one may recite any Surah he chooses. However, it is sufficiently acceptable to recite Surah al-Faatehah and Surah al-Tawheed in each unit of the Night Prayer. It is also permissible to recite Surah al-Faatehah alone.\n" +
                "QUNUT\n" +
                "Like obligatory prayers, it is highly recommended to practice Qunut in the second unit of each couple of the units of supererogatory (mustahab / nafilah) prayers. At least, it is sufficient to repeat the following statement three times in Qunut:\n" +
                "سُبْحَانَ اللهِ۔\n" +
                "It is also sufficient to say this supplicatory prayer:\n" +
                "اَللّٰهُمَّ اغْفِرْ لَنَا وَارْحَمْنَا وَ عَافِنَا وَاعْفُ عَنَّا فِى الدُّنْيَا وَ الْاٰخِرَةِ اِنَّكَ عَلٰى كُلِّشَىْءٍ قَدِيْرٌ۔\n" +
                "or this supplicatory prayer:\n" +
                "رَبِّ اغْفِرْ وَارْحَمْ وَتَجَاوَزْ عَمَّا تَعْلَمُ اِنَّكَ اَنْتَ الْاَعَزُّ الْاَجَلُّ الْاَكْرَمُ۔\n" +
                "It is narrated that Imam Musa ibn Ja’far al-Kazim (a.s.) used to say the following supplicatory prayer in his night worship:\n" +
                "اَللّٰهُمَّ اِنَّكَ خَلَقْتَنِىْ سَوِيًّا۔۔۔\n" +
                "THE SHAF’ AND THE WITR PRAYER\n" +
                "When you accomplish the eight-unit Night Prayer, you may then offer the two-unit Shaf’ Prayer and the one-unit Witr Prayer. In these three units, you are advised to recite, after Surah al-Faatehah, Surah al-Tawheed once so that you may be considered as having recited the entire Qur’an. Narrations have confirmed that Surah al-Tawheed is equivalent to one-third of the Holy Qur’an.\n" +
                "You may also recite in the first unit of the Shaf’ Prayer Surah al-Nas (No. 114) and in the second Surah al-Falaq (No. 113).\n" +
                "When you accomplish the Shaf’ Prayer, you may say this supplicatory prayer:\n" +
                "اِلٰهِيْ تَعَرَّضَ لَكَ فِي هٰذَا اللَّيْلِ الْمُتَعَرِّضُوْنَ وَ قَصَدَكَ الْقَاصِدُوْنَ وَ اَمَّلَ فَضْلَكَ وَ مَعْرُوْفَكَ الطَّالِبُوْنَ وَ لَكَ فِيْ هٰذَا اللَّيْلِ نَفَحَاتٌ وَ جَوَاۤئِزُ وَ عَطَايَا وَ مَوَاهِبُ تَمُنُّ بِهَا عَلٰى مَنْ تَشَاۤءُ مِنْ عِبَادِكَ وَ تَمْنَعُهَا مَنْ لَمْ تَسْبِقْ لَهُ الْعِنَايَةُ مِنْكَ وَ هَاۤ اَنَا ذَا عُبَيْدُكَ الْفَقِيْرُ اِلَيْكَ الْمُؤَمِّلُ فَضْلَكَ وَ مَعْرُوْفَكَ فَاِنْ كُنْتَ يَا مَوْلَايَ تَفَضَّلْتَ فِيْ هٰذِهِ اللَّيْلَةِ عَلٰىۤ اَحَدٍ مِنْ خَلْقِكَ وَ عُدْتَ عَلَيْهِ بِعَاۤئِدَةٍ مِنْ عَطْفِكَ فَصَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ ۟اِلطَّيِّبِيْنَ الطَّاهِرِيْنَ الْخَيِّرِيْنَ الْفَاضِلِيْنَ وَ جُدْ عَلَيَّ بِطَوْلِكَ وَ مَعْرُوْفِكَ يَا رَبَّ الْعَالَمِيْنَ وَ صَلَّى اللّٰهُ عَلٰى مُحَمَّدٍ خَاتَمِ النَّبِيِّيْنَ وَ اٰلِهِ الطَّاهِرِيْنَ وَ سَلَّمَ تَسْلِيْمًا اِنَّ اللّٰهَ حَمِيْدٌ مَجِيْدٌ اَللّٰهُمَّ اِنِّيْۤ اَدْعُوْكَ كَمَاۤ اَمَرْتَ فَاسْتَجِبْ لِيْ كَمَا وَعَدْتَ اِنَّكَ لَا تُخْلِفُ الْمِيْعَادَ۔\n" +
                "This supplicatory prayer has been mentioned in the book of Mafatih al-Jinan within the recommended acts on the fifteenth night of Sha’ban.\n" +
                "Upon accomplishment of the Shaf’ Prayer, you may stand up for offering the Witr Prayer. After Surah al-Faatehah, you may recite Surah al-Tawheed once or three times alone or with Surah al-Falaq and Surah al-Nas.\n" +
                "You may then raise your hands for Qunut and implore Almighty Allah for anything you desire.\n" +
                "In the words of Shaykh al-Tusi, the supplications for Qunut are too numerous to be counted. Generally, there are not definite supplications to be said in Qunut, for it is permissible to say anything.\n" +
                "It is also recommended, during Qunut, to weep, or even try to weep, out of fear of Almighty Allah and fear of His chastisement. It is also desirable to pray Almighty Allah for the good of one’s brethren-in-faith, for narrations have confirmed that one who prays for the good of forty of his friends shall have all his prayers responded.\n" +
                "Shaykh al-Saduq, in his book of Man-La-Yahduruhul-Faqih, has recorded that the Holy Prophet (s.a.w.a.) used to say the following supplicatory prayer in the Witr Prayer:\n" +
                "اَللّٰهُمَّ اهْدِنِىْ فِيْمَنْ هَدَيْتَ وَ عَافِنِىْ فِيْمَنْ عَافَيْتَ وَ تَوَلَّنِىْ فِيْمَنْ تَوَلَّيْتَ وَ بَارِكْ لِىْ فِيْمَا اَعْطَيْتَ وَقِنِىْ شَرَّ مَا قَضَيْتَ فَاِنَّكَ تَقْضِىْ وَلَايُقْضٰى عَلَيْكَ سُبْحَانَكَ رَبَّ الْبَيْتِ اَسْتَغْفِرُكَ وَ اَتُوْبُ اِلَيْكَ وَ اُوْمِنُ بِكَ وَاَتَوَكَّلُ عَلَيْكَ وَلَاحَوْلَ وَلَاقُوَّةَ اِلَّا بِكَ يَا رَحِيْمُ۔\n" +
                "It is also highly advisable to repeat the following imploration seventy times and, meanwhile, raise the left hand for supplicating and count with the right hand:\n" +
                "اَسْتَغْفِرُاللهَ رَبِّىْ وَ اَتُوْبُ اِلَيْهِ۔\n" +
                "It is also narrated that the Holy Prophet (s.a.w.a.) used to implore for Almighty Allah’s forgiveness seventy times during the Witr Prayer and then say the following statement:\n" +
                "هٰذَا مَقامُ الْعَاۤئِذِ بِكَ مِنَ النَّارِ۔\n" +
                "It is also narrated that Imam Ali ibn al-Husayn Zayn al-’Abidin (a.s.) used to repeat the following word three hundred times during the Witr Prayer:\n" +
                "اَلْعَفْوَ اَلْعَفْوَ۔\n" +
                "After that, the Imam (a.s.) would say the following supplicatory prayer:\n" +
                "رَبِّ اغْفِرْلِىْ وَارْحَمْنِىْ وَ تُبْ عَلىَّ اِنَّكَ اَنْتَ التَّوَّابُ الْغَفُوْرُ الرَّحِيْمُ۔\n" +
                "It is highly advisable to extend your Qunut as long as possible. Thereafter, you go to the ritual genuflection (ruku') of the prayer and when you raise your head, you should say the following supplicatory prayer that Shaykh al-Tusi, in his book of Tahdhib al-Ahkam, reports from Imam Musa ibn Ja’far al-Kazim (a.s.):\n" +
                "هٰذَا مَقَامُ مَنْ حَسَنَاتُهُ نِعْمَةٌ مِنْكَ وَ شُكْرُهُ ضَعِيْفٌ وَ ذَنْبُهُ عَظِيْمٌ وَ لَيْسَ لِذٰلِكَ اِلَّا رِفْقُكَ وَ رَحْمَتُكَ فَاِنَّكَ قُلْتَ فِىْ كِتَابِكَ الْمُنْزَلِ عَلٰى نَبِيِّكَ الْمُرْسَلِ صَلَّى اللهُ عَلَيْهِ وَ اٰلِهٖ كَانُوْا قَلِيْلًا مِنَ اللَّيْلِ مَا يَهْجَعُوْنَ وَبِالْاَسْحَارِهُمْ يَسْتَغْفِرُوْنَ طَالَ هُجُوْعِىْ وَ قَلَّ قِيَامِىْ وَ هٰذَا السَّحَرُ وَ اَ نَا اَسْتَغْفِرُكَ لِذُنُوْبِىْ اِسْتِغْفَارَ مَنْ لَايَجِدُ لِنَفْسِهِ ضَرًّا وَلَا نَفْعًا وَلا مَوْتًا وَلَاحَيَاةً وَلَا نُشُوْرًا۔\n" +
                "You may then prostrate yourself and accomplish the prayer. After the accomplishment, you may say Tasbih al-Zahra’. After that, you may say the following doxology (zikr):\n" +
                "اَلْحَمْدُ لِرَبِّ الصَّبَاحِ الْحَمْدُ لِفَالِقِ الْاِصْبَاحِ۔\n" +
                "You may then repeat the following doxology (zikr) three times:\n" +
                "سُبْحَانَ رَبِّىَ الْمَلِكِ الْقُدُّوْسِ الْعَزِيْزِ الْحَكِيْمِ۔\n" +
                "You may then say the following supplicatory prayer:\n" +
                "يَا حَىُّ يَا قَيُّوْمُ،يَا بَرُّ يَا رَحِيْمُ يَا غَنِىُّ يَا كَرِيْمُ اُرْزُقْنِىْ مِنَ التِّجَارَةِ اَعْظَمَهَا فَضْلًا وَ اَوْ سَعَهَا رِزْقًا وَ خَيْرَهَا لِىْ عَاقِبَةً فَاِنَّهُ لَا خَيْرَ فِيْمَا لَا عَاقِبَةَ لَهُ۔\n" +
                "It is also highly advisable to say the following supplicatory prayer, which is called Dua al-Hazin (The Supplication of the Sad):\n" +
                "اُنَاجِیْكَ یَا مَوْجُوْدً فِی كُلِّ مَكَانٍ لَعَلَّكَ تَسْمَعُ نِدَاۤئِی فَقَدْ عَظُمَ جُرْمِیْ وَ قَلَّ حَیَاۤئِی یَا مَوْلَایَ اَیَّ الْاَهْوَالِ اَتَذَكَّرُ وَ اَیَّهَا اَنْسٰی وَ لَوْ لَمْ یَكُنْ اِلَّا الْمَوْتُ لَكَفٰی كَیْفَ وَ مَا بَعْدَ الْمَوْتِ اَعْظَمُ وَ اَدْهٰی مَوْلَایَ یَا مَوْلَایَ حَتّٰی مَتٰی وَ اِلٰی مَتٰی اَقُوْلُ لَكَ الْعُتْبٰی مَرَّةً بَعْدَ اُخْرٰی ثُمَّ لَا تَجِدُ عِنْدِیْ صِدْقًا وَ لَا وَفَاۤءً فَیَا غَوْثَاهُ ثُمَّ وَا غَوْثَاهُ بِكَ یَاۤ اَللهُ مِنْ هَوًی قَدْ غَلَبَنِیْ وَ مِنْ عَدُوٍّ قَدِ اسْتَكْلَبَ عَلَیَّ وَ مِنْ دُنْیَا قَدْ تَزَیَّنَتْ لِیْ وَ مِنْ نَفْسِ اَمَّارَةٍ بِالسُّوْۤءِ اِلَّا مَا رَحِمَ رَبِّیْ مَوْلَایَ یَا مَوْلَایَ اِنْ كُنْتَ رَحِمْتَ مِثْلِیْ فَارْحَمْنِیْ وَ اِنْ كُنْتَ قَبِلْتَ مِثْلِیْ فَاقْبَلْنِیْ یَا قَابِلَ السَّحَرَةِ اقْبَلْنِیْ یَا مَنْ لَمْ اَزَلْ اَتَعَرَّفُ مِنْهُ الْحُسْنٰی یَا مَنْ یُغَذِّیْنِیْ بِالنِّعَمِ صَبَاحًا وَ مَسَاۤءً اِرْحَمْنِیْ یَوْمَ اٰتِیْكَ فَرْدًا شَاخِصًا اِلَیْكَ بَصَرِیْ مُقَلَّدًا عَمَلِیْ قَدْ تَبَرَّاَ جَمِیْعُ الْخَلْقِ مِنِّیْ نَعَمْ وَ اَبِیْ وَ اُمِّیْ وَ مَنْ كَانَ لَهُ كَدِّیْ وَ سَعْیِیْ فَاِنْ لَمْ تَرْحَمْنِیْ فَمَنْ یَرْحَمُنِیْ وَ مَنْ یُؤْنِسُ فِی الْقَبْرِ وَحْشَتِیْ وَ مَنْ یُنْطِقُ لِسَانِیْ اِذَا خَلَوْتُ بِعَمَلِیْ وَ سَاَلْتَنِیْ عَمَّاۤ اَنْتَ اَعْلَمُ بِهِ مِنِّیْ فَاِنْ قُلْتُ نَعَمْ فَاَیْنَ الْمَهْرَبُ مِنْ عَدْلِكَ وَ اِنْ قُلْتُ لَمْ اَفْعَلْ قُلْتَ اَ لَمْ اَكُنِ الشَّاهِدَ عَلَیْكَ فَعَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ سَرَابِیْلِ الْقَطِرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ جَهَنَّمَ وَ النِّیْرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ اَنْ تُغَلَّ الْاَیْدِیْ اِلَی الْاَعْنَاقِ یَاۤ اَرْحَمَ الرَّاحِمِیْنَ وَ خَیْرَ الْغَافِرِیْنَ۔\n" +
                "This supplicatory prayer will be mentioned in the appendixes of Mafatih al-Jinan.\n" +
                "You may then prostrate yourself and repeat the following doxology (zikr) five times:\n" +
                "سُبُّوْحٌ قُدُّوْسٌ،رَبُّ الْمَلَاۤئِكَةِ وَ الرُّوْحِ۔\n" +
                "You may then sit and recite Ayah al-Kursi after which you may return to the prostration position and repeat the aforesaid doxology (zikr) five times again.\n";
        es3="When you wake up at night, it is recommended to prostrate yourself before Almighty Allah. It is recommended that you say the following during or after the prostration:\n" +
                "\n" +
                "All Praise be to Allah Who returned me to life after He had caused me to die, and to Him will be the Resurrection. All praise be to Allah Who gave me back my soul so that I will praise and worship Him.\n" +
                "\n" +
                "When you get up and stand up, say the following supplication:\n" +
                "\n" +
                "O Allah, help me pass the terror of the Resurrection Day, expand my burial place, and grant me all the good of the post-death stage.\n" +
                "\n" +
                "When you hear the sounds of roosters, say the following:\n" +
                "\n" +
                "Glorified and Sacred be You; Lord of the angels and the Holy Spirit. Your mercy has preceded Your wrath. There is no god save You. I have committed wrongdoings and wronged myself; so, forgive me, for none forgives sins save You; and accept my repentance, for You are the Oft-Returning, the All-merciful.\n" +
                "\n" +
                "When you raise your sight towards the sky, say the following supplication:\n" +
                "\n" +
                "O Allah, verily no still night, no sky displaying the zodiacal signs, no widely expansive land, no depths of darkness one above another, and no vast abysmal ocean that You cause to cover any of Your beings that You wish - none of all these can ever hide itself or anyone from You. You cover any of Your beings that You wish with mercy. You know the stealthy looks and that which the breasts conceal. All stars sink and all eyes sleep; but You are the Ever-living, the Self-Subsistent. Neither slumber nor sleep may ever overcome You. Glory be to Allah, the Lord of the worlds and the God of the Messengers. All praise be to Allah, the Lord of the Worlds.\n" +
                "\n" +
                "After that, you may recite the following five Quranic verses from Surah Al-'Imran (No. 3):\n" +
                "\n" +
                "Lo! In the creation of the heavens and the earth and in the difference of night and day are tokens for men of understanding. Such as remember Allah, standing, sitting, and reclining, and consider the creation of the heavens and the earth: Our Lord! You created not this in vain. Glory be to You! Preserve us from the doom of Fire. Our Lord! Whom You cause to enter the Fire: him indeed You have confounded. For evildoers, there will be no helpers. Our Lord! Lo! We have heard a crier calling unto Faith: \"Believe in your Lord!\" So we believed. Our Lord! Therefore forgive us our sins, and remit from us our evil deeds, and make us die the death of the righteous. Our Lord! And give us that which You have promised to us by Your messengers. Confound us not upon the Day of Resurrection. Lo! You break not the tryst.\n" +
                "\n" +
                "When you intend to take initiative to the night worship but you need to go to toilet, you may start with it. When you go out of toilet, cleanse your teeth with the traditional stick of Miswak. Afterward, you may perform the ritual ablution as completely as possible and then perfume and ready yourself for the Night Prayer.\n" +
                "\n" +
                "THE TIME OF THE NIGHT PRAYER\n" +
                "\n" +
                "The time of the Night Prayer begins after midnight; yet, it is recommended to perform it as near as possible to dawn. However, when dawn comes while one has still four units of the prayer to perform, one may recite only Surah al-Faatehah in the rest of the prayer.\n" +
                "\n" +
                "The Night Prayer consists of eight units of prayer; each two alone. Taslim should be said at the end of each two units with the intention of offering the Night Prayer. It is advisable to repeat Surah al-Tawheed thirty times in each unit of the first couple after reciting Surah al-Faatehah.\n" +
                "\n" +
                "By doing such, one's all sins will be forgiven as soon as he finishes the prayer. It is also recommended to recite (after Surah al-Faatehah) Surah al-Tawheed in the first unit and Surah al-Kafirun in the second.\n" +
                "\n" +
                "In the other units of the prayer, one may recite any Surah he chooses. However, it is sufficiently acceptable to recite Surah al-Faatehah and Surah al-Tawheed in each unit of the Night Prayer. It is also permissible to recite Surah al-Faatehah alone.\n" +
                "\n" +
                "QUNUT\n" +
                "\n" +
                "Like obligatory prayers, it is highly recommended to practice Qunut in the second unit of each couple of the units of supererogatory prayers. At least, it is sufficient to repeat the following statement three times in Qunut:\n" +
                "\n" +
                "All glory be to Allah\n" +
                "\n" +
                "It is also sufficient to say this supplicatory prayer:\n" +
                "\n" +
                "O Allah, (please) forgive us, have mercy on us, grant us good health, and pardon us in this world as well as the world to come. You verily have power over all things.\n" +
                "\n" +
                "or this supplicatory prayer:\n" +
                "\n" +
                "O my Lord, forgive (me), have mercy (on me), and overlook that which You know for You are the All-glorious, the All-magnificent, and the All-generous.\n" +
                "\n" +
                "It is narrated that Imam Musa ibn Ja'far al-Kazim (a.s.) used to say the following supplicatory prayer in his night worship:\n" +
                "\n" +
                "O Allah, You created me without fault, nurtured me when small...\n" +
                "\n" +
                "THE SHAF' AND THE WITR PRAYERS\n" +
                "\n" +
                "When you accomplish the eight-unit Night Prayer, you may then offer the two-unit Shaf' Prayer and the one-unit Witr Prayer. In these three units, you are advised to recite, after Surah al-Faatehah, Surah al-Tawheed once so that you may be considered as having recited the entire Qur'an. Narrations have confirmed that Surah al-Tawheed is equivalent to one-third of the Holy Qur'an.\n" +
                "\n" +
                "You may also recite in the first unit of the Shaf' Prayer Surah al-Nas (No. 114) and in the second Surah al-Falaq (No. 113).\n" +
                "\n" +
                "When you accomplish the Shaf' Prayer, you may say this supplicatory prayer:\n" +
                "\n" +
                "O Allah! Tonight, the seekers of favors, restless and eager, present themselves to You, the determined aspirers have You in mind...\n" +
                "\n" +
                "This supplicatory prayer has been mentioned in the book of Mafatih al-Jinan within the recommended acts on the fifteenth night of Sha'ban.\n" +
                "\n" +
                "Upon accomplishment of the Shaf' Prayer, you may stand up for offering the Witr Prayer. After Surah al-Faatehah, you may recite Surah al-Tawheed once or three times alone or with Surah al-Falaq and Surah al-Nas.\n" +
                "\n" +
                "You may then raise your hands for Qunut and implore Almighty Allah for anything you desire.\n" +
                "\n" +
                "In the words of Shaykh al-Tusi, the supplications for Qunut are too numerous to be counted. Generally, there are not definite supplications to be said in Qunut, for it is permissible to say anything.\n" +
                "\n" +
                "It is also recommended, during Qunut, to weep, or even try to weep, out of fear of Almighty Allah and fear of His chastisement. It is also desirable to pray Almighty Allah for the good of one's brethren-in-faith, for narrations have confirmed that one who prays for the good of forty of his friends shall have all his prayers responded.\n" +
                "\n" +
                "Shaykh al-Saduq, in his book of Man-La-Yahduruhul-Faqih, has recorded that the Holy Prophet (s.a.w.a.) used to say the following supplicatory prayer in the Witr Prayer:\n" +
                "\n" +
                "O Allah, (please) include me with those whom You have guided (to the right), include me with those whom You have granted good health, include me with those for whom You have cared, bless things that You have conferred upon me, and save me from the evil of what You have decided, for You decree and no one decrees against Your decree. All glory be to You, O Lord of the House. I implore for Your forgiveness, I repent before You, I have full faith in You, and I rely upon You totally. There in neither power nor might save with You, O All-merciful.\n" +
                "\n" +
                "It is also highly advisable to repeat the following imploration seventy times and, meanwhile, raise the left hand for supplicating and count with the right hand:\n" +
                "\n" +
                "I implore Allah, my Lord, for forgiveness and I repent to Him.\n" +
                "\n" +
                "It is also narrated that the Holy Prophet (s.a.w.a.) used to implore for Almighty Allah's forgiveness seventy times during the Witr Prayer and then say the following statement:\n" +
                "\n" +
                "This is the situation of one who prays Your protection against Hellfire.\n" +
                "\n" +
                "It is also narrated that Imam Ali ibn al-Husayn Zayn al-'Abidin (a.s.) used to repeat the following word three hundred times during the Witr Prayer:\n" +
                "\n" +
                "Pardon, Pardon.\n" +
                "\n" +
                "After that, the Imam (a.s.) would say the following supplicatory prayer:\n" +
                "\n" +
                "O my Lord, (please) forgive me, have mercy upon me, and accept my repentance, for You are surely the Oft-Returning, the All-forgiving, and the All-merciful.\n" +
                "\n" +
                "It is highly advisable to extend your Qunut as long as possible. Thereafter, you go to the ritual genuflection of the prayer and when you raise your head, you should say the following supplicatory prayer that Shaykh al-Tusi, in his book of Tahdhib al-Ahkam, reports from Imam Musa ibn Ja'far al-Kazim (a.s.):\n" +
                "\n" +
                "This is the situation of one whose good deeds are Your graces, whose thanksgiving is little, and whose sin is great; and nothing can settle all that except Your lenience and mercy for You have said in Your Book that is revealed to Your sent Prophet, peace be upon him and his Household: \"They were in the habit of sleeping but little by night; and in the hour of early dawn, they were found praying for forgiveness.\" Nevertheless, too much has been my sleep by night and too little has been my praying. This is the last hour of night and here I am imploring You to forgive my sins the imploration of one who cannot make for himself harm, benefit, death, life, or resurrection.\n" +
                "\n" +
                "You may then prostrate yourself and accomplish the prayer. After the accomplishment, you may say Tasbih al-Zahra'. After that, you may say the following:\n" +
                "\n" +
                "All praise be to the Lord of morning. All praise be to the Cleaver of daybreak.\n" +
                "\n" +
                "You may then repeat the following three times:\n" +
                "\n" +
                "All glory be to my Lord, the King, the All-holy, the All-mighty, the All-wise.\n" +
                "\n" +
                "You may then say the following supplicatory prayer:\n" +
                "\n" +
                "O Ever-living! O Self-Subsistent! O Benign! O All-merciful! O Self-Sufficient! O All-generous! (Please) provide me commerce that is greatest in profit, most expansive in sustenance, and most profitable in end result, because any thing that lacks good end is worthless.\n" +
                "\n" +
                "It is also highly advisable to say the following supplicatory prayer, which is called Dua e Hazeen (The Supplication of the Sad):\n" +
                "\n" +
                "I am calling at You, O He Who is Existent everywhere...\n" +
                "\n" +
                "You may then prostrate yourself and repeat the following five times:\n" +
                "\n" +
                "Glorified and Sacred be You; Lord of the angels and the Holy Spirit.\n" +
                "\n" +
                "You may then sit and recite Ayah al-Kursi after which you may return to the prostration position and repeat the aforesaid five times again.\n" +
                "\n" +
                "\n";
        us0="نمازِ شب کا طریقہ\n";
        us1="سب سے آسان طریقہ جس کو ہر شخص انجام دے سکتا ہے یہ ہے کہ جب سو کر اٹھے تو خداوند عالم کے لئے سجدہ کرے اور بہتر ہے کہ اسی حالت میں یا سجدہ سے سر اٹھاتے ہوئے یہ کہے:۔\n";
        us2="\n" +
                "اَلْحَمْدُلِلّٰهِ الَّذِىْ اَحْيَانِىْ بَعْدَ مَا اَمَاتَنِىْ وَ اِلَيْهِ النُّشُوْرُ اَلْحَمْدُ لِلّٰهِ الَّذِىْ رَدَّ عَلَىَّ رُوْحِىْ لِاَحْمَدَهُ وَاَعْبُدَهُ۔\n" +
                "اور جب کھڑے ہو جائے تو کہے۔\n" +
                "اَللّٰهُمَّ اَعِنِّىْ عَلٰى هَوْلِ الْمُطَّلَعِ وَ وَسِّعْ عَلَىَّ الْمَضْجَعَ وَارْزُقْنِىْ خَيْرَمَا بَعْدَ الْمَوْتِ۔\n" +
                "اور جب مرغ کی آواز سنے تو کہے۔\n" +
                "سُبُّوْحٌ قُدُّوْسٌ رَبُّ الْمَلَاۤئِكَةِ وَالرُّوْحِ سَبَقَتْ رَحْمَتُكَ غَضَبَكَ لَا اِلٰهَ اِلَّا اَنْتَ عَمِلْتُ سُوْءًا وَظَلَمْتُ نَفْسِىْ فَاغْفِرْلِىْ اِنَّهُ لَايَغْفِرُ الذُّنُوْبَ اِلَّا اَنْتَ فَتُبْ عَلَىَّ اِنَّكَ اَنْتَ التَّوَّابُ الرَّحِيْمُ۔\n" +
                "اور جب آسمان پر ڈالے یہ کہے۔\n" +
                "اَللّٰهُمَّ اِنَّهُ لَايُوَارِىْ مِنْكَ لَيْلٌ سَاجٍ وَلَاسَمَاۤءٌ ذَاتُ اَبْرَاجٍ وَلَا اَرْضٌ ذَاتُ مِهَادٍ وَلَاظُلُمَاتٌ بَعْضُهَا فَوْقَ بَعْضٍ وَ لَابَحْرٌ لُجِّىٌّ تُدْلِجُ بَيْنَ يَدَىِ الْمُدْلِجِ مِنْ خَلْقِكَ تُدْلِجُ الرَّحْمَةَ عَلٰى مَنْ تَشَاۤءُ مِنْ خَلْقِكَ تَعْلَمُ خَاۤئِنَةَ الْاَعْيُنِ وَ مَا تُخْفِىْ الصُّدُوْرُ غَارَتِ النُّجُوْمُ وَنامَتِ الْعُيُوْنُ وَ اَنْتَ الْحَىُّ الْقَيُّوْمُ لَا تَاْخُذُكَ سِنَةٌ وَّلَانَوْمٌ سُبْحَانَ اللہِ رَبِّ الْعَالَمِيْنَ وَ اِلٰهِ الْمُرْسَلِيْنَ وَالْحَمْدُلِلّٰهِ رَبِّ الْعَالَمِيْنَ۔\n" +
                "اس کے بعد آلِ عمران کی پانچ آیتیں پڑھے۔\n" +
                "اِنَّ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ وَاخْتِلَافِ اللَّيْلِ وَالنَّهَارِ لَاٰ يَاتٍ لِاُ وْلىِ الْاَلْبَابِ الَّذِيْنَ يَذْكُرُوْنَ اللهَ قِيَامًا وَ قُعُوْدًا وَ عَلٰى جُنُوْبِهِمْ وَ يَتَفَكَّرُوْنَ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلًا سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ رَبَّنَا اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهَ وَ مَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ رَبَّنَا اِنَّنَا سَمِعْنَا مُنَادِيًا يُنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا رَبَّنَا فَاغْفِرْ لَنَا ذُ نُوْبَنَا وَ كَفِّرْ عَنَّا سَيِّئَاۤتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَنَا عَلٰى رُسُلِكَ وَلَاتُخْزِنَا يَوْمَ الْقِيَامَةِ اِنَّكَ لَاتُخْلِفُ الْمِيْعَادَ۔\n" +
                "پھر جب نماز پڑھنا چاہے اور بیت الخلاء جانے کی ضرورت محسوس ہو تو پہلے اس سے فارغ ہو جائے۔ پھر بیت الخلاء سے باہر آکر مسواک کرے پھر اس کے بعد مکمل وضو کر ے پھر خوشبو لگائے اور نمازِ شب کے لئے کھڑا ہو جائے۔\n" +
                "وقتِ نمازِ شب\n" +
                "اس کا اوّل وقت آدھی رات کے بعد ہے اور طلوع صبح صادق سے جتنا بھی نزدیک ہو اتنا ہی افضل ہے اور اگر صبح ہو جائے اور چار رکعت پڑھ چکا ہے تو بقیہ کو بھی صرف حمد کے ساتھ سورہ کے بغیر پڑھ لے۔ تو جب نماز شب کے لئے مصلے پر کھڑا ہو تو آٹھ رکعت نمازِ شب پڑھے جس میں ہر دو رکعت کے بعد سلام پڑھے اور بہتر ہے کہ ہر پہلی دو رکعت میں سورۂ حمد کے بعد ۶۰ بار سورۂ توحید پڑھے۔ یعنی ہر رکعت میں ۳۰ بار پڑھے تا کہ نماز تمام ہونے کے بعد اس کے اور خداوند متعال کے درمیان کوئی گناہ باقی نہ رہ جائے۔ یا اس کے بجائے پہلی رکعت میں سورۂ توحید اور دوسری رکعت میں قل یا ایہاالکٰفرون پڑھے اور بقیہ چھ رکعتوں میں جو سورہ بھی چاہے پڑھے اور ہر رکعت میں حمد و قل ھو اللہ بھی کافی ہے اور صرف حمد پر اکتفا کرنا جائز ہے۔\n" +
                "قنوت\n" +
                "جس طرح واجبی نماز وں میں قنوت سنت ہے اسی طرح نافلہ نمازوں کی دوسری رکعت میں بھی سنت ہے اور اس میں تین بار :۔\n" +
                "سُبْحَانَ اللهِ۔\n" +
                "کہنا کافی ہے یا یہ کہے۔\n" +
                "اَللّٰهُمَّ اغْفِرْ لَنَا وَارْحَمْنَا وَ عَافِنَا وَاعْفُ عَنَّا فِى الدُّنْيَا وَ الْاٰخِرَةِ اِنَّكَ عَلٰى كُلِّشَىْءٍ قَدِيْرٌ۔\n" +
                "یا یہ کہے\n" +
                "رَبِّ اغْفِرْ وَارْحَمْ وَتَجَاوَزْ عَمَّا تَعْلَمُ اِنَّكَ اَنْتَ الْاَعَزُّ الْاَجَلُّ الْاَكْرَمُ۔\n" +
                "روایت میں ہے کہ جب امام موسیٰ کاظمؑ محراب عبادت میں کھڑے ہوتے تھے تو یہ دعا پڑھتے تھے۔\n" +
                "اَللّٰهُمَّ اِنَّكَ خَلَقْتَنِىْ سَوِيًّا۔۔۔\n" +
                "یہ صحیفۂ کاملہ کی پچیسویں دعاہے۔\n" +
                "نمازِ شفع و نمازِ وتر\n" +
                "جب نمازِ شب کی آٹھ رکعت سے فارغ ہو جائے تو دو رکعت نماز شفع اور ایک وتر پڑھے اور ان تین رکعتوں میں سورۂ الحمد کے بعد قل ھواللہ پڑھے تا کہ ایسا ہو جائے جیسے سارا قرآن ختم کر لیا ہے کیوں کہ سورۂ توحید ثلث۳؍۱ قرآن کے برابر ہے یا یہ کہ نماز شفع میں پہلی رکعت میں الحمد کے بعد سورۂ قل اعوذ بربّ الناس پڑھے اور دوسری رکعت میں سورۂ حمد اور قل اعوذُ بربّ الفلق پڑھے اور جب نماز شفع سے فارغ ہو تو یہ دعا پڑھے۔\n" +
                "اِلٰهِىْ تَعَرَّضَ لَكَ فِىْ هٰذَا اللَّيْلِ\u200F الْمُتَعَرِّضُوْنَ۔۔۔\n" +
                "یہ وہی دعا ہے جو شب پندرہ ۱۵ شعبان کے اعمال میں پڑھی جاتی ہے اور مفاتیح الجنان میں موجود ہے اور جب نماز شفع کی دو رکعت سے فارغ ہو جائے تو کھڑے ہو کر ایک رکعت نماز وتر پڑھے جس میں یا تو سورۂ حمد و سورۂ توحید پڑھے یا حمد کے بعد تین بار قل ھواللہ اور قل اعوذُ بربّ الناس پڑھے۔ پھر قنوت کے لئے ہاتھ اٹھا کر جو دعا پڑھنا چاہے پڑھے کہ شیخ طوسیؒ نے فرمایا ہے کہ اس مقام پر جو دعائیں پڑھی جاتی ہیں وہ اتنی زیادہ ہیں کہ ان کا جمع کرنا ممکن نہیں ہے۔ لیکن کوئی ایسی خاص چیز نہیں ہے جس کے بر خلاف کرنا جائز نہ ہو۔ اور مستحب ہے کہ انسان اس کے قنوت میں خوف خدا اور اس کے عذاب کے ڈر سے گریہ کرے یا کم از کم رونے والے کی شکل بنائے اور برادران دینی کے لئے دعا کرے اور مستحب ہے کہ چالیس آدمیوں کا نام لے کر ذکر کرے کیوں کہ جو شخص چالیس مومنوں کے لئے دعا کرے گا اس کی دعا یقیناً قبول ہو جائے گی انشاء اللہ اور اس کے علاوہ جو دعا چاہے کرے۔\n" +
                "شیخ صدوقؒ نے کتاب فقیہ میں فرمایا ہے کہ رسولؐ اکرم وتر کے قنوت میں یہ دعا پڑھتے تھے۔\n" +
                "اَللّٰهُمَّ اهْدِنِىْ فِيْمَنْ هَدَيْتَ وَ عَافِنِىْ فِيْمَنْ عَافَيْتَ وَ تَوَلَّنِىْ فِيْمَنْ تَوَلَّيْتَ وَ بَارِكْ لِىْ فِيْمَا اَعْطَيْتَ وَقِنِىْ شَرَّ مَا قَضَيْتَ فَاِنَّكَ تَقْضِىْ وَلَايُقْضٰى عَلَيْكَ سُبْحَانَكَ رَبَّ الْبَيْتِ اَسْتَغْفِرُكَ وَ اَتُوْبُ اِلَيْكَ وَ اُوْمِنُ بِكَ وَاَتَوَكَّلُ عَلَيْكَ وَلَاحَوْلَ وَلَاقُوَّةَ اِلَّا بِكَ يَا رَحِيْمُ۔\n" +
                "اور مناسب یہ ہے کہ ستّر بار\n" +
                "اَسْتَغْفِرُاللهَ رَبِّىْ وَ اَتُوْبُ اِلَيْهِ۔\n" +
                "بھی پڑھے۔ اور بہتر ہے کہ بائیں ہاتھ کو دعا کے لئے بلند کر کے دائیں ہاتھ ے استغفار کو شمار کرتا رہے اور روایت میں ہے کہ حضرت رسولؐ اکرم نماز وتر میں ستّر بار استغفار کرتے تھے اور سات مرتبہ کہتے تھے۔\n" +
                "هٰذَا مَقامُ الْعَاۤئِذِ بِكَ مِنَ النَّارِ۔\n" +
                "اور اسی طرح روایت میں ہے کہ حضرت امام زین العابدینؑ نماز وتر میں تین سو بار:۔\n" +
                "اَلْعَفْوَ اَلْعَفْوَ۔\n" +
                "کہہ کر یہ دعا پڑھتے تھے\n" +
                "رَبِّ اغْفِرْلِىْ وَارْحَمْنِىْ وَ تُبْ عَلىَّ اِنَّكَ اَنْتَ التَّوَّابُ الْغَفُوْرُ الرَّحِيْمُ۔\n" +
                "بہتر یہ ہے کہ قنوت کو طول دے اور قنوت سے فارغ ہو کر رکوع میں جائے اور رکوع سے سر اٹھانے کے بعد یہ دعا پڑھے جو شیخ نے تہذیب میں حضرت امام موسیٰ کاظمؑ سے نقل کی ہے۔\n" +
                "هٰذَا مَقَامُ مَنْ حَسَنَاتُهُ نِعْمَةٌ مِنْكَ وَ شُكْرُهُ ضَعِيْفٌ وَ ذَنْبُهُ عَظِيْمٌ وَ لَيْسَ لِذٰلِكَ اِلَّا رِفْقُكَ وَ رَحْمَتُكَ فَاِنَّكَ قُلْتَ فِىْ كِتَابِكَ الْمُنْزَلِ عَلٰى نَبِيِّكَ الْمُرْسَلِ صَلَّى اللهُ عَلَيْهِ وَ اٰلِهٖ كَانُوْا قَلِيْلًا مِنَ اللَّيْلِ مَا يَهْجَعُوْنَ وَبِالْاَسْحَارِهُمْ يَسْتَغْفِرُوْنَ طَالَ هُجُوْعِىْ وَ قَلَّ قِيَامِىْ وَ هٰذَا السَّحَرُ وَ اَ نَا اَسْتَغْفِرُكَ لِذُنُوْبِىْ اِسْتِغْفَارَ مَنْ لَايَجِدُ لِنَفْسِهِ ضَرًّا وَلَا نَفْعًا وَلا مَوْتًا وَلَاحَيَاةً وَلَا نُشُوْرًا۔\n" +
                "پھر سجدہ کرے تشہد وسلام کے بعد تسبیح زہراؐ پڑھے پھر کہے۔\n" +
                "اَلْحَمْدُ لِرَبِّ الصَّبَاحِ الْحَمْدُ لِفَالِقِ الْاِصْبَاحِ۔\n" +
                "اور پھر تین مرتبہ کہے\n" +
                "سُبْحَانَ رَبِّىَ الْمَلِكِ الْقُدُّوْسِ الْعَزِيْزِ الْحَكِيْمِ۔\n" +
                "پھر کہے\n" +
                "يَا حَىُّ يَا قَيُّوْمُ،يَا بَرُّ يَا رَحِيْمُ يَا غَنِىُّ يَا كَرِيْمُ اُرْزُقْنِىْ مِنَ التِّجَارَةِ اَعْظَمَهَا فَضْلًا وَ اَوْ سَعَهَا رِزْقًا وَ خَيْرَهَا لِىْ عَاقِبَةً فَاِنَّهُ لَا خَيْرَ فِيْمَا لَا عَاقِبَةَ لَهُ۔\n" +
                "اور بہتر ہے کہ اس کے بعد دعائے حزین پڑھے۔\n" +
                "اُنَاجِیْكَ یَا مَوْجُوْدً فِی كُلِّ مَكَانٍ لَعَلَّكَ تَسْمَعُ نِدَاۤئِی فَقَدْ عَظُمَ جُرْمِیْ وَ قَلَّ حَیَاۤئِی یَا مَوْلَایَ اَیَّ الْاَهْوَالِ اَتَذَكَّرُ وَ اَیَّهَا اَنْسٰی وَ لَوْ لَمْ یَكُنْ اِلَّا الْمَوْتُ لَكَفٰی كَیْفَ وَ مَا بَعْدَ الْمَوْتِ اَعْظَمُ وَ اَدْهٰی مَوْلَایَ یَا مَوْلَایَ حَتّٰی مَتٰی وَ اِلٰی مَتٰی اَقُوْلُ لَكَ الْعُتْبٰی مَرَّةً بَعْدَ اُخْرٰی ثُمَّ لَا تَجِدُ عِنْدِیْ صِدْقًا وَ لَا وَفَاۤءً فَیَا غَوْثَاهُ ثُمَّ وَا غَوْثَاهُ بِكَ یَاۤ اَللهُ مِنْ هَوًی قَدْ غَلَبَنِیْ وَ مِنْ عَدُوٍّ قَدِ اسْتَكْلَبَ عَلَیَّ وَ مِنْ دُنْیَا قَدْ تَزَیَّنَتْ لِیْ وَ مِنْ نَفْسِ اَمَّارَةٍ بِالسُّوْۤءِ اِلَّا مَا رَحِمَ رَبِّیْ مَوْلَایَ یَا مَوْلَایَ اِنْ كُنْتَ رَحِمْتَ مِثْلِیْ فَارْحَمْنِیْ وَ اِنْ كُنْتَ قَبِلْتَ مِثْلِیْ فَاقْبَلْنِیْ یَا قَابِلَ السَّحَرَةِ اقْبَلْنِیْ یَا مَنْ لَمْ اَزَلْ اَتَعَرَّفُ مِنْهُ الْحُسْنٰی یَا مَنْ یُغَذِّیْنِیْ بِالنِّعَمِ صَبَاحًا وَ مَسَاۤءً اِرْحَمْنِیْ یَوْمَ اٰتِیْكَ فَرْدًا شَاخِصًا اِلَیْكَ بَصَرِیْ مُقَلَّدًا عَمَلِیْ قَدْ تَبَرَّاَ جَمِیْعُ الْخَلْقِ مِنِّیْ نَعَمْ وَ اَبِیْ وَ اُمِّیْ وَ مَنْ كَانَ لَهُ كَدِّیْ وَ سَعْیِیْ فَاِنْ لَمْ تَرْحَمْنِیْ فَمَنْ یَرْحَمُنِیْ وَ مَنْ یُؤْنِسُ فِی الْقَبْرِ وَحْشَتِیْ وَ مَنْ یُنْطِقُ لِسَانِیْ اِذَا خَلَوْتُ بِعَمَلِیْ وَ سَاَلْتَنِیْ عَمَّاۤ اَنْتَ اَعْلَمُ بِهِ مِنِّیْ فَاِنْ قُلْتُ نَعَمْ فَاَیْنَ الْمَهْرَبُ مِنْ عَدْلِكَ وَ اِنْ قُلْتُ لَمْ اَفْعَلْ قُلْتَ اَ لَمْ اَكُنِ الشَّاهِدَ عَلَیْكَ فَعَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ سَرَابِیْلِ الْقَطِرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ جَهَنَّمَ وَ النِّیْرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ اَنْ تُغَلَّ الْاَیْدِیْ اِلَی الْاَعْنَاقِ یَاۤ اَرْحَمَ الرَّاحِمِیْنَ وَ خَیْرَ الْغَافِرِیْنَ۔\n" +
                "پھر سجدہ میں جا کر پانچ بار کہے۔\n" +
                "سُبُّوْحٌ قُدُّوْسٌ،رَبُّ الْمَلَاۤئِكَةِ وَ الرُّوْحِ۔\n" +
                "پھر بیٹھ کر آیۃ الکرسی پڑھے پھر دوبارہ سجدہ میں جا کر گذشتہ ذکر کی تکرار کرے پانچ مرتبہ۔\n";
        us3="\n" +
                "اَلْحَمْدُلِلّٰهِ الَّذِىْ اَحْيَانِىْ بَعْدَ مَا اَمَاتَنِىْ وَ اِلَيْهِ النُّشُوْرُ اَلْحَمْدُ لِلّٰهِ الَّذِىْ رَدَّ عَلَىَّ رُوْحِىْ لِاَحْمَدَهُ وَاَعْبُدَهُ۔\n" +
                "اور جب کھڑے ہو جائے تو کہے۔\n" +
                "اَللّٰهُمَّ اَعِنِّىْ عَلٰى هَوْلِ الْمُطَّلَعِ وَ وَسِّعْ عَلَىَّ الْمَضْجَعَ وَارْزُقْنِىْ خَيْرَمَا بَعْدَ الْمَوْتِ۔\n" +
                "اور جب مرغ کی آواز سنے تو کہے۔\n" +
                "سُبُّوْحٌ قُدُّوْسٌ رَبُّ الْمَلَاۤئِكَةِ وَالرُّوْحِ سَبَقَتْ رَحْمَتُكَ غَضَبَكَ لَا اِلٰهَ اِلَّا اَنْتَ عَمِلْتُ سُوْءًا وَظَلَمْتُ نَفْسِىْ فَاغْفِرْلِىْ اِنَّهُ لَايَغْفِرُ الذُّنُوْبَ اِلَّا اَنْتَ فَتُبْ عَلَىَّ اِنَّكَ اَنْتَ التَّوَّابُ الرَّحِيْمُ۔\n" +
                "اور جب آسمان پر ڈالے یہ کہے۔\n" +
                "اَللّٰهُمَّ اِنَّهُ لَايُوَارِىْ مِنْكَ لَيْلٌ سَاجٍ وَلَاسَمَاۤءٌ ذَاتُ اَبْرَاجٍ وَلَا اَرْضٌ ذَاتُ مِهَادٍ وَلَاظُلُمَاتٌ بَعْضُهَا فَوْقَ بَعْضٍ وَ لَابَحْرٌ لُجِّىٌّ تُدْلِجُ بَيْنَ يَدَىِ الْمُدْلِجِ مِنْ خَلْقِكَ تُدْلِجُ الرَّحْمَةَ عَلٰى مَنْ تَشَاۤءُ مِنْ خَلْقِكَ تَعْلَمُ خَاۤئِنَةَ الْاَعْيُنِ وَ مَا تُخْفِىْ الصُّدُوْرُ غَارَتِ النُّجُوْمُ وَنامَتِ الْعُيُوْنُ وَ اَنْتَ الْحَىُّ الْقَيُّوْمُ لَا تَاْخُذُكَ سِنَةٌ وَّلَانَوْمٌ سُبْحَانَ اللہِ رَبِّ الْعَالَمِيْنَ وَ اِلٰهِ الْمُرْسَلِيْنَ وَالْحَمْدُلِلّٰهِ رَبِّ الْعَالَمِيْنَ۔\n" +
                "اس کے بعد آلِ عمران کی پانچ آیتیں پڑھے۔\n" +
                "اِنَّ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ وَاخْتِلَافِ اللَّيْلِ وَالنَّهَارِ لَاٰ يَاتٍ لِاُ وْلىِ الْاَلْبَابِ الَّذِيْنَ يَذْكُرُوْنَ اللهَ قِيَامًا وَ قُعُوْدًا وَ عَلٰى جُنُوْبِهِمْ وَ يَتَفَكَّرُوْنَ فِىْ خَلْقِ السَّمٰوَاتِ وَالْاَرْضِ رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلًا سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ رَبَّنَا اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهَ وَ مَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ رَبَّنَا اِنَّنَا سَمِعْنَا مُنَادِيًا يُنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا رَبَّنَا فَاغْفِرْ لَنَا ذُ نُوْبَنَا وَ كَفِّرْ عَنَّا سَيِّئَاۤتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَنَا عَلٰى رُسُلِكَ وَلَاتُخْزِنَا يَوْمَ الْقِيَامَةِ اِنَّكَ لَاتُخْلِفُ الْمِيْعَادَ۔\n" +
                "پھر جب نماز پڑھنا چاہے اور بیت الخلاء جانے کی ضرورت محسوس ہو تو پہلے اس سے فارغ ہو جائے۔ پھر بیت الخلاء سے باہر آکر مسواک کرے پھر اس کے بعد مکمل وضو کر ے پھر خوشبو لگائے اور نمازِ شب کے لئے کھڑا ہو جائے۔\n" +
                "وقتِ نمازِ شب\n" +
                "اس کا اوّل وقت آدھی رات کے بعد ہے اور طلوع صبح صادق سے جتنا بھی نزدیک ہو اتنا ہی افضل ہے اور اگر صبح ہو جائے اور چار رکعت پڑھ چکا ہے تو بقیہ کو بھی صرف حمد کے ساتھ سورہ کے بغیر پڑھ لے۔ تو جب نماز شب کے لئے مصلے پر کھڑا ہو تو آٹھ رکعت نمازِ شب پڑھے جس میں ہر دو رکعت کے بعد سلام پڑھے اور بہتر ہے کہ ہر پہلی دو رکعت میں سورۂ حمد کے بعد ۶۰ بار سورۂ توحید پڑھے۔ یعنی ہر رکعت میں ۳۰ بار پڑھے تا کہ نماز تمام ہونے کے بعد اس کے اور خداوند متعال کے درمیان کوئی گناہ باقی نہ رہ جائے۔ یا اس کے بجائے پہلی رکعت میں سورۂ توحید اور دوسری رکعت میں قل یا ایہاالکٰفرون پڑھے اور بقیہ چھ رکعتوں میں جو سورہ بھی چاہے پڑھے اور ہر رکعت میں حمد و قل ھو اللہ بھی کافی ہے اور صرف حمد پر اکتفا کرنا جائز ہے۔\n" +
                "قنوت\n" +
                "جس طرح واجبی نماز وں میں قنوت سنت ہے اسی طرح نافلہ نمازوں کی دوسری رکعت میں بھی سنت ہے اور اس میں تین بار :۔\n" +
                "سُبْحَانَ اللهِ۔\n" +
                "کہنا کافی ہے یا یہ کہے۔\n" +
                "اَللّٰهُمَّ اغْفِرْ لَنَا وَارْحَمْنَا وَ عَافِنَا وَاعْفُ عَنَّا فِى الدُّنْيَا وَ الْاٰخِرَةِ اِنَّكَ عَلٰى كُلِّشَىْءٍ قَدِيْرٌ۔\n" +
                "یا یہ کہے\n" +
                "رَبِّ اغْفِرْ وَارْحَمْ وَتَجَاوَزْ عَمَّا تَعْلَمُ اِنَّكَ اَنْتَ الْاَعَزُّ الْاَجَلُّ الْاَكْرَمُ۔\n" +
                "روایت میں ہے کہ جب امام موسیٰ کاظمؑ محراب عبادت میں کھڑے ہوتے تھے تو یہ دعا پڑھتے تھے۔\n" +
                "اَللّٰهُمَّ اِنَّكَ خَلَقْتَنِىْ سَوِيًّا۔۔۔\n" +
                "یہ صحیفۂ کاملہ کی پچیسویں دعاہے۔\n" +
                "نمازِ شفع و نمازِ وتر\n" +
                "جب نمازِ شب کی آٹھ رکعت سے فارغ ہو جائے تو دو رکعت نماز شفع اور ایک وتر پڑھے اور ان تین رکعتوں میں سورۂ الحمد کے بعد قل ھواللہ پڑھے تا کہ ایسا ہو جائے جیسے سارا قرآن ختم کر لیا ہے کیوں کہ سورۂ توحید ثلث۳؍۱ قرآن کے برابر ہے یا یہ کہ نماز شفع میں پہلی رکعت میں الحمد کے بعد سورۂ قل اعوذ بربّ الناس پڑھے اور دوسری رکعت میں سورۂ حمد اور قل اعوذُ بربّ الفلق پڑھے اور جب نماز شفع سے فارغ ہو تو یہ دعا پڑھے۔\n" +
                "اِلٰهِىْ تَعَرَّضَ لَكَ فِىْ هٰذَا اللَّيْلِ\u200F الْمُتَعَرِّضُوْنَ۔۔۔\n" +
                "یہ وہی دعا ہے جو شب پندرہ ۱۵ شعبان کے اعمال میں پڑھی جاتی ہے اور مفاتیح الجنان میں موجود ہے اور جب نماز شفع کی دو رکعت سے فارغ ہو جائے تو کھڑے ہو کر ایک رکعت نماز وتر پڑھے جس میں یا تو سورۂ حمد و سورۂ توحید پڑھے یا حمد کے بعد تین بار قل ھواللہ اور قل اعوذُ بربّ الناس پڑھے۔ پھر قنوت کے لئے ہاتھ اٹھا کر جو دعا پڑھنا چاہے پڑھے کہ شیخ طوسیؒ نے فرمایا ہے کہ اس مقام پر جو دعائیں پڑھی جاتی ہیں وہ اتنی زیادہ ہیں کہ ان کا جمع کرنا ممکن نہیں ہے۔ لیکن کوئی ایسی خاص چیز نہیں ہے جس کے بر خلاف کرنا جائز نہ ہو۔ اور مستحب ہے کہ انسان اس کے قنوت میں خوف خدا اور اس کے عذاب کے ڈر سے گریہ کرے یا کم از کم رونے والے کی شکل بنائے اور برادران دینی کے لئے دعا کرے اور مستحب ہے کہ چالیس آدمیوں کا نام لے کر ذکر کرے کیوں کہ جو شخص چالیس مومنوں کے لئے دعا کرے گا اس کی دعا یقیناً قبول ہو جائے گی انشاء اللہ اور اس کے علاوہ جو دعا چاہے کرے۔\n" +
                "شیخ صدوقؒ نے کتاب فقیہ میں فرمایا ہے کہ رسولؐ اکرم وتر کے قنوت میں یہ دعا پڑھتے تھے۔\n" +
                "اَللّٰهُمَّ اهْدِنِىْ فِيْمَنْ هَدَيْتَ وَ عَافِنِىْ فِيْمَنْ عَافَيْتَ وَ تَوَلَّنِىْ فِيْمَنْ تَوَلَّيْتَ وَ بَارِكْ لِىْ فِيْمَا اَعْطَيْتَ وَقِنِىْ شَرَّ مَا قَضَيْتَ فَاِنَّكَ تَقْضِىْ وَلَايُقْضٰى عَلَيْكَ سُبْحَانَكَ رَبَّ الْبَيْتِ اَسْتَغْفِرُكَ وَ اَتُوْبُ اِلَيْكَ وَ اُوْمِنُ بِكَ وَاَتَوَكَّلُ عَلَيْكَ وَلَاحَوْلَ وَلَاقُوَّةَ اِلَّا بِكَ يَا رَحِيْمُ۔\n" +
                "اور مناسب یہ ہے کہ ستّر بار\n" +
                "اَسْتَغْفِرُاللهَ رَبِّىْ وَ اَتُوْبُ اِلَيْهِ۔\n" +
                "بھی پڑھے۔ اور بہتر ہے کہ بائیں ہاتھ کو دعا کے لئے بلند کر کے دائیں ہاتھ ے استغفار کو شمار کرتا رہے اور روایت میں ہے کہ حضرت رسولؐ اکرم نماز وتر میں ستّر بار استغفار کرتے تھے اور سات مرتبہ کہتے تھے۔\n" +
                "هٰذَا مَقامُ الْعَاۤئِذِ بِكَ مِنَ النَّارِ۔\n" +
                "اور اسی طرح روایت میں ہے کہ حضرت امام زین العابدینؑ نماز وتر میں تین سو بار:۔\n" +
                "اَلْعَفْوَ اَلْعَفْوَ۔\n" +
                "کہہ کر یہ دعا پڑھتے تھے\n" +
                "رَبِّ اغْفِرْلِىْ وَارْحَمْنِىْ وَ تُبْ عَلىَّ اِنَّكَ اَنْتَ التَّوَّابُ الْغَفُوْرُ الرَّحِيْمُ۔\n" +
                "بہتر یہ ہے کہ قنوت کو طول دے اور قنوت سے فارغ ہو کر رکوع میں جائے اور رکوع سے سر اٹھانے کے بعد یہ دعا پڑھے جو شیخ نے تہذیب میں حضرت امام موسیٰ کاظمؑ سے نقل کی ہے۔\n" +
                "هٰذَا مَقَامُ مَنْ حَسَنَاتُهُ نِعْمَةٌ مِنْكَ وَ شُكْرُهُ ضَعِيْفٌ وَ ذَنْبُهُ عَظِيْمٌ وَ لَيْسَ لِذٰلِكَ اِلَّا رِفْقُكَ وَ رَحْمَتُكَ فَاِنَّكَ قُلْتَ فِىْ كِتَابِكَ الْمُنْزَلِ عَلٰى نَبِيِّكَ الْمُرْسَلِ صَلَّى اللهُ عَلَيْهِ وَ اٰلِهٖ كَانُوْا قَلِيْلًا مِنَ اللَّيْلِ مَا يَهْجَعُوْنَ وَبِالْاَسْحَارِهُمْ يَسْتَغْفِرُوْنَ طَالَ هُجُوْعِىْ وَ قَلَّ قِيَامِىْ وَ هٰذَا السَّحَرُ وَ اَ نَا اَسْتَغْفِرُكَ لِذُنُوْبِىْ اِسْتِغْفَارَ مَنْ لَايَجِدُ لِنَفْسِهِ ضَرًّا وَلَا نَفْعًا وَلا مَوْتًا وَلَاحَيَاةً وَلَا نُشُوْرًا۔\n" +
                "پھر سجدہ کرے تشہد وسلام کے بعد تسبیح زہراؐ پڑھے پھر کہے۔\n" +
                "اَلْحَمْدُ لِرَبِّ الصَّبَاحِ الْحَمْدُ لِفَالِقِ الْاِصْبَاحِ۔\n" +
                "اور پھر تین مرتبہ کہے\n" +
                "سُبْحَانَ رَبِّىَ الْمَلِكِ الْقُدُّوْسِ الْعَزِيْزِ الْحَكِيْمِ۔\n" +
                "پھر کہے\n" +
                "يَا حَىُّ يَا قَيُّوْمُ،يَا بَرُّ يَا رَحِيْمُ يَا غَنِىُّ يَا كَرِيْمُ اُرْزُقْنِىْ مِنَ التِّجَارَةِ اَعْظَمَهَا فَضْلًا وَ اَوْ سَعَهَا رِزْقًا وَ خَيْرَهَا لِىْ عَاقِبَةً فَاِنَّهُ لَا خَيْرَ فِيْمَا لَا عَاقِبَةَ لَهُ۔\n" +
                "اور بہتر ہے کہ اس کے بعد دعائے حزین پڑھے۔\n" +
                "اُنَاجِیْكَ یَا مَوْجُوْدً فِی كُلِّ مَكَانٍ لَعَلَّكَ تَسْمَعُ نِدَاۤئِی فَقَدْ عَظُمَ جُرْمِیْ وَ قَلَّ حَیَاۤئِی یَا مَوْلَایَ اَیَّ الْاَهْوَالِ اَتَذَكَّرُ وَ اَیَّهَا اَنْسٰی وَ لَوْ لَمْ یَكُنْ اِلَّا الْمَوْتُ لَكَفٰی كَیْفَ وَ مَا بَعْدَ الْمَوْتِ اَعْظَمُ وَ اَدْهٰی مَوْلَایَ یَا مَوْلَایَ حَتّٰی مَتٰی وَ اِلٰی مَتٰی اَقُوْلُ لَكَ الْعُتْبٰی مَرَّةً بَعْدَ اُخْرٰی ثُمَّ لَا تَجِدُ عِنْدِیْ صِدْقًا وَ لَا وَفَاۤءً فَیَا غَوْثَاهُ ثُمَّ وَا غَوْثَاهُ بِكَ یَاۤ اَللهُ مِنْ هَوًی قَدْ غَلَبَنِیْ وَ مِنْ عَدُوٍّ قَدِ اسْتَكْلَبَ عَلَیَّ وَ مِنْ دُنْیَا قَدْ تَزَیَّنَتْ لِیْ وَ مِنْ نَفْسِ اَمَّارَةٍ بِالسُّوْۤءِ اِلَّا مَا رَحِمَ رَبِّیْ مَوْلَایَ یَا مَوْلَایَ اِنْ كُنْتَ رَحِمْتَ مِثْلِیْ فَارْحَمْنِیْ وَ اِنْ كُنْتَ قَبِلْتَ مِثْلِیْ فَاقْبَلْنِیْ یَا قَابِلَ السَّحَرَةِ اقْبَلْنِیْ یَا مَنْ لَمْ اَزَلْ اَتَعَرَّفُ مِنْهُ الْحُسْنٰی یَا مَنْ یُغَذِّیْنِیْ بِالنِّعَمِ صَبَاحًا وَ مَسَاۤءً اِرْحَمْنِیْ یَوْمَ اٰتِیْكَ فَرْدًا شَاخِصًا اِلَیْكَ بَصَرِیْ مُقَلَّدًا عَمَلِیْ قَدْ تَبَرَّاَ جَمِیْعُ الْخَلْقِ مِنِّیْ نَعَمْ وَ اَبِیْ وَ اُمِّیْ وَ مَنْ كَانَ لَهُ كَدِّیْ وَ سَعْیِیْ فَاِنْ لَمْ تَرْحَمْنِیْ فَمَنْ یَرْحَمُنِیْ وَ مَنْ یُؤْنِسُ فِی الْقَبْرِ وَحْشَتِیْ وَ مَنْ یُنْطِقُ لِسَانِیْ اِذَا خَلَوْتُ بِعَمَلِیْ وَ سَاَلْتَنِیْ عَمَّاۤ اَنْتَ اَعْلَمُ بِهِ مِنِّیْ فَاِنْ قُلْتُ نَعَمْ فَاَیْنَ الْمَهْرَبُ مِنْ عَدْلِكَ وَ اِنْ قُلْتُ لَمْ اَفْعَلْ قُلْتَ اَ لَمْ اَكُنِ الشَّاهِدَ عَلَیْكَ فَعَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ سَرَابِیْلِ الْقَطِرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ جَهَنَّمَ وَ النِّیْرَانِ عَفْوُكَ عَفْوُكَ یَا مَوْلَایَ قَبْلَ اَنْ تُغَلَّ الْاَیْدِیْ اِلَی الْاَعْنَاقِ یَاۤ اَرْحَمَ الرَّاحِمِیْنَ وَ خَیْرَ الْغَافِرِیْنَ۔\n" +
                "پھر سجدہ میں جا کر پانچ بار کہے۔\n" +
                "سُبُّوْحٌ قُدُّوْسٌ،رَبُّ الْمَلَاۤئِكَةِ وَ الرُّوْحِ۔\n" +
                "پھر بیٹھ کر آیۃ الکرسی پڑھے پھر دوبارہ سجدہ میں جا کر گذشتہ ذکر کی تکرار کرے پانچ مرتبہ۔\n";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="NAMAZ OF IMAM MAHDI (A.T.F.S)\n";
        es1="";
        es2="This prayer consists of two units in each of which Surah al-Faatehah is recited once but the following Ayah (verse) is repeated one hundred times:\n" +
                "اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ\n" +
                "Then, Surah al-Tawheed is recited once.\n" +
                "After the namaz recite Tasbih of Hazrat Fatima Zahra (s.a.) and recite the following dua:\n" +
                "اَللّٰهُمَّ عَظُمَ الْبَلَاۤءُ وَ بَرِحَ الْخَفَاۤءُ وَ انْكَشَفَ الْغِطَاۤءُ وَ ضَاقَتِ الْاَرْضُ بِمَا وَسِعَتِ السَّمَاۤءُ وَ اِلَيْكَ يَا رَبِّ الْمُشْتَكٰى وَ عَلَيْكَ الْمُعَوَّلُ فِي الشِّدَّةِ وَ الرَّخَاۤءِ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ الَّذِيْنَ اَمَرْتَنَا بِطَاعَتِهِمْ وَ عَجِّلِ اللّٰهُمَّ فَرَجَهُمْ بِقَاۤئِمِهِمْ وَ اَظْهِرْ اِعْزَازَهُ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِكْفِيَانِي فَاِنَّكُمَا كَافِيَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اُنْصُرَانِي فَاِنَّكُمَا نَاصِرَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِحْفَظَانِي فَاِنَّكُمَا حَافِظَايَ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ الْغَوْثَ الْغَوْثَ الْغَوْثَ اَدْرِكْنِيْ اَدْرِكْنِيْ اَدْرِكْنِيْ اَلْاَمَانَ الْاَمَانَ الْاَمَانَ۔\n" +
                "\n";
        es3="\n" +
                "This prayer consists of two units in each of which Surah al-Faatehah is recited once but the following Ayah (verse) is repeated one hundred times:\n" +
                "\n" +
                "You do we worship, and Yours aid we seek.\n" +
                "\n" +
                "Then, Surah al-Tawheed is recited once.\n" +
                "\n" +
                "After the namaz recite Tasbih of Hazrat Fatima Zahra (s.a.) and recite the following dua:\n" +
                "\n" +
                "O Allah, unbearable is our tribulation! The hidden has been disclosed! The cover has been exposed! The earth has become too narrow to carry that which could be embraced by the sky. To You, my Lord, is the complaint and in You is the trust in sorrow and in joy. O Allah, send blessings to Muhammad and the Household of Muhammad whom You have commanded us to obey, and hasten their Relief through the Rising Imam among them; and make manifest Your fortifying him. O Muhammad! O 'Ali! O 'Ali! O Muhammad! Save me, for you both are true saviors of me. O Muhammad! O 'Ali! O 'Ali! O Muhammad! Aid me, for you both are true aides of me. O Muhammad! O 'Ali! O 'Ali! O Muhammad! Protect me, for you both are true protectors of me. 0 my master, the Patron of the Age! 0 my master, the Patron of the Age! O my master, the Patron of the Age! Help, help, help! [come to] succor me, [come to] succor me, [come to] succor me! [grant me] security, [grant me] security, [grant me] security!";

        us0="نماز حضر ت صاحب الزمان عجل اللہ فرجہ الشریف\n";
        us1="";
        us2="\n" +
                "(یہ دورکعت نماز ہے۔ ہر رکعت میں سورۂ حمد کو (اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ)تک پڑھنے کے بعد اسی آیت کوسو مرتبہ دہرائے اس کے بعد سورۂ کو مکمل کرے اور اس طرح جب نماز تمام ہو جائے تو یہ دعا پڑھے۔)\n" +
                "اَللّٰهُمَّ عَظُمَ الْبَلَاۤءُ وَ بَرِحَ الْخَفَاۤءُ وَ انْكَشَفَ الْغِطَاۤءُ وَ ضَاقَتِ الْاَرْضُ بِمَا وَسِعَتِ السَّمَاۤءُ وَ اِلَيْكَ يَا رَبِّ الْمُشْتَكٰى وَ عَلَيْكَ الْمُعَوَّلُ فِي الشِّدَّةِ وَ الرَّخَاۤءِ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ الَّذِيْنَ اَمَرْتَنَا بِطَاعَتِهِمْ وَ عَجِّلِ اللّٰهُمَّ فَرَجَهُمْ بِقَاۤئِمِهِمْ وَ اَظْهِرْ اِعْزَازَهُ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِكْفِيَانِي فَاِنَّكُمَا كَافِيَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اُنْصُرَانِي فَاِنَّكُمَا نَاصِرَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِحْفَظَانِي فَاِنَّكُمَا حَافِظَايَ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ الْغَوْثَ الْغَوْثَ الْغَوْثَ اَدْرِكْنِيْ اَدْرِكْنِيْ اَدْرِكْنِيْ اَلْاَمَانَ الْاَمَانَ الْاَمَانَ۔";
        us3="\n" +
                "(یہ دورکعت نماز ہے۔ ہر رکعت میں سورۂ حمد کو (اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ)تک پڑھنے کے بعد اسی آیت کوسو مرتبہ دہرائے اس کے بعد سورۂ کو مکمل کرے اور اس طرح جب نماز تمام ہو جائے تو یہ دعا پڑھے۔)\n" +
                "اَللّٰهُمَّ عَظُمَ الْبَلَاۤءُ وَ بَرِحَ الْخَفَاۤءُ وَ انْكَشَفَ الْغِطَاۤءُ وَ ضَاقَتِ الْاَرْضُ بِمَا وَسِعَتِ السَّمَاۤءُ وَ اِلَيْكَ يَا رَبِّ الْمُشْتَكٰى وَ عَلَيْكَ الْمُعَوَّلُ فِي الشِّدَّةِ وَ الرَّخَاۤءِ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ الَّذِيْنَ اَمَرْتَنَا بِطَاعَتِهِمْ وَ عَجِّلِ اللّٰهُمَّ فَرَجَهُمْ بِقَاۤئِمِهِمْ وَ اَظْهِرْ اِعْزَازَهُ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِكْفِيَانِي فَاِنَّكُمَا كَافِيَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اُنْصُرَانِي فَاِنَّكُمَا نَاصِرَايَ يَا مُحَمَّدُ يَا عَلِيُّ يَا عَلِيُّ يَا مُحَمَّدُ اِحْفَظَانِي فَاِنَّكُمَا حَافِظَايَ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ الْغَوْثَ الْغَوْثَ الْغَوْثَ اَدْرِكْنِيْ اَدْرِكْنِيْ اَدْرِكْنِيْ اَلْاَمَانَ الْاَمَانَ الْاَمَانَ۔";





        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="NAMAZ OF JAFAR E TAYYAR\n";
        es1="";
        es2="Ja’far al-Tayyar’s Prayer is as precious as gold, since it is the most magnificent recommended devotional rite. Altogether with its great merits the most important of which is that it erases major sins, this prayer has been reported through authenticated chain of authority. The best time of its performance is the first hours of daylight on Fridays. It consists of four units with two Tashahhuds (i.e. the part of prayers in which the two creeds of Islam are recited) and two Taslims. In the first unit, Surahs al-Faatehah and al-Zalzalah are recited, in the second, Surahs al-Faatehah and al-’Adiyat, in the third, Surahs al-Faatehah and al-Nasr, and in the fourth, Surahs al-Faatehah and al-Tawheed. In each unit, after the recitation of the Surahs and before the genuflection (ruku'), the following litany (Tasbihat) should be repeated fifteen times:\n" +
                "سُبْحَانَ اللّٰهِ وَ الْحَمْدُ لِلّٰهِ وَ لَاۤ اِلٰهَ اِلَّا اللهُ وَ اللهُ اَكْبَرُ۔\n" +
                "The same litany (Tasbihat) is repeated, yet ten times only, during the Ruku’, after the Ruku’ while standing erect, during the prostration (Sujud), after the first Sajdah, during the second Sajdah, and after the second Sajdah. The same thing is repeated in all of the four units of the prayer. Hence, the litany will have been repeated three hundred times.\n" +
                "Shaykh al-Kulayni has narrated that Imam Ja’far al-Sadiq(a.s.) said to Abu-Sa’id al-Mada’ini, “May I teach you something that you should recite in Ja’far al-Tayyar’s Prayer?” As the man answered in the affirmative, the Imam (a.s.) said: After you say the Tasbihat in the second Sajdah of the fourth unit, say the following litany:\n" +
                "سُبْحَانَ مَنْ لَبِسَ الْعِزَّ وَ الْوَقَارَ سُبْحَانَ مَنْ تَعَطَّفَ بِالْمَجْدِ وَ تَكَرَّمَ بِهِ سُبْحَانَ مَنْ لَا يَنْبَغِيْ التَّسْبِيْحُ اِلَّا لَهُ سُبْحَانَ مَنْ اَحْصٰى كُلَّ شَيْ\u200Fءٍ عِلْمُهُ سُبْحَانَ ذِي الْمَنِّ وَ النِّعَمِ سُبْحَانَ ذِي الْقُدْرَةِ وَ الْكَرَمِ اَللّٰهُمَّ اِنِّي اَسْاَلُكَ بِمَعَاقِدِ الْعِزِّ مِنْ عَرْشِكَ وَ مُنْتَهَى الرَّحْمَةِ مِنْ كِتَابِكَ وَ اسْمِكَ الْاَعْظَمِ وَ كَلِمَاتِكَ التَّآمَّةِ الَّتِي تَمَّتْ صِدْقًا وَ عَدْلًا صَلِّ عَلٰى مُحَمَّدٍ وَ اَهْلِ بَيْتِهِ وَ افْعَلْ بِيْ كَذَا وَ كَذَا۔\n" +
                "Then, you may mention your needs in the form of supplication.\n" +
                "Shaykh al-Tusi and Sayyid Ibn Tawus both narrated that al-Mufaddal ibn ‘Umar said that he heard Imam Ja’far al-Sadiq(a.s.) saying the following supplicatory prayer after accomplishing Ja’far al-Tayyar’s Prayer:\n" +
                "«يَا رَبِّ يَا رَبِّ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«يَا رَبَّاهُ يَا رَبَّاهُ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«رَبِّ رَبِّ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«يَا اَللهُ يَا اَللهُ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«يَا حَىُّ يَا حَىُّ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«يَا رَحِيْمُ يَا رَحِيْمُ»\n" +
                "Say it as many times as possible in one breath.\n" +
                "«يَا رَحْمٰنُ يَا رَحْمٰنُ»\n" +
                "Repeat it seven times.\n" +
                "«يَا اَرْحَمَ الرَّاحِمِيْنَ»\n" +
                "Repeat it seven times.\n" +
                "Then, say the following:\n" +
                "اَللّٰهُمَّ اِنِّيْ اَفْتَتِحُ الْقَوْلَ بِحَمْدِكَ وَ اَنْطِقُ بِالثَّنَاۤءِ عَلَيْكَ وَ اُمَجِّدُكَ وَ لَا غَايَةَ لِمَدْحِكَ وَ اُثْنِيْ عَلَيْكَ وَ مَنْ يَبْلُغُ غَايَةَ ثَنَاۤئِكَ وَ اَمَدَ مَجْدِكَ وَ اَنَّى لِخَلِيْقَتِكَ كُنْهُ مَعْرِفَةِ مَجْدِكَ وَ اَيَّ زَمَنٍ لَمْ تَكُنْ مَمْدُوْحًا بِفَضْلِكَ مَوْصُوْفًا بِمَجْدِكَ عَوَّادًا عَلَى الْمُذْنِبِيْنَ بِحِلْمِكَ تَخَلَّفَ سُكَّانُ اَرْضِكَ عَنْ طَاعَتِكَ فَكُنْتَ عَلَيْهِمْ عَطُوْفًا بِجُوْدِكَ جَوَادًا بِفَضْلِكَ عَوَّادًا بِكَرَمِكَ يَا لَاۤ اِلٰهَ اِلَّا اَنْتَ الْمَنَّانُ ذُو الْجَلَالِ وَ الْاِكْرَامِ۔\n" +
                "Al-Mufaddal then added: Imam Ja’far al-Sadiq(a.s.) then said to me, “If you have a significant request and you want it to be granted, you may offer this prayer, say this supplication, and implore Almighty Allah to respond to you. If you do, it will be granted, Allah willing.”\n" +
                "Shaykh al-Tusi has narrated that Imam al-Sadiq(a.s.) recommended the following supplicatory prayer for having one’s requests granted:\n" +
                "Observe fasting on consecutive Wednesday, Thursday, and Friday. At Thursday evening, give half bushel of food for ten poor people as alms. On Friday, wash yourself and go out to a wasteland and offer therein Ja’far al-Tayyar’s Prayer sticking your knees to the ground after you uncover them. You may then say the following supplicatory prayer:\n" +
                "يَا مَنْ اَظْهَرَ الْجَمِيْلَ وَ سَتَرَ [عَلَيَ\u200F] الْقَبِيْحَ يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيْرَةِ وَ لَمْ يَهْتِكِ السِّتْرَ يَا عَظِيْمَ الْعَفْوِ يَا حَسَنَ التَّجَاوُزِ يَا وَاسِعَ الْمَغْفِرَةِ يَا بَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ يَا صَاحِبَ كُلِّ نَجْوٰى وَ مُنْتَهٰى كُلِّ شَكْوٰى يَا مُقِيْلَ الْعَثَرَاتِ يَا كَرِيْمَ الصَّفْحِ يَا عَظِيْمَ الْمَنِّ يَا مُبْتَدِئًا بِالنِّعَمِ قَبْلَ اسْتِحْقَاقِهَا يَا رَبَّاهُ يَا رَبَّاهُ يَا رَبَّاهُ،\n" +
                "Repeat this statement ten times.\n" +
                "«يَا اَللهُ يَا اَللهُ يَا اَللهُ\u200F»\n" +
                "Repeat it ten times, too.\n" +
                "«يَا سَیِّدَاهُ يَا سَيِّدَاهُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا مَوْلَايَاهُ،يَا مَوْلَايَاهُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا رَجَاۤءَاهُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا غِيَاثَاهُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا غَايَةَ رَغَبَتَاهُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا رَحْمٰنُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا رَحِيْمُ»\n" +
                "Repeat it ten times.\n" +
                "«يَا مُعْطِىَ الْخَيْرَاتِ»\n" +
                "Repeat it ten times.\n" +
                "«صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ كَثِيْرًا طَيِّبًا كَاَفْضَلِ مَا صَلَّيْتَ عَلٰى اَحَدٍ مِنْ خَلْقِكَ»\n" +
                "You may then mention your requests.\n" +
                "Many narrations have mentioned emphatically fasting on these three days and then performance of a two-unit prayer at midday (zohr) on Friday so that one’s requests are granted.\n";
        es3="\n" +
                "Ja’far al-Tayyar’s Prayer is as precious as gold, since it is the most magnificent recommended devotional rite. Altogether with its great merits the most important of which is that it erases major sins, this prayer has been reported through authenticated chain of authority. The best time of its performance is the first hours of daylight on Fridays. It consists of four units with two Tashahhuds (i.e. the part of prayers in which the two creeds of Islam are recited) and two Taslims. In the first unit, Surahs al-Faatehah and al-Zalzalah are recited, in the second, Surahs al-Faatehah and al-’Adiyat, in the third, Surahs al-Faatehah and al-Nasr, and in the fourth, Surahs al-Faatehah and al-Tawheed. In each unit, after the recitation of the Surahs and before the genuflection (Ruku’), the following litany (Tasbihat) should be repeated fifteen times:\n" +
                "\n" +
                "All glory be to Allah, all praise be to Allah, there is no god save Allah, and Allah is the Greatest.\n" +
                "\n" +
                "The same litany (Tasbihat) is repeated, yet ten times only, during the Ruku’, after the Ruku’ while standing erect, during the prostration (Sujud), after the first Sajdah, during the second Sajdah, and after the second Sajdah. The same thing is repeated in all of the four units of the prayer. Hence, the litany will have been repeated three hundred times.\n" +
                "\n" +
                "Shaykh al-Kulayni has narrated that Imam Ja’far al-Sadiq (a.s.) said to Abu-Sa’id al-Mada’ini, “May I teach you something that you should recite in Ja’far al-Tayyar’s Prayer?” As the man answered in the affirmative, the Imam (a.s.) said: After you say the Tasbihat in the second Sajdah of the fourth unit, say the following litany:\n" +
                "\n" +
                "Glory be to Him Who has dressed Himself dignity and sobriety! Glory be to Him Who has deigned and condescended with grandeur! Glory be to Him save Whom none is worthy of being glorified! Glory be to Him Whose knowledge has counted all things! Glory be to the Lord of bounty and boon! Glory be to the Lord of omnipotence and nobility! O Allah, I beseech You in the name of the objects of dignity in Your Throne, •in the name of the utmost of mercy in Your Book, and in the name of Your Greatest Name and Your Accomplished Words, which have been accomplished truly and justly, (please) send blessings to Muhammad and his Household...\n" +
                "\n" +
                "Then, you may mention your needs in the form of supplication.\n" +
                "\n" +
                "Shaykh al-Tusi and Sayyid Ibn Tawus both narrated that al-Mufaddal ibn ‘Umar said that he heard Imam Ja’far al-Sadiq (a.s.) saying the following supplicatory prayer after accomplishing Ja’far al-Tayyar’s Prayer:\n" +
                "\n" +
                "O Lord, O Lord!\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "O my Lord, O my Lord!\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "Lord, Lord!\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "O Allah, O Allah\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "O Ever-living, O Ever- living!\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "O All-merciful, O All- merciful!\n" +
                "\n" +
                "Say it as many times as possible in one breath.\n" +
                "\n" +
                "O All-compassionate, O All-compassionate!\n" +
                "\n" +
                "Repeat it seven times.\n" +
                "\n" +
                "O Most Merciful of all those who show mercy!\n" +
                "\n" +
                "Repeat it seven times.\n" +
                "\n" +
                "Then, say the following:\n" +
                "\n" +
                "O Allah, I commence my wording with declaring praise to You, I utter the words of tribute to You, I glorify You although Your glory is limitless, and I compliment You although none can ever compliment You as much as You deserve and none can ever attain the extent of Your glory! And how can Your creatures ever recognize Your glory [in its actual measure]! And how can there be any moment for which You do not deserve praise due to Your favors and in which You are not ascribed to glory and in which You do not incessantly treat the sinful with Your forbearance? Although the inhabitants of Your earth have fallen behind in being obedient to You, You have been kind to them out of Your munificence, munificent out of Your favors, and liberal out of Your generosity. O He save Whom there is no god! O All- benevolent! O Lord of Glory and Honor!\n" +
                "\n" +
                "Al-Mufaddal then added: Imam Ja’far al-Sadiq (a.s.) then said to me, “If you have a significant request and you want it to be granted, you may offer this prayer, say this supplication, and implore Almighty Allah to respond to you. If you do, it will be granted, Allah willing.”\n" +
                "\n" +
                "Shaykh al-Tusi has narrated that Imam al-Sadiq (a.s.) recommended the following supplicatory prayer for having one’s requests granted:\n" +
                "\n" +
                "Observe fasting on consecutive Wednesday, Thursday, and Friday. At Thursday evening, give half bushel of food for ten poor people as alms. On Friday, wash yourself and go out to a wasteland and offer therein Ja’far al-Tayyar’s Prayer sticking your knees to the ground after you uncover them. You may then say the following supplicatory prayer:\n" +
                "\n" +
                "O He Who has shown only goodness and concealed the evil (deeds of His servants)! O He Who has not censured for the offenses and has not exposed the hidden! O He Who is Ample in pardoning! O He Who is Excellent in overlooking! O He Who is Liberal in forgiveness! O He Who opens His Hands wide with mercy! O He Who is present in all confidential talks! O He Who is the ultimate objective of all complaints! O He Who raises from falls! O He Who is Generous in condonation! O He Who is Great in conferring bounties! O He Who takes the initiative in favoring before they are deserved! O my Lord, O my Lord, O my Lord!\n" +
                "\n" +
                "Repeat this statement ten times.\n" +
                "\n" +
                "O Allah, O Allah, O Allah!\n" +
                "\n" +
                "Repeat it ten times, too.\n" +
                "\n" +
                "O my Master, O my Master!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O my Chief, O my Chief!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O my hope!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O my succor!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O ultimate of my desire!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O All-beneficent!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O All-merciful!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "O Giver of fortunes!\n" +
                "\n" +
                "Repeat it ten times.\n" +
                "\n" +
                "Bless Muhammad and the Household of Muhammad as much as and as decently as You have ever blessed any of Your creatures.\n" +
                "\n" +
                "You may then mention your requests.\n" +
                "\n" +
                "Many narrations have mentioned emphatically fasting on these three days and then performance of a two-unit prayer at midday on Friday so that one’s requests are granted.\n" +
                "\n";

        us0="نماز حضرت جعفر طیار علیہ السلام\n";
        us1="";
        us2="\n" +
                "(اس نماز کو اکسیر اعظم اور قربت احمر سے تعبیر کیا گیا ہے اور انتہائی معتبر اسناد کے ساتھ اس کے بیشمار فضائل وارد ہوئے ہیں جن میں بڑے بڑے گناہوں کی بخشش بھی شامل ہے۔ اس کا بہترین وقت روز جمعہ کا آغازہے۔ یہ چار رکعت نماز ہے دو تشہد و سلام کے ساتھ۔ پہلی رکعت میں سورۂ حمد کے بعد اذاذلزلت الارض ، دوسری رکعت میں سورۂ حمد کے بعد سورۂ والعادیات ، تیسری رکعت میں حمدکے بعد سورۂ اذا جاء نصراللہ اور چوتھی رکعت میں حمد کے قل ھو اللہ ۔ اور ہر رکعت میں قرأت کے بعد پندرہ مرتبہ:۔\n" +
                "سُبْحَانَ اللّٰهِ وَ الْحَمْدُ لِلّٰهِ وَ لَاۤ اِلٰهَ اِلَّا اللهُ وَ اللهُ اَكْبَرُ۔\n" +
                "اس کے بعد رکوع میں ، رکوع کے سر اٹھانے کے بعد پہلے سجدہ میں ، دونوں سجدوں کے درمیان، دوسرے سجدہ میں، دوسرے سجدہ کے بعد دس دس مرتبہ یہی تسبیحات پڑھے جس کا مجموعہ ہر رکعت میں ۷۵ مرتبہ ہو گا۔ شیخ کلینیؒ نے ابو سعید مدائنی سے روایت کی ہے کہ امام جعفر صادقؑ نے فرمایا کیا تمہیں ایسی چیز تعلیم نہ دوں جس کو تم نماز جعفر طیار میں پڑھا کرو تو میں نے عرض کی کہ بے شک۔ فرما یاجب چوتھی رکعت کے آخری سجدہ میں جاؤ تو تسبیحات اربعہ کے بعد یہ دعا پڑھو۔)\n" +
                "سُبْحَانَ مَنْ لَبِسَ الْعِزَّ وَ الْوَقَارَ سُبْحَانَ مَنْ تَعَطَّفَ بِالْمَجْدِ وَ تَكَرَّمَ بِهِ سُبْحَانَ مَنْ لَا يَنْبَغِيْ التَّسْبِيْحُ اِلَّا لَهُ سُبْحَانَ مَنْ اَحْصٰى كُلَّ شَيْ\u200Fءٍ عِلْمُهُ سُبْحَانَ ذِي الْمَنِّ وَ النِّعَمِ سُبْحَانَ ذِي الْقُدْرَةِ وَ الْكَرَمِ اَللّٰهُمَّ اِنِّي اَسْاَلُكَ بِمَعَاقِدِ الْعِزِّ مِنْ عَرْشِكَ وَ مُنْتَهَى الرَّحْمَةِ مِنْ كِتَابِكَ وَ اسْمِكَ الْاَعْظَمِ وَ كَلِمَاتِكَ التَّآمَّةِ الَّتِي تَمَّتْ صِدْقًا وَ عَدْلًا صَلِّ عَلٰى مُحَمَّدٍ وَ اَهْلِ بَيْتِهِ وَ افْعَلْ بِيْ كَذَا وَ كَذَا۔\n" +
                "(اس کے بعد اپنی حاجت طلب کرے ۔)\n" +
                "(شیخ ؒ اور سید ؒ نے مفضل بن عمر سے روایت کی ہے کہ میں نے امام جعفر صادقؑ کو دیکھا کہ آپ نے نماز جعفر طیار تمام کرنے بعد ہاتھوں کو بلند کیا اور اس طرح دعا پڑھی )\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَبِّ يَا رَبِّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَبَّاهُ يَا رَبَّاهُ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«رَبِّ رَبِّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا اَللهُ يَا اَللهُ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا حَىُّ يَا حَىُّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَحِيْمُ يَا رَحِيْمُ»\n" +
                "(سات مرتبہ )\n" +
                "«يَا رَحْمٰنُ يَا رَحْمٰنُ»\n" +
                "(سات مرتبہ )\n" +
                "«يَا اَرْحَمَ الرَّاحِمِيْنَ»\n" +
                "(اس کے بعد آپ نے یہ دعا پڑھی۔)\n" +
                "اَللّٰهُمَّ اِنِّيْ اَفْتَتِحُ الْقَوْلَ بِحَمْدِكَ وَ اَنْطِقُ بِالثَّنَاۤءِ عَلَيْكَ وَ اُمَجِّدُكَ وَ لَا غَايَةَ لِمَدْحِكَ وَ اُثْنِيْ عَلَيْكَ وَ مَنْ يَبْلُغُ غَايَةَ ثَنَاۤئِكَ وَ اَمَدَ مَجْدِكَ وَ اَنَّى لِخَلِيْقَتِكَ كُنْهُ مَعْرِفَةِ مَجْدِكَ وَ اَيَّ زَمَنٍ لَمْ تَكُنْ مَمْدُوْحًا بِفَضْلِكَ مَوْصُوْفًا بِمَجْدِكَ عَوَّادًا عَلَى الْمُذْنِبِيْنَ بِحِلْمِكَ تَخَلَّفَ سُكَّانُ اَرْضِكَ عَنْ طَاعَتِكَ فَكُنْتَ عَلَيْهِمْ عَطُوْفًا بِجُوْدِكَ جَوَادًا بِفَضْلِكَ عَوَّادًا بِكَرَمِكَ يَا لَاۤ اِلٰهَ اِلَّا اَنْتَ الْمَنَّانُ ذُو الْجَلَالِ وَ الْاِكْرَامِ۔\n" +
                "(اس کے بعد حضرت نے فرمایا کہ اے مفضل جب بھی کوئی حاجت در پیش ہو تو نماز جعفر طیا رادا کر کے اس دعا کو پڑھو اور پروردگار سے حاجت طلب کرو۔ انشہ حاجت پوری ہو جائے گی۔)\n" +
                "(مؤلف : شیخ طوسیؒ نے حاجت برآری کہ لئے امام صادقؑ سے روایت کی ہے کہ بدھ، جمعرات ، جمعہ کو روزہ رکھو اور جمعرات کےدن جب شام تک وقت ہو جائے تو دس مساکین کو تین پاؤ فی کس کے حساب دے صدقہ دو اور جمعہ کے دن غسل کر کے صحرا میں جا کر نماز جعفر طیار ادا کرو اور پھر گھٹنے کھول کر زمین سے ملا کر یہ دعا پڑھو۔)\n" +
                "يَا مَنْ اَظْهَرَ الْجَمِيْلَ وَ سَتَرَ [عَلَيَ\u200F] الْقَبِيْحَ يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيْرَةِ وَ لَمْ يَهْتِكِ السِّتْرَ يَا عَظِيْمَ الْعَفْوِ يَا حَسَنَ التَّجَاوُزِ يَا وَاسِعَ الْمَغْفِرَةِ يَا بَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ يَا صَاحِبَ كُلِّ نَجْوٰى وَ مُنْتَهٰى كُلِّ شَكْوٰى يَا مُقِيْلَ الْعَثَرَاتِ يَا كَرِيْمَ الصَّفْحِ يَا عَظِيْمَ الْمَنِّ يَا مُبْتَدِئًا بِالنِّعَمِ قَبْلَ اسْتِحْقَاقِهَا يَا رَبَّاهُ يَا رَبَّاهُ يَا رَبَّاهُ،\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "يَا اَللهُ يَا اَللهُ يَا اَللهُ\u200F\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "يَا سَیِّدَاهُ يَا سَيِّدَاهُ\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا مَوْلَايَاهُ،يَا مَوْلَايَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَجَاۤءَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا غِيَاثَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا غَايَةَ رَغَبَتَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَحْمٰنُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَحِيْمُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا مُعْطِىَ الْخَيْرَاتِ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ كَثِيْرًا طَيِّبًا كَاَفْضَلِ مَا صَلَّيْتَ عَلٰى اَحَدٍ مِنْ خَلْقِكَ\n" +
                "مؤلف کا بیان ہے کہ ان تین دنوں میں روزہ اور روز جمعہ وقت زوال دو رکعت نماز حاجت میں بکثرت روایات وارد ہوئی ہیں۔)\n" +
                "\n";
        us3="\n" +
                "(اس نماز کو اکسیر اعظم اور قربت احمر سے تعبیر کیا گیا ہے اور انتہائی معتبر اسناد کے ساتھ اس کے بیشمار فضائل وارد ہوئے ہیں جن میں بڑے بڑے گناہوں کی بخشش بھی شامل ہے۔ اس کا بہترین وقت روز جمعہ کا آغازہے۔ یہ چار رکعت نماز ہے دو تشہد و سلام کے ساتھ۔ پہلی رکعت میں سورۂ حمد کے بعد اذاذلزلت الارض ، دوسری رکعت میں سورۂ حمد کے بعد سورۂ والعادیات ، تیسری رکعت میں حمدکے بعد سورۂ اذا جاء نصراللہ اور چوتھی رکعت میں حمد کے قل ھو اللہ ۔ اور ہر رکعت میں قرأت کے بعد پندرہ مرتبہ:۔\n" +
                "سُبْحَانَ اللّٰهِ وَ الْحَمْدُ لِلّٰهِ وَ لَاۤ اِلٰهَ اِلَّا اللهُ وَ اللهُ اَكْبَرُ۔\n" +
                "اس کے بعد رکوع میں ، رکوع کے سر اٹھانے کے بعد پہلے سجدہ میں ، دونوں سجدوں کے درمیان، دوسرے سجدہ میں، دوسرے سجدہ کے بعد دس دس مرتبہ یہی تسبیحات پڑھے جس کا مجموعہ ہر رکعت میں ۷۵ مرتبہ ہو گا۔ شیخ کلینیؒ نے ابو سعید مدائنی سے روایت کی ہے کہ امام جعفر صادقؑ نے فرمایا کیا تمہیں ایسی چیز تعلیم نہ دوں جس کو تم نماز جعفر طیار میں پڑھا کرو تو میں نے عرض کی کہ بے شک۔ فرما یاجب چوتھی رکعت کے آخری سجدہ میں جاؤ تو تسبیحات اربعہ کے بعد یہ دعا پڑھو۔)\n" +
                "سُبْحَانَ مَنْ لَبِسَ الْعِزَّ وَ الْوَقَارَ سُبْحَانَ مَنْ تَعَطَّفَ بِالْمَجْدِ وَ تَكَرَّمَ بِهِ سُبْحَانَ مَنْ لَا يَنْبَغِيْ التَّسْبِيْحُ اِلَّا لَهُ سُبْحَانَ مَنْ اَحْصٰى كُلَّ شَيْ\u200Fءٍ عِلْمُهُ سُبْحَانَ ذِي الْمَنِّ وَ النِّعَمِ سُبْحَانَ ذِي الْقُدْرَةِ وَ الْكَرَمِ اَللّٰهُمَّ اِنِّي اَسْاَلُكَ بِمَعَاقِدِ الْعِزِّ مِنْ عَرْشِكَ وَ مُنْتَهَى الرَّحْمَةِ مِنْ كِتَابِكَ وَ اسْمِكَ الْاَعْظَمِ وَ كَلِمَاتِكَ التَّآمَّةِ الَّتِي تَمَّتْ صِدْقًا وَ عَدْلًا صَلِّ عَلٰى مُحَمَّدٍ وَ اَهْلِ بَيْتِهِ وَ افْعَلْ بِيْ كَذَا وَ كَذَا۔\n" +
                "(اس کے بعد اپنی حاجت طلب کرے ۔)\n" +
                "(شیخ ؒ اور سید ؒ نے مفضل بن عمر سے روایت کی ہے کہ میں نے امام جعفر صادقؑ کو دیکھا کہ آپ نے نماز جعفر طیار تمام کرنے بعد ہاتھوں کو بلند کیا اور اس طرح دعا پڑھی )\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَبِّ يَا رَبِّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَبَّاهُ يَا رَبَّاهُ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«رَبِّ رَبِّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا اَللهُ يَا اَللهُ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا حَىُّ يَا حَىُّ»\n" +
                "(ایک سانس کے برابر)\n" +
                "«يَا رَحِيْمُ يَا رَحِيْمُ»\n" +
                "(سات مرتبہ )\n" +
                "«يَا رَحْمٰنُ يَا رَحْمٰنُ»\n" +
                "(سات مرتبہ )\n" +
                "«يَا اَرْحَمَ الرَّاحِمِيْنَ»\n" +
                "(اس کے بعد آپ نے یہ دعا پڑھی۔)\n" +
                "اَللّٰهُمَّ اِنِّيْ اَفْتَتِحُ الْقَوْلَ بِحَمْدِكَ وَ اَنْطِقُ بِالثَّنَاۤءِ عَلَيْكَ وَ اُمَجِّدُكَ وَ لَا غَايَةَ لِمَدْحِكَ وَ اُثْنِيْ عَلَيْكَ وَ مَنْ يَبْلُغُ غَايَةَ ثَنَاۤئِكَ وَ اَمَدَ مَجْدِكَ وَ اَنَّى لِخَلِيْقَتِكَ كُنْهُ مَعْرِفَةِ مَجْدِكَ وَ اَيَّ زَمَنٍ لَمْ تَكُنْ مَمْدُوْحًا بِفَضْلِكَ مَوْصُوْفًا بِمَجْدِكَ عَوَّادًا عَلَى الْمُذْنِبِيْنَ بِحِلْمِكَ تَخَلَّفَ سُكَّانُ اَرْضِكَ عَنْ طَاعَتِكَ فَكُنْتَ عَلَيْهِمْ عَطُوْفًا بِجُوْدِكَ جَوَادًا بِفَضْلِكَ عَوَّادًا بِكَرَمِكَ يَا لَاۤ اِلٰهَ اِلَّا اَنْتَ الْمَنَّانُ ذُو الْجَلَالِ وَ الْاِكْرَامِ۔\n" +
                "(اس کے بعد حضرت نے فرمایا کہ اے مفضل جب بھی کوئی حاجت در پیش ہو تو نماز جعفر طیا رادا کر کے اس دعا کو پڑھو اور پروردگار سے حاجت طلب کرو۔ انشہ حاجت پوری ہو جائے گی۔)\n" +
                "(مؤلف : شیخ طوسیؒ نے حاجت برآری کہ لئے امام صادقؑ سے روایت کی ہے کہ بدھ، جمعرات ، جمعہ کو روزہ رکھو اور جمعرات کےدن جب شام تک وقت ہو جائے تو دس مساکین کو تین پاؤ فی کس کے حساب دے صدقہ دو اور جمعہ کے دن غسل کر کے صحرا میں جا کر نماز جعفر طیار ادا کرو اور پھر گھٹنے کھول کر زمین سے ملا کر یہ دعا پڑھو۔)\n" +
                "يَا مَنْ اَظْهَرَ الْجَمِيْلَ وَ سَتَرَ [عَلَيَ\u200F] الْقَبِيْحَ يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيْرَةِ وَ لَمْ يَهْتِكِ السِّتْرَ يَا عَظِيْمَ الْعَفْوِ يَا حَسَنَ التَّجَاوُزِ يَا وَاسِعَ الْمَغْفِرَةِ يَا بَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ يَا صَاحِبَ كُلِّ نَجْوٰى وَ مُنْتَهٰى كُلِّ شَكْوٰى يَا مُقِيْلَ الْعَثَرَاتِ يَا كَرِيْمَ الصَّفْحِ يَا عَظِيْمَ الْمَنِّ يَا مُبْتَدِئًا بِالنِّعَمِ قَبْلَ اسْتِحْقَاقِهَا يَا رَبَّاهُ يَا رَبَّاهُ يَا رَبَّاهُ،\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "يَا اَللهُ يَا اَللهُ يَا اَللهُ\u200F\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "يَا سَیِّدَاهُ يَا سَيِّدَاهُ\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا مَوْلَايَاهُ،يَا مَوْلَايَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَجَاۤءَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا غِيَاثَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا غَايَةَ رَغَبَتَاهُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَحْمٰنُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا رَحِيْمُ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "«يَا مُعْطِىَ الْخَيْرَاتِ»\n" +
                "(اس کے بعد دس مرتبہ)\n" +
                "صَلِّ عَلٰى مُحَمَّدٍ وَ اٰلِ مُحَمَّدٍ كَثِيْرًا طَيِّبًا كَاَفْضَلِ مَا صَلَّيْتَ عَلٰى اَحَدٍ مِنْ خَلْقِكَ\n" +
                "مؤلف کا بیان ہے کہ ان تین دنوں میں روزہ اور روز جمعہ وقت زوال دو رکعت نماز حاجت میں بکثرت روایات وارد ہوئی ہیں۔)\n" +
                "\n";




        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);



        es0="NAMAZ OF IMAM AL-MAHDI (A) AT THE JAMKARAN MOSQUE\n" ;
        es1="";
        es2="In his book of al-Najm al-Thaqib, Shaykh al-Nuri, may Allah have mercy upon him, has quoted the story of building the mosque of Jamkaran, a town about five kilometers away from the holy city of Qum, by the command of the Patron of the Age (a.s.). He has thus quoted Imam al-Mahdi(a.s.) as saying to Hasan al-Mathulah of Jamkaran, “Advice people to visit frequently and venerably this place and to offer four units of prayer therein; two units as greeting of the mosque in each unit they should recite Surah al-Faatehah once and repeat Surah al-Tawheed (or al-Ikhlaas) seven times. In the genuflection (ruku') and prostration of this prayer, they may repeat the doxologies of glorifying God seven times. As for the other two-unit prayer, they may dedicate it to Imam al-Mahdi(a.s.). In the first unit, they may recite Surah al-Faatehah, but when they reach this holy verse, they should repeat it one hundred times:\n" +
                "اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ۔\n" +
                "They may then continue reciting this Surah. The same thing may be done in the second unit. The zikr of glorifying God that are said in the genuflection (ruku') and prostrations of the prayers may be repeated seven times in this prayer. Upon accomplishment of the prayer, they may repeat the tahlil statement (i.e. LA-ILAHA ILLA’LLAHU) one hundred times and then utter the Tasbih al-Zahra’. Immediately after that, they may prostrate themselves and repeat the invocation of blessings upon the Holy Prophet and his Household one hundred times.” Imam al-Mahdi(a.s.) added, “Whoever offers this prayer will be awarded the reward of offering prayer in the Holy Ka’bah.”\n" +
                "\n" +
                "\n" +
                "\n" ;
        es3="In his book of al-Najm al-Thaqib, Shaykh al-Nuri, may Allah have mercy upon him, has quoted the story of building the mosque of Jamkaran, a town about five kilometers away from the holy city of Qum, by the command of the Patron of the Age (a.s.). He has thus quoted Imam al-Mahdi(a.s.) as saying to Hasan al-Mathulah of Jamkaran, “Advice people to visit frequently and venerably this place and to offer four units of prayer therein; two units as greeting of the mosque in each unit they should recite Surah al-Faatehah once and repeat Surah al-Tawheed (or al-Ikhlaas) seven times. In the genuflection (ruku') and prostration of this prayer, they may repeat the doxologies of glorifying God seven times. As for the other two-unit prayer, they may dedicate it to Imam al-Mahdi(a.s.). In the first unit, they may recite Surah al-Faatehah, but when they reach this holy verse, they should repeat it one hundred times:\n" +
                "اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ۔\n" +
                "They may then continue reciting this Surah. The same thing may be done in the second unit. The zikr of glorifying God that are said in the genuflection (ruku') and prostrations of the prayers may be repeated seven times in this prayer. Upon accomplishment of the prayer, they may repeat the tahlil statement (i.e. LA-ILAHA ILLA’LLAHU) one hundred times and then utter the Tasbih al-Zahra’. Immediately after that, they may prostrate themselves and repeat the invocation of blessings upon the Holy Prophet and his Household one hundred times.” Imam al-Mahdi(a.s.) added, “Whoever offers this prayer will be awarded the reward of offering prayer in the Holy Ka’bah.”\n" +
                "\n" +
                "\n" +
                "\n" ;
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);

        es0="PRAYER OF IMAM MAHDI ON NIGHT OF FRIDAY (SHAB E JUMUAH)\n";
        es1="";
        es2="Quoting the book of Kunuz al-Najah by Shaykh al-Yabrisi, the author of al-Najm al-Thaqib mentioned the following statement to have come from the Holy Region (i.e. Imam al-Mahdi): “Whoever has a request to be urgently granted by Almighty Allah, may bathe himself after midnight at a Friday night, directs towards his place of prayer, and offers a two unit prayer. In the first unit, he may recite Surah al-Faatehah, but when he reaches this holy verse, he should repeat it one hundred times:\n" +
                "اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ۔\n" +
                "He may then continue reciting this Surah. After that, he may recite Surah al-Tawheed one time only. In the genuflection (ruku') of each unit, he may repeat the genuflection (ruku') doxology (zikr) seven times:\n" +
                "سُبْحَانَ رَبِّىَ الْعَظِيْمِ وَ بِحَمْدِهِ۔\n" +
                "In the two prostrations of each unit, he may repeat the prostration doxology (zikr) seven times:\n" +
                "سُبْحَانَ رَبِّىَ الْاَعْلٰى وَ بِحَمْدِهِ۔\n" +
                "Upon accomplishment of the prayer, he may beseech Almighty Allah using this supplicatory prayer. If he does, Almighty Allah will most certainly grant him his request unless it results in rupture of relations with one’s relatives:\n" +
                "اَللّٰهُمَّ اِنْ اَطَعْتُكَ فَالْمَحْمِدَةُ لَكَ وَ اِنْ عَصَيْتُكَ فَالْحُجَّةُ لَكَ مِنْكَ الرَّوْحُ وَ مِنْكَ الْفَرَجُ سُبْحَانَ مَنْ اَنْعَمَ وَ شَكَرَ سُبْحَانَ مَنْ قَدَّرَ وَ غَفَرَ اَللّٰهُمَّ اِنْ كُنْتُ عَصَيْتُكَ فَاِنِّىْ قَدْ اَطَعْتُكَ فِىْ اَحَبِّ الْاَشْيَاۤءِ اِلَيْكَ وَ هُوَ الْاِ يْمَانُ بِكَ لَمْ اَتَّخِذْ لَكَ وَلَدًا وَّ لَمْ اَدْعُ لَكَ شَرِيْكًا مَّنًّا مِّنْكَ بِهِ عَلَىَّ لَا مَنًّا مِّنِّىْ بِهِ عَلَيْكَ وَ قَدْ عَصَيْتُكَ يَاۤ اِلٰهِىْ عَلٰى غَيْرِ وَجْهِ الْمُكَابَرَةِ وَ لَا الْخُرُوْجِ عَنْ عُبُوْدِيَّتِكَ وَلَا الْجُحُوْدِ لِرُبُوْبِيَّتِكَ وَلٰكِنْ اَطَعْتُ هَوَاىَ وَ اَزَلَّنِىْ الشَّيْطَانُ فَلَكَ الْحُجَّةُ عَلَىَّ وَ الْبَيَانُ فَاِنْ تُعَذِّبْنِىْ فَبِذُنُوْبِىْ غَيْرُ ظَالِمٍ لِىْ وَ اِنْ تَغْفِرْلِىْ وَ تَرْحَمْنِىْ فَاِنَّكَ جَوَادٌ كَرِيْمٌ۔\n" +
                "You may then repeat this word as much as one breathe takes:\n" +
                "يَا كَرِيْمُ،يَا كَرِيْمُ۔\n" +
                "You may then continue, saying:\n" +
                "يَا اٰمِنًا مِّنْ كُلِّ شَيْى ءٍ وَ كُلُّ شَيْى ءٍ مِنْكَ خَاۤئِفٌ حَذِرٌ اَسْئَلُكَ بِاَمْنِكَ مِنْ كُلِّ شَيْى ءٍ وَ خَوْفِ كُلِّ شَيْى ءٍ مِنْكَ اَنْ تُصَلِّىَ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ اَنْ تُعْطِيَنِىْ اَمَانًا لِنَفْسِىْ وَ اَهْلِىْ وَ مَالِيْ وَ وَلَدِىْ وَ سَاۤئِرِ مَا اَنْعَمْتَ بِهِ عَلَىَّ حَتّٰى لَااَخَافَ وَ لَا اَحْذَرَ مِنْ شَيْى ءٍ اَبَدًا اِنَّكَ عَلٰى كُلِّ شَيْى ءٍ قَدِيْرٌ وَ حَسْبُنَا اللّٰهُ وَ نِعْمَ الْوَكِيْلُ يَا كَافِىَ اِبْرَاهِيْمَ نُمْرُوْدَ وَ يَا كَافِىَ مُوْسٰى فِرْعَوْنَ اَسْئَلُكَ اَنْ تُصَلِّىَ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ اَنْ تَكْفِيَنِىْ شَرَّ فَلَانُ بْنُ فُلَانٍ۔\n" +
                "You may now mention the one whom you anticipate to harm you by name and the father’s name (i.e. so-and-so the son of so-and-so) and beseech Almighty Allah to repel his harm and save from his evils. Most certainly, Almighty Allah will do, if He wills.\n" +
                "Then, you may prostrate yourself, submit your request, and beseech Almighty Allah earnestly and purely. Verily, if any believing man or woman offers this prayer and says this supplicatory prayer, the doors to the heavens will be opened before him/her so that his/her requests will be granted and his/her prayer will be immediately responded, no matter what his/her prayer may be. This is one of the favors Almighty Allah has bestowed upon people and upon us.”\n" +
                "The venerable son of Shaykh al-Yabrisi; namely, Radi al-Din Hasan ibn al-Fadl, has reported this prayer too in the book of Makarim al-Akhlaq with little difference in the supplicatory prayer. In the prefatory statement, he has added the word qad (surely) after kuntu (have been), the word ahadan (anyone) after the word akhafa (fear), and the word as’aluka (I beseech You) after the word fir’awna (Pharaoh). However, the other words of the supplicatory prayer are the same.\n" +
                "\n" +
                "\n";
        es3="Quoting the book of Kunuz al-Najah by Shaykh al-Yabrisi, the author of al-Najm al-Thaqib mentioned the following statement to have come from the Holy Region (i.e. Imam al-Mahdi): “Whoever has a request to be urgently granted by Almighty Allah, may bathe himself after midnight at a Friday night, directs towards his place of prayer, and offers a two unit prayer. In the first unit, he may recite Surah al-Faatehah, but when he reaches this holy verse, he should repeat it one hundred times:\n" +
                "اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ۔\n" +
                "He may then continue reciting this Surah. After that, he may recite Surah al-Tawheed one time only. In the genuflection (ruku') of each unit, he may repeat the genuflection (ruku') doxology (zikr) seven times:\n" +
                "سُبْحَانَ رَبِّىَ الْعَظِيْمِ وَ بِحَمْدِهِ۔\n" +
                "In the two prostrations of each unit, he may repeat the prostration doxology (zikr) seven times:\n" +
                "سُبْحَانَ رَبِّىَ الْاَعْلٰى وَ بِحَمْدِهِ۔\n" +
                "Upon accomplishment of the prayer, he may beseech Almighty Allah using this supplicatory prayer. If he does, Almighty Allah will most certainly grant him his request unless it results in rupture of relations with one’s relatives:\n" +
                "اَللّٰهُمَّ اِنْ اَطَعْتُكَ فَالْمَحْمِدَةُ لَكَ وَ اِنْ عَصَيْتُكَ فَالْحُجَّةُ لَكَ مِنْكَ الرَّوْحُ وَ مِنْكَ الْفَرَجُ سُبْحَانَ مَنْ اَنْعَمَ وَ شَكَرَ سُبْحَانَ مَنْ قَدَّرَ وَ غَفَرَ اَللّٰهُمَّ اِنْ كُنْتُ عَصَيْتُكَ فَاِنِّىْ قَدْ اَطَعْتُكَ فِىْ اَحَبِّ الْاَشْيَاۤءِ اِلَيْكَ وَ هُوَ الْاِ يْمَانُ بِكَ لَمْ اَتَّخِذْ لَكَ وَلَدًا وَّ لَمْ اَدْعُ لَكَ شَرِيْكًا مَّنًّا مِّنْكَ بِهِ عَلَىَّ لَا مَنًّا مِّنِّىْ بِهِ عَلَيْكَ وَ قَدْ عَصَيْتُكَ يَاۤ اِلٰهِىْ عَلٰى غَيْرِ وَجْهِ الْمُكَابَرَةِ وَ لَا الْخُرُوْجِ عَنْ عُبُوْدِيَّتِكَ وَلَا الْجُحُوْدِ لِرُبُوْبِيَّتِكَ وَلٰكِنْ اَطَعْتُ هَوَاىَ وَ اَزَلَّنِىْ الشَّيْطَانُ فَلَكَ الْحُجَّةُ عَلَىَّ وَ الْبَيَانُ فَاِنْ تُعَذِّبْنِىْ فَبِذُنُوْبِىْ غَيْرُ ظَالِمٍ لِىْ وَ اِنْ تَغْفِرْلِىْ وَ تَرْحَمْنِىْ فَاِنَّكَ جَوَادٌ كَرِيْمٌ۔\n" +
                "You may then repeat this word as much as one breathe takes:\n" +
                "يَا كَرِيْمُ،يَا كَرِيْمُ۔\n" +
                "You may then continue, saying:\n" +
                "يَا اٰمِنًا مِّنْ كُلِّ شَيْى ءٍ وَ كُلُّ شَيْى ءٍ مِنْكَ خَاۤئِفٌ حَذِرٌ اَسْئَلُكَ بِاَمْنِكَ مِنْ كُلِّ شَيْى ءٍ وَ خَوْفِ كُلِّ شَيْى ءٍ مِنْكَ اَنْ تُصَلِّىَ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ اَنْ تُعْطِيَنِىْ اَمَانًا لِنَفْسِىْ وَ اَهْلِىْ وَ مَالِيْ وَ وَلَدِىْ وَ سَاۤئِرِ مَا اَنْعَمْتَ بِهِ عَلَىَّ حَتّٰى لَااَخَافَ وَ لَا اَحْذَرَ مِنْ شَيْى ءٍ اَبَدًا اِنَّكَ عَلٰى كُلِّ شَيْى ءٍ قَدِيْرٌ وَ حَسْبُنَا اللّٰهُ وَ نِعْمَ الْوَكِيْلُ يَا كَافِىَ اِبْرَاهِيْمَ نُمْرُوْدَ وَ يَا كَافِىَ مُوْسٰى فِرْعَوْنَ اَسْئَلُكَ اَنْ تُصَلِّىَ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ اَنْ تَكْفِيَنِىْ شَرَّ فَلَانُ بْنُ فُلَانٍ۔\n" +
                "You may now mention the one whom you anticipate to harm you by name and the father’s name (i.e. so-and-so the son of so-and-so) and beseech Almighty Allah to repel his harm and save from his evils. Most certainly, Almighty Allah will do, if He wills.\n" +
                "Then, you may prostrate yourself, submit your request, and beseech Almighty Allah earnestly and purely. Verily, if any believing man or woman offers this prayer and says this supplicatory prayer, the doors to the heavens will be opened before him/her so that his/her requests will be granted and his/her prayer will be immediately responded, no matter what his/her prayer may be. This is one of the favors Almighty Allah has bestowed upon people and upon us.”\n" +
                "The venerable son of Shaykh al-Yabrisi; namely, Radi al-Din Hasan ibn al-Fadl, has reported this prayer too in the book of Makarim al-Akhlaq with little difference in the supplicatory prayer. In the prefatory statement, he has added the word qad (surely) after kuntu (have been), the word ahadan (anyone) after the word akhafa (fear), and the word as’aluka (I beseech You) after the word fir’awna (Pharaoh). However, the other words of the supplicatory prayer are the same.\n" +
                "\n" +
                "\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";


        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="Prayer for Concentration\n";
        es1="";
        es2="Ahmad bn Ibrahim said: I complain to Abu Ja'afar, Muhammad bn Uthman that I am interested to see our master (peace be upon him) he said to me: with interest you desire to see him? Yes I replied. Be grateful to God for your interest, he said to me, and I would show you his direction in good health and at ease, O' Abu Abdullah don't solicit to see him because the days of occultation are yearning to see him and don't request to convene with him[1] because it is a firm resolution of God and it is better you submitted to it but you concentrate to him through Ziyarah (prayer). Regards what shall be his duty is what Muhammad bn Ali dictated to him as follows:\n" +
                "Give concentration to Imam with Ziyarah after you have offered twelve units (Raka'at) of prayer, in every unit you recite Suratul Ikhlas and after every two units you terminate your prayer, you send salutation to Muhammad and his progeny after finishing and recite the following words of God:\n" +
                "«سَلَامٌ عَلٰى اٰلِ يَاسِيْن»، ذٰلِكَ هُوَ الْفَضْلُ الْمُبِيْنِ مِنْ عِنْدِاللهِ، وَاللهُ ذُوالْفَضْلِ الْعَظِيْمِ، اِمَامُهُ مَنْ يَهْدِيْهِ صِرَاطَهُ الْمُسْتَقِيْمِ، قَدْ اٰتاكُمُ اللهُ خِلَافَتَهُ يا اٰلَ يَاسِيْن۔۔۔۔\n";
        es3="Ahmad bn Ibrahim said: I complain to Abu Ja'afar, Muhammad bn Uthman that I am interested to see our master (peace be upon him) he said to me: with interest you desire to see him? Yes I replied. Be grateful to God for your interest, he said to me, and I would show you his direction in good health and at ease, O' Abu Abdullah don't solicit to see him because the days of occultation are yearning to see him and don't request to convene with him[1] because it is a firm resolution of God and it is better you submitted to it but you concentrate to him through Ziyarah (prayer). Regards what shall be his duty is what Muhammad bn Ali dictated to him as follows:\n" +
                "Give concentration to Imam with Ziyarah after you have offered twelve units (Raka'at) of prayer, in every unit you recite Suratul Ikhlas and after every two units you terminate your prayer, you send salutation to Muhammad and his progeny after finishing and recite the following words of God:\n" +
                "«سَلَامٌ عَلٰى اٰلِ يَاسِيْن»، ذٰلِكَ هُوَ الْفَضْلُ الْمُبِيْنِ مِنْ عِنْدِاللهِ، وَاللهُ ذُوالْفَضْلِ الْعَظِيْمِ، اِمَامُهُ مَنْ يَهْدِيْهِ صِرَاطَهُ الْمُسْتَقِيْمِ، قَدْ اٰتاكُمُ اللهُ خِلَافَتَهُ يا اٰلَ يَاسِيْن۔۔۔۔\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="Prayer for relief and it's Supplication\n";
        es1="";
        es2="This prayer was taught by the leader of the time (peace be upon him) to a man in order to propel his worries.\n" +
                "Abu Ja'afar, Muhammad bn Jareer Tabari in Musnad Fatimah (peace be on her) said: Abu Al-Husein (the writer) said: I imitated an action from my father, Mansur bn Saalihaan, it happen between me and him that I was necessitated to be in hidden.\n" +
                "I remained hiding with fear until Friday night when I decided to visit the grave yard of Quraysh, I sanctioned in the house for prayer and supplication and it was a raining night, I inquired bn Ja'afar Al-Qayyim to banned the door and try to vacate the place as I will like to be in seclusion for prayers and supplications and he should secure from entering those he did not trust, he did as I instructed him, at the midnight wind started blowing together with rain fall till it prevent people from coming to the place.\n" +
                "I remained there, praying, offering Ziyarah and in this condition I heard pressure from my master, Musa (peace be upon him) suddenly there is a man offering Ziyarah, he saluted Adam and other endowed Prophets (peace be on them) then the Imams (peace be on them) one after the other until he reach the leader of the time (peace be upon him) and I was surprise that he did not mention him, I said to myself, probably he may forget or he is ignorant of the Imam or that is the sect he believed on, he offer two units of prayer after his Ziyarah, he then approach our master Abu Ja'afar (peace be upon him) and offer his prayers and Ziyarah and send his salutations as he does before, I begin to entertain fear because the man was not familiar with me. The man is young wearing white cloth with Turban round his chin, he said to me, O' Aba Husein bn Abi Al-ala, why are you far from the prayer of relief? Which of it O' my master? He said:\n" +
                "Observe two units of prayer and recite the following:\n" +
                "يَا مَنْ اَظْهَرَ الْجَمِيْلَ وَسَتَرَ الْقَبِيْحَ، يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيْرَةِ وَلَمْ يَهْتِكِ السِّتْرَ، يَا عَظِيْمَ الْمَنِّ، يَا كَرِيْمَ الصَّفْحِ، يَا مُبْتَدِئَ النِّعَمِ قَبْلَ اسْتِحْقَاقِهَا، يَا حَسَنَ التَّجَاوُزِ، يَا وَاسِعَ الْمَغْفِرَةِ، يَابَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ، يَا مُنْتَهٰى كُلِّ نَجْوىٰ، وَيَا غَايَةَ كُلِّ شَكْوىٰ، وَيَا عَوْنَ كُلِّ مُسْتَعِيْنٍ، يَا مُبْتَدِئًا بِالنِّعَمِ قَبْلَ اسْتِحْقاقِها،\n" +
                "Then say 100 times:\n" +
                "«يَا رَبَّاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا سَيِّدَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَامَوْلَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا غَايَتَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا مُنْتَهٰى رَغْبَتَاهُ»\n" +
                "Then say:\n" +
                "اَسْاَلُكَ بِحَقِّ هٰذِهِ الْاَسْمَاۤءِ، وَبِحَقِّ مُحَمَّدٍ وَاٰلِهِ الطَّاهِرِيْنَ عَلَيْهِمُ السَّلَامُ اِلَّا مَا كَشَفْتَ كَرْبِیْ، وَنَفَّسْتَ هَمِّيْ، وَفَرَّجْتَ عَنِّيْ، وَاَصْلَحْتَ حَالِيْ۔\n" +
                "You then put forward all your requests and needs, after you place your right cheek on the ground and recite the following supplications (100) one hundred times.\n" +
                "يَا مُحَمَّدُ يَا عَلِيُّ، يَا عَلِيُّ يَا مُحَمَّدُ، اِكْفِيَانِيْ فَاِنَّكُمَا كَافِيَانِيْ، وَانْصُرَانِيْ فَاِنَّكُمَا نَاصِرَانِيْ۔\n" +
                "Then you place your left cheek on the ground and recite the following 100 times\n" +
                "«اَدْرِكْني»\n" +
                "and you also recite the following till your last breath.\n" +
                "«اَلْغَوْثَ [الْغَوْثَ] الْغَوْثَ»\n" +
                "Then you raise your head. Verily God Almighty with His Generosity will grant your requests.\n" +
                "I was busy with the above prayer while the man left, when I finish I came to Ibn Ja'afar to inquire of the man from him but very surprising that I met the door closed and pad lucked, I thought within myself that he was inside with us without my knowledge, I draw the attention of Ja'afar Ibn Al-Qayyim, he came out and inquire from him about the coming in of the man, he said, the doors are closed and he didn't open them, I then narrate the incidence to him, he said to me: That is our master, the Imam of the time (peace be upon him), I have witness him in many occasions like this type of night when he secluded from people, indeed I regretted for what missed me.\n" +
                "I went out near to the dawn intending going to my hidden place, it was not yet noon while the companions of ibn Saalihaan seeking to meet with me asking of me from my friends and along with them security from the minister and coupon with his hand writing, I presented myself with my trusted friends, he stood to embrace me and treated me fine not as usual with him before and said: your situation has reach the extend you complain of me to the leader of the time (peace be upon him)?\n" +
                "Verily there was an affair and prayer from me, I replied: Woe unto you, said by ibn Saalihaan, I saw the Imam, the leader of the time (peace be upon him) in my dream yesterday (i.e. Friday night) he was commanding for good and avoidance of bad to the extend I became frighten, I said to him: there is no deity of worship except Allah, I bear witness that they are the truth and extreme fact, I saw the Imam face to face yesterday and said so and so to me, he was astonished when I explain the incidence to him and with the grace of Imam (peace be upon him) I attain from him what I did not thought of.[1]";
        es3="This prayer was taught by the leader of the time (peace be upon him) to a man in order to propel his worries.\n" +
                "Abu Ja'afar, Muhammad bn Jareer Tabari in Musnad Fatimah (peace be on her) said: Abu Al-Husein (the writer) said: I imitated an action from my father, Mansur bn Saalihaan, it happen between me and him that I was necessitated to be in hidden.\n" +
                "I remained hiding with fear until Friday night when I decided to visit the grave yard of Quraysh, I sanctioned in the house for prayer and supplication and it was a raining night, I inquired bn Ja'afar Al-Qayyim to banned the door and try to vacate the place as I will like to be in seclusion for prayers and supplications and he should secure from entering those he did not trust, he did as I instructed him, at the midnight wind started blowing together with rain fall till it prevent people from coming to the place.\n" +
                "I remained there, praying, offering Ziyarah and in this condition I heard pressure from my master, Musa (peace be upon him) suddenly there is a man offering Ziyarah, he saluted Adam and other endowed Prophets (peace be on them) then the Imams (peace be on them) one after the other until he reach the leader of the time (peace be upon him) and I was surprise that he did not mention him, I said to myself, probably he may forget or he is ignorant of the Imam or that is the sect he believed on, he offer two units of prayer after his Ziyarah, he then approach our master Abu Ja'afar (peace be upon him) and offer his prayers and Ziyarah and send his salutations as he does before, I begin to entertain fear because the man was not familiar with me. The man is young wearing white cloth with Turban round his chin, he said to me, O' Aba Husein bn Abi Al-ala, why are you far from the prayer of relief? Which of it O' my master? He said:\n" +
                "Observe two units of prayer and recite the following:\n" +
                "يَا مَنْ اَظْهَرَ الْجَمِيْلَ وَسَتَرَ الْقَبِيْحَ، يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيْرَةِ وَلَمْ يَهْتِكِ السِّتْرَ، يَا عَظِيْمَ الْمَنِّ، يَا كَرِيْمَ الصَّفْحِ، يَا مُبْتَدِئَ النِّعَمِ قَبْلَ اسْتِحْقَاقِهَا، يَا حَسَنَ التَّجَاوُزِ، يَا وَاسِعَ الْمَغْفِرَةِ، يَابَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ، يَا مُنْتَهٰى كُلِّ نَجْوىٰ، وَيَا غَايَةَ كُلِّ شَكْوىٰ، وَيَا عَوْنَ كُلِّ مُسْتَعِيْنٍ، يَا مُبْتَدِئًا بِالنِّعَمِ قَبْلَ اسْتِحْقاقِها،\n" +
                "Then say 100 times:\n" +
                "«يَا رَبَّاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا سَيِّدَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَامَوْلَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا غَايَتَاهُ»\n" +
                "Then say 100 times:\n" +
                "«يَا مُنْتَهٰى رَغْبَتَاهُ»\n" +
                "Then say:\n" +
                "اَسْاَلُكَ بِحَقِّ هٰذِهِ الْاَسْمَاۤءِ، وَبِحَقِّ مُحَمَّدٍ وَاٰلِهِ الطَّاهِرِيْنَ عَلَيْهِمُ السَّلَامُ اِلَّا مَا كَشَفْتَ كَرْبِیْ، وَنَفَّسْتَ هَمِّيْ، وَفَرَّجْتَ عَنِّيْ، وَاَصْلَحْتَ حَالِيْ۔\n" +
                "You then put forward all your requests and needs, after you place your right cheek on the ground and recite the following supplications (100) one hundred times.\n" +
                "يَا مُحَمَّدُ يَا عَلِيُّ، يَا عَلِيُّ يَا مُحَمَّدُ، اِكْفِيَانِيْ فَاِنَّكُمَا كَافِيَانِيْ، وَانْصُرَانِيْ فَاِنَّكُمَا نَاصِرَانِيْ۔\n" +
                "Then you place your left cheek on the ground and recite the following 100 times\n" +
                "«اَدْرِكْني»\n" +
                "and you also recite the following till your last breath.\n" +
                "«اَلْغَوْثَ [الْغَوْثَ] الْغَوْثَ»\n" +
                "Then you raise your head. Verily God Almighty with His Generosity will grant your requests.\n" +
                "I was busy with the above prayer while the man left, when I finish I came to Ibn Ja'afar to inquire of the man from him but very surprising that I met the door closed and pad lucked, I thought within myself that he was inside with us without my knowledge, I draw the attention of Ja'afar Ibn Al-Qayyim, he came out and inquire from him about the coming in of the man, he said, the doors are closed and he didn't open them, I then narrate the incidence to him, he said to me: That is our master, the Imam of the time (peace be upon him), I have witness him in many occasions like this type of night when he secluded from people, indeed I regretted for what missed me.\n" +
                "I went out near to the dawn intending going to my hidden place, it was not yet noon while the companions of ibn Saalihaan seeking to meet with me asking of me from my friends and along with them security from the minister and coupon with his hand writing, I presented myself with my trusted friends, he stood to embrace me and treated me fine not as usual with him before and said: your situation has reach the extend you complain of me to the leader of the time (peace be upon him)?\n" +
                "Verily there was an affair and prayer from me, I replied: Woe unto you, said by ibn Saalihaan, I saw the Imam, the leader of the time (peace be upon him) in my dream yesterday (i.e. Friday night) he was commanding for good and avoidance of bad to the extend I became frighten, I said to him: there is no deity of worship except Allah, I bear witness that they are the truth and extreme fact, I saw the Imam face to face yesterday and said so and so to me, he was astonished when I explain the incidence to him and with the grace of Imam (peace be upon him) I attain from him what I did not thought of.[1]";


        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);





        es0="Prayer seeking for Imam Mahdi's Help\n";
        es1="";
        es2="Sayyid Ali Khan in the book ''Al-kalim Attayyib'' said: this prayer to the leader of the time (peace be upon him) you offer two units (Raka'at) of prayer with Surah Alhamd with any other Surah, on conclusion you stood under the sky and recite the following:\n" +
                "سَلَامُ اللهِ الْكَامِلُ التَّامُّ الشَّامِلُ الْعَامُّ، وَصَلَوَاتُهُ الدَّاۤئِمَةُ وَبَرَكَاتُهُ الْقَاۤئِمَةُ التَّامَّةُ، عَلٰى حُجَّةِ اللهِ وَوَلِيِّهِ فِيْ اَرْضِهِ وَبِلَادِهِ، وَخَلِيْفَتِهِ عَلٰى خَلْقِهِ وَعِبَادِهِ، وَسُلَالَةِ النُّبُوَّةِ، وَبَقِيَّةِ الْعِتْرَةِ وَالصَّفْوَةِ، صَاحِبِ الزَّمَانِ، وَمُظْهِرِ الْاِيْمَانِ، وَمُلَقِّنِ اَحْكَامِ الْقُرْاٰنِ، وَمُطَهِّرِ الْاَرْضِ، وَنَاشِرِ الْعَدْلِ فِي الطُّوْلِ وَالْعَرْضِ، وَالْحُجَّةِ الْقَاۤئِمِ الْمَهْدِيِّ، اَلْاِمَامِ الْمُنْتَظَرِ الْمَرْضِيِّ، وَابْنِ الْاَئِمَّةِ الطَّاهِرِيْنَ، اَلْوَصِيِّ بْنِ الْاَوْصِيَاۤءِ الْمَرْضِيِّيْنَ، اَلْهَادِي الْمَعْصُوْمِ بْنِ الْاَئِمَّةِ الْهُدَاةِ الْمَعْصُوْمِيْنَ۔\n" +
                "اَلسَّلَامُ عَلَيْكَ يَا مُعِزَّ الْمُؤْمِنِيْنَ الْمُسْتَضْعَفِيْنَ، اَلسَّلَامُ عَلَيْكَ يَا مُذِلَّ الْكَافِرِيْنَ الْمُتَكَبِّرِيْنَ الظَّالِمِيْنَ۔ اَلسَّلَامُ عَلَيْكَ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ، اَلسَّلَامُ عَلَيْكَ يَابْنَ رَسُوْلِ اللهِ، اَلسَّلَامُ عَلَيْكَ يَابْنَ اَمِيْرِالْمُؤْمِنِيْنَ، اَلسَّلَامُ عَلَيْكَ يَابْنَ فَاطِمَةَ الزَّهْرَاۤءِ سَيِّدَةِ نِسَاۤءِ الْعَالَمِيْنَ، اَلسَّلَامُ عَلَيْكَ يَابْنَ الْاَئِمَّةِ الْحُجَجِ الْمَعْصُوْمِيْنَ وَالْاِمَامِ عَلَى الْخَلْقِ اَجْمَعِيْنَ، اَلسَّلَامُ عَلَيْكَ يَامَوْلَايَ سَلَامَ مُخْلِصٍ لَكَ فِي الْوِلَايَةِ۔\n" +
                "اَشْهَدُ اَنَّكَ الْاِمَامُ الْمَهْدِيُّ قَوْلًا وَفِعْلًا، وَاَنْتَ الَّذِيْ تَمْلَاُ الْاَرْضَ قِسْطًا وَعَدْلًا، بَعْدَ مَا مُلِئَتْ جَوْرًا وَظُلْمًا، فَعَجَّلَ اللهُ فَرَجَكَ، وَسَهَّلَ مَخْرَجَكَ، وَقَرَّبَ زَمَانَكَ، وَكَثَّرَ اَنْصَارَكَ وَاَعْوَانَكَ، وَاَنْجَزَ لَكَ مَا وَعَدَكَ، فَهُوَ اَصْدَقُ الْقَاۤئِلِيْنَ «وَنُرِيْدُاَنْ نَّمُنَّ عَلَى الَّذِيْنَ اسْتُضْعِفُوْا فِي الْاَرْضِ وَنَجْعَلَهُمْ اَئِمَّةً وَنَجْعَلَهُمُ الْوَارِثِيْنَ»۔\n" +
                "يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ، يَابْنَ رَسُوْلِ اللهِ، حَاجَتِيْ كَذَا وَكَذَا،\n" +
                "mention your request\n" +
                "After you recite the following:\n" +
                "فَاشْفَعْ لِيْ فِيْ نَجَاحِهَا، فَقَدْ تَوَجَّهْتُ اِلَيْكَ بِحَاجَتِيْ، لِعِلْمِيْ اَنَّ لَكَ عِنْدَ اللهِ شَفَاعَةً مَقْبُوْلَةً، وَمَقَامًا مَحْمُوْدًا، فَبِحَقِّ مَنِ اخْتَصَّكُمْ بِاَمْرِهِ، وَارْتَضَاكُمْ لِسِرِّهِ، وَبِالشَّاْنِ الَّذِيْ لَكُمْ عِنْدَ اللهِ بَيْنَكُمْ وَبَيْنَهُ، سَلِ اللهَ تَعَالٰى فِيْ نُجْحِ طَلِبَتِيْ، وَاِجَابَةِ دَعْوَتِيْ، وَكَشْفِ كُرْبَتِيْ۔\n" +
                "Then you put forward all your wishes, by the grace of God it will be accepted.[2]\n";
        es3="Sayyid Ali Khan in the book ''Al-kalim Attayyib'' said: this prayer to the leader of the time (peace be upon him) you offer two units (Raka'at) of prayer with Surah Alhamd with any other Surah, on conclusion you stood under the sky and recite the following:\n" +
                "سَلَامُ اللهِ الْكَامِلُ التَّامُّ الشَّامِلُ الْعَامُّ، وَصَلَوَاتُهُ الدَّاۤئِمَةُ وَبَرَكَاتُهُ الْقَاۤئِمَةُ التَّامَّةُ، عَلٰى حُجَّةِ اللهِ وَوَلِيِّهِ فِيْ اَرْضِهِ وَبِلَادِهِ، وَخَلِيْفَتِهِ عَلٰى خَلْقِهِ وَعِبَادِهِ، وَسُلَالَةِ النُّبُوَّةِ، وَبَقِيَّةِ الْعِتْرَةِ وَالصَّفْوَةِ، صَاحِبِ الزَّمَانِ، وَمُظْهِرِ الْاِيْمَانِ، وَمُلَقِّنِ اَحْكَامِ الْقُرْاٰنِ، وَمُطَهِّرِ الْاَرْضِ، وَنَاشِرِ الْعَدْلِ فِي الطُّوْلِ وَالْعَرْضِ، وَالْحُجَّةِ الْقَاۤئِمِ الْمَهْدِيِّ، اَلْاِمَامِ الْمُنْتَظَرِ الْمَرْضِيِّ، وَابْنِ الْاَئِمَّةِ الطَّاهِرِيْنَ، اَلْوَصِيِّ بْنِ الْاَوْصِيَاۤءِ الْمَرْضِيِّيْنَ، اَلْهَادِي الْمَعْصُوْمِ بْنِ الْاَئِمَّةِ الْهُدَاةِ الْمَعْصُوْمِيْنَ۔\n" +
                "اَلسَّلَامُ عَلَيْكَ يَا مُعِزَّ الْمُؤْمِنِيْنَ الْمُسْتَضْعَفِيْنَ، اَلسَّلَامُ عَلَيْكَ يَا مُذِلَّ الْكَافِرِيْنَ الْمُتَكَبِّرِيْنَ الظَّالِمِيْنَ۔ اَلسَّلَامُ عَلَيْكَ يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ، اَلسَّلَامُ عَلَيْكَ يَابْنَ رَسُوْلِ اللهِ، اَلسَّلَامُ عَلَيْكَ يَابْنَ اَمِيْرِالْمُؤْمِنِيْنَ، اَلسَّلَامُ عَلَيْكَ يَابْنَ فَاطِمَةَ الزَّهْرَاۤءِ سَيِّدَةِ نِسَاۤءِ الْعَالَمِيْنَ، اَلسَّلَامُ عَلَيْكَ يَابْنَ الْاَئِمَّةِ الْحُجَجِ الْمَعْصُوْمِيْنَ وَالْاِمَامِ عَلَى الْخَلْقِ اَجْمَعِيْنَ، اَلسَّلَامُ عَلَيْكَ يَامَوْلَايَ سَلَامَ مُخْلِصٍ لَكَ فِي الْوِلَايَةِ۔\n" +
                "اَشْهَدُ اَنَّكَ الْاِمَامُ الْمَهْدِيُّ قَوْلًا وَفِعْلًا، وَاَنْتَ الَّذِيْ تَمْلَاُ الْاَرْضَ قِسْطًا وَعَدْلًا، بَعْدَ مَا مُلِئَتْ جَوْرًا وَظُلْمًا، فَعَجَّلَ اللهُ فَرَجَكَ، وَسَهَّلَ مَخْرَجَكَ، وَقَرَّبَ زَمَانَكَ، وَكَثَّرَ اَنْصَارَكَ وَاَعْوَانَكَ، وَاَنْجَزَ لَكَ مَا وَعَدَكَ، فَهُوَ اَصْدَقُ الْقَاۤئِلِيْنَ «وَنُرِيْدُاَنْ نَّمُنَّ عَلَى الَّذِيْنَ اسْتُضْعِفُوْا فِي الْاَرْضِ وَنَجْعَلَهُمْ اَئِمَّةً وَنَجْعَلَهُمُ الْوَارِثِيْنَ»۔\n" +
                "يَا مَوْلَايَ يَا صَاحِبَ الزَّمَانِ، يَابْنَ رَسُوْلِ اللهِ، حَاجَتِيْ كَذَا وَكَذَا،\n" +
                "mention your request\n" +
                "After you recite the following:\n" +
                "فَاشْفَعْ لِيْ فِيْ نَجَاحِهَا، فَقَدْ تَوَجَّهْتُ اِلَيْكَ بِحَاجَتِيْ، لِعِلْمِيْ اَنَّ لَكَ عِنْدَ اللهِ شَفَاعَةً مَقْبُوْلَةً، وَمَقَامًا مَحْمُوْدًا، فَبِحَقِّ مَنِ اخْتَصَّكُمْ بِاَمْرِهِ، وَارْتَضَاكُمْ لِسِرِّهِ، وَبِالشَّاْنِ الَّذِيْ لَكُمْ عِنْدَ اللهِ بَيْنَكُمْ وَبَيْنَهُ، سَلِ اللهَ تَعَالٰى فِيْ نُجْحِ طَلِبَتِيْ، وَاِجَابَةِ دَعْوَتِيْ، وَكَشْفِ كُرْبَتِيْ۔\n" +
                "Then you put forward all your wishes, by the grace of God it will be accepted.[2]\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="Dedication of Prayer to Imam Mahdi atfs on Thursdays\n";
        es1="";
        es2="Abu Ja'afar Tusi in Misbaahul Kabeer said:\n" +
                "Prayer of dedication to Imam is eight units (Raka'at), it was narrated from them (peace be on them) on Friday a servant should observe eight units of prayer: he should dedicate four units out of it to the Prophet (peace be upon him and his progeny) and the remaining four should be dedicated to Fatimah (peace be on her).\n" +
                "On Saturday he should observe four units (Raka'at) dedicating it to the commander of the faithful (peace be upon him) this will continue till Thursday by offering four units every day for one Imam, thus Thursday will be the turn of Imam Sadiq (peace be upon him). Then the following Friday, he should observe eight units of prayer again, the first four should be dedicated to the holy Prophet (peace be upon him and his holy progeny) and the remaining four to Fatimah (peace be on her).\n" +
                "Then on Saturday he will continue offering four units dedicating it to every Imam commencing from Imam Musa bn Ja'afar (peace be upon him) till Thursday when he will dedicate four units to the Imam of the time (may our souls be sacrifice for him).\n" +
                "The supplication after every two units (Raka'at) is as follows:\n" +
                "اَللّٰهُمَّ اَنْتَ السَّلَامُ، وَمِنْكَ السَّلَامُ، وَاِلَيْكَ يَعُوْدُ السَّلَامُ، حَيِّنَا رَبَّنَا مِنْكَ بِالسَّلَامِ۔ اَللّٰهُمَّ اِنَّ هٰذِهِ الرَّكَعَاتِ هَدِيَّةٌ مِنِّيْ اِلَى الْحُجَّةِ بْنِ الْحَسَنِ، فَصَلِّ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَبَلِّغْهُ اِيَّاهَا، وَاَعْطِنِيْ اَفْضَلَ اَمَلِيْ وَرَجَاۤئِي فِيْكَ، وَفِيْ رَسُوْلِكَ صَلَوَاتُكَ عَلَيْهِ وَاٰلِهِ۔\n" +
                "Then you tender all your wishes before God.[2";
        es3="Abu Ja'afar Tusi in Misbaahul Kabeer said:\n" +
                "Prayer of dedication to Imam is eight units (Raka'at), it was narrated from them (peace be on them) on Friday a servant should observe eight units of prayer: he should dedicate four units out of it to the Prophet (peace be upon him and his progeny) and the remaining four should be dedicated to Fatimah (peace be on her).\n" +
                "On Saturday he should observe four units (Raka'at) dedicating it to the commander of the faithful (peace be upon him) this will continue till Thursday by offering four units every day for one Imam, thus Thursday will be the turn of Imam Sadiq (peace be upon him). Then the following Friday, he should observe eight units of prayer again, the first four should be dedicated to the holy Prophet (peace be upon him and his holy progeny) and the remaining four to Fatimah (peace be on her).\n" +
                "Then on Saturday he will continue offering four units dedicating it to every Imam commencing from Imam Musa bn Ja'afar (peace be upon him) till Thursday when he will dedicate four units to the Imam of the time (may our souls be sacrifice for him).\n" +
                "The supplication after every two units (Raka'at) is as follows:\n" +
                "اَللّٰهُمَّ اَنْتَ السَّلَامُ، وَمِنْكَ السَّلَامُ، وَاِلَيْكَ يَعُوْدُ السَّلَامُ، حَيِّنَا رَبَّنَا مِنْكَ بِالسَّلَامِ۔ اَللّٰهُمَّ اِنَّ هٰذِهِ الرَّكَعَاتِ هَدِيَّةٌ مِنِّيْ اِلَى الْحُجَّةِ بْنِ الْحَسَنِ، فَصَلِّ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَبَلِّغْهُ اِيَّاهَا، وَاَعْطِنِيْ اَفْضَلَ اَمَلِيْ وَرَجَاۤئِي فِيْكَ، وَفِيْ رَسُوْلِكَ صَلَوَاتُكَ عَلَيْهِ وَاٰلِهِ۔\n" +
                "Then you tender all your wishes before God.[2";

        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="Prayer for request on Friday\n";
        es1="";
        es2="Sayyid bn Taa'us (may Allah have mercy on him) said: I saw in \"Kanuzu nnajaah\" written by Jurist Abu Ali Al-Fadl bn Al-Hasan Tabrasi (may Allah have mercy on him). From Imam Al-Hujja (peace be upon him), Ahmad bn Darbi reported from Khazamah, on the authority of Abu Abdullah, Al-Husein bn Muhammad Al-Bazufari, he said: It came from Imam that whoever has a demand from Allah should take a bath on Friday night after midnight and observe two units (Raka'at) of prayer in his normal place of prayer, he recite in every unit Surah Alhamd till he reach {Iyyaka na'abudu wa Iyyaka nasta'een} he repeat it for (100) one hundred times, he then concludes the remaining part of the Surah including one Surah Al-Ikhlas, he then bow down and prostrate and read the glorification for (7)seven time, the second unit (Raka'at) is as same as the first one. On conclusion, he recites the following supplication, verily Allah will grant his request except break of relations.\n" +
                "The supplication is as follows:\n" +
                "اَللّٰهُمَّ اِنْ اَطَعْتُكَ فَالْمَحْمَدَةُ لَكَ، وَاِنْ عَصَيْتُكَ فَالْحُجَّةُ لَكَ، مِنْكَ الرَّوْحُ وَمِنْكَ الْفَرَجُ، سُبْحَانَ مَنْ اَنْعَمَ وَشَكَرَ، سُبْحَانَ مَنْ قَدَرَ وَغَفَرَ۔\n" +
                "اَللّٰهُمَّ اِنْ كُنْتُ قَدْ عَصَيْتُكَ، فَاِنِّي قَدْ اَطَعْتُكَ فِيْ اَحَبَّ الْاَشْيَاۤءِ اِلَيْكَ وَهُوَ الْاِيْمَانُ بِكَ، لَمْ اَتَّخِذْ لَكَ وَلَدًا، وَلَمْ اَدْعُ لَكَ شَرِيْكًا، مَنًّا مِنْكَ بِهِ عَلَيَّ لَا مَنًّا مِنِّيْ بِهِ عَلَيْكَ، وَقَدْ عَصَيْتُكَ يَا اِلٰهِيْ عَلٰى غَيْرِ وَجْهِ الْمُكَابَرَةِ، وَلَا الْخُرُوْجِ عَنْ عُبُوْدِيَّتِكَ، وَلَا الْجُحُوْدِ لِرُبُوْبِيَّتِكَ، وَلٰكِنْ اَطَعْتُ هَوَايَ، وَاَزَلَّنِيْ الشَّيْطَانُ، فَلَكَ الْحُجَّةُ عَلَيَّ وَالْبَيَانُ، فَاِنْ تُعَذِّبْنِيْ فَبِذُنُوْبِيْ غَيْرَ ظَالِمٍ، وَاِنْ تَغْفِرْ لِيْ وَتَرْحَمْنِيْ، فَاِنَّكَ جَوَادٌ كَرِيْمٌ، يَا كَرِيْمُ يَا كَرِيْمُ\n" +
                "(recite it till your last breath)\n" +
                "يَا اٰمِنًا مِنْ كُلِّ شَيْ ءٍ، وَكُلُّ شَيْ ءٍ مِنْكَ خَاۤئِفٌ حَذِرٌ، اَسْاَلُكَ بِاَمْنِكَ مِنْ كُلِّ شَيْ ءٍ، وَخَوْفِ كُلِّ شَيْ ءٍ مِنْكَ، اَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَاَنْ تُعْطِيَنِيْ اَمَانًا لِنَفْسِيْ وَاَهْلِيْ وَوَلَدِيْ، وَسَاۤئِرِ مَا اَنْعَمْتَ بِهِ عَلَيَّ، حَتَّى لَا اَخَافَ اَحَدًا، وَلَا اَحْذَرَ مِنْ شَيْ ءٍ اَبَدًا، اِنَّكَ عَلٰى كُلِّ شَيْ ءٍ قَدِيْرٌ، وَحَسْبُنَا اللهُ وَنِعْمَ الْوَكِيْلُ، يَا كَافِيَ اِبْرَاهِيْمَ نُمْرُوْدَ، يَا كَافِيَ مُوْسٰى فِرْعَوْنَ، اَسْاَلُكَ اَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَاَنْ تَكْفِيَنِيْ شَرَّفُلَانِ بْنِ فُلَانٍ\n" +
                "(You will be sufficed from the evil of whoever you are frightened of by the grace of God).\n" +
                "Then you prostrate in honour to Allah and tender your request, there is no any believing men or women that has observe this prayer and supplication with sincerity except the doors of Heaven opens for him for the acceptance of his prayer at that very particular time, base on the favour of Almighty Allah on us.[1]\n" +
                "\n";
        es3="Sayyid bn Taa'us (may Allah have mercy on him) said: I saw in \"Kanuzu nnajaah\" written by Jurist Abu Ali Al-Fadl bn Al-Hasan Tabrasi (may Allah have mercy on him). From Imam Al-Hujja (peace be upon him), Ahmad bn Darbi reported from Khazamah, on the authority of Abu Abdullah, Al-Husein bn Muhammad Al-Bazufari, he said: It came from Imam that whoever has a demand from Allah should take a bath on Friday night after midnight and observe two units (Raka'at) of prayer in his normal place of prayer, he recite in every unit Surah Alhamd till he reach {Iyyaka na'abudu wa Iyyaka nasta'een} he repeat it for (100) one hundred times, he then concludes the remaining part of the Surah including one Surah Al-Ikhlas, he then bow down and prostrate and read the glorification for (7)seven time, the second unit (Raka'at) is as same as the first one. On conclusion, he recites the following supplication, verily Allah will grant his request except break of relations.\n" +
                "The supplication is as follows:\n" +
                "اَللّٰهُمَّ اِنْ اَطَعْتُكَ فَالْمَحْمَدَةُ لَكَ، وَاِنْ عَصَيْتُكَ فَالْحُجَّةُ لَكَ، مِنْكَ الرَّوْحُ وَمِنْكَ الْفَرَجُ، سُبْحَانَ مَنْ اَنْعَمَ وَشَكَرَ، سُبْحَانَ مَنْ قَدَرَ وَغَفَرَ۔\n" +
                "اَللّٰهُمَّ اِنْ كُنْتُ قَدْ عَصَيْتُكَ، فَاِنِّي قَدْ اَطَعْتُكَ فِيْ اَحَبَّ الْاَشْيَاۤءِ اِلَيْكَ وَهُوَ الْاِيْمَانُ بِكَ، لَمْ اَتَّخِذْ لَكَ وَلَدًا، وَلَمْ اَدْعُ لَكَ شَرِيْكًا، مَنًّا مِنْكَ بِهِ عَلَيَّ لَا مَنًّا مِنِّيْ بِهِ عَلَيْكَ، وَقَدْ عَصَيْتُكَ يَا اِلٰهِيْ عَلٰى غَيْرِ وَجْهِ الْمُكَابَرَةِ، وَلَا الْخُرُوْجِ عَنْ عُبُوْدِيَّتِكَ، وَلَا الْجُحُوْدِ لِرُبُوْبِيَّتِكَ، وَلٰكِنْ اَطَعْتُ هَوَايَ، وَاَزَلَّنِيْ الشَّيْطَانُ، فَلَكَ الْحُجَّةُ عَلَيَّ وَالْبَيَانُ، فَاِنْ تُعَذِّبْنِيْ فَبِذُنُوْبِيْ غَيْرَ ظَالِمٍ، وَاِنْ تَغْفِرْ لِيْ وَتَرْحَمْنِيْ، فَاِنَّكَ جَوَادٌ كَرِيْمٌ، يَا كَرِيْمُ يَا كَرِيْمُ\n" +
                "(recite it till your last breath)\n" +
                "يَا اٰمِنًا مِنْ كُلِّ شَيْ ءٍ، وَكُلُّ شَيْ ءٍ مِنْكَ خَاۤئِفٌ حَذِرٌ، اَسْاَلُكَ بِاَمْنِكَ مِنْ كُلِّ شَيْ ءٍ، وَخَوْفِ كُلِّ شَيْ ءٍ مِنْكَ، اَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَاَنْ تُعْطِيَنِيْ اَمَانًا لِنَفْسِيْ وَاَهْلِيْ وَوَلَدِيْ، وَسَاۤئِرِ مَا اَنْعَمْتَ بِهِ عَلَيَّ، حَتَّى لَا اَخَافَ اَحَدًا، وَلَا اَحْذَرَ مِنْ شَيْ ءٍ اَبَدًا، اِنَّكَ عَلٰى كُلِّ شَيْ ءٍ قَدِيْرٌ، وَحَسْبُنَا اللهُ وَنِعْمَ الْوَكِيْلُ، يَا كَافِيَ اِبْرَاهِيْمَ نُمْرُوْدَ، يَا كَافِيَ مُوْسٰى فِرْعَوْنَ، اَسْاَلُكَ اَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَاٰلِ مُحَمَّدٍ، وَاَنْ تَكْفِيَنِيْ شَرَّفُلَانِ بْنِ فُلَانٍ\n" +
                "(You will be sufficed from the evil of whoever you are frightened of by the grace of God).\n" +
                "Then you prostrate in honour to Allah and tender your request, there is no any believing men or women that has observe this prayer and supplication with sincerity except the doors of Heaven opens for him for the acceptance of his prayer at that very particular time, base on the favour of Almighty Allah on us.[1]\n" +
                "\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);





        es0="NAMAZ E AYAAT\n";
        es1="";
        es2="Namaz-e-Ayaat becomes obligatory due the following four things:\n" +
                "1. Solar Eclipse\n" +
                "2. Lunar Eclipse\n" +
                "3. The prayer becomes Wajib even if the moon or the sun are partially eclipsed, and even if they do not engender any fear.\n" +
                "4. Earthquake, as an obligatory precaution, even if no one is frightened. Thunder and lightning, red and black cyclone and other similar celestial phenomena, which frightens most of the people; similarly for the terrestrial events like receding sea water, or falling mountains which engender fear in these circumstances, as per recommended precaution, Namaz-e-Ayaat be offered.\n" +
                "METHOD:\n" +
                "Islamic Law No. 1516. Namaz-e-Ayaat consists of two Rak'ats, and there are five Ruku in each. Its method is as follows: After making niyyat of offering the prayers, one should say takbir (Allahu Akbar) and recite Surah al-Hamd and the other Surah, and then perform the Ruku. Thereafter, he should stand and recite Surah al-Hamd and a Surah and then perform another Ruku. He should repeat this action five times, and, when he stands after the fifth Ruku, he should perform two Sajdah, and then stand up to perform the second Rak'at in the same manner as he has done in the first. Then he should recite tashahhud and Salam.\n" +
                "Islamic Law No. 1517. Namaz-e-Ayaat can also be offered in the following manner:\n" +
                "After making niyyat to offer Namaz-e-Ayaat, a person is allowed to say takbir and recite Surah al-Hamd and then divide the verses of the other Surah into five parts, and recite one verse or more or less, and thereafter perform the Ruku. He should then stand up and recite another part of the Surah (without reciting Surah al-Hamd) and then perform another Ruku. He should repeat this action, and finish that Surah before performing the fifth Ruku. For example, he may say: Bismillahir Rahmanir Rahim with the niyyat of reciting Surah al-Ikhlas, and perform the Ruku. He should then stand up and say, Qul huwallahu Ahad, and perform another Ruku. He should then stand up and say, Allahus Samad, and perform the third Ruku. Thereafter he should stand up again and say, Lam yalid walam yulad, and perform the fourth Ruku. Then he should stand up again and say, Walam yakullahu Kufuwan ahad, and then perform two Sajdah and then rise for the second Rak'at, the same way as the first Rak'at. At the end, he should recite tashahhud and Salam after the two Sajdah. It is also permissible to divide a Surah into less than five parts. In that event, however, it is necessary that when the Surah is over, one should recite Surah al-Hamd before the next Ruku.\n";
        es3="Namaz-e-Ayaat becomes obligatory due the following four things:\n" +
                "1. Solar Eclipse\n" +
                "2. Lunar Eclipse\n" +
                "3. The prayer becomes Wajib even if the moon or the sun are partially eclipsed, and even if they do not engender any fear.\n" +
                "4. Earthquake, as an obligatory precaution, even if no one is frightened. Thunder and lightning, red and black cyclone and other similar celestial phenomena, which frightens most of the people; similarly for the terrestrial events like receding sea water, or falling mountains which engender fear in these circumstances, as per recommended precaution, Namaz-e-Ayaat be offered.\n" +
                "METHOD:\n" +
                "Islamic Law No. 1516. Namaz-e-Ayaat consists of two Rak'ats, and there are five Ruku in each. Its method is as follows: After making niyyat of offering the prayers, one should say takbir (Allahu Akbar) and recite Surah al-Hamd and the other Surah, and then perform the Ruku. Thereafter, he should stand and recite Surah al-Hamd and a Surah and then perform another Ruku. He should repeat this action five times, and, when he stands after the fifth Ruku, he should perform two Sajdah, and then stand up to perform the second Rak'at in the same manner as he has done in the first. Then he should recite tashahhud and Salam.\n" +
                "Islamic Law No. 1517. Namaz-e-Ayaat can also be offered in the following manner:\n" +
                "After making niyyat to offer Namaz-e-Ayaat, a person is allowed to say takbir and recite Surah al-Hamd and then divide the verses of the other Surah into five parts, and recite one verse or more or less, and thereafter perform the Ruku. He should then stand up and recite another part of the Surah (without reciting Surah al-Hamd) and then perform another Ruku. He should repeat this action, and finish that Surah before performing the fifth Ruku. For example, he may say: Bismillahir Rahmanir Rahim with the niyyat of reciting Surah al-Ikhlas, and perform the Ruku. He should then stand up and say, Qul huwallahu Ahad, and perform another Ruku. He should then stand up and say, Allahus Samad, and perform the third Ruku. Thereafter he should stand up again and say, Lam yalid walam yulad, and perform the fourth Ruku. Then he should stand up again and say, Walam yakullahu Kufuwan ahad, and then perform two Sajdah and then rise for the second Rak'at, the same way as the first Rak'at. At the end, he should recite tashahhud and Salam after the two Sajdah. It is also permissible to divide a Surah into less than five parts. In that event, however, it is necessary that when the Surah is over, one should recite Surah al-Hamd before the next Ruku.\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);



        es0="NAMAZ E WAHSHAT\n";
        es1="";
        es2="The prayer to be offered at the burial night consists of two units. In the first unit, Surah al-Faatehah and Ayah al-Kursi are recited. In the second unit, Surah al-Faatehah is recited one time and Surah al-Qadr repeated ten times. When you say the Taslim statement, you may say the following supplication:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّابْعَثْ ثَوَابَهَا اِلٰى قَبْرِ ۔۔۔\n" +
                "ANOTHER NAMAZ AT THE BURIAL NIGHT\n" +
                "Sayyid Ibn Tawus, may Allah have mercy upon him, has reported that the Holy Prophet (s.a.w.a.) said, “The harshest time for a dead is his first night in the grave. Therefore, have mercy upon your dead people through almsgiving. If you do not have anything to give as alms, you may offer a two-unit prayer, reciting Surah al-Faatehah once and Surah al-Tawheed twice in the first unit and Surah al-Faatehah once and Surah al-Takathur ten times in the second unit. When you accomplish the prayer (by uttering the Taslim statement), you may say the following:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّابْعَثْ ثَوَابَهَا اِلٰى قَبْرِ ذٰلِكَ الْمَيِّتِ۔۔۔\n" +
                "If you do so, Almighty Allah will immediately send one thousand angels to the grave of that individual; each angel carrying a dress and a garment. Moreover, Almighty Allah will expand his grave, saving him from tightness up to the day when the Trumpet will be blown. As for the one who has offered this prayer, he will be given rewards as many as every thing touched by the sunlight and he will be raised forty ranks.\n" +
                "\n";
        es3="The prayer to be offered at the burial night consists of two units. In the first unit, Surah al-Faatehah and Ayah al-Kursi are recited. In the second unit, Surah al-Faatehah is recited one time and Surah al-Qadr repeated ten times. When you say the Taslim statement, you may say the following supplication:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّابْعَثْ ثَوَابَهَا اِلٰى قَبْرِ ۔۔۔\n" +
                "ANOTHER NAMAZ AT THE BURIAL NIGHT\n" +
                "Sayyid Ibn Tawus, may Allah have mercy upon him, has reported that the Holy Prophet (s.a.w.a.) said, “The harshest time for a dead is his first night in the grave. Therefore, have mercy upon your dead people through almsgiving. If you do not have anything to give as alms, you may offer a two-unit prayer, reciting Surah al-Faatehah once and Surah al-Tawheed twice in the first unit and Surah al-Faatehah once and Surah al-Takathur ten times in the second unit. When you accomplish the prayer (by uttering the Taslim statement), you may say the following:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّابْعَثْ ثَوَابَهَا اِلٰى قَبْرِ ذٰلِكَ الْمَيِّتِ۔۔۔\n" +
                "If you do so, Almighty Allah will immediately send one thousand angels to the grave of that individual; each angel carrying a dress and a garment. Moreover, Almighty Allah will expand his grave, saving him from tightness up to the day when the Trumpet will be blown. As for the one who has offered this prayer, he will be given rewards as many as every thing touched by the sunlight and he will be raised forty ranks.\n" +
                "\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);


        es0="NAMAZ E NAWAFIL\n";
        es1="";
        es2="NAFILAH OF FAJR\n" +
                "Method: It is 2 rak'at Namaz. To be prayed when dawn (fajr) falls.\n" +
                "Like the Morning Prayers.\n" +
                "NAFILAH OF ZOHR\n" +
                "Method: It is 8 rak'at Namaz. To be prayed from the beginning of Zawal till before zohr.\n" +
                "Like the Morning Prayers, in units of 2 rak'ats.\n" +
                "NAFILAH OF ASR\n" +
                "Method: It is 8 rak'at Namaz. To be prayed before Asr.\n" +
                "Like the Morning Prayers, in units of 2 rak'ats.\n" +
                "NAFILAH OF MAGHRIB\n" +
                "Method: It is 4 rak'at Namaz. To be prayed after Namaz-e-Maghrib\n" +
                "In units of 2 rak'ats each like the morning prayers.\n" +
                "NAFILAH OF ISHA\n" +
                "Method: It is 2 rak'at Namaz. To be prayed after Namaz-e-Isha\n" +
                "Like the morning prayers, in sitting position.";
        es3="NAFILAH OF FAJR\n" +
                "Method: It is 2 rak'at Namaz. To be prayed when dawn (fajr) falls.\n" +
                "Like the Morning Prayers.\n" +
                "NAFILAH OF ZOHR\n" +
                "Method: It is 8 rak'at Namaz. To be prayed from the beginning of Zawal till before zohr.\n" +
                "Like the Morning Prayers, in units of 2 rak'ats.\n" +
                "NAFILAH OF ASR\n" +
                "Method: It is 8 rak'at Namaz. To be prayed before Asr.\n" +
                "Like the Morning Prayers, in units of 2 rak'ats.\n" +
                "NAFILAH OF MAGHRIB\n" +
                "Method: It is 4 rak'at Namaz. To be prayed after Namaz-e-Maghrib\n" +
                "In units of 2 rak'ats each like the morning prayers.\n" +
                "NAFILAH OF ISHA\n" +
                "Method: It is 2 rak'at Namaz. To be prayed after Namaz-e-Isha\n" +
                "Like the morning prayers, in sitting position.";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);

        es0="NAMAZ E MAYYAT\n";
        es1="";
        es2="The following is quoted, yet briefly, from the book entitled Zad al-Ma’ad by ‘Allamah al-Majlisi, may Allah show him mercy, under the title: Chapter: the Deceased Prayer:\n" +
                "The performance of the ritual Deceased Prayer is obligatory upon every Muslim individual who knows about the death of somebody. If one Muslim performs this prayer, the other Muslims will be exempted from this obligatory duty. Unanimously agreed by all scholars, the Deceased Prayer is obligatory upon all mature Twelver Shi’ites. However, it is most famous and most acceptable that this prayer is obligatory upon even the immature who are more than six year old. Apparently, it is sufficiently acceptable to intend seeking nearness to Almighty Allah (rather than pronouncing the words of intention). To perform the Deceased Prayer for the dead bodies of the less than six month year old babies who have been born alive is deemed highly recommended by some scholars, but deemed heretic by some others. However, it is precautious to neglect performing this prayer for these babies.\n" +
                "According to the religious law, the foremost people to perform the Deceased Prayer are the nearest to the deceased people and who deserve the largest quantity of his/her inheritance. This is the most familiar law. Thus, a husband must precede others in performing the Deceased Prayer of his wife.\n" +
                "The performer of the Deceased Prayer must face the kiblah direction and stand to the right side of the head of the dead body, which must be laid down on the back.\n" +
                "Validity of the Deceased Prayer is not conditional upon ceremonial purity; therefore, it is valid for the ceremonially impure, the menstruating women, and those who have not performed the ritual ablution (wuzu’) to perform such prayers, although it is recommended for the performers of this prayer to have performed the ritual ablution. If water is not available, there is something prevents from using water, or there is not enough time to perform the ritual ablution, it is then highly recommended, according to traditions, to perform the dry ablution (i.e. tayammum). However, it is understood from the apparent meanings of some traditions that dry ablution should be used even if there is nothing prevents from performing the ritual ablution.\n" +
                "It is also traditional that the performer of the Deceased Prayer should stand in the middle of the dead body of a man and in front of the breast of the dead body of a woman. This is the most familiar rule. Besides, the performer of the Deceased Prayer should take off the shoes and must intend performing the Deceased Prayer. He must then repeat the takbir statement five times. It is also traditional that he raises his hands to the level of his ears while uttering these statements. Familiarly, he should say the following words after uttering the first takbir statement:\n" +
                "اَشْهَدُ اَنْ لَّاۤ اِلٰهَ اِلَّا اللهُ وَ اَشْهَدُ اَنَّ مُحَمَّدًا رَّسُوْلُ اللهِ۔\n" +
                "These words should be advisably said after uttering the second takbir statement:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ۔\n" +
                "These words should be advisably said after uttering the third takbir statement:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِلْمُؤْمِنِيْنَ وَ الْمُؤْمِنَاتِ۔\n" +
                "These words should be advisably said after uttering the fourth takbir statement:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِهٰذَا الْمَيِّتِ۔\n" +
                "Then, the fifth takbir statement should be uttered, and thus the prayer has been accomplished utterly and acceptably.\n" +
                "As another method, it is familiarly better to say these words immediately after determining the intention of performing the Deceased Prayer:\n" +
                "اَللهُ اَكْبَرُ اَشْهَدُ اَنْ لَّاۤ اِلٰهَ اِللّٰهُ وَحْدَهُ لَاشَرِيْكَ لَهُ وَ اَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهُ وَ رَسُوْلُهُ اَرْسَلَهُ بِالْحَقِّ بَشِيْرًا وَّ نَذِيْرًا بَيْنَ يَدَىِ السَّاعَةِ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللّٰهُ اَكْبَرُ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ بَارِكْ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّارْحَمْ مُحَمَّدًا وَّ اٰلَ مُحَمَّدٍ كَاَفْضَلِ مَا صَلَّيْتَ وَ بَارَكْتَ وَ تَرَحَّمْتَ عَلٰى اِبْرَهِيْمَ وَ اٰلِ اِبْرَهيْمَ اِنَّكَ حَمِيْدٌ مَّجِيْدٌ وَ صَلِّ عَلٰى جَمِيْعِ الْاَنْبِيَاۤءِ وَالْمُرْسَلِيْنَ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللهُ اَكْبَرُ اَللّٰهُمَّ اغْفِرْ لِلْمُؤْمِنِيْنَ وَالْمُؤْمِنَاتِ وَالْمُسْلِميْنَ وَالْمُسْلِمَاتِ اَلْاَحْيَاۤءِ مِنْهُمْ وَالْاَمْوَاتِ تَابِعْ بَيْنَنَا وَ بَيْنَهُمْ بِالْخَيْرَاتِ اِنَّكَ مُجِيْبُ الدَّعَوَاتِ اِنَّكَ عَلٰى كُلِّشَيْئٍ قَدِيْرٌ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللّٰهُ اَكْبَرُ اَللّٰهُمَّ اِنَّ هٰذَا عَبْدُكَ وَابْنُ عَبْدِكَ وَابْنُ اَمَتِكَ نَزَلَ بِكَ وَ اَنْتَ خَيْرُ مَنْزُوْلٍ بِهِ اَللّٰهُمَّ اِنَّا لَا نَعْلَمُ مِنْهُ اِلَّا خَيْرًا وَ اَنْتَ اَعْلَمُ بِهِ مِنَّا اَللّٰهُمَّ اِنْ كَانَ مُحْسِنًا فَزِدْ فِىْ اِحْسَانِهِ وَ اِنْ كَانَ مُسِيْئًا فَتَجَاوَزْ عَنْهُ وَاغْفِرْ لَهُ اَللّٰهُمَّ اجْعَلْهُ عِنْدَكَ فِىْ اَعْلٰی عِلِّيِّيْنَ وَاخْلُفْ عَلٰى اَهْلِهِ فِى الْغَابِرِيْنَ وَارْحَمْهُ بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ۔\n" +
                "The performer of the Deceased Prayer should then say one more takbir statement and finish the prayer.\n" +
                "If the dead person is female, the following words should be said by the performer of the Deceased Prayer instead:\n" +
                "اَللّٰهُمَّ اِنَّ هٰذِہِ اَمَتُكَ وَابْنَۃُ عَبْدِكَ وَابْنَۃُ اَمَتِكَ نَزَلْتَ بِكَ وَ اَنْتَ خَيْرُ مَنْزُوْلٍ بِهِ اَللّٰهُمَّ اِنَّا لَا نَعْلَمُ مِنْهَا اِلَّا خَيْرًا وَ اَنْتَ اَعْلَمُ بِهَا مِنَّا اَللّٰهُمَّ اِنْ كَانَتْ مُحْسِنَۃً فَزِدْ فِىْ اِحْسَانِهَا وَ اِنْ كَانَتْ مُسِيْئَۃً فَتَجَاوَزْ عَنْهَا وَاغْفِرْ لَهَا اَللّٰهُمَّ اجْعَلْهَا عِنْدَكَ فِىْ اَعْلٰی عِلِّيِّيْنَ وَاخْلُفْ عَلٰى اَهْلِهَا فِى الْغَابِرِيْنَ وَارْحَمْهَا بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ۔\n" +
                "If the dead person is of those whom are deemed enfeebled, then the performer of the Deceased Prayer should say these words:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِلَّذِيْنَ تَابُوْا وَ اتَّبَعُوْا سَبِيْلَكَ وَ قِهِمْ عَذَابَ الْجَحِيْمِ۔\n" +
                "If the dead person is an immature child, the performer of the Deceased Prayer should say these words:\n" +
                "اَللّٰهُمَّ اجْعَلْهُ لِاَبَوَيْهِ وَ لَنَا سَلَفًا وَ فَرَطًا وَ اَجْرًا۔\n";
        es3="The following is quoted, yet briefly, from the book entitled Zad al-Ma’ad by ‘Allamah al-Majlisi, may Allah show him mercy, under the title: Chapter: the Deceased Prayer:\n" +
                "The performance of the ritual Deceased Prayer is obligatory upon every Muslim individual who knows about the death of somebody. If one Muslim performs this prayer, the other Muslims will be exempted from this obligatory duty. Unanimously agreed by all scholars, the Deceased Prayer is obligatory upon all mature Twelver Shi’ites. However, it is most famous and most acceptable that this prayer is obligatory upon even the immature who are more than six year old. Apparently, it is sufficiently acceptable to intend seeking nearness to Almighty Allah (rather than pronouncing the words of intention). To perform the Deceased Prayer for the dead bodies of the less than six month year old babies who have been born alive is deemed highly recommended by some scholars, but deemed heretic by some others. However, it is precautious to neglect performing this prayer for these babies.\n" +
                "According to the religious law, the foremost people to perform the Deceased Prayer are the nearest to the deceased people and who deserve the largest quantity of his/her inheritance. This is the most familiar law. Thus, a husband must precede others in performing the Deceased Prayer of his wife.\n" +
                "The performer of the Deceased Prayer must face the kiblah direction and stand to the right side of the head of the dead body, which must be laid down on the back.\n" +
                "Validity of the Deceased Prayer is not conditional upon ceremonial purity; therefore, it is valid for the ceremonially impure, the menstruating women, and those who have not performed the ritual ablution (wuzu’) to perform such prayers, although it is recommended for the performers of this prayer to have performed the ritual ablution. If water is not available, there is something prevents from using water, or there is not enough time to perform the ritual ablution, it is then highly recommended, according to traditions, to perform the dry ablution (i.e. tayammum). However, it is understood from the apparent meanings of some traditions that dry ablution should be used even if there is nothing prevents from performing the ritual ablution.\n" +
                "It is also traditional that the performer of the Deceased Prayer should stand in the middle of the dead body of a man and in front of the breast of the dead body of a woman. This is the most familiar rule. Besides, the performer of the Deceased Prayer should take off the shoes and must intend performing the Deceased Prayer. He must then repeat the takbir statement five times. It is also traditional that he raises his hands to the level of his ears while uttering these statements. Familiarly, he should say the following words after uttering the first takbir statement:\n" +
                "اَشْهَدُ اَنْ لَّاۤ اِلٰهَ اِلَّا اللهُ وَ اَشْهَدُ اَنَّ مُحَمَّدًا رَّسُوْلُ اللهِ۔\n" +
                "These words should be advisably said after uttering the second takbir statement:\n" +
                "اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ۔\n" +
                "These words should be advisably said after uttering the third takbir statement:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِلْمُؤْمِنِيْنَ وَ الْمُؤْمِنَاتِ۔\n" +
                "These words should be advisably said after uttering the fourth takbir statement:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِهٰذَا الْمَيِّتِ۔\n" +
                "Then, the fifth takbir statement should be uttered, and thus the prayer has been accomplished utterly and acceptably.\n" +
                "As another method, it is familiarly better to say these words immediately after determining the intention of performing the Deceased Prayer:\n" +
                "اَللهُ اَكْبَرُ اَشْهَدُ اَنْ لَّاۤ اِلٰهَ اِللّٰهُ وَحْدَهُ لَاشَرِيْكَ لَهُ وَ اَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهُ وَ رَسُوْلُهُ اَرْسَلَهُ بِالْحَقِّ بَشِيْرًا وَّ نَذِيْرًا بَيْنَ يَدَىِ السَّاعَةِ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللّٰهُ اَكْبَرُ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّ بَارِكْ عَلٰى مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَّارْحَمْ مُحَمَّدًا وَّ اٰلَ مُحَمَّدٍ كَاَفْضَلِ مَا صَلَّيْتَ وَ بَارَكْتَ وَ تَرَحَّمْتَ عَلٰى اِبْرَهِيْمَ وَ اٰلِ اِبْرَهيْمَ اِنَّكَ حَمِيْدٌ مَّجِيْدٌ وَ صَلِّ عَلٰى جَمِيْعِ الْاَنْبِيَاۤءِ وَالْمُرْسَلِيْنَ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللهُ اَكْبَرُ اَللّٰهُمَّ اغْفِرْ لِلْمُؤْمِنِيْنَ وَالْمُؤْمِنَاتِ وَالْمُسْلِميْنَ وَالْمُسْلِمَاتِ اَلْاَحْيَاۤءِ مِنْهُمْ وَالْاَمْوَاتِ تَابِعْ بَيْنَنَا وَ بَيْنَهُمْ بِالْخَيْرَاتِ اِنَّكَ مُجِيْبُ الدَّعَوَاتِ اِنَّكَ عَلٰى كُلِّشَيْئٍ قَدِيْرٌ۔\n" +
                "After that, it is recommended to say these words:\n" +
                "اَللّٰهُ اَكْبَرُ اَللّٰهُمَّ اِنَّ هٰذَا عَبْدُكَ وَابْنُ عَبْدِكَ وَابْنُ اَمَتِكَ نَزَلَ بِكَ وَ اَنْتَ خَيْرُ مَنْزُوْلٍ بِهِ اَللّٰهُمَّ اِنَّا لَا نَعْلَمُ مِنْهُ اِلَّا خَيْرًا وَ اَنْتَ اَعْلَمُ بِهِ مِنَّا اَللّٰهُمَّ اِنْ كَانَ مُحْسِنًا فَزِدْ فِىْ اِحْسَانِهِ وَ اِنْ كَانَ مُسِيْئًا فَتَجَاوَزْ عَنْهُ وَاغْفِرْ لَهُ اَللّٰهُمَّ اجْعَلْهُ عِنْدَكَ فِىْ اَعْلٰی عِلِّيِّيْنَ وَاخْلُفْ عَلٰى اَهْلِهِ فِى الْغَابِرِيْنَ وَارْحَمْهُ بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ۔\n" +
                "The performer of the Deceased Prayer should then say one more takbir statement and finish the prayer.\n" +
                "If the dead person is female, the following words should be said by the performer of the Deceased Prayer instead:\n" +
                "اَللّٰهُمَّ اِنَّ هٰذِہِ اَمَتُكَ وَابْنَۃُ عَبْدِكَ وَابْنَۃُ اَمَتِكَ نَزَلْتَ بِكَ وَ اَنْتَ خَيْرُ مَنْزُوْلٍ بِهِ اَللّٰهُمَّ اِنَّا لَا نَعْلَمُ مِنْهَا اِلَّا خَيْرًا وَ اَنْتَ اَعْلَمُ بِهَا مِنَّا اَللّٰهُمَّ اِنْ كَانَتْ مُحْسِنَۃً فَزِدْ فِىْ اِحْسَانِهَا وَ اِنْ كَانَتْ مُسِيْئَۃً فَتَجَاوَزْ عَنْهَا وَاغْفِرْ لَهَا اَللّٰهُمَّ اجْعَلْهَا عِنْدَكَ فِىْ اَعْلٰی عِلِّيِّيْنَ وَاخْلُفْ عَلٰى اَهْلِهَا فِى الْغَابِرِيْنَ وَارْحَمْهَا بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ۔\n" +
                "If the dead person is of those whom are deemed enfeebled, then the performer of the Deceased Prayer should say these words:\n" +
                "اَللّٰهُمَّ اغْفِرْ لِلَّذِيْنَ تَابُوْا وَ اتَّبَعُوْا سَبِيْلَكَ وَ قِهِمْ عَذَابَ الْجَحِيْمِ۔\n" +
                "If the dead person is an immature child, the performer of the Deceased Prayer should say these words:\n" +
                "اَللّٰهُمَّ اجْعَلْهُ لِاَبَوَيْهِ وَ لَنَا سَلَفًا وَ فَرَطًا وَ اَجْرًا۔\n";
        us0="Sorry Not Available";
        us1="Sorry Not Available";
        us2="Sorry Not Available";
        us3="Sorry Not Available";

        etitle.add(es0);
        edesc.add(es1);
        earab.add(es2);
        etrans.add(es3);

        utitle.add(us0);
        udesc.add(us1);
        uarab.add(us2);
        utrans.add(us3);

        for(int i=0;i<etitle.size();i++)
        {
               id.add(i);
                String s=etitle.get(i);
                String res="";
                for(int j=0;j<s.length();j++)
                {
                    if((s.charAt(j)>='A' && s.charAt(j)<='Z' )|| (s.charAt(j)>='a' && s.charAt(j)<='z')){
                     if(j==0 || s.charAt(j-1)==' ')res+=Character.toUpperCase(s.charAt(j));
                    else res+=Character.toLowerCase(s.charAt(j));}
                    else res+=s.charAt(j);
                }
            etitle.set(i,res.trim());

             s=earab.get(i); int j=0;
              while(j<s.length() && s.charAt(j)=='\n')j++;
             if(j<s.length()) earab.set(i,s.substring(j));
            s=uarab.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) uarab.set(i,s.substring(j));

            s=etrans.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) etrans.set(i,s.substring(j));

            s=utrans.get(i);  j=0;
            while(j<s.length() && s.charAt(j)=='\n')j++;
            if(j<s.length()) utrans.set(i,s.substring(j));


        }



        pos=id.indexOf(id1);
        Log.d("myapp",Integer.toString(pos));


        getSupportActionBar().setTitle("Read Namaz"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        t3=findViewById(R.id.t3);
        t3.setText(etitle.get(pos));

        t1=findViewById(R.id.t1);
        t1.setText(edesc.get(pos));

        t2=findViewById(R.id.t2);
        t2.setText(earab.get(pos));
        try{
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Mirza-SemiBold.ttf");
            t2.setTypeface(custom_font);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
        }
    }

    public void change(View v)
    {
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);

        String t=b1.getText().toString();
        if(t.equals("SEE TRANSLATION")){
            b1.setText("SEE ARABIC");
            if(b2.getText().toString().equals("English"))
            {
                t2.setText(utrans.get(pos));
                t2.setTextSize(25);
            }
            else
            {
                t2.setText(etrans.get(pos));
                t2.setTextSize(25);
            }
            // t2.setTypeface(Typeface.create("sans-serif-condensed-light", Typeface.NORMAL));
        }
        else {
            b1.setText("SEE TRANSLATION");
            if(b2.getText().toString().equals("English"))t2.setText(uarab.get(pos));
            else t2.setText(earab.get(pos));
            t2.setTextSize(25);
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Mirza-SemiBold.ttf");
            t2.setTypeface(custom_font);
        }
    }



    public void lang(View v)
    {
        Button b2=findViewById(R.id.b2);
        Button b1=findViewById(R.id.b1);

        String t=b2.getText().toString();

        String x=utitle.get(pos);
        String y=uarab.get(pos);

        if(x.equals("") || x.equals("Sorry Not Available") || y.equals("") || y.equals("Sorry Not Available")){
            Toast.makeText(this,"Sorry Urdu is Currently Unavailable",Toast.LENGTH_SHORT).show();
            return;
        }

        if(t.equals("English")){
            b2.setText("اردو");
            t3.setText(etitle.get(pos));
            t1.setText(edesc.get(pos));
            if(b1.getText().toString().equals("SEE TRANSLATION"))
            {
                t2.setText(earab.get(pos));
                t2.setTextSize(25);
            }
            else{
                t2.setText(etrans.get(pos));
                t2.setTextSize(25);
            }



        }
        else {
            b2.setText("English");
            t3.setText(utitle.get(pos));
            t1.setText(udesc.get(pos));
            if(b1.getText().toString().equals("SEE TRANSLATION"))
            {
                t2.setText(uarab.get(pos));
                t2.setTextSize(25);
            }
            else{
                t2.setText(utrans.get(pos));
                t2.setTextSize(25);
            }
        }
    }

    public void fab(View v) {
        final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        String s=etitle.get(pos);

        s=s.replace(" ","-");

        try{
            intent.putExtra(Intent.EXTRA_TEXT, "http://thelasthope.site/ReadNamaz/"+s+"/"+id1+"");}
        catch (Exception e){}
        intent.putExtra(Intent.EXTRA_SUBJECT,"Duas");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.setType("text/plain");

        startActivity(Intent.createChooser(intent, "Share via"));


    }

}
