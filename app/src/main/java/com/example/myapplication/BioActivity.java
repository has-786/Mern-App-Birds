package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.SearchView;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.adapterBio.RecyclerViewAdapter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class BioActivity extends AppCompatActivity {
    public static final String MSG2="com.example.myapplication.BIO";
    public static final String MSG1="com.example.myapplication.BIO1";
    public static final String MSG3="com.example.myapplication.BIOLANG";
    public static int biolang;
    TextView t0,t1,t2;
    ImageView img1;

    String es0,es1,s2,es3,us0,us1,us3;


    public static ArrayList<String> etitleH=new ArrayList<>();
    public static ArrayList<String> utitleH=new ArrayList<>();
    public static ArrayList<String> img=new ArrayList<>();
    public static ArrayList<ArrayList<String>> etitle=new ArrayList<>();
    public static ArrayList<ArrayList<String>> edesc=new ArrayList<>();
    public static ArrayList<ArrayList<String>>  utitle=new ArrayList<>();
    public static ArrayList<ArrayList<String>> udesc=new ArrayList<>();
    public static ArrayList<Integer> id=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        getSupportActionBar().setTitle("Biography"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));



        etitle=new ArrayList<>();
        utitle=new ArrayList<>();
        edesc=new ArrayList<>();
        udesc=new ArrayList<>();
        etitleH=new ArrayList<>();
        utitleH=new ArrayList<>();
        img=new ArrayList<>();
        id=new ArrayList<>();

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        img1=findViewById(R.id.imageView);

        ArrayList<String> str;


        etitleH.add("Prophet Muhammad (sawa)");
        utitleH.add("حضرت محمد (ص)");

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Morale Virtues");
        str.add("Demise");


        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("سیرت");
        str.add("وفات");

        utitle.add(str);

        img.add("nabi.jpg");


        str=new ArrayList<>();
        str.add("Muḥammad b. ʿAbd Allāh b. ʿAbd al-Muṭṭalib b. Hāshim (Arabic: محمد بن\u200C عبد اللّه بن\u200C عبد المطّلب بن\u200C هاشم) (b. 'Am al-Fil/570 Mecca – d. 11/632 Medina) is the prophet of Islam, whose mission was essentially the advancement of monotheism and morality. He (s) was also a social reformist and a political leader. He (s) was the last prophet of God, and his major miracle was the Qur'an.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Born  :\t\t11 May 570 CE (Rabi' I 17, 53 BH)\n" +
                "\n" +
                "Birthplace:\tMecca, ArabiaDiedc. 25 May 632 (aged 62)(Safar 28, 11 AH)\n" +
                "\n" +
                "Deathplace:\tMedina, Arabia\n" +
                "\n" +
                "Place of Burial:\tMedina, Arabia\n" +
                "\n" +
                "Successor:\t\tAli b. Abi Talib (a) (As the first Imam of the Shia and Caliph)\n" +
                "\n" +
                "Father:\t\tAbd Allah b. 'Abd al-Muttalib\n" +
                "\n" +
                "Mother:\t\tAmina bt. Wahb\n" +
                "\n" +
                "Spouse(s):\t\tKhadija, Sawda, Aisha, Hafsa, Zaynab bt. Khuzayma, Umm Salama, Zaynab bt. Jahsh, Juwayriyya, Ramla, Safiyya, Maymuna, Mariya\n" +
                "\n" +
                "Son(s):\t\tQasim, 'Abd Allah, Ibrahim\n" +
                "\n" +
                "Daughter(s):\tFatima (a)\n" +
                "\n" +
                "Descendants:\tAhl al-Bayt, Sayyids\n" +
                "\n" +
                "Titles:\t\tAbu l-Qasim (his Kunya), Amin (trustworthy), Rasul Allah (messenger of Allah); Mustafa (the chosen), Habib Allah(beloved one of Allah), Khayr Khalq Allah (the best of creatures of Allah), Khatam al-Nabiyyin(last of the propehts),\n" +
                "Rahmat li-l-'Alamin (a blessing for the two worlds)\n" +
                "\n" +
                "\n" +
                "Although the Prophet (s) was born in the polytheistic society of Arabia, he never worshiped any idols, and avoided the inappropriate manners that were rampant in pre-Islamic Arabia. He (s) was chosen by God as a prophet at the age of forty. Although the polytheists of Mecca persecuted him and his followers for many years, neither he, nor his followers gave up following Islam. After thirteen years of preaching in Mecca, he immigrated to Medina. This immigration (Hijra) marked what became the beginning of the Islamic calendar. In Medina, he established an ever expanding community of believers, the Muslim ummah.\n" +
                "\n" +
                "Because of the efforts of the Prophet (s), the pre-Islamic Age of Ignorance ended, and the polytheistic society of Arabia was transformed into a monotheistic society in a short time. Towards the end of the Prophet's (s) life, almost everyone in the Arabian Peninsula had converted to Islam. The number of Muslims has continued to grow ever since, and Islam is now the fastest growing religion in the world.\n" +
                "\n" +
                "The Prophet (s) enjoined his followers to adhere to the teachings of the Qur'an and the Ahl al-Bayt (a). He designated Imam 'Ali (a) as his successor on various occasions throughout his life, including the event of Ghadir.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "The exact year of the Prophet's (s) birth is not known. Ibn Hisham and some others have written that it was in 'Am al-fil (literally, \"the year of the elephant\"), the year in which Abraha al-Ashram and his elephants attempted to destroy the Ka'ba. But this does not help much, since it cannot be said for certain what year the year of the elephantwas. However, taking into consideration that the Prophet's (s) demise was in 632 CE, and that he was 63 years old at the time of his demise, the year of his birth must have been either 569 or 570 CE.[2]\n" +
                "\n" +
                "The date of his birth is Rabi' I 17th according to the majority of Shi'a scholars, and Rabi' I 12th according to Sunnis.[3]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Childhood:\n" +
                "\n" +
                "Muhammad (s) spent his childhood as an orphan. A few months after 'Abd Allah (his father) married Amina, the daughter of Wahb (the chief of the Banu Zuhra family), 'Abd Allah went on a business trip to Damascus, and passed away on his return in Yathrib (now Medina).  \n" +
                "After the loss of his mother, 'Abd al-Muttalib, undertook the guardianship of Muhammad (s). When Muhammad (s) was eight years old, 'Abd al-Muttalib also passed away. Since then, Muhammad's (s) uncle, Abu Talib, took care of him. [4] In the house of Abu Talib, his wife, Fatima bt. Asad, was so kind to Muhammad (s) that when she passed away, the Prophet (s) said, \"Today, my mother has died!\".\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "Muhammad (s) married Khadija when he was twenty-five years old.[9]Khadija lived with the Prophet (s) for 25 years and passed away 10 years after Bi'tha. Khadija gave birth to a few children, the boys of whom died in childhood. The most famous of her daughters was Lady Fatima (a).\n" +
                "\n" +
                "After dimise of Khadija, the Prophet (s) married Sawda bt. Zam'a. The next wives of the Prophet (s) were:\n" +
                "\n" +
                "Aisha\n" +
                "Hafsa\n" +
                "Zaynab bt. Khuzayma\n" +
                "Umm Habiba\n" +
                "Umm Salama\n" +
                "Zaynab bt. Jahsh\n" +
                "Juwayriyya bt. al-Harith\n" +
                "Safiyya bt. Huyyay\n" +
                "Maymuna bt. al-Harith\n" +
                "Mariya bt. Sham'un known as Mariya al-Qibtiyya.\n" +
                "\n" +
                "All of the Prophet's (s) children, save for Fatima (a), died when the Prophet (s) was alive and his descendants are all from the line of Fatima (a). In total, he had three sons and four daughters:\n" +
                "\n" +
                "Al-Qasim: the Prophet's (s) first child who died in Mecca at the age of 2.\n" +
                "'Abd Allah: born in Mecca shortly after the beginning of the Prophet's (s) mission and died there.\n" +
                "Ruqayya: died in Medina, 2/624\n" +
                "Zaynab: died in Medina, 8/629-30\n" +
                "Umm Kulthum: died in Medina, 9/630\n" +
                "Ibrahim: died in Medina, 10/631\n" +
                "Fatima (a): was martyred in Medina, 11/632. (the Prophet's (s) progeny is continued only through her)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bi'tha:\n" +
                "\n" +
                "According to the Twelver Shi'as, the mission of the Prophet (s) began on the Rajab 27.[13] In the years prior to his mission, Muhammad (s) spent a lot of time in solitude, worshiping God. He would spend a month in solitude in a cave called Hira', at the mountains and would worship God there (see: tahannuth). During that month, he (s) would give food to any poor person that asked him. After the month was completed, he returned to Mecca and circumambulated the Ka'ba seven times or more before returning home.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Invitation to Islam:\n" +
                "\n" +
                "It is recorded that Muhammad (s) invited people secretly to Islam for three years after the beginning of his mission. However, because of the order of the revelation of the verses of the Qur'an, some believe that the Prophet's (s) public invitation was carried out very shortly after the first revelation.[20]\n" +
                "\n" +
                "In the beginning, the Prophet (s) invited people to abandon worshiping multiple gods (idols) and to begin worshiping one God (i.e. monotheism). In the beginning, prayers were in two units. Later, it was an obligation for travelers to perform the prayers in two units and for others to perform it in four units. At the time of prayers, Muslims would hide from others in the splits of mountains and other faraway places in order to perform the prayers. Gradually, the Muslims began to grow in numbers in Mecca.[21] It is well-known that three years after the beginning of his mission, God ordered the Prophet (s) to invite people to Islam publicly.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Enmity of Quraysh and Its Consequences\n" +
                "\n" +
                "As the number of Muslims grew faster, the chiefs of the Quraysh became more worried about it. They went to Abu Talib (the Prophet's (s) uncle and protector) and asked him to stop his nephew from the mission of Prophethood that he had started. They asked him to give Muhammad (s) over to them so that they could kill him and in return they offered Abu Talib the guardianship of Ammara b. al-Walidwho was -in their opinion- a handsome and wise young man. Abu Talib responded by exclaiming: \"Shall I give my son to you so that you can kill him and raise your son? What a difficult task![25]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Immigration to Medina:\n" +
                "\n" +
                "That night, when the Quraysh attempted to carry out the assassination of the Prophet (s), he had already left Mecca by the order of God and Ali (a) was lying in his bed instead. The Prophet (s) and Abu Bakr b. Abi Quhafastayed in a cave near Mecca called Thawr for three days so that those chasing him could not find him and had to return to Mecca empty-handed. Then, the Prophet (s) and Abu Bakr continued on their way to Yathrib.\n" +
                "\n" +
                "Ibn Kalbi has written that he left Mecca on Monday, the 1st of Rabi' I and that he arrived in Quba on Friday, the 12th of Rabi' I.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Battles before the Conquest of Mecca:\n" +
                "\n" +
                "Battle of Badr\n" +
                "there was an important battle between the Muslims and polytheists of Mecca. This battle, called the Battle of Badr, was won by the Muslims even though they were less in number. Many polytheists were either killed or captured and many more escaped.\n" +
                "\n" +
                "Battle of Uhud\n" +
                "In 3/625, the Quraysh asked help from their allied tribes, and sent an army led by Abu Sufyan towards Medina. Initially, the Prophet (s) wanted to stay inside the parameters of Medina, but then decided to meet the army outside the city. The two armies met somewhere near the Uhud Mount. Although the Muslims were initially close to victory, they ended up losing the war.\n" +
                "It was in this battle that Hamza, the uncle of the Prophet (s), was martyred. \n" +
                "\n" +
                "\n" +
                "Battle of Khaybar\n" +
                "The last war that occurred before the Conquest of Mecca and after the Treaty of Hudaybiyya was the Battle of Khaybar. In 7/628, the Prophet (s) conquered the Jews of Khaybar who had allied with his enemies several times before. Khaybar which was a castle near Medina was seized by the Muslims. After the victory, the Prophet (s) agreed that the Jews could continue farming in the region, however, they had to give a part of their crop to the Muslims every year.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Treaty of Hudaybiyya:\n" +
                "\n" +
                "Many events in 6/627-8 ended favourably for the Muslims, such as the Battle of Ahzab, the surrender of the Jewish tribe of Banu Qurayza, and two or three other battles that they won. Further, the bring-backs of war which they had collected, raised the status and respect of Islam in the eyes of the population to the extent that many tribes converted to Islam or signed peace treaties with Muslims.\n" +
                "\n" +
                "In Dhu l-Qa'da, 6/April 628, the Prophet (s) along with 1,500 people from Medina went to Mecca in order to perform the pilgrimage. The Quraysh prepared to stop the Muslims from the pilgrimage when they became aware of this. First, they sent Khalid b. Walid and 'Ikrama b. Abi Jahl to prevent them from coming to Mecca. The Prophet (s) arrived in Hudaybiyya, a place marking the beginning of the Haram (sacred land), and sent a message to the Meccans that \"we have come for pilgrimage not war.\" It was a humiliation for Quraysh to see their enemies enter Mecca and perform Hajj. But on the other hand they could not prevent anyone from entering Mecca to perform Hajj, as Mecca was the free land of God. Finally, a peace treaty was agreed upon and signed between the Prophet (s) and the representatives of Mecca. According to the treaty, they would not engage in warfare with each other and allies of each other for the next ten years. However, the Muslims could not enter Mecca that year, but the following year, the Quraysh would leave the city for three days and the Muslims would be permitted to enter to perform the pilgrimage. Another article in the peace treaty was that if a Meccan man were to come to the Prophet (s), the person would have to be returned to Mecca. However, if someone were to go to Mecca, they would not have to return them. Further, the treaty permitted that other tribes were free to ally either with the Quraysh or with Muhammad (s).[60]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Conquest of Mecca:\n" +
                "\n" +
                "Conquest of Mecca (Arabic:فتح مكة) is the event of conquering Mecca by Muslims led by the Prophet (s) in 8/630 as a response to Quraysh's breaking Hudaybiyya treaty. One of its results was that the polytheists of Arabian Peninsula turned to Islam in the following years. Chiefs of the polytheists of Quraysh such as Abu Sufyan became Muslim before Muslims entered Mecca. The Prophet (s)called, \"Al-Yawm, yawm al-marhama\" (\"Today is the day of mercy\") and granted an amnesty for all.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Battles after the Conquest of Mecca:\n" +
                "\n" +
                "Battle of Hunayn\n" +
                "Battle of Tabuk\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Event of Ghadeer Khum:\n" +
                "\n" +
                "The Prophet (s) went for his last pilgrimage in Dhu l-Qa'da, 10/February 632. He taught the rulings of the Hajj during this Hajj journey.\n" +
                "\n" +
                "In a region called Juhfa where the peoples of Egypt, Hijaz and Iraq split up to travel to their own regions, is a place called Ghadir Khum. Here, on the Prophet's (s) return to Medina, before everyone split in different directions, he received an order from God to appoint Ali (a)as his successor and who would direct the Muslim community towards a specific goal. In the massive crowd of Muslims, approximated at 90-100,000, the Prophet (s) said,\n" +
                "\n" +
                "\"Ali (a) is the guardian of anyone that I am the guardian of. O Allah! Befriend anyone who befriends him and be enemies with whoever is his enemy. Abominate whoever abominates him, help whoever helps him, defame whoever disrespects him, and support him with the truth wherever he goes. Deliver these words to those who are absent.\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Mubāhala :\n" +
                "\n" +
                "Mubāhala (Arabic: مُباهَلَة) means cursing and damning each other. Two people or two parties, who believe they are right, supplicate before God and ask Him to curse the liar so that everyone knows who is right. Thus, the Prophet (s) suggested Christians of Najran to do mubahala and they accepted; however, on the day they had agreed upon earlier, they refused to do mubahala since they saw that the Prophet (s) came with closest members of his family, who were his daughter, Fatima al-Zahra (a), his son-in-law, Imam 'Ali (a), his grandsons, Hasan (a) and Husayn (a), and thus Christians understood his truthfulness. This way the Prophet (s) became victorious in this event.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");



        str.add("\n" +
                "Honor:\n" +
                "\n" +
                "The Prophet (s) lived for forty years amongst the people before he began his mission. During this time, his character showed no signs of any bad qualities. He was known as an honest and trustworthy individual. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Conduct:\n" +
                "\n" +
                "The greatest quality of the Prophet (s) was his impeccable character and behaviour (Akhlaq). \n" +
                "It is said that he was quiet and did not speak unless it was necessary. He always opened his mouth slightly and never more than half of it was open.\n" +
                "He was never arrogant. He lived a simple life, and would sit on the ground to eat food. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Ascesis:\n" +
                "\n" +
                "The Prophet (s) lived with self-discipline. Throughout his entire life, he did not designate a spot for himself (in a place of superiority whilst sitting with others).\n" +
                "His staple diet consisted of dates and barley bread. He never ate to his fill for two consecutive days, nor would he eat to his fill two times per day. There were many nights where he and his family slept while they were hungry. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Organization and Tidiness:\n" +
                "\n" +
                "The Prophet (s) was very organized in his life. \n" +
                "He was very organized with regards to scheduling his time. He had divided his time into three parts: one for worshipping God, one for personal activities, and one for activities with the people.\n" +
                "\n" +
                "He would always look in the mirror to arrange and comb his hair. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

            str.add("\n" +
                    "In the beginning of 11/632, the Prophet (s) became sick and passed away. Before he passed away, when he was very ill, he gave a farewell speech to the Muslims and advised them to be kind to one another. He also said \"If I owe anything to anyone, they should come to me to ask for it or else, they should disregard it. If I have annoyed anyone, I am ready to be punished in retaliation for it\"[71].\n" +
                    "\n" +
                    "The Prophet (s) passed away on Safar 28/May 25 or on Rabi' I 12/June 7 of 11/632at the age of 63. It is mentioned in Nahj al-balagha that at the time of his demise, the Prophet's (s) head lay on the chest of Ali (a).[72]\n" +
                    "\n" +
                    "At the time of his demise, none of his children were alive except for Fatima (a). All of his other children had passed away, including Ibrahim, who was born one or two years before the Prophet's (s) demise. Ali (a), with the help of some others, as per the Islamic tradition, washed the Prophet's (s) body, and shrouded and buried him in his house, where it is now located in Masjid al-Nabi.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n");


            edesc.add(str);



            str=new ArrayList<>();

            str.add("محمد بن عبد اللہ بن عبد المطّلب بن ہاشم (عام الفیل،570ء–11ھ/632ء) اللہ کے آخری نبی، پیغمبر اسلامؐ اور اولو العزم انبیاء میں سے ہیں۔ آپ کا اہم ترین معجزہ قرآن ہے۔ آپ یکتا پرستی کے منادی اور اخلاق کے داعی ہیں۔\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "منصب:\t\tاللہ کے آخری رسول\n" +
                    "\n" +
                    "نام:\t\tمحمد بن عبداللہ\n" +
                    "\n" +
                    "کنیت:\t\tابوالقاسم\n" +
                    "\n" +
                    "ولادت:\t\t17 ربیع الاول، سال عام الفیل/570عیسوی۔\n" +
                    "\n" +
                    "وفات:\t\t28 صفر، سال 11ھ/632عیسوی۔\n" +
                    "\n" +
                    "مدفن:\t\tمدینہ\n" +
                    "\n" +
                    "رہائش:\t\tمکہ، مدینہ\n" +
                    "\n" +
                    "القاب:\t\tامین، رسول اللہ، مصطفی، حبیب اللہ، صفی اللہ، نعمۃ اللہ، خیرة خلق اللہ، سید المرسلین، خاتم النبیین، رحمۃ للعالمین، نبی امّی\n" +
                    "\n" +
                    "والد:\t\tعبداللہ\n" +
                    "\n" +
                    "والدہ:\t\tآمنہ\n" +
                    "\n" +
                    "ازواج:\t\tخدیجہ، سوده، عایشہ، حفصہ، زینب بنت خزیمہ، ام حبیبہ، ام سلمہ، زینب بنت جحش، جویریہ، صفیہ، میمونہ۔\n" +
                    "\n" +
                    "اولاد:\t\tفاطمہؑ، قاسم، زینب، رقیہ، ام کلثوم، عبداللہ، ابراہیم۔\n" +
                    "\n" +
                    "عمر:\t63 سال\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "آپ عرب کے مشرک معاشرے میں پیدا ہوئے تھے تاہم بتوں کی پرستش اور معاشرے میں رائج اخلاقی برائیوں اور قباحتوں سے پرہیز کرتے تھے۔ یہاں تک کہ آپؐ چالیس سال کی عمر میں مبعوث برسالت ہوئے۔ آپ کا اہم ترین پیغام توحید اور یکتا پرستی تھا۔ مکارم اخلاق اور اچھائیوں کی تکمیل آپ کی بعثت کے اہداف میں سے تھے۔ مکہ کے مشرکین نے اگرچہ کئی سال تک آپ اور آپ کے پیروکاروں کو اذیت اور آزار کا نشانہ بنایا مگر آپ اور آپ کے پیروکار کبھی بھی اسلام سے دستبردار نہیں ہوئے۔ مکہ میں تیرہ سال تک تبلیغ کے بعد آپ نے مدینہ ہجرت فرمائی۔ مدینے کی طرف آپ کی ہجرت کو اسلامی تاریخ کا آغاز قرار دیا گیا۔ مشرکین مکہ کی طرف سے آپ کو مدینے میں متعدد جنگوں کا سامنا کرنا پڑا اور مجموعی طور پر ان جنگوں میں فتح نے مسلمانوں کے قدم چومے۔\n" +
                    "\n" +
                    "رسول خداؐ کی کوششوں سے عربوں کا جاہلیت زدہ معاشرہ مختصر سے عرصے میں ایک توحیدی معاشرے میں بدل گیا اور تقریباً پورے جزیرہ نمائے عرب نے آپ کی حیات طیبہ کے دوران ہی اسلام قبول کیا۔ بعد کے ادوار میں بھی آج تک اسلام کا فروغ جاری ہے اور آج دین اسلام مسلسل فروغ پانے والا دین سمجھا جاتا ہے۔ جب آپ دنیا سے جا رہے تھے تو مسلمانوں کی ہدایت کیلئے اپنے بعد قرآن اور اہل بیتؑ کا دامن تھامے رکھنے کی وصیت فرمائی۔ واقعہ غدیر سمیت مختلف مواقع پر امام علی علیہ السلام کو اپنے جانشین کے طور پر لوگوں کے سامنے پیش کیا۔\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n");

        str.add("\n" +
                "\n" +
                "ولادت:\n" +
                "\n" +
                "رسول اکرمؐ کی ولادت باسعادت کا سال بطور دقیق معلوم نہیں ہے۔ ابن ہشام اور دیگر مورخین کے مطابق آپ عام الفیل (وہ سال جس میں ابرہہ ہاتھیوں کے لشکر کے ساتھ کعبہ کو منہدم کرنے آیا تھا) میں اس دنیا میں تشریف لائے لیکن انہوں نے یہ مشخص نہیں کیا ہے کہ آپؐ عام الفیل کے کون سے سال متولد ہوئے۔ البتہ تاریخ نگاروں نے آپ کی تاریخ وفات کو عام الفیل سنہ632 اور وفات کے وقت آنحضرتؐ کی عمر 63 برس ذکر کی ہیں اس لحاظ سے آپ کا سال ولادت سنہ 569 اور 570 کے درمیان ہونا چاہئے۔[6]\n" +
                "\n" +
                "رسول اللہؐ کا یوم ولادت مشہور شیعہ قول کے مطابق 17 ربیع الاول اور اہل سنت کے مشہور قول کے مطابق 12 ربیع الاول ہے۔[7] آپ کا محل ولادت مکہ اور بعض مآخذ میں شعب ابی طالب میں محمد بن یوسف کا گھر مذکور ہے۔[8]\n" +
                "\n" +
                "12 سے 17 ربیع الاول کے دوران مسلمانوں کے درمیان اظہار وحدت کی خاطر ہفتۂ وحدت منایا جاتا ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچپن:\n" +
                "\n" +
                "عبداللہ آپ کے والد تھے اور وہ قبیلۂ بنی زہرہ کے زعیم (وہب) کی دختر آمنہ بنت وہب کو بیاہ لینے کے چند ماہ بعد شام کے ایک کاروباری دورے سے واپس آتے ہوئے یثرب میں انتقال کرگئے\n" +
                "\n" +
                "نیز منقول ہے کہ ابو طالبؑ کے گھر میں آپ کی زوجۂ مکرمہ، فاطمہ بنت اسد محمدؐ سے بہت زیادہ محبت کرتی تھیں یہاں تک کہ جب فاطمہ بنت اسد انتقال کر گئیں تو رسول اللہؐ نے فرمایا \"آج میری ماں چل بسیں\"۔ اور انہیں اپنا کرتا کفن کے عنوان سے پہنایا، ان کی قبر میں اترے، ان کی لحد میں لیٹ گئے اور جب آپ سے عرض کیا گیا کہ \"اے رسول خدا! آپ فاطمہ کے لئے سخت بے چین ہوگئے ہیں\" تو آپ نے فرمایا: \"حقیقتاً وہ میری ماں تھیں کیونکہ وہ اپنے بچوں کو بھوکا رکھتی تھیں لیکن مجھے کھانا کھلاتی اور انہیں گرد و غبار میں اٹا ہوا چھوڑ دیتی تھیں لیکن مجھے نہلا دھلا کر آراستہ کر دیتی تھیں، بے شک وہ میری ماں تھیں\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ازواج اور بچے:\n" +
                "\n" +
                "محمد (ص) نے خدیجہ سے شادی کی جب وہ پچیس سال کے تھے۔\n" +
                "\n" +
                "خدیجہ(س) نے تقریباً 25 سال کا عرصہ رسول خداؐ کے ساتھ گذارا اور سنہ 10 بعثت میں 65 سال کی عمر میں شعب ابی طالب سے بنی ہاشم کے باہر آنے کے اٹھارہ مہینے بعد وفات پاگئیں۔ ان کے انتقال کے بعد رسول اللہؐ سودہ بنت زمعۃ بن قیس کے ساتھ رشتہ ازدواج میں منسلک ہوئے۔ رسول اللہؐ نے بعد میں جن خواتین سے نکاح کیا ان کے نام یہ ہیں: عائشہ، حفصہ، زینب بنت خزیمہ، ام حبیبہ بنت ابی سفیان،ام سلمہ، زینب بنت جحش، جویریہ بنت حارث، صفیہ بنت حیی بن اخطب، میمونہ بنت حارث بن حزن\n" +
                "\n" +
                "\n" +
                "\n" +
                "حضرت فاطمہ (س) کے سوا رسول اللہؐ کے دوسرے بچے آپ کی زندگی میں ہی دنیا سے رخصت ہوئے اور آپ کی نسل صرف اور صرف سیدہ فاطمہ(س) سے چلی۔ مجموعی طور پر آپ کے 3 بیٹے اور چار بیٹیاں تھیں:\n" +
                "\n" +
                "قاسم: پہلے فرزند جن کا انتقال دو سال کی عمر میں مکہ میں ہوا۔\n" +
                "عبد اللہ: بعثت کے بعد مکہ میں پیدا ہوئے اور وہیں وفات پاگئے۔\n" +
                "زینب: سنہ 8 ہجری کو مدینہ میں وفات پاگئیں۔\n" +
                "رقیہ: سنہ 2 ہجری کو مدینہ میں انتقال کرگئیں۔\n" +
                "ام کلثوم: سنہ 9 ہجری کو مدینہ میں دنیا سے رخصت ہوئیں۔\n" +
                "حضرت فاطمہ: جن کی شہادت سنہ 11 ہجری کو رسول اللہ کے وصال کے کچھ عرصہ بعد مدینہ میں ہوئی۔\n" +
                "ابراہیم: سنہ 10 ہجری کو مدینہ میں انتقال کرگئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بعثت:\n" +
                "\n" +
                "شیعہ امامیہ کے مشہور قول کے مطابق رسول اللہؐ 27 رجب المرجب کو نبوت پر مبعوث ہوئے۔[22]\n" +
                "\n" +
                "بعثت جس قدر قریب تر آرہی تھی آپ لوگوں سے دور اور خدائے یکتا کی عبادت میں مصروف رہتے تھے۔ آپ ہر سال ایک مہینہ حرا نامی پہاڑی میں غار حراء میں گوشہ نشینی اختیار کرکے عبادت میں مصروف رہتے۔ (دیکھئے: تحنّث) اس زمانے میں جو غریب افراد آپ کی خدمت میں حاضر ہوجاتے آپ انہیں کھانا کھلاتے۔ عبادت کا مہینہ ختم ہونے کے بعد مکہ تشریف لاکر گھر واپس جانے سے پہلے سات یا کچھ زیادہ مرتبہ خانۂ کعبہ کا طواف فرماتے اور اس کے بعد اپنے گھر تشریف لے جاتے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تبلیغ دین:\n" +
                "\n" +
                "مشہور ہے کہ نبوت و رسالت پر مبعوث ہونے کے بعد محمدؐ کی تبلیغ کا سلسلہ تین سال تک خفیہ رہا؛ تاہم بعض مؤرخین قرآنی آیات کی ترتیب نزول کے پیش نظر کہتے ہیں کہ عمومی تبلیغ بعثت کے تھوڑے عرصے بعد ہی شروع ہوگئی تھی۔[32]\n" +
                "\n" +
                "پیغمبر خداؐ ابتدا میں لوگوں کو بتوں کی پرستش ترک کرنے اور صرف خدائے واحد کی پرستش کی دعوت دیتے تھے۔ ابتدا میں نمازیں دو رکعتی ہوتی تھیں۔ بعد میں حاضرین پر چار رکعت اور مسافرین پر دو رکعت نماز واجب ہوئی۔ مسلمان نماز اور خدا کی پرستش کے وقت لوگوں کی نظروں سے اوجھل ہوجاتے تھے اور پہاڑیوں کی کھائیوں، شگافوں اور لوگوں کی آمد و رفت سے دور نماز ادا کرتے تھے۔ رفتہ رفتہ اسلام مکہ میں پھیل گیا۔\n" +
                "روایت مشہور ہے کہ: جب آپ کی دعوت کو تین سال ہوئے تو پروردگار نے آپ کو مأمور کیا کہ لوگوں کو اعلانیہ طور پر خدا کی طرف بلائیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "قریش کی دشمنی اور اس کے نتائج:\n" +
                "\n" +
                "رفتہ رفتہ مسلمانوں کی تعداد روز افزوں ہوئی اور قریش کے عمائدین کی فکرمندی میں اضافہ ہوا۔ وہ (رسول اللہؐ کے چچا اور حامی و سرپرست حضرت) ابو طالبؑ کے پاس آئے اور ان سے درخواست کی کہ اپنے بھتیجے کو اس دعوت و تبلیغ سے باز رکھیں۔ ایک دن انھوں نے ابو طالبؑ سے درخواست کی محمدؐ کو ان کے سپرد کریں تاکہ وہ آپ کو قتل کریں اور آپؐ کے عوض وہ عمارة بن ولید نامی نوجوان ان کے سپرد کریں گے جو ایک خوبصورت اور مشرکین کے بقول عقل مند نوجوان تھا۔ ابو طالبؑ نے جواب دیا: کیا میں اپنا بیٹا تمہارے حوالے کردوں کہ تم اسے مار ڈالو اور میں تمہارے بیٹے کو پالوں اور پروان چڑھاؤں؟ کیا دشوار فریضہ ہے یہ؟۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ہجرت مدینہ:\n" +
                "\n" +
                "اس رات جب قریش نے رسول اللہ (ص) کے قتل کو انجام دینے کی کوشش کی, خدا کے فرمان کے مطابق رسول اللہ علی کو اپنی جگہ سلا کر مکہ سے نکل گئے۔(دیکھیں:شب ہجرت)رسول خدا ابو بکر بن ابی قحافہ کے ساتھ مدینہ کی جانب عازم سفر ہوئے اور 3 دن تک مکہ کے نزدیک غار ثور میں ٹھرے رہے تا کہ ان کا پیچھا کرنے والے نا امید ہو جائیں۔ اس کے بعد آپؐ نے غیر معروف راستے سے یثرب کی طرف ہجرت فرمائی۔[51]\n" +
                "\n" +
                "بن کلبی نے رسول اللہ کے مکہ سے باہر نکلنے کی تاریخ 1 ربیع الاول اور قبا پہنچنے کی تاریخ اسی مہینے کی 12 بروز جمعہ ذکر کی ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "فتح مکہ سے پہلے کی جنگیں:\n" +
                "\n" +
                "جنگ بدر\n" +
                "آخر کار ہجرت کے اسی دوسرے سال کے دوران مسلمانوں اور مشرکین کے درمیان اہم ترین لڑائی ہوئی۔ یہ لڑائی غزوہ بدر کے نام سے مشہور ہے۔ اس جنگ میں گو کہ مسلمانوں کی تعداد مکیوں سے بہت کم تھی، مگر وہ فتح یاب ہوئے اور بڑی تعداد میں مکی مشرکین مارے گئے یا پھر قید کرلئے گئے اور باقی فرار ہونے میں کامیاب ہوئے\n" +
                "\n" +
                "جنگ احد\n" +
                "سنہ 3 ہجری میں قریشیوں نے اپنے حلیف قبائل کو مسلمانوں کے خلاف لڑنے کے لئے مدد کے لئے بلوایا اور وہ ابوسفیان کی سرکردگی میں ہر قسم کے ہتھیاروں اور ساز و سامان سے لیس لشکر لے کر مدینہ کی طرف روانہ ہوئے۔ رسول اللہؐ نے ابتدا میں فیصلہ کیا تھا کہ مدینہ میں رہ کر حملہ آور مشرکین کا مقابلہ کریں لیکن بعد میں آپ نے اپنا فیصلہ بدل دیا اور مدینہ سے باہر آئے۔ کوہ احد کے قریب ایک جگہ دو لشکروں کا آمنا سامنا ہوا\n" +
                "اس جنگ میں رسول اللہؐ کے چچا (اسد اللہ اور اسد رسول اللہ) حضرت حمزہ بن عبدالمطلبؑ بھی شہید ہوئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "صلح حدیبیہ:\n" +
                "\n" +
                "ذیقعد سنہ 6 ہجری کو رسول اللہؐ مدینہ کے پندرہ سو مردوں کے ہمراہ عمرہ کی ادائیگی کی غرض سے مکہ روانہ ہوئے۔ قریش کو رسول اللہؐ کے ارادے کا علم ہوا تو انھوں نے آپ کو مکہ پہنچنے سے روکنے کی تیاری کی۔ ابتداء میں خالدبن ولید(مخزومی) اور عکرمہ بن ابی جہل (مخزومی) کو روانہ کیا تاکہ وہ آپ کو مکہ آنے سے روک لیں۔ رسول اللہؐ حدیبیہ نامی مقام پر اترے جہاں سے حدود حرم کا آغاز ہوتا ہے۔ آپ نے وہیں سے اہالیان مکہ کو پیغام بھجوایا کہ \"ہم جنگ کے لئے نہیں بلکہ زیارت کے لئے آئے ہیں\"، مگر قریشی نہ مانے اور آخرکار آپؐ اور اہالیان مکہ کے نمائندے کے درمیان ایک معاہدے پر دستخط ہوئے جس کے تحت \"آنے والے دس برسوں کے دوران فریقین کے درمیان کوئی جنگ نہ ہوگی، اس سال مسلمان لوٹ کر واپس مدینہ جائیں گے لیکن اگلے سال اسی موقع پر مکہ کے مکین تین دن تک شہر چھوڑ کر چلے جائیں گے اور اسے مسلمانوں کے سپرد کریں گے تا کہ وہ زیارت کریں\"۔\n" +
                "اس مصالحت نامے میں طے کیا گیا کہ \"اہل مکہ میں سے جو بھی محمدؐ کے پاس آجائے گا آپ اسے مکہ لوٹا دیں گے لیکن اگر کوئی مدینہ سے مکہ چلا گیا تو مکیوں کے لئے اسے مدینہ لوٹانا لازم نہ ہوگا\"۔ نیز اس معاہدے میں قرار پایا کہ تمام قبائل کو یہ فیصلے کرنے کا پورا اختیار ہوگا کہ وہ قریش کے حلیف ہوں یا پھر محمدؐ کے\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "فتح مکہ:\n" +
                "\n" +
                "فتح مکہ ، 8/630 میں رسول اللہ صلی اللہ علیہ وسلم کی زیرقیادت مسلمانوں کی طرف سے قریش کے ٹوٹے ہوئے حدیبیہ معاہدے کے جواب کے طور پر مکہ کو فتح کرنے کا واقعہ ہے۔ اس کا ایک نتیجہ یہ ہوا کہ اگلے برسوں میں مشرک عربوں نے اسلام قبول کیا۔ مسلمانان مکہ میں داخل ہونے سے پہلے ہی ابو سفیان جیسے مشرکین مشرکین مسلمان ہوگئے تھے۔ پیغمبر اکرم (ص) نے \"الووم ، یوم المہما\" (\"آج رحمت کا دن ہے\") کہا اور سب کو معافی دی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "فتح مکہ کے بعد جنگیں:\n" +
                "\n" +
                "حنین کی جنگ\n" +
                "تبوک کی جنگ\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "غدیر خم:\n" +
                "\n" +
                "رسول اللہؐ ذو القعدہ سنہ 10 ہجری کو اپنے آخری حج کے لئے مکہ روانہ ہوئے۔ اسی سفر کے دوران آپؐ نے لوگوں کو احکام حج کی تعلیم دی\n" +
                "\n" +
                "مدینہ لوٹتے وقت مصر، حجاز اور عراق کے راستوں کی جداہونے کے مقام جحفہ پر غدیر خم کے نام سے مشہور جگہ پر آپؐ کو اللہ کا حکم ملا کہ \"اپنے جانشین کے طور پر علیؑ کے نام اعلان کریں ، اور واضح تر یہ کہ رسول اللہؐ کے بعد حکومت اسلامی کی قسمت کا فیصلہ اور تعین ہونا چاہئے۔ رسول اللہؐ نے مسلمانوں کے 10 ہزار ،[99] 12 ہزار،[100] 17 ہزار،[101] 70 ہزار[102] 11400[103] کے عظیم اجتماع میں اعلان فرمایا:\n" +
                "\n" +
                "من كنت مولاه فهذا على مولاه اللهم وال من والاه وعاد من عاداه واحبّ من احبّه وابغض من ابغضه وانصر من نصره واخذل من خذله وأدار الحق معه حیث دار۔\n" +
                "میں جس پر بھی ولایت رکھتا ہوں، علی بھی اس پر ولایت رکھتے ہیں اور اس کے مولا ہیں۔ خداوندا! اس کا ساتھ دے جو علی کا ساتھ دے اور دشمن رکھ جو علی کو دشمن رکھے۔ اور دوست رکھ جو علی کو دوست رکھے اور دشمنی کر اس سے جو علی کی دشمنی کرے۔ اور تنہا چھوڑ دے اسے جو اس کو تنہا چھوڑ دے اور حق کو اس کے ساتھ پلٹا دے جس طرف کہ وہ پلٹتا ہے)۔\n" +
                "اور فرمایا کہ حاضرین غائبین کو خبر دیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مباہلہ:\n" +
                "\n" +
                "نویں صدی ہجری میں رسول اللہ نے مختلف حکومتوں کے سربراہوں کو خطوط لکھے۔ایک خط نجران کے ساکنین کے نام بھی لکھا جس میں انہیں اسلام قبول کرنے کی دعوت دی ۔اس کے جواب میں انہوں نے ایک 30افراد پر مشتمل ایک وفد تحقیق کیلئے مدینہ بھیجا ۔ وہ رسول خدا سے گفت و شنید سے کسی نتیجے پر نہ پہنچے تو بات مباہلے پر ختم ہوئی ۔ طرفین مدینے سے باہر صحرا میں اکٹھے ہوطے پایا ۔مباہلے کے روز رسول خدا اپنے ہمراہ حضرت علی ،حضرت فاطمہ ، حضرت امام حسن اور حضرت امام حسین علیہم السلام کو لے کر آئے ۔جب نصارا نے انہیں دیکھا تو انہوں نے مباہلہ سے انکار کیا اور صلح کی پیش کش کی ۔ رسول خدا نے اسے قبول کیا۔ رسول خدا اور نجران کے وفد کے درمیان ایک صلحنامہ لکھا گیا\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


            str.add("\n" +
                    "نیک نامی:\n" +
                    "\n" +
                    "پیغمبرؐ نے بعثت سے قبل 40 سال تک عوام کے درمیان بسر کئے تھے۔ آپ کی زندگی ہر قسم کی منافقت اور ناپسندیدہ خصوصیات و کیفیات سے خالی تھی۔ آپ لوگوں کے نزدیک صادق اور امین سمجھے جاتے تھے\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "اخلاق:\n" +
                    "\n" +
                    "رسول اللہؐ کی اعلی ترین اور نمایاں ترین خصوصیت آپ کی اخلاقی خصوصیت تھی۔\n" +
                    "رسول اللہؐ کے طرز سلوک اور صفات کے بیان میں منقول ہے کہ آپ اکثر خاموش رہتے تھے اور ضرورت سے زیادہ نہيں بولتے تھے۔ کبھی بھی پورا منہ نہيں کھولتے تھے، زیادہ تر تبسم فرماتے تھے اور کبھی بھی اونچی آواز میں (قہقہہ لگا کر) نہيں ہنستے تھے،\n" +
                    "انتہائی سادہ زندگی گذارتے تھے، زمین پر بیٹھتے تھے اور زمین پر ہی بیٹھ کر کھانا تناول فرماتے تھے\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "زہد:\n" +
                    "\n" +
                    "پیغمبر اکرمؐ زاہدانہ زندگی بسر کرتے تھے۔ آپ نے پوری حیات میں اپنے لئے کوئی خانہ و کاشانہ بنانے کا اہتمام نہیں کیا \n" +
                    "آپ نے کبھی بھی دو روز مسلسل پیٹ بھر کر کھانا نہیں کھایا، کبھی بھی ایک روز دو بار پیٹ بھر کر دسترخوان سے نہیں اٹھے۔ بارہا اور بارہا آپ اور آپ کے اقرباء راتوں کو بھوکے سوتے تھے\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "نظم و انضباط اور آراستگی:\n" +
                    "\n" +
                    "رسول اللہؐ زندگی کے امور میں بہت زيادہ منظم تھے\n" +
                    "شب و روز کے اوقات کو تین حصوں میں تقسیم کرتے تھے؛ کچھ وقت عبادت الہی کے لئے مختص فرمایا کرتے تھے، کچھ وقت اہل خانہ کو دیتے تھے اور کچھ وقت اپنے لئے قرار دیتے تھے اور پھر اپنے وقت کو لوگوں کے ساتھ بانٹ لیتے تھے\n" +
                    "آپ سفر کے دوران بھی اپنی ظاہری صورت کی طرف توجہ دیا کرتے تھے اور پانچ چیزیں ہر وقت آپ کے پاس موجود رہتی تھیں: آئینہ، سرمہ دان، کنگھی، مسواک اور قینچی۔[134]\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n");

        str.add("\n" +
                "سنہ 11 ہجری کے ابتدائی مہینوں میں رسول اللہؐ بیمار ہوئے اور وفات پا گئے۔ جب آپ کی بیماری شدت اختیار کرگئی تو منبر پر رونق افروز ہوئے اور مسلمانوں کو ایک دوسرے کے ساتھ مہربانی کی سفارش فرمائی اور فرمایا: اگر کسی کا مجھ پر کوئی حق ہے تو وہ مجھ سے وصول کرے یا بخش دے اور میں نے کسی کو آزردہ کیا ہے تو میں تلافی کے لئے تیار ہوں\n" +
                "\n" +
                "ایک روایت کے مطابق پیغمبر اکرمؐ اسی سال 28 صفر سنہ 11ہجری اور دوسری روایت کے مطابق 12 ربیع الاول کو 63 سال کی عمر میں انتقال فرما گئے۔ جیسا کہ نہج البلاغہ میں مذکور ہے وفات کے وقت آپ کا سر امام علیؑ کے سینے اور گردن کے درمیان تھا۔[108]\n" +
                "\n" +
                "اس وقت حضرت سیدہ فاطمہ(س) کے سوا آپ کے فرزندوں میں سے کوئی بھی زندہ نہ تھا۔ آپ کی وفات سے ایک یا دو سال قبل متولد ہونے والے ابراہیم سمیت آپ کے تمام فرزند وفات پاچکے تھے۔ آپ کے جسم مطہر کو حضرت علیؑنے اپنے خاندان کے چند افراد کے ساتھ مل کر غسل اور کفن دیا اور مسجد النبی میں موجود آپ کے اپنے گھر میں سپرد خاک کیا۔\n" +
                "\n" +
                "\n" +
                "\n");

        udesc.add(str);






        etitleH.add("Imam Ali (A)");
        utitleH.add("امام علی (ع)");


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("اخلاقی فضائل");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam1.jpg");


        str=new ArrayList<>();

        str.add("Alī b. Abī Ṭālib (Arabic: علي بن أبي طالب) known as Imam ʿAlī (a) (b. 23 BH/600 - d. 40/661) is the first Imam of all the branches of the Shi'a, a companion, a narrator, and a scribe of the Qur'an. He is the fourth caliph of the Rightly Guided Caliphs in Sunni Islam. 'Ali (a) is the cousin, and son-in-law of the Prophet (s), the husband of Lady Fatima (a), the father of Imam al-Hasan (a) and Imam al-Husayn (a). \n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu l-Hasan, Abu Turab, Abu l-Sibtayn, Abu l-Rayhanatayn, Abu l-A'imma.\n" +
                "\n" +
                "Born:\t\tRajab 13, 23 BH/September 28, 600\n" +
                "\n" +
                "Birthplace:\tKa'ba, Mecca\n" +
                "\n" +
                "Imamate:\t\tFrom Safar 28, 11/May 25, 632(for 29 years)\n" +
                "\n" +
                "Reign:\t\t656 – 661\n" +
                "\n" +
                "Martyrdom:\tRamadan 21, 40/January 28, 661 in Mosque of Kufa\n" +
                "\n" +
                "Cause of Martyrdom: \tWhile performing morning prayer, he was struck with a sword by Abd al-Rahman b. Muljam al-Muradi and martyred from its injury two days later.\n" +
                "\n" +
                "Burial Place:\tNajaf \n" +
                "\n" +
                "Successor:\t\tAl-Hasan (a)\n" +
                "(As the Second Imam of the Shia and Caliph, and As the Fifth of Rashidun Caliphate)\n" +
                "\n" +
                "Father:\t \tAbu Talib b. 'Abd al-Muttalib\n" +
                "\n" +
                "Mother:\t  \tFatima bt. Asad\n" +
                "\n" +
                "Brother(s): \tJa'far, 'Aqil, Talib\n" +
                "\n" +
                "Spouse(s):\t\tFatima, Umama, Umm al-Banin, Layla, Asma', Sahba', Khawla\n" +
                "\n" +
                "Son(s):\t\tAl-Hasan, al-Husayn, Muhsin, 'Abbas, 'Abd Allah, Ja'far, 'Uthman, 'Ubayd Allah, Abu Bakr, Muhammad, 'Umar,...\n" +
                "\n" +
                "Daughter(s)\tZaynab, Umm Kulthum, Ruqayya,...\n" +
                "\n" +
                "Descendants:\tSayyid, 'Alawi\n" +
                "\n" +
                "Titles:\t\tAmir al-Mu'minin (ruler of the believers) Bab Madinat al-Ilm (door to the city of knowledge\")\n" +
                "al-Murtada (the chosen and contented one)\n" +
                "Asad Allah (lion of god)\n" +
                "Haydar (lion)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "According to Shi'i historians and many Sunni scholars, he was born inside the Ka'ba. He was also the first Muslim.\n" +
                "\n" +
                "Based on evidence from the Qur'an, hadith, and history, the Shi'a believe that 'Ali (a) was the direct designated successor of the Prophet (s). \n" +
                "\n" +
                "When the Quraysh plotted to assassinate the Prophet (s), it was 'Ali (a) who slept where the Prophet (s) used to sleep, and thus helped the Prophet (s) to secretly leave for Medina. In the pact of brotherhood in Medina, the Prophet (s) chose 'Ali (a) as his brother. Except for the Battle of Tabuk when he stayed in Medina as the deputy of the Prophet (s), 'Ali (a) was with the Prophet (s) in all the battles. He was the most proud commander of Islam.\n" +
                "\n" +
                "After the Prophet's (s) demise, a group of people pledged allegiance with Abu Bakr in Saqifa as the caliph contrary to what the Prophet had explicitly stipulated in Ghadir. 25 years later after the caliphate of Abu Bakr, 'Umar and 'Uthman, 'Ali (a) accepted the caliphate at the overwhelming insistence of the Muslims. During his short rule, he was faced with three rebellions and was ultimately assassinated by one of the Kharijites while praying in the Mihrab (the prayer niche) of the Kufa Mosque, and was then secretly buried in Najaf.");


        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "Imam 'Ali (a) was born inside the Ka'ba in Mecca on Friday, Rajab 13, in the thirtieth year after the year of the elephant (23 BH/September 28, 600 CE).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Spouses and Children:\n" +
                "\n" +
                "The first wife of 'Ali (a) was Fatima (a), the daughter of the Prophet (s).\n" +
                "\n" +
                "Imam Ali (a) did not marry another woman during the life of Fatima (a). After her martyrdom, 'Ali (a) married other women, namely: Umama, Umm al-Banin and others.\n" +
                "\n" +
                "Al-Shaykh al-Mufid has narrated that Ali (a) had 27 children. He also mentions that some Shi'a scholars have mentioned an additional child to the children of Fatima (a) whom the Prophet (s)had named al-Muhsin (mentioned above), Including him, 'Ali (a) had 28 children:\n" +
                "Hasan(a), Hussain(a), Zaynab(a), Umme Kulthum(a),Abbas(a),Muhammad e Hanifiya and some others.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Shabe Hijrat:\n" +
                "With the demise of Abu Talib, the situation became more difficult for the Muslims, and the Prophet (s) decided to emigrate to Medina. The Prophet (s) was informed of the conspiracy of the polytheists to murder him on the night he had planned to embark on his emigration, so Ali (a), 23 years old at the time, slept where the Prophet (s) used to sleep so that the Prophet (s) could secretly leave his house, which was under surveillance by the polytheists.[27] A few days later, and after paying the Prophet's (s) debts, Ali (a) emigrated to Medina together with a group of people among whom were his mother Lady Fatima (a)the Prophet's daughter.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Battles In Prophet's Life:\n" +
                "\n" +
                "In  2/624, in the Battle of Badr between the Muslims and the polytheists of Mecca, a large number of the latter's troops, including some of the chiefs of Quraysh, were killed by Ali (a).[31] \n" +
                "\n" +
                "In 3/625, the polytheists of Mecca waged the battle of Uhud against the Muslims to compensate their defeat in the Battle of Badr.[36] In this Battle, Ali (a) was among the few ones who did not flee the battleground and protected the life of the Prophet (s).\n" +
                "\n" +
                "In 5/627, the Battle of Khandaq took place,[43] which ended with the bravery of Ali (a) in killing 'Amr b. 'Abd Wadd.[44] The third child of Ali (a) and Fatima (a), Zaynab (a), was born in the same year.\n" +
                "\n" +
                "In 7/628, the Battle of Khaybar took place.[49]Ali (a) was one of the flag-bearers of the Muslim army,[50] which was able to conquer Khaybar under his leadership\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ghadeer Khumm:\n" +
                "\n" +
                "In 10/632, the Prophet (s) send Ali (a) on a mission to call the people of Yemen to Islam.[61] In the same year, the Prophet went on his last pilgrimage to Mecca,[62] and Ali joined him in Mecca from Yemen.[63] After the hajj, on his way back to Medina in an area called Ghadir Khumm, the Prophet (s) proclaimed Ali to be his successor and the executor of his will.[64] This event is known as the Event of Ghadir Khumm. Ali (a) was 33 years old at the time.\n" +
                "\n" +
                "\n" +
                "After Prophet:\n" +
                "\n" +
                "When Ali (a) was occupied with performing the burial rituals and ceremony for the Prophet (s), a group of the Companions gathered in Saqifaand elected Abu Bakr as the caliph and successor of the Prophet (s).\n" +
                "\n" +
                "Some scholars, such as al-Shaykh al-Mufid, hold that the Imam (a) never pledged his allegiance to Abu Bakr.\n" +
                "\n" +
                "Abu Bakr also confiscated Fadak,[72] to which Ali (a) objected in defense of Fatima (a).[73] The invasion of the Imam's (a) house resulted in Fatima's (a) illness, and led to her martyrdom in 11/632.[74]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "His Caliphate:\n" +
                "\n" +
                "In Dhu l-Hijja, 35/June, 656 and after the assassination of Uthman, Ali (a) became the caliph and the leader of the Muslim ummah.\n" +
                "\n" +
                "Two days after the beginning of his caliphate, in his first sermon, Ali (a) urged that all the wealth and properties that had been unjustly taken must be returned, and emphasized justice with regard to the distribution of public properties and wealth.\n" +
                "\n" +
                "Battles as Caliph:\n" +
                "\n" +
                "In 36/656, Talha b. Ubayd Allah and Zubayr b. Awam broke their allegiance to Ali and headed to Mecca to join Aisha, who had called for revenge against the murderers of Uthman. With their supporters, Aisha, Talha, and Zubayr left Mecca for Basra to start the Battle of the Camel, the first civil war in the Muslim community. Imam Ali (A) defeated the opponent army here.\n" +
                "\n" +
                "Imam Ali (a) called Mu'awiyato pledge his allegiance to him. When Mu'awiya rebelliously refused to recognize the Imam's caliphate, Imam Ali (a) decided to remove him from the governorship of Syria and embarked on a military expedition to Damascus against Mu'awiya in Shawwal 36/April 657. Thus, a battle that took place between the two parties in an area called Siffin (hence the name \"the Battle of Siffin\") towards the end of the year 36/657 and the beginning of 37/657. \n" +
                "\n" +
                "Battle of Naharwan against Kharijites etc.\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "Worship:\n" +
                "\n" +
                "Ibn Abi l-Hadid says, \"Ali (a) was the greatest worshiper amongst people, and he prayed and fasted more than anyone else. People learned the night prayers, persistence in the recitation of dhikrs, and the recommended prayers from him. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Generosity and Openhandedness:\n" +
                "\n" +
                "It is said that he would water the date gardens of the Jews in Medina with his own hands until they became calloused, and he gave all of his profits to the poor, and tied stones to his stomach (so that he could handle the pangs of his own hunger]. It is said that he never said \"no\" to a beggar.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Forbearance:\n" +
                "\n" +
                "Ibn Abi l-Hadid says, \"'Ali (a) was greater than all with regards to forbearance, magnanimity, and in forgiving a wrongdoer. What happened in the Battle of Jamal best supports this claim. \n" +
                "\n" +
                "His behavior towards 'A'isha after the Battle of Jamal has been famously narrated. When he won the battle, he treated 'A'isha with respect, and returned her to Medina accompanied by twenty women from the tribe of 'Abd al-Qays.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Geniality:\n" +
                "\n" +
                "Ibn Abi l-Hadid says, \"He was an exemplar of geniality and cheerfulness, to the extent that his enemies criticized his geniality as a flaw in his character.\" Sa'sa'a b. Sawhan and other companions of Imam 'Ali said \"Among us, 'Ali (a) was like one of us who did not have any special privileges. While he was humble and modest, he still had such an awe-inspiring personality that before him, we were like captivated prisoners whose hands and feet were tied, held captive by a man with a sword.\"[255]\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "On the morning of Ramadan 19, 40/January 26, 661, (during the days in which 'Ali (a) was mobilizing an army for Siffin), he was struck with a sword by Abd al-Rahman b. Muljam al-Muradi and martyred from its injury two days later.[217] \n");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("علی بن ابی طالب (23 عالم الفیل - 40ھ) امام علی و امیرالمومنین کے نام سے مشہور، شیعوں کے پہلے امام، صحابی، راوی، کاتب وحی، اہل سنت کے چوتھے خلیفہ، رسول خداؐ کے چچازاد بھائی و داماد، حضرت فاطمہؑ کے شوہر اور گیارہ شیعہ آئمہ کے والد و جد ہیں۔ حضرت ابو طالب آپ کے والد و فاطمہ بنت اسد والدہ ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے پہلے امام، اہل سنت کے چوتھے خلیفہ\n" +
                "\n" +
                "نام:\t\tعلی ابن ابی طالبؑ\n" +
                "\n" +
                "کنیت:\t\tابو الحسن، ابو السبطین، ابو الریحانتین، ابو تراب، ابو الائمہ ...\n" +
                "\n" +
                "القاب:\t\tامیرالمؤمنین، یعسوب الدین، حیدر، مرتضی، نفس رسول، أخو الرسول، زوج البتول، قسیم الجنّۃ والنار ...\n" +
                "\n" +
                "تاریخ ولادت:\t\t13 رجب، سنہ 30 عام الفیل\n" +
                "\n" +
                "جائے ولادت:\t\tکعبہ، مکہ\n" +
                "\n" +
                "مدت امامت:\t\t29 سال (11-40ھ)\n" +
                "\n" +
                "شہادت:\t\t21 رمضان، سنہ 40 ہجری\n" +
                "\n" +
                "سبب شہادت:\t\tضربت ابن ملجم\n" +
                "\n" +
                "مدفن:\t\tنجف، عراق\n" +
                "\n" +
                "رہائش:\t\tمکہ، مدینہ، کوفہ\n" +
                "\n" +
                "والد ماجد:\t\tابو طالب\n" +
                "\n" +
                "والدہ ماجدہ:\t\tفاطمہ بنت اسد\n" +
                "\n" +
                "ازواج:\t\tحضرت فاطمہ، خولہ، ام حبیب، ام البنین، لیلا، اسما، ام سعید\n" +
                "\n" +
                "اولاد:\t\tحسن، حسین، زینب، ام کلثوم، محسن، محمد بن حنفیہ، عباس، عمر، رقیہ، جعفر، عثمان، عبداللہ، محمد اصغر، عبیداللہ، یحیی، ام الحسن، رملہ، نفیسہ، ام ہانی ۔۔۔\n" +
                "\n" +
                "عمر:\t\t63 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " شیعہ و اکثر سنی مؤرخین کے مطابق آپ کی ولادت کعبہ کے اندر ہوئی۔ رسول اللہؐ نے جب اپنی نبوت کا اعلان کیا تو سب سے پہلے آپ ایمان لے آئے۔ شیعوں کے مطابق آپ بحکم خدا رسول خداؐ کے بلا فصل جانشین ہیں۔\n" +
                "\n" +
                "شب ہجرت جب قریش رسول خدا کو قتل کرنا چاہتے تھے، آپ نے ان کے بستر پر سو کر ان کی جان بچائی۔ اس طرح حضورؐ نے مخفیانہ طریقہ سے مدینہ ہجرت فرمائی۔\n" +
                "\n" +
                "آپ جنگ تبوک کے علاوہ تمام غزوات میں پیغمبر اکرمؐ کے ساتھ شریک تھے۔ جنگ تبوک میں رسول اللہؐ نے مدینے میں آپ کو اپنے جانشین کے طور پر مقرر کیا۔ آپ نے جنگ بدر میں بہت سے مشرکین کو قتل کیا۔ جنگ احد میں آنحضرت کی جان کی حفاظت کی۔ جنگ خندق میں عمرو بن عبدود کو قتل کرکے جنگ کا خاتمہ کر دیا اور جنگ خیبر میں در خیبر کو اکھاڑ کر جنگ فتح کر لی۔\n" +
                "\n" +
                "نبی (ص) کے انتقال کے بعد ، لوگوں کے ایک گروہ نے ثقفہ میں ابوبکر کے ساتھ خلیفہ ہونے کی حیثیت سے بیعت کی ، اس کے برخلاف ، نبی (ص) نے غدیر میں واضح طور پر جو شرط مقرر کی تھی۔\n" +
                "\n" +
                "ابوبکر ، عمر اور عثمان کی خلافت کے 25 سال بعد ، علی (ع) نے مسلمانوں کے زبردست اصرار پر خلافت قبول کی۔ ان کی مختصر حکمرانی کے دوران ، ان کو تین بغاوتوں کا سامنا کرنا پڑا اور بالآخر ایک کھارجی عبد الرحمن ابن ملجم  نے ان کو کوفہ مسجد کے محراب میں نماز پڑھتے ہوئے قتل کردیا ، اور پھر ان کو خفیہ طور پر نجف میں دفن کیا گیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "ولادت:\n" +
                "\n" +
                "امام علیؑ 13 رجب 30 عام الفیل بروز جمعہ (23 سال قبل از ہجرت) خانہ کعبہ کے اندر متولد ہوئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ازواج و اولاد:\n" +
                "\n" +
                "امام علیؑ کی پہلی زوجہ رسول اللہؐ کی بیٹی حضرت فاطمہ زہراءؑ تھیں\n" +
                "آپ نے حضرت زہرا کی حیات میں کوئی شادی نہیں کی۔ ان کی شہادت کے بعد آپ نے شادیاں کیں جن میں:\n" +
                "امامہ,ام البنین\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "شیخ مفید نے الارشاد میں آپ کی اولاد کی تعداد 27 ذکر کی ہے۔ ان کی تعداد محسن جو شکم می شہید ہوئے، ان کے ہمراہ 28 ہوتی ہے۔[160] یہاں آپ کی اولاد کا تذکرہ ان کی والدہ کے نام کے ساتھ کیا جا رہا ہے:\n" +
                "حسن (ع) ، حسین (ع) ، زینب (ع) ، ام کلثوم (ع) ، عباس (ع) ، محمد حنیفیہ(ع)  اور کچھ دیگر۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "شبِ ہجرت:\n" +
                "\n" +
                "حضرت ابو طالب کے بعد حالات مسلمانوں کے لئے بدتر ہو گئے اور آنحضرت نے مدینہ ہجرت کا ارادہ کیا۔ شب ہجرت میں جب آپ کی عمر 23 تھی، آپ مشرکین کی پیغمبر اکرم کے قتل کی سازش سے آگاہ ہونے کے باوجود ان کی جگہ پر سوئے۔ یہ شب لیلۃ المبیت کے نام سے مشہور ہے۔[29] آپ چند روز کے بعد آنحضرتؐ کے پاس جمع امانتوں کو واپس کرکے ایک گروہ کے ساتھ حضرت فاطمہ و فاطمہ بنت اسد کے ہمراہ مدینہ گئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "نبی (ص) کی زندگی میں جنگ:\n" +
                "\n" +
                "2/624 میں ، مسلمانوں اور مشرکین مکہ کے مابین بدر کی جنگ میں ، علی (ع) کے ذریعہ قریش کے کچھ سرداروں سمیت مؤخر الذکر کی فوجوں کی ایک بڑی تعداد ہلاک ہوگئی۔\n" +
                "\n" +
                "3/625 میں ،\n" +
                " جنگ بدر میں اپنی شکست کی تلافی کے لئے مشرکین مکہ نے مسلمانوں کے خلاف احد کی جنگ لڑی۔ [[36] اس جنگ میں ، علی (ع) ان چند لوگوں میں شامل تھے جو میدان جنگ سے نہیں بھاگے اور رسول اللہ (ص) کی جان کی حفاظت کی۔\n" +
                "\n" +
                "5/627 میں ،\n" +
                "خندق کی جنگ ہوئی ، [] 43] جو حضرت علی (ع) کی بہادری کے ساتھ عمرو بن عبد وعد کو قتل کرنے پر ختم ہوا۔ [] 44] اسی سال علی (ع) اور فاطمہ (ع) کی تیسری اولاد زینب (ع) پیدا ہوئی۔\n" +
                "\n" +
                "7/628 میں ،\n" +
                "خیبر کی جنگ ہوئی۔ علی (ع) مسلم فوج کے پرچم برداروں میں سے ایک تھے ، جو ان کی سربراہی میں خیبر کو فتح کرنے میں کامیاب رہا۔\n" +
                "\n" +
                "\n" +
                " \n" +
                "غدیر خمم:\n" +
                "\n" +
                "سنہ 10 ہجری میں آنحضرت نے حضرت علی کو اہل یمن کو دعوت اسلام دینے کے لئے وہاں بھیجا۔[63] اسی سال آنحضرت حج کے لئے تشریف لے گئے۔[64] حضرت علی یمن سے روانہ ہوئے اور مکہ میں آپ (ص) سے ملحق ہو گئے۔[65] آنحضرت نے حج سے واپسی پر غدیر خم کے مقام پر آپ کو اپنا وصی و جانشین قرار دیا۔[66] یہ واقعہ غدیر خم کے نام سے مشہور ہے، اس وقت آپ کی عمر 33 سال تھی\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "رحلت پیغمبر اکرمؐ کے بعد:\n" +
                "\n" +
                "مام علی آنحضرت کی تکفین و تجہیز میں مشغول تھے کہ ایک گروہ نے سقیفہ بنی ساعدہ میں حضرت ابوبکر کو خلیفہ بنا دیا۔ حضرت ابو بکر کی خلافت کے بعد ابتداء میں حضرت علی نے ان کی بیعت نہیں کی[68] لیکن بعد میں آخرکار بیعت کر لی۔[69] شیعوں کا ماننا ہے کہ یہ بیعت اجباری تھی[70] اور شیخ مفید کا ماننا ہے کہ امام علی نے ہرگز بیعت نہیں کی\n" +
                "\n" +
                " ابوبکر نے باغ فدک کو غصب کر لیا[75] اور حضرت ان کا حق لینے کے لئے اٹھے۔[76] حضرت فاطمہ گھر پر ہونے والے حملے کے بعد مریض ہو گئیں اور کچھ عرصہ کے بعد سنہ 11 ہجری میں شہید ہو گئیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "دوران حکومت:\n" +
                "\n" +
                "حضرت علی ماہ ذی الحجہ سنہ 35 ہجری میں قتل عثمان کے بعد خلیفہ بنے۔\n" +
                "\n" +
                "آپ نے اپنی خلافت کے دو دن بعد اپنے اولین خطبے میں عثمان کے زمانہ مین ناحق قبضہ کئے گئے اموال[116] کو واپس کرنے اور بیت المال کی عادلانہ تقسیم کا حکم دیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "خلافت میں جنگیں:\n" +
                "\n" +
                " سنہ 36 ہجری میں طلحہ و زبیر نے آپ کی بیعت کو توڑ دیا اور مکہ میں عائشہ کے ساتھ ملحق ہو گئے[118] جو خون عثمان کا انتقام لینے کے لئے اٹھی تھیں، اس کے بعد انہوں نے بصرہ کی سمت حرکت کی۔[119] اس طرح جنگ جمل، آپ سے ہونے والی[120] اور مسلمانوں کی پہلی داخلی جنگ ہوئی\n" +
                "امام علی نے یہاں مخالف فوج کو شکست دی\n" +
                "\n" +
                "امام نے معاویہ کو بیعت حکم دیا اس کے انکار کے بعد آپ نے اسے شام کی حکومت سے معزول کر دیا۔\n" +
                "ماہ شوال سنہ 36 ہجری میں آپ نے شام پر لشکر کشی کی۔[129] صفین کے علاقہ میں جنگ صفین سنہ 36 ھ کے اواخر اور سنہ 37 ہجری کے اوائل میں واقع ہوئی۔\n" +
                "\n" +
                "خارجیوں کے خلاف نہروان کی جنگ\n" +
                "\n" +
                "\n");



        str.add("\n" +
                "عبادت:\n" +
                "\n" +
                "ابن ابی الحدید کہتے ہیں ، \"علی (ع) لوگوں میں سب سے بڑے نمازی تھے ، اور وہ سب سے زیادہ نماز پڑھتے تھے اور سب سے زیادہ روزہ رکھتے تھے۔\n" +
                "لوگ شب کی نماز ، ذکر کی تلاوت میں استقامت ، اور اس کی سفارش کردہ نمازیں سیکھتے تھے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "سخاوت:\n" +
                "\n" +
                "کہا جاتا ہے کہ ان نے اپنے ہاتھوں سے مدینہ میں یہودیوں کے کھجوروں کو پانی پلایا ، اور انہوں نے اپنا سارا نفع غریبوں کو دے دیا ، اور ان کے پیٹ پر پتھر باندھ لیئے تاکہ وہ اپنی بھوک کی تکلیفیں سنبھال سکے۔ کہا جاتا ہے کہ  انہوں نے کبھی بھی بھکاری کو \"نہیں\" نہیں کہا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "برداشت:\n" +
                "\n" +
                "ابن ابی الحدید کہتے ہیں ، \"علی (ع) برداشت ، عظمت ، اور کسی ظالم کو معاف کرنے میں سب سے بڑے تھے۔ جنگ جمال میں جو کچھ ہوا اس دعوے کی تائید کرتا ہے۔\n" +
                "\n" +
                "جمال کی جنگ کے بعد عائشہ کے ساتھ ان کا برتاؤ مشہور ہے۔ جب وہ جنگ جیت گئے تو انہوں نے عائشہ کا احترام کے ساتھ سلوک کیا ،ان کو عبد القیس کے قبیلے کی بیس خواتین کے ساتھ مدینہ واپس لائے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "\n" +
                "امام علی 19 رمضان سنہ 40 ہجری فجر کے وقت مسجد کوفہ میں سجدہ کی حالت میں ابن ملجم مرادی کی تلوار سے زخمی ہوئے اور دو دن کے بعد 21 رمضان میں شہید ہوئے اور مخفی طور پر دفن کئے گئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        udesc.add(str);






        etitleH.add("Janabe Fatima Zehra (A)");
        utitleH.add("جنبے فاطمہ زہرا (ع)");


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("اخلاقی فضائل");
        str.add("شہادت");

        utitle.add(str);

        img.add("bibi.jpg");


        str=new ArrayList<>();
        str.add("Fāṭima (a) (Arabic: فاطِمَة) commonly known as Fāṭima al-Zahrā (a) فاطِمَة الزهراء) (d. 11/632) was the daughter of the Prophet (s)of Islam (a) and Lady Khadija (a) and the wife of Imam Ali (a). She is one of the People of the Cloak and, in Twelver Shiite belief, one of the Fourteen Infallibles. The second and thirdImams, as well as Lady Zaynab (a), were her children. Al-Zahra', al-Batul, Sayyidat Nisa' al-'Alamin and Umm Abiha are among her epithets. She was the only lady chosen by the Holy Prophet (a) to be part of the Mubahalawith the Christians of Najran.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Born:   Jumada II 20, 9 BH/April 7, 614\n" +
                "\n" +
                "Place of Birth:  Mecca, Arabia\n" +
                "\n" +
                "Places of Residence:  Mecca and Medina\n" +
                "\n" +
                "Martyrdom:  Jumada II 3, 11/August 26, 632\n" +
                "\n" +
                "Cause of Martyrdom:  Injured after the attack on her house\n" +
                "\n" +
                "Burial Place:  Medina (hidden grave)\n" +
                "\n" +
                "Father:  Prophet Muhammad (s)\n" +
                "\n" +
                "Mother:  Lady Khadija (a)\n" +
                "\n" +
                "Brother(s):  Al-Qasim, 'Abd Allah, Ibrahim\n" +
                "\n" +
                "Spouse(s):  Imam 'Ali (a)\n" +
                "\n" +
                "Son(s):  al-Hasan (a), al-Husayn (a), al-Muhsin (a)\n" +
                "\n" +
                "Daughter(s):  Zaynab (a), Umm Kulthum\n" +
                "\n" +
                "Descendants:  Ahl al-Bayt\n" +
                "\n" +
                "Epithets and Titles:  Sayyidat Nisa' al-'Alamin (the master of all the ladies in all the worlds), al-Batul, al-Zahra, al-Siddiqa (truthfull), al-Muhadditha (being talked by engels), al-Mansura (being helped), al-Tahira (the pure), and etc.KunyasUmm Abiha (the mother of her father), Umm al-A'imma (the mother of the Imams), Umm al-Hasan, Umm al-Husayn\n" +
                "\n" +
                "Activities:   Opposition to the decisions of Saqifa, Opposition to the usurpation of Fadak, Fadakiyya Sermon, Aiding the Opponents of Abu Bakr, Defense of Imam Ali (a),\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "She opposed the decisions made during the event of Saqifa, and regarded the caliphate of the first caliph as illegitimate, therefore, she never paid allegiance to him. In defense of Imam Ali’s right (a) to caliphate and objecting to the Usurpation of Fadak, she delivered a speech that became famous as the Fadakiyya sermon. After the demise of the Holy Prophet (s), Fatima (a) was injured when an armed group of zealots, at the order of the first caliph, Abu Bakr, stormed her house. As a result of suffering from both emotional and physical wounds that had debilitated her body, she was advised to rest at home. However, after a short time, she passed away on the Jumada II 3, 11/August 26, 632 in Medina. The body of the Holy Prophet’s (a) daughter was, as she had requested, buried at night and in private. Since then, the location of her grave has not been revealed.\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "Al-Shaykh al-Mufid and al-Kaf'ami believe her birth to have taken place in the 2nd year after the prophetic mission (12 BH/611).\n" +
                "\n" +
                "In many Shia resources, Jumada II 20 is mentioned as lady fatima's (a) birthday\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Childhood:\n" +
                "\n" +
                "While still in her childhood, Fatima (a) experienced the loss of her beloved mother, Lady Khadijah (a) and of her father's uncle and a close supporter, Abu Talib (a).[11] Some other important events that occurred during her childhood include the decision of the Quraish to assassinate the Holy Prophet (a),[12] his night migration from Mecca to Medina and finally the migration of Lady Fatima (a) accompanied by Imam Ali (a) and other ladies from Mecca to Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Married Life:\n" +
                "\n" +
                "The marriage ceremony of Imam Ali (a) and Lady Fatima (a), which was attended by the Muslims, took place in the mosque.[30]\n" +
                "\n" +
                "There is a difference of opinion concerning the date of the marriage ceremony. Most sources record it to have taken place in the second year after Hijra (2/624)[31] i.e. the ceremony took place after the Battle of Badr, in the month of Shawwal or Dhu al-Hijja in the second year after Hijra (Apri or June, 624).\n" +
                "\n" +
                "It has been reported that Fatima (a) would address Imam Ali (a) with affectionate words whilst at home[46] and would address him with the respectful teknonym of Abu l-Hasan whilst in public.[47] It has also appeared in reports that Fatima (a) would use perfumes and jewelry while at home and it can even be seen that on occasions she would give her necklaces and bracelets as charity.\n" +
                "\n" +
                "In the beginning periods of their married life, Imam Ali (a) and Fatima (a) lived in very difficult financial conditions to such an extent[49] that at times they were not able to find food to satiate their children, al-Hasan (a)and al-Husayn (a).[50] However, even with the existence of these harsh conditions, Fatima (a) never complained and even at times tried to assist her husband in acquiring livelihood by spinning wool.[51]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Children:\n" +
                "\n" +
                "Both Shi'i and Sunni sources state that al-Hasan,[55] al-Husayn,[56] Zaynab[57] and Umm Kulthum[58] are the four children of Ali and Fatima.[59] In Shi'i sources and in some Sunni sources a name of another son is mentioned who was miscarried as a result of the injuries that Fatima (a) sustained during the events that occurred after the demise of her father, the Holy Prophet (a). His name is recorded to have been either al-Muhsin (Arabic: مُحسِن) or Muhassan (Arabic: مُحَسَّن).[60]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "The only Lady chosen for Mubahilah:\n" +
                "\n" +
                "From amongst the Muslim women, it was only Fatima (a) who was chosen by the Holy Prophet (s) to take part in the Mubahala against the Christians of Najran. This incident is mentioned in al-Mubahala verse. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "In the hadith, historical and exegetical literature of both the Shia and Sunni schools of thought, numerous virtues have been recorded for Lady Fatima (a).\n" +
                "\n" +
                "Worship:\n" +
                "\n" +
                "Lengthy prayers, night vigils, supplicating for others like her neighbors,[115] fasting and visiting the graves of the martyrs were some of the special characteristics of Fatima (a) that have been reported by the Ahl al-Bayt (a)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Generosity:\n" +
                "\n" +
                "The generosity of Fatima (a) has been recorded as one of her ethical traits. \n" +
                "Giving her wedding dress on the night of her wedding to a person in need,[128]giving her necklace to a poor person[129] and giving away all of the food to a pauper, an orphan and a captive are just some examples.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Muhaddatha:\n" +
                "\n" +
                "Her conversing with the angels has been recorded as another virtue of Fatima (a). This virtue resulted in her being called \"Muhaddatha\"[132] i.e. the one who the angels spoke to.[133\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "During the last few months of her life some very unpleasant and painful incidents occurred. It has been mentioned that during this period no one saw Fatima al-Zahra (a) smiling.[61] The passing of her father, the event of Saqifa, the usurpation of the caliphate, the confiscation of Fadak by Abu Bakr and the delivery of the Fadakiyyah sermon in the presence of many important companions of her father[62] are some of the most important events that took place during this period.\n" +
                "\n" +
                "Being at the side of Imam Ali (a), she was one of the main opponents of the Saqifa counciland the choosing of Abu Bakr as caliph.[63] It was because of this stance that they became targets of the government's threats, of which one example is when the government threatened to set the house of Fatima (a) on fire.[64] When Imam Ali (a) and the other opponents of the caliph refused to pay the oath of allegiance (Bay'a), they sought refuge in the house of Fatima (a), this led to the supporters of the caliph attacking her house and as a result of this attack, Fatima (a) got severely injured when trying to prevent them from taking Imam Ali (a) to Abu Bakr in order to forcibly take his oath of allegiance;[65] this was also the cause of her child being miscarried.[66] After this incident, she fell very ill and after a short time was martyred.[67]\n" +
                "\n" +
                "On her death bed, Fatima (a) made a request to her husband that all those who opposed her and oppressed her should not participate in her funeral prayer and burial and asked him to bury her at night.[68] According to the commonly accepted view, Fatima (a) passed away on the 3rd of Jumada II, 11/August 29, 632, in Medina.[69]\n" +
                "\n" +
                "\n" +
                "\n");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("حضرت فاطمہ زہراؑ (5 بعثت -11ھ) رسول اللہؐ و حضرت خدیجہؑ کی بیٹی، امام علیؑ کی شریک حیات، امام حسنؑ، امام حسینؑ و حضرت زینبؑ کی والدہ گرامی اور اصحاب کسا میں سے ہیں۔ شیعہ اثنا عشری آپؑ کو چودہ معصومین میں شمار کرتے ہیں اور آپ کی عصمت کے قائل ہیں۔ زہرا، بَتول و سیدۃ نساء العالمین آپ کے القاب جبکہ اُمّ اَبیها آپ کی مشہور کنیت ہے۔ فاطمہ واحد خاتون ہیں جو نجران کے عیسائیوں سے مباہلہ میں پیغمبر اکرمؐ کے ہمراہ تھیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کردار:\t\tمعصومہ، اصحاب کساء\n" +
                "\n" +
                "نام:\t\tفاطمہ ؑ\n" +
                "\n" +
                "کنیت:\t\tام ابیہا، ام الائمہ، ام الحسن، ام الحسین، ام المحسن\n" +
                "\n" +
                "ولادت:\t\t20 جمادی الثانی، بعثت کے پانچویں سال\n" +
                "\n" +
                "محل پیدائش:\t\tمکہ\n" +
                "\n" +
                "شہادت:\t\t3 جمادی الثانی، سنہ 11 ہجری۔\n" +
                "\n" +
                "مدفن:\t\tنامعلوم\n" +
                "\n" +
                "محل سکونت:\t\tمکہ، مدینہ\n" +
                "\n" +
                "القاب:\t\tزہرا، صدیقہ، طاہره، راضیہ، مرضیہ، مبارکہ، بتول\n" +
                "\n" +
                "والد ماجد:\t\tپیغمبر اسلام ؐ\n" +
                "\n" +
                "والدہ ماجدہ:\t\tخدیجۂ کبری ؑ\n" +
                "\n" +
                "شریک حیات:\t\tامام علیؑ\n" +
                "\n" +
                "اولاد:\t\tامام حسنؑ، امام حسینؑ، حضرت زینبؑ اور ام کلثومؑ محسن بن علی\n" +
                "\n" +
                "عمر:\t\tاز 18 تا 28 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپ نے سقیفہ بنی ساعدہ کے واقعے کی مخالفت کے ساتھ ابوبکر کی خلافت کو غصبی قرار دیتے ہوئے ان کی بیعت نہیں کی۔ آپ نے غصب فدک کے واقعے میں امیرالمومنین کی دفاع میں خطبہ دیا جو خطبہ فدکیہ سے مشہور ہے۔ حضرت فاطمہؑ پیغمبر اکرمؐ کی وفات کے فوراً بعد ابوبکر کے افراد کی طرف سے گھر پر حملہ کے نتیجے میں زخمی ہوئیں اور بیمار پڑ گئیں پھر مختصر عرصے کے بعد 3 جمادی\u200C الثانی سنہ 11 ہجری کو مدینہ میں شہید ہو گئیں۔ دختر پیغمبرؐ کو ان کی وصیت کے مطابق رات کی تاریکی میں دفنایا گیا اور ان کی قبر کے بارے میں کسی کو خبر نہیں ہوئی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "\n" +
                "\n" +
                "\n" +
                " پیدائش:\n" +
                "\n" +
                "شیخ مفید اور کفعمی نے آپؑ کی ولادت کو بعثت کے دوسرے سال میں ذکر کیا ہے۔\n" +
                "بہت سے شیعہ وسائل میں ، جمعہ دوم 20 کو لیڈی فاطمہ (ع) کی سالگرہ کے طور پر ذکر کیا گیا ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچپن کا دور:\n" +
                "\n" +
                "اس کے علاوہ بچپن کے تین سال آپؑ نے شعب ابی طالب میں گزارے، جس دوران مشرکین مکہ نے بنی ہاشم اور حضورؐ کے چاہنے والوں کا سوشل بائیکاٹ کر رکھا تھا۔[22] اسی طرح آپؑ بچپن میں ہی اپنی والدہ کی شفقت اور اپنے بابا رسول خدا کے چچا اور اہم حامی حضرت ابوطالبؑ کے سایہ شفقت سے محروم ہوئیں۔ [23] اس کے علاوہ قریش کا حضورؐ کو قتل کرنے کا منصوبہ، [24] پیغمبرؐ کا رات کے وقت مکہ سے مدینہ کی طرف ہجرت کرنا اور آپؑ کا بنی ہاشم کی بعض دیگر خواتین سمیت حضرت علیؑ کے ہمراہ مدینہ ہجرت کرنا، حضرت فاطمہؑ کے بچپن میں پیش آنے والے واقعات ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "شادی شدہ زندگی:\n" +
                "\n" +
                "امام علی (ع) اور بی بی فاطمہ (ع) کی شادی کی تقریب ، جس میں مسلمانوں نے شرکت کی ، مسجد میں ہوئی۔ [30]\n" +
                "شادی کی تقریب کی تاریخ کے بارے میں مختلف اختلافات ہیں۔ زیادہ تر وسائل اس کی خبر ہجرت (2/624) کے بعد دوسرے سال میں ہوئے تھے۔ اپریل یا جون ، 624)۔\n" +
                "\n" +
                "بتایا گیا ہے کہ فاطمہ (ع) نے گھر میں ہی امام علی (ع) کو پیار بھری باتوں سے خطاب کیا [] 46] اور عوام الناس میں ابوالحسن کے احترام ٹکنام سے خطاب کریں گے۔ [] 47] یہ خبریں بھی شائع ہوئی ہیں کہ فاطمہ (ع) گھر میں رہتے ہوئے خوشبو اور زیورات استعمال کرتی تھیں اور یہ بھی دیکھا جاسکتا ہے کہ مواقع پر وہ خیرات کے طور پر اپنے ہار اور کڑا دیتی تھیں۔\n" +
                "\n" +
                "اپنی شادی شدہ زندگی کے ابتدائی ادوار میں ، امام علی (ع) اور فاطمہ (ع) نے اس حد تک سخت مشکل معاشی حالات میں زندگی گزاری کہ بعض اوقات اپنے بچوں کو کھانا کھلانے کے لئے کھانا نہیں رکھتے تھے ، الحسن (ع) اور حسین (ع)\n" +
                "یہاں تک کہ ان سخت حالات کی موجودگی کے باوجود ، فاطمہ (ع) نے کبھی شکایت نہیں کی اور یہاں تک کہ کبھی کبھی اون کاٹ کر روزی کے حصول میں اپنے شوہر کی مدد کرنے کی کوشش کی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "اولاد:\n" +
                "\n" +
                "شیعہ اور اہل\u200C سنت دونوں مصادر کا اس بات پر اتفاق نظر ہے کہ امام حسنؑ[48]، امام حسینؑ[49]، حضرت زینبؑ[50] اور ام\u200Cکلثوم، [51] حضرت فاطمہؑ اور امام علیؑ کی اولاد ہیں۔[52] شیعہ اور بعض اہل سنت مصادر میں ایک اور بیٹے کا نام بھی ملتا ہے جو پیغمبر اکرمؐ کی رحلت کے بعد حضرت زہراؑ کے ساتھ پیش آنے والے حوادث میں سقط ہو گیا جس کا نام محسن رکھا گیا تھا۔[53]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مباہلہ کے لئے منتخب ہونے والی واحد خاتون:\n" +
                "\n" +
                "مسلم خواتین میں سے ، یہ صرف فاطمہ (ع) تھیں جنہیں حضور (ص) نے نجران کے عیسائیوں کے خلاف مباہلہ میں حصہ لینے کے لئے منتخب کیا تھا۔ اس واقعہ کا ذکر المباہلہ آیت میں ہوا ہے۔\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "شیعہ اور سنی علما اس بات کے معتقد ہیں کہ حضرت زہراؑ کے ساتھ دوستی اور محبت کو خدا نے مسلمانوں پر فرض قرار دیا ہے\n" +
                "\n" +
                "\n" +
                "عبادت:\n" +
                "\n" +
                "لمبی لمبی نمازیں ، رات کی نماز ، اپنے پڑوسیوں جیسے دوسروں کے لئے دعائیں مانگنا ، روزہ رکھنا اور شہدا کی قبروں کی زیارت کرنا فاطمہ (ع) کی کچھ خاص خصوصیات تھیں جن کے بارے میں اہل بیت (ع) بیان کرتے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "سخاوت:\n" +
                "\n" +
                "فاطمہ (ع) کی سخاوت کو ان کی اخلاقی خصوصیات میں سے ایک کے طور پر ریکارڈ کیا گیا ہے۔\n" +
                "ان کی شادی کی رات کسی محتاج شخص کو ان کی شادی کا جوڑا دینا ، کسی غریب شخص کو اس کا ہار دینا اور ان کا سارا کھانا کسی فقیر ، یتیم اور اسیر کو دینا ، اس کی کچھ مثالیں ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "محَدّثَہ:\n" +
                "\n" +
                "خدا کے مقرب فرشتوں کا حضرت فاطمہؑ کے ساتھ ہمکلام ہونا آپؑ کی خصوصیات میں سے ایک ہے۔ یہی خصوصیت آپؑ کو \"محَدّثَہ\" کہنے کی وجہ بنی\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "حضرت فاطمہؑ کی زندگی کے آخری مہینوں میں کچھ تلخ اور ناگوار واقعات رونما ہوئے جن کی وجہ سے کہا جاتا ہے کہ اس مدت میں کسی نے بھی حضرت فاطمہ زہراؑ کے لبوں پر مسکراہٹ نہیں دیکھی۔[54] ان واقعات میں پیغمبر اکرمؐ کی رحلت،[55] سقیفہ کا واقعہ، ابوبکر اور ان کے ساتھیوں کی جانب سے خلافت اور باغ فدک کا غصب اور صحابہ کرام کے بھرے مجمع میں خطبہ دینا [56] آپ کی زندگی کے آخری ایام میں پیش آنے والے تلخ اور ناگوار واقعات میں سے ہیں۔ اس عرصے میں حضرت فاطمہؑ حضرت علیؑ کے ساتھ ان کے مخالفین کے سامنے امامت و ولایت کے دفاع میں کھڑی تھیں؛[57] جس کی وجہ سے آپ مخالفین کے ظلم و جبر کا نشانہ ٹھہریں اور آپ کے دروازے پر لکڑیاں جمع کر کے دروازے کو آگ لگا دینا اسی سلسلے کی ایک کڑی ہے۔[58] حضرت علیؑ کی جانب سے ابوبکر کی عدم بیعت اور ابوبکر کے مخالفین کا بطور احتجاج آپؑ کے گھر میں اجتماع یہ وہ امور تھے کہ جنہیں بہانہ بنا کر خلیفہ اور ان کے حامیوں نے حضرت فاطمہؑ کے گھر پر حملہ کر دیا اور آخرکار گھر کے دروازے کو آگ لگا دی گئی۔ اس حملے میں حضرت فاطمہؑ حضرت علیؑ کو زبردستی بیعت کیلئے مسجد لے جانے میں مانع بننے کی وجہ سے تشدد کا نشانہ بنیں[59] جس سے آپ کے شکم میں موجود بچہ ساقط ہو گیا۔[60] اس واقعے کی بعد حضرت فاطمہؑ سخت بیمار ہو گئیں [61] اور مختصر عرصے میں آپؑ کی شہادت واقع ہو گئی۔ [62] آپؑ نے حضرت علیؑ کو وصیت کی کہ آپؑ کے مخالفین کو آپؑ کی نماز جنازہ اور دفن وغیرہ میں شرکت کی اجازت نہ دی جائے اور آپؑ کو رات کی تاریکی میں سپرد خاک کیا جائے۔[63] مشہور قول کی بنا پر حضرت فاطمہؑ نے 3 جمادی\u200C الثانی سن 11 ہجری کو مدینہ میں شہادت پائی");

        udesc.add(str);



        etitleH.add("Imam Hasan (A)");
        utitleH.add("امام حسن (ع)");


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("اخلاقی فضائل");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam2.jpeg");


        str=new ArrayList<>();
        str.add("Hasan ibne Ali ibne Abu Talib, known as Imam al-Hasan al-Mujtaba, was the second Imam of the Shi'a (40-50/661-670), the fifth caliph of the Muslim community for seven months, and regarded by some Sunnis as the last of the Rightly Guided Caliphs.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:   Abu Muhammad\n" +
                "Born:   Ramadan 15, 3/March 1, 625\n" +
                "Birthplace :   Medina\n" +
                "Imamate:   From Ramadan 21, 40/January 28, 661(for 10 years)\n" +
                "Reign:   661 – 661 (6 Months)\n" +
                "Martyrdom:   Safar 28, 50/March 27, 670 in Medina\n" +
                "Cause of Martyrdom:   By poisoning\n" +
                "Burial Place:   Al-Baqi' cemetery\n" +
                "Predecessor:   Ali b. Abi Talib (a)\n" +
                "Successor:   Al-Husayn b. 'Ali (a)\n" +
                "Father :   Ali b. Abi Talib (a)\n" +
                "Mother :   Fatima bt. Muhammad (a)\n" +
                "Brother(s):   Al-Husayn, 'Abbas, Muhammad,...\n" +
                "Sister(s):   Lady Zaynab (a)\n" +
                "Spouse(s):   Khawla, Umm Bashir, Umm Ishaq, Ja'da\n" +
                "Son(s):   al-Qasim, Zayd, 'Abd Allah, Talha, al-Hasan, ...\n" +
                "Daughter(s) :   Fatima,...\n" +
                "Descendants:   Banu l-Hasan\n" +
                "Titles:   al-Mujtaba (the chosen),al-Sibt(grandson),Sayyid Shabab Ahl al-Jannah(master of the youth of paradise),\n" +
                "al-Zaki (the pure),al-Taqi (the pious),al-Sayyid (the master)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Al-Hasan b. Ali (a) was the first child of Ali (a) and Fatima (a) and the first grandson of the Prophet (s). It is reported that the Prophet (s) chose the name al-Hasan for him and that he greatly loved him. The first seven years of al-Hasan’s life were during the lifetime of the Prophet (s). He was present in the Allegiance of Ridwan and in the story of Mubahala between the Prophet (s) and the Christian delegate from Najran.\n" +
                "\n" +
                "Shiite and Sunni sources contain numerous reports of al-Hasan's virtues. According to these reports, he was one of the People of the Cloak, about whom the Verse of Purity (Qur'an 33:33) was revealed. The verses 76:8, 42:23, and 3:61 were also revealed about him, his parents, and his brother. He gave all his wealth to charity twice, and because of such acts of generosity, he came to be called \"The Generous One of the Family of the Prophet (s)\". He went to hajj twenty-five times barefoot.\n" +
                "\n");

        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "He was born on Ramadan 15, 3 Hijri in Madina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Childhood:\n" +
                "\n" +
                "It is reported that Imam al-Hasan (a) used to attend the sessions of the Prophet (s) and would retell to his mother what was revealed in those sessions unto the Prophet (s).[14]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Children and Wives:\n" +
                "\n" +
                "There are lots of disagreements regarding the number and name of the wives of Imam Hasan (A). Though there are 2 well-known wives namely Umme Farwa,mother of  Qasim(A).\n" +
                "Ja'da bt. al-Ash'ath,who murdered Imam.\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, the children were fifteen.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate and Caliphate:\n" +
                "\n" +
                "Al-Hasan b. Ali (a) is the second Imam of the Shiʿa. He became the Imam after the martyrdom of his father on 21 Ramadan, 40 AH/January 28, 661 CE.[52] His imamate lasted for ten years. In al-Kafi, al-Kulayni (d. 329/940-1) has collected the hadiths related to the appointment of al-Hasan (a) to imamate. According to one of these hadiths, before his martyrdom, Imam Ali (a) gave his books and weapon (from the Trusts of Imamate) to al-Hasan (a) in the presence of his children and some prominent Shiite figures, and announced that the Prophet (s) had commanded him to appoint al-Hasan (a) as the executor of his will. According to another hadith, when Imam Ali (a) was going to Kufa, he left some of the Trusts of Imamate with Umm Salama, and al-Hasan (a) received them from her when he returned from Kufa.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Battles:\n" +
                "\n" +
                "1. The Battle of Jamal\n" +
                "\n" +
                "Al-Shaykh al-Mufid (d. 413/1022) reports that Imam al-Hasan (a), together with Ammar b. Yasir and Qays b. Sa'd b. 'Ubada, was tasked with calling the Kufans to join the Imam's (a) army.\n" +
                "\n" +
                "2. The Battle of Siffin\n" +
                "\n" +
                "Nasr b. Muzahim (d. 212 AH/827) reports that prior to the beginning of the expedition of Imam Ali's army to Siffin, al-Hasan (a) delivered a speech and encouraged the people to jihad.[46] It is said that in this battle, the right wing of the army was under the command of al-Hasan (a) and his brother al-Husayn (a).[47]\n" +
                "\n" +
                "3. The Battle of Nahrawan\n" +
                "\n" +
                "According to al-Istiʿab, al-Hasan (a) participated in the Battle of Nahrawan as well.[50]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Injury and Peace Treaty with Muʿawiya:\n" +
                "\n" +
                "On Ramadan 21, 40 AH/January 28, 661, and after the martyrdom of Imam Ali (a), al-Hasan (a) became the Imam and successor of his father. More than forty-thousand men pledged their allegiance to him on the same day. However, Muʿawiya did not accept his caliphate, and launched a military expedition against him. Imam al-Hasan (a) sent an army under the command of 'Ubayd Allah b. 'Abbasto confront Muʿawiya's army. The Imam (a) himself headed to Sabat with a group of soldiers. Muʿawiya tried to spread rumors among the Imam's (a) troops to prepare the ground for a peace-treaty. At the same time, one of the Kharijites tried to assassinate Imam al-Hasan (a), which resulted in the Imam’s (a) injury. The Imam (a) was taken to Madain to receive treatment. Simultaneously, a group of Kufan chiefs wrote a letter to Muʿawiya and promised him to either kill al-Hasan (a) or to surrender him to Muʿawiya. Muʿawiya sent their letter to Imam al-Hasan (a) and proposed a peace treaty to the Imam (a). Seeing no other choices before him, Imam al-Hasan (a) accepted the peace treaty and abdicated the caliphate with the condition that Muʿawiya should rule according to the Qur'an and the Sunna of the Prophet (s) and should not appoint any successor for himself, and that no one, including the Shiites, should be persecuted. Muʿawiya did not abide by any of these conditions later. The peace treaty with Muʿawiya led to the dissatisfaction of a number of the Imam’s (a) companions, so much so that some of them called the Imam (a) the Humiliator of the Believers.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Returning to Madina:\n" +
                "\n" +
                "The Imam (a) returned to Medina after the peace treaty in 41 AH/661 and remained there until the end of his life. In Medina, he was as a religious and scholarly authority and had a high social status.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


    str.add("\n" +
            "Barefoot Pilgrimages:\n" +
            "\n" +
            "Imam al-Hasan (a) went on multiple pilgrimages to hajj. It is reported that he would say, “I would be embarrassed to meet my Lord without having walked toward His house.”[149] It is said that he made fifteen,[150]twenty,[151] or twenty-five[152] pilgrimages barefoot, while best camels were walking behind him.[153]\n" +
            "\n" +
            "\n" +
            "\n" +
            "Forbearance:\n" +
            "\n" +
            "There are several accounts of Imam al-Hasan's (a) forbearance, which was so great that earned him the epithet “al-Halim” (the Forbearing One).[154] It is reported, for instance, that a Syrian man saw Imam al-Hasan (a) and started cursing him. When he finished his insults, the Imam (a) smiled, greeted him, and said, “It looks like you are a stranger in this city … If you needed anything, we will fulfill your needs.” The man was deeply impressed by the Imam’s (a) noble reaction; he started crying and recited the following verse: “God knows best with whom to place His message” (Quran 6:124),[155] indicating that the Imam (a) deserved to be a descendant of the Prophet (s).\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Generosity:\n" +
            "\n" +
            "Imam al-Hasan (a) was immensely generous, and because of that he was called “Karim” “Sakhi” and “Jawad” (three Arabic words meaning a generous person).[156] It is reported that he donated all his properties and wealth to charity twice in his life and donated half of all he had three times to the poor and needy.\n" +
            "\n" +
            "It is also reported that he was greatly attentive to people who needed his help such that he would even leave his i'tikaf and tawafto help those who asked him for help and he would refer to a hadith of the Prophet (s) according to which he who fulfills a need of a believer is like one who worships [God]] for years.\n" +
            "\n" +
            "One day, he heard a man praying to God for ten-thousand dirhams. The Imam (a) went home and sent the man the amount.[159] Because of his vast generosity, the Imam (a) has been called by the Shia “the Generous One.”[160]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Humbleness:\n" +
            "\n" +
            "One day, he passed by a group of poor people who were eating pieces of bread. When they saw him, they invited him to eat with them. The Imam (a) accepted their invitation and sat and ate with them and then invited all of them to his house and offered them food and clothes.\n" +
            "\n" +
            "In another occasion, his servant made a mistake, for which he deserved punishment. In order to escape punishment, the servant recited the following part of Qur'an 3:134: “[Those who] excuse [the faults of] the people.” The Imam (a) told him, “I forgave you.” The servant recited another part of the same verse: “Allah loves the doers of good.” So the Imam (a) said, “You are free for the sake of God, and I will grant you twice as much money I used to give you for your work.”[163]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n");


        str.add("\n" +
                "As to the day of Imam al-Hasan's martyrdom, many Shiite scholars such as al-Shaykh al-Mufid,[127] al-Shaykh al-Tusi,[128] al-Tabrisi,[129]Ibn Shahrashub[130] have mentioned Safar 28th ,50 Hijri (March 27, 670 CE).\n" +
                "\n" +
                "When Muʿawiya decided to introduce his son Yazid as his successor and demanded that people pledge their allegiance to him, he sent one-hundred thousand dirhams to Ja'da bt. al-Ash'ath, Imam al-Hasan's wife, to poison the Imam (a). She did so and Imam al-Hasan (a) was martyred forty days after he was poisoned. According to a report, the Imam (a) had requested to be buried next to the grave of the Prophet (s), but Marwan b. al-Hakam and a group of the Umayyads did not let that happen. Thus, he was buried in al-Baqi' cemetery.\n" +
                "\n");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("حسن بن علی بن ابی طالب (3-50ھ) امام حسن مجتبیؑ کے نام سے مشہور شیعوں کے دوسرے امام ہیں۔ آپ حضرت علیؑ اور حضرت زہراؑ کے پہلے فرزند اور پیغمبر اکرمؐ کے بڑے نواسے ہیں۔ آپ کی امامت کا دورانیہ دس سال (40-50ھ) پر محیط ہے۔ آپ تقریبا 7 مہینے تک خلافت کے عہدے پر بھی فائز رہے۔ اہل سنت آپ کو خلفائے راشدین میں آخری خلیفہ مانتے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے دوسرے امام\n" +
                "\n" +
                "نام:\t\tحسنؑ بن علیؑ\n" +
                "\n" +
                "کنیت:\t\tابو محمد\n" +
                "\n" +
                "القاب:\t\tسید، تقی، طیب، زکی، سبط\n" +
                "\n" +
                "تاریخ ولادت:\t\t15 رمضان، سنہ 3 ہجری\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t10 سال (40-50ھ)\n" +
                "\n" +
                "شہادت:\t\t28 صفر، 50 ہجری\n" +
                "\n" +
                "سبب شہادت:\tجعدہ کے زہر سے مسموم\n" +
                "\n" +
                "مدفن:\t\tبقیع، مدینہ\n" +
                "\n" +
                "رہائش:\t\tمدینہ، کوفہ\n" +
                "\n" +
                "والد ماجد:\t\tامام علی\n" +
                "\n" +
                "والدہ ماجدہ:\t\tحضرت فاطمہ\n" +
                "\n" +
                "ازواج:\t\tام بشیر، خولہ، ام اسحق، حفصہ، ہند، جعدہ\n" +
                "\n" +
                "اولاد:\t\tزید، ام الحسن، ام الحسین، حسن، عمرو، قاسم، عبداللہ، عبدالرحمن، حسین، طلحہ، فاطمہ، ام عبداللہ، ام سلمہ، رقیہ\n" +
                "\n" +
                "عمر:\t\t48 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپ حضرت علیؑ اور حضرت زہراؑ کے پہلے فرزند اور پیغمبر اکرمؐ کے بڑے نواسے ہیں۔ آپ کی امامت کا دورانیہ دس سال (40-50ھ) پر محیط ہے۔ آپ تقریبا 7 مہینے تک خلافت کے عہدے پر بھی فائز رہے۔ اہل سنت آپ کو خلفائے راشدین میں آخری خلیفہ مانتے ہیں۔\n" +
                "\n" +
                "تاریخی شواہد کی بنا پر پیغمبر اکرمؐ نےآپ کا اسم گرامی \"حسن\" رکھا اور حضورؐ آپ سے بے انتہا پیار کرتے تھے۔ آپ نے اپنی عمر کے 7 سال اپنے نانا رسول خداؐ کے ساتھ گزارے، بیعت رضوان اور نجران کے عیسائیوں کے ساتھ مباہلہ میں اپنے نانا کے ساتھ شریک ہوئے۔\n" +
                "\n" +
                "شیعہ اور اہل سنت منابع میں امام حسنؑ کے فضائل اور مناقب کے سلسلے میں بہت سی احادیث نقل ہوئی ہیں۔ آپؑ اصحاب کسا کے چوتھے رکن ہیں جن کے متعلق آیہ تطہیر نازل ہوئی ہے جس کی بنا پر شیعہ ان ہستیوں کو معصوم سمجھتے ہیں۔ آیہ اطعام، آیہ مودت اور آیہ مباہلہ بھی انہی ہستیوں کی شان میں نازل ہوئی ہیں۔\n" +
                "\n" +
                "آپ نے دو دفعہ اپنی ساری دولت اور تین دقعہ اپنی دولت کا نصف حصہ خدا کی راہ میں عطا کیا۔ آپ کی اسی بخشندگی کی وجہ سے آپ کو \"کریم اہل بیت\" کے نام سے یاد کیا جاتا ہے۔ آپ نے 20 یا 25 دفعہ پیدل حج ادا کیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "\n" +
                "پیدائش:\n" +
                "\n" +
                "آپ رمضان المبارک 15 ، 3 ہجری کو مدینہ منورہ میں پیدا ہوئے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچپن:\n" +
                "\n" +
                "روایت ہے کہ امام الحسن (ع) نبی اکرم (ص) کے خطبات میں حاضر ہوتے تھے اور اپنی والدہ سے اس بات کا ذکر کرتے تھے جو ان خطبات میں رسول اللہ (ص) پر نازل ہوئی تھی۔ [14]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچے اور بیوی:\n" +
                "\n" +
                "امام حسن (ع) کی ازواج مطہرات کی تعداد اور نام کے حوالے سے بہت سارے اختلافات پائے جاتے ہیں۔ اگرچہ یہاں 2 معروف بیویاں ہیں\n" +
                "فروا ، قاسم (ع) کی والدہ۔\n" +
                "اور جاڈا بنتہ اشعث، جو امام کی قاتل ہے۔\n" +
                "\n" +
                "الشیخ الموفد کے مطابق ، بچے پندرہ تھے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "خلافت اور امامت:\n" +
                "\n" +
                "امام حسن مجتبیؑ 21 رمضان سنہ 40ھ[87] کو اپنے والد گرامی کی شہادت کے بعد 6 سے 8 مہینے تک خلافت کے عہدے پر فائز رہے۔[88] اہل سنت پیغمبر اکرمؐ سے منسوب ایک حدیث کی رو سے آپ کو خلفائے راشدین میں سے آخری خلیفہ جانتے ہیں۔[89] آپ کی خلافت عراق کے لوگوں کی بیعت اور دوسرے مناطق کی حمایت سے شروع ہوئی۔[90] لیکن شام والوں نے معاویہ کی قیادت میں اس بیعت کی مخالفت کی۔[91] معاویہ لشکر لے کر شام سے اہل عراق کے ساتھ جنگ کرنے کیلئے روانہ ہوا۔[92] آخر کار یہ جنگ امام حسنؑ اور معاویہ کے درمیان صلح نیز خلافت کو معاویہ کے سپرد کرنے کے ساتھ اختتام ہوا یوں معاویہ خلافت بنی امیہ کا پہلا خلیفہ بن گیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "جنگیں:\n" +
                "\n" +
                "[نوٹ 2]شیخ مفید (متوفی413ھ) کے مطابق امام حسنؑ اپنے والد گرامی کی طرف سے عمار بن یاسر اور قیس بن سعد کے ساتھ کوفہ جا کر لوگوں کو امام علیؑ کے لشکر میں شامل ہونے کیلئے آمادہ کرنے پر مأمور ہوئے\n" +
                "\n" +
                "نصر بن مزاحم (متوفی 212ھ) کے بقول امام حسنؑ نے صفین کی طرف لشکر کے روانہ ہونے سے قبل ایک خطبہ دیا جس میں لوگوں کو جہاد کی ترغیب دی۔[76] بعض احادیث کے مطابق جنگ صفین میں آپ اپنے بھائی امام حسینؑ کے ساتھ لشکر کے دائیں بازو کی سپہ سالاری کر رہے تھے\n" +
                "\n" +
                "کتاب \"الاستیعاب\" میں آیا ہے کہ حسن بن علیؑ نے جنگ نہروان میں بھی شرکت کی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "معاویہ کے ساتھ جنگ اور صلح:\n" +
                "\n" +
                "21 رمضان 40ھ کو امام علیؑ کی شہادت کے بعد آپ امامت و خلافت کے منصب پر فائز ہوئے اور اسی دن تقریبا 40 ہزار سے زیادہ لوگوں نے آپ کی بیعت کیں۔ معاویہ نے آپ کی خلافت کو قبول نہیں کیا اور شام سے لشکر لے کر عراق کی طرف روانہ ہوئے۔ امام حسنؑ نے عبید اللہ بن عباس کی سربراہی میں ایک لشکر معاویہ کی طرف بھیجا اور آپؑ خود ایک گروہ کے ساتھ ساباط کی طرف روانہ ہوئے۔ معاویہ نے امام حسن کے سپاہیوں کے درمیان مختلف شایعات پھیلا کر صلح کیلئے زمینہ ہموار کرنے کی کوشش کیا۔ یہاں تک کہ ایک خوارج کے ہاتھوں امام پر سوء قصد بھی کیا گیا جس کے نتیجے میں آپؑ زخمی ہوئے اور علاج کیلئے آپ کو مدائن لے جایا گیا۔ اسی دوران کوفہ کے بعض سرکردگان نے معاویہ کو خط لکھا جس میں امامؑ کو گرفتار کر کے معاویہ کے حوالے کرنے یا آپ کو شہید کرنے کا وعدہ دیا گیا تھا۔ معاویہ نے کوفہ والوں کے خطوط کو بھی امامؑ کی طرف بھیجا اور آپ کو صلح کرنے کی پیشکش کی۔ امام حسنؑ نے وقت کے تقاضوں کو دیکھتے ہوئے معاویہ کے ساتھ صلح کرنے اور خلافت کو معاویہ کے حوالے کرنے کا فیصلہ کیا لیکن اس شرط کے ساتھ کہ معاویہ قرآن و سنت پر عمل پیرا ہوگا، اپنے بعد کسی کو اپنا جانشین مقرر نہیں کرے کا اور تمام لوگوں خاص کر شیعیان علیؑ کو امن کے ساتھ زندگی گزارنے کا موقع فراہم کرے گا۔ لیکن بعد میں معاویہ نے مذکورہ شرائط میں سے کسی ایک پر بھی عمل نہیں کیا۔ معاویہ کے ساتھ ہونے والے صلح کی وجہ سے بعض شیعہ آپ سے ناراض ہوگئے یہاں تک کہ بعض نے آپ کو \"مذلّ المؤمنین\" (مؤمنین کو خوار و ذلیل کرنے والا) کے نام سے یاد کرنے لگا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " مدینہ واپسی:\n" +
                "\n" +
                "صلح کے بعد آپ سنہ 41ھ کو مدینہ واپس آئے اور زندگی کے آخری ایام تک یہیں پر مقیم رہے۔ مدینہ میں آپؑ علمی مرجعیت کے ساتھ ساتھ سماجی اور اجتماعی طور پر بھی مقام و منزلت کے حامل تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "پیدل حج:\n" +
                "\n" +
                "امام حسن مجتبیؑ نے کئی بار پیدل حج ادا فرمائی۔ آپ سے منقول ہے کہ فرماتے تھے مجھے اپنے پروردگار سے شرم آتی ہے کہ اس سے ملاقات کروں حالنکہ اس کے گھر کی طرف قدم نہ اٹھایا ہو۔[224] کہا جاتا ہے کہ آپ نے 15[225] یا 20[226] یا 25[227] دفعہ پیدل حج ادا فرمائی۔ حالانکہ بہترین اونٹ آپ کے اختیار میں ہوتے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپ کی بردباری زبان زد عام تھی:\n" +
                "\n" +
                "اسلامی منابع میں آپ کی بردباری کی وجہ سے آپ کو \"حلیم\" کا نام دیا گیا ہے۔[229] بعض اہل سنت منابع میں آیا ہے کہ مروان بن حکم جو آپ کا سرسخت دشمن ہونے اور آپ کو پیغمبر اکرمؐ کے پہلو میں دفنانے نہ دینے کے باوجود آپ کی تشییع جنازہ میں شرکت کر کے آپ کی تابوت کو کاندہ دیا۔ جب اس حوالے سے اس پر اعتراض کیا گیا کہ تم زندگی میں اسے تنگ کرتے تھے ابھی کیوں اس کی تابوت کو کاندہ دے رہے ہو تو اس نے کہا میں نے ایک ایسی شخصیت کو تنگ کیا ہوں جس کی بردباری پہاڑ کی مانند تھی۔[230] کہا جاتا ہے کہ شام کے ایک باشندے نے جب امام حسنؑ کو دیکھا تو آپ کی شان میں گستاخی کی۔ جب وہ شخص خاموش ہوا تو امام حسن مجتبیؑ نے اسے سلام کیا اور مسکراتے ہوئے فرمایا: لگتا ہے کہ تم اس شہر میں اجنبی ہو۔ تمہاری جو بھی خواہش ہو میں اسے پورا کرونگا۔ اس پر وہ شخص روتے ہوئے کہنے لگا خدا بہتر جانتا ہے کہ اپنی رسالت کس کے سپرد کرنا ہے(یعنی وہ یہ کہنا چاہتا ہے کہ امام حسنؑ پیغمبر اکرمؐ کے فرزند ہیں اور خدا کو معلوم تھا کہ نبوت کو کس خاندان میں قرار دینا تھا)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "سخاوت :\n" +
                "\n" +
                "اسلامی منابع میں شیعوں کے دوسرے امام کو بخشنے والا اور کشادہ دل کے عنوان سے یاد کیا گیا ہے اسی لئے آپ \"کریم\"، \"سخیّ\" اور\"جواد\" کے نام سے مشہور تھے۔[232]\n" +
                "\n" +
                "منابع میں آبا ہے کہ آپ نے دو دفعہ اپنی پوری جمع پونجی خدا کی راہ میں بخش دیا اور تین دفعہ اپنی جائدات کا نصف حصہ غریبوں میں تقسیم فرمایا۔\n" +
                "\n" +
                "لوگوں کی مالی مدد کے حوالے سے بھی مختلف واقعات نقل ہوئی ہیں، اس حوالے سے کہا جاتا ہے کہ آپ دوسروں کی حاجت روائی کیلئے اعتکاف اور طواف کو ناتمام چھوڑ کر چلے جاتے تھے اور اس کام کی علت بیان کرتے ہوئے پیغمبر اکرمؐ کی ایک حدیث کی طرف اشارہ فرماتے تھے جس میں آپؐ نے فرمایا: جو شخص کسی مؤمن بھائی کی ضروریات پوری کرے تو وہ اس شخص کی مانند ہو گا جو سالوں سال خدا کی عبادت میں مشغول ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ماتحتوں کے ساتھ فروتنی سے پیش آتے تھے:\n" +
                "\n" +
                "کہا جاتا ہے کہ ایک دن مسکینوں کے قریب سے آپ کا گذر ہوا جو خشک روٹی کے ٹکڑے کھا رہے تھے۔ جب انہوں نے آپ کو دیکھا تو آپ کو دعوت دی تاکہ ان کے ساتھ بیٹھ کر تناول فرمائے۔ آپ گھوڑے سے نیچے آئے اور ان کے پاس بیٹھ کر ان کے ساتھ غذا تناول فرمایا اور سب سیر ہو گئے۔ اس کے بعد ان مسکینوں کو اپنی دولت سرا آنے کی دعوت دی اور انہیں کھانا اور لباس عطا فرمایا۔[238]\n" +
                "\n" +
                "نیز منقول ہے کہ ایک دفعہ آپ کے کسی خادم سے کوئی خطا سر زد ہونے کی وجہ سے وہ سزا کا مستحق قرار پایا۔ اس خدمتکار نے امام حسنؑ سے کہا: \"و العافین عن الناس\" اس پر آپؑ نے فرمایا: میں نے تمہیں معاف کر دیا۔ خدمتکار نے مزید کہا: \"و الله یحب المحسنین\" امام حسن مجتبی نے فرمایا: میں نے تمہیں خدا کی راہ میں آزاد کر دیا اور تمہاری مزدوری کے دو برابر تمہیں بخش دیتا ہوں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "جب تک امام الحسن کی شہادت کے دن تک ، بہت سے شیعہ اسکالرز جیسے الشیخ الموفد ، [127] الشیخ التوسی ، [128] التبریسی ، [129] ابن شہرشوب [130] نے ذکر کیا ہے صفر 28 ویں ، 50 ہجری (27 مارچ ، 670 عیسوی)۔\n" +
                "\n" +
                "جب معاویہ نے اپنے بیٹے یزید کو اپنا جانشین متعارف کروانے کا مطالبہ کیا اور لوگوں سے ان سے وفاداری کا عہد کرنے کا مطالبہ کیا تو ، اس نے امام الحسن کی اہلیہ ، جاڈا بنت ال اشعث کو ایک لاکھ درہم بھیجا ، تاکہ وہ امام کو زہر دے سکے۔ a) اس نے ایسا کیا اور امام الحسن (ع) کو زہر دے کر چالیس دن بعد شہید کردیا گیا۔ ایک خبر کے مطابق ، امام (ع) نے رسول اللہ (ص) کی قبر کے پاس دفن ہونے کی درخواست کی تھی ، لیکن مروان ابن الحکم اور امویوں کے ایک گروہ نے ایسا نہیں ہونے دیا۔ اس طرح ، امام کو البقیع قبرستان میں سپرد خاک کردیا گیا۔\n" +
                "\n" +
                "\n");


        udesc.add(str);

















        etitleH.add("Imam Hussain (A)");
        utitleH.add("امام حسین (ع)");



        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Tragedy of Karbala");
        str.add("Moral Virtues");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("کربلا کا سانحہ");
        str.add("اخلاقی خصوصیات");



        utitle.add(str);


        img.add("imam3.jpeg");



        str=new ArrayList<>();
        str.add("Al-Ḥusayn b. ʿAlī b. Abī Ṭālib (a) (Arabic: الحسين بن علي بن أبي طالب) (b. Sha'ban 3, 4/January 8, 626 – d. Muharram 10, 61/October 10, 680) also known as Abu 'Abd Allah and Sayyid al-Shuhada', was the third Imam of the Shi'a who was martyred in the Battle of Karbala after 10 years of Imamate. He was the second son of Imam 'Ali (a) and Lady Fatima (a), and the grandson of the Prophet (s).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu 'Abd Allah\n" +
                "\n" +
                "Born:\t                   Sha'ban 3, 4/January 8, 626\n" +
                "\n" +
                "Birthplace:\tMedina\n" +
                "\n" +
                "Imamate:   \tFrom Safar 28, 50/March 27, 670(for 10 years)\n" +
                "\n" +
                "Contemporary Rulers:  Mu'awiya, Yazid\n" +
                "\n" +
                "Martyrdom:\t       Muharram 10, 61/October 10, 680\n" +
                "\n" +
                "Cause of Martyrdom:       At the Battle of Karbala\n" +
                "\n" +
                "Burial Place:                Karbala\n" +
                "\n" +
                "Predecessor:\tAl-Hasan b. 'Ali (a)\n" +
                "\n" +
                "Successor:\t'Ali b. al-Husayn (a)\n" +
                "\n" +
                "Father:\t'Ali b. Abi Talib (a)\n" +
                "\n" +
                "Mother:\tFatima bt. Muhammad (a)\n" +
                "\n" +
                "Brother(s):\tAl-Hasan, 'Abbas, Muhammad, ...\n" +
                "Sister(s):\t             Zaynab, Umm Kulthum, ...\n" +
                "Spouse(s): \tRabab, Layla, Umm Ishaq, Shahrbanu (?)\n" +
                "Son(s):\t'Ali, 'Ali al-Akbar, 'Ali al-Asghar, ...\n" +
                "Daughter(s):\tSukayna, Fatima, Zaynab, ...\n" +
                "Titles:\tAl-Shahid (the martyr),al-Sibt (the grandson),\n" +
                "Sayyid Shabab Ahl al-Jannah (the master of the youth of paradise),\n" +
                "Sayyid al-Shuhada (master of the martyrs)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "At the time of his birth, the Prophet (s) foretold his martyrdom and chose al-Husayn as his name. The Prophet (s) introduced him and his brother, Imam al-Hasan (a), as the Masters of the Youth of Paradise. The Prophet (s) loved the two (al-Hasanayn) and instructed people to love them. Al-Husayn (a) is one of the Ashab al-Kisa', one of the participants of the Mubahala, and one of the Ahl al-Bayt (a) about whom al-Tathir Verse is revealed. There are scores of hadiths narrated directly from the Prophet (s) that only add more to the distinctive status of al-Husayn (a).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "Imam al-Husayn (a) was born on Sha'ban 3 /625 in Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "His wives are Shahrbanu, Umme Rabab adn Umme Layla.\n" +
                "\n" +
                "There is disagreement about the count of the children of Imam al-Husayn (a).\n" +
                "\n" +
                "Al-Shaykh al-Mufid reports Imam al-Husayn (a) had six children, four boys and two girls.[23] Some scholars counted nine children, six boys and three girls.[24] Few people have said his children were more than ten.\n" +
                "According to Hadiths,He named all his children as Ali and Fatima.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "The beginning of the imamate of Imam al-Husayn (a) coincided with the tenth year of Mu'awiya's rule. \n" +
                "\n" +
                "After the peace treaty with Imam al-Hasan (a) in 41/661,[99] Mu'awiya became the caliph of the Muslim ummah and established the Umayyad dynasty. \n" +
                "Contrary to his peace treaty with Imam al-Hasan (a), Mu'awiya called the people in 56/676 to pledge allegiance to Yazid as his\n" +
                "successor.[118] Some figures, such as Imam al-Husayn (a) refused to pledge allegiance to Yazid, so Mu'awiya went to Medina to convince them to do so.[119]\n" +
                "In a session that Mu'awiya held for that purpose, Imam al-Husayn (a) rebuked Mu'awiyah, warned him against taking such a measure, considering especially the corrupt character of Yazid, and emphasized his own place and right to take the leadership of the ummah.[120]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Before he left Medina in 60/680, Imam al-Husayn (a) gave some of the trusts of imamate to Umm Salama, the Prophet's (s) wife,[111] and gave the rest to his elder daughter, Fatima,[112] before his martyrdom in Ashura' so that they deliver them to Imam al-Sajjad (a).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Sermon in Mina:\n" +
                "\n" +
                "In 58/677-8, two years before the death of Mu'awiya, Imam al-Husayn (a) gave a protesting speech in Mina.\n" +
                "\n" +
                "In his speech, the Imam (a) mentioned the virtues of Imam Ali (a) and the Ahl al-Bayt (a) and emphasized the importance of commanding good and forbidding evil and the necessity of scholars' objection to the oppression and corruption of unjust rulers.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Leaving Madina and then Mecca:\n" +
                "\n" +
                "Yazid succeeded his father when the latter died on Rajab 15, 60/April 21, 680.[124] He decided to force a number of noble figures, including Imam al-Husayn (a), who had refused to pledge allegiance to him to do so.[125] However, the Imam (a) refused to pledge allegiance again[126] and left Medina on Rajab 28th to Mecca. [127]\n" +
                "\n" +
                "In Mecca, he was received warmly by the people.[128] He stayed there more than four months (from Sha'ban 3rd until Dhu l-Hijja 8th).[129] During this time, the Shiites of Kufa, who learned about the Imam's (a) rejection of paying allegiance to Yazid, wrote him letters, inviting him to Kufa.[130] In order to ascertain the loyalty of the Kufans, the Imam (a) sent Muslim b. Aqil to Kufa to see the circumstances and report back to him. After being welcomed by the people and receiving their vows of allegiance, Muslim b. Aqil wrote a letter to the Imam (a) and affirmed that Kufa was ready to receive him.[131] Thus, the Imam (a) started his travel from Mecca to Kufa on Dhu l-Hijja 8th.[132]\n" +
                "\n" +
                "Please continue reading the next part which is Tragedy of Karbala, the most important event of Imam Hussain's life.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "The Battle of Karbala, which led to the martyrdom of Imam al-Husayn (a) and his companions, can be considered the most important part of the Imam's (a) life.\n" +
                "\n" +
                "The battle took place as a result of his rejection of paying allegiance to Yazid. The Imam (a), who was on his way to Kufa with his family and companions, was encountered with the army of al-Hurr b. Yazid al-Riyahi in an area called Dhu Husam, and was forced to change his route as a result.[134]\n" +
                "\n" +
                "Most sources report that the Imam (a) arrived in Karbala on Muharram 2nd.\n" +
                "\n" +
                "In the morning of Ashura, the battle started, and many of the Imam's (a) companions were martyred.[141] During the battle, al-Hurr b. Yazid, who was one of the commanders of Umar b. Sa'd's army, repented and joined the Imam (a).[142] After the martyrdom of all his companions, the Imam's (a) family members began to go to the battle, the first of whom was Ali al-Akbar.[143] The Imam's (a) family members also were martyred one after another. Finally, Imam al-Husayn (a) himself entered the battlefield and was martyred in the afternoon of Ashura. His murderer was Shimr b. Dhi l-Jawshan[144] \n" +
                "\n" +
                "In order to fully obey Ibn Ziyad's command, Umar b. Sa'd commanded his soldiers to go with their horses on the body of the Imam and break his bones.[147] The women and children and Imam al-Sajjad (a), who was sick, were taken captive and sent to Kufa and then to Damascus.[148] The body of the Imam (a) and about seventy-two[149] of those who were martyred with him were buried on the 11th[150] or 13th of Muharram by a group of Banu Asad—and, according to a report, with the presence of Imam al-Sajjad (a)—in the place where they had been martyred.\n" +
                "\n" +
                "Culturally, Muslims and even non-Muslims regard al-Husayn (a) as a paragon of self-sacrifice, resistance, fight for freedom, protecting values, and truth-seeking.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "He used to sit with the poor, accept their invitations, eat with them, invite them to his house. He never hesitated in giving charity.\n" +
                "\n" +
                "Imam al-Husayn (a) was very generous and known for generosity among people.\n" +
                "\n" +
                "It is reported that Imam al-Husayn (a) spent the land, and whatever he (a) inherited, before he (a) received them, in the way of God. He (a) gave his ring and paid the full debt of a man in return for answers to three questions. His generosity was to the extent that a Jewish couple became Muslim when they saw this merit.\n" +
                "\n" +
                "Regarding his forbearance, it is reported that when a man from Syria insulted him and his father, Imam al-Husayn (a) forgave him and treated him with kindness.\n");

        edesc.add(str);

        str=new ArrayList<>();

        str.add("حسین بن علی بن ابی طالب اباعبد اللہ و سید الشہداء کے نام سے مشہور شیعوں کے تیسرے امام ہیں۔ دس سال منصب امامت پر فائز رہے اور واقعہ عاشورا میں شہید ہوئے۔ آپ امام علیؑ اور فاطمہ زہراؑ کے دوسرے بیٹے اور پیغمبر اکرم ؐ کے نواسے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کا تیسرا امام\n" +
                "\n" +
                "نام:\t\tحسینؑ بن علیؑ\n" +
                "\n" +
                "کنیت:\t\tابو عبداللہ\n" +
                "\n" +
                "القاب:\t\tزکی، سید الشہداء\n" +
                "\n" +
                "تاریخ ولادت:\t\t3 شعبان، سنہ 4 ہجری\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\tتقریباً 10 سال (50ھ کے آغاز سے 61ھ تک)\n" +
                "\n" +
                "شہادت:\t\t10 محرم (عاشورا)، سنہ 61 ھ\n" +
                "\n" +
                "سبب شہادت:\t\tواقعہ عاشورا\n" +
                "\n" +
                "مدفن:\t\tکربلا، عراق\n" +
                "\n" +
                "رہائش:\t\tمدینہ، کوفہ\n" +
                "\n" +
                "والد ماجد:\t\tامام علیؑ\n" +
                "\n" +
                "والدہ ماجدہ:\t\tحضرت فاطمہؑ\n" +
                "\n" +
                "ازواج:\t\tرباب، لیلا، ام اسحاق، شہربانو\n" +
                "\n" +
                "اولاد:\t\tامام سجاد علیہ\u200Cالسلام، علی اکبر، جعفر، علی اصغر، سکینہ، فاطمہ\n" +
                "\n" +
                "عمر:\t\t57 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "شیعہ اور اہل سنت تاریخی مصادر کے مطابق پیغمبر خداؐ نے آپؑ کی ولادت کے دوران آپ کی شہادت کی خبر دی اور آپ کا نام حسین رکھا۔ رسول اللہؐ حسنینؑ کو بہت چاہتے تھے اور ان سے محبت رکھنے کی سفارش بھی کرتے تھے۔ امام حسینؑ اصحاب کسا میں سے ہیں، مباہلہ میں بھی حاضر تھے اور اہل بیتِ پیغمبر میں سے ایک بھی ہیں جن کی شان میں آیۂ تطہیر نازل ہوئی ہے۔ امام حسینؑ کی فضیلت میں آنحضرتؐ سے بہت ساری روایات بھی نقل ہوئی ہیں انہی میں سے یہ روایات بھی ہیں؛«حسن اور حسین جنت کے جوانوں کے» نیز «حسین چراغ ہدایت اور کشتی نجات ہے۔»\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "پیدائش:\n" +
                "\n" +
                "امام الحسین (ع) شعبان 3/625 کو مدینہ منورہ میں پیدا ہوئے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیویاں اور بچے:\n" +
                " \n" +
                "ان کی بیویاں شہر بانو ، رباب اور لیلیٰ ہیں۔\n" +
                "\n" +
                "امام الحسین (ع) کے بچوں کی گنتی کے بارے میں اختلاف ہے۔\n" +
                "\n" +
                "الشیخ الموطف نے خبر دی ہے کہ امام الحسین (ع) کے چھ بچے ، چار لڑکے اور دو لڑکیاں تھیں۔ [23] کچھ اسکالرز نے نو بچے ، چھ لڑکے اور تین لڑکیاں گنی ہیں۔ [24] بہت کم لوگوں نے بتایا ہے کہ ان کے بچے دس سے زیادہ تھے۔\n" +
                "احادیث کے مطابق ، ان نے اپنے تمام بچوں کا نام علی اور فاطمہ رکھا تھا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " امامت:\n" +
                "\n" +
                "\n" +
                "امام الحسین (ع) کی امامت کا آغاز معاویہ کے اقتدار کے دسویں سال کے ساتھ ہوا۔\n" +
                "\n" +
                "امام الحسن (ع) کے ساتھ صلح نامے کے بعد معاویہ امت مسلمہ کا خلیفہ بن گئے اور اموی خاندان کو قائم کیا۔\n" +
                "\n" +
                "معاویہ نے امام الحسن (ع) کے ساتھ اپنے صلحی معاہدے کے برخلاف ، معاویہ نے 56/676 میں لوگوں کو یزید سے بیعت کرنے کا مطالبہ کیا\n" +
                "\n" +
                "کچھ شخصیات ، جیسے امام الحسین (ع) نے یزید کے ساتھ بیعت کرنے سے انکار کردیا ، لہذا معاویہ مدینہ منورہ گیا تاکہ انھیں اس بات پر راضی ہوجائے۔\n" +
                "\n" +
                " اور جب یزید کو ولی عہد بنایا تو آپ نے اس کی بیعت سے انکار کیا اور معاویہ اور بعض دوسروں کے سامنے آپ نے معاویہ کے اس کام کی مذمت کی اور یزید کو ایک نالایق شخص قرار دیتے ہوئے خلافت کو اپنے لئے شایستہ قرار دیا\n" +
                "\n" +
                "60/680 میں مدینہ چھوڑنے سے پہلے ، امام الحسین (ع) نے نبی کریم صلی اللہ علیہ وسلم کی اہلیہ ، ام سلمہ [111] کو امامت کی کچھ امانتیں دیں اور باقی ماندہ اپنی بڑی بیٹی ، فاطمہ ، [112] کو دیں۔ ] عاشورا میں اپنی شہادت سے پہلے 'تاکہ وہ انہیں امام سجاد (ع) کے حوالے کریں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منی میں خطبہ:\n" +
                "\n" +
                "امام حسین نے معاویہ کی وفات سے دو سال پہلے یعنی سنہ58ھ کو منی میں ایک اعتراض آمیز خطبہ دیا\n" +
                "\n" +
                "امام نے اس خطبے میں امیر المؤمنین اور اہل بیتؑ کی فضیلت، امر بہ معروف و نہی از منکر کی دعوت کے ساتھ ساتھ اسی اسلامی وظیفے کی اہمیت کی تاکید، علما کی ذمہ داری اور ظالم کے خلاف قیام اور علما کا ظالموں کے مقابلے میں خاموشی کے نقصانات بیان کئے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مدینہ اور پھر مکہ چھوڑنا:\n" +
                "\n" +
                "معاویہ کی وفات کے بعد امام حسینؑ نے یزید کی بیعت کو شریعت کے خلاف قرار دیا اور بیعت نہ کرنے پر یزید کی طرف سے قتل کی دھمکی ملنے پر 27 رجب 60ھ کو مدینہ سے مکہ گئے۔ مکہ میں چار مہینے رہے اور اس دوران کوفہ والوں کی طرف سے حکومت سنبھالنے کے لیے لکھے گئے متعدد خطوط کی وجہ سے مسلم بن عقیل کو ان کی طرف بھیجا اور مسلم بن عقیل کی طرف سے کوفہ والوں کی تائید کے بعد 8 ذی\u200C الحجہ کو کوفہ والوں کی بے وفائی اور مسلم کی شہادت کی خبر سننے سے پہلے کوفہ کی جانب روانہ ہوئے۔\n" +
                "\n" +
                "براہ کرم اگلے حصے کو پڑھنا جاری رکھیں جو کربلا کا سانحہ ہے ، امام حسین کی زندگی کا سب سے اہم واقعہ۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "واقعہ کربلا جہاں حسین بن علیؑ اور یار و انصار کی شہادت ہوئی؛ آپ کی زندگی کا اہم حصہ شمار ہوتا ہے۔\n" +
                "\n" +
                "یہ واقعہ یزید کی بیعت نہ کرنے کی وجہ سے رونما ہوا۔ امام حسین، کوفہ والوں کی وعوت پر اپنے گھر والے اور اصحاب کے ساتھ کوفہ کی جانب سفر پر نکلے تھے، ذو حسم نامی جگہ پر حر بن یزید ریاحی کی سربراہی میں ایک لشکر کے رو برو ہوئے اور اپنا راستہ کوفہ سے کربلا کی جانب تبدیل دینے پر مجبور ہوئے\n" +
                "\n" +
                "\n" +
                "اکثر تاریخی کتابوں کے مطابق 2 محرم\u200C کو آپ کربلا پہنچے\n" +
                "\n" +
                "روز عاشورا کی صبح کو جنگ شروع ہوئی اور ظہر تک امام حسینؑ کے بہت سارے اصحاب شہید ہوگئے۔[157]جنگ کے دوران عمر سعد کی فوج کے کمانڈروں میں سے حر بن یزید ریاحی فوج کی کمانڈری چھوڑ کر امام حسینؑ سے ملحق ہوئے۔[158]امام کے اصحاب شہید ہونے کے بعد آپ کے رشتہ دار میدان کو گئے اور ان میں سب سے پہلے جانے والے علی اکبر[159]اور وہ ایک ایک ہوتے ہوئے شہید ہوئے اور پھر امام حسینؑ خود میدان کو گئے اور دس محرم کی عصر کو حسین ابن علیؑ بھی شہید ہوئے اور شمر بن ذی\u200Cالجوشن[160] یا ایک اور روایت کے مطابق سنان بن انس\n" +
                "\n" +
                "عمر سعد نے ابن زیاد کے حکم کی تعمیل کرتے ہوئے امام حسینؑ کے بدن پر گھوڑے دوڑانے کا حکم دیا اور آپ کے بدن کی ہڈیاں بھی ریزہ ریزہ کیا۔[163] بیمار امام سجادؑ، خواتین اور بچوں کو اسیر کر کے پہلے کوفہ پھر وہاں سے شام لے جایے گئے۔[164] امام حسینؑ اور ان کے تقریبا 72 اصحاب کے لاشوں[165]کو 11[166] یا 13 محرم کو بنی اسد کے ایک گروہ نے یا ایک اور نقل کے مطابق امام سجادؑ کی ہمراہی میں اسی شہادت پانے والی جگہے میں دفن کیا\n" +
                "\n" +
                "\n" +
                "بہت سے مسلمان اور غیر مسلمان لوگوں نے بھی امام حسینؑ کو اپنے لیے فداکاری، ظلم کے خلاف ڈٹنے، آزادی طلبی، اقدار کی حفاظت اور حق طلبی میں مثالی قرار دیا ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "آپ مسکینوں کے ساتھ بیٹھتے اور ان کی دعوت کو قبول کرتے اور ان کے ساتھ کھانا کھایا کرتے تھے اور انہیں اپنے گھر دعوت پر بلاتے تھے اور گھر پر جو ہوتا اس سے دریغ نہیں کرتے تھے\n" +
                "\n" +
                "امام حسینؑ بہت سخی تھے اور سخاوت سے پہچانے جاتے تھے\n" +
                "\n" +
                "ان کی سخاوت اس حد تک تھی کہ جب یہودی جوڑے نے انہیں دیکھا تو مسلمان ہو گئے۔\n" +
                "\n" +
                "ان کے رواداری کے بارے میں ، یہ اطلاع ملتی ہے کہ جب شام سے ایک شخص نے ان کی اور ان کے والد کی توہین کی تو امام الحسین (ع) نے اسے معاف کردیا اور اس کے ساتھ حسن سلوک کیا۔\n" +
                "\n" +
                "\n" +
                "\n");

        udesc.add(str);






        etitleH.add("Imam Sajjad (A)");
        utitleH.add("امام سجاد (ع)");



        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Merits and Virtues");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("فضائل و مناقب");
        str.add("شہادت");



        utitle.add(str);


        img.add("imam4.jpeg");

        str=new ArrayList<>();

        str.add("Alī ibne Husayn ibne Ali ibne Abu Talib, known as Imam al-Sajjad and Zayn al-Abidin, is the fourth Imam of Shi'a. The period of his imamate was 34 years.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Born:  Sha'ban 5, 38/January 6, 659\n" +
                "\n" +
                "Birthplace:  Medina\n" +
                "\n" +
                "Imamate:  From Muharram 10, 61/October 10,680 (for 34 years)\n" +
                "\n" +
                "Martyrdom:  Muharram 25,95/October 20, 713 in Medina\n" +
                "\n" +
                "Cause of Martyrdom:  by Poisoning\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "He was present in the Battle of Karbala but did not participate in the battle because of sickness and was not martyred. He was taken captive to Kufa and Damascus together with other captives of Karbala. His speech at the presence of Umayyad caliphs created awareness among people about the position of the Ahl al-Bayt. After being released, he stayed in Medina until the end of his life. The event of Harra, Tawwabun movement and the uprising of al-Mukhtar happened at his time, however there is no reliable report of his opinions about them.\n" +
                "\n" +
                "Al-Sahifa al-Sajjadiyya is a compilation of his supplications which reflect the picture of the society that day and the true path of life through the education of the religion and the Qur'an and purification of souls and connecting souls to God. Risalat al-huquq (Treatise on Rights) is his another work which is a short treatise containing duties a human being have.\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "According to the famous opinion, Imam al-Sajjad (a) was born in 38/659; thus, he (a) has seen a part of Imam 'Ali's (a) life.\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "In historical sources, the number of Imam al-Sajjad's (a) children have been counted as fifteen, eleven of whom were boys and four of whom were girls.[14] According to al-Shaykh al-Mufid, the names of his wives and children were:\n" +
                "\n" +
                "Imam Muhammad al-Baqir (a) whose mother was Umm 'Abd Allah (Imam al-Hasan's (a) daughter) and many others.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imamate of Imam al-Sajjad (a) began after the martyrdom of Imam al-Husayn (a) in 61/681 and continued until his own martyrdom in 94/712 or 95/713.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Battle of Karbala and Captivity:\n" +
                "\n" +
                "In the Battle of Karbala and on the day Imam al-Husayn (a) and his companions were martyred, Imam al-Sajjad (a) was severely sick so that in some cases when they wanted to kill him, some said, \"This sickness is enough for him.\"[22]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Kufa:\n" +
                "\n" +
                "After the tragedy of Karbala, they captured the family of Imam al-Husayn (a) and took\n" +
                "them to Kufa and Damascus. Upon taking them from Karbala to Kufa, they put Jami'a [hand-to-neck chains] on him and since he was sick and could not keep sitting on the back of the camel, they fastened his feet under the belly of the camel.[23]\n" +
                "Some accounts say that Imam al-Sajjad\n" +
                "gave a speech in Kufa, but it is hard to accept that due to restricted situation in Kufa, cruelty of government agents, the fear of the people of Kufa from them and their unsupportive manner. Moreover, the sentences narrated from him in his speech in Kufa are similar to those he (a) said in his speech in the mosque of Damascus and it is possible that some narrators have mixed them up. [24]\n" +
                "\n" +
                "In any case, 'Ubayd Allah b. Ziyad kept Imam al-Sajjad (a) and other captives of Karbala in prison and wrote a letter to Damascus and asked Yazid what to do with them. Yazid replied and ordered him to send captives and the heads of the martyrs of Karbala to Damascus. 'Ubayd Allah b. Ziyad put shackles on Imam's (a) neck and sent him and other captives with Muhaffar b. Tha'laba to Damascus.[25]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Damascus:\n" +
                "\n" +
                "Imam al-Sajjad (a) gave a speech in the mosque of Damascus and introduced himself, his father, and his grandfather to people and told the people of Damascus that what Yazid and his agents have propagated are not true. His father was not a rebel and did not want to disturb Muslim community and make mischief in Islamic lands. He (a) rose for truth and by invitation of Muslims to remove heresies brought up in religion and bring the simplicity and purity it had at the time of his grandfather.[26]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Return to Medina:\n" +
                "\n" +
                "Imam al-Sajjad (a) lived 34 years after the Battle of Karbala and always made efforts to keep the memory of the martyrs of Karbala alive.\n" +
                "\n" +
                "\n" +
                "Whenever he (a) drank water, he remembered his father and wept on the hardships of Imam al-Husayn (a). It is mentioned in a narration from Imam al-Sadiq (a) that, \"Imam al-Sajjad (a) wept forty years upon his honorable father, while he (a) was fasting the days and praying the nights. At the time of breaking his fasting when his servant took food and water for him, he (a) said, '[grand]son of the Prophet (s) was martyred hungry!\n" +
                "\n" +
                "grandson of the Prophet (s) was martyred thirsty!' He (a) frequently repeated this and wept so that his tears were mixed with his food and drink. He (a) was in such a state until when he (a) passed away.\"[27]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("Worship:\n" +
                "\n" +
                "Malik b. Anas said, \"Ali b. al-Husayn (a) made a thousand Rak'a prayer everyday before he (a) passed away. Thus, he (a) was called Zayn al-'Abidin (adornment of the worshipers).\"[34]\n" +
                "\n" +
                "Ibn 'Abd Rabbih wrote, \"When 'Ali b. al-Husayn (a) became ready for prayer, he (a) would strangely tremble. He (a) was asked about it and said, 'woe betide you! Do you know whom I am going to stand in front of and before whom I am going to pray?'\"[35]\n" +
                "\n" +
                "Malik b. Anas said, \"When 'Ali b. al-Husayn (a) put on Ihram and said Talbiya, he went unconscious and fell from his conveyance (from the awe of Allah).\"[36]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Helping the Poor:\n" +
                "\n" +
                "Abu Hamza al-Thumali said, \"Every night 'Ali b. al-Husayn (a) secretly carried some food on his shoulder to the poor and said, 'the charity made at the darkness of the night appeases the wrath of God.'\"[37]\n" +
                "\n" +
                "Muhammad b. Ishaq said, \"There were people living in Medina unknowing how their daily provision was provided; and after 'Ali b. al-Husayn (a) passed away, their night food delivery stopped.\"[38]\n" +
                "\n" +
                "At night, he (a) put baskets of bread on his shoulder and went to the houses of the poor and said, \"The charity made secretly appeases the wrath of God.\" Those baskets had left marks on his shoulders and when they were washing his body after he (a) passed away, they saw those marks.[39] Ibn Sa'd wrote, \"When a poor person came to him, he (a) went and gave the poor what he wanted and said, 'before charity reaches the asking one, it reaches God's hand.'\"[40]\n" +
                "\n" +
                "Abu Na'im wrote, \"Imam al-Sajjad (a) distributed all his property among the poor twice and said, 'God loves a repenting faithful servant.'\"[43]\n" +
                "\n" +
                "When a beggar came to him, he (a) said, 'blessed be the one who carries my provision to the hereafter.'\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Behavior towards Slaves:\n" +
                "\n" +
                "One of the efforts of Imam al-Sajjad (a) which was religious and also political was paying attention to slaves; people who were under greatest social pressures especially after the time of the second caliph ('Umar b. al-Khattab) and especially at the time of Umayyads and they were among the most deprived people in the Islamic society in first centuries.\n" +
                "\n" +
                "\n" +
                "Sayyid al-Ahl wrote, \"Imam al-Sajjad (a) bought slaves even though he (a) did not need them. He (a) bought them only to free them. Slaves who saw this intention of Imam (a), they wanted him to buy them. Imam al-Sajjad (a) released them at any time or situation, so that many people, like an army of released servants, men and women were seen in Medina who were all the freed servants of Imam (a).\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "Imam al-Sajjad (a) was martyred in 94/713 (or 95/714) with a poison given by the order of al-Walid b. 'Abd al-Malik.[12] He (a) was buried in al-Baqi' cemetery beside his uncle, Imam al-Hasan al-Mujtaba (a).\n" +
                "\n");

        edesc.add(str);

        str=new ArrayList<>();
        str.add("علی بن حسین بن علی بن ابی\u200C طالب، امام سجاد و زین العابدین کے نام سے مشہور، شیعوں کے چوتھے امام اور امام حسینؑ کے فرزند ہیں۔ آپ 35 سال امامت کے عہدے پر فائز رہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے چوتھے امام\n" +
                "\n" +
                "نام:\t\tعلی بن الحسینؑ\n" +
                "\n" +
                "کنیت:\t\tابو الحسن، ابو الحسین، ابو محمد، ابو عبداللہ\n" +
                "\n" +
                "القاب:\t\tزین العابدین، سید الساجدین، ذوالثَّفنات\n" +
                "\n" +
                "تاریخ ولادت:\t\t5 شعبان، سنہ 38 ہجری\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t35 سال (61-95 ھ)\n" +
                "\n" +
                "شہادت:\t\t25 محرم، سنہ 95 ہجری\n" +
                "\n" +
                "سبب شہادت:\tمسمومیت ولید بن عبدالملک کے حکم سے\n" +
                "\n" +
                "مدفن:\t\tبقیع، مدینہ\n" +
                "\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tامام حسینؑ\n" +
                "\n" +
                "والدہ ماجدہ:\t\tشہر بانو\n" +
                "\n" +
                "ازواج:\t\tام عبداللہ ...\n" +
                "\n" +
                "اولاد:\t\tمحمد، عبداللہ، حسن، حسین اکبر، زید، عمر، حسین الاصغر، عبد الرحمن، سلیمان، علی، خدیجہ، محمد الاصغر، فاطمہ، علّیہ، ام کلثوم\n" +
                "\n" +
                "عمر:\t\t57 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " امام سجادؑ واقعہ کربلا میں حاضر تھے لیکن بیماری کی وجہ سے جنگ میں حصہ نہیں لے سکے۔ امام حسینؑ کی شہادت کے بعد عمر بن سعد کے سپاہی آپ کو اسیران کربلا کے ساتھ کوفہ و شام لے گئے۔ کوفہ اور شام میں آپ کے دیئے گئے خطبات کے باعث لوگ اہل بیتؑ کے مقام و منزلت سے زیادہ آگاہ ہوئے۔\n" +
                "\n" +
                "واقعہ حرہ، تحریک توابین اور قیام مختار آپ کے دور امامت میں رونما ہوئے۔ امام سجادؑ کی دعاؤں اور مناجات کو صحیفہ سجادیہ میں جمع کیا گیا ہے۔ خدا اور خلق خدا کی نسبت انسان کی ذمہ داریوں سے متعلق کتاب، رسالۃ الحقوق بھی آپ سے منسوب ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "ولادت:\n" +
                "\n" +
                "مشہور قول کے مطابق امام سجادؑ سنہ 38 ہجری[12] میں پیدا ہوئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "ازواج اور اولاد:\n" +
                "\n" +
                "تاریخی منابع میں منقول ہے کہ امام سجادؑ کی پندرہ اولادیں ہیں جن میں سے گیارہ( 11) بیٹے اور چار (4) بیٹیاں ہیں۔ [45] شیخ مفید کے مطابق امام سجادؑ کے فرزندوں کے نام کچھ یوں ہیں:[46]\n" +
                "\n" +
                "امام محمد باقرؑ، جن کی والدہ ام عبداللہ بنت امام حسن مجتبیؑ اور کئی دوسرے\n" +
                "    \n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "عاشورا سنہ 61ہجری کو امام حسین علیہ السلام کی شہادت کے ساتھ ہی امام سجادؑ کی امامت کا آغاز ہوتا ہے اور آپ کا دوران امامت سنہ 94 یا 95 ہجری میں آپ کی شہادت تک جاری رہتا ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کربلا:\n" +
                "\n" +
                "امام سجادؑ واقعۂ کربلا میں اپنے والد امام حسینؑ اور اولاد و اصحاب کی شہادت کے دن، شدید بیماری میں مبتلا تھے اور بیماری کی شدت اس قدر تھی کہ جب بھی یزیدی سپاہی آپ کو قتل کرنے کا ارادہ کرتے، ان ہی میں سے بعض کہہ دیتے تھے کہ \"اس نوجوان کے لئے یہی بیماری کافی ہے جس میں وہ مبتلا ہے\"۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کوفہ:\n" +
                "\n" +
                "عاشورا سنہ 61 کے بعد، جب لشکر یزید نے اہل بیت کو اسیر کرکے کوفہ منتقل کیا، تو ان میں سے حضرت زینب سلام اللہ علیہا کے علاوہ امام سجادؑ نے بھی اپنے خطبوں کے ذریعے حقائق واضح کئے اور حالات کی تشریح کی اور اپنا تعارف [68] کراتے ہوئے یزید کے کارندوں کے جرائم کو آشکار کردیا اور اہل کوفہ پر ملامت کی۔[69]\n" +
                "\n" +
                "امام سجادؑ نے کوفیوں سے خطاب کرنے کے بعد ابن زیاد کی مجلس میں بھی موقع پا کر چند مختصر جملوں کے ذریعے اس مجلس کے حاضرین کو متاثر کیا۔ اس مجلس میں ابن زیاد نے امام سجادؑ کے قتل کا حکم جاری کیا[70] لیکن حضرت زینب سلام اللہ علیہا نے درمیان میں آ کر ابن زياد کے خواب سچا نہيں ہونے دیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "دمشق:\n" +
                "\n" +
                "اس کے بعد جب یزیدی لشکر اہل بیتؑ کو \"خارجی اسیروں\" کے عنوان سے شام لے گیا تو بھی امام سجاد علیہ السلام نے اپنے خطبوں کے ذریعے امویوں کا حقیقی چہرہ بے نقاب کرنے کی کامیاب کوشش کی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "واپس مدینہ منورہ:\n" +
                "\n" +
                "امام سجادؑ واقعۂ کربلا کے بعد 34 سال بقید حیات رہے اور اس دوران آپ نے شہدائے کربلا کی یاد تازہ رکھنے کی ہر کوشش کی۔\n" +
                "پانی پیتے وقت والد کو یاد کرتے تھے، امام حسین علیہ السلام کے مصائب پر گریہ کرتے اور آنسوں بہاتے تھے۔ ایک روایت کے ضمن میں امام جعفر صادق علیہ السلام سے منقول کہ امام سجادؑ نے (تقریبا) چالیس سال تک اپنے والد کے لئے گریہ کیا جبکہ دنوں کو روزہ رکھتے اور راتوں کو نماز و عبادت میں مصروف رہتے تھے، افطار کے وقت جب آپ کا خادم کھانا اور پانی لا کر عرض کرتا کہ آئیں اور کھانا کھائیں تو آپؑ فرمایا کرتے: \"فرزند رسول اللہ بھوکے مارے گئے! فرزند رسول اللہؐ پیاسے مارے گئے!\"، اور یہی بات مسلسل دہراتے رہتے اور گریہ کرتے تھے حتی کہ آپ کے اشک آپ کے آب و غذا میں گھل مل جاتے تھے؛ آپ مسلسل اسی حالت میں تھے حتی کہ دنیا سے رخصت ہوئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "عبادت:\n" +
                "\n" +
                "مالک بن انس سے مروی ہے کہ علی بن الحسین دن رات میں ایک ہزار رکعت نماز بجا لاتے تھے حتی کہ دنیا سے رخصت ہوئے چنانچہ آپ کو زین العابدین کہا جاتا ہے۔[54]\n" +
                "ابن عبد ربّہ لکھتا ہے: علی بن الحسین جب نماز کے لئے تیاری کرتے تو ایک لرزہ آپ کے وجود پر طاری ہوجاتا تھا۔ آپ سے سبب پوچھا گیا تو فرمایا: \"وائے ہو تم پر! کیا تم جانتے ہو کہ میں اب کس ذات کے سامنے جاکر کھڑا ہونے والا ہوں! کس کے ساتھ راز و نیاز کرنے جارہا ہوں!؟\"۔[55]\n" +
                "مالک بن انس سے مروی ہے: علی بن الحسین نے احرام باندھا اور لبیّكَ اللهمّ لبَيكَ پڑھ لیا تو آپ پر غشی طاری ہوئی اور گھوڑے کی زین سے فرش زمین پر آ گرے\n" +
                "\n" +
                "\n" +
                "\n" +
                "غربا و مساکین کی سرپرستی:\n" +
                "\n" +
                "ابو حمزہ ثمالی سے مروی ہے کہ علی بن الحسینؑ راتوں کو کھانے پینے کی چیزوں کو اپنے کندھے پر رکھ کر اندھیرے میں خفیہ طور پر غربا اور مساکین کو پہنچا دیتے تھے اور فرمایا کرتے تھے: \"جو صدقہ اندھیرے میں دیا جائے وہ غضب پروردگار کی آگ کو بجھا دیتا ہے\"۔[57]\n" +
                "محمد بن اسحاق کہتا ہے: کچھ لوگ مدینہ کے نواح میں زندگی بسر کرتے تھے اور انہیں معلوم نہ تھا کہ ان کے اخراجات کہاں سے پورے کئے جاتے ہیں، علی ابن الحسینؑ کی وفات کے ساتھ ہی انہيں راتوں کو ملنے والی غذائی امداد کا سلسلہ منقطع ہوا۔ [58]\n" +
                "\n" +
                "راتوں کو روٹی کے تھیلے اپنی پشت پر رکھ دیتے تھے اور محتاجوں کے گھروں کا رخ کرتے تھے اور کہتے تھے: رازداری میں صدقہ غضب پروردگار کی آگ کو بجھا دیتا ہے، ان تھیلوں کو لادنے کی وجہ سے آپ کی پیٹھ پر نشان پڑ گئے تھے اور جب آپ کا وصال ہوا تو آپ کو غسل دیتے ہوئے وہ نشانات آپ کے بدن پر دیکھئے گئے۔[59] ابن سعد روایت کرتا ہے: جب کوئی محتاج آپ کے پاس حاضر ہوتا تو آپ فرماتے: \"صدقہ سائل تک پہنچنے سے پہلے اللہ تک پہنچ جاتا ہے\"\n" +
                "\n" +
                "ابونعیم رقمطراز ہے: امام سجادؑ نے دو بار اپنا پورا مال محتاجوں کے درمیان بانٹ دیا اور فرمایا: خداوند متعال مؤمن گنہگار شخص کو دوست رکھتا ہے جو توبہ کرے۔[63] ابو نعیم ہی لکھتے ہیں: بعض لوگ آپ کو بخیل سمجھتے تھے لیکن جب دنیا سے رحلت کرگئے تو سمجھ گئے کہ ایک سو خاندانوں کی کفالت کرتے رہے تھے۔[64] جب کوئی سائل آپ کے پاس آتا تو آپ فرماتے تھے: آفرین ہے اس شخص پر جو میرا سفر خرچ آخرت میں منتقل کررہا ہے\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "غلاموں کے ساتھ آپ کا طرز سلوک:\n" +
                "\n" +
                "امام سجادؑ کے تمام تر اقدامات دینی پہلوؤں کے ساتھ سیاسی پہلؤوں کے حامل بھی ہوتے تھے اور ان ہی اہم اقدامات میں سے ایک غلاموں کی طرف خاص توجہ سے عبارت تھا۔ غلاموں کا طبقہ وہ طبقہ تھا جو خاص طور پر خلیفہ دوم عمر بن خطاب کے بعد اور بطور خاص بنی امیہ کے دور میں شدید ترین سماجی دباؤ کا سامنا کررہا تھا اور اسلامی معاشرے کا محروم ترین طبقہ سمجھا جاتا تھا۔\n" +
                "\n" +
                "سید الاہل نے لکھا ہے: امام سجادؑ ـ جنہیں غلاموں کی کوئی ضرورت نہ تھی ـ غلاموں کی خریداری کا اہتمام کرتے اور اس خریداری کا مقصد انہيں آزادی دلانا ہوتا تھا غلاموں کا طبقہ امامؑ کا یہ رویہ دیکھ کر، اپنے آپ کو امامؑ کے سامنے پیش کرتے تھے تاکہ آپ انہیں خرید لیں۔ امامؑ ہر موقع مناسبت پر غلام آزاد کرٹیتے تھے اور صورت حال یہ تھی کہ مدینہ میں آزاد شدہ غلاموں اور کنیزوں کا ایک لشکر دکھائی دیتا تھا اور وہ سب امام سجادؑ کے موالی تھے\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "امام سجادؑ سنہ 94 (یا 95) ہجری میں اس زہر کے ذریعے جام شہادت نوش کرگئے جو ولید بن عبدالملک کے حکم پر انہيں کھلایا گیا تھا۔[43] آپؑ کو جنت البقیع میں چچا امام حسن مجتبیؑ کے پہلو میں دفن کردیئے گئے");

        udesc.add(str);





        etitleH.add("Imam Muhammad Baqir (A)");
       utitleH.add("امام محمد باقر (ع)");


         str=new ArrayList<>();
       str.add("Biography in Brief");
        str.add("Life");
        str.add("Scientific Movement");
        str.add("Explaining Islamic Teachings");
        str.add("Martyrdom");
        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("علمی تحریک");
        str.add("اسلامی تعلیم کی وضاحت");
        str.add("شہادت");
        utitle.add(str);

       img.add("imam5.jpg");



            str=new ArrayList<>();
        str.add("Muḥammad ibne Ali ibne Hussain ibne Ali,\n" +
                "known as Imam al-Baqir (A) and Baqir al-Ulum, was the fifth Imam of the Shi'a, whose period of Imamate lasted nineteen years.\n" +
                "\n" +
                "Born:   Rajab 1, 57/May 10, 677\n" +
                "\n" +
                "Birthplace:    Medina\n" +
                "\n" +
                "Imamate:   From Muharram 25, 95/October 20, 713 (for 19 years)\n" +
                "\n" +
                "Martyrdom:   Dhu l-Hijja 7, 114/January 28, 733\n" +
                "\n" +
                "Cause of Martyrdom:   By poisoning\n" +
                "\n" +
                "\n" +
                "Imam al-Baqir (A) made a great scientific\n" +
                "movement which reached its peak at the\n" +
                "time of his son Imam al-Sadiq (A).\n" +
                "\n" +
                "His narrations in religion, conduct of the\n" +
                "Prophet (s), Qur'an sciences, moral\n" +
                "conduct, and manner is more than what is remained from the children of Imam al-\n" +
                "Hasan (A) and Imam al-Husayn (A).\n" +
                "\n" +
                "Thus, during his imamate, a great step was\n" +
                "taken towards organization of Shi'i thought\n" +
                "in different fields including ethics,\n" +
                "jurisprudence, theology, exegesis, etc.\n" +
                "\n" +
                "According to historical sources he was\n" +
                "present at Battle of Karbala as a child.\n" +
                "\n" +
                "\n");
        str.add("Birth:\n" +
                "\n" +
                "Imam al-Baqir (a) was born on Friday Rajab 1, 57/May 10, 677 in Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "In narrations, Umm Farwa is mentioned as the wife of Imam al-Baqir (A), who was the mother of Imam al-Sadiq (A). Also narrations mention another woman called Umm Hakim, daughter of Usayd al-Thaqafi as a wife of Imam, who was the mother of two of the Imam's children and another wife of Imam (a) who was a concubine and the mother of three other children of Imam (A)[9].\n" +
                "\n" +
                "The number of the children of Imam al-Baqir (A) was seven, including five sons and two daughters:\n" +
                "\n" +
                "Ja'far & 'Abd Allah: the mother of these two was Umm Farwa, daughter of al-Qasim b. Muhammad.\n" +
                "\n" +
                "Ibrahim & 'Ubayd Allah: the mother of him and Ibrahim was Umm Hakim, daughter of Usayd al-Thaqafi. No children remained from these two sons.\n" +
                "\n" +
                "'Ali & Zaynab: the mohter of the these two was a concubine.\n" +
                "\n" +
                "Umm Salama: the mother of whom, was a concubine.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Presence in Karbala:\n" +
                "\n" +
                "Imam Muhammad Baqir spent his childhood (up to four years) with his parents and grandfather (Imam Hussain (as)).\n" +
                "\n" +
                "He was present in Karbala during the Ashura incident and he himself says in a hadith: \"I was four years old when my great-grandfather Imam Hussein was killed and I remember his martyrdom and all the sufferings that befell us.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imam al-Baqir (a) became the Imam in 95/713 after his father was martyred and had the responsibility of leading the Shi'a until his martyrdom in 114/733 (or 117/735).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("By the begining of Imam al-Baqir's (A) imamate a great scientific movement by him emerged in Shi'a which reached its peak at the time of his son, Imam al-Sadiq (A).\n" +
                "\n" +
                "It was in this period that Shi'a\n" +
                "started to well establish its culture -\n" +
                "including fiqh, exegiseis, and ethics.\n" +
                "\n" +
                "Imam al-Baqir (A) strongly rejected\n" +
                "reasoning of the followers of analogy\n" +
                "(qiyas) in fiqh and took sharp stances against other Islamic sects and this way, he tried to separate the authentic\n" +
                "ideological domain of the Ahlul-Bayt  in\n" +
                "different fields from other sects.\n" +
                "\n" +
                "The scientific fame of Imam al-Baqir (A)\n" +
                "was not only known in Hijaz but also had\n" +
                "spread in Iraq and Khurasan. There is even a report saying about the Imam , \"I saw\n" +
                "people of Khurasan had circled around\n" +
                "him and asked him their scientific\n" +
                "questions.\"");
        str.add("Exegesis:\n" +
                "\n" +
                "Imam al-Baqir (A) had dedicated a part of\n" +
                "his time to explain exegesis issues, by\n" +
                "holding exegesis sessions and answering\n" +
                "the questions of scholars and other\n" +
                "people. It is said that Imam al-Baqir (A)\n" +
                "wrote a book in exegesis of the Qur'an\n" +
                "which Ibn Nadim has mentioned in his al-Fihrist.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Theology:\n" +
                "\n" +
                "At the time of Imam al-Baqir (A), the\n" +
                "emerging foundations and expression of\n" +
                "different beliefs and thoughts were easier,\n" +
                "due to opportunity and the lack of pressure and control by the government which also caused deviant thoughts to spread in the society.\n" +
                "\n" +
                "Under these circumstances, Imam al-Baqir (A) had to announce authentic Islamic beliefs,denounce and reject false beliefs, and answer related questions.\n" +
                "\n" +
                "Therefore, he held his theological discussions with the direction towards the mentioned issues.\n" +
                "\n" +
                "Among such issues was the inability of human intellect to understand the truth of God, eternal existence of the Necessary Existent, and the necessity to obey Imam.\n" +
                "\n");
        str.add("Imam al-Baqir (a) passed away on Dhu l-\n" +
                "Hijjah 7, 114/January 28, 733.\n" +
                "\n" +
                "There are different narrations and\n" +
                "historical opinions regarding the person\n" +
                "who martyred Imam al-Baqir (A).\n" +
                "\n" +
                "Some sources have mentioned Hisham ibne Abd al-Malik as the one who martyred him.\n" +
                "\n" +
                "Some have accused Ibrahim ibne al-Walid as the person who poisoned the Imam.\n" +
                "\n" +
                "Imam al-Baqir (A) was buried beside his\n" +
                "father's grave and the grave of al-Hasan ibne 'Ali (A), his father's uncle, in Al-Baqi' Cemetery.\n" +
                "\n");
        edesc.add(str);

        str=new ArrayList<>();
        str.add("محمد بن علی بن حسین بن علی بن ابی طالب ، امام محمد باقرؑ کے نام سے مشہور شیعوں کے پانچویں امام ہیں۔ آپ کا مشہور لقب باقرالعلوم ہے۔ آپ کی مدت امامت 19 برس تھی\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے پانچویں امام\n" +
                "\n" +
                "نام:\t\tمحمد بن علی\n" +
                "\n" +
                "کنیت:\t\tابو جعفر\n" +
                "\n" +
                "القاب:\t\tباقر، شاکر، ہادی\n" +
                "\n" +
                "تاریخ ولادت:\t\tیکم رجب سنہ 57ھ\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t19 سال (95-114ھ)\n" +
                "\n" +
                "شہادت:\t\t7 ذی الحجہ سنہ 114ھ\n" +
                "\n" +
                "سبب شہادت:\tزہر سے مسموم\n" +
                "\n" +
                "مدفن:\t\tجنت البقیع، مدینہ\n" +
                "\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tامام زین العابدین علیہ السلام\n" +
                "\n" +
                "والدہ ماجدہ:\t\tفاطمہ بنت امام حسنؑ\n" +
                "\n" +
                "ازواج:\t\tام فروہ، ام حکیم\n" +
                "\n" +
                "اولاد:\t\tامام جعفر صادق علیہ \u200Cالسلام، عبداللہ، ابراہیم، عبیداللہ، علی، زینب، ام سلمہ\n" +
                "\n" +
                "عمر:\t57 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپؑ واقعۂ عاشورا کے چشم دید گواہ بھی ہیں اس موقع پر آپ بہت چھوٹے تھے۔ اپنے زمانے میں تشیُّع کے فروغ کے لئے مناسب تاریخی حالات کو دیکھتے ہوئے آپ نے عظیم شیعہ علمی تحریک کا آغاز کیا جو آپ کے فرزند ارجمند امام جعفر صادق علیہ السلام کے زمانے میں اپنے عروج کو پہنچ گئی۔\n" +
                "\n" +
                "اکابرین اہل سنت آپؑ کی علمی اور دینی عظمت و شہرت کے معترف ہیں۔ فقہ، توحید، سنت نبوی، قرآن، اخلاق اور دیگر موضوعات پر آپ سے بہت ساری احادیث نقل ہوئی ہیں۔ آپ کے دور امامت میں اخلاق، فقہ، کلام، تفسیر اور کئی دوسرے موضوعات پر شیعہ نقطہ نظر کو اجاگر کرنے میں انتہائی اہم اقدامات اٹھائے گئے ہیں۔\n" +
                "\n");
        str.add("\n" +
                "ولادت:\n" +
                "\n" +
                "امام ابو جعفر محمد باقرؑ بروز جمعہ یکم رجب المرجب سنہ 57 ہجری مدینہ میں پیدا ہوئے\n" +
                "\n" +
                " \n" +
                "ازواج اور اولاد:\n" +
                "\n" +
                "تاریخی منابع میں ام فروہ امام محمد باقرؑ کی زوجہ اور امام جعفر صادق علیہ السلام کی والدہ مروی ہیں۔ نیز آپ کی ایک زوجہ ام حکیم بنت اسید ثقفی تھیں جو امامؑ کے دو فرزندوں کی ماں تھیں جبکہ آپ کے تین دوسرے فرزندوں کی ماں ایک ام ولد تھیں۔[18]\n" +
                "\n" +
                "امام محمد باقرؑ کی سات اولادیں 5 بیٹے اور 2 بیٹیاں تھیں جن کے نام کچھ یوں ہیں\n" +
                "جعفر بن محمد اور عبداللہ جن کی والدہ کا نام ام فروہ بنت قاسم بن محمد ہیں۔\n" +
                "ابراہیم بن محمد اور عبید اللہ بن محمد جن کی والدہ ام حکیم بنت اسید ثقفی تھیں؛ یہ دونوں طفولت ہی میں دنیا سے رخصت ہوئے ہیں۔\n" +
                "علی، زینب اور ام سلمہ جن کی والدہ ایک ام ولد تھیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کربلا میں موجودگی:\n" +
                "\n" +
                "امام محمد باقرؑ نے طفولت کی زندگی (چار سال تک) اپنے والدین کے اور دادا (امام حسین علیہ السلام کے ساتھ گذاری۔\n" +
                "آپ واقعۂ عاشورا کے دوران کربلا میں موجود تھے اور آپ خود ایک حدیث کے ضمن میں فرماتے ہیں: \"میں چار سالہ تھا جب میرے جدّ امام حسینؑ کو قتل کیا گیا اور مجھے آپؑ کی شہادت بھی اور وہ سارے مصائب بھی یاد ہیں جو ہم پر گذرے\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "امام محمد بن علی بن الحسین بن علی، باقر علیہ السلام سنہ 95 ہجری میں اپنے والد ماجد امام علی بن الحسین زین العابدین علیہ السلام کی شہادت کے ساتھ ہی منصب امامت پر فائز ہوئے اور سنہ 114 ہجری (یا 117 یا 118 ہجری) میں ہشام بن عبدالملک کے ہاتھوں جام شہادت نوش کرنے تک شیعیان آل رسولؐ کے امام و رہبر و پیشوا تھے۔\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "مام باقرؑ نے اس دور میں وسیع علمی تحریک کی بنیاد رکھی جو آپ کے فرزند ارجمند امام ابو عبداللہ جعفر بن محمد صادقؑ کے دور میں عروج کو پہنچی۔ آپ علم، زہد اور فضیلت میں اپنے دور کے ہاشمی بزرگوں میں سر فہرست تھے اور علم دین، سنت، علوم قرآن سیرت اور فنون اخلاق و آداب جیسے موضوعات میں جس قدر حدیثیں اور روایات آپ سے منقول ہیں وہ امام حسن اور امام حسین کے کسی بھی دوسرے فرزند سے نقل نہيں ہوئی ہیں\n" +
                "\n" +
                "اسی زمانے میں اہل تَشَیُّع نے ـ فقہ، تفسیر اور اخلاق پر مشتمل ـ فرہنگ کی تدوین کا کام شروع کیا\n" +
                "\n" +
                "امام باقرؑ نے اصحاب قیاس کی دلیلوں کو شدت سے ردّ کردیا۔[27] اور دیگر منحرف اسلامی فرقوں کے خلاف بھی سخت موقف اپنایا اور یوں مختلف موضوعات میں اہل بیتؑ کے صحیح اعتقادی دائرے کو واضح اور الگ کرنے کی (کامیاب) کوشش کی\n" +
                "\n" +
                "امام باقرؑ کی علمی شہرت ـ نہ صرف حجاز میں بلکہ ـ حتی کہ عراق اور خراسان تک بھی پہنچ چکی تھی؛ چنانچہ راوی کہتا ہے: میں نے دیکھا کہ خراسان کے باشندوں نے آپ کے گرد حلقہ بنا رکھا ہے اور اپنے علمی سوالات آپ سے پوچھ رہے ہیں\n");
        str.add("\n" +
                "تفسیر:\n" +
                "\n" +
                "امامؑ نے اپنے اوقات کا ایک حصہ تفسیری موضوعات و مباحث کے لئے مختص کر رکھا تھا اور تفسیری حلقہ تشکیل دے کر علماء اور عام لوگوں کے سوالات و اعتراضات کا جواب دیتے تھے۔ کہا جاتا ہے کہ امام باقرؑ نے تفسیر قرآن میں ایک کتاب بھی تصنیف کی تھی جس کی طرف محمد بن اسحق ندیم نے اپنی کتاب الفہرست میں بھی اشارہ کیا ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کلام:\n" +
                "\n" +
                "امام باقرؑ کے زمانے میں مناسب مواقع فراہم ہوئے، حکمرانوں کی طرف سے دباؤ اور نگرانی میں کمی آئی اور یوں مختلف عقائد و افکار کے ظاہر و نمایاں ہونے کے اسباب فراہم ہوئے اور یہی آزاد فضا بھی معاشرے میں انحرافی افکار کے وجود میں آنے کا سبب بنی۔ ان حالات میں امامؑ کو درست اور حقیقی شیعہ عقائد کی تشریح، باطل عقائد کی تردید کے ساتھ ساتھ متعلقہ شبہات و اعتراضات کا جواب بھی دینا پڑ رہا تھا؛ چنانچہ آپؑ ان امور کے تناظر میں ہی کلامی (و اعتقادی) مباحث کا اہتمام کرتے تھے؛ \"ذات پرودگار کی حقیقت کے ادراک سے عقل انسانی کی عاجزی\" [33] اور \"واجب الوجود کی ازلیت\"[34] وغیرہ ان ہی مباحث میں سے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "امام باقرؑ 7 ذی الحجۃ الحرام سنہ 114 ہجری کو [11] رحلت کرگئے\n" +
                "\n" +
                "اس سلسلے میں متعدد تاریخی اور روائی[12] اقوال نقل ہوئے ہیں کہ امام محمد باقرؑ کو کس شخص یا کن اشخاص نے قتل کیا؟ \n" +
                "\n" +
                "بعض مؤرخین نے لکھا ہے کہ (اموی مروانی بادشاہ) ہشام بن عبد الملک براہ راست اس قتل میں ملوث ہے\n" +
                "\n" +
                " بعض کا قول ہے کہ آپ کا قاتل ابراہیم بن ولید بن عبد الملک بن مروان ہے جس نے امامؑ کو مسموم کیا\n" +
                "\n" +
                "امام محمد باقرؑ جنت البقیع میں اپنے والد کے چچا امام حسن مجتبی علیہ السلام اور والد امام زین العابدین علیہ السلام کے پہلو میں سپرد خاک کئے گئے۔[17]\n" +
                "\n" +
                "\n");
        udesc.add(str);










        etitleH.add("Imam Jafar Sadiq (A)");
        utitleH.add("امام جعفر صادق (ع)");


         str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Events in Life");
        str.add("Moral Characteristics");
        str.add("Scientific Movement");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی میں واقعات");
        str.add("اخلاقی خصوصیات");
        str.add("علمی تحریک");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam6.jpg");


        str=new ArrayList<>();

        str.add("Jaʿfar ibne Muḥammad ibne Ali ibne Hussain, known as Imam al-Sadiq (A) , is the sixth Imam of Imamiyya and the fifth Imam of Isam'ilis.\n" +
                "\n" +
                "\n" +
                "Born:   Rabi' I 17, 83/April 20, 702\n" +
                "\n" +
                "Birthplace:   Medina\n" +
                "\n" +
                "Imamate:   From Dhu l-Hijja 7, 114/28 January, 733 (for 34 years)\n" +
                "\n" +
                "Martyrdom:    Shawwal 25, 148/December 14, 765 in Medina\n" +
                "\n" +
                "Cause of Martyrdom: By Poisoning\n" +
                "\n" +
                "\n" +
                "\n" +
                "His Imamate lasted 34 years and was\n" +
                "concurrent with the reign of the last five Umayyad caliphs (that is, from Hisham ibne 'Abd al-Malik onwards) and with that of the first two Abbasid caliphs, al-Saffah and al-Mansur al-Dawaniqi.\n" +
                "\n" +
                "Because of the weakness of the Umayyad rule at his time, Imam al-Sadiq (A) was able to have relatively wider scholarly activities. His companions, students, and those who quoted hadiths from him is said to have amounted to four-thousand people. Most of the hadiths of Ahl al-Bayt recorded in Shiite hadith collections are from Imam al-Sadiq (A). This is why Imamiyya is called Ja'fari School.\n");



        str.add("Refraining from Uprising:\n" +
                "\n" +
                "Despite the weakness of the Umayyads at his time, Imam al-Sadiq (A) stayed away from uprising and political conflicts. According to a hadith, the Imam mentioned the lack of faithful supporters as the reason why he refused to revolt.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Burning the House of Imam al-Sadiq (A):\n" +
                "\n" +
                "According to a report, when al-Hasan ibne Zayd was the governor of Mecca and Medina, he set fire to the house of Imam Sadiq (A).\n" +
                "\n" +
                "In the fire, the door and the corridor of the house burned. The Imam came out of the house crossing the fire saying,\n" +
                "\n" +
                "\"I am the son of the Roots of the Earth (Isma'il (A))\n" +
                "I am the son of Ibrahim, God's Friend.\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "Using Taqiyya:\n" +
                "\n" +
                "Except the third decade of the second century, which coincided with the fall of the Umayyad caliphate, both the Umayyad and Abbasid caliphs kept the activities of the Imam under watch.\n" +
                "Political pressure on the Imam reached its peak towards the end of the Imam's life.\n" +
                "\n" +
                "According to some reports, al-Mansur's agents would persecute those Shiites who were in touch with the Imam and even execute them. Because of these persecutions, the Imam and his companions had to use taqiyya.\n" +
                "\n" +
                "According to a hadith, the Imam told Aban ibne Taghlib to respond to people's fiqh questions by giving them the opinions of Sunni scholars in order not to be persecuted.\n" +
                "\n" +
                "Also, several hadiths have been transmitted from Imam al-Sadiq (A) which emphasize the importance of taqiyya, according to some of which taqiyya is equal to prayer.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");




        str.add("There are many reports about the moral characteristics of Imam al-Sadiq (A), including his asceticism, generosity, abundant worship, and recitation of the Quran.\n" +
                "\n" +
                "Malik ibne Anas, the head of the Maliki school of fiqh reports that during the time he used to visit Imam al-Sadiq (A), the Imam was always in one of the three states: praying, fasting, or saying dhikr.\n" +
                "\n" +
                "It is reported that the Imam gave four hundred dirhams to a beggar, and when he thanked the Imam, he gave him his ring which was worth 10,000 dirhams.\n" +
                "\n" +
                "According to another report, the Imam\n" +
                "would put some bread, meat, and money in a bag and would take it to the houses of the poor and divide it among them, without letting them know who he was.\n" +
                "\n");

        str.add("Because of the weakness of the Umayyads at the time of Imam al-Sadiq (A), the Imam was relatively free to teach and engage in scholarly activities.\n" +
                "\n" +
                "This religious and scholarly freedom rarely\n" +
                "happened during the time of the other Imams, and thus most of our hadiths are from Imam al-Sadiq (A).\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ja'fari School:\n" +
                "\n" +
                "Most of the Shiite hadiths, whether in fiqh or theology, are from Imam al-Sadiq (A), and the number of the people who transmitted hadiths from him (4000, according to al-Arbili) is greater than the number of hadith transmitters from any other Imam.\n" +
                "\n" +
                "Because of the significant role of Imam al-Sadiq (A) in the elaboration of Islamic teachings, Shiism is often called Ja'fari School and the Imam is known as its head.\n" +
                "\n" +
                "In 1378/1958, Shaykh Mahmud Shaltut, the head of al-Azhar, recognized the Ja'fari School of fiqh as a legitimate Islamic school and proclaimed following it permissible.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Scholarly Dialogues and Debates:\n" +
                "\n" +
                "In Shiite hadith collections, some dialogues or debates between Imam al-Sadiq (A) and theologians of other schools and some atheists are reported.\n" +
                "\n" +
                "In some of these debates, the Imam's (A) students debated and the Imam oversaw the debate and sometimes engaged in it.\n" +
                "\n" +
                "Ahmad b. Ali al-Tabrisi has collected some of the debates of Imam al-Sadiq (A), some of which are the following:\n" +
                "\n" +
                "A debate with an atheist on the existence of God\n" +
                "\n" +
                "A debate with Abu Shakir al-Daysani on the existence of God\n" +
                "\n" +
                "A debate with Ibn Abi l-Awja' on the world's creation in time.\n" +
                "\n" +
                "A debate with Abu Hanifa on the methodology of fiqh, especially on analogy.\n" +
                "\n" +
                "A debate with some Mu'tazili scholars on how to choose a ruler and on some religious rulings.\n" +
                "\n");


        str.add("Martyrdom\n" +
                "\n" +
                "His martyrdom is reported to have been on 25th Shawwal in 148/765 in Medina.\n" +
                "\n" +
                "Al-Shaykh al-Saduq clearly states that the Imam was poisoned by al-Mansur al-Dawaniqi and passed away as a result.\n" +
                "\n" +
                "He was buried in the al-Baqi' Cemetery beside his father, Imam al-Baqir (A), his grandfather Imam al-Sajjad (A) and his uncle Imam al-Hasan (A).\n" +
                "\n" +
                "\n");


            edesc.add(str);


        str=new ArrayList<>();

        str.add("جعفر بن محمد، امام جعفر صادقؑ کے نام سے مشہور، شیعوں کے چھٹے اور اسماعیلیوں کے پانچویں امام ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے چھٹے امام\n" +
                "\n" +
                "نام:\t\tجعفر بن محمد\n" +
                "\n" +
                "کنیت:\t\tابو عبد اللہ\n" +
                "القاب:\t\tصادق، صابر، طاہر، فاضل\n" +
                "\n" +
                "تاریخ:\t\tولادت 17 ربیع الاول، 83 ھ۔\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t34 سال (114ھ تا 148ھ)\n" +
                "\n" +
                "شہادت:\t\t25 شوال، سنہ 148ہجری۔\n" +
                "\n" +
                "مدفن:\t\tمدینہ بقیع\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tمحمد بن علیؑ\n" +
                "\n" +
                "والدہ ماجدہ:\t\tام فروہ\n" +
                "\n" +
                "ازواج:\t\tفاطمہ\n" +
                "\n" +
                "اولاد:\t\tاسماعیل، عبداللہ، ام فروة، موسی، اسحاق، محمد، عباس، علی، اسماء و فاطمہ\n" +
                "\n" +
                "عمر:\t\t65 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپ کی امامت 34 سالوں (114-148ھ) پر محیط تھی جس میں بنی امیہ کے آخری پانچ خلفا یعنی ہشام بن عبدالملک سے آخر تک اور بنی عباس کے پہلے دو خلفا سفاح اور منصور دوانیقی بر سر اقتدار رہے ہیں۔ آپ کی امامت کے دوران چونکہ بنی امیہ اپنے زوال کے ایام سے گذر رہی تھی اسلئے آپ کو دوسرے ائمہ کی بنسبت زیادہ علمی امور کی انجام دہی کا موقع ملا۔ آپ کے شاگردوں اور راویوں کی تعداد 4000 ہزار تک بتائی گئی ہیں۔ اہل بیتؑ سے منسوب احادیث میں سے اکثر احادیث امام صادقؑ سے نقل ہوئی ہیں اسی بنا پر شیعہ مذہب کو مذہب جعفریہ کے نام سے بھی یاد کیا جاتا ہے\n" +
                "\n" +
                "\n" +
                "\n");






        str.add("\n" +
                "مسلحانہ قیام سے دوری:\n" +
                "\n" +
                "اگرچہ امام صادقؑ کی امامت کے دوران بنی امیہ اپنی بقا اور زوال کے کشمکش سے دوچار تھی اور کسی حکومت کو سرنگوں کرنے کا یہ بہترین موقع ہوا کرتا ہے، لیکن امامؑ نے مسلحانہ جد و جہد سے دوری اختیار فرمائی یہاں تک کہ بعض افراد کی طرف سے خلافت قبول کرنے کی پیشکش کو بھی آپ نے مسترد کردیا۔\n" +
                "\n" +
                "ایک حدیث کے مطابق امام صادقؑ با وفا اصحاب و اعوان کے نہ ہونے کو مسلحانہ قیام نہ فرمانے کا سبب قرار دیتے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "گھر کو نذر آتش کرنا:\n" +
                "\n" +
                "\n" +
                "کافی اور مناقب علی بن ابی طالب میں مفضل بن عمر کی روایت کے مطابق حسن بن زید نے مدینہ پر حاکمیت کے دوران منصور کے حکم پر حضرت امام جعفر صادقؑ کے گھر نذر آتش کیا۔[78]۔ اس حدیث کے مطابق اس آتش سوز میں آپ کے گھر کا دروازہ اور دہلیز جل گیا اور امامؑ جلتے ہوئے گھر کے اندر سے باہر تشریف لائے اور فرمایا:\n" +
                "\n" +
                "میں اَعراق الثَّرَی (لقب حضرت اسماعیل) کا بیٹا ہوں۔ میں ابراہیم خلیل اللہ کا بیٹا ہوں۔[79]\n" +
                "لیکن بعض مؤرخین من جملہ طبری کے مطابق منصور نے سنہ 150 ہجری یعنی امام صادقؑ کی شہادت کے دو\n" +
                "سال بعد حسن بن زید کو مدینہ کا گورنر مقرر کیا تھا\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تقیہ کرنا:\n" +
                "\n" +
                "سوائے دوسری صدی ہجری کے تیسرے عشرے کے جس میں بنی\u200Cامیہ کی حکومت کا زوال ہوا باقی سالوں میں بنی امیہ اور بنی عباس کے خلفا ہمیشہ آپ اور آپ کے پیرکاروں کی سرگرمیوں پر کڑی نظر رکھتے تھے اور آپ کی زندگی کے آخری سالوں میں سیاسی دباؤ میں شدت آگئی تھی\n" +
                "\n" +
                "بعض روایات کے مطابق منصور دوانیقی کے کارندے حتی ان لوگوں کو بھی پکڑ کر گردن مار دیتے تھے جو آپ کے پیروکاروں کے ساتھ دوستانہ روابط رکھتے تھے۔ اس بنا پر آپؑ تقیہ فرماتے تھے اور اپنے پیروکاروں کو بھی تقیہ کرنے کی سفارش فرماتے تھے\n" +
                "\n" +
                "ایک اور حدیث میں آیا ہے کہ امام صادقؑ نے ابان بن تغلب سے کسی ممکنہ خطرات کے پیش نظر لوگوں کے پوچھے گئے فقہی سوالات کا جواب اہل سنت علماء کے نظریے کے مطابق دینے کا حکم دیا۔[84] اسی طرح امام صادقؑ سے بعض ایسی احادیث نقل ہوئی ہیں جن میں آپ اپنے پیروکاروں کو تقیہ کرنے کی سفارش فرماتے ہیں۔ ان احادیث میں سے بعض میں تقیہ کو نماز کے برابر کا درجہ دیا گیا ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "حدیثی منابع میں امام صادقؑ کی اخلاقی خصوصیات میں سے زہد، انفاق، فراوانی علم، طولانی عبادت اور قرآن کریم کی تلاوت وغیرہ جیسی اخلاقی خصوصیات کا تذکرہ ملتا ہے\n" +
                "\n" +
                "مالک بن انس جو اہل سنت کے ائمہ اربعہ میں سے ہیں، امامؑ کے متعلق کہتے ہیں: جتنی مدت جعفر بن محمد کے پاس جانے کا اتفاق ہوا اسے تین حالتوں میں سے ایک حالت میں پایا، یا نماز کی حالت یا روزہ داری کی حالت میں یا ذکر پڑھنے کی حالت میں\n" +
                "\n" +
                "بحار الانوار کے مطابق امامؑ نے کسی فقیر کے سوال کرنے پر اسے چار سو درہم عطا فرمایا اور جب اس کی شکر گزاری کو دیکھا تو اپنی انگوٹھی جو دس ہزار درہم کی تھی، اسے بخش دیا۔\n" +
                "\n" +
                "آپؑ کے انفاق\u200C فی سبیل اللہ سے متعلق بھی بہت ساری احادیث موجود ہیں۔ کتاب کافی میں آیا ہے کہ آپ رات کو کسی تھیلے میں روٹی، گوشٹ اور درہم و دینار رکھ کر بطور ناشناخت غریبوں کے دروازوں پر جاتے تھے اور مذکورہ چیزوں کو ان میں تقسیم کرتے تھے۔\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "\n" +
                "امام صادقؑ کے دور امامت میں بنی امیہ اپنی اقتدار اور بقا کی جنگ لڑ رہی تھی اسی بنا پر لوگوں خاص کر شیعوں کو کسی حد تک مذہبی آزادی نصیب ہوئی جس سے بھر پور استفادہ کرتے ہوئے امام عالی مقام نے مختلف موضوعات پر علمی اور عقیدتی مباحث کا سلسلہ شروع فرمایا۔[42] اس علمی اور مذہبی آزادی جو آپ سے پہلے والے اماموں کو کمتر نصیب ہوئی تھی کی وجہ سے علم دانش کے متلاشی آپ کے علمی جلسات میں آزادی سے شرکت کرنے لگے۔[43] یوں فقہ، کلام اور دیگر مختلف موضوعا پر آپ سے بہت زیادہ احادیث نقل ہوئیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "مذہب جعفریہ:\n" +
                "\n" +
                "شیعہ عقائد کے مطابق دین اور مذہب کے بنیادی منابع میں جس طرح پیغمبر اکرمؐ کی سنت کو بنیادی حیثیت حاصل ہے آپؐ کے بعد آپ کے حقیقی جانشینوں یعنی ائمہ معصومین کی سنت کو بھی وہی حیثیت حاصل ہے۔ بنابراین ائمہ معصومین میں سے ہر ایک نے اپنی بساط اور حالات کے تقاضا کے مطابق دین اور مذہب کی نشر و اشاعت میں کوئی کسر باقی نہیں چھوڑے ہیں۔ لیکن باقی ائمہ کی نسبت اصول دین اور فروع دین دونوں حوالے سے سب سے زیادہ احادیث امام صادقؑ سے نقل ہوئی ہیں\n" +
                "\n" +
                "فقہ اور کلام میں سب سے زیادہ احادیث امام صادقؑ سے نقل ہونے کی وجہ سے شیعہ اثنا عشریہ کو مذہب جعفریہ نیز کہا جاتا ہے۔[51] موجودہ دور میں امام صادقؑ مذہب جعفریہ کے بانی اور سرپرست کے طور پر مشہور ہیں\n" +
                "\n" +
                "سنہ 1378 ہجری کو الأزہر یونیورسٹی مصر کے چانسلر شیخ محمود شلتوت نے ان سے پوچھے گئے سوال کے جواب میں مذہب جعفریہ کو سرکاری طور پر قبول کرنے کا اعلان کیا اور اس مذہب کے تعلیمات پر عمل کرنے کو بھی جائز قرار دیا\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مناظرات اور علمی گفتگو:\n" +
                "\n" +
                "شیعہ حدیثی منابع میں امام صادقؑ اور دوسرے مذاہب کے متکلمین نیز بعض ملحدین کے درمیان مختلف مناظرات اور علمی گفتگو نقل ہوئی ہیں\n" +
                "\n" +
                "ان مناظرات میں سے بعض میں امام علیہ السلام کے شاگردوں نے اپنے متعلقہ شعبوں میں آپ کی موجودگی میں دوسروں کے ساتھ مناظرہ کئے ہیں\n" +
                "\n" +
                "احمد بن علی طبرسی نے اپنی کتاب الاحتجاج میں امام صادقؑ کے مناظرات کو جمع کیا ہے ان میں سے بعض یہ ہیں:\n" +
                "\n" +
                "\n" +
                "ایک منکر خدا کے ساتھ خدا کے وجود پر مناظرہ\n" +
                "\n" +
                "ابوشاکر دَیصانی کے ساتھ خدا کے وجود پر مناظرہ\n" +
                "\n" +
                "ابن ابی العوجاء کے ساتھ عالَم کے حدوث پر مناظرہ\n" +
                "\n" +
                "ابوحنیفہ کے ساتھ حکم شرعی کے استنباط کے طریقے خاص کر قیاس سے متعلق مناظرہ\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "\n" +
                "بتایا جاتا ہے کہ ان کی شہادت 25 شوال 148 میں مدینہ میں ہوئی ہے۔\n" +
                "\n" +
                " شیخ صدوق فرماتے ہیں کہ آپ کو منصور دوانیقی کے حکم پر زہر سے شہید کیا گیا تھا\n" +
                "\n" +
                "انھیں اپنے والد ، امام البقیر (ع) ، ان کے دادا امام السجاد (ع) اور ان کے چچا امام الحسن (ع) کے ساتھ البقیع قبرستان میں سپرد خاک کردیا گیا۔\n");



        udesc.add(str);



        etitleH.add("Imam Musa Kazim (A)");
        utitleH.add("امام موسی کاظم (ع)");





        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Scholarly Activities");
        str.add("Moral Characteristics");
        str.add("Captivity and Prison");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("علمی خدمات");
        str.add("سیرت");
        str.add("اسیری اور قیدخانہ");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam7.jpg");



        str=new ArrayList<>();

        str.add("Musa ibne Jafar ibne Muḥammad ibne Ali, titled as al-Kazim and Bab al-Ḥawayij  was the seventh Imam of Shi'a, born in Abwa' (a village between Mecca and Medina).\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Born:   Safar 7, 128/November 8, 745\n" +
                "\n" +
                "Birthplace:   Abwa'\n" +
                "\n" +
                "Imamate:   From Shawwal 25, 148/December 14,765(for 35 years)\n" +
                "\n" +
                "Martyrdom:    Rajab 25, 183/September 1, 799 in Baghdad\n" +
                "\n" +
                "Cause of Martyrdom:   By poisoning\n" +
                "\n" +
                "Burial:   Kazmain\n" +
                "\n" +
                "Successor:      Ali ibne Musa (A)\n" +
                "\n" +
                "Father:     Ja'far ibne Muhammad (A)\n" +
                "\n" +
                "Mother :    Hamida al-Barbariyya\n" +
                "\n" +
                "Spouse(s) :   Najma, ...\n" +
                "\n" +
                "Son(s):    Ali (a), Ahmad, Hamza, Muhammad,Ishaq, Ibrahim, ...\n" +
                "\n" +
                "Daughter(s):   Fatima al-Kubra, ...\n" +
                "\n" +
                "Titles:    al-'Abd al-Salih (the righteous servant),Bab al-Hawayij (gate to the wishes)\n" +
                "\n" +
                "\n" +
                "After his father Imam Ja'far al-Sadiq (A) was martyred he became the Imam of Shi'a. The thirty five years of his imamate coincided with the caliphate of al-Mansur, al-Hadi, al-Mahdi, and Harun al-Rashid.\n" +
                "\n" +
                "During his imamate, Imam al-Kazim (A) was repeatedly summoned and imprisoned by Abbasid caliphs.\n" +
                "\n" +
                "He was repeatedly imprisoned by al-Mahdi and Harun, and was finally martyred in 183/799 in al-Sindi ibne Shahik's prison.\n" +
                "Imam al-Kazim's (A) resting place and the mausoleum of his grandson, Imam al-Jawad (A), are located near Baghdad and is known as the Shrine of Kazmayn. It is visited by Muslims, and in particular, the Shi'as.\n" +
                "\n" +
                "\n");
        str.add("Birth:\n" +
                "\n" +
                "Imam al-Kazim (A) was born on Sunday, Safar 7, 128/November 8, 745 or Safar 7, 129/October 28, 746 in the village of Abwa', between Mecca and Medina, when his parents, Imam al-Sadiq (A) and Hamida al-Barbariyya, were returning from Hajj.\n" +
                "\n" +
                "Some have mentioned his place of birth in Medina.\n" +
                "\n" +
                "Musa ibne Ja'far (A) was born in the period of the transfer of the power from the Umayyads to the Abbasids. When he was 4 years old, the first Abbasid caliph took over the power. There is no information in historical sources about Imam al-Kazim's\n" +
                "life before his imamate, except for a few scholarly dialogues during his childhood, such as his dialogue with Abu\n" +
                "Hanifa and scholars of other religions in Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "The number of Imam al-Kazim's (A) wives is not clear, but it is reported that most of them were concubines, the first of whom was Najma, mother of Imam al-Reza (A).\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, Imam al-Kazim (A) had thirty seven children(eighteen sons and nineteen daughters).\n" +
                "\n" +
                "Imam al-Reza (A), Ibrahim, Ahmad, Hamza, Ishaq are among his sons and Fatima and Hakima are among his daughters.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Musa ibne Ja'far (A), after the martyrdom of his father in 148/765 when he was 20 years old, became the imam of Shi'a.\n" +
                "\n" +
                "The period of Imam al-Kazim's (A) imamate coincided with the periods of four Abbasid caliphs.\n" +
                "\n" +
                "About 10 years during al-Mansur's caliphate.\n" +
                "\n" +
                "11 years during al-Mahdi al-'Abbasi.\n" +
                "\n" +
                "1 year during al-Hadi al-'Abbasi.\n" +
                "\n" +
                "13 years during Harun's caliphate .\n" +
                "\n" +
                "Musa ibne Ja'far's (A) imamate lasted for 35 years, and he was succeeded by his son,Imam al-Reza (A), after his martyrdom.\n");
        str.add("Many scholarly activities have been reported for Imam al-Kazim (A). They were\n" +
                "in the forms of hadiths, debates, and dialogues, and are cited in Shiite collections of hadiths.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Debates and Dialogues:\n" +
                "\n" +
                "Imam al-Kazim (a) had debates with al-Mahdi al-'Abbasi with respect to Fadak and the prohibition of wine in the Qur'an.\n" +
                "\n" +
                "He also had debates with Harun al-'Abbasi. Since Harun considered himself as a relative of the Prophet (s), Imam al-Kazim made it explicit to Harun that he had the closest relation with the Prophet (s).\n" +
                "\n" +
                "Musa ibne Ja'far's (A) dialogues with scholars of other religions were usually in the form of replies to their questions, which led to their conversion to Islam.\n");
        str.add("Worshiping manner:\n" +
                "\n" +
                "Imam al-Kazim (A) frequently worshipped God. Thus, he came to be known as \"al-'Abd al-Salih\" (the righteous worshiper or servant of God).\n" +
                "\n" +
                "According to some reports, Imam al-Kazim (a) worshiped so much that his jailers were impressed.\n" +
                "\n" +
                "Even when he was imprisoned at the command of Harun, he thanked God for having an opportunity to worship Him: \"I always asked You an opportunity to worship and You have provided it for me, so I thank You\".\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Moral Conduct:\n" +
                "\n" +
                "Al-Shaykh al-Mufid said that the Imam (A) was the most generous man of his time who secretly took provisions and food to the poor in Medina overnight.\n" +
                "\n" +
                "Ibn 'Inaba said about Musa ibne Ja'far's (A) generosity: he left home overnight with bags of dirhams and gave them to every person in need whom he met.\n" +
                "\n" +
                "It is also said that Musa ibne Ja'far\n" +
                "was also generous to those who bothered him, and whenever he learned that someone was seeking to bother him,he sent gifts to him.\n" +
                "\n" +
                "Al-Shaykh al-Mufid has also considered Imam al-Kazim (A) as persistent on silat al-rahim (family ties).\n" +
                "\n" +
                "The Imam came to be known as \"al-Kazim\" because he greatly controlled his anger.\n" +
                "There are different reports that he controlled his anger against his enemies and people who hurt him.\n" +
                "\n");
        str.add("During his imamate, Imam al-Kazim (A) was repeatedly summoned and imprisoned by Abbasid caliphs.\n" +
                "\n" +
                "For the first time, he was taken from Medina to Baghdad at the command of the Abbasid caliph, al-Mahdi al-'Abbasi.\n" +
                "\n" +
                "Harun also imprisoned the Imam (a) for two times.\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, Harun wrote a letter to 'Isa ibne Ja'far in 180/797 and asked him to kill the Imam, but he refused to do so.\n" +
                "\n" +
                "After a while, the Imam was moved to the prison of al-Fadl ibne Rabi'.\n" +
                "\n" +
                "Imam al-Kazim (A) spent the last years of his life in the prisons of al-Fadl ibne Yahya and al-Sindi b. Shahik.\n" +
                "\n" +
                "In Imam al-Kazim's (A) ziyarah text (visitation supplication), he is greeted as \"tortured in the depths of the prisons\"\n" +
                "\n");
        str.add("Imam al-Kazim (A) spent the last days of his life in al-Sindi ibne Shahik's prison.\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, al-Sindi poisoned the Imam at the command of Harun al-Rashid, and three days later, the Imam was martyred.\n" +
                "\n" +
                "His martyrdom occurred on Rajab 25, 183 (September 1, 799).\n" +
                "\n" +
                "When Musa ibne Ja'far (A) was martyred, his corpse was put on Baghdad's bridge at the order of al-Sindi ibne Shahik and it was announced that Musa ibne Ja'far died of natural causes.\n" +
                "\n" +
                "After finding of Imam's martyrdom, the Shi'a gathered for a funeral and buried his body in the Quraysh cemetery of Kazmain.");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("موسی بن جعفر امام موسی کاظم علیہ السلام کے نام اور کاظم و باب الحوائج کے لقب سے مشہور، شیعیان اہل بیتؑ کے ساتویں امام ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے ساتویں امام\n" +
                "\n" +
                "نام:\t\tموسی بن جعفر\n" +
                "\n" +
                "کنیت:\t\tابو الحسن (الاول)، ابو ابراہیم، ابو علی\n" +
                "\n" +
                "القاب:\t\tکاظم، عبد صالح\n" +
                "\n" +
                "تاریخ ولادت:\t\t7 صفر، 128 ہجری۔\n" +
                "\n" +
                "جائے ولادت:\t\tابواء، مدینہ\n" +
                "\n" +
                "مدت امامت:\t\t35  سال (148 تا 183ھ)\n" +
                "\n" +
                "شہادت:\t\t25 رجب، 183 ہجری۔\n" +
                "\n" +
                "مدفن:\t\tکاظمین\n" +
                "\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tجعفر بن محمد\n" +
                "\n" +
                "والدہ ماجدہ:\t\tحمیدہ بربریہ\n" +
                "\n" +
                "ازواج:\t\tنجمہ،...\n" +
                "\n" +
                "اولاد:\t\tامام رضاؑ • حضرت معصومہ • إبراہیم • قاسم • شاہ چراغ • حمزہ • عبداللہ • إسحاق • حکیمہ\n" +
                "\n" +
                "عمر:\t\t55 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "148 ہجری میں اپنے والد ماجد امام جعفر صادقؑ کی شہادت کے بعد منصب امامت پر فائز ہوئے۔ آپ کی 35 سالہ امامت کے دوران بنی عباس کے خلفاء منصور\n" +
                " دوانقی، ہادی، مہدی اور ہارون رشید بر سر اقتدار رہے۔ منصور عباسی اور مہدی عباسی کے دور خلافت میں آپ نے کئی مرتبہ قید و بند کی صعوبتیں برداشت کیں اور سن 183 ہجری قمری میں سندی بن شاہک کے زندان میں جام شہادت نوش کیا اور منصب امامت آپ کے فرزند ارجمند امام علی رضا علیہ السلام کی طرف منتقل ہوگیا۔\n" +
                "\n");
        str.add("\n" +
                "ولادت:\n" +
                "\n" +
                "امام موسی کاظمؑ نے بروز اتوار 7 صفر سنہ 127 یا 128 ہجری[8] کو مکہ اور مدینہ کے درمیان ابواء نامی مقام پر اس وقت دنیا میں قدم رکھا جب حضرت امام جعفر صادقؑ اپنی زوجہ کے ہمراہ حج سے واپس تشریف لا رہے تھے۔ تاہم بعض مؤرخین کا کہنا ہے کہ آپؑ 129ھ کو مدینہ میں پیدا ہوئے ہیں\n" +
                "\n" +
                "\n" +
                "موسی بن جعفرؑ کی ولادت امویوں سے عباسیوں کی طرف حکومت کے منتقل ہوتے ہوئی۔ آپ کا سن چار سال تھا کہ پہلا عباسی خلیفہ مسند حکومت پر بیٹھا۔ منابع تاریخی میں امام کاظم کی زندگی کے امامت سے پہلے دور کے متعلق کوئی معلومات نہیں ہے البتہ بچپنے میں ابو حنیفہ[17] اور دوسرے ادیان کے علما سے مدینہ میں ہونے والی چند گفتگوئیں مذکور ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ازواج اور اولاد:\n" +
                "\n" +
                "آپ کی ازواج کی تعداد واضح نہیں ہے لیکن منقول ہے کہ ان میں سے زیادہ تر کنیزیں ہیں جنہیں آپ خرید لیتے تھے اور پھر انہيں آزاد کر کے ان سے نکاح کرلیتے تھے۔ ان میں سب سے پہلی خاتون امام رضاؑ کی والدہ نجمہ خاتون ہیں۔\n" +
                "\n" +
                " شیخ مفید کا کہنا ہے کہ امام کاظمؑ کی 37 اولادیں ہیں جن میں 18 بیٹے اور 19 بیٹیاں شامل ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "آپ نے اپنے والد ماجد امام صادقؑ کی شہادت کے بعد سنہ 148 ہجری میں امامت کا عہدہ سنبھالا اور آپ کی امامت 35 برس کے عرصے پر محیط ہے۔ اگرچہ امام صادقؑ نے عباسی خلیفہ منصور عباسی کی سازش ناکام بنانے کے لئے پانچ افراد کی جانشینی کا اعلان کیا تھا جن میں منصور عباسی بھی شامل تھا تاہم حقیقی شیعیان آل رسولؐ نے آپ کی امامت کو تسلیم کیا\n" +
                "\n" +
                "امام کاظمؑ کے دورامامت میں درج ذیل عباسی خلفا رہے:\n" +
                "\n" +
                "منصور دوانیقی ( 136 سے 158 ھ تک)\n" +
                "\n" +
                "مہدی (158 سے 169 ھ تک)\n" +
                "\n" +
                "ہادی (169 سے 170 ھ تک)\n" +
                "\n" +
                "ہارون الرشید (170 سے 193 ھ تک)\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "امام کاظم سے روایات، مناظرات اور گفتگوئیں شیعہ کتب میں مذکور ہیں\n" +
                "\n" +
                "شیعہ منابع میں اکثر امام کاظم سے احادیث منقول ہوئی ہیں۔ جن میں سے اکثر تعداد کلامی جیسے توحید[44]، بدا[45] اور ایمان[46] نیز اخلاق کے عنوان سے منقول ہیں\n" +
                "\n" +
                "\n" +
                "مناظرے اور مکالمے:\n" +
                "\n" +
                "امام کاظم کے مناظرات اور گفتگو مختلف کتب میں مذکور ہیں جن میں سے بعض خلفائے بنی عباس،[54] یہودی دانشمندوں،[55] مسیحیوں،[56] ابو حنیفہ[57] اور دیگران سے منقول ہیں۔ باقر شریف قرشی نے تقریبا آٹھ مناظرے اور گفتگو مناظرے کے عنوان کے تحت ذکر کی ہیں۔[58] امام کاظم ؑ نے مہدی عباسی کے ساتھ فدک اور قرآن میں حرمت خمر کے متعلق گفتگو کی۔[59] امام ؑ نے ہارون عباسی سے مناظرہ کیا۔ جب کہ وہ اپنے آپ کو پیامبرؐ سے منسوب کرکے اپنے آپ کو پیغمبر کا رشتہ دار سمجھتا تھا، امام کاظمؑ نے اس کے سامنے اس کی نسبت اپنی رشتہ داری کو رسول اکرم سے زیادہ نزدیک ہونے کو بیان کیا۔[60] موسی بن جعفر نے دیگر ادیان کے علما سے بھی مناظرے کئے جو عام طور پر سوال و جواب کی صورت میں تھے جن کے نتیجے میں وہ علما مسلمان ہوگئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "عبادی سیرت:\n" +
                "\n" +
                "شیعہ و سنی منابع کے مطابق امام کاظم ؑبہت زیادہ اہل عبادت تھے۔ اسی وجہ سے ان کے لئے عبد صالح استعمال کیا جاتا ہے۔[67]بعض روایات کی بنا پر حضرت امام موسی کاظم اس قدر زیادہ عبادت کرتے تھے کہ زندانوں کے نگہبان بھی اس کے تحت تاثیر آ جاتے۔\n" +
                "\n" +
                "یہانتک کہ ہارون کے حکم سے جب زندان تبدیل کیا جاتا تو اس پر خدا کا شکر بجا لاتے کہ خدا کی عبادت کیلئے پہلے سے زیادہ فرصت مہیا کی ہے اور کہتے: خدایا! میں تجھ سے عبادت کی فرصت کی دعا کرتا تھا تو تو نے مجھے اسکی فرصت نصیب فرمائی پس میں تیرا شکر گزار ہوں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "اخلاقی سیرت:\n" +
                "\n" +
                " شیخ مفید نے انہیں اپنے زمانے کے ان سخی ترین افراد میں سے شمار کیا ہے کہ جو فقیروں کیلئے خود خوراک لے کر جاتے تھے\n" +
                "\n" +
                " ابن عنبہ نے امام موسی کاظم کی سخاوت کے متعلق کہا ہے: وہ رات کو اپنے ہمراہ درہموں کا تھیلا گھر سے باہر لے جاتے ہر کسی کو اس میں سے بخشتے یا جو اس بات کے منتظر ہوتے تو انہیں بخشتے\n" +
                "\n" +
                " شیخ مفید نے امام موسی کاظم کو اپنے گھر اور دوسرے رشتہ داروں کے ساتھ صلۂ رحمی کی سب سے زیادہ سعی کرنے والا سمجھتے ہیں\n" +
                "\n" +
                " امام موسی کاظم کو کاظم کا لقب دینے کی وجہ یہ تھی کہ آپ اپنے غصے کو کنٹرول کرتے تھے۔[77] مختلف روایات میں آیا ہے کہ آپ دشمنوں اور اپنے ساتھ بدی کرنے والوں کے مقابلے میں اپنا غصہ پی جاتے تھے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "امام کاظمؑ کی گرفتاری کے اسباب میں مختلف قسم کے اقوال نقل ہوئے ہیں جس سے اہل تشیع کے درمیان امامؑ کے مرتبے اور مقام و منزلت کی عکاسی ہوتی ہے۔ چنانچہ مؤرخین نے بیان کیا ہے کہ عباسی دربار کے وزیر یحیی برمکی یا پھر امامؑ کے ایک بھائی نے عباسی بادشاہ ہارون عباسی کے پاس چغل خوری اور بہتان تراشی کی تھی۔ ہارون نے امامؑ کو دو مرتبہ قید کیا لیکن تاریخ پہلی مدتِ قید کے بارے میں خاموش ہے جبکہ دوسری مدتِ قید سنہ 179 سے 183 ہجری تک ثبت کی گئی ہے جو امامؑ کی شہادت پر تمام ہوئی۔[23]\n" +
                "ہارون نے سنہ 179 میں امامؑ کو مدینہ سے گرفتار کیا۔ امامؑ 7 ذوالحجۃالحرام کو بصرہ میں عیسی بن جعفر کے قیدخانے میں قید کئے گئے؛ جہاں سے آپ کو بغداد میں فضل بن ربیع کی زندان میں منتقل کیا گیا۔ فضل بن یحیی کی زندان اور سندی بن شاہک کی زندان وہ قید خانے تھے جن میں امامؑ نے اپنی عمر کے آخری لمحات تک اسیری کی زندگی گذاری\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "امام کاظمؑ 25 رجب سنہ 183 ہجری کو بغداد میں واقع سندی بن شاہک کی زندان میں شہید کیا گیا۔ آپ کی شہادت کے بعد سندی نے حکم دیا کہ آپ کا جسم بے جان بغداد کے پل پر رکھ دیا جائے اور اعلان کیا جائے کہ آپ طبیعی موت پر دنیا سے رخصت ہوئے ہیں\n" +
                "\n" +
                "شیعوں کو امامؑ کی شہادت کی اطلاع ملی تو انھوں نے آپ کا جنازہ اٹھایا اور عقیدت و احترام کے ساتھ قبرستان قریش میں سپرد خاک کیا۔ جہاں آپ کا حرم مطہر آج بھی زیارت گاہ خاص و عام ہے۔\n" +
                "\n" +
                "\n" +
                "\n");

        udesc.add(str);




        etitleH.add("Imam Reza (A)");
        utitleH.add("امام رضا (ع)");

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Debates");
        str.add("Morale Virtues");
        str.add("Scientific Conduct");
        str.add("Attributed Works");
        str.add("Martyrdom");


        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("مناظرے");
        str.add("سیرت");
        str.add("سائنسی طرز عمل");
        str.add("منسوب کتابیں");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam8.jpeg");


        str=new ArrayList<>();


        str.add("Ali ibne Musa ibne Jafar ibne Muḥammad, is the eighth Imam of Shia. His Kunya was Abul-Ḥasan and his most famous title was al-Reza He was Imam for 20 years. Imam al-Reza (A) was born in Medina and was martyred in Tus.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:   Abu l-Hasan\n" +
                "\n" +
                "Born:    Dhu l-Qa'da 11, 148/December 29,765\n" +
                "\n" +
                "Birthplace:   Medina\n" +
                "\n" +
                "Imamate:    From Rajab 25, 183/September 1,799(for 20 years)\n" +
                "\n" +
                "Martyrdom:    Safar 29 or Safar 30,203/September 5 or September 6,818 in Tus, Iran\n" +
                "\n" +
                "Cause of Martyrdom:   By poisoning\n" +
                "\n" +
                "Successor:   Muhammad b. 'Ali\n" +
                "\n" +
                "Father:    Musa ibne Ja'far\n" +
                "\n" +
                "Mother:    Najma Khatun\n" +
                "\n" +
                "Brother(s):    Ahmad, Hamza, Muhammad, ...\n" +
                "\n" +
                "Sister(s):     Fatima, ...\n" +
                "\n" +
                "Spouse(s):      Sabika, Umm Habib\n" +
                "\n" +
                "Son(s):     Muhammad\n" +
                "\n" +
                "\n" +
                "\n" +
                "Al-Ma'mun al-'Abbasi brought Imam al-Reza (A) to Khorasan by force and against Imam's will made him crown prince.\n" +
                "\n" +
                "The debate sessions al-Ma'mun al-Abbasi held between Imam al-Reza (A) and personalities of other religions and schools of thought are famous.\n" +
                "\n" +
                "He was martyred by al-Ma'mun in Tus. The holy shrine of Imam al-Reza (A) is located in Mashhad and every year millions of Muslims from different countries visit it.");

        str.add("Birth:\n" +
                "\n" +
                "Imam al-Reza's (a) birthday has been reported to be on Thursday or Friday, Dhu l-Qa'da 11 of 148/ December 29,765.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives:\n" +
                "\n" +
                "Imam al-Reza (A) had a wife named Sabika who is reported to be from the family of Maria, wife of the Prophet (s).\n" +
                "\n" +
                "Children:\n" +
                "\n" +
                "There is a disagreement about the numbers and names of the children of Imam al-Reza (A).\n" +
                "\n" +
                "Al-Shaykh al-Mufid did not mention any children for Imam al-Rida other than Muhammad (A).\n" +
                "\n" +
                "Also, Ibn Shahrashub and al-Tabrisi have the same idea.\n" +
                "\n" +
                "Some have mentioned a daughter for Imam called Fatima.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "The period of imamate of Imam al-Reza (A) after his father was 20 years (183/799 - 203/818) which was contemporary with the caliphate of Harun al-Rashid, Muhammad al-Amin (approx. 5 years) and al-Ma'mun years; of which, the first 5 years was contemporary with Imam al-Rida (a)].\n" +
                "\n" +
                "\n" +
                "\n" +
                "Tendencies of Shia:\n" +
                "\n" +
                "After the martyrdom of Imam al-Kazim (A), most Shia accepted the Imamate of Imam al-Reza (A), son of Imam al-Kazim (A) because of his will and other reasons and evidences.\n" +
                "\n" +
                "These people including the\n" +
                "great companions of Imam al-Kazim (a) are called Qat'iyya.\n" +
                "\n" +
                "But, another group of the companions of Imam al-Kazim (A) did not accept the Imamate of Imam al-Reza (A) for some reasons.\n" +
                "They said that, \"Imam al-Kazim (A) was the last Imam and did not mention anyone as Imam or at least we are not aware of it.\" They were called Waqifids.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Position of Imam (a) in Medina:\n" +
                "\n" +
                "Imam al-Rida (a) lived 17 years of his Imamate in Medina (183 – 200/815-816 or 201/816-817) and had a great position among people.\n" +
                "\n" +
                "In a conversation with Ma'mun about the position of the crown prince, Imam described his life in Medina as follows, \"Surly, being the crown prince did not add any value to me. When I was in Medina, my order was obeyed in the east and the west and when I passed the alleys of Medina riding on my horse,no one was ever more honorable than me.\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Journey to Khorasan:\n" +
                "\n" +
                "It is said that the immigration of Imam al-Rida (a) from Medina to Merv occurred in 200/815-816 or 201/816-817.\n" +
                "\n" +
                "The book Hayat-i fikri wa siyasi-i Imaman-i Shi'a (A) says that \"Imam al-Reza (A) was in Medina until 201/816-817 and entered Merv in Ramadan of the same year.\"\n" +
                "\n" +
                "The route, al-Ma'mun chose for bringing Imam al-Reza (A) to Merv was specifically planned so that Imam does not pass from Shi'a cities because al-Ma'mun was afraid of Shi'a gathering around Imam al-Reza (A). He ordered not to pass Imam from Kufa, instead they brought Imam from Basra to Khuzestan and Fars to Neyshabur.\n" +
                "\n" +
                "The most important and most documented event of this path happened in Neyshabur where Imam al-Reza (A) made a speech and said the famous hadith of Silsilat al-Dhahab.\n" +
                "\n" +
                "Al-Shaykh al-Mufid said, \"al-Ma'mun summoned a group of people from the family of Abu Talib from Medina including Imam al-Reza (A).\"\n");

        str.add("After al-Ma'mun brought Imam al-Reza (A) to Merv, held many scientific meetings with the presence of different scholars.\n" +
                "\n" +
                "In these sessions, many discussions were made between Imam and others which were mostly about ideological and fiqh issues.\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("Worshiping manner:\n" +
                "\n" +
                "It is mentioned that in the middle of scientific debates in which great personalities of different religions and denominations participated, Imam al-Reza (A) left the sessions as soon as he heard the call of Adhan and answered to\n" +
                "the request of the people for continuing the debates, saying that, \"I will pray and come back.\"\n" +
                "\n" +
                "There are numerous reports about his worships at night and vigils.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Moral Conduct:\n" +
                "\n" +
                "His kind manner and eating with servants even after being the crown prince are among these reports.\n" +
                "\n" +
                "Ibn Shahr Ashub narrated that one day Imam went to a public bath.\n" +
                "\n" +
                "A person who did not know Imam, asked him to massage and wash his body and Imam accepted and began to do what he asked. Others who saw this, introduced Imam to that man and the man was very embarrassed and ashamed and apologized. Imam calmed him down and continued massaging and washing him.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Upbringing conduct:\n" +
                "\n" +
                "In the conduct of Imam al-Reza, the role of children in the pregnancy, family was emphasized and cases such as the necessity of marriage with righteous spouse, good caring during naming children with good names and respecting them.\n" +
                "\n" +
                "Regarding association with relatives it is mentioned that whenever Imam had a free time, gathered his relatives and spoke to them.\n");
        str.add("When Imam al-Reza (A) was in Medina, he (A) used to sit in the mosque of the Prophet (s) and those scholars who had scientific problems asked their questions from Imam (A)\n" +
                "\n" +
                "After Imam went to Merv, he answered many questions in debates and held scientific gatherings in his house and in the mosque of Merv.\n" +
                "\n" +
                "Imam advised about health and medicine in his narrations. In these narrations, he explained several concepts related to health and medicine and also discussed about preventing disease, proper eating habits, individual hygiene and treatments.\n" +
                "Tibb al-Reza, also known as Risala al-Dhahabiyya contains pieces of advice in this regard.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("For understanding scientific issues as mentioned in books such as 'Uyun akhbar al-Reza (A) which has mentioned many of such issues.\n" +
                "\n" +
                "Another work which has been attributed to Imam al-Reza is Risalat al-Dhahabiyya in Medicine. It is said that Imam sent this treatise to al-Ma'mun in 201/817, and to show its importance, al-Ma'mun ordered to write it by gold and keep it in the treasure house of Dar al-Hikma. This is why they call it Risalat al-Dhahabiyya (the golden treatise).\n");
        str.add("There is a disagreement over the date of Imam al-Rida's (a) martyrdom and it is said to be on Friday or Monday of the last day of Safar, or on Safar 17, or on Ramadan 21, or on Jumada I 18, or on Dhu l-Qa'da\n" +
                "23, or on the last day of Dhu l-Qa'da in 202 or 203 or 206.[42] But according to the majority of scholars and historians, the martyrdom occurred in 203/818.\n" +
                "\n" +
                "Al-Shaykh al-Saduq narrated some hadiths with similar meanings in some of which the poison in grapes is mentioned and in some, the poison is mentioned both in grapes and pomegranate.\n" +
                "\n" +
                "After Imam's martyrdom, al-Ma'mun buried the body in the house of Humayd ibne Qahtaba al-Ta'i in the village of Sanabad. Today, the holy shrine of Imam al-Reza (A) is located in Mashhad, Iran.\n" +
                "\n" +
                "\n" +
                "\n");


        edesc.add(str);

        str=new ArrayList<>();
        str.add("\n" +
                "\n" +
                " امام محمد تقی سے منقول ایک حدیث کے مطابق امام رضا علیہ السلام کو \"رضا\" کا لقب خدا کی طرف سے عطا ہوا ہے۔ اسی طرح آپ عالم آل محمد کے نام سے بھی مشہور ہیں۔\n" +
                "\n" +
                "وہ مدینہ منورہ میں پیدا ہوے تھا اور تس میں شہید ہوے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے آٹھویں امام\n" +
                "\n" +
                "نام:\t\tعلی بن موسی\n" +
                "\n" +
                "کنیت:\t\tابو الحسن (ثانی)\n" +
                "\n" +
                "القاب:\t\tرضا\n" +
                "\t\t\n" +
                ":تاریخ ولادت\t\t11 ذو القعدة الحرام، سنہ 148 ہجری۔\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t20 سال (183 تا 203ھ)\n" +
                "\n" +
                "شہادت:\t\t30 صفر 203 ہجری۔\n" +
                "\n" +
                "سبب شہادت:\tزہر سے مسموم\n" +
                "\n" +
                "مدفن:\t\tمشہد\n" +
                "\n" +
                "رہائش:\t\tمدینہ، مرو\n" +
                "\n" +
                "والد ماجد:\t\tامام موسی کاظم\t \n" +
                "\n" +
                "والدہ ماجدہ:\t\tتکتم\n" +
                "\n" +
                "ازواج:\t\tسبیکہ و ...\n" +
                "\n" +
                "اولاد:\t\tامام محمد تقی علیہ السلام، محمد قانع، حسن، جعفر، ابراہیم، حسین، عائشہ\n" +
                "\n" +
                "عمر:\t\t55 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "عباسی خلیفہ مامون آپ کو مدینہ سے زبردستی خراسان لے آیا اور اپنی ولایت عہدی قبول کرنے پر مجبور کیا۔ امامؑ نے مدینہ سے خراسان جاتے ہوئے نیشاپور کے مقام پر ایک حدیث ارشاد فرمائی جو حدیث سلسلۃ الذہب کے نام سے مشہور ہے۔ مامون نے اپنے خاص مقاصد کی خاطر مختلف ادیان و مذاہب کے اکابرین کے ساتھ آپ کے مناظرے کروائے جس کے نتیجے میں یہ سارے اکابرین آپ کی فضیلت کے معترف ہوئے۔\n" +
                "\n" +
                "55 سال کی عمر میں مامون کے ہاتھوں شہید ہوئے۔ آپ کا مرقد مبارک ایران کے شہر مشہد میں موجود ہے جہاں سالانہ لاکھوں مسلمان زیارت کیلئے آتے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "ولادت:\n" +
                "\n" +
                "آپ کی تاریخ پیدائش جمعرات یا جمعہ 11 ذی القعدہ, 148 ہجری نقل ہوئی ہے\n" +
                "\n" +
                "\n" +
                "ازواج:\n" +
                "\n" +
                "آپ کی ایک زوجہ کا نام سبیکہ [19] تھا جن کے متعلق کہا جاتا ہے کہ آپ ام المؤمنین ماریہ قبطیہ کے خاندان سے تھیں۔\n" +
                "\n" +
                "\n" +
                "اولاد:\n" +
                "\n" +
                "امام رضاؑ کی اولاد کی تعداد اور ان کے اسماء کے بارے میں مورخین میں اختلاف پایا جاتا ہے\n" +
                "\n" +
                " شیخ مفید، امام رضاؑ کی شہادت کا ذکر کرتے ہوئے لکھتے ہیں کہ آپ نے ابو جعفر محمد بن علی التقی الجواد جو آپ کے بعد (نویں) امام تھے، کے سوا کوئی اولاد نہيں چھوڑی جن کی عمر سات سال اور چند مہینے تھی۔[27] ابن شہر آشوب اور امین الاسلام طبرسی، کی رائے بھی یہی ہے۔[28] بعض مؤرخین نے لکھا ہے کہ آپ کی ایک بیٹی بھی تھیں جن کا نام فاطمہ تھا۔[29]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "امام رضاؑ اپنے والد ماجد امام موسی کاظم علیہ السلام کی شہادت کے بعد 20 سال (183 - 203 ہجری) تک امامت کے عہدے پر فائز رہے۔ آپ کی امامت کے ابتدائی دور میں ہارون رشید خلافت پر قابض تھا اس کے بعد اس کے بیٹے امین نے تین سال اور 25 دن حکومت کی جس کے بعد ابراہیم بن مہدی عباسی المعروف ابن شکلہ نے 14 روز حکومت کی جس کے بعد امین عباسی نے ایک بار پھر اقتدار سنبھال کر ایک سال اور سات مہینے حکومت کی۔ آپؑ کی امامت کے آخری 5 سال مامون عباسی کے دور خلافت میں گذرے ہیں۔[30]\n" +
                "\n" +
                "\n" +
                "\n" +
                "امام رضا کے دور میں شیعوں کے اعتقادات:\n" +
                "\n" +
                "امام کاظمؑ کی شہادت کے بعد شیعوں کی اکثریت نے ساتویں امام کی وصیت اور دوسرے قرائن و شواہد کی بنا پر ان کے بیٹے علی بن موسی الرضاؑ کو آٹھویں امام کے طور پر قبول کر لیا تھا۔ آپؑ کی امامت کو قبول کرنے والے شیعہ جن میں امام کاظمؑ کے بزرگ اصحاب شامل تھے، قطعیہ کے نام سے مشہور تھے۔[38] لیکن امام کاظمؑ کے اصحاب میں سے ایک گرہ نے بعد دلایل کی بنیاد پر علی بن موسی الرضاؑ کی امامت کو قبول کرنے سے انکار کیا اور امام موسی کاظمؑ کی امامت پر توقف کیا۔ ان کا عقیدہ تھا کہ موسی بن جعفرؑ آخری امام ہیں جنہوں نے کسی کو امام متعین نہیں کیا ہے یا کم از کم ہمیں اس بارے میں کوئی معلومات نہیں ہیں۔ یہ گروہ واقفیہ (یا واقفہ) کے نام سے جانے جاتے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مدینہ میں آپؑ کا مقام:\n" +
                "\n" +
                "امام رضاؑ نے اپنی امامت کے تقریبا 17 سال (183-200 یا 201 ہجری) مدینے میں گزارے جہاں پر آپؑ لوگوں کے درمیان ایک ممتاز مقام کے حامل تھے۔ مأمون کے ساتھ اپنی ولایتعہدی کے بارے میں ہونے والی گفتگو میں امامؑ خود اس بارے میں فرماتے ہیں:\n" +
                "\n" +
                "میرے نزدیک اس ولایت عہدی کی کوئی حیثیت نہیں ہے۔ جس وقت میں مدینے میں ہوتا تھا تو میرا حکم مشرق و مغرب میں نافذ تھا اور جب میں اپنی سواری پر مدینے کے گلی کوچوں سے گزرتا تو لوگوں کے یہاں مجھ سے زیاده محبوب شخصیت کوئی نہیں تھی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "خراسان کا سفر:\n" +
                "\n" +
                "روایت ہے کہ امام رضاؑ کی مدینہ سے مرو کی طرف ہجرت سنہ 200 ہجری میں انجام پائی۔[41] رسول جعفریان لکھتے ہیں: امام رضاؑ سنہ 201 کو مدینہ میں تھے اور اسی سال رمضان کے مہینے میں مرو پہنچ گئے۔[42] اس قول کے مطابق امام رضاؑ سنہ 201 کو مدینہ میں تھے اور اسی سال رمضان میں مرو پہنچ گئے۔\n" +
                "\n" +
                "امامؑ کی مرو منتقلی کے لئے مامون نے ایک خاص راستہ منتخب کیا تھا تا کہ آپ کو شیعہ اکثریتی علاقوں گذرنے نہ دیا جائے، کیونکہ وہ ان علاقوں میں لوگوں کے اجتماعات سے خوفزدہ تھا جو امام کے ان علاقوں میں پہنچنے پر متوقع تھا۔ اس نے حکم دیا تھا کہ امامؑ کو کوفہ کے راستے سے نہیں بلکہ بصرہ، خوزستان اور فارس کے راستے سے نیشابور لایا جائے\n" +
                "\n" +
                "شیخ مفید کہتے ہیں: مامون نے خاندان ابو طالبؑ کے بعض افراد کو مدینہ سے بلوایا جن میں امام رضاؑ بھی شامل تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "سانچہ:امام رضاؑ کا سفر مدینہ سے مرو امام رضاؑ کو مرو منتقل کرنے کے بعد مامون نے مختلف مکاتب فکر اور ادیان و مذاہب کے دانشوروں اور امامؑ کے درمیان مختلف مناظرات ترتیب دئے جن میں زیادہ تر اعتقادی اور فقہی مسائل بحث و گتفگو ہوتی تھی۔ ان ہی میں سے بعض مناظرات کو ابو على، فضل بن حسن بن فضل طبرسى، جو امین الاسلام طبرسی کے نام سے معروف ہیں نے کتاب الاحتجاج میں نقل کیا ہے\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "عبادات میں آپ کی سیرت: \n" +
                "\n" +
                "امام رضاؑ کی عملی سیرت میں آیا ہے کہ آپؑ مختلف مکاتب فکر اور ادیان و مذاہب کے دانشوروں کے ساتھ ہونے والے گرما گرم مناظرات کے دوران بھی جیسے ہی اذان سنائی دیتی مناظرے کو متوقف فرماتے تھے اور جب مناظرے کو جاری رکھنے سے متعلق لوگ اصرار کرتے تو فرماتے: نماز پڑھ کر دوبارہ واپس آتا ہوں\n" +
                "\n" +
                "رات کی تاریکی میں عبادات کی انجام دہی اور آپؑ کی شب بیداری سے متعلق متعدد روایات نقل ہوئی ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "اخلاق میں آپ کی سیرت:\n" +
                "\n" +
                " لوگوں کے ساتھ آپؑ کی حسن معاشرت کے متعدد نمونے تاریخ میں نقل ہوئے ہیں۔ حتی مامون کی ولیعہدی قبول کرنے کے بعد بھی غلاموں اور ماتحتوں کے ساتھ محبت آمیز رویہ اختیار کرنا اور ان کو دسترخوان پر ساتھ بٹھانا[75] اس سلسلے کی چند ایک مثالیں ہیں۔ابن شہرآشوب نقل کرتے ہیں کہ ایک دن امامؑ حمام تشریف لے گئے اور وہاں پر موجود افراد میں سے ایک جو امام کو نہیں پہچانتا تھا، امام سے مالش کرنے کی درخواست کی جسے آپ نے قبول فرمایا اور مالش کرنا شروع کیا جب لوگوں نے یہ دیکھا تو اس شخص کیلئے آپ کی معرفی کی، جب وہ شخص اپنے کیے پر شرمندہ ہوا اور مغذرت خواہی کی تو امام نے اسے خاموش کرایا اور مالش جاری رکھی\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تربیتی امور میں آپ کی سیرت:\n" +
                "\n" +
                " آپؑ کی سیرت میں بچوں کی تربیت کے حوالے سے خاندان کے کلیدی کردار پر بہت زیادہ تاکید کی گئی ہے۔ اسی تناظر میں صالح اور نیک بیوی سے شادی کی ضرورت،[77] حمل کے ایام میں خصوصی توجہ،[78] اچھے ناموں کا انتخاب،[79] اور بچوں کے احترام[80] وغیرہ پر تاکید ہوئی ہے۔\n" +
                "\n" +
                "اسی طرح رشتہ داروں کے ساتھ رفت و آمد اور ان کے ساتھ انس پیدا کرنا بھی آپ کی سیرت میں نمایاں طور پر دیکھا جا سکتا ہے۔ اس حوالے سے منقول ہے کہ جب بھی امام کو فراغت حاصل ہوتی تو آپ اپنے رشتہ داروں؛ چھوٹے بڑے سب کو جمع کرتے اور ان کے ساتھ گفتگو میں مشغول ہوتے تھے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                " مدینے میں قیام کے دوران امام رضاؑ مسجد نبوی میں تشریف فرما ہوتے اور مختلف سوالات اور مسائل میں جواب دینے سے عاجز آنے والے حضرات آپ سے رجوع کرتے تھے۔[82] \"مرو\" پہنچنے کی بعد بھی مناظرات کی شکل میں بہت سارے شبہات اور سوالوں کے جواب مرحمت فرماتے تھے۔ اس کے علاوہ امامؑ نے اپنی اقامت گاہ اور مرو کے مسجد میں ایک حوزہ علمیہ بھی قائم کیا ہوا تھا لیکن جب آپ کی علمی محفل رونق پیدا کرنے لگا تو مامون نے انقلاب کے خوف سے ان محفلوں پر پابندی لگا دی جس پر آپ نے مامون کو بد دعا دی۔[83]\n" +
                "\n" +
                "طب اسلامی اور حفظان صحت کے اصولوں پر خصوصی توجہ دینا امام رضاؑ کی احادیث میں نمیاں طور پر دیکھا جاتا سکتا ہے۔ ان احادیث میں اسی موضوع سے مربوط مفاہیم کی تبیین کے ساتھ ساتھ پرہیز، مناسب خوراک، حفظان صحت کی رعایت اور مختلف بیماریوں کے علاج کی طرف بھی اشارہ فرمایا ہے۔ رسالہ ذہبیہ نامی کتاب طب الرضا کے نام سے آپ کی طرف منسوب ہے جس میں اس حوالے سے مختلف تجاویز پائی جاتی ہیں۔\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "امام رضاؑ سے متعدد حدیثیں نقل ہوئی ہیں اور جن لوگوں نے علوم و معارف کے مسائل سمجھنے کے لئے جو سوالات آپ سے پوچھے تھے جن کے جوابات کتب حدیث میں نقل ہوئے ہیں؛ مثال کے طور پر شیخ صدوق نے ان حدیثوں اور جوابات کو اپنی کتاب عیون اخبار الرضا میں جمع کیا ہے\n" +
                "\n" +
                "امام رضاؑ سے منسوب ہے جس کا موضوع علم طبّ ہے۔ مروی ہے کہ امامؑ نے یہ رسالہ سنہ 201 ہجری میں لکھ کر مأمون کے لئے بھجوایا اور مأمون نے رسالے کی اہمیت ظاہر کرنے کی غرض سے ہدایت کی کہ اسے سونے کے پانی سے تحریر کیا جائے اور اسے دارالحکمہ کے خزانے میں رکھا جائے اور اسی بنا پر اسے رسالہ ذہبیہ کہا جاتا ہے۔ بہت سے علماء نے اس رسالے پر شرحیں لکھی ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "آپ کی شہادت کے بارے میں بھی مورخین کے درمیان اختلاف پایا جاتا ہے اسی بنا پر بروز جمعہ یا پیر، ماہ صفر کی آخری تاریخ، یا 17 صفر، 21 رمضان، 18 جمادی\u200Cالاولی، 23 ذی القعدہ، یا ذی القعدہ کی آخری تاریخ سنہ 202، 203 یا 206 نقل ہوئی ہیں۔[9] کلینی کے مطابق آپ صفر کے مہینے میں سنہ 203 ہجری میں 55 سال کی عمر میں شہادت کے مقام پر فائز ہوئے ہیں۔[10] اکثر علماء اور مورخین کے مطابق آپؑ کی شہادت سنہ 203 ہجری میں واقع ہوئی ہے\n" +
                "\n" +
                "شیخ مفید روایت کرتے ہیں کہ عبداللہ بن بشیر نے کہا: مجھے مامون نے حکم دیا کہ اپنے ناخن نہ تراشوں تاکہ معمول سے زیادہ بڑھ جائیں اور اس کے بعد اس نے مجھے تمر ہندی (املی) جیسی چیز دے دی اور کہا کہ اسے اپنے ہاتھوں سے گوندہ لوں۔ اس کے بعد مامون امام رضاؑ کے پاس گیا اور مجھے آواز دے کر بلوایا اور کہا کہ انار کا شربت نکالو۔ میں نے انار کو دباکر شربت نکالا اور مامون نے وہی شربت امامؑ کو پلایا اس کے دو روز بعد امامؑ رحلت کرگئے");

        udesc.add(str);



        etitleH.add("Imam Muhammad Taqi (A)");
        utitleH.add("امام محمد تقی (ع)");

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Virtues and Merits");
        str.add("Martyrdom");


        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("فضائل و مناقب");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam7.jpg");


        str=new ArrayList<>();
        str.add("Muhammad ibne Ali ibne Musa ibne Jafar, was the ninth Imam of Shia, his kunya was Abu Ja'far and he is mentioned in haidth sources as Abu Ja'far al-Thani (the second Abu Ja'far).\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:   Abu Ja'far, Abu 'Ali\n" +
                "\n" +
                "Born:   Rajab 10, 195/April 8, 811\n" +
                "\n" +
                "Birthplace:    Medina, Arabia\n" +
                "\n" +
                "Imamate:     From Safar 30, 203/September 6, 818(for 17 years)\n" +
                "\n" +
                "Martyrdom :    Dhu l-Qa'da 30, 220/November 25,835 in Kadhimiya, Iraq\n" +
                "\n" +
                "Burial Place:     Kazmain, Iraq,\n" +
                "\n" +
                "Predecessor:    'Ali ibne Musa al-Rida (A)\n" +
                "\n" +
                "Successor::   'Ali ibne Muhammad al-Hadi(A)\n" +
                "\n" +
                "Father:   Ali ibne Musa al-Rida (a)\n" +
                "\n" +
                "Mother:    Sabika\n" +
                "\n" +
                "Spouse(s):    Samana, Umm al-Fadl\n" +
                "\n" +
                "Son(s):    Ali, Musa\n" +
                "\n" +
                "Daughter(s):    Fatima, Amama Abu Ja'far al-Thani\n" +
                "\n" +
                "Titles:   al-Jawad (the generous), al-Taqi (the pious), Ibn al-Rida (Son of al-Rida)\n" +
                "\n" +
                "He was born on Rajab 10, 195/April 8, 811 in Medina and was Imam for 17 years.\n" +
                "\n" +
                "He was martyred when he was 25 years old and was buried in Kazmain beside the grave of his grandfather Musa ibne Ja'far (A).\n" +
                "\n" +
                "He was the youngest Imam when he was martyred.\n" +
                "\n" +
                "Because Imam al-Jawad (A) was an 8 year old child, some Shi'a followed 'Abd Allah ibne Musa and some others followed Waqifids. But most Shi'a accepted the imamate of Imam al-Jawad (A) due to his scientific superiority in spite of his age.\n" +
                "\n" +
                "At that time, due to restrictions made for Imam (A), his connections with Shi'a were mostly made through agents.\n" +
                "\n" +
                "Scientific debates of Imam al-Jawad (A) in his childhood age with religious scholars of different Islamic sects in theological issues such as the position of caliphs and in fiqh issues such as hajj rituals are among well-known debates of Imams.\n" +
                "\n");
        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "According to the report of historians, Imam al-Jawad (A) was born in 195/811 in Medina. The famous and unique report is Rajab 10/April 8 which has been mentioned by al-Shaykh al-Tusi in Misbah al-mutahajjid.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Blessed Child:\n" +
                "\n" +
                "Imam al-Jawad (A) was born in last years of Imam al-Reza's (A) life. They have said that before his birth, Imam al-Reza (A) had no children and some enemies spread this rumor that Imam al-Reza (A) is not going to leave any lineage after himself and the chain of imamate will be broken.\n" +
                "\n" +
                "According to narrative sources, when Imam al-Jawad (A) was born and they brought him to his father; Imam al-Reza (A) said, \"This is a child, more blessed than him is not born for our followers.\" Also, a report narrated by Ibn Asbat and 'Ubbad ibne Isma'il said, \"We were at the presence of Imam al-Reza (A) that they brought Abu Ja'far (Imam al-Jawad (a)). We asked, 'Is this that blessed child?'\n" +
                "Imam al-Reza (A) said, 'This is the child, no more blessed than him is ever born.\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives:\n" +
                "\n" +
                "Al-Ma'mun al-Abbasi married her daughter, called Umm al-Fadl, to Imam al-Jawad (a) in 202/817-18[8] or 215/830-1.\n" +
                "Other wife of Imam al-Jawad (a) was Samana al-Maghribiyya.\n" +
                "\n" +
                "\n" +
                "Children:\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, Imam al-Jawad (a) had four children with the names, 'Ali (Imam al-Hadi (A)), Musa, Fatima and Amama.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imamate of Imam al-Jawad (A) was contemporary with two Abbasid caliphs: the first was al-Ma'mun (193/808 to 218/833) and Imam spent 23 years of his life at the time of his caliphate.\n" +
                "\n" +
                "The second was al-Mu'tasim al-Abbasi (218/833 to 227/841) two years of his caliphate were contemporary with imamate of Imam al-Jawad (A).\n" +
                "\n" +
                "Imamate of Imam al-Jawad (A) lasted 17 years from 203/818 until 220/835. After the martyrdom of Imam al-Jawad (A), his son, Imam 'Ali ibne Muhammad al-Hadi (A) , took responsibility of imamate.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate in Childhood:\n" +
                "\n" +
                "Imam al-Reza (A) was martyred in 203/818 when his son, Imam al-Jawad (A) was only 8 years old and became Imam and this caused disagreement among Shi'a so that some of them followed 'Abd Allah ibne Musa ibne Ja'far, brother of Imam al-Rida (a); but since they did not want to accept imamate of a person without any reason, some of them asked 'Abd Allah some questions and after they found him unable to answer, they abandoned him. Some other Shi'a joined Waqifids. Nevertheless most of the companions of Imam al-Rida (A) believed in the imamate of Imam al-Jawad (A). According to al-Nawbakhti, the reason of such a division was that they considered the age of puberty as one of the requirements of imamate.\n" +
                "\n" +
                "The issue of imamate in childhood was risen by some people at the time of Imam al-Rida (A), and he mentioned the prophet 'Isa (a) and said, \"when 'Isa (A) was given prophethood his age was lower than my son\".The issue was risen more seriously in after the martyrdom of Imam al-Rida (A) and even some of the close companions of Imam al-Rida (A), like Yunus ibne 'Abd al-Rahman, doubted about the imamate of Imam al-Jawad (A).\n" +
                "\n" +
                "Imam al-Jawad (A) answered to the issue by mentioning the successorship of Prophet Sulayman (A) after Prophet Dawud (A) and said, \"When Prophet Solomon (a) was still a little child and took the sheep out for grazing, Prophet David (a) made him his successor.\"\n" +
                "\n");
        str.add("Many merits and virtues are reported for Imam al-Jawad (A). His superiority in debates and scholarly discussions with scholars in his childhood is among these mentioned virtues. Some of the wonders narrated for him are as follows:\n" +
                "\n" +
                "Some sources considered the title of \"al-Jawad\" (the generous) given to Imam because to his great generosity and giving to people.\n" +
                "\n" +
                "Al-Qarashi introduced Imam al-Jawad (A) the most ascetic and purest of the people of his time. He also spoke about the many nafila prayers Imam al-Jawad (A) performed.\n" +
                "\n" +
                "According to al-Qurashi, Imam al-Jawad (A) made a nafila prayer in every rak'a of which, he recited each of the suras al-Fatiha and al-Tawhid 70 times.\n" +
                "\n");

        str.add("Imam al-Jawad (A) went to Baghdad twice following the request of his two contemporary caliphs.\n" +
                "\n" +
                "The first trip at the time of al-Ma'mun was not long.Al-Mu'tasim, the Abbasid caliph summoned Imam al-Jawad (A) from Medina to Baghdad.\n" +
                "\n" +
                "On Muharram 28, 220/February 1, 835, Imam (a) entered Baghdad and passed away in Dhu l-Qa'da/November of the same year[83] at the age of 25 and was buried beside his grandfather Imam al-Kazim (A) in Kazmain.\n" +
                "\n" +
                "Al-Mu'tasim used one of his ministers and poisoned Imam and martyred him.\n" +
                "\n" +
                "Based on another hadith, al-Mu'tasim sent an orange juice to Imam (A) by his servant (called Ashnas).\n" +
                "Imam (A) said, \"I will drink it at night.\" But, Ashnas insisted that he (A) should drink it as long it is cold and that its ice would melt. So, Imam drink that and was martyred by it.\n" +
                "\n");


        edesc.add(str);

        str=new ArrayList<>();
        str.add("محمد بن علی بن موسی  امام محمد تقی ؑ کے نام سے مشہور شیعوں کے نویں امام ہیں۔ آپ کی کنیت ابو جعفر ثانی ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے نویں امام\n" +
                "\n" +
                "نام:\t\tمحمد بن علی\n" +
                "\n" +
                "کنیت:\t\tابو جعفر ثانی\n" +
                "\n" +
                "القاب:\tتقی، جواد\n" +
                "\t\n" +
                "تاریخ ولادت:\t\t10 رجب 195 ہجری\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t17 سال (203 تا 220ھ)\n" +
                "\n" +
                "شہادت:\t\tسنہ 220 ہجری\n" +
                "\n" +
                "مدفن:\t\tکاظمین، عراق\n" +
                "\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tامام رضا\n" +
                "\n" +
                "والدہ ماجدہ:\t\tسبیکہ خاتون\n" +
                "\n" +
                "ازواج:\t\tسمانہ مغربیہ، ام الفضل بنت مامون\n" +
                "\n" +
                "اولاد:\t\tعلی، موسی، فاطمہ اور امامہ\n" +
                "\n" +
                "عمر:\t\t25 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "آپ کی ولادت سنہر 10 جب  195  ہجری میں مدینہ میں ہوئی  \n" +
                "\n" +
                "آپ نے 17 سال امامت کے فرائض انجام دیئے اور 25 سال کی عمر میں شہید ہوئے۔ شیعہ ائمہ میں آپ سب سے کم عمر شہید امام ہیں۔\n" +
                "\n" +
                "بچپن میں امامت ملنے کی وجہ سے امام رضاؑ کے بعض اصحاب نے آپ کی امامت میں تردید کی جس کے نتیجے میں عبدالله بن موسی کو امام کہنے لگے اور کچھ دیگر افراد نے واقفیہ کی بنیاد ڈالی لیکن اکثر اصحاب نے آپ کی امامت کو قبول کیا۔\n" +
                "\n" +
                "امام محمد تقیؑ کا لوگوں کے ساتھ ارتباط وکالتی سسٹم کے تحت خط و کتابت کے ذریعے رہتا تھا۔ آپ کے زمانے میں اہل حدیث، زیدیہ، واقفیہ اور غلات جیسے فرقے بہت سرگرم تھے اسی بنا پر آپ شیعوں کو ان کے باطل عقائد سے آگاہ کرتے، ان کے پیچھے نماز پڑھنے سے روکتے اور غالیوں پر لعن کرتے تھے۔\n" +
                "\n" +
                "دوسرے مکاتب فکر کے علماء و دانشوروں کے ساتھ مختلف کلامی اور فقہی موضوعات پر آپ کے علمی مناظرے ہوئے جن میں شیخین کی حیثیت، چور کے ہاتھ کاٹنے اور احکام حج کے بارے میں مناظرہ، آپ کے معروف مناظرے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "\n" +
                "پیدائش:\n" +
                "\n" +
                "\n" +
                "مؤرخین کے مطابق آپ کی ولادت سنہ 195 ہجری میں مدینہ میں ہوئی۔ لیکن آپؑ کی ولادت کے دن اور مہینے کے بارے میں اختلاف ہے۔ زيادہ تر منابع نے آپ کی ولادت ماہ رمضان المبارک میں قرار دی ہے۔[3] بعض نے 15 رمضان و بعض نے 19 رمضان نقل کی ہے۔ شیخ طوسی نے مصباح المتہجد میں آپ کی تاریخ ولادت 10 رجب ذکر کی ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "مبارک ترین مولود:\n" +
                "\n" +
                "امام محمد تقی ؑ امام رضاؑ کی عمر کے آخری برسوں میں پیدا ہوئے اور چونکہ آپؑ کی ولادت سے قبل امامؑ کی کوئی اولاد نہ تھی چنانچہ اہل بیتؑ کے مخالفین اپنی مخالفانہ تشہیری مہم جاری رکھتے ہوئے کہتے تھے کہ \"امام رضاؑ سے کوئی نسل موجود نہیں ہے لہذا امامت کا سلسلہ منقطع ہوگا\"، وہ حقیقت میں رسول اللہ(ص) کی اس حدیث کو جھٹلانے کی کوشش کررہے تھے: \"میرے بعد آئمہ کی تعداد بارہ ہے\"؛ کیونکہ اگر امام رضاؑ کی کوئی اولاد نہ ہوتی تو امامت کا سلسلہ عدد 8 پر منقطع ہو جاتا۔ اسی بنا پر جب امام محمد تقی ؑ کو پیدائش کے بعد امامؑ کے پاس لایا گیا تو آپؑ نے فرمایا::هذا المولود الذي لم يولد مولود أعظم بركة على شيعتنا منه۔ ترجمہ: یہ وہ مولود ہے جس سے زیادہ برکت والا مولود ہمارے شیعوں کے لئے اب تک دنیا میں نہیں آیا ہے۔[18]\n" +
                "\n" +
                "ابن اسباط اور عباد بن اسمعیل نیز ابو یحیی صنعانی کہتے ہیں: إنا لعند الرضا عليه السلام بمنى إذ جبئ بأبي جعفر عليه السلام قلنا: هذا المولود المبارك ؟ قال: نعم، هذا المولود الذي لم يولد في الاسلام أعظم بركة منه(ترجمہ: ہم امام رضاؑ کے ساتھ تھے جب ابو جعفر کو ان کے پاس لایا گیا۔ ہم نے عرض کیا: کیا وہ بابرکت مولود یہی ہے؟ فرمایا: ہاں! یہی وہ مولود ہے جس سے زيادہ عظیم برکت والا اسلام میں پیدا نہیں ہوا۔)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ازواج:\n" +
                "\n" +
                "امام جوادؑ کی شادی سنہ 215 میں مامون عباسی کی بیٹی ام فضل سے ہوئی۔[4] یہ شادی مامون کی درخواست پر ہوئی اور امامؑ نے اس کے لئے حضرت زہراءؑ کا مہر ـ یعنی 500 درہم ـ قرار دے کر اس رشتے کو منظور کیا اور اس شادی سے امامؑ کی کوئی اولاد نہیں ہوئی۔[5] اور آپؑ کی تمام اولادیں آپؑ کی دوسری زوجہ مکرمہ سمانہ مغربیہ سے ہوئیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "اولاد:\n" +
                "\n" +
                "شیخ مفید کی روایت کے مطابق امام محمد تقی کی چار اولاد امام علی نقی، موسی مبرقع، فاطمہ و اَمامہ ہیں۔[9] البتہ بعض راویوں نے آپؑ کی بیٹیوں کی تعداد حکیمہ، خدیجہ و ام کلثوم کے نام سے تین بتائی ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                " امامت:\n" +
                "\n" +
                "آپ کی امامت کا زمانہ 17 سال ۔[24] یا 20 دن کم 18 سال[25] یا 19 سال سے 25 دن کم[26] پر مشتمل ہے۔\n" +
                "\n" +
                "اپنے والد کے ساتھ رہنے کی مدت 7 سال[27] یا 7 سال، 4 مہینے، 2 دن[28] یا 9 سال اور چند مہینے[29] ہے۔\n" +
                "\n" +
                "خلفائے عباسی مامون (حکومت 193 تا 218 ق)، معتصم عباسی ہیں [30]، بعض نے واثق[31] کا بھی ذکر کیا ہے۔\n" +
                "\n" +
                "پس ایک قول کی بنا پر آپؑ کا دور امامت دو عباسی خلفاء کے ہم عصر تھا۔ پہلا خلیفہ مامون (حکومت: 193 تا 218 ہجری) تھا اور امامؑ کی عمر کے 23 سال اسی کے دور میں گذرے؛ دوسرا عباسی خلیفہ معتصم تھا اور امامؑ کے عمر کے آخر دو برس اس کے دور میں گذرے۔ امامؑ کا مسکن مدینہ تھا لیکن دو خلفاء کے کہنے پر بغداد کے سفر پر گئے۔ معتصم کے دور میں آپؑ کا بغداد کا سفر آپؑ کی شہادت پر ختم ہوا۔ آپؑ ایک دفعہ مامون کی درخواست پر سنہ 214 (یا 215) ہجری میں بغداد گئے اور وہاں مختصر سا قیام کرنے اور بعض مشہور علماء اور فقہاء کے ساتھ ایک علمی مناظرے میں شرکت اور مامون کی بیٹی سے شادی کرنے کے بعد حج کے ایام میں مدینے واپس چلے گئے؛ لیکن معتصم عباسی کے دور میں جب بغداد گئے تو کچھ عرصے تک وہیں قیام کیا اور درباری علماء و فقہاء و دیگر علما کے ساتھ مختلف موضوعات پر مناظرے کئے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کم سنی کا مسئلہ:\n" +
                "\n" +
                "\n" +
                "امام تقیؑ آٹھ (8) سال کی کمسنی اور طفولیت کے ایام میں رتبۂ امامت پر فائز ہوئے لہذا کچھ لوگوں نے آپؑ کی امامت قبول کرنے سے انکار کیا اور خود جاکر دوسرے شخص کو اپنے لئے معین کیا۔ طفولیت میں امامت کا مسئلہ حل ہونے تک بعض لوگوں کو حیرت اور سرگردانی کا سامنا رہا یہاں تک کہ ان کے لئے یہ مسئلہ حل ہوا اور وہ لوگ آپؑ کی امامت کے معتقد ہوئے۔ یہ مسئلہ ان شبہات میں سے ایک تھا جو امام رضاؑ کی زندگی میں بھی اور امام تقیؑ کی امامت کے دور میں بھی بعض لوگوں نے اٹھایا اور دونوں اماموں نے اس کا جواب قرآن کریم کے حوالے سے دیا۔ ان میں سے ایک جواب یحیی بن زکریاؑ کی نبوت کے سلسلے میں ارشاد باری کے حوالے سے دیا گیا جہاں ارشاد ہوتا ہے: \" وَآتَيْنَاهُ الْحُكْمَ صَبِيّاً (ترجمہ: اور ہم نے اسے بچپن میں ہی فرمان نبوت دیا (اور عقل عطا کی)\n" +
                "\n" +
                "دوسرا جواب ولادت کے پہلے چند دنوں میں حضرت عیسیؑ کے تکلم کرنے سے تعلق رکھتا ہے۔[نیز ارشاد ربانی ہے: \" قَالَ إِنِّي عَبْدُ اللَّهِ آتَانِيَ الْكِتَابَ وَجَعَلَنِي نَبِيّاً وَجَعَلَنِي مُبَارَكاً أَيْنَ مَا كُنتُ وَأَوْصَانِي بِالصَّلَاةِ وَالزَّكَاةِ مَا دُمْتُ حَيّاً (31) وَبَرّاً بِوَالِدَتِي وَلَمْ يَجْعَلْنِي جَبَّاراً شَقِيّاً (32) (ترجمہ: اس نے کہا میں اللہ کا بندہ ہوں، اس نے مجھے کتاب عطا کی ہے اور مجھے نبی بنایا ہے  اور مجھے برکت والا قرار دیا ہے جہاں بھی میں ہوں اور مجھے مامور کیا ہے نماز اور زکوٰة پر، جب تک کہ میں زندہ رہوں اور نیک سلوک رکھنے والا اپنی ماں کے ساتھ اور مجھے اس نے بدنصیب سرکش نہیں بنایا ہے )۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "آپ کی کرامات بہت ہیں اور لوگوں کے سوالات اور کم سنی میں امامت کے حوالے سے شبہات کے جوابات بھی کم نہیں ہیں۔ ہم یہاں کچھ نمونے پیش کرتے ہیں:\n" +
                "\n" +
                "\n" +
                "استجابت دعا:\n" +
                "\n" +
                "داؤد بن قاسم کہتے ہیں: \"ایک دن میں امام جوادؑ کے ہمراہ ایک باغ میں پہنچا اور میں نے عرض کیا: \"میں آپ پر فدا ہوجاؤں! میں مٹی اور گارا کھانے کا بہت شوقین ہوں؛ آپ دعا فرمائیں (تاکہ میں اس عادت سے چھٹکارا پاؤں)۔ آنجناب نے نے جواب نہیں دیا اور چند روز بعد بغیر کسی تمہید کے فرمایا: \"اے ابا ہاشم! خداوند متعال نے مٹی کھانے کی عادت تم سے دور کردی\"۔ ابو ہاشم کہتے ہیں: اس دن کے بعد میرے نزدیک مٹی کھانے سے زیادہ منفور چیز کوئی نہ تھی\"۔[66]\n" +
                "\n" +
                "\n" +
                "درخت پر پھل آ جانا:\n" +
                "\n" +
                "بغداد سے مدینہ واپسی کے وقت بڑی تعداد میں لوگ امام جوادؑ کو وداع کرنے کے لئے شہر سے باہر تک آئے۔ نماز مغرب کے وقت ایک مقام پر پہنچے جہاں ایک پرانی مسجد تھی۔ امامؑ نماز کے لئے مسجد میں داخل ہوئے۔ مسجد کے صحن میں سدر (بیری) کا ایک درخت تھا جس نے اس وقت تک پھل نہیں دیا تھا۔ امامؑ نے پانی منگوایا اور درخت کے پاس بیٹھ کر وضو کیا اور نماز جماعت ادا کی اور نماز کے بعد سجدہ شکر بجالائے اور بعدازاں بغدادیوں سے وداع کرکے مدینہ روانہ ہوئے۔ اس رات کے دوسرے روز اس درخت نے خوب پھل دیا؛ لوگ بہت حیرت زدہ ہوئے۔ مرحوم شیخ مفید کہتے ہیں: \"میں نے برسوں بعد اس درخت کو دیکھا اور اس کا پھل کھایا");
        str.add("\n" +
                "\n" +
                "عباسی خلیفہ معتصم نے امام جوادؑ کو مدینے سے بغداد بلوایا۔ امامؑ 28 محرم الحرام سنہ 220 ہجری کو بغداد پہنچے اور اسی سال ذی قعدہ کے مہینے اسی شہر میں وفات پاگئے۔[68] بعض مآخذ میں ہے کہ آپ پانچ یا چھ ذی الحج کو وفات پاگئے[69] اور بعض مآخذ میں کہا گیا ہے کہ آپؑ ذوالقعدہ کی آخری تاریخ کو شہادت پاگئے۔[70]\n" +
                "\n" +
                "آپؑ کی شہادت کے اسباب کے حوالے سے، مروی ہے کہ بغداد کے قاضی ابن ابی داؤد نے معتصم عباسی کے ہاں چغل خوری کی اور اس سخن چینی کا اصل سبب یہ تھا کہ چور کا ہاتھ کاٹنے کے سلسلے میں امامؑ کی رائے پر عمل ہوا تھا اور یہ بات ابن ابی داؤد اور دیگر درباری فقہاء کی شرمندگی کا باعث ہوئی تھی۔ بہر حال ابن ابی داؤد نے بادشاہ کو شیشی میں اتار دیا تو اس نے قتل امامؑ کا ارادہ کیا جبکہ آپؑ کی عمر 25 سال سے زیادہ نہ تھی۔ معتصم نے اپنی اس نیت کو اپنے ایک وزیر کے توسط سے عملی جامہ پہنایا جس نے امامؑ کو زہر دے کر شہید کردیا۔[71] البتہ بعض دوسروں کی رائے ہے کہ امامؑ کو ام الفضل بنت مامون نے زہر دیا تھا۔[72]\n" +
                "\n" +
                "شیخ مفید (متوفی 413 ہجری) کہتے ہیں: \"اگرچہ بعض لوگوں کی رائے کے مطابق امامؑ کو زہر کھلا کر شہید کئے گئے ہیں لیکن میرے نزدیک یہ ثابت نہیں ہے چنانچہ میں اس سلسلے میں گواہی نہیں دے سکتا\"[73]۔ تاہم مسعودی (متوفی 346ہجری) کا کہنا ہے کہ: \"معتصم عباسی اور ام الفضل کا بھائی جعفر بن مامون مسلسل امامؑ کو زہر دینے کے منصوبے بنا رہے تھے۔ چونکہ ام الفضل کی کوئی اولاد نہ تھی اور امام ہادیؑ امام جوادؑ کی دوسری زوجہ سے تھے۔ جعفر نے اپنی بہن کو اکسایا کہ آپؑ کو زہر دے کر قتل کرے۔ چنانچہ اس نے زہر انگور کے ذریعے امامؑ کو کھلا دیا۔ مسعودی کے بقول ام الفضل امام کو زہر دینے کے بعد پشیمان ہوئی اور رورہی تھی۔ اسی حال میں امامؑ نے اس کو بد دعا دی اور آپؑ کی شہادت کے بعد ام الفضل بہت شدید مرض میں مبتلا ہوئی\n" +
                "\n" +
                "\n");

        udesc.add(str);




        etitleH.add("Imam Ali Naqi (A)");
        utitleH.add("امام علی نقی (ع)");

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Explaining Islamic Teachings");
        str.add("Duas and Ziyarah");
        str.add("Martyrdom");


        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("اسلامی تعلیمات کی وضاحت");
        str.add("دعا اور زیارت");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam10.jpg");

        str=new ArrayList<>();
        str.add("Ali ibne Muḥammad ibne Ali ibne Musa,\n" +
                "known as al-Naqi (the pure) and al-Hadi (the guide).He was the Imam between 220/835 and 254/868 for a period of thirty-four years.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:   Abu l-Hasan\n" +
                "\n" +
                "Born:   Dhu l-Hijja 15, 212/March 10, 828\n" +
                "\n" +
                "Birthplace:   Sarya\n" +
                "\n" +
                "Imamate:    From November 29, 835/Dhu l-Qa'da 30, 220(for 34 years)\n" +
                "\n" +
                "Martyrdom:   Rajab 3, 254/July 2, 868\n" +
                "\n" +
                "Cause of Martyrdom:  By Poisoning\n" +
                "\n" +
                "Burial Place:  Samarra\n" +
                "\n" +
                "Successor:  Al-Hasan b. 'Ali (a)\n" +
                "\n" +
                "Father:  Muhammad b. 'Ali (a)\n" +
                "\n" +
                "Mother:  Samana\n" +
                "\n" +
                "Spouse(s):  Salil\n" +
                "\n" +
                "Son(s):  Al-Hasan, Muhammad, al-Husayn,Jafar\n" +
                "\n" +
                "Daughter(s):  'A'isha\n" +
                "\n" +
                "Titles:  al-Naqi(the pure)\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Many years of the imamate (leadership) of Imam al-Hadi (A) took place in Samarra\n" +
                "under direct surveillance of the rulers of his time. His imamate was contemporary with the rule of some Abbasid caliphs including al-Mutawakkil al-'Abbasi.\n" +
                "\n" +
                "Different hadiths are narrated from Imam al-Hadi (A) about ideological issues, interpretation of the Qur'an, fiqh, and ethics. Al-Ziyarah al-Jami'a al-Kabira which includes Shi'a ideological concepts about the Imams, is narrated from Imam al-Hadi (A).\n" +
                "\n" +
                "Imam al-Hadi (A) was in contact with Shi'a and managed their affairs through the Wikala network. Some of his students and companions are as follows:\n" +
                "'Abd al-'Azim al-Hasani, 'Uthman ibne Sa'id, Ayyub ibne Nuh, al-Hasan ibne Rashid and al-Hasan al-Utrush.\n" +
                "\n" +
                "His shrine is in Samarra. The dome and some minarets of his shrine were destroyed by terrorist attacks in 2006; and again, in 2008 other minarets of the shrine were also destroyed by another bombing. The shrine has been reconstructed from 2010 to 2015 by Iran.\n" +
                "\n" +
                "\n");
        str.add("Birth:\n" +
                "\n" +
                "According to al-Kulayni, al-Shaykh al-Mufid, al-Shaykh al-Tusi and Ibn Athir, Imam al-Hadi's (A) birth was in the middle of Dhu l-Hijja, 212/March 10, 828 in a region called Sarya near Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wife and Children:\n" +
                "\n" +
                "Imam al-Hadi's (A) wife was called Salil.\n" +
                "She was a concubine from Nawba. She\n" +
                "was also the mother of Imam al-'Askari (A)\n" +
                "\n" +
                "Regarding his children, al-Shaykh al-Mufid wrote, \"His successor was Abu Muhammad al-Hasan who was Imam after him, and then there are al-Husayn, Muhammad and a girl named 'A'isha.\" Ibn Shahrashub mentioned another daughter for him called 'Aliyya.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imam al-Hadi (A) became the Imam in 220/835. Since the Shi'a (except a few) had passed the issue of the small age of Imam al-Jawad (A) upon becoming Imam, no obvious doubt was raised about the Imamate of Imam al-Hadi (A).\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, all followers of Imam al-Jawad (A) except a few, accepted the imamate of Imam al-Hadi (A).\n" +
                "\n" +
                "The other few people, for a short period of time believed in the imamate of Musa ibne Muhammad ( 296/909) known as Musa al-Mubarqa' who is buried in Qom; However, after a while, they turned from his imamate and accepted the imamate of Imam al-Hadi (A).\n" +
                "\n" +
                "Sa'd ibne Abd Allah attributed the turning of these people from Musa al-Mubarqa' due to the fact that Musa al-Mubarqa' himself rejected this belief.\n" +
                "\n");
        str.add("Priority of the Qur'an:\n" +
                "\n" +
                "In an extensive treatise narrated by Ibn Shu'ba al-Harrani, Imam al-Hadi (A) strictly insisted on the priority of the Qur'an and mentioned it as an accurate standard for assessment of hadiths and distinguishing authentic ones from inauthentic ones. He oﬃcially declared the Qur'an as the only text that all Islamic groups refer to.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Question of Creation of the Qur'an:\n" +
                "\n" +
                "One of the most important issues of the third/ninth century which kept the Sunni school of thought occupied, was the dispute over the issue of Huduth and Qidam (creation or eternity) of the Qur'an which created divisions and sects among them.\n" +
                "\n" +
                "The Shi'a kept silent following the instructions of Imams (a) over this issue. In a letter, Imam al-Hadi (a) ordered one of the Shi'a not to give opinion over this issue and not to display any bias with either of the opinions regarding creation or eternity of the Qur'an.\n" +
                "\n" +
                "This helped the Shi'a not to become engaged in such fruitless arguments.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ilm al-Kalam (Theology):\n" +
                "\n" +
                "Discussions of Hisham ibne al-Hakam and Hisham ibne Salim on Tashbih and Tanzih caused disagreements among the Shi'a and Imams (A) frequently encountered questions in relation to these topics.\n" +
                "\n" +
                "Consequently, more than twenty one narrations are reported from Imam al-Hadi (A) about Tanzih, some of which are very comprehensive and they all indicate that Imam (A) approved of Tanzih.\n" +
                "\n" +
                "Regarding the Imams' (A) opinions about predestination and free will, there is a comprehensive treatise available from Imam al-Hadi (A).\n" +
                "\n" +
                "In this treatise, Shi'a theological principles regarding predestination and free will, are explained according to the Qur'an and the interpretation of the hadith, \"La jabr wa la tafwid bal amrun bayn al-amrayn,\" (there is no predestination or free will, but the matter is between the two issues) narrated from Imam al-Sadiq (A).\n" +
                "\n" +
                "\n");
        str.add("Imam al-Hadi (A) made great efforts in educating and familiarizing Shi'a Muslims with Shi'a teachings through Du'a and Ziyarah.\n" +
                "\n" +
                "\n" +
                "Al-Ziyarah al-Jami'a al-Kabira:\n" +
                "\n" +
                "This Ziyarah is a wonderful course of Shi'a teachings and introduces the position of the Ahl al-Bayt (A) which was initiated by Imam al-Hadi (A) following the requests of the Shi'a.\n");
        str.add("\n" +
                "According to some reports, Al-Mu'tazz al-'Abbasi poisoned Imam al-Hadi (a) and\n" +
                "martyred him.\n" +
                "\n" +
                "In the funeral of Imam al-Hadi (A), people slapped themselves and scratched their faces. They took Imam's body out of his house and placed him in front of the house of Musa ibne Bagha (the commander of Abbasids army).\n" +
                "\n" +
                "When al-Mu'tazz al-'Abbasi saw them, he decided to do the Funeral Prayer on Imam's (A) body. He then ordered that the people place the body on the ground and he prayed before Imam's (A) body, even though Imam al-Hasan al-'Askari (A) and some Shi'a previously had prayed by the Imam's (a) body before the funeral.\n" +
                "\n" +
                "Afterwards, they buried Imam (A) in one of the houses in which he was imprisoned. It was such a large crowd, that Imam al-'Askari (A) moved in the crowd with great diﬃculty. Then, a young man brought a horse for Imam (A) and people accompanied him to his house.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        edesc.add(str);

        str=new ArrayList<>();
        str.add("علی بن محمد ، امام علی نقی ؑ کے نام سے مشہور، نویں امام امام محمد تقیؑ کے فرزند اور شیعوں کے دسویں امام ہیں۔ آپؑ سنہ 220 سے 254 ہجری یعنی 34 برس تک امامت کے منصب پر فائز رہے۔ دوران امامت آپ کی زندگی کے اکثر ایام سامرا میں عباسی حکمرانوں کے زیر نگرانی گزرے ہیں۔ آپؑ متعدد عباسی حکمرانوں کے ہم عصر تھے جن میں اہم ترین متوکل عباسی تھا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے دسویں امام\n" +
                "\n" +
                "نام:\t\tعلی بن محمد\n" +
                "\n" +
                "کنیت:\t\tابوالحسن (ثالث)\n" +
                "\n" +
                "القاب:\t\tنجیب، مرتضی، ہادی، نقی، عالم، فقیہ، امین، طیّب\n" +
                "\n" +
                "تاریخ ولادت: \t15 ذوالحجہ ، سال 212  ھ\n" +
                "\n" +
                "جائے ولادت:\t\tصریا، مدینہ\n" +
                "\n" +
                "مدت امامت:\t\t33 سال (220 تا 254ھ)\n" +
                "\n" +
                ":شہادت\t\t3 رجب، 254ھ\n" +
                "\n" +
                "مدفن:\t\tسامرا، عراق\n" +
                "\n" +
                "رہائش:\t\tمدینہ\n" +
                "\n" +
                "والد ماجد:\t\tمحمد بن علی\n" +
                "\n" +
                "والدہ ماجدہ:\t\tسمانہ مغربیہ\n" +
                "\n" +
                "ازواج:\t\tحدیث\n" +
                "\n" +
                "اولاد:\t\tحسن، محمد، حسین، جعفر\n" +
                "\n" +
                "عمر:\t\t42 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "عقائد، تفسیر، فقہ اور اخلاق کے متعدد موضوعات پر آپؑ سے کئی احادیث منقول ہیں۔ آپ سے منقول احادیث کا زیادہ حصہ اہم کلامی موضوعات پر مشتمل ہیں من جملہ ان موضوعات میں تشبیہ و تنبیہ اور جبر و اختیار وغیرہ شامل ہیں۔ زیارت جامعۂ کبیرہ جو حقیقت میں امامت سے متعلق شیعہ عقائد کے عمدہ مسائل اور امام شناسی کا ایک مکمل دورہ ہے، آپؑ ہی کی یادگار ہے\n" +
                "\n" +
                "امامت کے دوران مختلف علاقوں میں وکلاء تعیین کر کے اپنے پیروکاوں سے رابطے میں رہے اور انہی وکلاء کے ذریعے شیعوں کے مسائل کو بھی حل و فصل کیا کرتے تھے۔ آپؑ کے شاگردوں میں عبد العظیم حسنی، عثمان بن سعید، ایوب بن نوح، حسن بن راشد اور حسن بن علی ناصر شامل ہیں۔\n" +
                "\n" +
                "آپ کا روضہ سامرا میں حرم عسکریین کے نام سے مشہور ہے۔ سنہ 2006 اور 2007 ء میں مختلف دہشت گردانہ حملوں میں اسے تباہ کیا گیا تھا جسے بعد میں پہلے سے بہتر انداز میں تعمیر کیا گیا ہے۔\n" +
                "\n");
        str.add("\n" +
                ":ولادت\n" +
                "کلینی، شیخ مفید، اور شیخ طوسی نیز ابن اثیر کے بقول امام ہادیؑ 15 ذوالحجہ سنہ 212 ہجری کو مدینہ کے قریب صریا نامی علاقے میں پیدا ہوئے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                ":زوجہ اور اولاد\n" +
                "\n" +
                "امام ہادی علیہ السلام کی زوجہ \n" +
                "مکرمہ کا نام سلیل خاتون تھا؛ وہ ام ولد تھیں اور ان کا تعلق \"نوبہ\" ۔[16] سے تھا اور وہی امام حسن عسکری علیہ السلام کی والدہ ماجدہ ہیں۔\n" +
                "\n" +
                "\n" +
                "شیخ مفید آپ کے فرزندوں کے بارے میں لکھتے ہیں: امام ہادیؑ کے جانشین حضرت ابو محمد حسن ہیں جو آپؑ کے بعد گیارہویں امام ہیں، اور حسین، محمد اور جعفر اور ایک بیٹی بنام عائشہ،[18] جبکہ ابن شہرآشوب کا کہنا ہے کہ آپؑ کی دوسری بیٹی کا نام علیہ ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                ":امامت\n" +
                "امام ہادیؑ سنہ 220 ہجری میں اپنے والد امام جوادؑ کی شہادت کے بعد منصب امامت پر فائز ہوئے۔ ظاہر ہے کہ امام کی کمسنی کا مسئلہ امام جوادؑ کی امامت کے آغاز پر حل ہوچکا تھا چنانچہ اکابرین شیعہ کے لئے امامت کے وقت یہ مسئلہ حل شدہ تھا اور کسی کو کوئی شک و تردد پیش نہ آیا۔ شیخ مفید کے بقول[21] چند معدودافراد کے سوا امام جوادؑ کے پیروکاروں نے امام ہادیؑ کی امامت کو تسلیم کیا۔ متذکرہ معدود افراد کچھ عرصے کے لئے قم میں مدفون موسی بن محمد (متوفی  296ہجری ) المعروف بہ موسی مبرقع کی امامت کے قائل ہوئے؛ لیکن کچھ عرصہ بعد ان کی امامت کے عقیدے سے پلٹ گئے اور انھوں نے امام ہادیؑ کی امامت کو قبول کیا۔[22]   سعد بن عبد اللہ کہتے ہیں: یہ افراد اس لئے امام ہادیؑ کی امامت کی طرف پلٹ آئے کہ موسی مبرقع نے ان سے بیزاری اور برائت کا اظہار کیا اور انہیں بھگا دیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                ":قرآن کی بنیادی حیثیت\n" +
                "\n" +
                "امام ہادیؑ نے ایک مفصل رسالہ لکھا جس میں آپؑ نے قرآن کی بنیادی حیثیت پر زور دیا اور قرآن ہی کو روایات کی کسوٹی اور صحیح اور غیر صحیح کی تشخیص کا معیار قرار دیا۔قرآن کو ایک باضابطہ طور ایک ایسا متن قرار دیا کہ تمام اسلامی مکاتب فکر اس کی طرف رجوع کرتے ہیں۔ یہ رسالہ ابن شعبہ حرانی نے نقل کیا ہے۔\n" +
                "\n" +
                "\n" +
                ":امامؑ اور خلق قرآن کا مسئلہ\n" +
                "\n" +
                "تیسری صدی ہجری کے آغاز میں حدوث و قِدَمِ قرآن کی بحث نے عالم تسنن کو اپنی طرف متوجہ کیا ۔ یہ بحث خود اہل تسنن میں فرقوں اور گروہوں کے معرض وجود میں آنے کا سبب بنی۔\n" +
                "\n" +
                "شیعیان اہل بیتؑ نے آئمہؑ کے فرمان کے مطابق خاموشی اختیار کرلی۔ امام ہادیؑ نے ایک شیعہ عالم کے خط کا جواب دیتے ہوئے فرمایا: اس سلسلے میں اظہار خیال نہ کرو اور حدوث و قِدَمِ قرآن میں کسی فریق کی جانبداری نہ کرو۔[48]\n" +
                "\n" +
                "امام ہادیؑ کے اس مؤقف کی بنا پر ہی شیعہ اس لاحاصل بحث میں الجھنے سے محفوظ رہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                ":علم کلام\n" +
                "\n" +
                "تشبیہ اور تنزیہ کی بحث میں ہشام بن حکم اور ہشام بن سالم کا موقف اور کلام شیعیان اہل بیتؑ کے درمیان اختلاف کا سبب بنااورآئمہؑ کو مسلسل اس قسم کے سوالات کا سامنا کرنا پڑتا تھا۔\n" +
                "\n" +
                "اس سلسلے میں امام ہادیؑ سے 21 حدیثیں نقل ہوئی ہیں جن میں سے بعض مفصل ہیں اور وہ سب اس حقیقت کی ترجمان ہیں کہ امامؑ تنزیہ کے مؤقف کی تائید کرتے تھے۔[50]\n" +
                "\n" +
                "جبر و اختیار کے مسئلے میں بھی ایک مفصل رسالہ امام ہادیؑ کے علمی ورثے کے طور پر موجود ہے۔ اس رسالے میں قرآن کریم کی آیات کو بنیاد بنایا گیا ہے اور امام صادقؑ سے منقولہ حدیث \"لا جبر ولا تفویض بل امر بین الامرین\" کی تحلیل و تشریح کی گئی ہے اور مسئلۂ جبر و تفویض کے سلسلے میں شیعہ کلامی اصولوں کو بیان کیا گیا ہے۔");
        str.add("\n" +
                "دعا اور زیارت امام علی نقی ؑ کا ایک ایسا نمایاں کارنامہ ہے جس نے شیعیان اہل بیتؑ کی تربیت اور انہیں شیعہ معارف و تعلیمات سے روشناس کرنے میں اہم کردار ادا کیا ہے\n" +
                "\n" +
                "\n" +
                ":زیارت جامعۂ کبیرہ\n" +
                "\n" +
                "زیارت جامعۂ کبیرہ آئمہ معصومینؑ کا اہم ترین اور کامل ترین زیارت نامہ ہے جس کے ذریعے ان سب کی دور یا نزدیک سے زیارت کی جا سکتی ہے۔\n" +
                "\n" +
                "یہ زیارت نامہ شیعیان اہل بیتؑ کی درخواست پر امام ہادیؑ کی طرف سے صادر ہوا\n" +
                "\n");
        str.add("\n" +
                "معتز کے حکم پر معتمد عباسی نے آپ کو مسموم کرکے شہید کیا");

        udesc.add(str);





        etitleH.add("Imam Hasan Askari (A)");
        utitleH.add("امام حسن عسکری (ع)");





        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Explanation of Islamic Teachings");
        str.add("Martyrdom");

        etitle.add(str);


        str=new ArrayList<>();

        str.add("مختصر سوانح حیات");
        str.add("زندگی");
        str.add("اسلامی تعلیمات کی وضاحت");
        str.add("شہادت");

        utitle.add(str);

        img.add("imam10.jpg");


        str=new ArrayList<>();

        str.add("Hasan ibne Ali ibne Muhammad ibne Ali was the 11th Imam of Twelver Shi'a and the father of Imam al-Mahdi (a).\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym  Abu Muhammad\n" +
                "\n" +
                "Born   Rabi' II 8, 232/December 2, 846\n" +
                "\n" +
                "Birthplace  Medina\n" +
                "\n" +
                "Imamate:    From Rajab 3, 254/June 28, 868(for 6 years)\n" +
                "\n" +
                "Martyrdom: Rabi' I 8, 260/January 1, 874 in Samarra\n" +
                "\n" +
                "Cause of Martyrdom:    By poisoning\n" +
                "\n" +
                "Successor:    Muhammad b. al-Mahdi (a)\n" +
                "\n" +
                "Father:    Ali b. Muhammad (a)\n" +
                "\n" +
                "Mother:   Hudayth\n" +
                "\n" +
                "Brother(s):   Muhammad, al-Husayn, Ja'far\n" +
                "\n" +
                "Spouse(s):   Narjis\n" +
                "\n" +
                "Titles:   Ibn al-Rida,al-Hadi, al-Naqi\n" +
                "\n" +
                "He was given the title, Imam al-Askari, because he was forced to reside in Samarra which was also known as \"Askar\" (a military camp or town). His other titles include Ibn al-Rida,al-Hadi, al-Naqi, al-Zaki, al-Rafiq and al-Samit.\n" +
                "\n" +
                "Severe restrictions on Imam al-Askari's (a) life made him choose agents to communicate with the Shi'a. Uthman b. Sa'id was one of his special agents who became the first special deputy of Imam al-Mahdi (a) upon the beginning of his occultation after Imam al-Askari (a) was martyred.\n" +
                "\n" +
                "Imam al-'Askari (a) was martyred on the 8th of Rabi I, 260/874. He was buried in the same house where his father had been buried. The holy shrine of al-'Askariyyayn was attacked and destroyed two times by terrorists.\n" +
                "\n" +
                "Many hadiths have been narrated from Imam al-Askari (a) on different topics such\n" +
                "as exegesis of the Qur'an, ethics, jurisprudence, theology, supplications, and Ziyarahs.\n");
        str.add("\n" +
                "Birth:\n" +
                "\n" +
                "According to the majority of sources, he was born in Medina,[15] but other sources suggest that he was born in Samarra.[16] And according to the majority of early Imami sources, he was born in Rabi' II, 232\n" +
                "(December 846).[17]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wife and Children:\n" +
                "\n" +
                "According to the famous report, Imam al-Askari (a) never married and his lineage\n" +
                "continued only through a concubine who was the mother of Imam al-Mahdi (a).[30]\n" +
                "\n" +
                "Different sources have mentioned the name of the mother of Imam al-Mahdi (a) differently.\n" +
                "\n" +
                "Acording to the majority of shi'a sources the only child of Imam al-Askari (a) is Imam al-Mahdi (a) named \"Muhammad\".[33]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Living in Samarra:\n" +
                "\n" +
                "Imam al-Hasan al-Askari (a) was brought to Samarra with his father in 233/847 when he was one year old and lived there until the end of his life.[40]\n" +
                "\n" +
                "Imam al-Hasan al-Askari (a) lived most of his life in Samara and it is famously said\n" +
                "that he (a) was the only Imam who did not go to hajj; however, in Uyun akhbar al-Rida\n" +
                "and Kashf al-ghumma, there is a hadith, the narrator of which says that he heard\n" +
                "that hadith from Imam al-Askari (a) in Mecca.[41]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imam's (a) Representatives:\n" +
                "\n" +
                "Strict limitations of the caliphs on the life of Imam (a) made him benefit from agents to communicate with Shi'a, among whom was 'Aqid, the special servant of Imam (a) who was raised by Imam (a) and delivered many of his letters to Shi'a.[56] Another agent was a person whose kunya was Gharib Abu al-Adyan who was another servant of Imam (a) and delivered some of the letters.[57] However, Uthman b. Sa'id was a particular person in some Twelver Shi'a sources who was called Bab (representative and the connection with Imam (a). Upon entering the age of Minor Occultation after Imam al-'Askari (a) was martyred, 'Uthman b. Sa'id became the first special deputy of Imam al-Mahdi (a).[58]\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "Shi'a Teachings:\n" +
                "\n" +
                "According to complexities and ambiguities about the new Imam (a) at that time, it can be seen in the speeches and letters of Imam al-Askari (a) that he mentioned, the earth will not be void of God's Proof[61] and that if Imamate is cut, there will be problems in the affairs of God on earth.[62] He (a) also said that God's Proof on earth is a blessing God has granted to the believers and has honored them with this guidance.[63]\n" +
                "\n" +
                "Another teaching, repeatedly seen in the speeches of Imam (a) due to the pressures on Shi'a, is calling them to patience and believing in relief and waiting for it.[64] Also, in hadiths from him, there is an especial emphasis on respecting internal relations of Shi'a society and associating with religious brothers.[65]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Interpretation of the Qur'an:\n" +
                "\n" +
                "Interpreting the Qur'an was among the activities Imam al-Hasan al-'Askari (a)\n" +
                "cared about so much that an extensive text on the interpretation of the Qur'an (among the oldest exegetical heritage of Shi'a) is attributed to him. Even if this attribution is not correct, it should be noted that Imam's (a) emphasis on exegetical discussions made the grounds for this attribution.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Theology and Beliefs:\n" +
                "\n" +
                "Imam al-Hasan al-Askari (a) took the leadership of Shi'a when some ideological problems had emerged among Twelver Shi'a decades prior to his time and some emerged at his time. For example, one of\n" +
                "the topics of discussions was \"rejection of the embodiment of God\" which was mentioned since some years ago and there were some disagreements between Hisham b. Hakam and Hisham b. Salim, two distinguished companions of Imams\n" +
                "(a). At the time of Imam al-'Askari (a), this disagreement became so serious that Sahl b. Ziyad al-Adami wrote a letter to Imam al-Hasan al-'Askari (a) and asked him for a guidance.\n" +
                "\n" +
                "Imam al-'Askari (a) prohibited them from going deep in discussions about the essence of God, mentioned some verses of the Qur'an and said: \"God is One and Unique; begets not, nor was He begotten and nothing is similar to Him. He is the Creator and not created. Whatever He wants of things or else creates and is not embodied… Nothing is similar to Him and He is Hearing and Seeing.\"[66]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Jurisprudence:\n" +
                "\n" +
                "In hadith studies, one of the titles mentioned for Imam al-Hasan al-'Askari (a) is \"faqih\",[67] with which he (a) was especially known to his companions. Some of his hadiths are about jurisprudence and its different branches. Since organization of religion regarding jurisprudence was made previously at the time of Imam al-Sadiq (a) and was then developed toward its perfection, Imam al-Hasan al-'Askari (a) mostly discussed about secondary issues which came up or were for some reason critical at his time such as the beginning of the month of Ramadan and the discussions about Khums.[68]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "Imam al-Askari was martyred on Rabi' I 8, 260/January 1, 874 during the reign of Mu'tamid al-Abbasi at the age of 28.[22]\n" +
                "\n" +
                "There are accounts of his martyrdom in Rabi' II and Jumada I as well.[23] According to al-Tabrisi in I'lam al-wara, many Imami scholars maintain that Imam al-Askari was martyred by poisoning. They appeal to the hadith, \"I swear to God that there is none of us (i.e. the Imams) who is not murdered and martyred.\"[24] Some historical reports imply that the two caliphs before al-Mu'tamid were also seeking to murder the Imam. According to a hadith, al-Mu'tazz al-'Abbasi ordered his personal security guard to murder the Imam on his way to Kufa, but the plan failed because it was leaked to people.[25] According to another report, Muhtadi al-Abbasi also decided to martyr the Imam in the prison, but the plan failed because his reign was over.[26] Imam al-Askari is buried in his own house in Samarra, where Imam al-Hadi had also been buried.[27] According to Abd Allah b. Khaqan (one of al-Mu'tamid al-Abbasi's viziers),[28] when Imam al-Askari was martyred, bazars were shut down, and Banu Hashim, prominent figures, statesmen, and other people attended his funeral.[29]\n" +
                "\n");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("حسن بن علی بن محمد، امام حسن عسکریؑ کے نام سے مشہور شیعوں کے گیارہویں امام ہیں۔ آپ امام علی نقیؑ کے فرزند ارجمند اور امام مہدیؑ کے والد گرامی ہیں۔                                                                                                                                   \n" +
                "              \n" +
                "\n" +
                "منصب:\t\tشیعوں کے گیارہویں امام\n" +
                "\n" +
                "نام:\t\tحسن بن علی\n" +
                "\n" +
                "کنیت:\t\tابو محمد\n" +
                "\n" +
                "القاب:\t\tصامت، ہادی، رفیق، زکی، نقی\n" +
                "\n" +
                "تاریخ ولادت:\t\t10 ربیع الثانی سنہ 232ھ\n" +
                "\n" +
                "جائے ولادت:\t\tمدینہ\n" +
                "\n" +
                "مدت امامت:\t\t6 سال (254 تا 260ھ)\n" +
                "\n" +
                "شہادت:\t\t8 ربیع الاول، سنہ 260ھ\n" +
                "\n" +
                "مدفن:\t\tسامرا، عراق\n" +
                "\n" +
                "رہائش:\t\tسامرا\n" +
                "\n" +
                "والد ماجد:\t\tامام علی نقی\n" +
                "\n" +
                "والدہ ماجدہ:\t\tسلیل یا حدیثہ یا سوسن\n" +
                "\n" +
                "ازواج:\t\tنرجس خاتون\n" +
                "\n" +
                "اولاد:\t\tامام مہدی\n" +
                "\n" +
                "عمر:\t\t28 سال\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " آپ کا مشہور لقب عسکری ہے جو حکومت وقت کی طرف سے آپ کو شہر سامراء جو اس وقت فوجی چھاونی کی حیثیت رکھتا تھا، میں زندگی بسر کرنے پر مجبور کیے جانے کی طرف اشارہ ہے۔ آپ کے دوسرے القاب میں ابن\u200C الرضا، ہادی، نقی، زکی، رفیق اور صامت مشہور ہیں۔ حکومت وقت کی کڑی نگرانی کی وجہ سے اپنے پیرکاروں سے رابطہ برقرار رکھنے کی خاطر آپ نے مختلف شہروں میں نمائندے مقرر کئے اور وکالت سسٹم کے تحت اپنے نمایندوں سے رابطے میں رہے۔ عثمان بن سعید آپ کے خاص نمائندوں میں سے تھے جو آپؑ کی وفات کے بعد غیبت صغریٰ کی ابتدا میں امام زمانہ(عج) کے پہلے نائب خاص بھی رہے ہیں۔\n" +
                "\n" +
                "امام حسن عسکری 8 ربیع الاول سنہ 260 ھ کو 28 سال کی عمر میں سامرا میں شہید ہوئے اور اپنے والد محترم امام علی نقیؑ کے جوار میں دفن ہوئے۔ ان دونوں اماموںؑ کا مدفن حرم عسکریین سے مشہور ہے اور عراق میں شیعہ زیارتگاہوں میں سے ایک ہے۔ یہ حرم دو مرتبہ دہشت گردوں کے ہاتھوں مسمار ہوا۔ پہلا حملہ 22 فروری 2006 ء کو ہوا جبکہ دوسرا حملہ اس کے 16 مہینے بعد یعنی 13 مئی 2007ء کو کیا گیا۔\n" +
                "\n" +
                "تفسیر قرآن، اخلاق، فقہ، اعتقادات، ادعیہ، زیارت جیسے مختلف موضوعات پر امام حسن عسکریؑ سے احادیث نقل ہوئی ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "معتبر منابع کے مطابق آپ مدینہ میں پیدا ہوئے۔[14]بعض نے آپ کی جائے پیدائش سامرا ذکر کی ہے۔ [15] کلینی اور اکثر متقدم امامی منابع آپ کی ولادت ربیع الثانی ۲۳۲ھ [16] شمار کرتے ہیں۔\n" +
                "\n" +
                "\n" +
                "ازواج اور اولاد:\n" +
                "\n" +
                "مشہور رپورٹ کے مطابق ، امام الاسکری (ع) نے کبھی شادی نہیں کی اور اس کا نسب\n" +
                "صرف ایک محافظ کے ذریعہ جاری رہا جو امام مہدی (ع) کی والدہ تھیں۔ []]]\n" +
                "\n" +
                "مختلف ذرائع نے امام مہدی (ع) کی والدہ کے نام کا تذکرہ مختلف طور پر کیا ہے۔\n" +
                "\n" +
                "شیعہ وسائل کی اکثریت کے مطابق امام السکری (ع) کا اکلوتا بچہ امام المہدی (ع) ہے جس کا نام \"محمد\" ہے۔ [] 33]\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "سامرا آمد:\n" +
                "\n" +
                "بچپنے میں ہی امام حسن عسکری، اپنے والد گرامی امام ہادی کے ساتھ جبری طور پر عراق طلب کر لئے گئے اس زمانے میں عباسیوں کا دارالحکومت سامرا تھا یہاں آپ کو تحت نظر رکھا گیا ۔بعض کتابوں میں 236 ھ کو اور [41] اور بعض میں ۲۳۳ ھ کو اس سفر کا سال قرار دیا ہے۔[42] مذکور ہے۔ امام حسن عسکری نے اپنی اکثر عمر سامرا میں گزاری اور مشہور ہے کہ صرف آپ ہی وہ امام ہیں جو حج پہ نہیں گئے، لیکن عیون اخبار الرضا اور کشف الغمہ میں راوی نے آپ سے ایک حدیث نقل کی ہے اور وہ انہوں نے مکہ میں امام سے سنی ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "امام کے نمائندے:\n" +
                "\n" +
                "حاکم کی طرف سے شدید محدودیت کی وجہ سے امامؑ نے اپنے شیعوں سے رابطہ رکھنے کے لئے کچھ نمائندوں کا انتخاب کیا ان افراد میں ایک آپ کا خاص خادم عقید تھا جس کو بچپن سے ہی آپ نے پالا تھا، اور آپ کے بہت سے خطوط کو آپ کے شیعوں تک پہنچاتا تھا[64]۔ اسی طرح آپکے خادم جس کی کنیت ابو الادیان تھی اس کے ذمےبعض خطوط پہنچانا تھا[65]۔ لیکن جو امامیہ منابع میں باب کے عنوان سے (امام کا رابط اور نمائندہ) پہنچانا جاتا تھا وہ عثمان بن سعید ہے اور یہی عثمان بن سعید امام حسن عسکریؑ کی وفات کے بعد اور غیبت صغریٰ کے شروع کے دور میں پہلے باب کے عنوان سے یا دوسرے لفظوں میں سفیر، وکیل اور امام زمان(عج) کے خاص نائب میں سے تھا۔\n");
        str.add("\n" +
                "شیعہ تعلیمات:\n" +
                "\n" +
                "آخری آئمہ کے زمانے میں امامت سے مربوط ابہامات اور پیچیدگوں کے پیش نظر ہم دیکھتے ہیں کہ امام حسن عسکری ؑکے اقوال اور خطوط میں اس کے متعلق ارشادات کا مشاہدہ کرتے ہیں جیسے زمین حجت خدا سے خالی نہیں رہے گی ۔[69] اگر امامت کا سلسلہ منقطع ہوجائے اور اس کا تسلسل ٹوٹ جائے تو خدا کے امور میں خلل واقع ہو جائے گا ۔[70] زمین پر خدا کی حجت ایسی نعمت ہے جو خدا نے مؤمنوں کو عطا کی ہے اور اس کے ذریعے ان کی ہدایت کرتا ہے ۔[71]\n" +
                "\n" +
                "اس زمانے کی ایک اور دینی تعلیم کہ جس کی وجہ سے شیعہ تحت فشار رہے وہ مومنین کو آپس میں صبر کی تلقین انتظار فرج کا پیغام ہے جو امام کے ارشادات میں زیادہ بیان ہوا ہے ۔[72]اسی طرح آپ کی احادیث میں شیعوں کے درمیان باہمی منظم ارتباط اور باہمی بھائی چارے کی فضا کے قیام کے بارے میں بیشتر تاکید ملاحظہ کی جا سکتی ہے۔[73]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تفسیر قرآن:\n" +
                "\n" +
                "امام حسن عسکری ؑ کے مورد توجہ قرار پانے والی چیزوں میں سے ایک تفسیر قرآن کا عنوان ہے ۔تفسیر قرآن کا ایک مکمل اور تفصیلی متن امام حسن عسکری(تفسیر امام حسن عسکری) سے منسوب ہے کہ جو امامیہ کے قدیمی آثار میں شمار ہوتا ہے ۔ یہاں تک کہ امام کی طرف اس کتاب کی نسبت درست نہ ہونے کی صورت میں بھی اس بات کی طرف توجہ کرنی چاہئے کہ تفسیری ابحاث کی نسبت امام حسن عسکریؑ کی شہرت نے اس کتاب کے امام کی طرف منسوب ہونے کے مقدمات فراہم کئے ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کلام اور عقائد:\n" +
                "\n" +
                "ایسے حالات میں امامیہ کی رہبری اور امامت حضرت امام حسن عسکری ؑ کے ہاتھ آئی جب امامیہ کی صفوں میں بعض ایسی اعتقادی مشکلات موجود تھیں جن میں سے کچھ تو چند دہائیاں پہلے اور کچھ آپ کے زمانے میں پیدا ہوئیں۔ان اعتقادی مسائل میں سے خدا کی جسمیت کی نفی ایک مسئلہ تھا کہ جو کافی سال پہلے پیدا ہوا تھا اور ممتاز ترین اصحاب ہشام بن حکم اور ہشام بن سالم کے درمیان اس کی وجہ سے اختلافات پائے جاتے تھے ۔امام حسن عسکری کے زمانے میں اس مسئلے نے اتنی شدت اختیار کی کہ سہل بن زیاد آدمی نے امام کو خط لکھ کر آپ سے راہنمائی حاصل کرنے کی درخواست کی۔\n" +
                "\n" +
                "امام نے اسے جواب دیتے ہوئے ابتدائی طور پر اللہ کی ذات کے متعلق بحث کرنے سے پرہیز کرنے کا کہا پھر قرآنی آیات سے اس مسئلہ کی جانب ہوں اشارہ فرمایا کہ قرآن میں اس طرح آیا ہے :\n" +
                "\n" +
                "اللہ واحد و یکتا ہے، وہ نہ تو کسی سے پیدا ہوا اور نہ کوئی اس سے پیدا ہوا ہے۔ اسکا کوئی نظیر و ہمتا نہیں ہے ۔وہ پیدا کرنے والا ہے پیدا ہونے والا نہیں ہے ۔ جسم اور غیر جسم سے جسے چاہے خلق کرسکتا ہے ۔وہ خود جسم و جسمانیت سے مبرا ہے۔۔۔۔کوئی چیز اس کے مشابہ نہیں ہے وہ بصیر اور سمیع ہے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "فقہ:\n" +
                "\n" +
                "علم حدیث میں آپ کو فقیہ کے نام سے یاد کیا گیا ہے ۔[75] اس سے ظاہر ہوتا ہے کہ آپ اپنے اصحاب کے درمیان اس لقب سے خصوصی طور پر پہچانے جاتے تھے ۔اسی بنیاد پر فقہ کے بعض ابواب میں آپ سے احادیث منقول ہیں۔ البتہ امامیہ مذہب کی فقہ کا بیشترین حصہ حضرت امام جعفر صادق ؑ سے ترتیب شدہ ہے اور اس کے بعد فقہ نے اپنے تکمیلی مراحل طے کئے ہیں لہذا امام حسن عسکری کی زیادہ تر احادیث ان فروعی مسائل کے بارے میں ہیں جو اس دور میں نئے پیدا ہوئے تھے یا ان مسائل کے بارے میں ہیں جو انکے زمانے میں چیلنج کے طور پر پیش ہوئے ۔مثال کے طور پر رمضان کے آغاز کا مسئلہ اور خمس کی بحث\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        str.add("\n" +
                "مشہور قول کے مطابق امام عسکریؑ ربیع الاول سنہ۲۶۰ ھ کے شروع میں معتمد عباسی کے ہاتھوں 28 سال کی عمر میں مسموم ہوئے اور اسی مہینے کی 8 تاریخ کو 28 سال کی عمر میں سرّ من رأی (سامرا) میں جام شہادت نوش کرگئے۔[22] البتہ ربیع الثانی اور جمادی الاولی میں شہید ہونے کے بارے میں بھی بعض روایات ملتی ہیں۔[23] طبرسی نے اعلام الوری میں لکھا ہے کہ اکثر امامیہ علما نے کہا ہے کہ امام عسکری زہر سے مسموم ہوئے اور اس کی دلیل امام صادقؑ کی ایک روایت ہے جس میں آپؑ فرماتے ہیں «و الله ما منّا الا مقتول شہيد».[24] بعض تاریخی گزارشات کے مطابق یہ سمجھ میں آتا ہے کہ معتمد سے پہلے کے دو خلیفے بھی امام عسکریؑ کو قتل کرنے کے درپے تھے۔ ایک روایت میں مذکور ہے کہ معتز عباسی نے حاجب کو حکم دیا کہ وہ امامؑ کو کوفہ کے راستے میں قتل کرے لیکن لوگوں کو جب پتہ چلا تو یہ سازش ناکام ہوئی۔[25] ایک اور گزارش کے مطابق مہتدی عباسی نے بھی امام کو زندان میں شہید کرنے کا سوچا لیکن انجام دینے سے پہلے اس کی حکومت ختم ہوئی۔[26] امام عسکریؑ سامرا میں جس گھر میں اپنے والد ماجد امام علی نقی علیہ السلام دفن ہوئے تھے ان کے پہلو میں دفن ہوئے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        udesc.add(str);





        etitleH.add("Imam Mahdi (atfs)");
        utitleH.add("امام مہدی (ع)");

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Mother");
        str.add("Birth");
        str.add("Occultation");


        etitle.add(str);

        str=new ArrayList<>();
        str.add("مختصر سوانح حیات");
        str.add("والدہ ماجدہ");
        str.add("پیدائش");
        str.add("غیبت");

        utitle.add(str);

        img.add("jamkaran_a.jpg");

        str=new ArrayList<>();

        str.add("Muḥammad b. al-Ḥasan al-'Askarī (Arabic: محمد بن الحسن العسکری) (born in 255/869), also known as Imam al-Mahdi (a) (Arabic: إمام المهدی), is the twelfth Imam in Twelver Shi'ism. He is the promised savior, who will rise one day and fill the earth with peace and justice. Imam al-Mahdi (a) has been in occultation from the early years of his life. Shi'as regard him as the Imam of the present age. Among his well-known titles are Imam al-Mahdi (the Imam of the time) and Wali l-'Asr (the guardian of the age).\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu l-Qasim\n" +
                "Born:\t\tSha'ban 15, 255/July 29, 869\n" +
                "Birthplace:\tSamarra\n" +
                "Imamate:\t\tFrom Rabi' I 8, 260/January 1, 874 till present\n" +
                "Father:\t\tAl-Hasan b. 'Ali (a)\n" +
                "Mother:\t\tNarjis\n" +
                "Titles:\t\tAl-Qa'im (rising one), Wali al-'Asr (guardian of the age), Imam al-Mahdi (Imam of the time)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imam al-Mahdi (a) became the Imam after the martyrdom of his father Imam al-Hasan al-'Askari (a) in the year 260/874, when he was five. From that time until the year 329/940, he was in contact with his followers through his Four Deputies. After that, his Major Occultation started, in which period the direct guidance and leadership of the Shi'a community rests with religious scholars.\n" +
                "\n" +
                "There are many hadiths transmitted from the Imams (a) about Imam al-Mahdi (a), his life, his Occultation, and his government, and many collections of such hadiths have been written. In addition to hadith collections, many works have been published about Imam al-Mahdi (a).\n" +
                "\n" +
                "Every year, on fifteenth of Sha'ban, Shi'as celebrate the Imam's birth, marking one of the greatest Shi'i festivals.\n" +
                "\n" +
                "The possibility of meeting the Imam (a) during his Major Occultation, when and how he reappears, and the incidents related to his reappearance are some of the popular discussions among Shi'as.\n");



    str.add("\n" +
            "His mother is referred to in different ways: Narjis, Susan, Saqil or Sayqal, Haditha, Hakima, Malika, Rayhana, and Khamt.[9] In general, there are four accounts of her life and characteristics. According to a hadith cited by al-Shaykh al-Saduq in his Kamal al-din wa tamam al-ni'ma,[10] Imam al-Mahdi's (a) mother was a Roman princess. And in other hadiths, her life story is not mentioned and it is only said that she was trained and raised in the house of Hakima, the daughter of Imam al-Jawad (a).[11] According to a third group of hadiths (cited by al-Mas'udi in his Ithbat al-wasiyya),[12] Imam al-Mahdi's (a) mother was not only raised in the house of Imam al-Hasan al-'Askari's (a) paternal aunt, but was also born there. The last group of hadiths has a fundamental difference with these three groups. According to these hadiths, Imam al-Mahdi's (a) mother was a black bondwoman.[13] The first three groups of hadiths can be considered as complementary, but the last one cannot be reconciled with them. However, some scholars have tried to reconcile the last group of hadiths with others by taking it to be concerned with Imam al-Mahdi's (a) nurse.[14]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n");

    str.add("\n" +
            "Place of Birth:\n" +
            "\n" +
            "Historians who talked about the issue agree that Imam al-Mahdi (a) was born in the house[23] of his father, Imam al-Hasan al-'Askari (a), in Samarra. The house is now part of the shrine of Imam al-Hadi (a) and Imam al-'Askari (a).[24] Imam al-Hadi (a) and Imam al-'Askari (a) were summoned to Samarra, the center of the Abbasid Caliphate, years before the birth of Imam al-Mahdi (a) and lived there until they were martyred.[25]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Time of Birth:\n" +
            "\n" +
            "Some old sources did not talk about the birth date of Imam al-Mahdi (a), taking it to be a secret.[15] However, many Shiite and some Sunni hadiths take the year of the birth of Twelfth Shiite Imam (a) to be 255/869[16] or 256/870.[17]\n" +
            "\n" +
            "There is also a disagreement about the month in which the Imam (a) was born. The majority of scholars take it to be Sha'ban as is evidenced by many old Shiite sources.[18] However, some Shiite[19] and Sunni sources[20] take it to be Ramadan, and some Sunni sources[21] take it to be Rabi' I or Rabi' II.\n" +
            "\n" +
            "In historical sources, there are different accounts of the day on which the Twelfth Imam (a) was born, the best-known of which is Sha'ban 15th (July 29, 869).[22] This date is reported by Shiite scholars such as al-Kulayni, al-Mas'udi, al-Shaykh al-Saduq, al-Shaykh al-Mufid, al-Shaykh al-Tusi, Fattal al-Nisaburi, al-Tabrisi, Ibn Tawus, Ibn Taqtaqi, al-Allama al-Hilli, al-Shahid al-Awwal, al-Kaf'ami, and al-Shaykh al-Baha'i, and Sunni scholars such as Ibn Khallakan, Ibn Sabbagh al-Maliki, al-Sha'rani al-Hanafi, and Ibn Tulun. According to other reports, mentioned in al-Saduq's Kamal al-din, the birthday of the Imam (a) was the eve of the first Thursday of Ramadan or the eve of one of the Thursdays in Ramadan.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "The Account of the Birth:\n" +
            "\n" +
            "The famous account of the Imam's (a) birth is given by Hakima, the aunt of Imam al-Hasan al-Askari (a). In some parts of this account, as reported by al-Shaykh al-Saduq, we read,\n" +
            "\n" +
            "Imam al-Hasan al-Askari called me and said, \"O aunti! Stay with us tonight, which is the eve of the 15th of Sha'ban. Tonight God Almighty will reveal His proof on earth.\" I said, \"Who is his mother?\" He replied, \"Narjis.\" I said, \"But—May I be your ransom! —There are no sign of pregnancy in her!\" The Imam (a) replied, \"It will be as I said to you.\" I went and when I said salam and sat down, Narjis came, took my shoes, and said, \"O my lady and the lady of my family! How are you?\" I said, \"You are my lady and the lady of my family … God is giving you tonight a son, who is the master of this world and the hereafter.\" Then [I prayed, and] when I finished my prayer, I ate in order to end my fast, and then I slept. In the middle of the night, I woke up and prayed while Narjis was sleeping. Then I followed up my prayer with some dhikrs and then I also slept. I woke up again, and then Narjis woke up, prayed, and slept again. I came out of the house and looked at the sky, and it was the time of the first fajr. As soon as I started to have some doubt, Abu Muhammad [i.e., Imam al-Hasan al-Askari (a)] called me and said, \"O auntie! Do not hasten, because the time is about to arrive.\" So I sat down and started to recite sura al-Sajda and sura Yasin. As I was reciting the Qur'an, Narjis woke up, so I hastened unto her and told her, \"Do you feel anything?\" She responded, \"Yes, auntie!\" I told her, \"Be calm and let your heart be strong. This is what I told you about. Afterwards, a kind of weakness got me and Narjis. Then, I woke up by the voice of my master [i.e., Imam al-Mahdi] … I saw him prostrating himself … I held him in my arms and found him clean and pure. Abu Muhammad told me, \"O auntie! Bring me my child.\" I did so … [He held him,] and said, \"O my son! Speak!\" He said, \"I testify that there is no God but Allah alone; He has no partners. And I testify that Muhammad is His apostle.\" Then he sent salutations upon Amir al-Mu'minin and the rest of the Imams until his father.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Secret Birth:\n" +
            "\n" +
            "Abbasid caliphs knew from the hadiths by the Prophet (s) and the Imams (a) that the Twelfth Imam was al-Mahdi, and thus, they assigned some guards to monitor Imam al-Hasan al-'Askari (a) and his house. According to historians, al-Mu'tamid al-'Abbasi had ordered the midwives to drop by sadat's houses, especially the house of Imam al-Hasan al-'Askari (a), search inside the house, learn about his wife, and report him about it.[26]\n" +
            "\n" +
            "The birth of Imam al-Mahdi (a) was hidden from people. The secrecy of his birth and its reasons are mentioned in some hadiths.[27] According to a hadith from Imam al-Sajjad (a), \"our al-Qa'im bears some traditions of the prophets. A tradition from Abraham (a) is the secrecy of his birth and his isolation from the people\".[28] And according to a hadith from Imam al-Sadiq (a), \"the birth of Sahib al-Amr is hidden from the people until he reappears. This is in order for him not to have to pledge allegiance to anyone\".[29]\n" +
            "\n" +
            "According to al-Shaykh al-Mufid, the reason behind the hidden birth of Imam al-Mahdi (a) was the persecutions and the fact that the governor of the time was on the watch to murder the last Proof of God.\n" +
            "\n" +
            "It should be noted that the hidden birth of the Twelfth Imam (a) was not an unprecedented phenomenon. Abraham's and Moses's births also reportedly occurred in a hidden manner.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "The Witnesses of the Birth:\n" +
            "\n" +
            "Apart from Hakima, two female slaves named Mariyah and Nasim also witnessed the birth of the Twelfth Imam (a). Al-Shaykh al-Tusi and al-Shaykh al-Saduq have recorded the accounts of the birth of the Imam (a) as reported by these two female slaves: \"When the Master of the Time was born, he sat down on his knees and raised his forefingers toward heaven. Then, he sneezed and said, 'All praise belongs to God the Lord of the worlds. May God send his blessings on Muhammad and his family. The oppressors have thought that the Proof of God is destroyed. Were we permitted to speak, the doubt would fade away.'\"\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Shi'as' Awareness of the Birth:\n" +
            "\n" +
            "After Imam al-Mahdi's (a) birth, some Shi'as who were close and reliable companions of Imam al-Hasan al-'Askari (a) saw Imam al-Mahdi (a). Al-Shaykh al-Mufid mentions some Shi'as who saw Imam al-Mahdi (a) during the life of Imam al-'Askari (a): Muhammad b. Isma'il b. Musa b. Ja'far (a), Hakima bt. al-Imam al-Jawad (a), Abu 'Ali b. Mutahhar, 'Amr al-Ahwazi, and Abu Nasr al-Turayf, the servant of Imam al-'Askari (a).[34]\n" +
            "\n" +
            "\n" +
            "\n");

    str.add("\n" +
            "\n" +
            "Several hadiths predicted the birth and occultation of Imam al-Mahdi (a), before his birth. Many hadiths also speak about his rule. According to these hadiths, he is the Imam who will rise by God's command and establish a universal rule. Before his uprising, he has two periods of occultation, one of which is longer than the other. The Minor Occultation started from the birth of the Imam until 329/940, when the last \"special deputy\" of the Imam (a) passed away. After that, the Major Occultation started, which will end when he will rise against the injustice and oppression that fills the world.\n" +
            "\n" +
            "Minor Occultation:\n" +
            "\n" +
            "There are disagreements over when the Minor Occultation began. Some people believe that it began with the birth of Imam al-Mahdi (a) in 255/869, and thus, it lasted for seventy four years. But some others believe that it began since the martyrdom of Imam al-Hasan al-'Askari (a) in 260/874 in which case the Minor Occultation lasted for sixty nine years.\n" +
            "\n" +
            "Al-Shaykh al-Mufid (d. 413/1022) in his al-Irshad[106] and al-Tabrisi (d. 1154) in his I'lam al-wara,[107] and some other prominent Shiite jurists and muhaddiths as well as many historiographers have subscribed to the first view, taking the Minor Occultation to be seventy four years.\n" +
            "\n" +
            "During the Minor Occultation, Imam al-Mahdi (a) had interactions with the Shi'as through his Special Deputies and settled their issues, such as questions about beliefs, jurisprudential inquiries, and financial matters.\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Major Occultation:\n" +
            "\n" +
            "Since the beginning of his imamate in 260/874, Imam al-Mahdi (a) had interactions with the Shi'as only through his Special Deputies. The last deputy, 'Ali b. Muhammad al-Samuri passed away on Sha'ban 15, 329 (May 15, 941). A week before his death, Imam al-Mahdi (a) issued a letter to him as follows:\n" +
            "\n" +
            "O 'Ali b. Muhammad al-Samuri! You will die within six days. So, finish your works and do not recommend anyone as your successor, because the second occultation has now started, and there will be no Reappearance until God permits.[108]\n" +
            "After al-Samuri's death, the connection through Special Deputies came to an end and the Occultation entered a new phase. This phase of the Occultation came to be known in recent sources as the Major Occultation. According to most Shiite sources, the fourth deputy died in 329/941, but al-Shaykh al-Saduq and al-Fadl b. al-Hasan al-Tabrisi take it to be in 318/930.[109]\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "Reappearance of Imam al-Mahdi (a):\n" +
            "\n" +
            "The signs of the time when the Imam (a) reappears can be found in hadiths and in the Qur'an as interpreted by the traditions. Based on these sources, when the time of the reappearance approaches, three major phenomena will be seen in the world:\n" +
            "\n" +
            "Widespread oppression and evil.\n" +
            "Enemies such as al-Sufyani, Nasibis, and others who work against the Shi'a in Iraq and other Muslim lands. These people will conquer Syria and rule there.\n" +
            "The helpers of the Imam (a) who promote his name and his cause in the world.\n" +
            "Oral and Written Sayings\n" +
            "The term tawqi' mostly indicates the writings of the Imams (a) and especially of Imam al-Mahdi (a), but sometimes this term has been used also for his oral sayings. In sources such as Kamal al-din by al-Shaykh al-Saduq and Mu'jam ahadith al-Imam al-Mahdi (a), not even the oral sayings of the Imam (a) but also the sayings of his special deputies have been collected under the title al-tawqiʿat. The tawqiʿat of the Imam (a) (about 80 sayings) are mostly issued during the Minor Occultation and on various topics.\n" +
            "\n" +
            "\n");


        edesc.add(str);


        str=new ArrayList<>();

        str.add("محمد بن حسن (ولادت 255 ھ)، امام مہدی، امام زمانہ اور حجت بن الحسن کے نام سے مشہور، شیعہ اثنا عشریہ کے بارہویں امام ہیں۔ شیعہ کتابوں کے مطابق، آپؑ کی ولادت خفیہ رکھی گئی تھی اور امام حسن عسکریؑ کے کچھ خاص اصحاب کے سوا کسی کو آپؑ کا دیدار نصیب نہیں ہوا۔ امامیہ کے عقیدہ کے مطابق امام مہدیؑ ہی آخر الزمان کے نجات دہندہ ہیں؛ جو طویل عمر کے مالک ہوں گے اور اپنی زندگی کا ایک طویل عرصہ غیبت میں گزاریں گے۔ آپؑ آخرکار اللہ کے ارادے سے ظہور کریں گے اور دنیا پر عدل و انصاف پر مبنی حکومت قائم کریں گے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "منصب:\t\tشیعوں کے بارہویں امام\n" +
                "\n" +
                "نام:\t\tمحمد بن حسن\n" +
                "\n" +
                "کنیت:\t\tابو القاسم، ابا صالح\n" +
                "\n" +
                "القاب:\t\tمہدی، بقیۃ اللہ، قائم آل محمد، صاحب الزمان\n" +
                "\n" +
                "تاریخ ولادت:\t\t15 شعبان، سنہ 255 ہجری۔\n" +
                "\n" +
                "جائے ولادت:\t\tسامراء\n" +
                "\n" +
                "مدت امامت:\t\tابھی جاری ہے\n" +
                "\n" +
                "والد ماجد:\t\tامام حسن عسکری ؑ\n" +
                "\n" +
                "والدہ ماجدہ:\t\tنرجس خاتون\n" +
                "\n" +
                "عمر:\t\tبقید حیات\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بعض شیعہ امام حسن عسکری ؑ کی شہادت کے بعد مختصر عرصے میں شک و تردید کا شکار ہوئے لیکن امام زمانہؑ کی توقیعات ـ جو عام طور پر شیعیان اہل بیت کے نام لکھی جاتی تھیں اور خاص نائبین کے ذریعے لوگوں تک پہنچتی تھیں ـ مکتب تشیع کے استحکام کا سبب قرار پائیں۔ امام حسن عسکریؑ کی شہادت کے بعد غیبت صغری کے دوران نواب اربعہ کے وسیلہ سے آپؑ کا رابطہ اپنے ماننے والوں کے ساتھ قائم تھا۔ لیکن سنہ 329 ھ میں جب غیبت کبری کا آغاز ہوا تو آپؑ کے ساتھ براہ راست رابطہ بھی منقطع ہوا۔\n" +
                "\n" +
                "شیعہ مفسرین، معصومین سے منقول احادیث کی بنیاد پر بعض قرآنی آیات کو امام زمانہؑ سے متعلق قرار دیتے ہیں۔ رسول اللہؐ اور ائمہؑ سے متعدد احادیث امام زمانہؑ، آپ کی غیبت، ظہور اور حکومت کے بارے میں نقل ہوئی ہیں۔ بعض حدیثی کتابیں انہی احادیث کی نقل اور جمع آوری کی غرض سے لکھی گئی ہیں۔ حدیث کی کتب کے علاوہ بہت سی دوسری کتب بھی امام زمانہؑ سے متعلق موضوعات پر شائع ہوئی ہیں۔\n" +
                "\n" +
                "مختلف علاقوں میں بہت سے مقامات آپ سے منسوب ہیں، جیسے سامرا میں سرداب غیبت، کوفہ کی مسجد سہلہ میں مقام امام مہدیؑ اور قم کے مضافات میں مسجد جمکران وغیرہ۔\n" +
                "\n" +
                "عصر غیبت میں امام زمانہؑ کے ساتھ ارتباط برقرار کرنے کے لئے بہت سی دعائیں اور اذکار نقل ہوئی ہیں۔ شیعہ علماء نے امام زمانہؑ کے ساتھ بعض افراد کے دیدار کے بہت سے واقعات نقل کئے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "امام زمانہؑ کی والدہ ماجدہ کے متعدد نام ذکر ہوئے ہیں؛ جیسے: نرجس، سوسن، صقیل یا صیقل، حدیثہ، حکیمہ، ملیکہ، ریحانہ و خمط۔[12] امام زمانہؑ کی والدہ ماجدہ کے حالات زندگی کے بارے میں منقولہ روایات کو مجموعی طور پر چار قسموں میں تقسیم کیا جاتا ہے:\n" +
                "\n" +
                "شیخ صدوق نے کمال الدین و تمام النعمۃ میں روایت نقل کرتے ہوئے انہیں رومی شہزادی قرار دیا ہے؛[13]\n" +
                "بعض دیگر روایات میں ان کے حالات زندگی کی طرف اشارہ کئے بغیر کہا گیا ہے کہ امام زمانہؑ کی والدہ حکیمہ بنت امام جوادؑ کے گھر میں پرورش پا چکی ہیں؛[14]\n" +
                "تیسری قسم کی روایات کے مطابق، جنہیں مسعودی نے اثبات الوصیہ میں نقل کیا ہے،[15] بارہویں امامؑ کی والدہ گیارہویں امام کی پھوپھی جناب حکیمہ خاتون کے گھر میں پروان چڑھی ہیں اور اسی گھر میں پیدا بھی ہوئی ہیں۔\n" +
                "چوتھی قسم اور دیگر تین قسموں کے درمیان بنیادی اختلاف پایا جاتا ہے۔ ان روایات میں کہا گیا ہے کہ امام زمانہؑ کی والدہ ماجدہ سیاہ فام اُمِّ وَلَد تھیں۔[16] تین قسموں کی روایات بہرصورت ایک دوسرے کی تکمیل کرتی ہیں لیکن چوتھی قسم کی روایات کو ان روایات کے ساتھ یکجا نہیں کیا جاسکتا۔ بایں حال، بعض علماء نے چاروں قسموں کی روایات کو ہمآہنگ کرنے کے لئے کہا ہے کہ مؤخر الذکر روایت کی بالواسطہ یا امام زمانہؑ کی والدہ کی مُرَبِّیہ کے طور پر، توجیہ کی جا سکتی ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("\n" +
                "وقت ولادت:\n" +
                "\n" +
                "امام زمانہؑ کی ولادت کے سال کے بارے میں اختلاف ہے۔ بعض متقدم مآخذ نے آپؑ کی تاریخ ولادت کی طرف اشارہ نہیں کیا ہے اور اس کو خفیہ قرار دیا ہے۔[23] لیکن بہت سی شیعہ اور بعض سنی روایات میں ہے کہ امام دوازدہمؑ سنہ255ھ [24] یا 256ھ ق[25] میں متولّد ہوئے ہیں\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تفصیلی واقعہ:\n" +
                "\n" +
                "امام زمانہؑ کی ولادت کے سلسلے میں مشہور روایت وہی ہے جو امام عسکریؑ کی پھوپھی جناب حکیمہ خاتون نے نقل کی ہے۔ شیخ صدوق حکیمہ خاتون کے حوالے سے لکھتے ہیں:\n" +
                "\"امام حسن عسکریؑ نے مجھ [حکیمہ خاتون] کو بلوا کر فرمایا: پھوپھی جان! آج ہمارے یہاں قیام کریں کیونکہ نیمہ شعبان کی شب ہے اور خداوند متعال آج رات اپنی حجت کو ـ جو روئے زمین پر اس کی حجت ہے ـ ظاہر فرمائے گا۔ میں نے عرض کیا: ان کی ماں کون ہے؟ فرمایا: نرجس خاتون۔ میں نے عرض کیا: میں آپ پر قربان ہوجاؤں، ان میں حمل کا کوئی اثر نہیں ہے۔ فرمایا: بات وہی ہے جو میں آپ سے کہہ رہا ہوں۔\n" +
                "کہتی ہیں:\n" +
                "میں آئی ، سلام کیا اور بیٹھ گئی تو نرجس آئیں اور میرے جوتے اٹھا لئے اور مجھ سے کہا: اے میری سیدہ اور میرے خاندان کی سیدہ! آپ کا کیا حال ہے؟ میں نے کہا: تم میری اور میرے خاندان کی سیدہ ہو۔ نرجس میرے اس کلام سے ناراض ہوئیں اور کہنے لگیں: پھوپھی جان! یہ کیا بات ہوئی؟ میں نے کہا: میری بیٹی! خداوند متعال تمہیں ایسا فرزند عطا کرے گا جو دنیا اور آخرت کا سید و سردار ہے۔ نرجس شرما گئیں اور حیا کر گئیں۔ میں نے نماز ادا کی، روزہ افطار کیا اور اپنے بستر پر لیٹ گئی۔ آدھی رات کو نماز (تہجد) کے لئے اٹھی اور نماز پڑھ لی؛ جبکہ نرجس سو رہی تھیں۔ میں نماز کے بعد کے اعمال کے لئے بیٹھ گئی اور پھر سو گئی اور خوفزدہ ہوکر جاگ اٹھی؛ وہ ابھی سو رہی تھیں؛ چنانچہ اٹھیں اور نماز (تہجد) بجا لا کر سوگئیں۔\n" +
                "جناب حکیمہ خاتون مزید کہتی ہیں:\n" +
                "میں باہر آئی اور فجر کی تلاش میں آسمان کی طرف دیکھا؛ دیکھا کہ فجر اول طلوع کرچکی ہے اور وہ ابھی سو رہی ہیں۔ شک میرے دل پر عارض ہوا۔اچانک ابو محمد نے اپنے کمرے سے صدا دی: پھوپھی جان! عجلت سے کام مت لیں، کیونکہ امر قریب ہوچکا ہے۔\n" +
                "کہتی ہیں:\n" +
                "میں بیٹھ گئی اور سورہ سجدہ اور سورہ یس کی تلاوت میں مصروف ہوئی۔ اسی اثناء میں نرجس ہراساں سی ہوکر اٹھیں اور میں فورا ان کے پاس پہنچی اور ان سے کہا: آپ پر اللہ کی رحمت ہو، کیا کچھ محسوس ہورہا ہے؟ کہنے لگیں: پھوپھی جان! ہاں محسوس کررہی ہوں۔ میں نے کہا: اپنے پر قابو کرو اور دل مضبوط رکھیں کیونکہ وہی ہونے جارہا ہے جو میں نے کہا تھا۔ جناب حکیمہ کہتی ہیں: مجھ پر بھی اور نرجس پر بھی ضعف طاری ہوا اور اپنے سید و سردار (امام عسکریؑ) کی آواز پر میری جان میں جان آئی اور کپڑا ان کے چہرے سے اٹھایا اور اچانک میں نے اپنے سید و سرور (نرجس کے فرزند) کو دیکھا جو حالت سجدہ میں تھے اور آپؑ کے سجدہ کے ساتوں اعضاء [پیشانی، ہتھیلیاں، گھٹنے اور پاؤں کے انگوٹھے) زمین پر تھے]۔ میں نے آپؑ کو آغوش میں لیا اور دیکھا کہ پاک و پاکیزہ ہیں۔\n" +
                "ابو محمد نے فرمایا:\n" +
                "پھوپھی جان! میرا فرزند میرے پاس لائیں، میں آپؑ کو امامؑ کے پاس لے گیی؛ امامؑ نے اپنے پاؤں کو پھیلایا اور فرزند کو پاوں کے درمیان قرار دیا اور آپؑ کے پیروں کو اپنے سینے پر رکھا اور پھر اپنی زبان مبارک ان کے منہ میں رکھ دی اور اپنا ایک ہاتھ آپؑ کی آنکھوں، کانوں اور بدن کے جوڑوں پر پھیرا ؛\n" +
                "اور فرمایا:\n" +
                "اے میرے فرزند! بولو۔ چنانچہ آپؑ نے کہا:\n" +
                "أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، وَ أَشْهَدُ أَنَّ مُحَمَّداً رَسُولُ اللہِ بعدازاں امیرالمؤمنینؑ اور دوسرے ائمہ معصومینؑ کو درود و سلام کا ہدیہ بھیجا، حتی کہ آپؑ کے والد کی باری آئی تو زبان روک لی۔[38]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ولادت کا مخفی ہونا:\n" +
                "\n" +
                "خلفائے بنی عباس، پیغمبرؐ اور ائمہؑ کی روایات و احادیث کی رو سے بخوبی جانتے تھے کہ بارہویں امام \"مہدی\" ہی ہیں؛ چنانچہ انھوں نے امام حسن عسکریؑ اور آپؑ کے گھر پر پہرےدار متعین کئے۔ مؤرخین کا کہنا ہے کہ معتمد عباسی نے دائیوں کو حکم دیا تھا کہ کبھی کبھی ناگہانی طور پر اور بن بلائے سادات کے گھروں ـ خاص طور پر امام حسن عسکریؑ کے گھر ـ میں داخل ہوجایا کریں اور گھروں کی تلاشی لیا کریں اور آپؑ کی زوجہ مکرمہ کے حالات سے آگاہ ہوکر دربار کو خبر دیا کریں۔[39] ایک کنیز بنام \"ثقیل\" نے ـ گویا امام زمانہؑ کی جان کی حفاظت کی خاطر حاملگی کا دعوی کیا تھا جس کو دو سال تک نظر بند رکھا گیا او رجب حکومت وقت اس کی عدم حاملگی سے مطمئن ہوئی، تو اس کو رہا کردیا۔[40]\n" +
                "\n" +
                "ولادت امام زمانہؑ کو عام لوگوں سے خفیہ رکھا گیا۔ روایات میں[41] بھی اس موضوع اور اس کے دلائل کی طرف اشارہ ہوا ہے۔ امام سجادؑ فرماتے ہیں: \"ہمارے قائم کی ذات میں انبیا کی سنتیں ہیں۔۔۔۔ ولادت کا مخفی ہونا اور ان کا لوگوں سے دور رہنا ابراہیمؑ کی سنت ہے۔[42] نیز امام صادقؑ فرماتے ہیں: \"صاحب الامر کی ولادت خلائق سے پوشیدہ ہے یہاں تک کہ ظہور کریں ولادت مخفی بھی اس لئے ہی تاکہ آپؑ پر کسی کی بیعت نہ ہو\"۔[43]\n" +
                "\n" +
                "شیخ مفید کی رائے ہے کہ \"اس دور کے مشکلات و مسائل اور اللہ کی آخری حجت کی ولادت کی خبر پانے کے لئے سلطان وقت کی وسیع تلاش اور بےتحاشا کوششوں کے پیش نظر، آپؑ کی ولادت کو عام لوگوں سے خفیہ رکھا گیا۔۔۔۔[44]\n" +
                "\n" +
                "تاریخ میں ولادت کا خفیہ رکھا جانا بے مثال نہیں ہے بلکہ مروی ہے کہ حضرت ابراہیمؑ کی ولادت کو بھی خفیہ رکھا گیا تھا کیونکہ بادشاہ وقت کی طرف سے ان کے قتل کئے جانے کا خدشہ تھا۔[45] یا پھر قرآن کریم کی سورہ قصص کی آیات 7 سے 13 تک میں موسی بن عمرانؑ کی ولادت کی روداد بیان کرتے ہوئے ان کی ولادت کو خفیہ رکھے جانے کی طرف اشارہ ہوا ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ولادت کے چشم دید گواہ:\n" +
                "\n" +
                "جناب حکیمہ خاتون کے علاوہ، امام حسن عسکریؑ کی دو کنیزیں نسیم اور ماریہ بھی آپؑ کی ولادت کے عینی شاہدین میں شمار ہوتی ہیں۔ شیخ صدوق اور شیخ طوسی نقل کرتے ہیں: نسیم اور ماریہ کہتی ہیں کہ \"صاحب الزمانؑ ماں کے بطن سے دنیا میں آئے تو آپؑ نے دونوں گھٹنے زمین پر رکھے اور دونوں ہاتھوں کی شہادت کی انگلیاں آسمان کی طرف بلند کیں اور پھر آپ نے چھینک ماری اور فرمایا:الْحَمْدُ لِلَّهِ رَبِّ الْعالَمینَ واَلحُمُدُ لِلّهِ رَبَّ العالَمینَ وَصَلَّی اللهُ عَلی مُحَمَّدٍ صَلَّی اللهُ وَآلِهِ۔ ستمگر سمجھ بیٹھے ہیں کہ گویا اللہ کی حجت فنا ہوچکی ہے۔ اگر ہمیں کلام کرنے کا اذن ہوتا تو شک زائل ہوجاتا\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("\n" +
                "غیبت صغرا:\n" +
                "\n" +
                "تفصیلی مضمون: غیبت امام زمانہؑ, غیبت صغری, اور نواب اربعہ\n" +
                "اس مسئلے کے بارے میں اختلافات پائے جاتے ہیں کہ غیبت صغری کا آغاز کب سے ہوا ہے؟ ایک رائے ہے کہ غیبت صغری سنہ 255 ہجری میں امام زمانہؑ کی ولادت کے دن سے ہی شروع ہوئی ہے، اور اس لحاظ سے اس کی مدت 74 برس ہوگی، اور دوسری رائے یہ ہے کہ غیبت صغری کا آغاز سنہ 260 ہجری میں امام حسن عسکریؑ کی شہادت کے دن سے ہوا ہے اور اس لحاظ سے اس دور کی مدت 69 برس ہوگی۔\n" +
                "\n" +
                "شیخ مفید (متوفیٰ 413 ھ) اپنی کتاب الارشاد،[141] اور طبرسی (متوفیٰ 548 ھ) اپنی کتاب اعلام الوری میں[142] اور بعض دیگر شیعہ اکابرِ فقہاء و محدّثین اور بہت سے مؤرخین اپنی کتب میں پہلے قول کو تسلیم کرتے ہیں اور ان کے بقول غیبت صغری کی مدت 74 برس ہے۔\n" +
                "\n" +
                "غیبت صغری کے زمانے میں امام مہدیؑ نائبینِ خاص کے ذریعے شیعیان اہل بیت کے ساتھ رابطے میں تھے اور ان کے مسائل حل فرمایا کرتے تھے۔ یہ مسائل اعتقادی، فقہی اور مالی وغیر مسائل پر مشتمل ہوتے تھے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "انقطاع نیابت اور غیبت کبرا:\n" +
                "\n" +
                "امام مہدیؑ نے سنہ 260 ھ ق میں اپنی امامت کے آغاز سے ہی شیعیان اہل بیت کے ساتھ اپنا رابطہ ـ نائبین خاص کے ذریعے رابطے تک ـ محدود کرلیا تھا؛ اور آپ کے آخری نائب خاص علی بن محمد سمری تھے جنہوں نے پندرہ شعبان سنہ 329 ہجری قمری /15 مئی سنہ 941 ع\u200Dیسوی کو وفات پائی۔ ان کی وفات سے ایک ہفتہ قبل امام زمانہؑ کی جانب سے ایک توقیع صادر ہوئی جس میں آپؑ نے تحریر فرمایا تھا:\n" +
                "\n" +
                "اے علی بن محمد سمری!۔۔۔ تم 6 دن بعد وفات پاؤگے۔ اسی لئے اپنے کام مکمل کرنا اور کسی سے بھی جانشین کے طور پر وصیت نہ کرنا؛ کیونکہ دوسری غیبت کا آغاز ہوچکا ہے اور کوئی ظہور نہ ہوگا سوا اس وقت کے جب خداوند متعال خود اجازت فرمائے۔۔[143]\n" +
                "علی بن محمد سمری کی وفات کے بعد، نائبین خاص کے ذریعے رابطہ بھی منقطع ہوا؛ اور غیبت نئے مرحلے میں داخل ہوئی۔ یہ مرحلہ متاخرہ ماخذ میں، \"غیبت کبری\" کہلایا۔\n" +
                "\n" +
                "اکثر شیعہ مآخذ کے مطابق ابوالحسن علی بن محمد سمری کا انتقال سنہ سال 329 ھ، کو ہوا لیکن شیخ صدوق[144] اور فضل بن حسن طبرسی[145] کہتے ہیں کہ ابو الحسن علی بن محمد طبرسی 15 شعبان المعظم سنہ 228 ھ ق کو خالق حقیقی سے جاملے ہیں۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "ظہور امام زمانہ:\n" +
                "\n" +
                "ظہور امام زمانہؑ کے بارے میں بکثرت نقل ہونے والی روایات کے علاوہ، شیعہ مفسرین، اہل بیت کے اقوال و احادیث سے اس کی طرف استناد کرتے ہیں، قرآن کریم نے بھی ظہور کی نشانیوں پر روشنی ڈالی ہے۔ شیعہ روایات کے مطابق، ظہور کی آمد پر دنیا کی تین اہم خصوصیات ہیں:\n" +
                "\n" +
                "ظلم و ستم پھیل جائے گا اور فتنہ، جو ہر گھر پر وارد ہوگا؛[148]\n" +
                "سفیانی اور نواصب کا خروج، اور عراق سمیت ديگر سرزمینوں میں تشیّع کے خلاف سرگرم عمل دشمنوں کی سرگرمیاں جو شام پر قابض ہوکر وہاں کی حکومت کو اپنے ہاتھ میں لیں گے۔[149]\n" +
                "امام زمانہؑ کے وہ اولیاء اور اصحاب جو اسلامی سرزمینوں میں آپؑ کی یاد اور آپؑ کے نام کو زندہ رکھتے ہیں اور دنیا بھر میں پھیلا دیتے ہیں۔");

            udesc.add(str);

        Log.d("myapp1",img.size()+"");
        for(int i=0;i<img.size();i++)
            Log.d("myapp1",img.get(i)+"");

        for(int i=0 ;i<etitleH.size();i++){
            id.add(i);

            etitleH.set(i,etitleH.get(i).trim());
            utitleH.set(i,utitleH.get(i).trim());

            for(int j=0;j<edesc.get(i).size();j++)
            {
                String res=edesc.get(i).get(j);

                res=res.replaceAll("\\[[^\\[]*]\n", "");
                res=res.replaceAll("\\[.*?]", "");
                res=res.replace("[]", "");
                res=res.replace("[", "");
                res=res.replace("]", "");
               // if(i==13 && j==1) Log.d("myapp1",res);
                edesc.get(i).set(j,res);

                res=udesc.get(i).get(j);

                res=res.replaceAll("\\[[^\\[]*]\n", "");
                res=res.replaceAll("\\[.*?]", "");
                res=res.replace("[]", "");
                res=res.replace("[", "");
                res=res.replace("]", "");
                // if(i==13 && j==1) Log.d("myapp1",res);
                udesc.get(i).set(j,res);


            }
        }

        Intent intent=getIntent();
        String d=intent.getStringExtra(BioActivity.MSG1);
        if(d!=null)
        {
            Intent i=new Intent(this,BioNextActivity.class);
            i.putExtra(BioActivity.MSG1,d);
            startActivity(i);
            finish();

        }


        final RecyclerView recyclerView=findViewById(R.id.recycle);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CountryItem>  mCountryList;
        JSONArray arr1=new JSONArray();

        try{
            for(int i=0;i<etitleH.size();i++)
            {
                mCountryList = new ArrayList<>();
                mCountryList.add(new CountryItem(etitleH.get(i),utitleH.get(i)));
                for(int j=0;j<etitle.get(i).size();j++)mCountryList.add(new CountryItem(etitle.get(i).get(j), utitle.get(i).get(j)));
                JSONObject obj=new JSONObject();
                obj.put("id",Integer.toString(id.get(i)));
                obj.put("bio",mCountryList);
                arr1.put(obj);
            }
        }catch (Exception e){}

        final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(BioActivity.this, arr1);
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
