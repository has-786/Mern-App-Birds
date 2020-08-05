package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.adapterBio.RecyclerViewAdapter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.graphics.Color.RED;

public class BioActivity extends AppCompatActivity {
    public static final String MSG2="com.example.myapplication.BIO";
    public static final String MSG1="com.example.myapplication.BIO1";
    public static final String MSG3="com.example.myapplication.BIOLANG";
    public static int biolang=0;
    TextView t0,t1,t2;
    ImageView img1;

    String es0,es1,s2,es3,us0,us1,us3;


    static ArrayList<String> etitleH=new ArrayList<>();
    static ArrayList<String> utitleH=new ArrayList<>();
    static ArrayList<ArrayList<Integer>> images=new ArrayList<>();
    static ArrayList<ArrayList<String>> etitle=new ArrayList<>();
    static ArrayList<ArrayList<String>> edesc=new ArrayList<>();
    static ArrayList<ArrayList<String>>  utitle=new ArrayList<>();
    static ArrayList<ArrayList<String>> udesc=new ArrayList<>();
    static ArrayList<Integer> id=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        getSupportActionBar().setTitle("Biography"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        img1=findViewById(R.id.imageView);

        etitleH=new ArrayList<>();
        utitleH=new ArrayList<>();



        etitleH.add("Prophet Muhammad sawa");
        utitleH.add("نبی کریم صلی اللہ علیہ وسلم");

        ArrayList<Integer> img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        ArrayList<String> str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues");
        str.add("Well-known Hadiths");
        str.add("Collections of the Prophet's (s) Hadiths");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues\n");
        str.add("Well-known Hadiths");
        str.add("Collections of the Prophet's (s) Hadiths");
        str.add("Martyrdom");

        utitle.add(str);


        str=new ArrayList<>();

        str.add("Prophet Muhammad sawa\n" +
                "(نبی کریم صلی اللہ علیہ وسلم)\n"+
                "is the prophet of Islam, whose mission was essentially the advancement of monotheism and morality. He (s) was also a social reformist and a political leader. He (s) was the last prophet of God, and his major miracle was the Qur'an.\n" +
                "\n" +
                "\n\n\n" +
                "Born:\t 11 May 570 CE  " +
                "(Rabi' I 17, 53 BH)\n\n" +
                "Birthplace:\tMecca, Arabia\n\n"+
                "Died:\t 25 May 632 (aged 62) " +
                "(Safar 28, 11 AH)\n\n" +
                "Deathplace:\tMedina, ArabiaPlace of BurialMedina, Arabia,\n\n" +
                "Successor:\tAli b. Abi Talib (a) " +
                "(As the first Imam of the Shia and Caliph)\n\n" +
                "Father:\t Abd Allah b. 'Abd al-Muttalib\n\n" +
                "Mother:\t Amina bt. Wahb\n\n" +
                "Spouse(s):\t Khadija, Sawda, Aisha, Hafsa, Zaynab bt. Khuzayma, Umm Salama, Zaynab bt. Jahsh, Juwayriyya, Ramla, Safiyya, Maymuna, Mariya\n\n" +
                "Son(s):\tQasim, 'Abd Allah, Ibrahim\n\n" +
                "Daughter(s):\tFatima (a)\n\n" +
                "Descendants:\tAhl al-Bayt, Sayyids\n\n" +
                "Other Titles:\t Abu l-Qasim (his Kunya), Amin (trustworthy), Rasul Allah (messenger of Allah); Mustafa (the chosen), Habib Allah(beloved one of Allah), Khayr Khalq Allah (the best of creatures of Allah), Khatam al-Nabiyyin(last of the propehts),\n" +
                "Rahmat li-l-'Alamin (a blessing for the two worlds)\n\n" +
                "Birth:\t" +
                "The exact year of the Prophet's (s) birth is not known. Ibn Hisham and some others have written that it was in 'Am al-fil (literally, \"the year of the elephant\"), the year in which Abraha al-Ashram and his elephants attempted to destroy the Ka'ba. But this does not help much, since it cannot be said for certain what year the year of the elephantwas. However, taking into consideration that the Prophet's (s) demise was in 632 CE, and that he was 63 years old at the time of his demise, the year of his birth must have been either 569 or 570 CE.[2]\n" +
                "\n" +
                "The date of his birth is Rabi' I 17th according to the majority of Shi'a scholars, and Rabi' I 12th according to Sunnis.[3]");

            str.add("Birth and Early Life:\n\n" +
                    "Muhammad (s.a.w.a.) was born in such a family on Friday, the 17th Rabi'-ul-Awwal, 1st year of 'Amul-Fil (corresponding to 570 C.E.) to bring the Message of God to the world. In Sunni circles, 12th Rabi'-ul-Awwal is more famous. Thus, the prayer of Ibrahim while constructing the Ka'bah was granted:\n" +
                    " \n" +
                    "Lord! And raise a Messenger from among them who shall recite to them Thine verses, and teach them the Book and the wisdom, and purify them, indeed Thou art the Mighty, the Wise (Qur'an, 2:129).\n" +
                    " \n" +
                    "And the tidings of Christ came true:-\n" +
                    " \n" +
                    "O Children of Israel! Surely, I am the messenger of Allah to you, verifying that which is before me of the Torah and giving the good news of a Messenger who will come after me whose name will be Ahmed. (Qur'an, 61:6)\n" +
                    " \n" +
                    "'Abdullah, father of the Prophet, died a few month before (or two months after) his birth, and his grandfather 'Abdul\u00ADMuttalib took over the care and upbringing of the child. After a few months, according to the age-long custom of the Arabs, the child was entrusted to a bedouin woman Halimah by name, of the tribe of Bani-Sa'd, for his upbringing.\n" +
                    " \n" +
                    "When he was only six years old, he lost his mother as well; so, the doubly-orphaned child was brought up by 'Abdul-Muttalib with the most tender care. It was the will of God that the Prophet to-be should undergo all the sufferings, pains and privations incidental to human life in order that he might learn to bear them with becoming fortitude and raise his stature in human perfection. Not two years had passed before 'Abdul-Muttalib also expired.\n" +
                    " \n" +
                    "'Abdul-Muttalib died at the age of 82, leaving the care and custody of the orphaned Muhammad (s.a.w.a.) to Abu Talib. Abu Talib and his wife, Fatimah Bint Asad, loved Muhammad more than their own children. As the Holy Prophet himself said, Fatima Bint Asad was his \"mother\" who kept her own children waiting while she fed the Holy Prophet, kept her own children cold while she gave him warm clothes. Abu Talib always kept the child with him day and night.\n" +
                    " \n" +
                    "Abu Talib had succeeded 'Abdul-Muttalib in Siqayah and Rifadah and was an active participant in the trade caravans. When Muhammad (s.a.w.a.) was 12 years old, Abu Talib bade farewell to his family to go to Syria. Muhammad (s.a.w.a.) clung to him and cried. Abu Talib was so moved that he took the child with him. When the caravan reached Busra in Syria they, as usual, stayed near the monastery of a monk, Buhayra.\n" +
                    "\n" +
                    "It is not possible to give here the full account of that visit. Suffice it to say that the monk, seeing some of the signs, which he knew from the old books, was convinced that the orphan child was the last Prophet-to-be. To make sure, he started a conversation with him, and at one point said: \"I give you oath of Lat and Uzza to tell me...\" The child cried out: \"Don't take the names of Lat and Uzza before me! I hate them!\" Buhayra was now convinced. He advised Abu Talib not to proceed to Damascus \"because if the Jews found out what I have seen, I am afraid they will try to harm him. For sure, this child is to have a great eminence.\"\n" +
                    " \n" +
                    "Abu Talib, acting on this advice, sold all his merchandise for cheaper prices then and there, returning at once to Mecca."+

                    "\n\n\n\nMARRIAGE:\n\n" +
                    "Muhammad (s) married Khadija when he was twenty-five years old.[9]Khadija lived with the Prophet (s) for 25 years and passed away 10 years after Bi'tha. Khadija gave birth to a few children, the boys of whom died in childhood. The most famous of her daughters was Lady Fatima (a).\n" +
                    "\n" +
                    "After dimise of Khadija, the Prophet (s) married Sawda bt. Zam'a. The next wives of the Prophet (s) were:\n" +
                    "\n" +
                    "Aisha\n" +
                    "\n" +
                    "Hafsa\n" +
                    "\n" +
                    "Zaynab bt. Khuzayma\n" +
                    "\n" +
                    "Umm Habiba\n" +
                    "\n" +
                    "Umm Salama\n" +
                    "\n" +
                    "Zaynab bt. Jahsh\n" +
                    "\n" +
                    "Juwayriyya bt. al-Harith\n" +
                    "\n" +
                    "Safiyya bt. Huyyay\n" +
                    "\n" +
                    "Maymuna bt. al-Harith\n" +
                    "\n" +
                    "Mariya bt. Sham'un known as Mariya al-Qibtiyya.\n" +
                    "\n\n\n\n" +

                    "Battle of Badr: The First Fight of Islam\n\n"+
                    "The battle of Badr was remarkable in more ways than one. It demonstrated the great devotion of the disciples to the cause and their complete faith in the Prophet and his mission. Ranged before them in the Mencan ranks were many of their close relatives, their own sons, fathers, or uncles. Thus, the Prophet's uncle 'Abbas, 'All's brother 'Aqil, Abu Bakr's son, Hudhaifa's father and 'Umar's maternal uncle, to name a few, figured in the Meccan army. Yet the disciples never faltered. Personal feelings and sentiments were subordinated to the supreme cause. Such was the material from which Islam arose. The battle also proved that mere numerical superiority and matching valor are of no avail if the cause is not righteous. God helps those who make sacrifices in His cause."+

                    "\n\n\n\nBattle of Ohodh:\n\n"+
                    "The Battle of Uhud (Arabic:غزوة اُحُد) was a famous Ghazwa of Prophet Muhammad (s) against the polytheists of Mecca in 3/625. Quraysh marched out toward Medina, as they desired to avenge their losses in the Battle of Badr while Abu Sufyan was the commander of the army. Prophet Muhammad (s) and senior members of Ansar and Muhajirun planned to fight against Quraysh within Medina and never left the city; on the other hand young Muslims and also Hamza b. 'Abd al-Muttalib, Prophet's uncle, were willing to fight outside the city. Finally Prophet Muhammad (s) decided to accept the wishes of the latter. At first, Muslims defeated Meccans, but a part of Muslim archers having 'Abd Allah b. Jubayr as their commander on Mount 'Aynayn on the left flank of Uhud, left their assigned posts and faced a surprise attack from Meccans which led to defeat of Muslims. They faced a serious defeat with approximately 70 martyred Muslims including Hamza b. 'Abd al-Muttalib who got mutilated, even Prophet Muhammad (s) was badly injured on his face and his tooth."+

                    "\n\n\n\nBattle of Khandaq:\n\n"+
                            "The Battle of Khandaq (Arabic: غزوة الخندق, Battle of the Trench) or The Battle of Aḥzāb (Arabic: غزوة الأحزاب, Battle of the Confederates) took place in the fifth year of Hijra/627. It initially broke out by the stratagem of Banu Nadir tribe. Quraysh tribe became united with all its allies including polytheist 'Arab tribes in order to eradicate Islam. The number of their soldiers was ten thousand, yet Muslim army was only three thousand soldiers.\n" +
                    "\n" +
                    "Banu Qurayza tribe had promised to be impartial in case of war; nevertheless, they violated the contract and became confederate with the unbelievers. To take up arms against the unbelievers, Muslims dug a trench around Medina, an idea from Salman al-Farsi. The war terminated by Muslim's victory and the army of polytheists had to withdraw.\n" +
                    "\n" +
                    "During the battle, 'Amr b. 'Abd Wudd, eminent for his great valor and bravery, proceeded the trench along with some other warriors and threw down the challenge that who would dare to fight with him?\n" +
                    "\n" +
                    "Muslims remained silent, while they were overwhelmed with panic. Ultimately, 'Ali (a) volunteered and went for the challenge with the Prophet (s)'s consent. He succeeded to take 'Amr's life. This had such a huge positive impact on Muslim's spirit that led to them triumphing over the enemy. \"'Ali's stroke was superior to any jinn's or human's (thaqalayn) worship\", said Prophet Muhammad (s)."+


                    "\n\n\n\nBattle of Khaiber:\n\n" +
                    "Battle of Khaybar (Arabic: غزوة خیبر) was a battle or ghazwa by the Prophet Muhammad (s) against Jews of Khaybar region that began in Muharram of 7/628 and ended with the victory of Muslims in Safar of the same year. The battle started because Jews in Khaybar had given refuge to Jews who were expelled from Medina and incited some Arabian tribes against Muslims. Muslims won the battle and according to a treaty between Jews and the Prophet (s) they were to leave the region with their families; in the second treaty the Prophet (s) agreed that they stay in the region and continue their agriculture but pay half of their benefit to Muslims instead."+

                    "\n\n\n\nVisit to Mecca:\n"+
                            "According to the terms of the treaty with the Meccans, the Muslims could visit Mecca the next year. Towards the end of the seventh year of Hijra (March 629 C.E.) the Prophet, accompanied by about two thousand Muslims, proceeded to Mecca to make the lesser pitgrimage (the 'umrah). The Quraish left their houses and watched the Muslims from their tents pitched on the heights- of the surrounding hills. After three days' sojourn, the Muslims retired strictly in accordance with the terms of the treaty."+


                    "\n\n\n\nEvent of Ghadeer Khum:\n" +
                    "\n" +
                    "The Prophet (s) went for his last pilgrimage in Dhu l-Qa'da, 10/February 632. He taught the rulings of the Hajj during this Hajj journey.\n" +
                    "\n" +
                    "The Quraysh had saved some privileges for themselves, the same privileges that they had before the advent of Islam. In addition to key-holding, managing, and giving water to the Hajj pilgrims, they regarded themselves as separate from and superior to the other tribes in doing rituals. In this last Hajj journey, the Prophet (s) negated the privileges that the Quraysh had held for themselves and had deprived others from.\n" +
                    "\n" +
                    "Among the things abolished was the purchase of clean clothing for the pilgrimage permitted only through the Quraysh. There was a custom that the clean clothes required for the pilgrimage could only be bought from the Quraysh, and if they were not, they had to circumambulate the Ka'ba naked. Another practice abolished was that the Quraysh moved out from Muzdalifa, as opposed to 'Arafat as all other Hajj pilgrims did. They believed this to be an honor for themselves, but the Qur'an nullified this privilege:\n" +
                    "\n" +
                    "“Then stream out from where the people stream out…”— Quran, 2:199\n" +
                    "\n" +
                    "The Muslims saw that Muhammad (s) was from Quraysh, but that he was moving out from 'Arafat like all of the others. It was in this journey that the Prophet (s) told the people,\n" +
                    "\n" +
                    "\"O people! I don't know if I will see the next year. I ignored all of the blood that was spilt before the advent of Islam. [From now on], your blood and your other possessions are forbidden for each other until you meet God.\"\n" +
                    "\n" +
                    "In a region called Juhfa where the peoples of Egypt, Hijaz and Iraq split up to travel to their own regions, is a place called Ghadir Khum. Here, on the Prophet's (s) return to Medina, before everyone split in different directions, he received an order from God to appoint Ali (a)as his successor and who would direct the Muslim community towards a specific goal. In the massive crowd of Muslims, approximated at 90-100,000, the Prophet (s) said,\n" +
                    "\n" +
                    "\"Ali (a) is the guardian of anyone that I am the guardian of. O Allah! Befriend anyone who befriends him and be enemies with whoever is his enemy. Abominate whoever abominates him, help whoever helps him, defame whoever disrespects him, and support him with the truth wherever he goes. Deliver these words to those who are absent.\"\n" +
                    "\n" +
                    "After returning from the Hajj, when the glory and power of Islam had grown, the Prophet (s) became sick. Nevertheless, he had prepared an army under the leadership of Osama b. Zayd in order to respond to the Muslims' defeat in the Battle of Muta. However, before this army left for the battle, the Prophet (s) passed away and left this world to meet his Lord. He passed away at a time when he had established unity throughout the entire Arabian Peninsula and had brought Islam to the gates of the two great empires of Rome and Iran.");




          str.add("Honor:\n\n" +
                  "The Prophet (s) lived for forty years amongst the people before he began his mission. During this time, his character showed no signs of any bad qualities. He was known as an honest and trustworthy individual. Afterwards, when the Prophet (s) delivered the message of God, the infidels could not deny the Prophet's (s) virtues, but rather they denied the Qur'anic verses. This matter has been mentioned in the Qur'an as well,\n" +
                  "\n" +
                  "“\t…Yet it is not you that they deny, but it is Allah's signs that the wrongdoers impugn.\t”\n" +
                  "— Quran, 6:33\n" +
                  "Also, it has been quoted that Abu Jahl once said: \"we do not deny you, but rather we deny these verses\".[73] When the Prophet (s) began to deliver the message of God to the Quraysh, he asked them, \"Would you believe me if I told you that [enemy] troops are positioned behind this mountain?\" The audience replied in the affirmative and said: \"Yes, you have never lied to us\". The Prophet (s) then said that he was sent by God to warn them.[74]\n" +
                  "\n" +
                  "In addition to his glorious past, being Arab, and his distinguished tribe and family played a crucial role in the Prophet's (s) status and success. The Quraysh was an important and famous tribe amongst the Arabs. This eminence caused many of the other tribes to acknowledge the Quraysh's superiority over them, and would obey them in some cases. On the other hand, the ancestors of the Prophet (s) (Qusayy b. Kilab, Hashim, and 'Abd al-Muttalib) were known as honorable and distinguished men amongst the Arabs. At the time, the Arab community had a limited cultural relationship with other regions. This caused them to have pride in their Arabism and they were prejudiced against others and would deny their words on the basis that they were not Arabs, ordering them to acknowledge only what was \"theirs'\". This Qur'anic verse probably indicates this fact:\n" +
                  "\n" +
                  "“\tHad We sent it down upon some non-Arab, and had he recited it to them, they would not have believed in it.\t”\n" +
                  "— Quran, 26:198-199\n" +
                  "Since Islam was first presented to the Arabs, being one of them was an advantage for the Prophet (s). This issue has also been mentioned in the Qur'an.\n" +
                  "\n" +
                  "\n\n\n\nConduct:\n\n" +
                  "The greatest quality of the Prophet (s) was his impeccable character and behaviour (Akhlaq). The Qur'an says of him:\n" +
                  "\n" +
                  "“\tand indeed you possess a great character.\t”\n" +
                  "— Quran, 68:4\n" +
                  "It is said that he was quiet and did not speak unless it was necessary. He always opened his mouth slightly and never more than half of it was open. He would smile and never laughed out loud. When he wanted to face someone, he turned his entire body. He loved cleanliness and the smell of perfume. When he would pass somewhere, people would realize that it was him who had passed because of his fragrant smell. He was never arrogant. He lived a simple life, and would sit on the ground to eat food. He never ate his fill and remained hungry on many occasions, especially when he first arrived in Medina. However, he never led a completely ascetic life in the way that many monks did. In fact, he has said that he benefited from the good of this world. His conduct towards Muslims and those of another faith was graceful and chivalrous. His conduct was so pleasant in the eyes of Muslims that they would speak of its details throughout generations. Today, it is the model of their lives and religion.[75]\n" +
                  "\n" +
                  "Imam 'Ali (a) describes the conduct of the Prophet (s) as follows, \"Everyone who met him for the first time was in awe of him. Everyone who was in his company began to love him\"[76]. \"The Prophet (s) would look at his companions equally and never looked at one of them longer than the other\"[77]. \"When he shook hands with someone, he would never withdraw his hand first\"[78].\n" +
                  "\n" +
                  "The Prophet (s) spoke with everyone according to their level of intellect and understanding.[79] He was famous for his forgiveness of those who had wronged him;[80] to the extent that he even forgave Wahshi who was the murderer of his uncle, and Abu Sufyan who had been the archenemy of Islam. He was amicable with everybody, and had the valuable quality of making everyone feel as though they were special to him.\n" +
                  "\n" +
                  "\n\n\n\nAscesis:\n\n" +
                  "The Prophet (s) lived with self-discipline. Throughout his entire life, he did not designate a spot for himself (in a place of superiority whilst sitting with others). In fact, the simple clay rooms that were beside the mosque, belonged to his wives. Their roofs were made of palm wood and the screens that hung at their doors were made of goat or camel hair. He would use a pillow and a leather bed that was filled with palm leaves, over which he slept his entire life. His undershirt was made from a coarse fabric that itched the body and he wore a robe made of camel hair. This was besides the fact that after the Battle of Hunayn, he gifted 4000 camels, more than 4000 sheep, and great amount of gold and silver to various people.\n" +
                  "\n" +
                  "His food was simpler than his house, clothes and property. Months would pass by where no fire was lit in his house for the preparation food. His staple diet consisted of dates and barley bread. He never ate to his fill for two consecutive days, nor would he eat to his fill two times per day. There were many nights where he and his family slept while they were hungry. Once, Fatima (a) brought her father barley bread and said, \"I baked bread and thought that I must bring you some.\" He ate that and said to her, \"This is the only thing that your father has been eating for the past three days.\" Once, he wanted to eat dates in the date garden of one of the Ansar and said, \"This is the fourth day that I haven't eaten anything.\" Sometimes, he would tie a stone to his stomach due to the extremity of his hunger (so that his hunger would be temporarily relieved). Upon his demise, his armor was pledged with a Jew as a security for 30 cups of barley.[81]\n" +
                  "\n" +
                  "\n\n\n\nOrganization and Tidiness:\n\n" +
                  "The Prophet (s) was very organized in his life. After the construction of the mosque, he named every column in the mosque and marked each of them for specific activities; e.g.[82] the column of Wufud, which was the place for delegations and meetings, the column of Tahajjud which was the place for night prayers, and so on. He arranged the lines of the congregational prayer so straight that it was as if he was arranging wooden poles, and once he said, \"O Servants of God! Arrange your lines, otherwise dissent will grow amongst you\"[83]. He was very organized with regards to scheduling his time. He had divided his time into three parts: one for worshipping God, one for personal activities, and one for activities with the people.[84]\n" +
                  "\n" +
                  "He would always look in the mirror to arrange and comb his hair. In fact, he was always well-groomed, not only in front of his family, but also in front of his companions. He would take care of his appearance even while traveling and would always carry five things: a mirror, kohl, a comb, a brush and a pair of scissors.[85]");



          str.add("The faithful should not be [full from] eating, if they are not unaccompanied by their neighbors [who have nothing to eat][86].\n" +
                  "\n" +
                  "The faithful should not ambush anyone to kill them[87].\n" +
                  "\n" +
                  "Faith is not accepted without action, nor is action accepted without faith[88].\n" +
                  "\n" +
                  "One will not succeed in their work without three things: God-wariness to keep him from committing sins, and morals in order to treat people leniently and with patience (with) which they can avoid ill-mannered people[89].\n" +
                  "\n" +
                  "Be patient with people so that you too are treated with forbearance[90].\n" +
                  "\n" +
                  "There are three kinds of people who harm the religion: knowledgeable sinners, tyrant leaders and ignorant religious authorities[91].\n" +
                  "\n" +
                  "The most hated, but permissible action in the eye of God is divorce[92].\n" +
                  "\n" +
                  "Be friends with the poor since they have eminence on the Day of Judgment[93].\n" +
                  "\n" +
                  "The best in the eyes of God are those who have better manners[94].\n" +
                  "\n" +
                  "The most beloved servants before God are those who are the most beneficial to the servants of God[95].\n" +
                  "\n" +
                  "The best of you are the best to your wives[96].");


          str.add("According to the Shi'a school of thought, hadiths (narrations) from the Imams (a) are binding sources for Islamic law and theology in the same way that hadiths from the Prophet (s) are sources of Islamic law. As such, they both need to be followed and observed. In this respect, there is no difference whether the narration comes from the Prophet or the Imams (as the Imams are following the Prophet's tradition and there is no conflict). The four primary sources of hadith for the Shi'as are al-Kafi, al-Tahdhib, Man la yahduruh al-faqih and al-Istibsar. They do not separate the hadiths of the Prophet (s) and Imams (a) from each other, but rather they are grouped together by subject.\n" +
                  "\n" +
                  "However, there are certain books which have collected the hadith of the Prophet (s) only or have dedicated chapters for hadiths of the Prophet (s). Some of these sources include:\n" +
                  "\n" +
                  "Tuhaf al-'uqul 'an al al-Rasul (s): This book was written by Ibn Shu'ba al-Harrani, who was a great Shi'a scholar and jurist of the 4th/10th century. This book is an invaluable collection of narrations and pieces of advice from the Prophet (s) and Imams (a) and even has a dedicated chapter for sayings of the Prophet (s).\n" +
                  "\n" +
                  "Al-Majazat al-Nabawiyya: This book was written by al-Sayyid al-Radi. This collection of the Prophet's (s) hadiths focuses on certain aspects of the Prophet's narrations and groups them in categories like: subtle advice, admonitions, implications and allegories.\n" +
                  "\n" +
                  "Makatib al-Rasul (s): This book was written by Ayatullah Ahmadi Miyaniji, and it contains the letters of the Prophet (s) to kings, officials and agents. It also includes pieces of writing on treaties, contracts and some other miscellaneous issues.\n" +
                  "\n" +
                  "Sunan al-nabi: This book was written by 'Allama Tabataba'i. It aims to give a brief overview of the morals and manners of the Prophet and what is known as the \"conduct of the Prophet (s)\".\n" +
                  "\n" +
                  "Nahj al-fasaha: This book was compiled by Abu l-Qasim Payandih. It is organized into two sections: hadiths and sermons and includes the narrations and sayings of the Prophet (s).\n");

            str.add("The Holy Prophet departed from this world on the 28th of Safar, 11 A.H. Thus ended the life of the Final Prophet sent.\n\n" +
                    "Ali is the only person who gave the Prophet his funeral bath and lowered him in his grave.");

            edesc.add(str);

            str=new ArrayList<>();

            str.add("");
            str.add("");
            str.add("");
            str.add("");
            str.add("");
            str.add("");

            udesc.add(str);





        etitleH.add("Imam Ali ibne Abu Talib (A)");
        utitleH.add("امام علی ابن ابو طالب (ع)");

         img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        images.add(img);


         str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Battles");
        str.add("His Caliphate");
        str.add("Event of ghadeer");
        str.add("Ali in Quran and Hadiths");
        str.add("Moral Virtues");
        str.add("Nahj al-balagha");
        str.add("Companions of Imam Ali (a)");
        str.add("Last Will and Advice");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Battles");
        str.add("His Caliphate");
        str.add("Event of ghadeer");
        str.add("Ali in Quran and Hadiths");
        str.add("Moral Virtues");
        str.add("Nahj al-balagha");
        str.add("Companions of Imam Ali (a)");
        str.add("Last Will and Advice");
        str.add("Martyrdom");

        utitle.add(str);

        str=new ArrayList<>();
        str.add("Imam Ali ibne Abu Talib (A) \n"
                +"(امام علی ابن ابو طالب (ع))"+
                "\n"+

                "is the first Imam of all the branches of the Shi'a, a companion, a narrator, and a scribe of the Qur'an. He is the fourth caliph of the Rightly Guided Caliphs in Sunni Islam. 'Ali (a) is the cousin, and son-in-law of the Prophet (s), the husband of Lady Fatima (a), the father of Imam al-Hasan (a) and Imam al-Husayn (a). The rest of the Imams of the Shi'a are his descendants. According to Shi'i historians and many Sunni scholars, he was born inside the Ka'ba. He was also the first Muslim.\n" +
                "\n" +
                "He is Amir al-Mu'minin\n\n\n\n" +
                "Teknonym:\tAbu l-Hasan, Abu Turab, Abu l-Sibtayn, Abu l-Rayhanatayn, Abu l-A'imma. \n\n"+
                "Born:\tRajab 13, 23 BH/September 28, 600\n\n" +
                "Birthplace:\tKa'ba, Mecca\n\n" +
                "Imamate:\tFrom Safar 28, 11/May 25, 632(for 29 years)\n\n" +
                "Reign:\t656 – 661\n\n" +
                "Martyrdom:\tRamadan 21, 40/January 28, 661 in Mosque of Kufa\n\n" +
                "Cause of Martyrdom:\tWhile performing morning prayer, he was struck with a sword by Abd al-Rahman b. Muljam al-Muradi and martyred from its injury two days later.\n\n" +
                "Burial Place:\tNajaf 31°59′45″N 44°18′52.7″E\uFEFF / \uFEFF31.99583°N 44.314639°E\n\n" +
                "Successor:\tAl-Hasan (a)\n" +
                "(As the Second Imam of the Shia and Caliph, and As the Fifth of Rashidun Caliphate)\n\n" +
                "Father:\tAbu Talib b. 'Abd al-Muttalib\n\n" +
                "Mother:\tFatima bt. Asad\n\n" +
                "Brother(s):\tJa'far, 'Aqil, Talib\n\n" +
                "Spouse(s):\tFatima, Umama, Umm al-Banin, Layla, Asma', Sahba', Khawla\n\n" +
                "Son(s):\tAl-Hasan, al-Husayn, Muhsin, 'Abbas, 'Abd Allah, Ja'far, 'Uthman, 'Ubayd Allah, Abu Bakr, Muhammad, 'Umar,...\n\n" +
                "Daughter(s):\tZaynab, Umm Kulthum, Ruqayya,...\n\n" +
                "Descendants:\tSayyid, 'Alawi\n\n" +
                "Titles:\t\n" +
                "Amir al-Mu'minin (ruler of the believers) Bab Madinat al-Ilm (door to the city of knowledge\")\n" +
                "al-Murtada (the chosen and contented one)\n" +
                "Asad Allah (lion of god)\n" +
                "Haydar (lion)\n\n\n\n" +
                "Based on evidence from the Qur'an, hadith, and history, the Shi'a believe that 'Ali (a) was the direct designated successor of the Prophet (s). Some verses of the Qur'an point to his infallibility. According to Shiite and some Sunni sources, roughly three-hundred verses of the Qur'an were revealed with regards to his virtues. When the Quraysh plotted to assassinate the Prophet (s), it was 'Ali (a) who slept where the Prophet (s) used to sleep, and thus helped the Prophet (s) to secretly leave for Medina. In the pact of brotherhood in Medina, the Prophet (s) chose 'Ali (a) as his brother. Except for the Battle of Tabuk when he stayed in Medina as the deputy of the Prophet (s), 'Ali (a) was with the Prophet (s) in all the battles. He was the most proud commander of Islam.\n" +
                "\n" +
                "After the Prophet's (s) demise, a group of people pledged allegiance with Abu Bakr in Saqifa as the caliph contrary to what the Prophet had explicitly stipulated in Ghadir. 25 years later after the caliphate of Abu Bakr, 'Umar and 'Uthman, 'Ali (a) accepted the caliphate at the overwhelming insistence of the Muslims. During his short rule, he was faced with three rebellions and was ultimately assassinated by one of the Kharijites while praying in the Mihrab (the prayer niche) of the Kufa Mosque, and was then secretly buried in Najaf.\n" +
                "\n" +
                "Ali (a) is considered as the father of many Islamic sciences including Arabic literature, Islamic theology, jurisprudence, and exegesis. Scholars of different sciences have tried to trace back the chain of their hadiths to him. Nahj al-balagha is a selection of his speeches and letters.");

        str.add("Timeline of Imam 'Ali b. Abi Talib (a) life:\n\n" +
                "Mecca\n" +
                "599\tBirth\n" +
                "610\tThe first person who believes in Islam\n" +
                "619\tDemise of Abu Talib (Father)\n" +
                "622\tLaylat al-Mabit: sleeping in the place of the Prophet (s)\n" +
                "Medina\n" +
                "622\tHijra to Medina\n" +
                "624/2\tParticipating in the Battle of Badr\n" +
                "625/3\tParticipating in the Battle of Uhud\n" +
                "626/4\tDemise of Fatima bt. Asad (Mother)\n" +
                "627/5\tParticipating in the Battle of Khandaq and killing 'Amr b. 'Abd Wadd\n" +
                "628/6\tWriting the content of Hudaybiyya peace treaty\n" +
                "629/7\tVictorious of Khiybar castle in the Battle of Khaybar\n" +
                "630/8\tParticipating in Conquest of Mecca and breaking idols by the order of the Prophet (s)\n" +
                "630/9\tSuccessor of the Prophet (s) in Medina in the Battle of Tabuk\n" +
                "632/10\tParticipating in Hajjat al-Wida'\n" +
                "632/10\tEvent of Ghadir\n" +
                "632/11\tDemise of the Prophet (s) and his burial by Imam 'Ali (a)\n" +
                "Three caliphs period\n" +
                "632/11\tIncident of Saqifa and beginning of Caliphate of Abu Bakr\n" +
                "632/11\tMartyrdom of Lady Fatima (a)\n" +
                "634/13\tBeginning of Caliphate of 'Umar b. al-Khattab\n" +
                "644/23\tParticipating in Six-Member Council\n" +
                "644/23\tBeginning of Caliphate of 'Uthman b. 'Affan\n" +
                "Caliphate\n" +
                "655/35\tBeginning of his Caliphate\n" +
                "656/36\tThe Battle of Jamal\n" +
                "657/37\tThe Battle of Siffin\n" +
                "658/38\tThe Battle of Nahrawan\n" +
                "661/40\tMartyrdom\t\n\n\n\n" +
                "From Birth to Hijra:\n\n" +
                "Imam 'Ali (a) was born inside the Ka'ba in Mecca on Friday, Rajab 13, in the thirtieth year after the year of the elephant (23 BH/September 28, 600 CE).[18] His birth inside the Ka'ba is widely accepted (Mutawatir) by many Shi'a scholars (including al-Shaykh al-Saduq, al-Sayyid al-Radi, al-Shaykh al-Mufid, Qutb al-Rawandi, and Ibn Shahrashub) and many Sunni scholars (including al-Hakim al-Nishaburi, al-Hafiz al-Ganji al-Shafi'i, Ibn al-Jawzi al-Hanafi, Ibn Sabbagh al-Maliki, al-Halabi, and al-Mas'udi.)[19]\n" +
                "\n" +
                "When Ali (a) was 6 years old (17 BH/606 CE), there was a famine in Mecca. Abu Talib had a large family and supporting them was difficult, especially during the famine. Therefore, Prophet Muhammad (s) and his uncle, al-'Abbas, decided to help Abu Talib and his family by taking care of his children. Therefore, al-'Abbas took Ja'far, and Prophet Muhammad (s) took 'Ali (a).[20] Ali (a) would speak of those days fondly:\n" +
                "\n" +
                "\"When I was a young child, the Prophet (s) took care of me. He would bring me to his chest and I would sleep in his bed, so close to him that I could even smell his scent. He would chew food for me and then feed me with it. He found no lies in my speech, nor any shortcomings in my actions.\"[21]\n" +
                "When the Prophet's mission began in 13 BH/610, Ali (a) was the first man and Khadija (a) was the first woman to have accepted the Prophet's call and believed in him.[22] Ali (a), who was ten years old at the time, would pray with the Prophet (s) on the mountains around Mecca.[23] When the Prophet (s) announced his mission publicly, in the event of Warning the Close Kin, Ali (a) supported him and, in response, the Prophet (s) called Ali his brother, wasi (executer of his will), and successor.[24]\n" +
                "\n" +
                "In 6 BH/615, the Muslims were besieged in the valley of Abu Talib by the polytheists and were prohibited from trade and placed under curfew. In this period and in several occasions, Abu Talib ordered Ali (a) to sleep where the Prophet (a) used to sleep in order to preserve the Prophet's life.[25] Shortly after the siege ended, Ali (a) lost his father in 4 BH/619.[26] With the demise of Abu Talib, the situation became more difficult for the Muslims, and the Prophet (s) decided to emigrate to Medina. The Prophet (s) was informed of the conspiracy of the polytheists to murder him on the night he had planned to embark on his emigration, so Ali (a), 23 years old at the time, slept where the Prophet (s) used to sleep so that the Prophet (s) could secretly leave his house, which was under surveillance by the polytheists.[27] A few days later, and after paying the Prophet's (s) debts, Ali (a) emigrated to Medina together with a group of people among whom were his mother Fatima bt. Asad and Lady Fatima (a) the Prophet's daughter. [28]\n" +
                "\n\n\n\n"+
                "After Hijra:\n\n" +

                "When the Prophet (s) reached Quba region on his way to Medina, he waited fifteen days so that Ali (a) joins him.[29] In Medina and after he constructed his mosque, the Prophet (s) set up the formal pact of brotherhood between the Helpers and the Immigrants; however, he chose Ali (a) as his brother.[30] In 2/624, in the Battle of Badr between the Muslims and the polytheists of Mecca, a large number of the latter's troops, including some of the chiefs of Quraysh, were killed by Ali (a).[31] After the battle,[32] Ali (a) at the age of 25 married Fatima (a) the daughter of the Prophet (s),[33] despite the fact that there were several prominent figures who had proposed marriage to her.[34] The Prophet (s) himself solemnized their marriage.[35]\n" +
                "\n" +
                "In 3/625, the polytheists of Mecca waged the battle of Uhud against the Muslims to compensate their defeat in the Battle of Badr.[36] In this Battle, Ali (a) was among the few ones who did not flee the battleground and protected the life of the Prophet (s).[37] It is reported that He was severely wounded sixteen times in that battle.[38] Al-Kulayni and al-Tabari mention that the well-known formula \"There is no sword but Dhu l-Faqar and no man of courage but Ali\" was said in this battle in praise of Ali (a).[39] In the same year, Ali's (a) first child, al-Hasan (a), was born. [40]\n" +
                "\n" +
                "In 4/626, when Ali (a) was 27, his mother Fatima bt. Asad passed away.[41] Ali's (a) second child, al-Husayn (a), was born in this year.[42] In 5/627, the Battle of Khandaq took place,[43] which ended with the bravery of Ali (a) in killing 'Amr b. 'Abd Wadd.[44] The third child of Ali (a) and Fatima (a), Zaynab (a), was born in the same year.[45]\n" +
                "\n" +
                "In 6/628 AH, the treaty of Hudaybiyya was signed between the Prophet (s) and the Quraysh, whose scribe was Ali (a).[46] In this year, Umm Kulthum, Ali's (a) fourth child was born.[47] In the Sha'ban of the same year, the Prophet (s) sent Ali (a) on a preemptive battle against some of the people of Fadak who had planned to support the Muslims' enemies. [48] In 7/628, the Battle of Khaybar took place.[49] Ali (a) was one of the flag-bearers of the Muslim army,[50] which was able to conquer Khaybar under his leadership.[51] In 8/630, Ali (a), 31 years old at the time, was among the flag-bearers of the Muslim army in the conquest of Mecca.[52] He helped the Prophet (s) destroy the idols in Ka'ba.[53]\n" +
                "\n" +
                "In 9/630, the Battle of Tabuk took place, and the Prophet (s) left Ali (a) as his successor in Medina. This was the only battle in which Ali (a) was not present.[54] When certain rumors were disseminated by the Hypocrites as to the reason why Ali (a) was left in Medina, Ali (a) joined the Prophet (s), who had left Medina with the Muslim army, and informed him about the rumors. In response, the Prophet (s) told him, \"Aren't you happy that you are to me like Aaron to Moses?\"[55] This saying came to be known as the Hadith al-Manzila.[56] In the same year, Ali (a) was sent by the Prophet (s) on the mission to proclaim the first verses of Quran 9 to the polytheists.[57] Ali (a) accomplished the mission in the afternoon of Eid al-Adha.[58] On Dhu l-Hijja 24, 9/April 3,631,[59] the Prophet (s), together with Ali (a), Fatima (a), al-Hasan (a), and al-Husayn (a) engaged in mubahala with a Christian delegation from Najran.[60]\n" +
                "\n" +
                "In 10/632, the Prophet (s) send Ali (a) on a mission to call the people of Yemen to Islam.[61] In the same year, the Prophet went on his last pilgrimage to Mecca,[62] and Ali joined him in Mecca from Yemen.[63] After the hajj, on his way back to Medina in an area called Ghadir Khumm, the Prophet (s) proclaimed Ali to be his successor and the executor of his will.[64] This event is known as the Event of Ghadir Khumm. Ali (a) was 33 years old at the time.\n" +
                "\n\n\n\n\n" +
                "After the Prophet (s):\n\n" +
                "The Prophet (s) passed away on Safar 28, 11/May 25, 632,[65] and after his demise, the rightful successor of the Prophet (s) and the leader of the Muslim community, according to the Shia, was Ali (a). However, when Ali (a) was occupied with performing the burial rituals and ceremony for the Prophet (s), a group of the Companions gathered in Saqifa and elected Abu Bakr as the caliph and successor of the Prophet (s). Ali (a) initially refused to pledge his allegiance to Abu Bakr,[66] but he did so afterwards.[67] The Shiite scholars maintain that the allegiance was pledged under compulsion,[68] and some scholars, such as al-Shaykh al-Mufid, hold that the Imam (a) never pledged his allegiance to Abu Bakr.[69] The Shia also maintain that the companions of Abu Bakr invaded Ali's (a) house to force him to pledge allegiance,[70] during which incident Fatima (a) was hurt and had a miscarriage.[71] Abu Bakr also confiscated Fadak,[72] to which Ali (a) objected in defense of Fatima (a).[73] The invasion of the Imam's (a) house resulted in Fatima's (a) illness, and led to her martyrdom in 11/632.[74]\n" +
                "\n" +
                "Abu Bakr passed away in 13/634.[75] Before his death, he appointed Umar as his successor.[76] In Muharram, 14/March, 635, Umar embarked on a military expedition against the Sasanids. He camped in an area called Sirar, but some prominent figures, including Imam Ali (a), advised him to remain in Medina, so he returned and sent Sa'd b. Abi Waqqas to the battle in his place.[77] Ibn Athir reports that Ali (a) was a judge during the caliphate of Umar, except in its first few years.[78]\n" +
                "\n" +
                "In 16/637 (or 17/638),[79] upon Ali's (a) suggestion, Umar set the year of the emigration of the Prophet (s) to Medina as the beginning of the Islamic calendar.[80] In 17/638, Umar led a military expedition to conquer Jerusalem and announced Ali (a) as his successor in Medina.[81] In the same year,[82] after insistence and threatening, Umar married Umm Kulthum the daughter of Imam Ali (a).[83] It is reported that Umar announced Ali (a) as his successor in Medina in 18/639 as well, when he decided to travel to Syria.[84]\n" +
                "\n" +
                "When Umar was assassinated in 23/644 and before his death,[85] he appointed a council of six members, including Imam Ali (a), to choose the next caliph.[86] Umar also granted Abd al-Rahman b. Awf a decisive vote in the council. Abd al-Rahman first asked Imam Ali (a) whether he was ready to accept the caliphate with the condition of acting according to the Qur'an and according to the conduct of the Prophet (s), Abu Bakr, and Umar. The Imam (a) refused to accept the condition of acting according to the conduct of the first two caliphs and said, \"I hope I will act according to the book of God and the conduct of the Prophet to the extent of my knowledge, capacity, and ijtihad.\"[87] Abd al-Rahman then asked Uthman the same question; Uthman accepted the condition, and thus became the next caliph after Umar.[88]\n" +
                "\n" +
                "Ibn Jawzi reports that Ali (a) continued to be a judge in 24/645.[89] In 25/646, Uthman commanded that the copies of the Qur'an be collected and unified, for which decision, according to al-Suyuti, he consulted Ali (a).[90] In 26/647, Ali's (a) fifth son, al-'Abbas (a), was born.[91]\n" +
                "\n" +
                "In 35/656, public dissatisfaction with Uthman's conduct reached its peak, and a group of people besieged his house.[92] Prior to this incident, Imam Ali (a) had reportedly left Medina to Yanbu' per Uthman's request.[93] However, the Imam (a) asked al-Hasan (a) and al-Husayn (a) to protect the caliph.[94] Notwithstanding, the rebels murdered Uthman, and afterward, the people gathered around Imam Ali (a), urging him to accept the caliphate.[95]");




        str.add("Battle of Badr: The First Fight of Islam\n\n" +
                "The battle of Badr was remarkable in more ways than one. It demonstrated the great devotion of the disciples to the cause and their complete faith in the Prophet and his mission. Ranged before them in the Mencan ranks were many of their close relatives, their own sons, fathers, or uncles. Thus, the Prophet's uncle 'Abbas, 'All's brother 'Aqil, Abu Bakr's son, Hudhaifa's father and 'Umar's maternal uncle, to name a few, figured in the Meccan army. Yet the disciples never faltered. Personal feelings and sentiments were subordinated to the supreme cause. Such was the material from which Islam arose. The battle also proved that mere numerical superiority and matching valor are of no avail if the cause is not righteous. God helps those who make sacrifices in His cause.\"+\n" +
                "\n" +
                "                    \"\\n\\n\\n\\nBattle of Ohodh:\\n\\n\"+\n" +
                "                    \"The Battle of Uhud (Arabic:غزوة اُحُد) was a famous Ghazwa of Prophet Muhammad (s) against the polytheists of Mecca in 3/625. Quraysh marched out toward Medina, as they desired to avenge their losses in the Battle of Badr while Abu Sufyan was the commander of the army. Prophet Muhammad (s) and senior members of Ansar and Muhajirun planned to fight against Quraysh within Medina and never left the city; on the other hand young Muslims and also Hamza b. 'Abd al-Muttalib, Prophet's uncle, were willing to fight outside the city. Finally Prophet Muhammad (s) decided to accept the wishes of the latter. At first, Muslims defeated Meccans, but a part of Muslim archers having 'Abd Allah b. Jubayr as their commander on Mount 'Aynayn on the left flank of Uhud, left their assigned posts and faced a surprise attack from Meccans which led to defeat of Muslims. They faced a serious defeat with approximately 70 martyred Muslims including Hamza b. 'Abd al-Muttalib who got mutilated, even Prophet Muhammad (s) was badly injured on his face and his tooth.\"+\n" +
                "\n" +
                "                    \"\\n\\n\\n\\nBattle of Khandaq:\\n\\n\"+\n" +
                "                            \"The Battle of Khandaq (Arabic: غزوة الخندق, Battle of the Trench) or The Battle of Aḥzāb (Arabic: غزوة الأحزاب, Battle of the Confederates) took place in the fifth year of Hijra/627. It initially broke out by the stratagem of Banu Nadir tribe. Quraysh tribe became united with all its allies including polytheist 'Arab tribes in order to eradicate Islam. The number of their soldiers was ten thousand, yet Muslim army was only three thousand soldiers.\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"Banu Qurayza tribe had promised to be impartial in case of war; nevertheless, they violated the contract and became confederate with the unbelievers. To take up arms against the unbelievers, Muslims dug a trench around Medina, an idea from Salman al-Farsi. The war terminated by Muslim's victory and the army of polytheists had to withdraw.\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"During the battle, 'Amr b. 'Abd Wudd, eminent for his great valor and bravery, proceeded the trench along with some other warriors and threw down the challenge that who would dare to fight with him?\\n\" +\n" +
                "                    \"\\n\" +\n" +
                "                    \"Muslims remained silent, while they were overwhelmed with panic. Ultimately, 'Ali (a) volunteered and went for the challenge with the Prophet (s)'s consent. He succeeded to take 'Amr's life. This had such a huge positive impact on Muslim's spirit that led to them triumphing over the enemy. \\\"'Ali's stroke was superior to any jinn's or human's (thaqalayn) worship\\\", said Prophet Muhammad (s).\"+\n" +
                "\n" +
                "\n" +
                "                    \"\\n\\n\\n\\nBattle of Khaiber:\\n\\n\" +\n" +
                "                    \"Battle of Khaybar (Arabic: غزوة خیبر) was a battle or ghazwa by the Prophet Muhammad (s) against Jews of Khaybar region that began in Muharram of 7/628 and ended with the victory of Muslims in Safar of the same year. The battle started because Jews in Khaybar had given refuge to Jews who were expelled from Medina and incited some Arabian tribes against Muslims. Muslims won the battle and according to a treaty between Jews and the Prophet (s) they were to leave the region with their families; in the second treaty the Prophet (s) agreed that they stay in the region and continue their agriculture but pay half of their benefit to Muslims instead.\"\n" +
                "\n" +
                "                    \"\\n\\n\\n\\nVisit to Mecca:\\n\"+\n" +
                "                            \"According to the terms of the treaty with the Meccans, the Muslims could visit Mecca the next year. Towards the end of the seventh year of Hijra (March 629 C.E.) the Prophet, accompanied by about two thousand Muslims, proceeded to Mecca to make the lesser pitgrimage (the 'umrah). The Quraish left their houses and watched the Muslims from their tents pitched on the heights- of the surrounding hills. After three days' sojourn, the Muslims retired strictly in accordance with the terms of the treaty.\"+\n" +
                "\n" +
                "\n");




        str.add("In Dhu l-Hijja, 35/June, 656 and after the assassination of Uthman, Ali (a) became the caliph and the leader of the Muslim ummah.[96] Except some of the close people to Uthman and some Companions (the Qa'idun \"the sitting ones\"), all the Companions in Medina pledged their allegiance to Imam Ali (a). Two days after the beginning of his caliphate, in his first sermon, Ali (a) urged that all the wealth and properties that had been unjustly taken must be returned, and emphasized justice with regard to the distribution of public properties and wealth.\n" +
                "\n" +
                "In 36/656, Talha b. Ubayd Allah and Zubayr b. Awam broke their allegiance to Ali and headed to Mecca to join Aisha, who had called for revenge against the murderers of Uthman. With their supporters, Aisha, Talha, and Zubayr left Mecca for Basra to start the Battle of the Camel, the first civil war in the Muslim community. The battle broke out near Basra between Imam Ali (a) and the Nakithun (“Those Who Broke Their Allegiance”) and ended with the latter'a defeat. Talha and Zubayr were killed and A'isha was sent to Medina. The Imam (a) went to Basra and declared general amnesty. Then, in Rajab 36/January [[657 CE|657], he entered Kufa and made the city his capital.\n" +
                "\n" +
                "In the same year, Imam Ali (a) called Mu'awiya to pledge his allegiance to him. When Mu'awiya rebelliously refused to recognize the Imam's caliphate, Imam Ali (a) decided to remove him from the governorship of Syria and embarked on a military expedition to Damascus against Mu'awiya in Shawwal 36/April 657. Thus, a battle that took place between the two parties in an area called Siffin (hence the name \"the Battle of Siffin\") towards the end of the year 36/657 and the beginning of 37/657. Some scholars maintain that unlike what al-Tabari and Ibn Athir have mentioned, the peak of the war was in 38/658, not in Safar 37/August 657. As the army of the Imam (a) was about to win the battle, Amr b. al-'As advised Mu'awiya to have his troops lift copies of the Qur'an on their lances and call the army of Ali (a) to the Quran's arbitration. Under the pressure of his army, the Imam (a) accepted the arbitration and was forced to introduce Abu Musa al-Ash'ari as the arbitrator from his side. However, shortly after the Imam's acceptance of the arbitration, a number of his troops objected to his decision and, referring to Qur'an 5:44 and 49:9, demanded that the war with Mu'awiya should continue. They considered the acceptance of arbitration an act of apostasy, from which they repented. While some of them were among the ones who had forced the Imam (a) to accept the arbitration, the objectors demanded that the Imam (a) also must repent and violate his agreements with Mu'awiya. The Imam (a) rejected their demands and announced that he would continue the war with the Syrian army if the two arbitrators did not arbitrate based on the Qur'an.\n" +
                "\n" +
                "During the arbitration, Amr b. al-'As, the arbitrator from Mu'awiya's side, deceived Abu Musa into announcing that they had agreed on the removal of both Mu'awiya and Ali (a) from power. When Abu Musa announced so, Amr rose and announced that he also removed Ali (a) from power but made Mu'awiya the sole ruler of the Muslim community. The Imam's (a) companions objected to the arbitration, and some of them, who later formed the first Kharijites, considered the acceptance of the arbitration an act of apostasy, left the Imam's army, and gathered in Harura instead of returning to Kufa.\n" +
                "\n" +
                "The objections of the Kharijites continued for six months. Imam Ali (a) sent 'Abd Allah b. al-'Abbas and Sa'sa'a b. Sawhan to talk to them and convince them to end their protest—a request which the Kharijites refused. Afterwards, the Imam (a) asked them to choose twelve people for a dialogue with twelve representatives of the Imam (a). He also wrote a letter to the leaders of the Kharijites and asked them to return to the community, but 'Abd Allah b. Wahb, one of the Kharijite leaders, reminded the Imam (a) that he had committed an act of apostasy and must repent. The Imam (a) also called the Kharijites several more times through prominent figures such as Qays b. Sa'd b. 'Ubada and Abu Ayyub al-Ansari to return and granted them amnesty if they did so. However, when none of the solutions worked, Imam Ali (a) decided to confront them with an army of fourteen thousand men. The two armies met in an area called Nahrawan. Imam Ali (a) emphasized that his troops should not begin the battle. So the Kharijites started the battle and were soon defeated; all of them were either killed or wounded, whereas only less than ten soldiers from the Imam's (a) army were killed in the battle. The wounded (about 400 men) from the Kharijites were given to their families. Only ten Kharijites could flee the battleground, one of whom was Abd al-Rahman b. Muljam al-Muradi, the assassinator of Imam Ali (a). Ibn Muljam attacked the Imam (a) on the eve of Ramadan 19, 40/January 26, 661 in the mosque of Kufa and wounded him with his poisoned sword. Two days later, on Ramadan 19/January 28, Imam Ali (a) was martyred at the age of 63[97] and was secretly buried.\n");



        str.add("\n" +
                "In 10/632, the Prophet (s) decided, for the first time after migration, to perform hajj al-tamattu'.[135] He informed the Muslims of his decision, and many of them decided to accompany him on the pilgrimage.[136] The Prophet (s) also wrote a letter to Ali (a), who was on an expedition to Yemen,[137] and called him to hajj.[138]\n" +
                "\n" +
                "When the hajj ended, on the way back to Medina, in an area called Ghadir Khumm, where people would part and go to their respective towns, God commanded the Prophet (s) to stop and proclaim to the people the message that He had given him.[139]\n" +
                "\n" +
                "The Prophet (s) performed the noon prayer and then delivered a sermon. In his sermon, he asked the Muslims, \"Do you not know that I am closer to the believers than their own soul?\"[140] The people said, \"Yes indeed, we know.\" Then the Prophet (s) raised the hand of Ali (a) and stated, \"For whomever I am the master, Ali will be his master. O God! Support whomever supports him, and be the enemy of whomever shows enmity to him.\"[141][142] It is reported that some of the Companions asked the Prophet, \"Is this the command of God and His Prophet (s)?\" and the Prophet answered, \"Yes, this is the command of God and His messenger.\"[143] When Prophet Muhammad (s) finished his sermon, a number of Companions, such as Umar b. al-Khattab, congratulated Ali (a).[144]\n" +
                "\n" +
                "According to Shiite and some Sunni commentators, the verse \"Today I have perfected your religion for you, and I have completed My blessing upon you, and I have approved Islam as your religion\" (Qur'an 5:3) was revealed on this day.[145]\n" +
                "\n" +
                "After the demise of the Prophet (s), Imam Ali (a) reminded the people of this event on several occasions and of the sayings of the Prophet (s) in Ghadir Khumm to emphasize his right to caliphate.[146] Considering the context and the details of this event and other evidence (including the subsequent conversations and poems related to the event), the Shia believe that the message that the Prophet (s) delivered on the day of Ghadir was clearly the appointment of Imam Ali (a) as his successor by God's command.");



        str.add("Virtues of Imam Ali (a) and his distinctive characteristics are reported in the Quran, Hadith, and historical sources. The Prophet (s) is reported to have said that the virtues of Ali (a) are innumerable. According to another hadith, retelling, writing, and listening to the virtues of Imam Ali (a) brings about forgiveness of sins.\n" +
                "\n" +
                "Imam Ali's virtues are of two types: exclusive virtues and virtues shared by the other members of Ahl al-Bayt (a). The Verses Wilaya, Sale, and Almsgiving, the hadiths of Ghadir, Tayr, Manzila, his birth inside the Ka'ba, and his giving charity while he was in the ruku' of his prayer are among his exclusive virtues.\n" +
                "\n" +
                "During the Umayyad rule, retelling the virtues of Imam Ali (a) was banned, and those who related them were persecuted. Moreover, Mu'awiya would encourage people to fabricate virtues for other Companions of the Prophet (s) parallel to those of Imam Ali (a).\n" +
                "\n" +
                "Nevertheless, numerous virtues have been recorded in Shiite and Sunni hadith collections for Imam Ali (a). Many Shiite and Sunni scholars also composed monographs on the virtues of the Imam (a), such as Fada'il Amir al-Mu'minin (The Virtues of the Commander of the Faithful) by Ibn Hanbal, Khasa'is Amir al-Mu'minin (Exclusive Virtues of the Commander of the Faithful) by al-Nasa'i, and Umdat uyun sihah al-akhbar fi manaqib Imam al-Abrar (The Major Springs of Authentic Reports on the Virtues of the Leader of the Righteous) by Ibn Bitriq." +
                "\n\n\n\n\n\n" +

                "In the Quran:\n\n" +
                "A number of Quranic verses are revealed about Imam Ali (a) and his virtues. Ibn Abbas is reported to have said that the amount of Quranic verses that were revealed about Ali (a) is more than those revealed about any other Companion. Ibn Abbas also reported that the Prophet (s) said, \"God revealed no verse beginning with the expression 'O you who believe' but Ali is the head and commander of those believers.\" Some scholars have counted more than 300 verses praising Imam Ali (a). Among the Imam's virtues in the Quran are the following:\n" +
                "\n" +
                "\n\nThe Wilaya Verse (Quran 5:55), which speaks of the wilaya of God, the Prophet (s), and those believers who establish prayer and pay zakat while in ruku'. According to Shiite and Sunni commentators, this verse was revealed when Imam Ali (a) gave his ring, while he was in the ruku' of his prayer, to a poor man. (see: Giving Ring as Charity)\n" +
                "\n\nThe Sale Verse (Quran 2:207) praises those who are ready to sacrifice their lives seeking God's pleasure. According to the Mu'tazilite scholar Ibn Abi l-Hadid, all commentators believe that this verse was revealed on the occasion of Laylat al-Mabit, when the polytheists planned to invade the Prophet's house and murder him. On that night, in order to preserve the Prophet's life, Imam Ali (a) slept where the Prophet (s) used to sleep.\n" +
                "\n\nThe Proclamation Verse (Quran 5:67), in which God instructs the Prophet (s) to deliver a message to people and declares that if he does not deliver the message, he has failed to accomplish his mission. Shiite and Sunni commentators have reported that this verse was revealed when the Prophet (s) was returning from his last pilgrimage and on the occasion of Ghadir.\n" +
                "\n\nThe Perfection Verse (Quran 5:3) speaks of the perfection of Islam on a specific day. Based on historical reports and hadiths, Shiite commentators have argued that this day was the day of Ghadir when the Prophet (s) proclaimed that Ali (a) would be the leader of the Muslim community after him and thus Islam was perfected by the imamate of Ali (a).\n" +
                "\n\nQuran 9:119 commands the believers to \"be with the honest.\" In Shiite traditions it is stated that \"the honest\" is a reference to Ahl al-Bayt (a), including Imam Ali (a).\n" +
                "\n\nQuran 98:7 states that those who believe and do righteous deeds are the best of creation. According to Shiite and Sunni hadiths, these are Imam Ali (a) and his followers.\n" +
                "\n\nQuran 66:4 states that God, Gabriel and other angels, and \"the righteous among the faithful\" support the Prophet (s). According to a number of Shiite and Sunni hadiths, Imam Ali (a) is meant by the expression \"the righteous among the faithful.\"\n" +
                "\n\nQuran 2:274 speaks of \"those who give their wealth by night and day, secretly and openly,\" and states that such people \"shall have their reward near their Lord.\" According to commentators, this verse was revealed about Ali (a), who had four dirhams and gave one of them for the sake of God at night, one during the day, one secretly, and one openly.\n" +
                "\n\nQuran 58:12 commanded the believers to give charity when they wanted to talk secretly to the Prophet (s). Al-Tabrisi reports that according to most Shiite and Sunni commentators Ali (a) was the only person who obeyed this command." +

                "\n\n\n\n\n\n\n" +
                "In Hadiths:\n\n" +
                "Among the hadiths that mention virtues of Imam Ali (a) are the following:\n" +
                "\n\nHadith al-Ghadir: On the Prophet's (s) return from his last pilgrimage in a place called Ghadir Khumm, the Prophet (s) stopped and in a sermon introduced Ali (a) as the mawla of all Muslims. There is no disagreement among Muslims regarding the authenticity of this report, but they disagree as to the meaning of the word mawla. Shiite scholars have argued that it is clear from the context that mawla means \"master\" or \"guardian,\" and thus the Prophet (s) meant to appoint Ali (a) as his successor and the leader of the Muslim community after himself.\n" +
                "\n\nHadith al-Manzila: the Prophet (s) stated that the relation between him and Ali (a) was like the relation between Aaron and Moses.\n" +
                "\n\nHadith Madinat al-'Ilm: in a famous hadith, which is considered authentic by at least twenty-one Sunni hadith scholars, the Prophet (s) stated that he (s) is the city of knowledge and Ali (a) was its gate.\n" +
                "\n\nHadith Yawm al-Dar: According to this hadith, which is recorded in Shiite and Sunni sources, when the Prophet (s) invited his relatives to accept Islam, he declared that Ali (a) would be his legatee and successor. Shiite theologians have referred to this hadith as evidence for the imamate and caliphate of Imam Ali (a).\n" +
                "\n\nHadith al-Wisaya: According to this hadith, the Prophet (s) introduced Ali (a) as his legatee. This hadith also has been regarded as indicating the imamate of Ali (a).\n" +
                "\n\nHadith al-Wilaya: In this hadith, the Prophet (s) says, \"Ali is the wali of every believer after me.\" Shiite scholars argue that the word \"wali\" in this hadith cannot have meanings such as friend or helper, because Ali (a) was a helper and friend of believers during the Prophet's lifetime as well and there is no point in restricting this characteristic of Ali (a) to the time after the Prophet (s). Therefore, wali in this hadith means \"guardian\" which indicates the imamate of Ali (a).");



        str.add("\n" +
                "Kind Ruler:\n" +
                "\n" +
                "Who was the one who coupled politics and morals? \n" +
                "Which ruler never used even the slightest portion of state property for himself and would secretly give food for poor families at nights?\n" +
                "It was Ali only.(A) \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Kindness to Children:\n" +
                "\n" +
                "Imam `Ali (A.S.) was very kind to children, especially to orphans. If he ever saw an orphan crying, he would stop whatever he was doing bend down and give the child his salam.\n" +
                "Wipe away the child's tears, put his hand on the child's shoulder and say, \"My child, why are you crying? Has someone hurt you? Come, let me take you to my house.\" `Ali (A.S.) would take the child home and treat him better than any father.\n" +
                "He would bring the child sweets, cakes, and honey and put them in the child's mouth himself. Imam `Ali used to tell his followers to love and be kind to orphans, especially the orphans of martyrs killed in the path of Allah. \"They have lost their loving fathers,\" he used to say.\n" +
                "\"So cheer them up and look after them just like a father. \"Their fathers were martyred in jihad and for the sake of Islam and they have rights on you. Make their souls pleased with you by cheering up their children and looking after them.\"\n" +
                "Imam Ali was always attentive to orphans especially to those of the martyrs Re used to visit them and sit and chat and play with them He used to take care of their education and training.\n" +
                "He would strive to solve their difficulties and always offered them guidance and advice. He would bring them gifts and, if they were poor, he would respectfully provide their expenses.\n" +
                "Imam `Ali (A.S.) was so kind to orphans and laid so much stress on them in his teachings that one of his companions said: \"How I wish that I too was a young orphan so that I would receive kindness and love from Imam 'Ali (A.S.)\n" +
                "Love and be kind to children, especially orphans.\n" +
                "\n");







        str.add("Nahj al-balagha is the most famous collection of some of Imam 'Ali's (a) sayings and writings which has been compiled by al-Sayyid al-Radi, a scholar who lived in the fourth/tenth century. It is one of the most sacred Shi'a texts and widely considered to be the greatest literary text in Arabic, after the Quran. The book is divided into three sections: sermons, letters, and some short sayings which have all been attributed to 'Ali (a):\n" +
                "\n\n" +
                "Sermons: 239 sermons which are divided into three parts based on their time in history\n" +
                "Letters: 79 letters of which almost all of them were written during his caliphate\n" +
                "Qisar or qisar al-hikam (maxims): 480 sayings\n" +
                "Some commentaries on Nahj al-balagha include:\n" +
                "\n" +
                "Commmentary of Ibn Maytham al-Bahrani,\n" +
                "Commentary of Ibn Abi l-Hadid\n" +
                "Commentary of Muhammad 'Abduh\n" +
                "Commentary of Muhammad Taqi Ja'fari,\n" +
                "Commentary of al-Fakhr al-Razi,\n" +
                "Minhaj al-Bara'a by Qutb al-Din al-Rawandi,\n" +
                "Minhaj al-bara'a by Mir Habib Allah al-Khu'i,\n" +
                "Commentary of Muhammad Baqir Nawwab Lahijani.[260]\n" +
                "Ghurar al-hikam wa durar al-kalim\n\n" +
                "Ghurar al-hikam wa durar al-kalim was compiled by 'Abd al-Wahid b. Muhammad al-Tamimi al-Amidi, a scholar of the sixth/twelfth century. In this book, almost 10,760 hadiths of Imam 'Ali (a) have been organized alphabetically by subjects of theology, worship, morality, politics, economy, and society.[261]\n" +
                "\n" +
                "Dastur ma'alim al-hikam wa ma'thur makarim al-shiyam\n" +
                "Dastur ma'alim al-hikam wa ma'thur makarim al-shiyam was compiled by Qadi al-Quda'i. He was a Shafi'i scholar who lived in the fourth/tenth century and was considered to be reliable among traditionists. Some scholars regard him as a Shi'a.[262]\n" +
                "\n" +
                "The book is divided into nine chapters: 'Ali's (a) beneficial maxims, his denunciation of this world, his aversion to it, his sermons, his advice and prohibitions, his answers to questions, his peculiar words, his rare words, his prayers and supplications, and a poem attributed to him.[263]\n" +
                "\n\n\n\n" +
                "Collection of Poems:\n\n" +
                "Main article: Collection of Poems of Imam 'Ali (a)\n" +
                "The poems attributed to Imam Ali (a) are collected in one book and published repeatedly by various publications.\n" +
                "\n\n\n\n" +
                "Writings:\n\n" +
                "In Shiite and some Sunni sources the following written sources are attributed to Imam Ali (a):\n" +
                "\n" +
                "Jafr and Jami'a Jafr and Jami'a are the titles of two hadith collections in which Imam Ali (a) wrote down the hadiths that the Prophet (s) dictated to him. These two books are from the Trusts of Imamate and the sources of an Imam's knowledge. The content of Jafr is an account of the future events until the Day of Judgment. According to Imam al-Kazim (a), only the Prophet (s) and his successors can read this book.\n" +
                "\n" +
                "Jami'a also contain the news of the past and future events until the Day of Judgment, as well as the esoteric meanings of all Quranic verses and the names of the Imams from the family of the Prophet (s) and what happens to them. A number of people saw the book of Jami'a.\n" +
                "\n" +
                "Mushaf Ali Mushaf Ali refers to the first complete copy of the Qur'an, which was transcribed by Imam Ali (a) after the Prophet's (s) demise. This copy is not available today, but it is reported that the order of the Quranic chapters was based on the order of the revelation and that the occasion of the revelation of the verses and also information about the abrogated and abrogating verses were recorded in it. The Shia believe that this copy of the Qur'an has been with the Infallible Imams (a), and today it is with the Twelfth Imam (a).\n" +
                "\n" +
                "Mushaf Fatima Mushaf Fatima is the title of a book whose content was conveyed by an angel (Gabriel, according to some hadiths) to Lady Fatima (a) and transcribed by Imam Ali (a). The book contains an account of the future events and of the place of the Prophet (s) in Paradise. This book also has been with the Infallible Imams (a) and it is with the Twelfth Imam (a) today; no other person has had or will have access to this book.");



        str.add("Salman al-Farsi was among the best friends of the Prophet (s) and 'Ali (a). Many hadiths about him have been quoted from the infallibles (a).[264] For example, once the Prophet (s) said, \"Salman is one of us, the Ahl al-Bayt (a).\"[265]\n" +
                "\n\n" +
                "Abu Dhar al-Ghifari (Jundab b. Junada) was the fourth person who converted to Islam. He became 'Ali's (a) defender after the demise of the Prophet (s).[266] He was among the few who refused to pledge allegiance with Abu Bakr.[267]\n" +
                "\n\n" +
                "Miqdad b. 'Amr (Miqdad b. Aswad al-Kindi) was among the seven people who believed in the Prophet (s) from the beginning of his mission and became Muslim. After the Prophet (s) passed away, Miqdad did not pledge allegiance with Abu Bakr and sided with 'Ali (a) during the 25 years before he assumed the caliphate.[268]\n" +
                "\n\n" +
                "Uways al-Qarani, (Uways b. 'Amir al-Muradi al-Qarani) was a famous ascetic who converted to Islam at the time of the Prophet (s).[269] Uways was among the special companions of 'Ali (a) who pledged allegiance with him and promised to defend him until the last moments of his life, and in doing so, would never turn his back from the enemy [i.e. escape the enemy].[270]\n" +
                "\n\n" +
                "'Ammar b. Yasir was one of the first people who believed in the Prophet (s) and immigrated to Ethiopia with the first group of Muslims and after the Prophet (s) immigrated to Medina, he joined the Prophet (s). After the Prophet (s) passed away, Ammar stood in defense of the Ahl al-Bayt (a) and 'Ali (a). Under the rule of 'Umar b. al-Khattab, he became the governor of Kufa for a period of time, but since he was just and lived a simple life, some tried to get him dismissed. He returned to Medina and stood with 'Ali (a) and benefited from him.[271]\n" +
                "\n\n" +
                "Ibn 'Abbas ('Abd Allah b. al-'Abbas) was a cousin of the Prophet (s) and 'Ali (a). He narrated many hadiths from the Prophet (s).[272] During the time of the three caliphs before 'Ali (a), Ibn 'Abbas was always of the opinion that 'Ali (a) deserved the caliphate. During the rule of 'Ali (a), Ibn 'Abbas helped him in the battles of Jamal, Siffin and Nahrawan and was appointed by 'Ali (a) to become the governor of Basra.[273]\n" +
                "\n\n" +
                "Malik al-Ashtar al-Nakha'i (Malik b. al-Harith) was born in Yemen. He was the first one who pledged allegiance with Imam 'Ali (a). He was a commander of Imam 'Ali's army (a) in the Battle of Jamal, the Battle of Siffin, and the Battle of Nahrawan.[274]\n" +
                "\n\n" +
                "Kumayl b. Ziyad al-Nakha'i was one of Tabi'un of the companions of the Prophet (s) and of the special companions of Imam 'Ali (a) and Imam al-Hasan (a).[275] He was among the Shi'a who swore allegiance to Imam 'Ali (a) and fought in all of the wars against Imam 'Ali's (a) enemies.[276] Imam 'Ali (a) taught the Supplication of Khidr to him which later became know as supplication of Kumayl .\n" +
                "\n\n" +
                "Muhammad b. Abi Bakr (a son of the first caliph) was born in 10/631. He was among the special companions of Imam 'Ali (a) who believed that the previous caliphs had taken the right of 'Ali (a) and said that there was no one more deserving of the caliphate than 'Ali (a). He became the governor of Egypt in the month of Ramadan 36/657 and was killed by Mu'awiya's army in Safar of 38/658.\n" +
                "\n\n" +
                "Maytham al-Tammar al-Asadi al-Kufi was one of the special companions of Imam 'Ali (a), Imam al-Hasan (a) and Imam al-Husayn (a). He was of the Shurtat al-Khamis who was a group of men who promised Imam 'Ali (a) to help him until their last breath of life.[277]\n" +
                "\n\n" +
                "Zayd b. Sawhan al-'Abdi was a companion of 'Ali (a) who participated in different battles against the enemies of 'Ali (a) and was finally killed by the Nakithun army in the Battle of Jamal.[278]\n" +
                "\n\n" +
                "Sa'sa'a b. Sawhan al-'Abdi was one of the companions of 'Ali (a) who participated in the battles imposed upon him.[279] He was among those who pledged allegiance with 'Ali (a) after 'Uthman's death.");





        str.add("There are a few hadiths narrated from 'Ali (a) that contain his advice to his children with regards to his funeral rites: the way of his burial, ablution, Shroud and the performing of prayers over his body.[223] He also asked al-Hasan (a) and al-Husayn (a) to refrain from mutilating Ibn Muljam and to strike him only once. Imam Ali (a), moreover, emphasized in his final words on paying attention to the Quran, prayer, commanding good and forbidding evil, jihad, and visiting the House of God, as well as fearing God, being organized, reconciliation, and caring for the orphans and neighbors.[224]");

        str.add("\n" +
                "On the morning of Ramadan 19, 40/January 26, 661, (during the days in which 'Ali (a) was mobilizing an army for Siffin), he was struck with a sword by Abd al-Rahman b. Muljam al-Muradi and martyred from its injury two days later.[217] After the Battle of Nahrawan, 'Ali (a) tried again to mobilize the Iraqis for a battle against Mu'awiya. However, none except a few accompanied him. On the other hand, Mu'awiya, who was aware of the situation in Iraq and their passivity, invaded regions under 'Ali's control (a) and attempted to debilitate his power by invading Iraq.[218]\n" +
                "\n" +
                "Historical accounts have reported the collaboration of three Kharijites in an attempt to kill three individuals: 'Ali (a), Mu'awiya, and 'Amr b. al-'As. Ibn Muljam was the one who chose to kill Ali (a). Some accounts have also mentioned the role of a woman named Qatam in this assassination, however, this seems to be more of an embellishment as opposed to fact.[219]\n" +
                "\n" +
                "Al-Hasan (a), al-Husayn (a), and Muhammad b. al-Hanfiyya, accompanied by 'Abd Allah b. Ja'far buried him in Ghariyyayn (present day Najaf) and hid his grave.[220] This was because if the Banu Umayya or the Kharijites knew about his burial place, they would exhume his body and treat it with disrespect.[221]\n");


        edesc.add(str);


        str=new ArrayList<>();
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");

        udesc.add(str);




        etitleH.add("Bibi Fatima (A) binte Muhammad sawa");
        utitleH.add("بی بی فاطمہ (ع) بنت محمد سا.");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


         str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Titles of Bibi Fatima s.a");
        str.add("Tasbih of Bibi Fatima s.a");
        str.add("Moral Virtues\n");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Titles of Bibi Fatima s.a");
        str.add("Tasbih of Bibi Fatima s.a");
        str.add("Morale and Virtues");
        str.add("Martyrdom");



        utitle.add(str);






        str=new ArrayList<>();

        str.add("Bibi Fatima (A) binte Muhammad sawa\n" +
                "(بی بی فاطمہ (ع) بنت محمد سا.)\n" +
                "was the daughter of the Prophet (s) of Islam (a) and Lady Khadija (a) and the wife of Imam Ali (a). She is one of the People of the Cloak and, in Twelver Shiite belief, one of the Fourteen Infallibles. The second and third Imams, as well as Lady Zaynab (a), were her children. Al-Zahra', al-Batul, Sayyidat Nisa' al-'Alamin and Umm Abiha are among her epithets. She was the only lady chosen by the Holy Prophet (a) to be part of the Mubahala with the Christians of Najran.\n" +
                "\n" +
                "Born:\tJumada II 20, 9 BH/April 7, 614\n\n" +
                "Place of Birth:\tMecca, Arabia\n\n" +
                "Places of Residence:\tMecca and Medina\n\n" +
                "Martyrdom:\tJumada II 3, 11/August 26, 632\n\n" +
                "Cause of Martyrdom:\tInjured after the attack on her house\n\n" +
                "Burial Place:\tMedina (hidden grave)\n\n" +
                "Father:\tProphet Muhammad (s)\n\n" +
                "Mother:\tLady Khadija (a)\n\n" +
                "Brother(s):\tAl-Qasim, 'Abd Allah, Ibrahim,\n\n" +
                "Spouse(s):\tImam 'Ali (a)\n\n" +
                "Son(s):\tal-Hasan (a), al-Husayn (a), al-Muhsin (a)\n\n" +
                "Daughter(s):\tZaynab (a), Umm Kulthum\n\n" +
                "Descendants:\tAhl al-Bayt\n\n" +
                "Epithets and Titles:\tSayyidat Nisa' al-'Alamin \n\n" +
                "(the master of all the ladies in all the worlds), \n\n" +
                "al-Batul, al-Zahra, al-Siddiqa (truthfull), al-Muhadditha (being talked by engels), al-Mansura (being helped), al-Tahira (the pure), and etc.\n" +
                "Kunyas\tUmm Abiha (the mother of her father), Umm al-A'imma (the mother of the Imams), Umm al-Hasan, Umm al-Husayn\n\n" +
                "Activities:\tOpposition to the decisions of Saqifa, Opposition to the usurpation of Fadak, Fadakiyya Sermon, Aiding the Opponents of Abu Bakr, Defense of Imam Ali (a),\n" +
                "She opposed the decisions made during the event of Saqifa, and regarded the caliphate of the first caliph as illegitimate, therefore, she never paid allegiance to him. In defense of Imam Ali’s right (a) to caliphate and objecting to the Usurpation of Fadak, she delivered a speech that became famous as the Fadakiyya sermon. After the demise of the Holy Prophet (s), Fatima (a) was injured when an armed group of zealots, at the order of the first caliph, Abu Bakr, stormed her house. As a result of suffering from both emotional and physical wounds that had debilitated her body, she was advised to rest at home. However, after a short time, she passed away on the Jumada II 3, 11/August 26, 632 in Medina. The body of the Holy Prophet’s (a) daughter was, as she had requested, buried at night and in private. Since then, the location of her grave has not been revealed");

        str.add("Lady Fatima (a) was the fourth or according to some reports the fifth child of the Holy Prophet (s). Her mother was the first wife of the Holy Prophet (a), Lady Khadija (a). Historians are in agreement that she was born in Mecca, in the house of Lady Khadija (a) which was located on the alleys of al-'Attarin and Hijr, which was located in close proximity to the Mas'a.[3] According to Shi'i sources, her date of birth is recorded to be the 20th of Jumada II, five years after Bi'tha/March 28, 615.[4]\n" +
                "\n\n\n\n" +
                "Birth and Early Childhood:\n\n" +
                "Based on the popular opinion amongst the Shia, she was born in the 5th year after bi'tha (the beginning of the prophetic mission)[5], which was also more commonly known as the al-Ahqafiyya Year i.e. the year in which Sura al-Ahqaf (Quran 46) was revealed (9 BH/614 CE).[6] However, al-Shaykh al-Mufid and al-Kaf'ami believe her birth to have taken place in the 2nd year after the prophetic mission (12 BH/611).[7] The popularly held opinion amongst the Sunni scholars is that she was born five years before the beginning of the prophetic mission (605 CE).[8]\n" +
                "\n" +
                "In many Shia resources, Jumada II 20 is mentioned as lady fatima's (a) birthday.[9]\n" +
                "\n" +
                "The lack of extensive historical reports about her childhood and youth makes it difficult to gain an understanding of her early life. According to records, after the Holy Prophet (a) committed himself to the initiative of publicly inviting people to Islam, Lady Fatima (a) was a witness to some of the harsh treatments that the polytheists subjected him to. In addition to this, for three years of her childhood she was exposed to the harsh financial and social sanctions that were imposed on Banu Hashim and the followers of the Holy Prophet (s) by the polytheists whilst in the Shi'b Abi Talib.[10]\n" +
                "\n" +
                "While still in her childhood, Fatima (a) experienced the loss of her beloved mother, Lady Khadijah (a) and of her father's uncle and a close supporter, Abu Talib (a).[11] Some other important events that occurred during her childhood include the decision of the Quraish to assassinate the Holy Prophet (a),[12] his night migration from Mecca to Medina and finally the migration of Lady Fatima (a) accompanied by Imam Ali (a) and other ladies from Mecca to Medina.[13]\n" +
                "\n\n\n\n\n" +
                "Proposal and Marriage:\n\n" +
                "Lady Fatima (a) received several marriage proposals, however she chose to marry Imam Ali (a). According to some researchers, after the Holy Prophet (s) migrated to Medina and became the leader of the Islamic community, Fatima (a), because of her being the daughter of the Holy Prophet (s) was held in very high regard by the Muslims.[14] In addition to this, because of her superior qualities over the other women of her era[15] and the clear love that the Holy Prophet (s) showed to her[16] caused some Muslims to pursue her hand in marriage.[17]\n" +
                "\n" +
                "Even some of the Quraysh dignitaries, because of their precedence in accepting Islam or financial reputation also asked for Fatima's (a) hand in marriage.[18] Abu Bakr, Umar,[19] 'Abd al-Rahman b. 'Awf[20] and Imam Ali (a) are said to be among this group. All proposals except the one brought by Imam Ali (a) were rejected by the Holy Prophet (s).[21] The Holy Prophet (a) is reported to have said in response to these proposals: \"The marriage of Fatima is a heavenly ordainment and requires a divine verdict.\"[22] In some instances, the discontent of Fatima (a) towards the proposer has been reported.[23]\n" +
                "\n" +
                "Due to his family attachment with the Holy Prophet (a) and the ethical and religious traits of Fatima (a), Imam Ali (a) truly desired her hand in marriage;[24] however, historians have narrated that he shunned from proposing to the Holy Prophet (s) for his daughter.[25] Sa'd b. Mu'adh informed the Holy Prophet (s) about this, which lead to the Holy Prophet (s) accepting the proposal of the Imam (a).[26] He then took the proposal to Fatima (a) and told her of his praiseworthy traits and characteristics, to which she gave her approval.[27] Imam Ali (a), like the other migrants (muhajirun), during the early period after the migration did not enjoy a stable financial situation and therefore found difficulty in addressing the prescribed dowry payments.[28] In resolving this issue, he followed the advice of the Holy Prophet (s) and gave the money earned from selling or loaning his armor as the dowry to Fatima (a).[29] The marriage ceremony of Imam Ali (a) and Lady Fatima (a), which was attended by the Muslims, took place in the mosque.[30]\n" +
                "\n" +
                "There is a difference of opinion concerning the date of the marriage ceremony. Most sources record it to have taken place in the second year after Hijra (2/624)[31] i.e. the ceremony took place after the Battle of Badr, in the month of Shawwal or Dhu al-Hijja in the second year after Hijra (Apri or June, 624).[32]"+

                "\n\n\n\n\nTimeline of Lady Fatimah's Life:\n" +
                        "\n" +
                        "20 Jumada II 5 years after Bi'tha\n" +
                        "/March 28, 615\tBirth\n" +
                        "10 Ramadan 10 years after Bi'tha\n" +
                        "/22 April 620\tDemise of Lady Khadija (a)[33]\n" +
                        "Late Safar 2/September 623\tMarriage with Imam 'Ali (a)[34]\n" +
                        "1 Dhu l-Hijja 2/28 May 624\tMoving to the house of Imam 'Ali (a)[35]\n" +
                        "15 Ramadan 3/1 March 625\tBirth of Imam al-Hasan (a)[36]\n" +
                        "7 Shawwal 3/23 March 625\tPresence in the place of Battle of Uhud for treatment of the Prophet (s)[37]\n" +
                        "3 Sha'ban 4/8 January 626\tBirth of Imam al-Husayn (a)[38]\n" +
                        "5 Jumada I 5 or 6/2 October 626 or 22 September 627\tBirth of Lady Zaynab (a)[39]\n" +
                        "6/627-8\tBirth of Umm Kulthum[40]\n" +
                        "14 Dhu l-Hijja 7/14 April 629\tFadak was given to her by the Prophet (s)[41]\n" +
                        "24 Dhu l-Hijja 9/3 April 631\tPresence in Mubahala[42]\n" +
                        "28 Safar 11/25 May 632\tDemise of the Prophet (s)[43]\n" +
                        "Rabi' I 11/June 632\tUsurpation of Fadak by the order of Abu Bakr\n" +
                        "Rabi' I 11/June 632\tDelivering Fadakiyya Sermon in al-Masjid al-Nabawi\n" +
                        "Rabi' I 11/June 632\tBuilding Bayt al-ahzan by Imam 'Ali (a) for her mourning for his father\n" +
                        "Rabi' II 11/July 632\tAttack to her house and burning its door and martyrdom of Muhsin b. 'Ali\n" +
                        "13 Jumada I or 3 Jumada II 11/6 August or 26 August 632\tHer Martyrdom[44]"+
                "\n\n\n\nChildren:\n\n" +
                        "Both Shi'i and Sunni sources state that al-Hasan,[55] al-Husayn,[56] Zaynab[57] and Umm Kulthum[58] are the four children of Ali and Fatima.[59] In Shi'i sources and in some Sunni sources a name of another son is mentioned who was miscarried as a result of the injuries that Fatima (a) sustained during the events that occurred after the demise of her father, the Holy Prophet (a). His name is recorded to have been either al-Muhsin (Arabic: مُحسِن) or Muhassan (Arabic: مُحَسَّن).[60]\n" +
                        "\n" +
                "\n\n\nThe house of Lady Fatima (a):\n\n" +
                        "Between the grave and pulpit of the Holy Prophet (a) in al-Masjid al-Nabawi;[103]\n" +
                        "The graveyard of al-Baqi',[104] in the house of 'Aqil[105] that later became the burial place for 'Abbas b. 'Abd al-Muttalib, four Imams and other members of the Banu Hashim."+
                        "\n\n\n\nEvents towards the End of her Life:\n\n" +
                        "During the last few months of her life some very unpleasant and painful incidents occurred. It has been mentioned that during this period no one saw Fatima al-Zahra (a) smiling.[61] The passing of her father, the event of Saqifa, the usurpation of the caliphate, the confiscation of Fadak by Abu Bakr and the delivery of the Fadakiyyah sermon in the presence of many important companions of her father[62] are some of the most important events that took place during this period.\n" +
                        "\n" +
                        "Being at the side of Imam Ali (a), she was one of the main opponents of the Saqifa council and the choosing of Abu Bakr as caliph.[63] It was because of this stance that they became targets of the government's threats, of which one example is when the government threatened to set the house of Fatima (a) on fire.[64] When Imam Ali (a) and the other opponents of the caliph refused to pay the oath of allegiance (Bay'a), they sought refuge in the house of Fatima (a), this led to the supporters of the caliph attacking her house and as a result of this attack, Fatima (a) got severely injured when trying to prevent them from taking Imam Ali (a) to Abu Bakr in order to forcibly take his oath of allegiance;[65] this was also the cause of her child being miscarried.[66] After this incident, she fell very ill and after a short time was martyred.[67]\n" +
                        "\n" +
                        "On her death bed, Fatima (a) made a request to her husband that all those who opposed her and oppressed her should not participate in her funeral prayer and burial and asked him to bury her at night.[68] According to the commonly accepted view, Fatima (a) passed away on the 3rd of Jumada II, 11/August 29, 632, in Medina.[69]"
                );



        str.add("\n" +
                "al-Zahra' (الزهراء)\tluminous, bright\n" +
                "al-'Adhra' (العذراء)\tchaste\n" +
                "al-Ma'suma (المعصومة)\tinfallible\n" +
                "al-Hawra' al-Insiyya (الحوراء الانسیة)\tan angel in the form of human\n" +
                "Hurra (الحُرّة)\tfree\n" +
                "al-Mubaraka (المبارکة)\tblessed\n" +
                "al-Batul (البتول)\tseparated from anything other than God;\n" +
                "a woman who does not have menstruation.\n" +
                "al-Tahira (الطاهرة)\tpure\n" +
                "al-Ḥaṣān (الحصان)\tchaste\n" +
                "al-Zakiyya (الزکیّة)\tpure (from vices)\n" +
                "Maryam al-Kubra (مریم الکبری)\tthe great Maryam\n" +
                "al-Radiya (الراضیة)\tcontent (with God's will)\n" +
                "al-Siddiqa (الصدّیقة)\tvery truthful\n" +
                "al-Marziyya (المرضیّة)\twhom God is content with\n" +
                "al-Nuriyya (النوریّة)\tluminous\n" +
                "al-Radiyya (الرضیّة)\twhom others are content with\n" +
                "al-Samawiyya (السماویّة)\theavenly\n" +
                "Sayyidat Nisa' al-'Alamin (سیدة نساء العالمین)\tlady of the women of the world\n" +
                "al-Haniya (الحانیة)\tvery merciful\n" +
                "al-Mansura (المنصورة)\tassisted\n" +
                "al-Muhaddatha (المحدّثَة)\tspoken with (by angels)\n" +
                "al-Zahida (الزاهدة)\tascetic\n" +
                "al-Tayyiba (الطیّبة)\tpure, good\n" +
                "al-Taqiyya (التقیّة)\tpious\n" +
                "al-Barra (البَرَّة)\tgood-doer\n" +
                "al-Mutahhara (المطهَّرَة)\tpurified\n" +
                "al-Shahīda (الشهیدة)\tmartyred\n" +
                "al-Sadiqa (الصادقة)\ttruthful\n" +
                "al-Rashida (الرشیدة)\tmature, sensible and wise\n" +
                "al-Fadila (الفاضلة)\tvirtuous\n" +
                "al-Naqiyya (النقیة)\tpure and genuine\n" +
                "al-'Alima (العلیمة)\tknowledgeable\n" +
                "al-Gharra' (الغرّاء)\tnoble, honorable\n" +
                "al-Mahdiyya (المهدیّة)\tguided\n" +
                "al-Safiyya (الصفیّة)\tpure, clean\n" +
                "al-'Abida (العابدة)\tworshipper\n" +
                "al-Mutahajjida (المُتَهجِّدة)\twho practices vigils\n" +
                "al-Qanita (القانتة)\talways worshipping God\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("Al-Shaykh al-Saduq narrated from Imam Ali (a) that he and Lady Fatima (a) had gone to Prophet Muhammad (s) asking him for a servant helping them with household chores. Answering their request, the Prophet (s) taught Lady Fatima (a) this Tasbih and said that it was better than having a servant." +
                "\n\n\n\n" +
                "Importance of Tasbih of Lady Fatima (a) in Hadiths:\n\n" +
                "Numerous hadiths have been narrated in hadith sources about the importance of this tasbih including:\n" +
                "\n\n" +
                "1. Abu Harun al-Makfuf narrated: Imam al-Sadiq (a) told me: O, Abu Harun! The same way we order our children to pray, we order them to [recite] Tasbih of Lady Fatima (a). So persist with this Tasbih, because every servant [of God] who persist with that will not be unhappy.[2]\n\n" +
                "\n2.Imam al-Baqir (a) was quoted: whoever says the Tasbih of Lady Fatima (a), then ask for forgiveness, will be forgiven. For tongue, this Tasbih is one hundred [words] but is counted as one thousand Tasbih (glorification) in the scale of deed, takes Satan away and pleases the Merciful God.[3]\n" +
                "\n3. Imam al-Baqir (a) was quoted: Regarding praising and remembering, God has not been worshiped by anything better than Tasbih of Lady Fatima (a). If there were better act, the Apostle of God (s) would have introduced that to Lady Fatima (a).[4]\n" +
                "\n4. It is narrated from Imam al-Sadiq (a) that, whoever glorify God 100 times after a compulsory prayer by Tasbih of Lady Fatima (a) and says \"la ilaha illa Allah\" once after that, will be forgiven.[5]\n" +
                "\n5. In another hadith he (a) was quoted that: Tasbih of Lady Fatima (a), every day after every prayer, is more pleasant to God than one thousand rak'as of prayer in every day.[6]\n" +
                "\n6. Imam al-Sadiq (a) is quoted: whoever says the Tasbih of Lady Fatima (a) after a compulsory prayer before changing his posture [of praying], God will forgive him.[7]");


        str.add("Her Generosity:\n\n" +
                        "The generosity of Fatima (a) has been recorded as one of her ethical traits. While she was living with Imam Ali (a) at the time when their financial situation was stable, she lived a simple life and would always give in charity.[127] Giving her wedding dress on the night of her wedding to a person in need,[128] giving her necklace to a poor person[129] and giving away all of the food to a pauper, an orphan and a captive are just some examples.[130] It has been reported in Islamic literature that after Imam Ali (a), his wife and their two sons gave their food away for three consecutive days, verses 5-9 of chapter al-Insan, known as the Al-It'am Verse (verses of Feeding), were revealed in their honor.[131]" +

                        "\n\n\n\n\nSome Qur'anic verses, such as al-Tathir Verse (the Purification Verse), al-Mawadda Verse (the Love Verse) and al-It'am Verse (the Feeding Verse), and many traditions, such as \"Fatima is a part of me\", were stated in relation to Lady Fatima (a) and her virtues. According to some of these traditions, the Holy Prophet (s) introduced Lady Fatima (a) as the most superior of the women of all Worlds and equated her anger with that of Allah. It was to her that the Holy Prophet (s) taught the dhikr (litany) that came to be known as the Tasbih of Lady Fatima (a).\n" +
                "\n" +
                "After the demise of the Prophet (s), an angel would visit her and talk to her. The sayings of the angel were recorded by Imam Ali (a) in a book called the Mushaf of Fatima (a), which is currently in the possession of the last Imam, Imam al-Mahdi (a).\n"+
                "Researchers are of the opinion that every one of these epithets is an explainer of a specific behavioral trait related to her. Some of her well-known epithets are al-Zahra, al-Siddiqa (the truthfull), al-Muhadditha (being talked by engels), al-Batul, Sayyidat Nisa' al-'Alamin, al-Mansura (being helped), al-Tahira (the pure), al-Mutahhara, al-Zakiyya (the guiltless), al-Radiyya (pleased) and al-Mardiyya (pleasing).[1] In addition, some teknonyms have been mentioned for her: Umm Abiha, Umm al-A'imma, Umm al-Hasan, Umm al-Husayn, Umm al-Muhsin.[2]" +
                "\n\n\n\n\nFatima in Shia Culture and Literature:\n\n" +
                        "The Shias view Fatima (a) as a complete role model and her way of life has found its way into the culture and lives of the Shia. What follow are a few examples of this:\n" +
                        "\n" +
                        "Fatimiyya (The days of Fatima): The Shias during the days of the martyrdom of Fatima (a) hold mourning processions. In Iran, the day of her martyrdom, which coincides with the 3rd of Jumada l-Thania is an official holiday and jurists (marja's) take part in public marches.\n\n" +
                        "Creating life scale models: During the days of Fatimiyya, the neighborhood of Banu Hashim, the graveyard of al-Baqi' and the house of Fatima (a) are built in an ancient style and a large amount of people visit these models.\n\n" +
                        "Women's Day: The birthday of Fatima (a) (20th of Jumada l-Thania/September 15) is known as women's day in the Islamic Republic of Iran. The people celebrate this day by giving gifts to their womenfolk.\n\n" +
                        "Naming of daughters: According to statistics, the names of \"Fatima\" and \"Zahra\" are part of the top ten names given to girls in Iran.\n\n" +
                        "Attachment to the progeny of Fatima (a): Amongst the Shia sects, the Zaydiyya believe that the leadership of society is confined to the progeny of Fatima (a). Because of this, the Zaydiyya will only follow a person and accept his government if the person is from the progeny of Fatima (a).[146] In addition to the Zaydis, the Fatimid, who took the name of their government from Lady Fatima (a), see themselves from being from the progeny of Fatima (a)."
                );


        str.add("After a period of illness which was caused by the physical injuries that she had to bear after the demise of her father (s), she was martyred in the 11/632. Regarding the date of her martyrdom, differing views exist. The most commonly accepted view according to the Shia is that she passed away on Jumada II 3/August 26.[91] This view is in accordance with a hadith from Imam al-Sadiq (a).[92] Based on another view, she passed away on Jumada I 13/August 6. Other views on her passing are the Rabi' II 8/July 3, Rabi' II 13/July 8,[93] and the Ramadan 3/November 22.[94]\n" +
                "\n" +
                "Before her demise, Fatima (a) made a request that she does not want anyone who oppressed her or who angered her to take part in her funeral prayer and burial rites. Therefore, she asked to be buried in secret and the whereabouts of her grave to be hidden.[95] According to historians, Ali (a) with the assistance of Asma' bt. 'Umays, washed the body of his wife[96] and performed the funeral prayer himself.[97] Other than the Imam (a), a handful of others, of which differing views exist concerning their names and numbers, also took part in the funeral prayers of Fatima (a). Historical sources report that Imam al-Hasan (a), Imam al-Husayn (a), al-'Abbas b. 'Abd al-Muttalib, Miqdad, Salman, Abu Dhar, 'Ammar, 'Aqil, al-Zubayr, 'Abd Allah b. Mas'ud and Fazl b. Abbas are the ones who took part in the funeral prayer.[98] Historical reports, however, are unified in the naming of Salman, Abu Dhar, Miqdad and Ammar as participators of the funeral prayer.[99]\n" +
                "\n" +
                "Some researchers are of the opinion that the request of Fatima (a) to be buried at night and in secret was her last political stance against the caliphate and the government.[100]\n" +
                "\n" +
                "\n\n\n\nPlace of her Grave:\n" +
                "The body of Lady Fatima (a) was carried in a coffin that she requested to be made and buried at night in a secret location.[101] Because of this secret burial, the grave of Fatima (a) remained unknown to the people and no grave has been clearly identified as hers. However, some historical reports and narrations have mentioned certain places as possible locations for the grave of Lady Fatima (a):");


        edesc.add(str);

        str=new ArrayList<>();
        str.add("Biography In Brief\n");
        str.add("Life\n");
        str.add("Martyrdom\n");
        str.add("Moral Virtues\n");
        str.add("");
        str.add("Martyrdom\n");

        udesc.add(str);



        etitleH.add("Imam Hasan ibne Ali (A)");
        utitleH.add("امام حسن ابن علی (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Imamate and Caliphate");
        str.add("Moral Virtues\n");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life\n");
        str.add("Imamate and Caliphate\n");
        str.add("Moral and Virutes\n");
        str.add("Martyrdom\n");

        utitle.add(str);


        str=new ArrayList<>();
        str.add("Imam Hasan ibne Ali (A) \n"
                +"(امام حسن ابن علی (ع))"+
                "\n"+
                "known as Imam al-Hasan al-Mujtaba, was the second Imam of the Shi'a (40-50/661-670), the fifth caliph of the Muslim community for seven months, and regarded by some Sunnis as the last of the Rightly Guided Caliphs.\n" +
                "\n" +
                "\n\n\n\n" +
                "Teknonym:\tAbu Muhammad\n\n"+
                "Born:\tRamadan 15, 3/March 1, 625\n\n" +
                "Birthplace:\tMedina\n\n" +
                "Imamate:\tFrom Ramadan 21, 40/January 28, 661(for 10 years)\n\n" +
                "Reign:\t661 – 661 (6 Months)\n\n" +
                "Martyrdom:\tSafar 28, 50/March 27, 670 in Medina\n\n" +
                "Cause of Martyrdom:\tby poisoning\n\n" +
                "Burial Place:\tAl-Baqi' cemetery,\n\n" +
                "Predecessor:\t'Ali b. Abi Talib (a)\n\n" +
                "Successor:\tAl-Husayn b. 'Ali (a)\n\n" +
                "Father:\t'Ali b. Abi Talib (a)\n\n" +
                "Mother:\tFatima bt. Muhammad (a)\n\n" +
                "Brother(s):\tAl-Husayn, 'Abbas, Muhammad,...\n\n" +
                "Sister(s):\tLady Zaynab (a)\n\n" +
                "Spouse(s):\tKhawla, Umm Bashir, Umm Ishaq, Ja'da\n\n" +
                "Son(s):\tal-Qasim, Zayd, 'Abd Allah, Talha, al-Hasan, ...\n\n" +
                "Daughter(s):\tFatima,...\n\n" +
                "Descendants:\tBanu l-Hasan\n\n" +
                "Titles:\tal-Mujtaba (the chosen),\n" +
                "al-Sibt (grandson),\n" +
                "Sayyid Shabab Ahl al-Janna (master of the youth of paradise),\n" +
                "al-Zaki (the pure),\n" +
                "al-Taqi (the pious),\n" +
                "al-Sayyid (the master)\n\n\n\n" +

                "Al-Hasan b. Ali (a) was the first child of Ali (a) and Fatima (a) and the first grandson of the Prophet (s). It is reported that the Prophet (s) chose the name al-Hasan for him and that he greatly loved him. The first seven years of al-Hasan’s life were during the lifetime of the Prophet (s). He was present in the Allegiance of Ridwan and in the story of Mubahala between the Prophet (s) and the Christian delegate from Najran.\n\n"+

                 "Shiite and Sunni sources contain numerous reports of al-Hasan's virtues. According to these reports, he was one of the People of the Cloak, about whom the Verse of Purity (Qur'an 33:33) was revealed. The verses 76:8, 42:23, and 3:61 were also revealed about him, his parents, and his brother. He gave all his wealth to charity twice, and because of such acts of generosity, he came to be called \"The Generous One of the Family of the Prophet (s)\". He went to hajj twenty-five times barefoot."

        );

         str.add("There is not much information about his life during the caliphate of Abu Bakr and Umar. It is reported that Umar appointed him as a witness in the six-member council that was to choose the third caliph. During the revolt at the end of Uthman's caliphate, he was tasked by Imam Ali (a) to protect the house of the caliph. During the caliphate of Imam Ali (a), al-Hasan (a) moved with his father to Kufa and was one of the commanders of his army in the battles of Jamal and Siffin.\n" +
                "\n" +
                "On Ramadan 21, 40 AH/January 28, 661, and after the martyrdom of Imam Ali (a), al-Hasan (a) became the Imam and successor of his father. More than forty-thousand men pledged their allegiance to him on the same day. However, Muʿawiya did not accept his caliphate, and launched a military expedition against him. Imam al-Hasan (a) sent an army under the command of 'Ubayd Allah b. 'Abbas to confront Muʿawiya's army. The Imam (a) himself headed to Sabat with a group of soldiers. Muʿawiya tried to spread rumors among the Imam's (a) troops to prepare the ground for a peace-treaty. At the same time, one of the Kharijites tried to assassinate Imam al-Hasan (a), which resulted in the Imam’s (a) injury. The Imam (a) was taken to Madain to receive treatment. Simultaneously, a group of Kufan chiefs wrote a letter to Muʿawiya and promised him to either kill al-Hasan (a) or to surrender him to Muʿawiya. Muʿawiya sent their letter to Imam al-Hasan (a) and proposed a peace treaty to the Imam (a). Seeing no other choices before him, Imam al-Hasan (a) accepted the peace treaty and abdicated the caliphate with the condition that Muʿawiya should rule according to the Qur'an and the Sunna of the Prophet (s) and should not appoint any successor for himself, and that no one, including the Shiites, should be persecuted. Muʿawiya did not abide by any of these conditions later. The peace treaty with Muʿawiya led to the dissatisfaction of a number of the Imam’s (a) companions, so much so that some of them called the Imam (a) the Humiliator of the Believers.\n" +
                "\n" +
                "The Imam (a) returned to Medina after the peace treaty in 41 AH/661 and remained there until the end of his life. In Medina, he was as a religious and scholarly authority and had a high social status. When Muʿawiya decided to introduce his son Yazid as his successor and demanded that people pledge their allegiance to him, he sent one-hundred thousand dirhams to Ja'da bt. al-Ash'ath, Imam al-Hasan's wife, to poison the Imam (a). She did so and Imam al-Hasan (a) was martyred forty days after he was poisoned. According to a report, the Imam (a) had requested to be buried next to the grave of the Prophet (s), but Marwan b. al-Hakam and a group of the Umayyads did not let that happen. Thus, he was buried in al-Baqi' cemetery.\n" +
                "\n" +
                "A collection of the sayings and writings of Imam al-Hasan (a), and the names of 138 individuals who transmitted his hadiths is published in Musnad al-Imam al-Mujtaba (a).");


        str.add("Al-Hasan b. Ali (a) is the second Imam of the Shiʿa. He became the Imam after the martyrdom of his father on 21 Ramadan, 40 AH/January 28, 661 CE.[52] His imamate lasted for ten years. In al-Kafi, al-Kulayni (d. 329/940-1) has collected the hadiths related to the appointment of al-Hasan (a) to imamate. According to one of these hadiths, before his martyrdom, Imam Ali (a) gave his books and weapon (from the Trusts of Imamate) to al-Hasan (a) in the presence of his children and some prominent Shiite figures, and announced that the Prophet (s) had commanded him to appoint al-Hasan (a) as the executor of his will. According to another hadith, when Imam Ali (a) was going to Kufa, he left some of the Trusts of Imamate with Umm Salama, and al-Hasan (a) received them from her when he returned from Kufa.\n" +
                "\n" +
                "Al-Hasan's (a) imamate is also supported by such prophetic hadiths as “These two sons of mine are two Imams, whether they rise or sit” and the Hadith of the Twelve Caliphs.\n" +
                "\n" +
                "Imam al-Hasan (a) also succeeded his father as the caliph of the Muslim community and held this position for about seven months.");


        str.add("According to al-Ya'qubi (d. 292/904), al-Hasan b. Ali (a) was the most similar person to the Prophet (s) in his appearance and behavior.[139] He was of medium height and had a thick beard,[140] which he would dye black.[141] His virtues and noble characteristics are explained in many sources.\n" +
                "\n" +
                "\n\n\n\nThe Love of the Prophet (s) for Him:\n\n" +
                "There are many reports about the Prophet's love for his grandson al-Hasan (a). It is reported that while the Prophet (s) would carry al-Hasan (a) on his shoulders, he would say, “O God! I love him, so You also love him!”[142] Sometimes when the Prophet (s) was prostrating himself in congregational prayer, al-Hasan (a) would go on the Prophet's back, and the Prophet (s) would prolong his prostration so that al-Hasan himself comes down.[143]\n" +
                "\n" +
                "The Prophet (s) is also reported to have said about al-Hasan (a), “He is the master of the youth of Paradise and the Proof of God upon the ummah … He who follows him is of me and he who disobeys him is not of me.”[144]\n" +
                "\n\n\n\n" +
                "Quranic Verses about Him:\n\n" +
                "Imam al-Hasan (a) is one of Ahl al-Bayt (a), about whom several verses of the Qur'an were revealed, such as Qur'an 76:8 (“They give food, for the love of Him, to the needy, the orphan and the prisoner”).[145] Qur'an 42:23 (“Say, ‘I do not ask you any reward for it except love of [my] relatives.’”) is also said to have been revealed about Ahl al-Bayt (a).[146] According to this verse, the reward that Muslims should pay the Prophet (s) is loving his relatives. In Quran 3:61 (“Come! Let us call our sons and your sons, our women and your women, our souls and your souls, then let us pray earnestly and call down Allah's curse upon the liars.”), “our sons” refer to al-Hasan (a) and al-Husayn (a).[147]\n" +
                "\n" +
                "Moreover, Qur'an 33:33 (“Indeed Allah desires to repel all impurity from you, O People of the Household, and purify you with a thorough purification”) was revealed about the People of the Cloak, one of whom was Imam al-Hasan (a). This verse has been adduced as evidence for the infallibility of Ahl al-Bayt (a).[148]\n" +
                "\n\n\n\n" +
                "Barefoot Pilgrimages:\n\n" +
                "Imam al-Hasan (a) went on multiple pilgrimages to hajj. It is reported that he would say, “I would be embarrassed to meet my Lord without having walked toward His house.”[149] It is said that he made fifteen,[150] twenty,[151] or twenty-five[152] pilgrimages barefoot, while best camels were walking behind him.[153]\n" +
                "\n\n\n\n" +
                "Forbearance:\n\n" +
                "There are several accounts of Imam al-Hasan's (a) forbearance, which was so great that earned him the epithet “al-Halim” (the Forbearing One).[154] It is reported, for instance, that a Syrian man saw Imam al-Hasan (a) and started cursing him. When he finished his insults, the Imam (a) smiled, greeted him, and said, “It looks like you are a stranger in this city … If you needed anything, we will fulfill your needs.” The man was deeply impressed by the Imam’s (a) noble reaction; he started crying and recited the following verse: “God knows best with whom to place His message” (Quran 6:124),[155] indicating that the Imam (a) deserved to be a descendant of the Prophet (s).\n" +
                "\n\n\n\n" +
                "Generosity:\n\n" +
                "Imam al-Hasan (a) was immensely generous, and because of that he was called “Karim” “Sakhi” and “Jawad” (three Arabic words meaning a generous person).[156] It is reported that he donated all his properties and wealth to charity twice in his life and donated half of all he had three times to the poor and needy.[157] Ibn Shahrashub reports that during Imam al-Hasan's travel to Syria, Mu'awiya gifted a considerable amount of wealth to the Imam (a). When the Imam (a) was leaving, he saw a servant fixing his shoes, so Imam al-Hasan (a) granted all that wealth to the servant.[158] One day, he heard a man praying to God for ten-thousand dirhams. The Imam (a) went home and sent the man the amount.[159] Because of his vast generosity, the Imam (a) has been called by the Shia “the Generous One.”[160]\n" +
                "\n" +
                "It is also reported that he was greatly attentive to people who needed his help such that he would even leave his i'tikaf and tawaf to help those who asked him for help and he would refer to a hadith of the Prophet (s) according to which he who fulfills a need of a believer is like one who worships [God]] for years.[161]\n" +
                "\n\n\n\n" +
                "Humbleness:\n\n" +
                "One day, he passed by a group of poor people who were eating pieces of bread. When they saw him, they invited him to eat with them. The Imam (a) accepted their invitation and sat and ate with them and then invited all of them to his house and offered them food and clothes.[162] In another occasion, his servant made a mistake, for which he deserved punishment. In order to escape punishment, the servant recited the following part of Qur'an 3:134: “[Those who] excuse [the faults of] the people.” The Imam (a) told him, “I forgave you.” The servant recited another part of the same verse: “Allah loves the doers of good.” So the Imam (a) said, “You are free for the sake of God, and I will grant you twice as much money I used to give you for your work.”[163]");


        str.add("There are various reports as to when Imam al-Hasan (a) was martyred: three days,[105] forty days,[106] or two months[107] after he was poisoned through his wife Jada. When the Imam (a) passed away, all the Medinans mourned.[108] In the burial ceremony, al-Baqi' cemetery became full of people, and the shops were shut down for sever days.[109]\n" +
                "\n\n\n\n" +
                "Conflict over the Burial Place:\n\n" +
                "Imam al-Hasan (a) reportedly requested from his brother to be buried beside the Prophet (s), his grandfather.[110] According to a report, al-Hasan (a) had informed A'isha about his wish and she had agreed.[111] However, when Marwan b. al-Hakam learned about this decision, he reported it to Mu'awiya, and the latter asked him to forcefully prevent that.[112] According to another report, however, Imam al-Hasan (a) had requested only that his coffin be taken to the grave of the Prophet (s) before his burial beside the grave of his grandmother Fatima bt. Asad (a).[113] According to this report, the Imam (a) had urged his brother to avoid any conflict during his burial ceremony.[114]\n" +
                "\n" +
                "When Banu Hashim carried the coffin of Imam al-Hasan (a) toward the grave of the Prophet (s), Marwan and a group of the Umayyads took up arms and blocked the way.[115] Abu l-Faraj al-Isfahani (d. 356) mentions that A'isha arrived there on a mule and asked the Umayyads to stop Banu Hashim.[116] According to al-Baladhuri's report, when she found out about the conflict, she claimed that the burial place of the Prophet (s) was her home and she would not allow anyone to be buried there.[117]\n" +
                "\n" +
                "It is reported that Marwan said, “While Uthman is buried on the outskirts of the city, we won't tolerate that you bury al-Hasan next to the Prophet.”[118] A conflict was about to break out between Banu Hashim and the Umayyads,[119] but Imam al-Husayn (a), because of his brother’s prior request, did not allow that to happen. Thus, the body of Imam al-Hasan (a) was taken to al-Baqi' cemetery and buried beside the grave of his grandmother Fatima bt. al-Asad.");

        edesc.add(str);

        str=new ArrayList<>();

        str.add("");
        str.add("");
        str.add("");
        str.add("");
        str.add("");

        udesc.add(str);



        etitleH.add("Imam Husain ibne Ali (A)");
        utitleH.add("امام حسین ابن علی (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Moral Virtues\n");
        str.add("Mourning in Muharram");
        str.add("Some of Well-Known Sayings");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life\n");
        str.add("Moral and Virutes");
        str.add("Mourning in Muharram");
        str.add("Some of Well-Known Sayings\n");
        str.add("Martyrdom\n");

        utitle.add(str);

        str=new ArrayList<>();
        str.add("Imam Husain ibne Ali (A)\n "
                +"(امام حسین ابن علی (ع))"+
                "\n"+

                "also known as Abu 'Abd Allah and Sayyid al-Shuhada', was the third Imam of the Shi'a who was martyred in the Battle of Karbala after 10 years of Imamate. He was the second son of Imam 'Ali (a) and Lady Fatima (a), and the grandson of the Prophet (s).\n" +
                "\n" +
                "\n\n\n" +
                "Teknonym:\tAbu 'Abd Allah\n\n" +
                "Born:\tSha'ban 3, 4/January 8, 626\n\n" +
                "Birthplace:\tMedina\n\n" +
                "Imamate:\tFrom Safar 28, 50/March 27, 670(for 10 years)\n\n" +
                "Contemporary Rulers:\tMu'awiya, Yazid\n" +
                "Martyrdom:\tMuharram 10, 61/October 10, 680\n\n" +
                "Cause of Martyrdom:\tAt the Battle of Karbala\n\n" +
                "Burial Place:\tKarbala\n\n" +
                "Predecessor:\tAl-Hasan b. 'Ali (a)\n\n" +
                "Successor:\t'Ali b. al-Husayn (a)\n\n" +
                "Father:\t'Ali b. Abi Talib (a)\n\n" +
                "Mother:\tFatima bt. Muhammad (a)\n\n" +
                "Brother(s):\tAl-Hasan, 'Abbas, Muhammad, ...\n\n" +
                "Sister(s):\tZaynab, Umm Kulthum, ...\n\n" +
                "Spouse(s):\tRabab, Layla, Umm Ishaq, Shahrbanu (?)\n\n" +
                "Son(s):\t'Ali, 'Ali al-Akbar, 'Ali al-Asghar, ...\n\n" +
                "Daughter(s):\tSukayna, Fatima, Zaynab, ...\n\n" +
                "Titles:\tAl-Shahid (the martyr),\n" +
                "al-Sibt (the grandson),\n" +
                "Sayyid Shabab Ahl al-Jannah (the master of the youth of paradise),\n" +
                "Sayyid al-Shuhada (master of the martyrs)");


        str.add("The beginning of the imamate of Imam al-Husayn (a) coincided with the tenth year of Mu'awiya's rule. After the peace treaty with Imam al-Hasan (a) in 41/661,[99] Mu'awiya became the caliph of the Muslim ummah and established the Umayyad dynasty. According to Sunni sources, he was a clever and patient person[100] and apparently a practicing Muslim, though he had gained power through political plots.[101] He pretended to be a righteous person and a defender of religion and its rulings. However, he turned the caliphate into a kingdom[102] and publicly stated that he did not care whether the people practiced their religion or not.[103]\n" +
                "\n" +
                "One of the issues during the reign of Mu'awiya was the presence of Shiite beliefs among people, especially in Iraq. The Shiites, like the Kharijites, were the enemies of Mu'awiya, but unlike the Kharijites, the Shiites enjoyed strong popular support as a result of the influence of Imam Ali (a) and the Ahl al-Bayt (a). Because of this, Mu'awiya would demote and persecute the Shiites in different ways. One of the ways was to create hatred for Imam Ali (a) in the hearts of the people. Thus, he had the preachers curse Imam Ali (a) on the pulpits, a phenomenon which continued during the reign of the subsequent Umayyad rulers.[104] He wrote to his governors to delete the names of the Shiites from the treasury, stop paying them anything, and reject their testification in courts.[105] He also threatened the traditionists who quoted hadiths about the virtues of Imam Ali (a). Because of this threat, some traditionists would use expressions such as \"a man from the Quraysh,\" \"one of the companions of the Prophet (s),\" or \"Abu Zaynab\" when they wanted to refer to Imam Ali (a).[106]\n"+
                "Before he left Medina in 60/680, Imam al-Husayn (a) gave some of the trusts of imamate to Umm Salama, the Prophet's (s) wife,[111] and gave the rest to his elder daughter, Fatima,[112] before his martyrdom in Ashura' so that they deliver them to Imam al-Sajjad (a).\n" +
                "\n\n\n\n\n" +
                "Regarding the Peace Treaty of Imam al-Hasan (a):\n\n" +
                "Imam al-Husayn (a) was the most righteous person to rule after Imam al-Hasan (a). He (a) stood loyal to the peace treaty between his brother, Imam al-Hasan (a), and Mu'awiya,[113] and refrained from uprising against Mu'awiya; even though, the people of Kufa wrote letters [to him] urging for action against Mu'awiya. He wrote to them: \"I do not have this thought now. May God bless you; stay in your land and hide in your houses and avoid from being accused while Mu'awiya is alive; if God brings forth something while I am alive, I will write to you.\"[114]\n" +
                "\n" +
                "\n\n\nAttitude to Mu'awiya's Actions:\n\n" +
                "Nonetheless, Imam al-Husayn (a) refused to approve the legitimacy of the government of Mu'awiya over Muslims. During the ten years imamate of Imam al-Husayn (a), letters showing the Imam's (a) discontent were exchanged between him and Mu'awiya. These letters show Imam al-Husayn's (a) stance against Mu'awiya, specifically following crimes or non-Islamic deeds of Mu'awiya.\n" +
                "\n" +
                "During this time, Imam al-Husayn (a) explained both directly and indirectly the rulings and qualifications of imamate, caliphate and the characteristics of the rightful caliph. While respecting the boundaries of the treaty, the Imam (a) stayed active in his responsibilities in speaking out and preaching. Among the preaching activities of Imam al-Husayn (a), he would continue to explain God's rulings in great gatherings of hajj in the land of Mina and also his secret gatherings in Mecca.\n" +
                "\n" +
                "Like the three caliphs, Mu'awiya pretended to revere Imam al-Husayn (a) because he knew that Imam al-Husayn (a) held a respected position among people of Mecca and Medina; the ill-treatment of Imam (a) would not go unnoticed. However, Mu'awiya regarded Imam (a) as an obstacle in the way of his government, and it worried him. On one hand, he did not disregard Imam's (a) position; he pretended to esteem and respect him and also ordered his agents not to disrespect the Prophet's (s) grandson. On the other hand, he kept Imam al-Husayn (a) under constant and daily surveillance to monitor his private and public life in the city and on travel. Mu'awiya never attempted to keep the surveillance a secret from Imam al-Husayn, so he (a) would not consider rising against him.\n" +
                "\n" +
                "Mu'awiya had also advised his son, Yazid, that with all the fear he had from Imam (a), even if he could defeat the Imam (a), he would treat him (a) with forbearance and would not force Imam al-Husayn (a) to give allegiance.[115]\n" +
                "\n" +
                "Mu'awiya's crimes such as murdering Hujr b. Adi, Amr b. Hamiq al-Khuza'i, Abd Allah b. Yahya al-Hadrami and his companions met the most severe criticisms from the Imam (a).[116]\n" +
                "\n" +
                "According to several sources, Imam al-Husayn (a) wrote a letter to Mu'awiyah and condemned the murder of Imam Ali's (a) companions. After counting some of Mu'awiya's wrong actions, the Imam (a) criticized him and said, \"I do not know a greater fitna for this ummah than your rule over them.\"[117]\n" +
                "\n\n\n\n" +
                "Against the Succession of Yazid:\n\n" +
                "Contrary to his peace treaty with Imam al-Hasan (a), Mu'awiya called the people in 56/676 to pledge allegiance to Yazid as his successor.[118] Some figures, such as Imam al-Husayn (a) refused to pledge allegiance to Yazid, so Mu'awiya went to Medina to convince them to do so.[119] In a session that Mu'awiya held for that purpose, Imam al-Husayn (a) rebuked Mu'awiyah, warned him against taking such a measure, considering especially the corrupt character of Yazid, and emphasized his own place and right to take the leadership of the ummah.[120]\n" +
                "\n" +
                "In another session, in which ordinary people were present, Imam al-Husayn (a) reacted to Mu'awiya's remarks about the qualification of Yazid for caliphate by proclaiming that Yazid was an alcoholic and corrupt person and that he himself was the one who deserved to be the caliph.[121]\n" +
                "\n\n\n\n" +
                "Sermon in Mina:\n\n" +
                "In 58/677-8, two years before the death of Mu'awiya, Imam al-Husayn (a) gave a protesting speech in Mina.[122] At this time, Mu'awiya's persecution of the Shi'a had become more than ever.[123] In his speech, the Imam (a) mentioned the virtues of Imam Ali (a) and the Ahl al-Bayt (a) and emphasized the importance of commanding good and forbidding evil and the necessity of scholars' objection to the oppression and corruption of unjust rulers.\n" +
                "\n\n\n\n" +
                "Timeline of the Battle of Karbala:\n\n" +
                "60/680\n" +
                "Rajab 15\tDeath of Mu'awiya b. Abi Sufyan\n" +
                "Rajab 28\tDeparture of Imam al-Husayn b. 'Ali (a) from Medina.\n" +
                "Sha'ban 3\tArrival of Imam al-Husayn (a) to Mecca.\n" +
                "Ramadan 10\tArrival of Kufiyans' first letter to Imam (a)\n" +
                "Ramadan 12\tArrival of 150 letters from Kufa\n" +
                "Ramadan 14\tArrival of the letter from leaders of Kufa\n" +
                "Ramadan 15\tDeparture of Muslim b. 'Aqil from Mecca toward Kufa.\n" +
                "Shawwal 5\tArrival of Muslim b. 'Aqil to Kufa.\n" +
                "Dhu l-Hijja 8\tDeparture of Imam al-Husayn (a) form Mecca\n" +
                "Dhu l-Hijja 8\tUprising of Muslim b. 'Aqil in Kufa\n" +
                "Dhu l-Hijja 9\tMartyrdom of Muslim b. 'Aqil\n" +
                "61/680\n" +
                "Muharram 1\tAsking for help of 'Ubayd Allah b. al-Hurr al-Ju'fi and 'Amr b. Qays in Banu Maqatil\n" +
                "Muharram 2\tArrival of Imam (a) to Karbala\n" +
                "Muharram 3\tArrival of 'Umar b. Sa'd with 4,000 people to Karbala\n" +
                "Muharram 6\tHabib b. Muzahir's asking for help of Banu Asad\n" +
                "Muharram 7\tBanding of water by 'Umar b. Sa'd\n" +
                "Muharram 7\tMuslim b. 'Awsaja al-Asadi joined Imam (a)\n" +
                "Muharram 9\tArrival of Shimr b. Dhi l-Jawshan to Karbala\n" +
                "Muharram 9\tShimr's Safe conduct for Umm al-Banin's children\n" +
                "Muharram 9\tAnnouncing of the Battle by 'Umar b. Sa'd and Imam's (a) asking for a delay\n" +
                "Muharram 10\tEvents of Ashura\n" +
                "Muharram 11\tMoving the captives towards Kufa\n" +
                "Muharram 11\tBurial of martyrs by Banu Asad\n" +
                "Muharram 12\tBurial of a few member of martyrs\n" +
                "Muharram 13\tArrival of captives to Kufa\n" +
                "Muharram 19\tMoving the captives from Kufa towards Syria\n" +
                "Safar 1\tArrival of the captives to Syria\n" +
                "Safar 20\tArba'in\n" +
                "Safar 20\tReturn of Ahl al-Bayt (a) to Karbala\n" +
                "Safar 20\tMoving from Karbala toward Medina (in some accounts)\n" +

                "\n\n\n\nRule of Yazid:\n\n" +

                "Yazid succeeded his father when the latter died on Rajab 15, 60/April 21, 680.[124] He decided to force a number of noble figures, including Imam al-Husayn (a), who had refused to pledge allegiance to him to do so.[125] However, the Imam (a) refused to pledge allegiance again[126] and left Medina on Rajab 28th to Mecca. [127]\n" +
                "\n" +
                "In Mecca, he was received warmly by the people.[128] He stayed there more than four months (from Sha'ban 3rd until Dhu l-Hijja 8th).[129] During this time, the Shiites of Kufa, who learned about the Imam's (a) rejection of paying allegiance to Yazid, wrote him letters, inviting him to Kufa.[130] In order to ascertain the loyalty of the Kufans, the Imam (a) sent Muslim b. Aqil to Kufa to see the circumstances and report back to him. After being welcomed by the people and receiving their vows of allegiance, Muslim b. Aqil wrote a letter to the Imam (a) and affirmed that Kufa was ready to receive him.[131] Thus, the Imam (a) started his travel from Mecca to Kufa on Dhu l-Hijja 8th.[132]\n" +
                "\n" +
                "According to some reports, the Imam (a) was informed of a plot for his murder in Mecca, so he left Mecca to preserve its sanctity.[133]\n" +
                "\n\n\n\n" +
                "Battle of Karbala:\n" +
                "\n" +
                "The Evening of Ashura, created by Mahmud Farshchian, 1976\n" +
                "The Battle of Karbala, which led to the martyrdom of Imam al-Husayn (a) and his companions, can be considered the most important part of the Imam's (a) life. According to some reports, the Imam (a) was aware of his martyrdom before travelling to Iraq. The battle took place as a result of his rejection of paying allegiance to Yazid. The Imam (a), who was on his way to Kufa with his family and companions, was encountered with the army of al-Hurr b. Yazid al-Riyahi in an area called Dhu Husam, and was forced to change his route as a result.[134]\n" +
                "\n" +
                "Most sources report that the Imam (a) arrived in Karbala on Muharram 2nd.[135] The next day, the army of Umar b. Sa'd arrived in Karbala with four-thousand soldiers.[136] Some negotiations took place between the Imam (a) and Umar b. Sa'd,[137] but Ubayd Allah b. Ziyad refused to accept anything except the Imam's allegiance to Yazid.[138]\n" +
                "\n" +
                "In the afternoon of Muharram 9th, Umar b. Sa'd's army got ready for the battle, but the Imam (a) requested the battle to be postponed until the next day so that he can spend the night praying and worshiping God.[139] On the eve of Ashura (Muharram 10th), the Imam (a) talked to his companions and gave them the permission to leave if they wished so, but they emphasized their loyalty and support for him.[140]\n" +
                "\n" +
                "In the morning of Ashura, the battle started, and many of the Imam's (a) companions were martyred.[141] During the battle, al-Hurr b. Yazid, who was one of the commanders of Umar b. Sa'd's army, repented and joined the Imam (a).[142] After the martyrdom of all his companions, the Imam's (a) family members began to go to the battle, the first of whom was Ali al-Akbar.[143] The Imam's (a) family members also were martyred one after another. Finally, Imam al-Husayn (a) himself entered the battlefield and was martyred in the afternoon of Ashura. His murderer was Shimr b. Dhi l-Jawshan[144] or, according to a report, Sinan b. Anas,[145] who beheaded him and sent his head to Ibn Ziyad the same day.[146]\n" +
                "\n" +
                "In order to fully obey Ibn Ziyad's command, Umar b. Sa'd commanded his soldiers to go with their horses on the body of the Imam and break his bones.[147] The women and children and Imam al-Sajjad (a), who was sick, were taken captive and sent to Kufa and then to Damascus.[148] The body of the Imam (a) and about seventy-two[149] of those who were martyred with him were buried on the 11th[150] or 13th of Muharram by a group of Banu Asad—and, according to a report, with the presence of Imam al-Sajjad (a)—in the place where they had been martyred.[151]\n" +
                "\n" );



        str.add("Appearance:\n\n" +
                "Imam al-Husayn (a) had a bright face. He sometimes wore a turban made of fur, and at other times, a black turban. He used to dye his hair reddish brown.[158] In most hadith sources, he is likened to the noble Prophet (s),[159] and he is described as the most similar person to the Prophet (s).[160] In another hadith, Imam Ali (a) regarded al-Husayn (a) as the most similar to himself, regarding manner and behavior.\n" +
                "\n" +
                "The lettering on his two rings read \"la ilah illa Allah, uddat li-liqa' Allah\" [(the word) \"there's no god except Allah\" is the supplement for meeting Allah] and \"inn Allah baligh amrih\" [Indeed Allah carries through His command].\n" +
                "\n" +
                "Imam al-Husayn (a) went to hajj on foot, accompanied by his relatives twenty five times in his lifetime.\n" +
                "\n" +
                "\n\n\nIn the Words of the Prophet (s):\n\n" +
                "Several hadiths are quoted from the Prophet (s) regarding the virtues of Imam al-Husayn (a), some of which are as follows:\n" +
                "\n" +
                "Al-Hasan and al-Husyan are the masters of the youth of Paradise.[161]\n" +
                "It is written on the right side of [God's] Throne, \"Al-Husayn is the lamp of guidance and the vessel of salvation.\"\n" +
                "Al-Husayn is of me and I am of al-Husayn.[162]\n" +
                "who loves these two sons of mine [i.e., al-Hasan and al-Husayn] has indeed loved me, and who hates them has indeed hated me.[163]\n" +
                "High Status\n" +
                "According to Sunni and Shiite hadiths, al-Husayn b. Ali (a) was one of the People of the Cloak.[164] He was present in Mubahala;[165] the phrase \"our sons\" in Quran 2:246 [166], revealed on the occasion of Mubahala, refers to al-Hasan (a) and al-Husayn (a).[167]\n" +
                "\n" +
                "After the martyrdom of Imam al-Hasan (a), Imam al-Husayn (a) was considered the most prominent Hashimite. According to al-Ya'qubi, after the martyrdom of Imam al-Hasan (a), Mu'awiyah told Ibn Abbas, \"From now on, you are the chief of your people.\" Ibn Abbas responded, \"Not until al-Husayn (a) is there.\"[168] There are also some reports indicating that Banu Hashim would consult with al-Husayn (a) about their affairs and prefer his opinion to that of others.[169]\n" +
                "\n" +
                "It is reported that even Amr b. al-As considered al-Husayn (a) the dearest person on the earth to those in Heaven.[170]\n" +
                "\n\n\n\n" +
                "Foreseeing of Martyrdom:\n\n" +
                "There are many reports about foreseeing the martyrdom of Imam al-Husayn (a),[171] including Hadith al-Lawh, in which the Prophet (s) stated, \"God has honored al-Husayn by martyrdom and made him the best of martyrs.\"[172] Al-Allama al-Majlisi has collected several traditions in Bihar al-anwar which indicate that God informed some of His prophets, including Adam (a), Noah (a), Abraham (a), Zechariah (a), and Muhammad (s), about the martyrdom of al-Husayn (a), and they wept for him.[173] It is also reported that when Imam Ali (a) reached Karbala on his way to Siffin, he pointed to a place and said, \"This is where their blood will be shed.\"[174]\n" +
                "\n\n\n\n" +
                "Miracles:\n\n" +
                "In some traditions, extraordinary characteristics have been mentioned for the Imam (a), such as drinking milk from the Prophet's fingers[175] and the healing of Futrus (an angel whose wings were broken but were healed when the Imam (a) was born).[176] It is reported that God has placed healing in the soil of al-Husyan's (a) grave and the fulfilment of prayers under his dome.[177] A comprehensive list of these characteristics can be found in the book al-Khasa'is al-Husayniyya.\n" +
                "\n\n\n\n" +
                "Morals and Manners:\n\n" +
                "He used to sit with the poor, accept their invitations, eat with them, invite them to his house. He never hesitated in giving charity.[178] If a beggar asked him for help while he (a) was praying, he (a) tried to recite the remainder of his prayer quickly in order to give the beggar what he (a) had.[179]\n" +
                "\n" +
                "He (a) used to free slaves and bondwomen for their good manners. It is reported that Imam al-Husayn (a) freed a bondwoman Mu'awiya had sent for him along with gifts and clothes, in return for reciting some verses of the Qur'an, and a poem about the mortality of the world and human beings. Imam al-Husayn (a) gave her all the gifts.[180] Once, a slave-girl gifted him a flower, and the Imam (a) freed her in return. Someone asked him, \"Did you free her just because of a flower?\" The Imam (a) cited Quran 4:86: \"When you are greeted with a salute, greet with a better one than it, or return it\" and said, \"God has taught us to have such manners.\"[181]\n" +
                "\n" +
                "Imam al-Husayn (a) was very generous and known for generosity among people.[182] However, out of respect for his brother, he would give the poor a little less than his brother had given.[183]\n" +
                "\n" +
                "It is reported that Imam al-Husayn (a) spent the land, and whatever he (a) inherited, before he (a) received them, in the way of God. He (a) gave his ring and paid the full debt of a man in return for answers to three questions. His generosity was to the extent that a Jewish couple became Muslim when they saw this merit of his. Regarding his forbearance, it is reported that when a man from Syria insulted him and his father, Imam al-Husayn (a) forgave him and treated him with kindness. It is also said that the lasting marks of the bags of food he (a) carried for the orphans and the poor was clearly seen on his back among his multiple wounds after his martyrdom.\n" +
                "\n\n\n\n" +
                "Revolutionary:\n\n" +
                "The uprising of Imam al-Husayn (a) led to several uprisings and revolutionary movements immediately after his martyrdom. The first protest was by Abd Allah b. Afif[155] against Ibn Ziyad. Among other revolts are those of Tawwabun, al-Mukhtar, Zayd b. Ali, and Yahya b. Zayd. Moreover, the slogan of Abu Muslim al-Khurasani's revolt, which ended the Umayyad dynasty, was \"Ya la-tharat al-Husayn\" (O Avengers of al-Husayn!).[156] The Islamic revolution of Iran was also inspired by the uprising of Imam al-Husayn (a). According to Imam Khomeini, \"Had it not been for the sessions and gatherings of preaching and mourning, our nation would not have become victorious. All rose up under the flag of Imam al-Husayn (a)\".[157]\n" +
                "\n" +
                "Culturally, Muslims and even non-Muslims regard al-Husayn (a) as a paragon of self-sacrifice, resistance, fight for freedom, protecting values, and truth-seeking");





                str.add("Mourining in moharram:\n" +
                "\n" +
                "In the month of Muharram, Shiites hold a series of mourning ceremonies and rituals for Imam al-Husayn (a) and his companions. Mourning for Imam al-Husayn (a) started within days after his martyrdom.[184] According to a report, when the Captives of Karbala reached Damascus, the ladies mourned for the Imam (a) by wearing black clothes for several days.[185]\n" +
                "\n" +
                "The Imams of the Shi'a emphasized the importance of mourning and weeping for Imam al-Husayn (a).[186] They also greatly encouraged the Shia to visit the grave of Imam al-Husayn (a), and, according to some hadiths, proclaimed its merit to be equal to hajj and umra.[187]\n" +
                "\n" +
                "With the emergence of Shiite dynasties, mourning rituals for Imam al-Husayn (a) became officially recognized,[188] and various rituals such as chest-beating and ta'ziya developed. Reciting supplications such as Ziyarah Ashura' and Ziyarah al-Warith, whether individually or collectively, were also among these rituals.\n" +
                "\n\n\n\n" +
                "Arba'in of Imam al-Husayn (a):\n\n" +
                "Forty days after the martyrdom of Imam al-Husayn (a) is called the day of Arba'in, on which many Shiites visit the shrine of the Imam (a). It is reported that Jabir b. Abd Allah al-Ansari was the first person who visited the Imam's (a) grave on this day.[189] According to al-Luhuf, the family of the Imam (a), who were taken as captive to Damascus, also visited his grave on the same day on their way back to Medina.[190]\n" +
                "\n" +
                "The instruction to visit the grave of Imam al-Husayn (a) on the day of Arba'in has caused Shiites, especially Iraqi Shiites, to go to Karbala on this day. This procession on foot, is one of the largest religious marches in the world. It is reported that in 2017, more than thirteen million pilgrims participated in this procession.\n" +
                "\n\n\n\nImam al Hussain shrine:\n" +
                "\n" +
                "The first shrine of Imam al-Husayn (a) seems to have been built at the time of al-Mukhtar and by his command. Since that time, the Imam's (a) shrine was rebuilt and renovated several times,[193] as it was destroyed by Abbasid caliphs[194] and Wahhabis several times. The Abbasid caliph al-Mutawakkil even commanded the land of al-Ha'ir to be ploughed.[195]");

        str.add("If you do not have faith and do not fear the Day of Resurrection, be noble in this world.[210]\n\n" +
                "People are the slaves of this world, and religion is on their tongues; they abide by it as long as their livelihoods are granted; when they are tested with afflictions, religious people become rare.[211]\n" +
                "Death with honor is better than life with humiliation.[212]\n\n" +
                "I did not rise up arrogantly, but rather to reform the ummah of my grandfather Muhammad. I want to command good and forbid evil.[213]\n" +
                "who seeks to attain something by disobeying God, will lose what he wishes and will be afflicted by what he fears sooner than he expects.[214]\n" +
                "People bringing their needs to you is God's blessing upon you. Do not get tired of blessings; otherwise, they will turn into afflictions.[215]");



        str.add("In the morning of Ashura, the battle started, and many of the Imam's (a) companions were martyred.[141] During the battle, al-Hurr b. Yazid, who was one of the commanders of Umar b. Sa'd's army, repented and joined the Imam (a).[142] After the martyrdom of all his companions, the Imam's (a) family members began to go to the battle, the first of whom was Ali al-Akbar.[143] The Imam's (a) family members also were martyred one after another. Finally, Imam al-Husayn (a) himself entered the battlefield and was martyred in the afternoon of Ashura. His murderer was Shimr b. Dhi l-Jawshan[144] or, according to a report, Sinan b. Anas,[145] who beheaded him and sent his head to Ibn Ziyad the same day.[146]\n" +
                "\n" +
                "In order to fully obey Ibn Ziyad's command, Umar b. Sa'd commanded his soldiers to go with their horses on the body of the Imam and break his bones.[147] The women and children and Imam al-Sajjad (a), who was sick, were taken captive and sent to Kufa and then to Damascus.[148] The body of the Imam (a) and about seventy-two[149] of those who were martyred with him were buried on the 11th[150] or 13th of Muharram by a group of Banu Asad—and, according to a report, with the presence of Imam al-Sajjad (a)—in the place where they had been martyred.[151]");




        edesc.add(str);


        str=new ArrayList<>();

        str.add("");
        str.add("Life\n");
        str.add("Moral and Virutes\n");
        str.add("Some of Well-Known Sayings\n");
        str.add("Martyrdom\n");
        str.add("Martyrdom\n");

        udesc.add(str);



        etitleH.add("Imam Ali ibne al-Husayn al-Sajjad (A)");
        utitleH.add("امام علی ابن ال-حسین السجاد"
                +" (ع)");
         img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        images.add(img);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Events in Life");
        str.add("Merits and Virtues");
        str.add("Al-Sahifa al-Sajjadiyya");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("Biography In Brief\n");
        str.add("Events in Life\n");
        str.add("Merits and Virtues\n");
        str.add("Al-Sahifa al-Sajjadiyya\n");

        utitle.add(str);


        str=new ArrayList<>();
        str.add("Imam Ali ibne al-Husayn al-Sajjad (A)\n"
                +" (امام علی ابن ال-حسین السجاد)"+
                "\n"+

                ", known as  Zayn al-ʿAbidīn (زﻳﻦ اﻟﻌﺎﺑﺪﻳﻦ)  Imām al-Sajjād  (اﻣﺎم اﻟﺴﺠﺎد)     is the fourth Imam of Shi'a. The period of his imamate was 34 years. He (a) was present in the Battle of Karbala but did not participate in the battle because of sickness and was not martyred. He (a) was taken captive to Kufa and Damascus together with other captives of Karbala. His speech at the presence of Umayyad caliphs created awareness among people about the position of the Ahl al-Bayt (a). After being released, he (a) stayed in Medina until the end of his life. The event of Harra, Tawwabun movement and the uprising of al-Mukhtar happened at his time, however there is no reliable report of his opinions about them.\n" +
                "\n\n\n\n\n" +
                "Teknonym:\tAbu l-Hasan, Abu Muhammad and Abu Bakr. Also according to Ibn Abi l-Thalj, Abu l-Husayn.\n\n"+
                "Born: Sha'ban 5, 38/January 6, 659\n" +
                "\n" +
                "Birthplace: Medina\n" +
                "\n" +
                "Imamate: From Muharram 10, 61/October 10,680(for 34 years)\n" +
                "\n" +
                "Martyrdom: Muharram 25,95/October 20, 713 in Medina\n" +
                "\n" +
                "Cause of Martyrdom: by Poisoning\n" +
                "\n");

        str.add("Battle of Karbala and Captivity:\n" +
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
                "Whenever he (a) drank water, he remembered his father and wept on the hardships of Imam al-Husayn (a). It is mentioned in a narration from Imam al-Sadiq (a) that, \"Imam al-Sajjad (a) wept forty years upon his honorable father, while he (a) was fasting the days and praying the nights. At the time of breaking his fasting when his servant took food and water for him, he (a) said, '[grand]son of the Prophet (s) was martyred hungry!\n" +
                "\n" +
                "grandson of the Prophet (s) was martyred thirsty!' He (a) frequently repeated this and wept so that his tears were mixed with his food and drink. He (a) was in such a state until when he (a) passed away.\"[27]\n" +
                "\n");


        str.add("Worship:\n" +
                "\n" +
                "Malik b. Anas said, \"Ali b. al-Husayn (a) made a thousand Rak'a prayer everyday before he (a) passed away. Thus, he (a) was called Zayn al-'Abidin (adornment of the worshipers).\"[34]\n" +
                "\n" +
                "Ibn 'Abd Rabbih wrote, \"When 'Ali b. al-Husayn (a) became ready for prayer, he (a) would strangely tremble. He (a) was asked about it and said, 'woe betide you! Do you\n" +
                "\n" +
                "know whom I am going to stand in front of and before whom I am going to pray?'\"[35]\n" +
                "\n" +
                "Malik b. Anas said, \"When 'Ali b. al-Husayn (a) put on Ihram and said Talbiya, he went unconscious and fell from his conveyance (from the awe of Allah).\"[36]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Helping the Poor:\n" +
                "\n" +
                "Abu Hamza al-Thumali said, \"Every night 'Ali b. al-Husayn (a) secretly carried some food on his shoulder to the poor and said, 'the charity made at the darkness of the night appeases the wrath of God.'\"[37]\n" +
                "\n" +
                "Muhammad b. Ishaq said, \"There were people living in Medina unknowing how their daily provision was provided; and after 'Ali b. al-Husayn (a) passed away, their night food delivery stopped.\"[38]\n" +
                "\n" +
                "At night, he (a) put baskets of bread on his shoulder and went to the houses of the poor and said, \"The charity made secretly appeases the wrath of God.\" Those baskets had left marks on his shoulders and when they were washing his body after he (a) passed away, they saw those marks.[39] Ibn Sa'd wrote, \"When a poor person came to him, he (a) went and gave the poor what he wanted and said, 'before\n" +
                "\n" +
                "charity reaches the asking one, it reaches God's hand.'\"[40]\n" +
                "\n" +
                "One year he (a) wanted to go for hajj. His sister Sukayna prepared a provision pack for his travel worth a thousand dirham.\n" +
                "\n" +
                "When he (a) arrived in Harra, they took that provision to him and Imam (a) distributed it among all the poor.[41]\n" +
                "\n" +
                "Imam al-Sajjad (a) has a poor cousin. He\n" +
                "\n" +
                "went to him at night in a way he did not recognize him and gave him some dinars. His cousin said, \" 'Ali b. al-Husayn (a) does not care about his relatives, May God punish him.\" Imam (a) heard this and\n" +
                "\n" +
                "forbore and did not show his face to his cousin. When Imam (a) passed away and nightly donation of that man was stopped, he realized the donator was actually 'Ali b. al-Husayn (a), so he went to Imam's (a) grave and cried.[42]\n" +
                "\n" +
                "Abu Na'im wrote, \"Imam al-Sajjad (a) distributed all his property among the poor twice and said, 'God loves a repenting faithful servant.'\"[43] Elsewhere, he wrote, \"People regarded him ungenerous and when he (a) passed away, they learned that he (a) provided the expenses of a hundred families.[44] When a beggar came to him, he (a) said, 'blessed be the one\n" +
                "\n" +
                "who carries my provision to the hereafter.'\"[45]\n" +
                "\n" +
                "\n\n" +
                "Behavior towards Slaves:\n" +
                "\n" +
                "One of the efforts of Imam al-Sajjad (a) which was religious and also political was paying attention to slaves; people who were under greatest social pressures especially after the time of the second caliph ('Umar b. al-Khattab) and especially at the time of Umayyads and they were among the most deprived people in the Islamic society in first centuries.\n" +
                "Like Imam 'Ali (a) who attracted Mawali [freed servants] in Iraq to himself with his Islamic behavior, Imam al-Sajjad (a) tried to promote social dignity of these people.\n" +
                "\n" +
                "Sayyid al-Ahl wrote, \"Imam al-Sajjad (a) bought slaves even though he (a) did not need them. He (a) bought them only to free them. Slaves who saw this intention of Imam (a), they wanted him to buy them. Imam al-Sajjad (a) released them at any time or situation, so that many people, like an army of released servants, men and women were seen in Medina who were all the freed servants of Imam (a).\"\n");

        str.add("Al-Sahifa al-Sajjadiyya is the collection of Imam al-Sajjad's (a) supplications and a mirror in which the picture of the society at \n" +
                "that time, especially Medina, can be seen: his aversion to bad behaviors and speech of people at that time and taking refuge to God from what he (a) saw and heard, and clarifying the right path under the guidance of religion and the Qur'an and purification of souls from pollutions; as if Imam (a) wanted as much as possible to disconnect people from Satan and connect them to God. Al-Sahifa al-Sajjadiyya has been translated into several languages.");


        edesc.add(str);

        str=new ArrayList<>();

        str.add("" +
                "\n\n\n\n\n"      +
                "ٹیکنوم: ابو الحسن ، محمد اور ابوبکر۔ نیز ابن ابی ایل تھلج ، ابو الحسین کے مطابق۔\n" +
                "\n" +
                "\n" +
                "ولادت: شعبان 5 ، 38/6 جنوری ، 659\n" +
                "\n" +
                "جائے پیدائش: مدینہ\n" +
                "\n" +
                "امامت: محرم 10 ، 61 / اکتوبر 10،680 (34 سال سے)\n" +
                "\n" +
                "شہادت: محرم 25،95 / 20 اکتوبر 713 مدینہ منورہ میں\n" +
                "\n" +
                "شہادت کی وجہ: زہر آلودگی سے");
        str.add("جنگ کربلا اور اسیر:\n" +
                "\n" +
                "جنگ کربلا میں اور جس دن امام الحسین (ع) اور ان کے ساتھیوں کو شہید کیا گیا تھا ، امام سجاد (ع) شدید بیمار تھے کہ کچھ معاملات میں جب انہوں نے اسے قتل کرنا چاہا تو کچھ نے کہا ، \"یہ بیماری اس کے لئے کافی ہے۔ \"[22]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "کوفہ:\n" +
                "\n" +
                "سانحہ کربلا کے بعد ، انہوں نے امام الحسین (ع) کے اہل خانہ کو پکڑ لیا اور انہیں کوفہ اور دمشق لے گئے۔ انہیں کربلا سے کوفہ لے جانے کے بعد ، انہوں نے اس پر جماع ((ہاتھ سے گلے کی زنجیریں) لگادیں اور چونکہ وہ بیمار تھا اور اونٹ کے پچھلے حصے پر بیٹھا نہیں رہ سکتا تھا ، اس لئے انہوں نے اس کے پاؤں اونٹ کے پیٹ کے نیچے باندھ لیے۔ . [23]\n" +
                "کچھ کھاتوں میں کہا گیا ہے کہ امام السجد (ع) نے کوفہ میں تقریر کی ، لیکن اس بات کو قبول کرنا مشکل ہے کہ کوفہ میں محدود صورتحال ، سرکاری ایجنٹوں کے ظلم و ستم ، کوفہ کے لوگوں سے خوف اور ان کے ناکارہ انداز کی وجہ سے۔ اس کے علاوہ ، کوفہ میں ان کی تقریر میں ان سے بیان کردہ جملوں ان سے ملتے جلتے ہیں جو انہوں نے (ع) نے دمشق کی مسجد میں اپنی تقریر میں کہا تھا اور یہ بھی ممکن ہے کہ کچھ راویوں نے ان کا اختصاص کیا ہو۔ [24]\n" +
                "\n" +
                "بہرحال ، عبید اللہ ابن زیاد نے امام السجد (ع) اور کربلا کے دیگر اسیروں کو جیل میں رکھا اور دمشق کو ایک خط لکھ کر یزید سے پوچھا کہ ان کے ساتھ کیا کرنا ہے۔ یزید نے جواب دیا اور اسے حکم دیا کہ اسیروں اور شہدائے کربلا کے سربراہوں کو دمشق بھیجیں۔ عبید اللہ ابن زیاد نے امام (ع) کی گردن پر بیڑیاں ڈالیں اور اس کو اور دیگر اسیران کو مظفر بن طلبہ کے ساتھ دمشق بھیج دیا۔ [25]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "دمشق:\n" +
                "\n" +
                "امام السجد (ع) نے دمشق کی مسجد میں ایک تقریر کی اور اپنے آپ کو ، اپنے والد اور اپنے دادا کو لوگوں سے متعارف کرایا اور دمشق کے لوگوں کو بتایا کہ یزید اور اس کے ایجنٹوں نے جو پروپیگنڈا کیا ہے وہ سچ نہیں ہے۔ ان کے والد باغی نہیں تھے اور وہ مسلم معاشرے کو پریشان کرنا اور اسلامی سرزمین پر فساد کرنا نہیں چاہتے تھے۔ وہ (ا) حق کی طرف راغب ہوا اور مسلمانوں کے دعوت نامے سے مذہب میں پائے جانے والے مذہب کو ختم کرنے اور اس کے نانا کے وقت اس کی سادگی اور پاکیزگی کو سامنے لایا۔ [26]" +
                "\n\n\n\n\n" +
                "واپس مدینہ:\n" +
                "\n" +
                "امام السجد (ع) جنگ کربلا کے 34 سال بعد زندہ رہے اور ہمیشہ ہی شہدائے کربلا کی یاد کو زندہ رکھنے کے لئے کوششیں کرتے رہے۔\n" +
                "\n" +
                "جب بھی وہ (ع) پانی پیتا ، اپنے والد کو یاد کرتا اور امام الحسین (ع) کی مشکلات پر روتا۔ سے ایک روایت میں اس کا تذکرہ کیا گیا ہے\n" +
                "امام الصادق (ع) کہ ، \"امام سجاد (ع) اپنے معزز والد پر چالیس سال تک روتے رہے ، جب وہ (ع) دن کے روزے رکھے اور راتوں کی نماز پڑھ رہے تھے۔ روزہ افطار کے وقت جب اس کے خادم نے لیا اس کے لئے کھانا اور پانی ، آپ (ع) نے فرمایا ، رسول اللہ (ص) کے پوتے کو بھوکا شہید کردیا گیا!\n" +
                "\n" +
                "نواسہ رسول (ص) کو پیاسے شہید کردیا گیا! ' امام (ع) نے اس کو بار بار دہراتے اور روتے کہ اس کے آنسو اس کے کھانے پینے میں گھل مل جاتے۔ امام (ع) اس وقت تک تھے جب تک کہ ان (ع) کا انتقال نہیں ہوا۔ \"[27]");
        str.add("عبادت:\n" +
                "\n" +
                "مالک ابن انس نے کہا ، \"علی ابن الحسین (ع) نے (ع) کے انتقال سے قبل روزانہ ایک ہزار رکعت نماز پڑھی۔ اس طرح ، ان (ع) کو زین العابدین (نمازیوں کی زینت) کہا جاتا تھا۔ \"[34]\n" +
                "\n" +
                "ابن عبد ربیح نے لکھا ہے ، \"جب علی ابن الحسین (ع) نماز کے ل  تیار ہوجاتے تو ، وہ (ع) عجیب سے کانپ اٹھتا تھا ، اس (ع) سے اس کے بارے میں پوچھا گیا اور کہا ، افسوس تمہیں کسے پکارا جاتا ہے؟ میں کس کے سامنے کھڑا ہوں گا اور کس کے سامنے دعا کر رہا ہوں؟ '' [35 35]\n" +
                "\n" +
                "مالک ابن انس نے کہا ، \"جب علی ابن الحسین (ع) نے احرام باندھا اور تلبیہ کہا ، تو وہ بے ہوش ہوگیا اور (اللہ کے خوف سے) اس کی زد میں آکر گر گیا۔\" [] 36]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "غریبوں کی مدد کرنا:\n" +
                "\n" +
                "ابو حمزہ الثومالی نے کہا ، \"ہر رات علی ابن الحسین (ا) چپکے سے اپنے کندھے پر کچھ غریبوں کے پاس لے کر جاتے تھے اور کہتے تھے ، 'رات کے اندھیرے میں بنایا ہوا صدقہ خدا کے قہر کو کم کرتا ہے۔' [37]\n" +
                "\n" +
                "محمد ابن اسحاق نے کہا ، \"مدینہ میں ایسے لوگ رہتے تھے جن کو یہ معلوم نہیں تھا کہ ان کی روز مرہ کی فراہمی کس طرح کی جاتی ہے 'اور علی ابن الحسین (ع) کے انتقال کے بعد ، ان کی رات کے کھانے کی فراہمی رک گئی۔\" [] 38]\n" +
                "\n" +
                "رات کے وقت ، انہوں نے (ع) نے روٹی کی ٹوکریاں اپنے کندھے پر رکھی اور غریبوں کے گھروں کے پاس گئے اور کہا ، \"صدقہ چھپ چھپا کر خدا کے قہر کو راضی کرتا ہے۔\" ان ٹوکریاں پر اس کے کندھوں پر نشانات تھے اور جب وہ (ع) کے انتقال کے بعد اس کے جسم کو دھو رہے تھے تو انہوں نے یہ نشانات دیکھے۔ ابن سعد نے لکھا ہے ، \"جب ایک غریب شخص اس کے پاس آیا تو ، وہ (ع) گیا اور مسکینوں کو جو چاہتا تھا دیا اور کہا ، پہلے\n" +
                "\n" +
                "خیرات طلب کرنے والے تک پہنچ جاتی ہے ، یہ خدا کے ہاتھ تک پہنچ جاتی ہے۔ '' [40]\n" +
                "\n" +
                "ایک سال وہ (ا) حج کے لئے جانا چاہتا تھا۔ اس کی بہن سکائینہ نے ایک ہزار درہم سفر کے لئے ایک سامان کا سامان تیار کیا۔\n" +
                "\n" +
                "جب وہ (ع) حررہ پہنچا تو انہوں نے وہ رزق اپنے پاس لے لیا اور امام (ع) نے اسے تمام غریبوں میں بانٹ دیا۔ []१]\n" +
                "\n" +
                "امام سجاد (ع) ایک کزن زاد بھائی ہے۔ وہ\n" +
                "\n" +
                "رات کے وقت اس کے پاس اس طرح گیا کہ اس نے اسے پہچان نہیں لیا اور اسے کچھ دینار دیئے۔ اس کے کزن نے کہا ، \"علی ابن الحسین (ع) اپنے رشتہ داروں کی کوئی پرواہ نہیں کرتے ، خدا اسے سزا دے۔\" امام (ع) نے یہ سن کر حرام کیا اور اپنے چچا زاد بھائی کو اپنا چہرہ نہیں دکھایا۔ جب امام (ع) کا انتقال ہوگیا اور رات کے وقت اس شخص کا چندہ بند کردیا گیا تو اسے احساس ہوا کہ عطیہ کرنے والا دراصل علی علی ہے۔ الحسین (ع) ، تو وہ امام (ع) کی قبر پر گیا اور پکارا۔ []२]\n" +
                "\n" +
                "ابو نعیم نے لکھا ہے ، \"امام السجاد (ع) نے اپنی ساری جائداد غریبوں میں دو بار تقسیم کی اور کہا ، 'خدا توبہ کرنے والا وفادار بندہ پسند کرتا ہے۔'\" [] 43] کہیں اور ، انہوں نے لکھا ، \"لوگ اسے ناگوار سمجھتے تھے اور جب وہ (اے) چل بسا ، انہیں معلوم ہوا کہ اس نے (اے) ایک سو خاندانوں کا خرچہ فراہم کیا۔ [] 44] جب ایک بھکاری اس کے پاس آیا تو اس (ع) نے کہا ، 'مبارک ہو وہ جس نے آخرت میں میرا رزق اٹھایا ہو۔ . \"\" [45]" +
                "\n\n\n\n\n" +
                "غلاموں کے ساتھ برتاؤ:\n" +
                "\n" +
                "امام السجد (ع) کی ایک کوشش جو مذہبی بھی تھی اور سیاسی بھی غلاموں پر توجہ دینا۔ وہ لوگ جو خاص طور پر دوسرے خلیفہ (عمر بن الخطاب) کے بعد اور خاص طور پر امویوں کے زمانے کے بعد انتہائی معاشرتی دباؤ میں تھے اور وہ پہلی صدیوں میں اسلامی معاشرے کے سب سے محروم لوگوں میں شامل تھے۔\n" +
                "امام علی (ع) کی طرح جس نے عراق میں موالی (آزاد ملازمین) کو اپنے اسلامی طرز عمل سے اپنی طرف راغب کیا ، امام سجاد (ع) نے ان لوگوں کے معاشرتی وقار کو فروغ دینے کی کوشش کی۔\n" +
                "\n" +
                "سید الاحد نے لکھا ، \"امام السجد (ع) نے غلام خریدے حالانکہ امام (ع) کو ان کی ضرورت نہیں تھی۔ انہوں نے (ا) نے انہیں صرف انھیں آزاد کرنے کے لئے خریدا تھا۔ غلاموں نے جنہوں نے امام (ع) کی اس نیت کو دیکھا ، وہ وہ چاہتا تھا کہ وہ انھیں خرید لے۔ امام السجاد (ع) نے انہیں کسی بھی وقت یا صورتحال پر رہا کیا ، تا کہ بہت سے لوگ ، آزاد کردہ خادموں کی فوج کی طرح ، مرد اور خواتین مدینہ میں نظر آئے جو سب امام (ع) کے آزاد کردہ خادم تھے۔ ) \"");
        str.add("الصحیفہ\n" +
                "السجدیہ امام سجاد کی (ا) دعائوں کا ایک مجموعہ اور آئینہ ہے جس میں اس وقت کے معاشرے کی تصویر ، خاص طور پر مدینہ کو دیکھا جاسکتا ہے: اس وقت کے برے سلوک اور لوگوں کی تقریر سے نفرت خدا کی پناہ جو اس نے (ع) نے دیکھا اور سنا ہے ، اور دین اور قرآن کی رہنمائی میں صحیح راہ کو واضح کرنا اور آلودگیوں سے نفسوں کو پاک کرنا۔ گویا امام (ع) زیادہ سے زیادہ لوگوں کو شیطان سے منقطع کرنے اور خدا سے مربوط کرنے کے خواہاں تھے۔ الصحیفہ\n" +
                "السجدیہ کا متعدد زبانوں میں ترجمہ کیا گیا ہے۔");

        udesc.add(str);





        etitleH.add("Imam Muhammad ibne Ali al-Baqir (A)");
        utitleH.add("امام محمد ابن علی البقیر"
                +" (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);

        str=new ArrayList<>();
        str.add("Biography In Brief");
        str.add("Life");
        str.add("Scientific Movement");
        str.add("Exegesis");
        str.add("Hadiths");
        str.add("Theology");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("Urdu Birth");
        str.add("Urdu Early");
        str.add("Urdu Battle");
        str.add("Life");
        str.add("Urdu Birth");
        str.add("Urdu Early");
        str.add("Urdu Battle");

        utitle.add(str);

        str=new ArrayList<>();

        str.add("Imam Muhammad ibne Ali al-Baqir (A)\n" +
                "  (امام محمد ابن علی البقیر) "+
                "\n"+
                "known as Imām al-Bāqir (a) and\n" +
                "Bāqir al-'Ulūm, was the fifth Imam of the\n" +
                "Shi'a, whose period of Imamate lasted\n" +
                "nineteen years.\n\n\n\n" +
                "Teknonym:\tAbu Ja'far\n\n"+
                "Born: Rajab 1, 57/May 10, 677\n\n" +
                "Birthplace: Medina\n\n" +
                "Imamate: From Muharram 25, 95/October 20," +
                "713(for 19 years)\n\n" +
                "Martyrdom: Dhu l-Hijja 7, 114/January 28, 733\n\n" +
                "Cause of " +
                "Martyrdom: By poisoning\n" +
                "\n\n\n\n" +
                "Imam al-Baqir (a) made a great scientific\n" +
                "movement which reached its peak at the\n" +
                "time of his son Imam al-Sadiq (a). His\n" +
                "narrations in religion, conduct of the\n" +
                "Prophet (s), Qur'an sciences, moral\n" +
                "conduct, and manner is more than what is remained from the children of Imam al-\n" +
                "Hasan (a) and Imam al-Husayn (a). Thus,\n" +
                "during his imamate, a great step was\n" +
                "taken towards organization of Shi'i thought\n" +
                "in different fields including ethics,\n" +
                "jurisprudence, theology, exegesis, etc.\n" +
                "According to historical sources he was\n" +
                "present at Battle of Karbala as a child.\n");


        str.add("Birth:\n" +
                "\n" +
                "Imam al-Baqir (a) was born on Friday Rajab 1, 57/May 10, 677 in Medina.[6] Some have reported his birth to have been on Safar 3/December 16 of the same year (57/676)[7]. He was a small child and present in the Battle of Karbala[8].\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "In narrations, Umm Farwa is mentioned as the wife of Imam al-Baqir (a), who was the mother of Imam al-Sadiq (a). Also narrations mention another woman called Umm Hakim, daughter of Usayd al-Thaqafi as a wife of Imam (a), who was the mother of two of the Imam's (a) children and another wife of Imam (a) who was a concubine and the mother of three other children of Imam (a)[9].\n" +
                "\n" +
                "The number of the children of Imam al-Baqir (a) was seven, including five sons and two daughters:\n" +
                "\n" +
                "Jafar & Abd Allah: the mother of these two was Umm Farwa, daughter of al-Qasim b. Muhammad.\n" +
                "Ibrahim & Ubayd Allah: the mother of him and Ibrahim was Umm Hakim, daughter of Usayd al-Thaqafi. No children remained from these two sons.\n" +
                "Ali & Zaynab: the mohter of the these two was a concubine.\n" +
                "Umm Salama: the mother of whom, was a concubine.[10]\n" +
                "\n" +
                "\n\n\n" +
                "Battle of karbala:\n" +
                "\n" +
                "He was 3.5 years old in Karbala. He was also tortured like other children in the tragedy of Karbala. He was made captive along with his family and was taken to Kufa and then Damascus.\n" +
                "At last he returned Madina after 1 year of captivity.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imam al-Baqir (a) became the Imam in 95/713 after his father was martyred and had the responsibility of leading the Shi'a until his martyrdom in 114/733 (or 117/735).");





        str.add("From 94/712-13 to 114/732-33, there was\n" +
                "a period of different schools of\n" +
                "jurisprudence emerging and narrating many hadiths about exegesis. This was\n" +
                "because of the weakening of the Umayyad\n" +
                "government and the conflicts among\n" +
                "statesmen over power. Sunni scholars, Ibn\n" +
                "Shihab al-Zuhri, Makhul al-Shami, Hisham\n" +
                "b. 'Urwa, etc. were active in narrating\n" +
                "hadiths and issuing Fatwa, and other\n" +
                "groups tried to spread their own beliefs\n" +
                "such as Khawarij, Murji'a, Kaysaniyya, and\n" +
                "Ghulat.\n" +
                "Before this time, Shi'a jurisprudential\n" +
                "viewpoints were clarified in a few issues\n" +
                "like adhan, taqiyya (precautionary\n" +
                "dissimulation), funeral prayer, .... By the\n" +
                "begining of Imam al-Baqir's (a) imamate a great scientific movement by him emerged\n" +
                "in Shi'a which reached its peak at the time\n" +
                "of his son, Imam al-Sadiq (a). He (a) was\n" +
                "superior to all nobles of Banu Hashim in\n" +
                "knowledge, piety, dignity, and merits. His\n" +
                "narrations in religion, conduct of the\n" +
                "Prophet (s), Qur'an sciences, moral\n" +
                "conduct, and manners are more than what\n" +
                "remained from the children of Imam al-\n" +
                "Hasan (a) and Imam al-Husayn (a) until\n" +
                "then.[16] It was in this period that Shi'a\n" +
                "started to well establish its culture -\n" +
                "including jurisprudence, exegiseis, and ethics.[17]\n" +
                "Imam al-Baqir (a) strongly rejected\n" +
                "reasoning of the followers of analogy\n" +
                "(qiyas) in jurisprudence[18] and took sharp\n" +
                "stances against other Islamic sects and\n" +
                "this way tried to separate the authentic\n" +
                "ideological domain of the Ahl al-Bayt (a) in\n" +
                "different fields from other sects.\n" +
                "Regarding Khawarij, he (a) said, \"Khawarij\n" +
                "suffered out of ignorance; while religion is\n" +
                "more lenient and flexible than how they\n" +
                "know it.\"\n" +
                "[19]\n" +
                "The scientific fame of Imam al-Baqir (a)\n" +
                "was not only known in Hijaz but also had\n" +
                "spread in Iraq and Khurasan. There is even a report saying about the Imam (a), \"I saw\n" +
                "people of Khurasan had circled around\n" +
                "him and asked him their scientific\n" +
                "questions.\"\n" +
                "[20]\n" );





        str.add("Imam al-Baqir (a) had dedicated a part of\n" +
                "his time to explain exegesis issues, by\n" +
                "holding exegesis sessions and answering\n" +
                "the questions of scholars and other\n" +
                "people. It is said that Imam al-Baqir (a)\n" +
                "wrote a book in exegesis of the Qur'an\n" +
                "which Ibn Nadim has mentioned in his al-Fihrist.\n" +
                "Imam (a) considered the knowledge of the\n" +
                "Qur'an only held by the Ahl al-Bayt (a),\n" +
                "since it is only they who can distinguish\n" +
                "the clear issues in the Qur'an from unclear\n" +
                "ones and the abrogating from the\n" +
                "abrogated. Such power is not held by\n" +
                "anyone other than the Ahl al-Bayt (a) and\n" +
                "thus Imam al-Baqir (a) said, \"Nothing is\n" +
                "farther than exegesis of the Qur'an from\n" +
                "the intellect of people; since, a verse which\n" +
                "is a cohesive speech, the beginning of\n" +
                "which happens to be about one issue and\n" +
                "the end of it about another issue and this\n" +
                "cohesive speech is interpreted from\n" +
                "different aspects.\"\n" +
                "[22]\n" +
                "\n");


        str.add("Imam al-Baqir (a) paid particular attention\n" +
                "to hadiths (or traditions) from the Prophet\n" +
                "(s) to the extent that Jabir b. Yazid al-Ju'fi\n" +
                "narrated 70,000 traditions from the noble\n" +
                "Prophet (s) from him (a). Also, Aban b.\n" +
                "Taghlib and other students of Imam al-\n" +
                "Baqir (a) narrated a great number of this\n" +
                "tremendous legacy from the Imam (a).\n" +
                "Imam al-Baqir (a) did not suffice to only\n" +
                "narrating and spreading traditions, but he\n" +
                "(a) also encouraged his companions to\n" +
                "strive in understanding traditions and\n" +
                "learning their meanings. In a statement, he \"Know the levels of our Shi'a by the\n" +
                "number of hadiths from the Ahl al-\n" +
                "Bayt (a) they narrate and their\n" +
                "knowledge to them, which is the\n" +
                "knowledge to hadith (dirayat al-\n" +
                "hadith); and it is through\n" +
                "understanding of hadiths that the\n" +
                "faithful reach highest levels of faith.\"");


        str.add("At the time of Imam al-Baqir (a), the\n" +
                "emerging foundations and expression of\n" +
                "different beliefs and thoughts were easier,\n" +
                "due to opportunity and the lack of\n" +
                "pressure and control by the government which also caused deviant thoughts to\n" +
                "spread in the society. Under these\n" +
                "circumstances, Imam al-Baqir (a) had to\n" +
                "announce authentic Islamic beliefs,\n" +
                "denounce and reject false beliefs, and\n" +
                "answer related questions. Therefore, he\n" +
                "(a) held his theological discussions with\n" +
                "the direction towards the mentioned\n" +
                "issues. Among such issues was the\n" +
                "inability of human intellect to understand\n" +
                "the truth of God[24], eternal existence of\n" +
                "the Necessary Existent[25], and the\n" +
                "necessity to obey Imam[26]\n" +
                ".\n" +
                "Other legacies left behind by Imam al-\n" +
                "Baqir (a) are jurisprudential[27] and historical legacies.");

        str.add("Imam al-Baqir (a) passed away on Dhu l-\n" +
                "Hijjah 7, 114/January 28, 733[33]. There are\n" +
                "other opinions about the year of his\n" +
                "demise.\n" +
                "There are different narrations and\n" +
                "historical opinions regarding the person\n" +
                "who martyred Imam al-Baqir (a). Some\n" +
                "sources have mentioned Hisham b. Abd al-\n" +
                "Malik as the one who martyred him[34]\n" +
                ".\n" +
                "Some have accused Ibrahim b. al-Walid as\n" +
                "the person who poisoned the Imam (a)[35]\n" +
                ".\n" +
                "Some narrations have considered Zayd b.\n" +
                "al-Hasan as the person who facilitated the\n" +
                "plot for martyring the Imam (a). In either\n" +
                "case, Imam al-Baqir (a) was martyred during the caliphate of Hisham b. 'Abd al-\n" +
                "Malik[36], because his caliphate was from\n" +
                "108/726-7 until 125/742-3 and the last\n" +
                "year ever mentioned for the martyrdom of\n" +
                "Imam al-Baqir (a) is 118/736.\n" +
                "Although the reports are seemingly\n" +
                "different, it is not impossible that they\n" +
                "could all be correct to a certain degree.\n" +
                "There lies a possibility that several people\n" +
                "cooperated in the martyrdom of Imam al-\n" +
                "Baqir (a), as the reports refer to each of\n" +
                "them. Regarding the violent behavior of\n" +
                "Hisham b. 'Abd al-Malik towards Imam al-\n" +
                "Baqir (a) and the undeniable enmity of\n" +
                "Umayyads with Imam Ali's (a) descendants, there is no doubt that\n" +
                "Hisham had strong motivation to play a\n" +
                "role in the martyrdom of Imam al-Baqir (a)\n" +
                "even if it was indirectly. Clearly, to have\n" +
                "made his plot materialize, Hisham would\n" +
                "have used trustworthy people. Therefore,\n" +
                "he employed Ibrahim b. al-Walid who was\n" +
                "an Umayyad and an enemy of the Ahl al-\n" +
                "bayt (a), who could use a person who\n" +
                "could easily enter the home of Imam al-\n" +
                "Baqir (a). Through him, the scheming plot\n" +
                "of Hisham unfolded and Imam (a) was\n" +
                "martyred.\n" +
                "Imam al-Baqir (a) was buried beside his\n" +
                "father's grave and the grave of al-Hasan b. 'Ali (a), his father's uncle, in Al-Baqi'\n" +
                "Cemetery\n" +
                "[37]");

        edesc.add(str);

        str=new ArrayList<>();
        str.add("امام محمد ابن علی باقر (ع) کو امام البقیر (ع) اور باقر ال علم کے نام سے جانا جاتا ہے ، شیعوں کے پانچویں امام تھے ، جن کی امامت کا دورانیہ انیس برس تک رہا۔\n\n\n\n\n\n\n" +
                "ٹیکنوم: ابو جعفر\n\n" +
                "ولادت: رجب 1 ، 57/10 مئی ، 677\n\n" +
                "\n" +
                "جائے پیدائش: مدینہ\n" +
                "\n" +
                "امامت: محرم 25 ، 95/20 اکتوبر ،\n" +
                "713 (19 سال تک)\n" +
                "شہادت: ذو الحجہ 7 ، 114/28 جنوری ، 733\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امام البقر (ع) نے ایک بہت بڑا سائنسی طریقہ تیار کیا\n" +
                "تحریک جو اپنے عروج پر پہنچی\n" +
                "ان کے بیٹے امام الصادق (ع) کا وقت۔ اس کا\n" +
                "مذہب میں روایات ، کے طرز عمل\n" +
                "رسول اللہ (ص) ، قرآن مجید ، اخلاقیات\n" +
                "طرز عمل اور سلوک اس سے زیادہ ہے جو اولاد اولاد امام علی علیہ السلام سے باقی ہے۔\n" +
                "حسن (ع) اور امام الحسین (ع)۔ اس طرح ،\n" +
                "اس کی امامت کے دوران ، ایک عمدہ اقدام تھا\n" +
                "تنظیم شیعہ کی تنظیم کی طرف لے جایا گیا\n" +
                "اخلاقیات سمیت مختلف شعبوں میں ،\n" +
                "فقہ ، الہیات ، تفسیر ، وغیرہ۔\n" +
                "تاریخی ذرائع کے مطابق وہ تھا\n" +
                "بچپن میں لڑائی کربلا میں حاضر");
        str.add("پیدائش:\n" +
                "\n" +
                "امام باقر (ع) جمعہ رجب 1 ، 57/10 مئی ، 677 کو مدینہ منورہ میں پیدا ہوئے۔ [6] کچھ نے اس کی پیدائش اسی سال (57/676) صفر 3/16 دسمبر کو ہونے کی اطلاع دی ہے []]۔ وہ ایک چھوٹا بچہ تھا اور جنگ کربلا میں حاضر تھا [8]۔\n" +
                "          \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیویاں اور بچے:\n" +
                "\n" +
                "ام فروا کو امام البقیر (ع) کی اہلیہ کے طور پر ذکر کیا گیا ہے ، جو امام الصادق (ع) کی والدہ تھیں۔ نیز روایات میں ایک اور خاتون کا ذکر ہے جس کا نام ام حاکم ہے ، جو اسید الثقفی کی بیٹی ہیں (بطور امام (ع)) ، جو امام (ع) کے دو بچوں کی ماں تھیں اور امام (ع) کی ایک اور بیوی تھیں جو ایک ساتھی تھیں اور امام (ع) کے تین دیگر بچوں کی والدہ []]۔\n" +
                "\n" +
                "\n" +
                "امام باقر (ع) کے بچوں کی تعداد سات تھی جن میں پانچ بیٹے اور دو بیٹیاں تھیں:\n" +
                "\n" +
                "\n" +
                "\n" +
                "جعفر اور عبد اللہ: ان دونوں کی ماں ام فروا ، القاسم بی کی بیٹی تھی۔ محمد\n" +
                "                \n" +
                "\n" +
                "ابراہیم اور عبید اللہ: اس کی اور ابراہیم کی والدہ ام حکیم تھیں ، جو اسید الثقفی کی بیٹی تھیں۔ ان دونوں بیٹوں میں سے کوئی اولاد باقی نہیں رہی۔\n" +
                "\n" +
                "علی اور زینب: ان دونوں کا راگ الاپنے والا تھا\n" +
                "\n" +
                "ام سلامہ: جن کی والدہ ، ایک لونڈی تھیں۔ [10]\n" +
                " \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "جنگ کربلا:\n" +
                "\n" +
                "وہ کربلا میں 3.5 سال کا تھا۔ سانحہ کربلا میں اسے دوسرے بچوں کی طرح اذیتیں بھی دی گئیں۔ اسے اہل خانہ کے ہمراہ اسیر کرلیا گیا اور کوفہ اور پھر دمشق لے جایا گیا۔ آخر کار اس نے ایک سال قید میں رہنے کے بعد مدینہ کو لوٹا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "امام باقر (ع) اپنے والد کے شہید ہونے کے بعد 95/713 میں امام بنے اور 114/733 (یا 117/735) میں اپنی شہادت تک شیعوں کی امامت کرنے کی ذمہ داری قبول کی۔");
        str.add("94 / 712-13 سے 114 / 732-33 تک ، تھا\n" +
                "کے مختلف اسکولوں کی مدت\n" +
                "فقہ ابھر کر سامنے آ رہا ہے اور تفسیر کے بارے میں بہت ساری احادیث بیان کر رہا ہے۔ یہ تھا\n" +
                "امیہ کو کمزور کرنے کی وجہ سے\n" +
                "حکومت اور آپس میں تنازعات\n" +
                "اقتدار پر سیاستدان۔ سنی علماء ، ابن\n" +
                "شہاب الظہری ، مخول الشامی ، ہشام\n" +
                "ابن عروہ وغیرہ بیان کرنے میں سرگرم تھے\n" +
                "احادیث اور فتویٰ جاری کرنا ، اور دیگر\n" +
                "گروہوں نے اپنے اپنے عقائد کو پھیلانے کی کوشش کی\n" +
                "جیسے خوارج ، مرجیہ ، کیسانیا ، اور\n" +
                "غلات۔\n" +
                "اس وقت سے پہلے ، شیعہ فقہ\n" +
                "کچھ امور میں نقطہ نظر کی وضاحت کی گئی\n" +
                "جیسے اذان ، تقیہ (احتیاطی)\n" +
                "تحلیل)، نماز جنازہ، .... بذریعہ خدا\n" +
                "امام باقر (ع) کے امامت کے آغاز سے ان کی ایک عظیم سائنسی تحریک ابھری\n" +
                "شیعہ میں جو اس وقت عروج کو پہنچا تھا\n" +
                "ان کے بیٹے ، امام الصادق (ع) کی۔ وہ (ا) تھا\n" +
                "میں بنو ہاشم کے تمام امرا سے افضل\n" +
                "علم ، تقویٰ ، وقار ، اور خوبیاں۔ اس کا\n" +
                "مذہب میں روایات ، کے طرز عمل\n" +
                "رسول اللہ (ص) ، قرآن مجید ، اخلاقیات\n" +
                "طرز عمل اور آداب اس سے کہیں زیادہ ہیں\n" +
                "امام علی کے بچوں سے رہا\n" +
                "حسن (ع) اور امام الحسین (ع) تک\n" +
                "پھر۔ [16] یہ اسی دور میں شیعہ تھا\n" +
                "اپنی ثقافت کو اچھی طرح سے قائم کرنا شروع کیا -\n" +
                "فقہ ، مثال اور اخلاقیات بھی شامل ہیں۔ [17]\n" +
                "امام باقر (ع) نے سختی سے مسترد کردیا\n" +
                "مشابہت کے پیروکاروں کی استدلال\n" +
                "(قیص) فقہ میں [18] اور تیز ہوا\n" +
                "دوسرے اسلامی فرقوں کے خلاف موقف اور\n" +
                "اس طرح مستند کو الگ کرنے کی کوشش کی\n" +
                "اہل بیت (ع) میں نظریاتی ڈومین\n" +
                "دوسرے فرقوں سے مختلف قطعات\n" +
                "خوارج کے بارے میں ، آپ (ع) نے کہا ، \"خوارج\n" +
                "لاعلمی سے دوچار ہوا۔ جبکہ مذہب ہے\n" +
                "اس سے کہیں زیادہ نرم اور لچکدار\n" +
                "پتا ہے.\"\n" +
                "[19]\n" +
                "امام البقر (ع) کی سائنسی شہرت\n" +
                "نہ صرف حجاز میں جانا جاتا تھا بلکہ یہ بھی تھا\n" +
                "عراق اور خراسان میں پھیل گیا۔ یہاں تک کہ ایک رپورٹ امام (ع) کے بارے میں بھی کہتی ہے ، \"میں نے دیکھا\n" +
                "خراسان کے لوگ چاروں طرف چکر لگا چکے تھے\n" +
                "اس سے اور اس سے ان کا سائنسی سوال کیا\n" +
                "سوالات۔ \"");
        str.add("امام باقر (ع) نے اس کا ایک حصہ وقف کیا تھا\n" +
                "اس کا وقت تفسیر کے امور کی وضاحت کرنے کا\n" +
                "استثناءی سیشنوں کا انعقاد اور جواب دینا\n" +
                "علمائے کرام اور دیگر کے سوالات\n" +
                "لوگ کہا جاتا ہے کہ امام باقر (ع)\n" +
                "قرآن مجید کی تفسیر میں ایک کتاب لکھی\n" +
                "جس کا ابن ندیم نے اپنے الفہرسٹ میں ذکر کیا ہے۔\n" +
                "امام (ع) نے خدا کے علم کو سمجھا\n" +
                "قرآن صرف اہل بیت (ع) کے پاس تھا ،\n" +
                "چونکہ یہ صرف وہی ہیں جو تمیز کرسکتے ہیں\n" +
                "قرآن مجید میں واضح امور غیر واضح ہیں\n" +
                "والوں اور سے منسوخی\n" +
                "منسوخ اس طرح کی طاقت کے پاس نہیں ہے\n" +
                "اہل بیت (ع) کے علاوہ کوئی اور\n" +
                "اس طرح امام باقر (ع) نے فرمایا ، \"کچھ بھی نہیں ہے\n" +
                "قرآن مجید کی تفسیر سے کہیں زیادہ ہے\n" +
                "لوگوں کی عقل؛ چونکہ ، ایک آیت جس میں\n" +
                "ایک ہم آہنگ تقریر ہے ، آغاز ہے\n" +
                "جو ایک مسئلے کے بارے میں ہوتا ہے اور\n" +
                "کسی اور مسئلے اور اس کے بارے میں اس کا اختتام\n" +
                "مربوط تقریر کی ترجمانی کی جاتی ہے\n" +
                "مختلف پہلوؤں. \"\n" +
                "[22]");
        str.add("امام البقر (ع) نے خصوصی توجہ دی\n" +
                "رسول اللہ صلی اللہ علیہ وسلم سے احادیث (یا روایات)\n" +
                "(ص) اس حد تک کہ جابر بن یزید الجوفی\n" +
                "رئیس نے 70،000 روایات بیان کیں\n" +
                "آپ (ع) کی طرف سے نبی (ص)۔ نیز ابان ابن\n" +
                "تحلیب اور دیگر طلباء\n" +
                "باقر (ع) نے اس کی ایک بڑی تعداد بیان کی\n" +
                "امام (ع) کی زبردست میراث۔\n" +
                "امام البقر (ع) صرف کافی نہیں تھا\n" +
                "روایات بیان کرنا اور پھیلانا ، لیکن امام (ع) نے اپنے ساتھیوں کی بھی حوصلہ افزائی کی\n" +
                "روایات کو سمجھنے کی کوشش کریں\n" +
                "ان کے معانی سیکھنا ایک بیان میں ، وہ \"ہمارے شیعوں کی سطح کو رب نے جان لیا\n" +
                "اہل حدیث کی تعداد احادیث\n" +
                "بیت (ع) وہ بیان کرتے ہیں اور ان کی\n" +
                "ان کے لئے علم ، جو ہے\n" +
                "علم حدیث (درایت ال-\n" +
                "حدیث)؛ اور اس کے ذریعے ہے\n" +
                "احادیث کی تفہیم کہ\n" +
                "وفادار ایمان کے اعلی درجے تک پہنچتے ہیں۔ \"");
        str.add("امام باقر (ع) کے وقت ،\n" +
                "ابھرتی ہوئی بنیادیں اور اظہار\n" +
                "مختلف عقائد اور افکار آسان تھے ،\n" +
                "موقع اور کمی کی وجہ سے\n" +
                "حکومت کے ذریعہ دباؤ اور کنٹرول جس نے شیطانی افکار کو بھی جنم دیا\n" +
                "معاشرے میں پھیل گیا۔ ان کے تحت\n" +
                "حالات ، امام البقر (ع) کو کرنا پڑا\n" +
                "مستند اسلامی عقائد کا اعلان ،\n" +
                "جھوٹے عقائد کی مذمت اور انکار کریں ، اور\n" +
                "متعلقہ سوالات کے جوابات دیں۔ لہذا ، وہ\n" +
                "(ا) کے ساتھ اپنے مذہبی گفتگو کی\n" +
                "سمت ذکر کی طرف\n" +
                "مسائل اس طرح کے مسائل میں سے ایک تھا\n" +
                "انسانی عقل کو سمجھنے سے قاصر ہے\n" +
                "خدا کی سچائی [24] ، کا ابدی وجود\n" +
                "ضروری موجود [25] ، اور\n" +
                "امام کی اطاعت کرنے کی ضرورت [26]\n" +
                ".\n" +
                "امام علی کے ذریعہ باقی رہ جانے والی دیگر وراثتیں\n" +
                "باقر (ع) فقہ [27] اور تاریخی میراث ہیں۔");
        str.add("امام البقر (ع) ذی الحجہ 7 ، 114/28 جنوری ، 733 [33] کو چل بسے۔ اس کے انتقال کے سال کے بارے میں بھی دیگر آراء ہیں۔\n" +
                "\n" +
                "مختلف روایتیں ہیں اور\n" +
                "شخص کے بارے میں تاریخی آراء\n" +
                "جس نے امام باقر (ع) کو شہید کیا۔ کچھ\n" +
                "ذرائع نے ہشام ابن عبد الف کا ذکر کیا ہے\n" +
                "ملک بطور ایک شخص جس نے اسے شہید کیا [34]\n" +
                ".\n" +
                "بعض نے ابراہیم ابن الولید پر الزام عائد کیا ہے\n" +
                "وہ شخص جس نے امام (ع) کو زہر دیا [35]\n" +
                ".\n" +
                "کچھ روایات نے زید ابن پر غور کیا ہے\n" +
                "الحسن اس شخص کی حیثیت سے جس نے اس کی سہولت فراہم کی\n" +
                "امام (ع) کو شہید کرنے کی سازش۔ یا تو میں\n" +
                "معاملہ ، امام البقر (ع) کو ہشام بن عبد الملک []]] کی خلافت کے دوران شہید کیا گیا ، کیونکہ آپ کی خلافت کا تعلق تھا\n" +
                "108 / 726-7 تک 125 / 742-3 اور آخری\n" +
                "سال کی شہادت کے لئے کبھی ذکر کیا\n" +
                "امام البقیر (ع) 118/736 ہے۔\n" +
                "اگرچہ رپورٹس بظاہر بظاہر ہیں\n" +
                "مختلف ، یہ ناممکن نہیں ہے کہ وہ سب کچھ کسی حد تک درست ہوسکتے ہیں۔\n" +
                "\n" +
                "بہت سے لوگوں کے امکان موجود ہے\n" +
                "امام باقر (ع) کی شہادت میں تعاون کیا ، جیسا کہ اطلاعات میں سے ہر ایک کا حوالہ ہے\n" +
                "انہیں. کے پرتشدد رویے کے بارے میں\n" +
                "ہشام بن عبد الملک امام البقیر (ع) کی طرف اور ناقابل تردید دشمنی\n" +
                "امام علی (ع) کی اولاد کے ساتھ اموی ، اس میں کوئی شک نہیں کہ ہشام کو امام البقر (ع) کی شہادت میں اپنا کردار ادا کرنے کی شدید ترغیب تھی۔\n" +
                "یہاں تک کہ اگر یہ بالواسطہ تھا۔ واضح طور پر ، ہونا ہے\n" +
                "اس کی سازش کو عملی شکل دے دی ، ہشام\n" +
                "ثقہ لوگوں کا استعمال کیا ہے۔ لہذا ،\n" +
                "اس نے ابراہیم ابن الولید کو ملازم کیا جو تھا\n" +
                "ایک اموی اور اہل بیت (ع) کا دشمن ، جو ایسے شخص کو استعمال کرسکتا ہے جو آسانی سے امام البقر (ع) کے گھر میں داخل ہوسکے۔ اس کے ذریعہ ، تدبیر سازش\n" +
                "ہشام کا منکشف ہوا اور امام (ع) تھے\n" +
                "شہید۔\n" +
                "امام باقر (ع) کو ان کے پاس دفن کیا گیا تھا\n" +
                "البقیع میں والد کی قبر اور اس کے والد کے چچا الحسن ابن علی (ع) کی قبر\n" +
                "قبرستان");

        udesc.add(str);




        etitleH.add("Imam Jafar ibne Muhammad al-Sadiq (A)");
        utitleH.add("امام جعفر ابن محمد الصادق"
                +" (ع)");
        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Events in Life");
        str.add("Moral Characteristics");
        str.add("Scientific Movement");
        str.add("Well-Known Hadiths");
        str.add("Martyrdom");

        etitle.add(str);
        str.add("Biography In Brief\n");
        str.add("Events in Life\n");
        str.add("Moral Characteristics\n");
        str.add("Scientific Movement\n");
        str.add("Well-Known Hadiths\n");
        str.add("Martyrdom\n");

        utitle.add(str);


        str=new ArrayList<>();

        str.add("Imam Jafar ibne Muhammad al-Sadiq (A) \n" +
                "( امام جعفر ابن محمد الصاد  (ع))\n" +
                "\n"+

                "  known as Imām al-Ṣādiq (a), is the sixth Imam of Imamiyya and the fifth Imam of Isam'ilis. His Imamate lasted 34 (lunar) years (114/733 - 148/765) and was\n" +
                "\n" +
                "concurrent with the reign of the last five Umayyad caliphs (that is, from Hisham b. 'Abd al-Malik onwards) and with that of the first two Abbasid caliphs, al-Saffah and al-Mansur al-Dawaniqi. Because of the weakness of the Umayyad rule at his time, Imam al-Sadiq (a) was able to have relatively wider scholarly activities. His companions, students, and those who quoted hadiths from him is said to have amounted to four-thousand people. Most of the hadiths of Ahl al-Bayt (a) recorded in Twelver Shiite hadith collections are from Imam al-Sadiq (a). This is why Imamiyya is called Ja'fari School. Imam al-Sadiq (a) has had a high status in the eyes of prominent Sunni scholars. Abu Hanifa and Malik b. Anas were among the people who quoted hadiths from him.\n" +
                "\n\n\n" +
                "Teknonym:\t Abu Abd Allah and Abu Ishaq\n\n"+
                "Born: Rabi' I 17, 83/April 20, 702\n\n" +
                "Birthplace: Medina\n\n" +
                "Imamate: " +
                "From Dhu l-Hijja 7, 114/28 January,733(for 34 years)\n\n" +
                "Martyrdom: " +
                "Shawwal 25, 148/December 14, 765 " +
                "in Medina\n\n" +
                "Cause of " +
                "Martyrdom: Poison\n");

        str.add("Refraining from Uprising:\n\n" +
                "Despite the weakness of the Umayyads at his time, Imam al-Sadiq (a) stayed away from uprising and political conflicts. According to al-Shahrastani, Abu Muslim al-Khurasani sent a letter to the Imam (a) after the demise of Ibrahim al-Imam, calling him the one who deserves the caliphate most and inviting him to accept the caliphate. However, the Imam (a) wrote\n" +
                "" +
                "to him: \"You are not one of my helpers, and the time is not my time.\"[58] Abu Salama also wrote a similar letter to the Imam (a), and the Imam (a) burned his letter in response.[59] Imam al-Sadiq (a) did not participate even in the uprising of his uncle Zayd b. 'Ali.[60] According to a hadith, the Imam (a) mentioned the lack of faithful supporters as the reason why he refused to revolt.[61]\n" +
                "\n" +
                "\n\n\n" +
                "\nBurning the House of Imam al-Sadiq (a):\n" +
                "\n" +
                "According to a report, when al-Hasan b. Zayd was the governor of Mecca and Medina, he set fire to the house of Imam Sadiq (a). In the fire, the door and the corridor of the house burned. The Imam\n" +
                "" +
                "came out of the house crossing the fire saying, \"I am the son of the Roots of the Earth [i.e., Isma'il (a)]; I am the son of Ibrahim, God's Friend.\"[65]\n" +
                "\n" +
                "\n\n\n" +
                "\nUsing Taqiyya:\n" +
                "\n" +
                "Except the third decade of the second century (fifth decade of the eighth century CE), which coincided with the fall of the Umayyad caliphate, both the Umayyad and Abbasid caliphs kept the activities of the Imam (a) under watch. Political pressure on the Imam (a) reached its peak towards the end of the Imam's (a) life.[66] According to some reports, al-Mansur's agents would persecute those Shiites who were in touch with the Imam (a) and even execute them. Because of these persecutions, the Imam\n" +
                "\n" +
                "and his companions had to use taqiyya. [67]\n" +
                "\n" +
                "According to a report, when Sufyan al-Thawri visited him, Imam al-Sadiq (a) advised him to leave because they were under watch.[68] According to a hadith, the Imam (a) told Aban b. Taghlib to respond to people's jurisprudential questions by giving them the opinions of Sunni scholars in order not to be persecuted.[69] Also, several hadiths have been transmitted from Imam al-Sadiq (a) which emphasize the importance of taqiyya, according to some of which taqiyya is equal to prayer.[70]\n");


        str.add("There are many reports about the moral characteristics of Imam al-Sadiq (a), including his asceticism, generosity, abundant worship, and recitation of the Quran.[71] Malik b. Anas, the head of the Maliki school of jurisprudence reports that during the time he used to visit Imam al-Sadiq (a), the Imam (a) was always in one of the three states: praying, fasting, or saying dhikr.[72]\n" +
                "\n" +
                "It is reported that the Imam (a) gave four hundred dirhams to a beggar, and when he thanked the Imam (a), he (a) gave him his ring which was worth 10,000 dirhams.[73] According to another report, the Imam\n" +
                "\n" +
                "would put some bread, meat, and money in a bag and would take it to the houses of the poor and divide it among them, without letting them know who he was.[74] Abu Ja'far al-Khath'ami reports that Imam al-Sadiq (a) gave him a bag of money and asked him to give it to someone from Banu Hashim without telling him from where the money was coming. When Abu Ja'far gave the money to that man, he prayed for the sender and told him that this person always sends him money, but Imam al-Sadiq (a) never sends him anything even though he is rich![75]\n" +
                "\n" +
                "\n");

        str.add("Because of the weakness of the Umayyads at the time of Imam al-Sadiq (a), the Imam was relatively free to teach and engage in scholarly activities.[37] This religious and scholarly freedom rarely\n" +
                "\n" +
                "happened during the time of the other Imams, and thus most of our hadiths are from Imam al-Sadiq (a).[38] According to Ibn Hajar al-Haythami, people learned and transmitted a great deal of knowledge from him, and his fame reached far and wide.[39] Al-Jahiz also wrote that \"his knowledge and jurisprudence have filled the world.\"[40] Al-Hasan b. 'Ali al-Washsha' reports that he saw nine-hundred people in the mosque of Kufa transmitting hadiths from Imam al-Sadiq (a).[41]\n" +
                "\n" +
                "\n" +
                "Ja'fari School\n" +
                "\n" +
                "Most of the Shiite hadiths, whether in fiqh or theology, are from Imam al-Sadiq (a),[42] and the number of the people who transmitted hadiths from him (4000, according to al-Irbili) is greater than the number of hadith transmitters from any other Imam.[43] According to Aban b. Taghlib, the Shia would refer to the words of Imam Ali (a) when they disagreed about a saying of the Prophet (s) and would refer to the sayings of Imam al-Sadiq (a) when they disagreed about Imam Ali's (a) words.[44]\n" +
                "\n" +
                "Because of the significant role of Imam al-Sadiq (a) in the elaboration of Islamic\n" +
                "\n" +
                "teachings, Twelver Shiism is often called Ja'fari School[45] and the Imam (a) is known as its head.\n" +
                "\n" +
                "In 1378/1958-9, Shaykh Mahmud Shaltut, the head of al-Azhar, recognized the Ja'fari School of jurisprudence as a legitimate Islamic school and proclaimed following it permissible.[46]\n" +
                "\n" +
                "Scholarly Dialogues and Debates\n" +
                "\n" +
                "In Shiite hadith collections, some dialogues or debates between Imam al-Sadiq (a) and theologians of other schools and some atheists are reported.[47] In\n" +
                "\n" +
                "some of these debates, the Imam's (a) students debated and the Imam (a) oversaw the debate and sometimes engaged in it.[48] For instance, in a debate with a scholar from Damascus, who had requested to debate with the Imam's (a) students, the Imam (a) asked Hisham b. Salim to have a debate with him on theology.[49] On another occasion, the Imam (a) told a person who wanted to debate with him to debate with his students first. The man debated with Humran b. A'yan about the Quran, with Aban b. Taghlib about Arabic literature, with Zurara about jurisprudence, and with Mu'min al-Taq and Hisham b. Salim about\n" +
                "\n" +
                "theology and was defeated by all of them.[50]\n" +
                "\n" +
                "Ahmad b. Ali al-Tabrisi has collected some of the debates of Imam al-Sadiq (a), some of which are the following:\n" +
                "\n" +
                "A debate with an atheist on the existence of God\n" +
                "\n" +
                "A debate with Abu Shakir al-Daysani on the existence of God[51]\n" +
                "A debate with Ibn Abi l-Awja' on the existence of God[52]\n" +
                "A debate with Ibn Abi l-Awja' on the world's creation in time[53]\n" +
                "\n" +
                "A lengthy debate with an atheist on different religious issues[54]\n" +
                "A debate with Abu Hanifa on the\n" +
                "\n" +
                "methodology of jurisprudence, especially on analogy.[55]\n" +
                "\n" +
                "A debate with some Mu'tazili scholars on how to choose a ruler and on some religious rulings.[56]\n");



            str.add("Some of the well-known hadiths of Imam al-Sadiq (a) are as follows:\n" +
                    "\n" +
                    "Tawhid al-Mufaddal: This lengthy hadith reportedly contains the contents of the Imam's (a) teachings delivered in four sessions to al-Mufaddal b. 'Umar on themes such as the creation of the world, the creation of man, wonders of the animal world, wonders of the heavens and earth, the reality of death, and the wisdom behind the creation of man. Since the expression \"Fakkir ya Mufaddal\" (Think, o Mufaddal!) repeats in it, this treatise used to be called Kitab Fakkir.\n" +
                    "\n" +
                    "\n\n\nHadith 'Inwan al-Basri: In this hadith,\n" +
                    "Imam al-Sadiq (a) reportedly gives\n" +
                    "instructions on self-purification,\n" +
                    "patience, and knowledge to a person\n" +
                    "called Inwan al-Basri.[94]\n" +
                    "\n\n\n" +
                    "Maqbula of 'Umar b. Hanzala: This\n" +
                    "hadith discusses the themes of\n" +
                    "judgment and contradiction between\n" +
                    "hadiths.[95] The hadith has been\n" +
                    "adduced as a support for the theory of\n" +
                    "Wilayat al-Faqih.[96]\n");

            str.add("His martyrdom is reported to have been in 148/765 in Medina.\n" +
                    "\n" +
                    "Al-Shaykh al-Saduq clearly states that the Imam (a) was poisoned by al-Mansur al-Dawaniqi and passed away as a result.\n" +
                    "\n" +
                    "He was buried in the al-Baqi' Cemetery beside his father, Imam al-Baqir (a), his grandfather Imam al-Sajjad (a) and his uncle Imam al-Hasan (a)\n");

            edesc.add(str);


        str=new ArrayList<>();
        str.add("امام جعفر بن محمد الصادق (ع) کو امام الصادق (ع) کے نام سے جانا جاتا ہے ، امامیہ کے چھٹے امام اور اسماعیلی کے پانچویں امام ہیں۔ اس کی امامت 34 سال (قمری) سال (114/733 - 148/765) تک رہی اور آخری پانچ اموی خلیفہ (یعنی ہشام بن عبد الملک کے بعد) کے ساتھ ساتھ اور اس کے ساتھ پہلے دو سال عباسی خلفاء ، الصحف اور المنصور الداوانی۔ اپنے وقت میں اموی حکمرانی کی کمزوری کی وجہ سے ، امام الصادق (ع) نسبتا وسیع علمی سرگرمیاں کرنے کے قابل تھے۔ کہا جاتا ہے کہ اس کے ساتھی ، طلبہ اور ان لوگوں نے جن سے احادیث نقل کی گئیں ان کی تعداد چار ہزار تھی۔ اہل بیت (ع) کی بیشتر احادیث جو ٹولور شیعہ حدیث کے جمع میں درج ہیں وہ امام الصادق (ع) کی ہیں۔ اسی وجہ سے امامیہ کو جعفری اسکول کہا جاتا ہے۔ ممتاز سنی علماء کی نظر میں امام الصادق (ع) کو ایک اعلی مقام حاصل ہے۔ ابو حنیفہ اور ملک ابن انس ان لوگوں میں شامل تھے جنھوں نے ان سے احادیث کا حوالہ دیا۔" +
                "\n\n\n\nٹیکنوم: ابو عبد اللہ اور ابو اسحاق\n" +
                "\n" +
                "ولادت: ربیع اول ، 17 ، 83 / اپریل 20 ، 702\n" +
                "\n" +
                "جائے پیدائش: مدینہ\n" +
                "\n" +
                "امامت:\n" +
                "ذی الحجہ 7 ، 114/28 جنوری ، 733 (34 سال کے لئے) سے\n" +
                "\n" +
                "شہادت:\n" +
                "شوال 25 ، 148/14 دسمبر ، 765\n" +
                "مدینہ منورہ میں\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے");
        str.add("بغاوت سے پرہیز کرنا:\n" +
                "\n" +
                "اپنے وقت میں امویوں کی کمزوری کے باوجود ، امام الصادق (ع) بغاوت اور سیاسی تنازعات سے دور رہے۔ الشہراسانی کے مطابق ، ابو مسلم الخراسانی نے حضرت ابراہیم الامام کی رحلت کے بعد امام (ع) کو ایک خط بھیجا ، جس نے اسے خلافت کا سب سے زیادہ مستحق قرار دیتے ہوئے کہا اور خلافت قبول کرنے کی دعوت دی۔ تاہم ، امام (ع) نے اسے لکھا: \"آپ میرے مددگاروں میں سے نہیں ہیں ، اور وقت میرا وقت نہیں ہے۔\" [] 58] ابوسلمہ نے بھی امام (ع) ، اور امام (علیہ السلام) کو اسی طرح کا خط لکھا۔ A) جواب میں اس کا خط جلا دیا۔ [59] امام الصادق (ع) نے اپنے چچا زید بی کے بغاوت میں بھی حصہ نہیں لیا۔ 'علی۔ [60] ایک حدیث کے مطابق ، امام (ع) نے وفادار حامیوں کی کمی کی وجہ کو اس وجہ سے بتایا کہ انہوں نے بغاوت سے انکار کردیا۔ []१]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امام صادق (ع) کے گھر کو جلانا:\n" +
                "\n" +
                "ایک خبر کے مطابق ، جب الحسن ابن زید مکہ اور مدینہ کے گورنر تھے تو انہوں نے امام صادق (ع) کے گھر کو آگ لگا دی۔ آگ میں گھر کا دروازہ اور کوریڈور جل گیا۔ امام\n" +
                "\n" +
                "آگ پار کرتے ہوئے گھر سے باہر نکلا ، \"میں زمین کی جڑیں [یعنی اسماعیل (ا)] کا بیٹا ہوں I میں خدا کا دوست ابراہیم کا بیٹا ہوں۔\" [] 65]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "تقیہ کا استعمال:\n" +
                "\n" +
                "\n" +
                "دوسری صدی کی تیسری دہائی (آٹھویں صدی عیسوی کی پانچویں دہائی) کے علاوہ ، جو اموی خلافت کے زوال کے ساتھ موافق تھے ، اموی اور عباسی دونوں خلیفہ نے امام (ع) کی سرگرمیوں کو نگرانی میں رکھا۔ امام (ع) پر سیاسی دباؤ امام کی زندگی کے خاتمہ کی طرف عروج پر پہنچ گیا۔ [] 66] کچھ اطلاعات کے مطابق ، المنصور کے ایجنٹ ان شیعوں کو ستایا کرتے تھے جو امام (ع) کے ساتھ رابطے میں تھے اور یہاں تک کہ انھیں پھانسی دے دیتے تھے۔ ان ظلم و ستم کی وجہ سے ، امام اور اس کے ساتھیوں کو تقیہ استعمال کرنا پڑا۔ [67]\n" +
                "\n" +
                "ایک خبر کے مطابق ، جب سفیان الثوری نے ان کی عیادت کی ، تو امام الصادق (ع) نے انھیں مشورہ دیا کہ وہ وہاں سے چلے جائیں کیونکہ ان کی نگرانی کی جارہی ہے۔ [] 68] ایک حدیث کے مطابق ، امام (ع) نے ابن ابی طغالب سے کہا کہ لوگوں کے فقہی سوالات کا جواب دیں تاکہ ان پر سنی علماء کی رائے پیش کی جائے تاکہ ان پر ظلم نہ کیا جائے۔ [] 69] نیز امام الصادق (ع) سے متعدد احادیث بھی نقل کی گئی ہیں جو تقیہ کی اہمیت پر تاکید کرتی ہیں ، جن میں سے بعض تقیہ نماز کے برابر ہیں۔ []]]");
        str.add("امام الصادق (ع) کی اخلاقی خصوصیات کے بارے میں بہت ساری اطلاعات ہیں ، جن میں آپ کی سخاوت ، سخاوت ، کثرت سے عبادت ، اور تلاوت قرآن بھی شامل ہے۔ [[१] مالکی مکتب فقہ کے سربراہ ملک ابن انس نے بتایا ہے کہ جس وقت وہ امام الصادق (ع) تشریف فرما ہوتے تھے ، امام (ع) ہمیشہ تینوں حالتوں میں سے ایک میں رہتے تھے: نماز پڑھنا ، روزہ رکھنا یا ذکر کہنا۔ . [72]\n" +
                "\n" +
                "روایت ہے کہ امام (ع) نے ایک بھکاری کو چار سو درہم دیئے ، اور جب انہوں نے امام (ع) کا شکریہ ادا کیا تو آپ (ا) نے اسے اپنی انگوٹھی دی جس کی قیمت دس ہزار درہم ہے۔ [] 73] ایک اور رپورٹ کے مطابق ، امام\n" +
                "\n" +
                "ایک روٹی ، گوشت اور پیسہ ایک تھیلے میں ڈال دیتے اور اسے غریبوں کے گھر لے جاتے اور ان میں بانٹ دیتے ، بغیر بتائے کہ وہ کون ہے۔ [] 74] ابو جعفر الثتامی نے بیان کیا ہے کہ امام الصادق (ع) نے انہیں ایک بیگ کا پیسہ دیا اور کہا کہ بنو ہاشم سے کسی کو یہ بتائے کہ وہ رقم کہاں سے آرہا ہے۔ جب ابو جعفر نے اس شخص کو رقم دی تو اس نے مرسل کے ل دعا کی اور بتایا کہ یہ شخص اسے ہمیشہ پیسہ بھیجتا ہے ، لیکن امام الصادق (ع) دولت مند ہونے کے باوجود اسے کبھی بھی کچھ نہیں بھیجتا! []]]");
        str.add("امام الصادق (ع) کے زمانے میں امویوں کی کمزوری کی وجہ سے ، امام علمی سرگرمیوں کو پڑھانے اور اس میں مشغول ہونے کے لئے نسبتا آزاد تھا۔ [] 37] یہ دینی اور علمی آزادی دوسرے ائمہ کرام کے زمانہ میں شاذ و نادر ہی ہوا ہے ، اور اس طرح ہماری بیشتر احادیث امام الصادق (ع) کی ہیں۔ [] 38] ابن حجر-حثمی کے مطابق ، لوگوں نے ان سے بہت کچھ سیکھا اور منتقل کیا ، اور اس کی شہرت دور دور تک پہنچ گئی۔ [39] الجاہیز نے یہ بھی لکھا ہے کہ \"ان کے علم اور فقہ نے دنیا کو بھر دیا ہے۔\" (A)۔ [41]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "جعفری اسکول:\n" +
                "\n" +
                "شیعہ احادیث میں سے زیادہ تر ، فقہ یا الہیات میں ، امام الصادق (ع) سے ہیں ، []२] اور ان لوگوں سے جو لوگ ان سے احادیث منتقل کرتے تھے ، کسی دوسرے امام سے حدیث منتقل کرنے والوں کی تعداد سے زیادہ ہے۔ [ 43] ابان ابن تغلیب کے مطابق ، شیعہ امام علی کے قول کا حوالہ دیتے جب وہ رسول (ص) کے ایک قول کے بارے میں اختلاف کرتے اور امام الصادق (ع) کے اقوال کا حوالہ دیتے جب وہ امام علی (ع) کے بارے میں اختلاف کرتے تھے ) الفاظ۔ [44]\n" +
                "\n" +
                "اسلامی تعلیمات کی وسعت میں امام الصادق (ع) کے نمایاں کردار کی وجہ سے ، ٹوئیلور شیطان کو اکثر جعفری اسکول [45] کہا جاتا ہے اور امام (ع) اس کے سربراہ کے طور پر جانے جاتے ہیں۔\n" +
                "\n" +
                "1378 / 1958-9 میں ، الازہر کے سربراہ ، شیخ محمود شلوت نے جعفری اسکول آف فقہ کو ایک جائز اسلامی مکتب کے طور پر تسلیم کیا اور اس کی پیروی کرنے کی اجازت دی۔ [] 46]");
        str.add("امام صادق (ع) کی کچھ مشہور احادیث حسب ذیل ہیں۔\n" +
                "\n" +
                "توحید المفدل: اس لمبی حدیث میں مبینہ طور پر امام سی (ع) کی چار نشستوں میں المفدال ابن عمر کو دنیا کی تخلیق ، انسان کی تخلیق ، جانوروں کی دنیا کے عجائبات جیسے موضوعات پر مبنی تعلیمات کا مشمولات موجود ہیں۔ ، آسمان و زمین کے حیرت ، موت کی حقیقت ، اور انسان کی تخلیق کے پیچھے حکمت۔ چونکہ \"فکیر یا مفدال\" (سوچئے ، اے مفدال!) اس میں دہرائے جانے کے بعد سے ، یہ مقالہ کاتب فکیر کہلاتا تھا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "حدیث انوان البصری: اس حدیث میں ،\n" +
                "امام الصادق (ع) مبینہ طور پر دیتے ہیں\n" +
                "تزکیہ نفس سے متعلق ہدایات ،\n" +
                "صبر ، اور ایک شخص کو علم\n" +
                "انوان البصری کہا جاتا ہے۔ [] 94]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "عمر بن حنظلہ کا مقبولہ: یہ\n" +
                "حدیث میں موضوعات پر تبادلہ خیال کیا گیا ہے\n" +
                "فیصلے اور تضاد کے درمیان\n" +
                "احادیث [95] حدیث رہی ہے\n" +
                "کے نظریہ کی حمایت کے طور پر شامل\n" +
                "ولایت الفقیح۔ [] 96]");
        str.add("ان کی شہادت 148/765 میں مدینہ منورہ میں بتائی جاتی ہے۔\n" +
                "\n" +
                "الشیخ السدوق واضح طور پر بیان کرتا ہے کہ امام (ع) کو المنصور الدانیقی نے زہر آلود کیا اور اس کے نتیجے میں اس کا انتقال ہوگیا۔\n" +
                "\n" +
                "انھیں اپنے والد ، امام البقیر (ع) ، ان کے دادا امام السجاد (ع) اور اس کے چچا امام الحسن (ع) کے ساتھ البقیع قبرستان میں سپرد خاک کردیا گیا");

        udesc.add(str);





        etitleH.add("Imam Musa ibne Jafar al-Kazim (A)");
        utitleH.add("امام موسی ابن جعفر الکاظم"
                +" (ع)");


        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Scholarly Activities");
        str.add("Conduct");
        str.add("Prison");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief\n");
        str.add("Life\n");
        str.add("Scholarly Activities\n");
        str.add("Conduct\n");
        str.add("Prison");
        str.add("Martyrdom\n");


        utitle.add(str);

        str=new ArrayList<>();
        str.add("Imam Musa ibne Jafar al-Kazim (A)\n"+
                        " (امام موسی ابن جعفر الکاظم  (ع))  "+
                "\n"+

                " is titled as al-Kāẓim (ﻢﻇﺎﮑﻟا) and Bāb al-Ḥawāʾij (بﺎﺑ ﺞﺋاﻮﺤﻟا) was the seventh Imam of Shi'a, born in Abwa' (a village between Mecca and Medina). After his father Imam Ja'far al-Sadiq (a) was martyred he (a) became the Imam of Shi'a. The thirty five years of his imamate coincided with the caliphate\n" +
                "of al-Mansur, al-Hadi, al-Mahdi, and Harun al-Rashid. He was repeatedly imprisoned by al-Mahdi and Harun, and was finally martyred in 183/799 in al-Sindi b. Shahik's prison. After his martyrdom, he was succeeded by his son, 'Ali b. Musa (a), as the next Imam.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu l-Hasan and Abu Ibrahim\n\n"+
        "Born:\tSafar 7, 128/November 8, 745\n" +
                "\n" +
                "Birthplace:\tAbwa'\n" +
                "\n" +
                "Imamate:\tFrom Shawwal 25, 148/December 14,765(for 35 years)\n" +
                "\n" +
                "Martyrdom:\tRajab 25, 183/September 1, 799 in Baghdad\n" +
                "\n" +
                "Cause of Martyrdom:\t By poisoning\n" +
                "\n" +
                "Burial:\t Kadhimiya\n" +
                "\n" +
                "Successor:\tAli b. Musa (a)\n" +
                "\n" +
                "Father:\t Ja'far b. Muhammad (a)\n" +
                "\n" +
                "Mother:\tHamida al-Barbariyya\n" +
                "\n" +
                "Spouse(s):\tNajma, ...\n" +
                "\n" +
                "Son(s):\t Ali (a), Ahmad, Hamza, Muhammad,Ishaq, Ibrahim, ...\n" +
                "\n" +
                "Daughter(s):\tFatima al-Kubra, ...\n" +
                "\n" +
                "Titles:\t al-'Abd al-Salih (the righteous servant),Bab al-Hawa'ij (gate to the wishes)\n" +
                "\n" +
                "\n\n\n" +
                "Imam al-Kazim's (a) life coincided with the peak of the Abbasid caliphate. He practiced taqiyya (precautionary dissimulation) with regard to the government and recommended the Shi'as to do the same. Thus, there is no report of him taking explicit positions against the Abbasid caliphs or with regard to Alids uprisings, such as the Uprising of Fakhkh. However, in his debates and dialogues with Abbasid caliphs and others, he tried to question the legitimacy of the Abbasid caliphate.\n" +
                "\n" +
                "Some debates and dialogues between Musa b. Ja'far (a) and some Jewish and Christian scholars have been reported in sources of history and hadiths. His dialogues with the scholars of other religions have been collected in Musnad al-Imam al-Kazim, some of which have been transmitted by People of Consensus. He also expanded the Wikala network (network of deputyship), appointing people as his representatives or deputies in different areas. His life also coincided with some divisions within Shiism as well. At the beginning of his imamate, Isma'iliyya, Fatahiyya, and Nawusiyya were formed, and after his martyrdom, the Waqifiyya came to existence.\n" +
                "\n" +
                "Shiite and Sunni sources have praised his practice of worships, patience, and generosity, referring to him as \"al-Kazim\" and \"al-'Abd al-Salih\". Prominent Sunni figures honored the Seventh Shiite Imam as a religious scholar and visited his grave along with the Shi'as. Imam al-Kazim's (a) resting place and the mausoleum of his grandson, Imam al-Jawad (a), are located near Baghdad and is known as the Shrine of Kazimayn. It is visited by Muslims, and in particular, the Shi'as.\n");



        str.add("Birth:\n" +
                "\n" +
                "Imam al-Kazim (a) was born on Sunday, Safar 7, 128/November 8, 745 or Safar 7, 129/October 28, 746[5] in the village of Abwa', between Mecca and Medina, when his parents, Imam al-Sadiq (a) and Hamida al-Barbariyya, were returning from Hajj.[6] Some have mentioned his place of birth in Medina.[7]\n" +
                "\n" +
                "There is a disagreement over the date of Imam al-Kazim's (a) birth. Al-Tabari takes it to be in Dhu l-Hijja,[8] and al-Tabrisi takes it to on Safar 7[9]. According to some sources, Imam al-Sadiq (a) strongly loved him.[10] According to a hadith transmitted by al-Barqi, Imam al-Sadiq (a) gave food to people for three days after the birth of his son.[11]\n" +
                "\n" +
                "Musa b. Ja'far (a) was born in the period of the transfer of the power from the Umayyads to the Abbasids. When he was 4 years old, the first Abbasid caliph took over the power. There is no information in historical sources about Imam al-Kazim's\n" +
                "life before his imamate, except for a few scholarly dialogues during his childhood, such as his dialogue with Abu\n" +
                "Hanifa[12] and scholars of other religions in Medina[13].\n" +
                "\n" +
                "According to a hadith cited in Manaqib, he anonymously entered a village in Syria and had a dialogue with a priest there. The dialogue led to the conversion of the priest and his companions to Islam.[14] There are reports of the Imam's (a) trips to Mecca for hajj or 'Umra pilgrimages.[15] The Imam\n" +
                "was repeatedly summoned by the Abbasid caliphs to Baghdad. Other than these occasions, he spent most of his life in Medina.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives and Children:\n" +
                "\n" +
                "The number of Imam al-Kazim's (a) wives is not clear, but it is reported that most of them were concubines, the first of whom was Najma, mother of Imam al-Rida (a)[16].\n" +
                "\n" +
                "About Imam's (a) children, there are different historical reports. According to al-Shaykh al-Mufid, Imam al-Kazim (a) had thirty seven children (eighteen sons and nineteen daughters).[17] Imam al-Rida (a), Ibrahim, Ahmad, Hamza, Ishaq are among his sons and Fatima and Hakima are among his daughters.\n" +
                "\n" +
                "Descendants of Imam al-Kazim (a) are known as Musawi Sayyids.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Musa b. Ja'far (a), after the martyrdom of his father in 148/765 when he was 20 years old, became the imam of Shi'a.[18] The period of Imam al-Kazim's (a) imamate coincided with the periods of four Abbasid caliphs.[19] About 10 years of his imamate occurred in the period of al-Mansur's caliphate (reign: 136/754-158/775); 11 years of it occurred in the period of the caliphate of al-Mahdi al-'Abbasi (reign: 158/775-169/785); one year of it occurred in the period of the caliphate of al-Hadi al-'Abbasi (reign: 169/785-170/786); and 13 years of it occurred in the period of Harun's caliphate (reign: 170/786-193/809).[20] Musa b. Ja'far's (a) imamate lasted for 35 years, and he was succeeded by his son, Imam al-Rida (a), after his martyrdom in 183/799.[21]\n");



        str.add("Many scholarly activities have been reported for Imam al-Kazim (a). They were\n" +
                "in the forms of hadiths, debates, and dialogues, and are cited in Shiite collections of hadiths.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Debates and Dialogues:\n" +
                "\n" +
                "Some debates and dialogues of Imam al-Kazim (a) with some Abbasid caliphs,[53] Jewish[54] and Christian[55] scholars, Abu\n" +
                "Hanifa[56] and others have been transmitted. Baqir Sharif al-Qarashi has collected eight dialogues of Imam al-Kazim (a) under his debates.[57] Imam al-Kazim (a) had debates with al-Mahdi al-'Abbasi with respect to Fadak and the prohibition of wine in the Qur'an.[58] He also had debates with Harun al-'Abbasi. Since Harun considered himself as a relative of the Prophet (s), Imam al-Kazim made it explicit to Harun that he had the closest relation with the Prophet (s).[59] Musa b. Ja'far's (a) dialogues with scholars of other religions were usually in the form of replies to their questions, which led to their conversion to Islam.");

        str.add("Worshiping manner:\n" +
                "\n" +
                "According to Shiite and Sunni sources, Imam al-Kazim (a) frequently practiced worshiping God. Thus, he came to be known as \"al-'Abd al-Salih\" (the righteous worshiper or servant of God)[61]. According to some reports, Imam al-Kazim (a) worshiped so much that his jailers were impressed.[62] According to al-Shaykh al-Mufid, Musa b. Ja'far (a) was the greatest worshiper of his time and he cried out of the fear of God so much that his beard got wet.\n" +
                "\n" +
                "Even when he was imprisoned at the command of Harun, he thanked God for having an opportunity to worship Him: \"I always asked Thee an opportunity to worship and Thou have provided it for me, so I thank Thee\".[64]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Moral Conduct:\n" +
                "\n" +
                "There are many reports about Imam al-Kazim's (a) patience[65] and generosity in Shiite and Sunni sources[66]. Al-Shaykh al-Mufid believed that the Imam (a) was the most generous man of his time who secretly took provisions and food to the poor in Medina overnight.[67] Ibn 'Inaba said about Musa b. Ja'far's (a) generosity: he left home overnight with bags of dirhams and gave them to every person in need whom he met. His bags of dirhams were well-known among the people at the time.[68] It is also said that Musa b. Ja'far\n" +
                "was also generous to those who bothered him, and whenever he learned that someone was seeking to bother him,he sent gifts to him.[69] Al-Shaykh al-Mufid has also considered Imam al-Kazim (a) as persistent on silat al-rahim (family ties).[70]\n" +
                "\n" +
                "The Imam (a) came to be known as \"al-Kazim\" because he greatly controlled his anger.[71] There are different reports that he controlled his anger against his enemies and people who hurt him.[72] For example, a man from the progeny of 'Umar b. al-Khattab insulted Imam 'Ali (a) in the presence of Imam al-Kazim (a). The Imam's (a) companions wanted to attack him, but the Imam (a) did not allow them to do so. He then went to the man's farm. When the man saw Imam al-Kazim (a), he cried and asked the Imam (a) not to tread on his crops. The Imam (a) approached him and kindly asked: \"how much did you spend on the farm?\". The man replied: \"100 dinars\". Then the Imam (a) asked: \"how much will you benefit from the farm?\" The man said: \"I do not have the knowledge of the hidden\". Imam al-Kazim asked: \"how much do you hope to benefit?\" The man replied: \"200 dinars\". The Imam (a) gave 300 dinars to him and said: \"these 300 dinars are yours and keep your crops\". The Imam (a) went to the mosque then. The man hurried up to the mosque and arrived sooner than the Imam\n" +
                "When he saw the Imam (a), he recited the Quranic verse: \"Allah best knows where He places His message\"(Quran 6:124).[73]\n" +
                "\n" +
                "Al-Bushr al-Hafi was also impressed by the Imam's (a) remarks and moral practice and then repented to God.[74]\n" +
                "\n");


        str.add("During his imamate, Imam al-Kazim (a) was repeatedly summoned and imprisoned by Abbasid caliphs. For the first time, he was taken from Medina to Baghdad at the command of the Abbasid caliph, al-Mahdi al-'Abbasi.[90] Harun also imprisoned the Imam (a) for two times. The time of their first arrest and the first prison are not mentioned in sources, but the second arrest occurred on Shawwal 20, 179/January 6, 796 when he was arrested in Medina[91] and was imprisoned in Basra in the house of 'Isa b. Ja'far on Dhu l-Hijja 7 (March 5)[92]. According to al-Shaykh al-Mufid, Harun wrote a letter to 'Isa b. Ja'far in 180/797-97 and asked him to kill the Imam (a), but he refused to do so.[93] After a while, the Imam (a) was moved to the prison of al-Fadl b. Rabi'. Imam al-Kazim (a) spent the last years of his life in the prisons of al-Fadl b. Yahya and al-Sindi b. Shahik.[94] In Imam al-Kazim's (a) ziyarah text (visitation supplication), he is greeted as \"tortured in the depths of the prisons\"\n" +
                "\n" +
                "There are different accounts of why Imam\n" +
                "al-Kazim (a) was arrested and imprisoned\n" +
                "by the Abbasid caliphs. According to some\n" +
                "accounts, he was arrested by Harun because of Yahya al-Barmaki's jealousy of the Imam (a) and slanders of 'Ali b. Isma'il b. Ja'far.[96] It is said that Harun was suspicious of Imam al-Kazim's (a) relations with the Shi'as and feared that the Shiite belief in his imamate would undermine his government.[97] According to other accounts, the Imam (a) was imprisoned because some Shi'as, such as Hisham b. al-Hakam, did not practice the taqiyya, despite the Imam's (a) commands.[98] Thus, Hisham b. al-Hakam's debates contributed to the Imam's (a) imprisonment.[99]\n");

        str.add("Imam al-Kazim (a) spent the last days of his life in al-Sindi b. Shahik's prison. According to al-Shaykh al-Mufid, al-Sindi poisoned the Imam (a) at the command of Harun al-Rashid, and three days later, the Imam (a) was martyred.[100] His martyrdom occurred on Rajab 25, 183 (September 1, 799).[101] There are other views about the time and the place of Imam al-Kazim's (a) martyrdom as well.[102]\n" +
                "\n" +
                "When Musa b. Ja'far (a) was martyred, his corpse was put on Baghdad's bridge at the order of al-Sindi b. Shahik and it was announced that Musa b. Ja'far died of natural causes.\n" +
                "\n" +
                "After finding of Imam's (a) martyrdom, the Shi'a gathered for a funeral and buried his body in the Quraysh cemetery of Kadhimiya. Imam al-Rida (a) said, \"anyone who visits my father's grave is like the one who visits the graves of the Prophet (s) and Ali b. Abi Talib (a).\" In another narration, he (a) is narrated saying that the reward given for visiting the grave of his father is like the reward given for visiting the grave of Imam al-Husayn (a).[110]\n" +
                "\n" +
                "\n" +
                "\n");

        edesc.add(str);


        str=new ArrayList<>();

        str.add("امام موسی ابن جعفر ال کاظم (ع) کا نام الکاظم تھا اور باب الحویج شیعہ کے ساتویں امام تھے ، جو ابوا میں پیدا ہوئے (مکہ اور مدینہ کے درمیان ایک گاؤں)۔ اپنے والد امام جعفر الصادق (ع) کے شہید ہونے کے بعد وہ (ع) شیعہ کے امام بن گئے۔ آپ کے امامت کے پینتیس سال خلافت المنصور ، الہادی ، المہدی ، اور ہارون الرشید سے وابستہ تھے۔ اسے بار بار المہدی اور ہارون نے قید کیا اور بالآخر 183/799 میں السیندی ابن شاہک کی جیل میں شہید ہوگیا۔ ان کی شہادت کے بعد ، ان کے بعد ان کے بیٹے ، علی ابن موسی (ع) ، اگلے امام کی حیثیت سے کامیاب ہوئے۔" +
                "\n\n\n\nٹیکنوم: ابو الحسن اور ابو ابراہیم\n" +
                "\n" +
                "ولادت: محفوظ 7 ، 128 / نومبر 8 ، 745\n" +
                "\n" +
                "جائے پیدائش: ابوا\n" +
                "\n" +
                "امامت: شوال 25 ، 148 / دسمبر 14،765 (35 سال سے)\n" +
                "\n" +
                "شہادت: رجب 25 ، 183 / یکم ستمبر ، 799 بغداد میں\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے\n" +
                "\n" +
                "تدفین: کاظمین\n" +
                "\n" +
                "جانشین: علی ابن موسی (ع)\n" +
                "\n" +
                "والد: جعفر ابن محمد (ع)\n" +
                "\n" +
                "والدہ: حمیدہ البربیریہ\n" +
                "\n" +
                "شریک حیات: نجمہ ، ...\n" +
                "\n" +
                "بیٹا: علی (ع) ، احمد ، حمزہ ، محمد ، اسحاق ، ابراہیم ، ...\n" +
                "\n" +
                "بیٹی (ے): فاطم al الکبرا ، ...\n" +
                "\n" +
                "عنوانات: الاعبد الصالح (نیک بندہ) ، باب الحوث (خواہشات کا دروازہ)\n" +
                "\n" +
                "\n" +
                "امام ال کاظم کی (ع) زندگی خلافت عباسیوں کے عروج کے ساتھ تھی۔ انہوں نے حکومت کے حوالے سے تقیہ (احتیاطی تزئین کا عمل) کی مشق کی اور شیعوں کو بھی ایسا کرنے کی سفارش کی۔ چنانچہ اس کے عباسی خلفاء کے خلاف واضح عہدے لینے یا الفخس کی بغاوت جیسے الیڈس بغاوت کے حوالے سے کوئی واضح اطلاع نہیں ہے۔ تاہم ، عباسی خلیفہ اور دیگر کے ساتھ اپنی مباحثوں اور مکالموں میں ، انہوں نے عباسی خلافت کے جواز پر سوال اٹھانے کی کوشش کی۔\n" +
                "\n" +
                "موسیٰ ابن جعفر (ع) اور کچھ یہودی اور عیسائی علماء کے مابین کچھ مباحثے اور مکالمے تاریخ کے احادیث اور احادیث میں سامنے آئے ہیں۔ مسند الامام الکاظم میں دوسرے مذاہب کے علمائے کرام کے ساتھ ان کے مکالمے جمع کیے گئے ہیں ، جن میں سے کچھ لوگوں نے اتفاق رائے کے ذریعہ منتقل کیا ہے۔ انہوں نے مختلف علاقوں میں لوگوں کو اپنے نمائندوں یا نائبین کے طور پر مقرر کرتے ہوئے ، وکلا نیٹ ورک (ڈپیوٹشپ کے نیٹ ورک) کو بھی بڑھایا۔ ان کی زندگی بھی شیعوں کے ساتھ ہی کچھ تفرقوں سے ہم آہنگ تھی۔ اس کے امامت کے آغاز میں ، اسماعیلیہ ، فتاحیہ اور نووسیہ تشکیل دیئے گئے ، اور ان کی شہادت کے بعد وقیفیہ وجود میں آیا۔\n" +
                "\n" +
                "شیعہ اور سنی ذرائع نے ان کی عبادتوں ، صبر اور فراخدلی کے طریق کار کو سراہا ہے ، ان کا حوالہ دیتے ہوئے اسے \"ال کاظم\" اور \"العبد الصالح\" کہا ہے۔ ممتاز سنی شخصیات نے ساتویں شیعہ امام کو ایک مذہبی اسکالر کی حیثیت سے اعزاز بخشا اور شیعوں کے ہمراہ ان کی قبر کی زیارت کی۔ امام ال کاظم کی (ا) آرام گاہ اور ان کے پوتے ، امام جواد (ع) کا مقبرہ بغداد کے قریب واقع ہے اور اسے مزار کاظمین کے نام سے جانا جاتا ہے۔ اس کا دورہ مسلمان اور خاص طور پر شیعوں کرتے ہیں۔");
        str.add("پیدائش:\n" +
                "\n" +
                "امام ال کاظم (ع) ، اتوار کے روز ، صفر 7 ، 128/8 نومبر ، 745 یا صفر 7 ، 129/28 اکتوبر ، 746 [5] میں مکہ اور مدینہ کے درمیان ، گاؤں ابوا میں پیدا ہوئے ، جب ان کے والدین ، امام الصادق (ع) اور حمیدہ الباریریہ ، حج سے واپس جارہے تھے۔ [[] بعض نے مدینہ میں اس کی پیدائش کی جگہ کا ذکر کیا ہے۔ [7]\n" +
                "\n" +
                "امام ال کاظم کی ولادت کی تاریخ (ع) پر اختلاف ہے۔ التبریٰ اسے ذی الحجہ میں واقع کرتا ہے ، [8] اور التبریسی نے اسے صفر 7 []] میں لے لیا۔ بعض ذرائع کے مطابق ، امام الصادق (ع) ان سے سخت محبت کرتے تھے۔ [10] البرقی کے ذریعہ منتقل کردہ ایک حدیث کے مطابق ، امام الصادق (ع) نے اپنے بیٹے کی پیدائش کے بعد تین دن لوگوں کو کھانا کھلایا۔ [11]\n" +
                "\n" +
                "موسیٰ ابن جعفر (ع) امویوں سے عباسیوں کے اقتدار کی منتقلی کے دور میں پیدا ہوئے تھے۔ جب وہ 4 سال کا تھا ، پہلے عباسی خلیفہ نے اقتدار سنبھالا۔ امام الکاظم کے بارے میں تاریخی وسائل میں کوئی معلومات نہیں ہے\n" +
                "ان کے امامت سے پہلے کی زندگی ، سوائے اس کے بچپن میں چند علمی مکالموں کے ، جیسے ابو کے ساتھ ان کا مکالمہ\n" +
                "حنیفہ [12] اور مدینہ میں دوسرے مذاہب کے علماء [13]۔\n" +
                "\n" +
                "مناقب میں نقل کی گئی ایک حدیث کے مطابق ، وہ گمنام طور پر شام کے ایک گاؤں میں داخل ہوا اور وہاں کے ایک پجاری سے بات چیت کی۔ اس مکالمے کے نتیجے میں پجاری اور اس کے ساتھیوں کا اسلام قبول ہوا۔ [14] اطلاعات ہیں کہ امام (ع) حج یا عمرہ زیارت کے لئے مکہ معظمہ تشریف لائے ہیں۔ [15] امام\n" +
                "عباسی خلفاء نے بار بار بغداد طلب کیا۔ ان مواقع کے علاوہ ، اس نے اپنی زندگی کا بیشتر حصہ مدینہ منورہ میں گزارا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیویاں اور بچے:\n" +
                "\n" +
                "امام الکاظم کی (ع) ازواج مطہرات کی تعداد واضح نہیں ہے ، لیکن بتایا جاتا ہے کہ ان میں زیادہ تر لونڈیاں تھیں ، جن میں سے سب سے پہلے نجمہ تھیں ، امام الریدہ (ع) کی والدہ [16]۔\n" +
                "\n" +
                "امام (ع) بچوں کے بارے میں ، مختلف تاریخی اطلاعات ہیں۔ الشیخ الموطف کے مطابق ، امام الکاظم (ع) کے سینتیس بچے تھے (اٹھارہ بیٹے اور انیس بیٹیاں)۔ [१]] ان کے بیٹوں میں امام الردہ (ع) ، ابراہیم ، احمد ، حمزہ ، اسحاق اور فاطمہ اور حکیمہ ان کی بیٹیوں میں شامل ہیں۔\n" +
                "\n" +
                "امام الکاظم (ع) کے نزول کو موسوی سید کہا جاتا ہے۔" +
                "\n\n\n\n" +
                "امامت:\n" +
                "\n" +
                "موسیٰ ابن جعفر (ع) ، اپنے والد کی شہادت کے بعد 148/765 میں جب وہ 20 سال کے تھے ، شیعہ کے امام بن گئے۔ [18] امام کاظم علیہ السلام (ع) کے امامت کا زمانہ چار عباسی خلفا کے ادوار کے ساتھ موافق تھا۔ [19] اس کے امامت کے تقریبا 10 10 سال المنصور کی خلافت (عہد: 136 / 754-158 / 775) کے دور میں ہوئے۔ اس کے 11 سال خلافت المہدی ال عباسسی (عہد: 158 / 775-169 / 785) کے دور میں ہوئے؛ اس کا ایک سال خلافت الہادی العبادی (عہد: 169 / 785-170 / 786) کے دور میں ہوا؛ اور اس کے 13 سال ہارون کی خلافت (عہد: 170 / 786-193 / 809) کے دور میں ہوئے۔ [20] موسیٰ ابن جعفر (ع) کا امامت 35 سال تک رہا ، اور 183/799 میں ان کی شہادت کے بعد ان کے بعد ان کے بیٹے ، امام الردہ (ع) نے ان کا عہد کیا۔ [21]");
        str.add("امام الکاظم (ع) کے لئے بہت ساری علمی سرگرمیوں کی اطلاع ملی ہے۔ وہ تھے\n" +
                "احادیث ، مباحث اور مکالموں کی شکل میں ، اور احادیث کے شیعہ ذخیرہ میں حوالہ دیا گیا ہے۔\n" +
                "\n" +
                "\n" +
                "\n\n\n\n" +
                "مباحثے اور مکالمے:\n" +
                "\n" +
                "ابو عباسی خلفا ، [] 53] یہودی [] 54] اور عیسائی [] 55] علماء ، ابو کے ساتھ امام کاظم علیہ السلام کے کچھ مباحثے اور مکالمے۔\n" +
                "حنیفہ [] 56] اور دوسرے کو منتقل کیا گیا ہے۔ باقر شریف القرشی نے اپنی مباحثوں کے تحت امام الکاظم (ع) کے آٹھ مکالمے جمع کیے ہیں۔ [] 57] امام ال کاظم (ع) نے قرآن مجید میں فدک اور شراب کی ممانعت کے سلسلے میں المہدی الابسسی کے ساتھ بحث و مباحثہ کیا۔ [] 58] اس کی ہارون العبسی سے بھی بحثیں تھیں۔ چونکہ ہارون اپنے آپ کو رسول (ص) کا رشتہ دار مانتا تھا ، لہذا امام الکاظم نے ہارون پر یہ واضح کردیا کہ ان کا نبی (ص) کے ساتھ قریب ترین رشتہ ہے۔ [] 59] موسیٰ ابن جعفر (ع) کے دیگر مذاہب کے اسکالرز کے ساتھ مکالمے عام طور پر ان کے سوالات کے جوابات کی شکل میں ہوتے تھے ، جس کی وجہ سے ان کا اسلام قبول کیا گیا۔");
        str.add("عبادت کے انداز:\n" +
                "\n" +
                "شیعہ اور سنی ذرائع کے مطابق ، امام الکاظم (ع) اکثر خدا کی عبادت کا مشق کرتے تھے۔ اس طرح ، وہ \"الاعبد الصالح\" (نیک عبادت گزار یا خدا کا خادم) []१] کے نام سے مشہور ہوا۔ کچھ اطلاعات کے مطابق ، امام الکاظم (ع) نے اتنی عبادت کی کہ ان کے جیلر متاثر ہوئے۔ []२] الشیخ الموفد کے مطابق موسیٰ ابن جعفر (ع) اپنے وقت کے سب سے بڑے عبادت گزار تھے اور وہ خدا کے خوف سے اس قدر چیخ اٹھے کہ اس کی داڑھی بھیگ گئی۔\n" +
                "\n" +
                "یہاں تک کہ جب اسے ہارون کے حکم پر قید کیا گیا تھا ، اس نے خدا کا شکر ادا کیا کہ اس کی عبادت کا موقع ملا: \"میں نے ہمیشہ آپ سے عبادت کا موقع مانگا اور آپ نے اسے میرے لئے مہیا کیا ، لہذا میں تیرا شکر ادا کرتا ہوں۔\" [] 64]\n" +
                "\n\n" +
                "اخلاقی سلوک:\n" +
                "\n" +
                "امام ال کاظم کے (ا) صبر [65] اور شیعہ اور سنی ذرائع میں سخاوت [66] کے بارے میں بہت ساری اطلاعات ہیں۔ الشیخ الموفد کا خیال تھا کہ امام (ع) اپنے وقت کا سب سے سخی آدمی تھا جو راتوں رات مدینہ میں غریبوں کے لئے خفیہ طور پر رزق اور خوراک لیتا تھا۔ [] 67] ابن الاناب Musa نے موسیٰ ابن جعفر (ع) سخاوت کے بارے میں کہا: وہ درہم کی تھیلیوں کے ساتھ راتوں رات گھر سے نکلا اور ضرورتمند ہر شخص کو دیا جس سے وہ ملتا تھا۔ اس وقت درہم کے تھیلے لوگوں میں مشہور تھے۔ [] 68] یہ بھی کہا جاتا ہے کہ موسیٰ بی۔ جعفر\n" +
                "ان لوگوں کے لئے بھی فیاض تھا جنہوں نے اسے پریشان کیا تھا ، اور جب بھی اسے یہ معلوم ہوتا تھا کہ کوئی اسے پریشان کرنے کی کوشش کر رہا ہے تو اس نے اسے تحائف بھیجے۔ الشیخ الموطف نے بھی امام الکاظم (ع) کو صیلا al الرحیم (خاندانی رشتے) پر استقامت سمجھا ہے۔ [] 70]\n" +
                "\n" +
                "امام (ع) \"الکاظم\" کے نام سے مشہور ہوئے کیونکہ انہوں نے اپنے غصے پر بہت زیادہ قابو پالیا۔ [71१] مختلف اطلاعات ہیں کہ اس نے اپنے غصے کو اپنے دشمنوں اور لوگوں کے خلاف قابو کیا جنہوں نے اسے تکلیف دی۔ []२] مثال کے طور پر ، عمر عمر کی نسل سے ایک آدمی۔ الخطاب نے امام الکاظم (ع) کی موجودگی میں امام علی (ع) کی توہین کی۔ امام (ع) کے ساتھیوں نے اس پر حملہ کرنا چاہا ، لیکن امام (ع) نے انہیں ایسا کرنے کی اجازت نہیں دی۔ اس کے بعد وہ اس شخص کے فارم میں گیا۔ جب اس شخص نے امام الکاظم (ع) کو دیکھا تو اس نے چیخ چیخ کر کہا اور امام (ع) کو اپنی فصلوں پر قدم نہ بڑھنے کو کہا۔ امام (ع) نے اس کے پاس پہنچا اور حسن معاشرت سے پوچھا: \"آپ نے کھیت میں کتنا خرچ کیا؟\" اس شخص نے جواب دیا: \"100 دینار\"۔ پھر امام (ع) نے پوچھا: \"کھیت سے آپ کو کتنا فائدہ ہوگا؟\" اس شخص نے کہا: \"مجھے پوشیدہ کا علم نہیں ہے\"۔ امام الکاظم نے پوچھا: \"آپ کو کتنا فائدہ ہونے کی امید ہے؟\" اس شخص نے جواب دیا: \"200 دینار\"۔ امام (ع) نے اسے 300 دینار دیئے اور کہا: \"یہ 300 دینار تمہارے ہیں اور اپنی فصلیں رکھیں\"۔ اس وقت امام (ع) مسجد گئے۔ وہ شخص جلدی سے مسجد کی طرف بڑھا اور امام سے جلدی پہنچ گیا\n" +
                "جب انہوں نے امام (ع) کو دیکھا تو قرآنی آیت کی تلاوت کی: \"اللہ بہتر جانتا ہے کہ وہ اپنا پیغام کہاں رکھتا ہے\" (قرآن:: १२))۔ [] 73]\n" +
                "\n" +
                "البشر حذفی بھی امام (ع) کے تبصرے اور اخلاقی عمل سے بہت متاثر ہوئے اور پھر خدا سے توبہ کی۔ [] 74]");
        str.add("اپنے امامت کے دوران ، امام الکاظم (ع) کو بار بار طلب کیا گیا اور عباسی خلفاء نے انہیں قید کردیا۔ پہلی بار ، اسے عباسی خلیفہ ، المہدی العابسی کے حکم پر مدینہ سے بغداد لے جایا گیا۔ [90] ہارون نے امام (ع) کو دو بار قید بھی کی۔ ذرائع کے مطابق ان کی پہلی گرفتاری اور پہلی جیل کے وقت کا تذکرہ نہیں کیا گیا ہے ، لیکن دوسری گرفتاری شوال 20 ، 179/6 جنوری ، 796 کو اس وقت ہوئی جب وہ مدینہ میں گرفتار ہوئے [91] اور گھر کے اندر بصرہ میں قید تھے۔ عیسی ابن جعفر ذو الحجہ 7 (5 مارچ) [92]۔ الشیخ الموفد کے مطابق ، ہارون نے 180 / 797-97 میں عیسی ابن جعفر کو خط لکھ کر امام (ع) کو قتل کرنے کے لئے کہا ، لیکن اس نے اس سے انکار کردیا۔ []]] تھوڑی دیر کے بعد ، امام (ع) الفضل ابن ربی کی جیل میں منتقل ہوگئے۔ امام ال کاظم (ع) نے اپنی زندگی کے آخری سال الفضل ابن یحیی اور السندھی ابن شاہک کی جیلوں میں گذارے۔ []]] امام ال کاظم کے (ع) زیراarah متن (ملاحظہ کی دعا) میں ، ان کا استقبال \"جیلوں کی گہرائیوں میں اذیت آمیز\" ہے\n" +
                "\n" +
                "امام کے کیوں مختلف ہیں\n" +
                "الکاظم (ع) کو گرفتار کرکے قید کردیا گیا\n" +
                "عباسی خلفاء کے ذریعہ کچھ کے مطابق\n" +
                "یحیی البرمکی کے امام (ع) سے حسد اور علی ابن اسماعیل ابن جعفر کی بہتان کی وجہ سے اسے ہارون نے گرفتار کیا تھا۔ [] 96] کہا جاتا ہے کہ ہارون کو شیعوں کے ساتھ امام ال کاظم (ع) کے تعلقات پر شبہ تھا اور اس کا اندیشہ تھا کہ ان کے امامت پر شیعہ عقیدہ اس کی حکومت کو نقصان پہنچائے گا۔ [] 97] دوسرے بیانات کے مطابق ، امام (ع) کو اس لئے قید کیا گیا تھا کہ بعض شیعوں ، جیسے ہشام ابن الحکم ، امام (ع) کے احکامات کے باوجود تقیہ پر عمل نہیں کرتے تھے۔ [] 98] چنانچہ ہشام ابن الحکم کے مباحث نے امام (ع) کی قید میں مدد کی۔ [] 99]");
        str.add("امام الکاظم (ع) نے اپنی زندگی کے آخری ایام السنڈی ابن شاہک کی جیل میں گزارے۔ الشیخ الموطف کے مطابق ، سندھی نے ہارون الرشید کے حکم پر امام (ع) کو زہر دیا اور تین دن بعد ، امام (ع) شہید ہوگئے۔ [100] اس کی شہادت رجب 25 ، 183 (1 ستمبر ، 799) کو واقع ہوئی۔ [101] امام ال کاظم کے (ا) شہادت کے وقت اور مقام کے بارے میں بھی دوسرے نظریات ہیں۔ [102]\n" +
                "\n" +
                "جب موسیٰ ابن جعفر (ع) کو شہید کیا گیا ، اس کی لاش بغداد کے پل پر السیندی ابن شاہک کے حکم پر رکھی گئی تھی اور اعلان کیا گیا تھا کہ موسیٰ ابن جعفر فطری وجوہات کی بناء پر فوت ہوئے تھے۔\n" +
                "\n" +
                "امام (ع) کی شہادت کا پتہ لگانے کے بعد ، شیعہ جنازے کے لئے جمع ہوئے اور اس کی میت کو کاظمین کے قریش قبرستان میں دفن کردیا۔ امام الردہ (ع) نے فرمایا ، \"جو بھی میرے والد کی قبر پر جاتا ہے وہ اس شخص کی طرح ہوتا ہے جو رسول اللہ (ص) اور علی ابن ابی طالب (ع) کی قبروں کی زیارت کرتا ہے۔\" ایک اور روایت میں ، انہوں نے (ع) یہ کہتے ہوئے روایت کیا ہے کہ اس کے والد کی قبر کی زیارت کے لئے جو صلہ دیا گیا ہے وہ امام الحسین (ع) کی قبر کی زیارت کے لئے دیئے گئے اجر کی مانند ہے۔ [११]]");

        udesc.add(str);






        etitleH.add("Imam Ali ibne Musa al-Rida (A)");
        utitleH.add("امام علی ابن موسی ال-ردا"
                +" (ع)");


        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Debates");
        str.add("Conduct");
        str.add("Attributed Works");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life\n");
        str.add("Debates\n");
        str.add("Conduct\n");
        str.add("Attributed Works\n");
        str.add("Martyrdom\n");


        utitle.add(str);


        str=new ArrayList<>();

        str.add("Imam Ali ibne Musa al-Rida (A)\n "
                +"(امام علی ابن موسی ال-ردا  (ع))"+
                "\n"+

                " is the eighth Imam\n" +
                "\n" +
                "of Twelver Shia. His Kunya was Abū l-Ḥasan (Arabic: ﻦﺴﺤﻟا ﻮﺑأ) and his most famous title was al-Riḍā (Arabic: ﺎﺿﺮﻟا). He (a) was Imam for 20 years. Imam al-Rida (a) was born in Medina and was martyred in Tus.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu l-Hasan\n\n" +
                "Born:\tDhu l-Qa'da 11, 148/December 29,765\n" +
                "\n" +
                "Birthplace:\tMedina\n" +
                "\n" +
                "Imamate:\tFrom Rajab 25, 183/September 1,799(for 20 years)\n" +
                "\n" +
                "Martyrdom:\tSafar 29 or Safar 30,203/September 5 or September 6,818 in Tus, Iran\n" +
                "\n" +
                "Cause of Martyrdom:\tBy poisoning\n" +
                "\n" +
                "Successor:\t Muhammad b. 'Ali\n" +
                "\n" +
                "Father:\tMusa b. Ja'far\n" +
                "\n" +
                "Mother:\t Najma Khatun\n" +
                "\n" +
                "Brother(s):\t Ahmad, Hamza, Muhammad, ...\n" +
                "\n" +
                "Sister(s):\t  Fatima, ...\n" +
                "\n" +
                "Spouse(s):\t Sabika, Umm Habib\n" +
                "\n" +
                "Son(s):\t Muhammad\n" +
                "\n" +
                "\n" +
                "\n" +
                "Al-Ma'mun al-'Abbasi brought Imam al-Rida (a) to Khorasan by force and despite Imam's will made him crown prince. The debate sessions al-Ma'mun al-Abbasi held between Imam al-Rida (a) and personalities of other religions and schools of thought are famous.\n" +
                "\n" +
                "He was martyred by al-Ma'mun in Tus. The holy shrine of Imam al-Rida (a) is located in Mashhad and every year millions of Muslims from different countries visit it.\n" +
                "\n");

                str.add(  "Birth:\n\n" +
                "Imam al-Rida's (a) birthday has been reported to be on Thursday or Friday, Dhu l-Qa'da 11, Dhu l-Hijja, or Rabi' I of 148/765-66 or 153/770.[4] Al-Kulayni reported Imam's (a) birthday in 148/765[5], which is agreed by most historians[6].\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives:\n" +
                "\n" +
                "Imam al-Rida (a) had a wife named Sabika[11] who is reported to be from the family of Maria, wife of the Prophet (s)[12].\n" +
                "\n" +
                "In some historical sources, it is reported that Imam al-Rida (a) had another wife beside Sabika; that al-Ma'mun suggested to Imam al-Rida (a) to marry Umm Habib, al-Ma'mun's daughter, and Imam (a) accepted.[13] Al-Tabari mentioned this marriage in the events of 202/817-818.[14] They say that al-Ma'mun's goal from this action was further closeness to Imam al-'A'isha.[17]\n" +
                "Rida (a) and having reports about his plans from inside his house.[15] Al-Suyuti has also mentioned the marriage of al-Ma'mun's daughter with Imam al-Rida (a), but he did not mention the name of al-Ma'mun's daughter.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Children:\n" +
                "\n" +
                "There is a disagreement about the numbers and names of the children of Imam al-Rida (a). Some have reported them as five sons and one daughter with the names of Muhammad al-Qani', al-Hasan, Ja'far, Ibrahim, al-Husayn, and Sibt b. al-Jawzi said that Imam had four sons with the names of Muhammad (Abu Ja'far al-Thani), Ja'far, Abu Muhammad al-Hasan, Ibrahim, and one daughter he did not mention her name.[18] It has been said that one of the children of Imam al-Rida (a) who was 2 years old or less is now buried in Qazvin known as Imamzada Husayn (a) and Imam al-Rida (a) had been to that city in 193/808-809.[19] Al-Shaykh al-Mufid did not mention any children for Imam al-Rida other than Muhammad (a).[20] Also, Ibn Shahrashub and al-Tabrisi have the same idea.[21] Some have mentioned a daughter for Imam (a) called Fatima.[22]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "The period of imamate of Imam al-Rida (a) after his father was 20 years (183/799 - 203/818) which was contemporary with the caliphate of Harun al-Rashid, Muhammad al-Amin (approx. 5 years) and al-Ma'mun [20 years; of which, the first 5 years was contemporary with Imam al-Rida (a)].[23]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Tendencies of Shia:\n" +
                "\n" +
                "After the martyrdom of Imam al-Kazim (a), most Shia accepted the Imamate of Imam al-Rida (a), son of Imam al-Kazim (a) because of his will and other reasons and evidences. These people including the\n" +
                "great companions of Imam al-Kazim (a) are called Qat'iyya (ﺔﯿﻌﻄﻗ).[26] But, another group of the companions of Imam al-Kazim (a) did not accept the Imamate of Imam al-Rida (a) for some reasons. They said that, \"Imam al-Kazim (a) was the last Imam and did not mention anyone as Imam or at least we are not aware of it.\" They were called Waqifids.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Position of Imam (a) in Medina:\n" +
                "\n" +
                "Imam al-Rida (a) lived 17 years of his Imamate in Medina (183 – 200/815-816 or 201/816-817) and had a great position among people. In a conversation with Ma'mun about the position of the crown prince, Imam (a) described his life in Medina as follows, \"Surly, being the crown prince did not add any value to me. When I was in Medina, my order was obeyed in the east and the west and when I passed the alleys of Medina riding on my horse,no one was ever more honorable than me.\"[27]\n" +
                "\n" +
                "About Imam's (a) scholarly position in Medina, he (a) said,\"I would sit in the mosque of the Prophet and the scholars of Medina referred to me for their problems when they could not solve a problem and I answered them.\"[28]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Journey to Khorasan:\n" +
                "\n" +
                "It is said that the immigration of Imam al-Rida (a) from Medina to Merv occurred in 200/815-816 or 201/816-817[29]. The book Hayat-i fikri wa siyasi-i Imaman-i Shi'a (a) says that \"Imam al-Rida (a) was in Medina until 201/816-817 and entered Merv in Ramadan of the same year.\"\n" +
                "\n" +
                "It is mentioned in the Tarikh al-Ya'qubi that al-Ma'mun brought Imam al-Rida (a) from Medina to Khorasan and al-Ma'mun's representative to take Imam to Khorasan was Raja' b. Abi Dahhak, a relative of al-Fadl b. Sahl. Imam (a) was brought to Merv from the the way of Basra.[30] The route, al-Ma'mun chose for bringing Imam al-Rida (a) to Merv was specifically planned so that Imam (a) does not pass from Shi'a cities because al-Ma'mun was afraid of Shi'a gathering around Imam al-Rida (a). He ordered not to pass Imam (a) from Kufa, instead they brought Imam (a) from Basra to Khuzestan and Fars to Neyshabur.[31] The path as reported by Atlas of Shi'a is: Medina, Naqara, Nabaj, Hafr Abu Musa, Basra, Ahvaz, Behbahan, Estakhr, Abarquh, Dah shir (Farashah), Yazd, Kharaneq, Robat Posht Badam, Neyshabur, Qadamgah, Deh Sorkh, Tus, Sarakhs, Merv.[32]\n" +
                "\n" +
                "The most important and most documented event of this path happened in Neyshabur where Imam al-Rida (a) made a speech and said the famous hadith of Silsilat al-Dhahab.\n" +
                "\n" +
                "Al-Shaykh al-Mufid said, \"al-Ma'mun summoned a group of people from the family of Abu Talib from Medina including Imam al-Rida (a).\" Contrary to al-Ya'qubi, he introduced Juludi as al-Ma'mun's representative and said that they were brought to al-Ma'mun from Basra. He accommodated them in a house and Imam al-Rida (a) separately and paid him great respect.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");




        str.add("After al-Ma'mun brought Imam al-Rida (a) to Merv, held many scientific meetings with the presence of different scholars. In these sessions, many discussions were made between Imam (a) and others which were mostly about ideological and jurisprudential issues. Al-Tabrisi has brought a part of these discussions in his al-Ihtijaj.\n" +
                "\n");

        str.add("Worshiping manner:\n" +
                "\n" +
                "It is mentioned that in the middle of scientific debates in which great personalities of different religions and denominations participated, Imam al-Rida (a) left the sessions as soon as he (a) heard the call of Adhan and answered to\n" +
                "the request of the people for continuing the debates, saying that, \"I will pray and come back.\"[58] There are numerous reports about his worships at night and vigils.[59] When Imam al-Rida (a) gifted his shirt to Di'bil b. 'Ali al-Khuza'i, told him, \"take care of this shirt with which I have prayed a thousand rak'as every night for a thousand nights and wearing which, I have finished recitation of the Qur'an for a thousand times.\"[60] Long prostrations of Imam (a) have also been reported.[61]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Moral Conduct:\n" +
                "\n" +
                "There are many reports about the good manner of Imam (a) when associating with people. His kind manner and eating with servants even after being the crown prince are among these reports.[62] Ibn Shahr Ashub narrated that one day Imam (a) went to a public bath. A person who did not know Imam (a), asked him to massage and wash his body and Imam (a) accepted and began to do what he asked. Others who saw this, introduced Imam (a) to that man and the man was very embarrassed and ashamed and apologized. Imam (a) calmed him down and continued massaging and washing him.[63]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Upbringing conduct:\n" +
                "\n" +
                "In the conduct of Imam al-Rida (a), the role of children in the pregnancy,[65] family was emphasized and cases such as the necessity of marriage with righteous spouse[64], good caring during naming children with good names[66] and respecting them[67]. Regarding Imam al-Rida's (a) care about associating with relatives, it is mentioned that whenever Imam (a) had a free time, gathered his relatives and spoke to them.[68]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Scientific conduct:\n" +
                "\n" +
                "When Imam al-Rida (a) was in Medina, he (a) used to sit in the mosque of the Prophet (s) and those scholars who had scientific problems asked their questions from Imam (a).[69]\n" +
                "\n" +
                "After Imam (a) went to Merv, he (a) answered many questions in debates. Moreover, Imam (a) held scientific gatherings in his house and in the mosque of Merv; but when his gatherings became crowded, Ma'mun ordered to shut them down and Imam (a) cursed him.[70]\n" +
                "\n" +
                "Imam (a) advised about health and medicine in his narrations. In these narrations, he (a) explained several concepts related to health and medicine and also discussed about preventing disease, proper eating habits, individual hygiene and treatments. Tibb al-Rida (a),also known as Risala al-Dhahabiyya contains pieces of advice in this regard.\n" +
                "\n" +
                "\n" +
                "\n");

        str.add("In addition to Hadiths and reports narrated from Imam al-Rida (a) and his answers to people who referred to him for understanding scientific issues (as mentioned in books such as 'Uyun akhbar al-Rida (a) which has mentioned many of such issues), some authors have mentioned and attributed some works to Imam al-Rida (a), attribution of which require suﬃcient proofs and authenticity of some of which is not verifiable.\n" +
                "\n" +
                "Al-Fiqh al-Radawi is among such works which researchers and scholars have not\n" +
                "accepted that this book may be written by Imam al-Rida (a).[74]\n" +
                "\n" +
                "Another work which has been attributed to Imam al-Rida (a) is Risalat al-Dhahabiyya in Medicine. It is said that Imam (a) sent this treatise to al-Ma'mun in 201/817, and to show its importance, al-Ma'mun ordered to write it by gold and keep it in the treasure house of Dar al-Hikma. This is why they call it Risalat al-Dhahabiyya (the golden treatise). Many scholars have written commentaries on this treatise.[75]\n" +
                "\n" +
                "Another work that is attributed to Imam al-Rida (a) is Sahifat al-Rida (a) in Fiqh,\n" +
                "attribution of which to Imam (a) is not proved.[76]\n" +
                "\n" +
                "Another book which has been attributed to Imam al-Rida (a) is Mahd al-Islam wa shara'i' al-din and apparently there is no certainty that Imam (a) has written it.[77]\n");



        str.add("There is a disagreement over the date of Imam al-Rida's (a) martyrdom and it is said to be on Friday or Monday of the last day of Safar, or on Safar 17, or on Ramadan 21, or on Jumada I 18, or on Dhu l-Qa'da\n" +
                "23, or on the last day of Dhu l-Qa'da in 202 or 203 or 206.[42] But according to the majority of scholars and historians, the martyrdom occurred in 203/818.\n" +
                "\n" +
                "Al-Shaykh al-Saduq narrated some hadiths with similar meanings in some of which the poison in grapes is mentioned and in some, the poison is mentioned both in grapes and pomegranate.\n" +
                "\n" +
                "After Imam's (a) martyrdom, al-Ma'mun buried the body in the house of Humayd b. Qahtaba al-Ta'i (Buq'at al-Haruniyya) in the\n" +
                "village of Sanabad. Today, the holy shrine of Imam al-Rida (a) is located in Mashhad, Iran.\n");

        edesc.add(str);


        str=new ArrayList<>();


        str.add("امام علی ابن موسی الردہ (ع) شیعوں کے آٹھویں امام ہیں۔ ان کا کنیا ابوالحسان تھا اور ان کا سب سے مشہور لقب الریاض تھا۔ وہ (ع) 20 سال امام تھے۔ امام الردہ (ع) مدینہ منورہ میں پیدا ہوئے اور تس میں شہید ہوئے۔" +
                "\n\n\n\nٹیکنوم: ابو الحسن\n" +
                "پیدائش: ذو القضا 11 ، 148 / دسمبر 29،765\n" +
                "\n" +
                "جائے پیدائش: مدینہ\n" +
                "\n" +
                "امامت: رجب 25 ، 183 / ستمبر 1،799 (20 سال تک) سے\n" +
                "\n" +
                "\n" +
                "شہادت: صفر 29 یا صفر 30،203 / 5 ستمبر یا ستمبر 6،818 ایران کے شہر توس میں\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے\n" +
                "\n" +
                "جانشین: محمد ابن علی\n" +
                "\n" +
                "باپ: موسیٰ بی۔ جعفر\n" +
                "\n" +
                "ماں: نجمہ خاتون\n" +
                "\n" +
                "بھائی (بھائی): احمد ، حمزہ ، محمد ، ...\n" +
                "\n" +
                "بہنیں: فاطمہ ، ...\n" +
                "\n" +
                "شریک حیات (ز): سبیکا ، ام حبیب\n" +
                "\n" +
                "بیٹا (ز): محمد\n" +
                "\n" +
                "\n" +
                "\n" +
                "الممنون العبسی زبردستی کے ذریعہ امام الرضا (ع) کو خراسان لائے اور امام کی مرضی کے باوجود انہیں ولی عہد شہزادہ بنا دیا۔ امام الردہ (ع) اور دوسرے مذاہب کی شخصیات اور مکاتب فکر کے مابین مباحثے کے اجلاس المومن العبسی مشہور ہیں۔\n" +
                "\n" +
                "وہ توس میں الممن کے ذریعہ شہید ہوا تھا۔ امام الردہ (ع) کا مقبرہ مشہد میں واقع ہے اور ہر سال مختلف ممالک کے لاکھوں مسلمان اس کی زیارت کرتے ہیں۔" );



        str.add("پیدائش:\n" +
                "\n" +
                "امام الردہ (ع) کی سالگرہ جمعرات یا جمعہ ، ذوقاعدہ 11 ، ذی الحجہ ، یا ربیع اول 148 / 765-66 یا 153/770 بتائی گئی ہے۔ [4] الکیلانی نے 148/765 [5] میں امام (ع) کی سالگرہ کی اطلاع دی ، جس پر بیشتر مورخین نے [[] اتفاق کیا ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیویاں:\n" +
                "\n" +
                "امام الردہ (ع) کی ایک بیوی تھی جس کا نام سبیکا تھا [11] جن کا تعلق ماریہ کے خاندان سے ہے ، جو رسول اللہ (ص) کی اہلیہ [12] ہیں۔\n" +
                "\n" +
                "کچھ تاریخی وسائل میں ، یہ اطلاع ملتی ہے کہ امام الردہ (ع) کی سبیکا کے سوا ایک اور بیوی تھی۔ المومن نے امام الردہ (ع) کو المون کی بیٹی ام حبیب سے شادی کی تجویز پیش کی ، اور امام (ع) نے قبول کرلیا۔ [13] التبری نے اس شادی کا ذکر 202 / 817-818 کے واقعات میں کیا ہے۔ [14] ان کا کہنا ہے کہ اس فعل سے المومن کا ہدف امام عائشہ رضی اللہ عنہما سے مزید قربت تھی۔ [17]\n" +
                "رڈا (ا) اور اپنے گھر کے اندر سے اپنے منصوبوں کے بارے میں اطلاعات رکھتی ہیں۔ [15] السویتی نے المونون کی بیٹی کی شادی امام الردہ (ع) کے ساتھ بھی کی ہے ، لیکن انہوں نے المونون کی بیٹی کا نام نہیں لیا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچے:\n" +
                "\n" +
                "امام الردہ (ع) کے بچوں کی تعداد اور ان کے بارے میں اختلاف رائے پایا جاتا ہے۔ بعض نے ان کے پانچ بیٹے اور ایک بیٹی کی حیثیت سے محمد الکانی ، الحسن ، جعفر ، ابراہیم ، الحسین ، اور سبت ابن الجوزی کے نام سے بتایا ہے کہ امام کے چار بیٹے تھے جن کے نام تھے محمد (ابو جعفر الثانی) ، جعفر ، ابو محمد الحسن ، ابراہیم ، اور ایک بیٹی جو اس نے اپنے نام کا ذکر نہیں کیا۔ [18] کہا جاتا ہے کہ امام الردہ (ع) کے بچوں میں سے ایک جو 2 سال یا اس سے کم عمر کا تھا ، اب قزوین میں دفن ہے جو امامزادہ حسین (ع) کے نام سے جانا جاتا ہے اور امام الردہ (ع) اسی شہر میں مقیم تھے 193 / 808-809۔ [19] الشیخ الموطف نے امام الردہ کے لئے محمد (ع) کے علاوہ کسی بھی بچے کا ذکر نہیں کیا۔ [20] نیز ابن شہرشوب اور التبرسی بھی ایک ہی خیال رکھتے ہیں۔ [21] بعض نے امام (ع) کے لئے فاطمہ کہلانے والی ایک بیٹی کا ذکر کیا ہے۔ [22]\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "اپنے والد کے بعد امام الریدہ (ع) کی امامت کا دورانیہ 20 سال (183/799 - 203/818) تھا جو خلافت ہارون الرشید ، محمد الامین (تقریبا  5 سال) کے ساتھ ہم عصر تھا۔ المومن [20 سال؛ جس میں سے ، پہلے 5 سال امام الردہ (ا) کے ساتھ ہم عصر تھے۔ [23]" +
                "\n\n\n\n" +
                "" +
                "شیعہ کے رجحانات:\n" +
                "\n" +
                "امام ال کاظم (ع) کی شہادت کے بعد ، بیشتر شیعوں نے اپنی خواہش اور دیگر وجوہات اور شواہد کی وجہ سے امام الکاظم (ع) کے بیٹے ، امام الریدہ (ع) کی امامت کو قبول کیا۔ یہ لوگ بھی شامل ہیں\n" +
                "امام الکاظم (ع) کے عظیم صحابہ کو قطیہ کہتے ہیں۔ [26] لیکن ، امام الکاظم (ع) کے اصحاب کے ایک اور گروہ نے کچھ وجوہات کی بنا پر امام الریدہ (ع) کی امامت کو قبول نہیں کیا۔ . ان کا کہنا تھا کہ ، \"امام الکاظم (ع) آخری امام تھے اور انہوں نے کسی کو بطور امام ذکر نہیں کیا یا کم از کم ہم اس سے واقف نہیں ہیں۔\" انھیں واقفیت کہا جاتا تھا۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "مدینہ میں امام (ع) کا مقام:\n" +
                "\n" +
                "امام الردہ (ع) نے اپنے امامت کے 17 سال مدینہ منورہ میں بسر کیے (183 - 200 / 815-816 یا 201 / 816-817) اور لوگوں میں ایک عمدہ مقام حاصل کیا۔ تاج شہزادہ کے مقام کے بارے میں مامون سے گفتگو میں ، امام (ع) نے مدینہ میں اپنی زندگی کو اس طرح بیان کیا ، \"خوشی سے ، ولی عہد شہزادہ ہونے کی وجہ سے مجھے کوئی اہمیت نہیں ملی۔ جب میں مدینہ میں تھا تو ، میرا حکم مشرق اور مغرب میں میری اطاعت کی گئی تھی اور جب میں نے اپنے گھوڑے پر سوار مدینہ کی گلیوں سے گزرے تو مجھ سے بڑھ کر اور کوئی معزز نہیں تھا۔ \"[27]\n" +
                "\n" +
                "مدینہ میں امام (ع) کے علمی مقام کے بارے میں ، آپ (ع) نے کہا ، \"میں مسجد نبوی میں بیٹھ جاؤں گا اور مدینہ کے علماء نے مجھے ان کے مسائل کا حوالہ دیا جب وہ کوئی مسئلہ حل نہیں کرسکتے تھے اور میں نے ان کا جواب دیا۔\" [28]" +
                "\n\n\n\n\n" +
                "خراسان کا سفر:\n" +
                "\n" +
                "کہا جاتا ہے کہ امام الردہ (ع) کی مدینہ سے میروت کی ہجرت 200 / 815-816 یا 201 / 816-817 [29] میں ہوئی۔ کتاب حیات-فیکری و سیاسی امامman شیعہ (ع) کا کہنا ہے کہ \"امام الردہ (ع) 201 / 816-817 تک مدینہ منورہ میں تھے اور اسی سال رمضان المبارک میں مروے میں داخل ہوئے۔\"\n" +
                "\n" +
                "تاریخ ال یعقوبی میں مذکور ہے کہ المومنین امام الردہ (ع) کو مدینہ سے خراسان لائے اور المومن کا نمائندہ امام کو خراسان لے جانے کے لئے راجہ ابن ابی دہاہک تھا ، ایک رشتہ دار الفضل ابن سہل کی امام (ع) کو بصرہ کے راستے سے مروے لایا گیا تھا۔ [30] امام الریدہ (ع) کو مروے لانے کے لئے المومن کا راستہ خاص طور پر تیار کیا گیا تھا تاکہ امام (ع) شیعوں کے شہروں سے نہ جائیں کیونکہ المومن شیعوں کے اجتماع سے خوفزدہ تھا امام الردہ (ع) کے آس پاس۔ اس نے امام (ع) کو کوفہ سے گزرنے کا حکم نہیں دیا ، بجائے اس کے کہ وہ امام (ع) کو بصرہ سے خیزستان اور فارس کو نیشابور لے آئے۔ []१] وہ راستہ جیسا کہ اٹلس شیعہ نے اطلاع دیا ہے: مدینہ ، نقرہ ، نباج ، حفر ابو موسی ، بصرہ ، احواز ، بہبہہان ، استخر ، ابرق ، داح شیر (فراشاہ) ، یزد ، خارانق ، روبط پوش بادام ، نیشا پور ، قدامگاہ ، دیہ سورکھ ، طوس ، سارخس ، مروے۔ [32]\n" +
                "\n" +
                "اس راستے کا سب سے اہم اور دستاویزی واقعہ نیشابور میں ہوا جہاں امام الردہ (ع) نے ایک تقریر کی اور کہا کہ سلیس التہاب کی مشہور حدیث۔\n" +
                "\n" +
                "الشیخ المفید نے کہا ، \"المون نے ابو طالب کے اہل خانہ کے ایک گروہ کو مدینہ منورہ سے طلب کیا جن میں امام الردہ (ع) بھی شامل تھے۔\" ال یعقوبی کے برخلاف ، اس نے جولدی کو المونون کا نمائندہ متعارف کرایا اور کہا کہ انہیں بصرہ سے المون میں لایا گیا ہے۔ انہوں نے انہیں ایک مکان اور امام الردہ (ع) میں الگ الگ جگہ دی اور انہیں بہت عزت دی۔");
        str.add("المون نے امام الردہ (ع) کو مروے پر لانے کے بعد ، مختلف علماء کی موجودگی سے بہت سی سائنسی ملاقاتیں کیں۔ ان سیشنوں میں ، امام (ع) اور دیگر کے مابین بہت سارے تبادلہ خیال ہوئے جو زیادہ تر نظریاتی اور فقہی امور کے بارے میں تھے۔ التبریسی نے اپنے الاحتجاج میں ان مباحث کا ایک حصہ لایا ہے۔");
        str.add("عبادت کے انداز:\n" +
                "\n" +
                "یہ ذکر ہے کہ سائنسی مباحثوں کے بیچ میں جس میں مختلف مذاہب اور فرقوں کی عظیم شخصیات نے شرکت کی ، امام الردہ (ع) نے اذان کی آواز سنتے ہی سیشن چھوڑ دیے اور جواب دیا\n" +
                "لوگوں سے بحث جاری رکھنے کی درخواست ، یہ کہتے ہوئے کہ \"میں دعا کروں گا اور واپس آؤں گا۔\" [] 58] رات میں اس کی عبادتوں اور نگرانوں کے بارے میں متعدد اطلاعات ہیں۔ [] 59] جب امام الریدہ (ع) نے اپنی قمیض دیبل ابن علی الخزوئی کو تحفے میں دی تو آپ نے ان سے کہا ، \"اس قمیص کا خیال رکھنا جس کے ساتھ میں نے ایک رات میں ایک ہزار رکعت ہر رات نماز پڑھی ہے اور جس کے پہننے کے بعد ، میں نے ہزار مرتبہ قرآن مجید کی تلاوت ختم کی ہے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "اخلاقی سلوک:\n" +
                "\n" +
                "لوگوں سے صحبت کرتے وقت امام (ع) کے اچھے انداز کے بارے میں بہت ساری اطلاعات ہیں۔ ان کا حسن سلوک اور ولی عہد شہزادہ ہونے کے بعد بھی نوکروں کے ساتھ کھانا ان اطلاعات میں شامل ہے۔ []२] ابن شہری اشوب نے بیان کیا کہ ایک دن امام (ع) عوامی غسل کرنے گئے۔ ایک شخص جو امام (ع) کو نہیں جانتا تھا ، اس نے اس سے مساج کرنے اور اپنے جسم کو دھونے کے لئے کہا اور امام (ع) نے قبول کیا اور اس کے کہنے پر عمل کرنے لگے۔ دوسرے لوگوں نے ، جنھوں نے یہ دیکھا ، امام (ع) کو اس شخص سے ملوایا اور وہ شخص بہت شرمندہ اور شرمندہ ہوا اور معافی مانگ لی۔ امام (ع) نے اسے پرسکون کیا اور مساج اور دھونے کا سلسلہ جاری رکھا۔ [] 63]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "پرورش کا طرز عمل:\n" +
                "\n" +
                "امام الردہ (ع) کے طرز عمل میں ، حمل ، [] 65] کنبہ میں بچوں کے کردار پر زور دیا گیا تھا اور ایسے معاملات جیسے نیک زوج کے ساتھ شادی کی ضرورت [] 64] ، اچھے نام رکھنے والے بچوں کے نام رکھنے کے دوران اچھی دیکھ بھال [ 66] اور ان کا احترام [67]۔ امام الردہ (ع) کے لواحقین سے رفاقت کے بارے میں خیالات کے بارے میں ، یہ ذکر ہے کہ جب بھی امام (ع) فارغ وقت دیتے ، اپنے لواحقین کو جمع کرتے اور ان سے بات کرتے۔ [] 68]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "سائنسی طرز عمل:\n" +
                "\n" +
                "جب امام الردہ (ع) مدینہ میں تھے تو آپ (ع) مسجد نبوی میں بیٹھتے تھے اور جن علماء کو سائنسی پریشانی تھی وہ امام (ع) سے اپنے سوالات پوچھتے تھے۔ [] 69]\n" +
                "\n" +
                "امام (ع) مروی پر جانے کے بعد ، آپ (ع) نے مباحثوں میں بہت سارے سوالات کے جوابات دیئے۔ مزید یہ کہ ، امام (ع) نے اپنے گھر اور مسجد مرو میں سائنسی اجتماعات کیے۔ لیکن جب اس کی مجلس بھیڑ ہوگئ تو مامون نے انہیں بند کرنے کا حکم دیا اور امام (ع) نے اس پر لعنت بھیج دی۔ [70]\n" +
                "\n" +
                "امام (ع) نے اپنی روایتوں میں صحت اور طب کے بارے میں مشورہ دیا۔ ان روایات میں ، انہوں نے (ا) صحت اور طب سے متعلق متعدد تصورات کی وضاحت کی اور بیماری سے بچاؤ ، کھانے کی مناسب عادات ، انفرادی حفظان صحت اور علاج کے بارے میں بھی تبادلہ خیال کیا۔ تبت الریدہ (ع) ، جسے رسالہ الہابیہ بھی کہا جاتا ہے ، اس سلسلے میں مشورے کے ٹکڑے ہیں۔");

        str.add("امام الردہ (ع) سے نقل کی گئی احادیث اور اطلاعات کے علاوہ اور ان لوگوں کے جوابات جنہوں نے سائنسی امور کو سمجھنے کے لئے اس کا حوالہ دیا (جیسا کہ 'کتاب الاؤد الر alدہ (ع) جیسی کتابوں میں مذکور ہے۔ مسائل) ، کچھ مصنفین نے کچھ کام امام الردہ (ع) کی طرف منسوب اور منسوب کیے ہیں ، جس میں منسوب ہونے کے خودکشی ثبوت اور ان میں سے کچھ کی صداقت کی ضرورت ہے۔\n" +
                "\n" +
                "الفقہ الرضاوی ایسے کاموں میں شامل ہیں جو محققین اور اسکالروں کو نہیں ہیں\n" +
                "قبول کیا کہ یہ کتاب امام الریدہ (ع) نے لکھی ہے۔ [] 74]\n" +
                "\n" +
                "ایک اور کام جو امام الریدہ (ع) سے منسوب کیا گیا ہے وہ طب میں رسالت الذہبیہ ہے۔ کہا جاتا ہے کہ امام (ع) نے یہ مقالہ المونون کو 201/817 میں بھیجا تھا ، اور اس کی اہمیت کو ظاہر کرنے کے لئے ، مامون نے اسے سونے سے لکھ کر دارالامان کے خزانے گھر میں رکھنے کا حکم دیا تھا۔ حکما۔ یہی وجہ ہے کہ وہ اسے رسالت الذہبیہ (سنہری مقالہ) کہتے ہیں۔ بہت سارے علماء نے اس مقالے پر تبصرے لکھے ہیں۔ [] 75]\n" +
                "\n" +
                "ایک اور کام جو امام الردہ (ع) سے منسوب ہے وہ فقہ میں صحاحت الردہ (ا) ہے ،\n" +
                "جس سے امام (ع) کی طرف منسوب ہونا ثابت نہیں ہے۔ [] 76]\n" +
                "\n" +
                "ایک اور کتاب جو امام الردہ (ع) کی طرف منسوب کی گئی ہے وہ مہد الاسلام و شار' الثین ہے اور بظاہر اس بات کا قطعی یقین نہیں ہے کہ امام (ع) نے اس کو لکھا ہے۔ [] 77]");

        str.add("امام الردہ (ع) کی شہادت کی تاریخ پر اختلاف ہے اور یہ صفر کے آخری دن جمعہ یا پیر کو یا صفر 17 ، یا رمضان 21 ، یا جمعہ اول 18 کو بتایا جاتا ہے ، یا ذوقعد پر\n" +
                "23 ، یا ذی القعد کے آخری دن 202 یا 203 یا 206 میں۔ []२] لیکن علمائے کرام اور مورخین کی اکثریت کے مطابق ، یہ شہادت 203/818 میں واقع ہوئی۔\n" +
                "\n" +
                "الشیخ السدوق نے کچھ ایسی احادیث کو اسی طرح کے معنی کے ساتھ نقل کیا ہے جن میں بعض میں انگور میں زہر کا ذکر آیا ہے اور بعض میں انگور اور انار دونوں میں زہر کا ذکر ہے۔\n" +
                "\n" +
                "امام (ع) کی شہادت کے بعد المومنین نے اس لاش کو حمید ابن قتبہ الطی (بقوت الحارونیا) کے گھر میں دفن کیا\n" +
                "سان آباد کا گاؤں۔ آج ، امام الردہ (ع) کا مقبرہ مشہد ، ایران میں واقع ہے۔");

        udesc.add(str);





        etitleH.add("Imam Muhammad ibne Ali al-Jawad (A)");
        utitleH.add("امام محمد ابن علی الجواد"
        +" (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Virtues and Merits");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief\n");
        str.add("Life\n");
        str.add("Virtues and Merits\n");
        str.add("Martyrdom\n");


        utitle.add(str);


        str=new ArrayList<>();
        str.add("Imam Muhammad ibne Ali al-Jawad (A) \n"
                +"(امام محمد ابن علی الجواد (ع))"+
                "\n"+

                " is the ninth Imam of Twelver Shia, his kunya was Abu Ja'far and he is mentioned in haidth sources as Abu Ja'far al-Thani (the second Abu Ja'far). He (a) was born on Rajab 10, 195/April 8, 811 in Medina and was Imam for 17 years. He was martyred when he (a) was 25 years old and was buried in Kadhimiya beside the grave of his grandfather Musa b. Ja'far (a). He was the youngest Imam when he was martyred.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu Ja'far, Abu 'Ali\n" +
                "\n" +
                "Born:\tRajab 10, 195/April 8, 811\n" +
                "\n" +
                "Birthplace:\tMedina, Arabia\n" +
                "\n" +
                "Imamate:\tFrom Safar 30, 203/September 6, 818(for 17 years)\n" +
                "\n" +
                "Martyrdom:\tDhu l-Qa'da 30, 220/November 25,835 in Kadhimiya, Iraq\n" +
                "\n" +
                "Burial Place:\tKadhimiyaa, Iraq,\n" +
                "\n" +
                "Predecessor:\t'Ali b. Musa al-Rida (a)\n" +
                "\n" +
                "Successor:\t'Ali b. Muhammad al-Hadi (a)\n" +
                "\n" +
                "Father:\tAli b. Musa al-Rida (a)\n" +
                "\n" +
                "Mother:\tSabika\n" +
                "\n" +
                "Spouse(s):\tSamana, Umm al-Fadl\n" +
                "\n" +
                "Son(s):\tAli, Musa\n" +
                "\n" +
                "Daughter(s):\tFatima, Amama\n" +
                "\n" +
                "Titles:\tal-Jawad (the generous), al-Taqi (the pious), Ibn al-" +
                "Rida (Son of al-Rida)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Because Imam al-Jawad was an 8 year old child, some Shi'a followed 'Abd Allah b.\n" +
                "Musa and some others followed Waqifids. But most Shi'a accepted the imamate of Imam al-Jawad (a) due to his scientific superiority in spite of his age. At that time, due to restrictions made for Imam (a), his connections with Shi'a were mostly made through agents.\n" +
                "\n" +
                "Scientific debates of Imam al-Jawad (a) in his childhood age with religious scholars of different Islamic sects in theological issues such as the position of caliphs and in jurisprudential issues such as hajj rituals are among well-known debates of Imams (a).\n" +
                "\n");


        str.add("Birth:\n" +
                "\n" +
                "According to the report of historians, Imam al-Jawad (a) was born in 195/811 in Medina. However, there is a disagreement about the day and month of his birth. Some have regarded Imam's (a) birthday as Ramadan 15/June 11.[5] The famous and unique report is Rajab 10/April 8 which has been mentioned by al-Shaykh al-Tusi in Misbah al-mutahajjid.[6]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Blessed Child:\n" +
                "\n" +
                "Imam al-Jawad (a) was born in last years of Imam al-Rida's (a) life. They have said that before his birth, Imam al-Rida (a) had no children and some enemies spread this rumor that Imam al-Rida (a) is not going to leave any lineage after himself and the chain of imamate will be broken. According to narrative sources, when Imam al-Jawad (a) was born and they brought him to his father; Imam al-Rida (a) said, \"This is a child, more blessed than him is not born for our followers.\" Also, a report narrated by Ibn Asbat and 'Ubbad b. Isma'il said, \"We were at the presence of Imam al-Rida (a) that they brought Abu Ja'far (Imam al-Jawad (a)). We asked, 'Is this that blessed child?' Imam al-Rida (a) said, 'This is the child, no more blessed than him is ever born.\"[7]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wives:\n" +
                "\n" +
                "Al-Ma'mun al-Abbasi married her daughter, called Umm al-Fadl, to Imam al-Jawad (a) in 202/817-18[8] or 215/830-1.[9] This marriage took place following the request of al-Ma'mun and Imam (a) expressed his consent with this marriage after specifying the dowry similar to that of Fatima al-Zahra (a) (which was 500 Dirhams).[10] Some sources have said that during Imam al-Rida's (a) stay in Khorasan, Imam al-Jawad (a) went to see him once[11] and that was when al-Ma'mun asked him to marry his daughter. According to Ibn Kathir, the marriage contract of Imam al-Jawad (a) and al-Ma'mun's daughter was made at the time of Imam al-Rida (a) but the marriage ceremony was held in 215/830 in Tikrit, Iraq.[12] The marriage of Imam al-Jawad (a) with Umm al-Fadl was made by the request of al-Ma'mun. Al-Ma'amun said that he sought to be the grandfather of a child who was a progeny of the Prophet (a) and Imam Ali (a). Al-Shaykh al-Mufid considered that marriage because of al-Ma'mun's love for Imam al-Jawad (a). Some researchers believe that this marriage had political motives, including that al-Ma'mun wanted to control Imam al-Jawad (a) and his relations with Shi'a through that marriage;[13] or to show himself interested in Alawis and prevent them from making uprising.[14] This marriage caused the opposition of some of al-Ma'mun's agents, because they were afraid of transferring caliphate from 'Abbasids to 'Alawis.[15]\n" +
                "\n" +
                "Other wife of Imam al-Jawad (a) was Samana al-Maghribiyya, who was a concubine.[16] Imam (a) did not have any children from Umm al-Fadl[17] and all his children are from Samana.[18]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Children:\n" +
                "\n" +
                "According to al-Shaykh al-Mufid, Imam al-Jawad (a) had four children with the names, 'Ali (Imam al-Hadi (a)), Musa, Fatima and Amama.[19] However some sources regarded three daughters for Imam (a) with the names of Hakima, Khadija, and Umm Kulthum.[20]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imamate of Imam al-Jawad (a) was contemporary with two Abbasid caliphs: the first was al-Ma'mun (r. 193/808-9 to 218/833) and Imam (a) spent 23 years of his life at the time of his caliphate. The second was al-Mu'tasim al-Abbasi (r. 218/833 to 227/841-42) two years of his caliphate were contemporary with imamate of Imam al-Jawad (a). Imamate of Imam al-Jawad (a) lasted 17 years from 203/818 until 220/835. After the martyrdom of Imam al-Jawad (a), his son, Imam 'Ali b. Muhammad al-Hadi (a) , took responsibility of imamate.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate in Childhood:\n" +
                "\n" +
                "Imam al-Rida (a) was martyred in 203/818 when his son, Imam al-Jawad (a) was only 8 years old and became Imam and this caused disagreement among Shi'a so that some of them followed 'Abd Allah b. Musa b. Ja'far, brother of Imam al-Rida (a); but since they did not want to accept imamate of a person without any reason, some of them asked 'Abd Allah some questions and after they found him unable to answer,\n" +
                "they abandoned him.[28] Some other Shi'a joined Waqifids.[29] Nevertheless most of the companions of Imam al-Rida (a) believed in the imamate of Imam al-Jawad\n" +
                "(a). According to al-Nawbakhti, the reason of such a division was that they considered the age of puberty as one of the requirements of imamate.[30]\n" +
                "\n" +
                "The issue of imamate in childhood was risen by some people at the time of Imam al-Rida (a), and he mentioned the prophet 'Isa (a) [Jesus] and said, \"when 'Isa (a) was given prophethood his age was lower than my son\".[31] The issue was risen more seriously in after the martyrdom of Imam\n" +
                "al-Rida (a) and even some of the close companions of Imam al-Rida (a), like Yunus b. 'Abd al-Rahman, doubted about the imamate of Imam al-Jawad (a).[32] Later the same issue was risen about the imamate of Imam al-Hadi (a) and Imam al-Mahdi (a).[33] The answer was from the Qur'an about the prophethood of Prophet Yahya (a) (John), where the Qur'an says: \"And We gave him judgment while still a child\",[34] and speaking of the Prophet 'Isa\n" +
                "(Jesus) in the first days after birth[35] Imam al-Jawad (a) answered to the issue by mentioning the successorship of Prophet Sulayman (a) (Solomon) after Prophet Dawud (a) (David) and said,\n" +
                "\"When Prophet Solomon (a) was still a little child and took the sheep out for grazing, Prophet David (a) made him his successor.\"[36]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Testing for Certainty:\n" +
                "\n" +
                "Although in several cases Imam al-Rida (a) had declared the imamate of Imam al-Jawad (a),[37] but some Shi'a tested Imam al-Jawad (a) with some questions to become more certain.[38] This testing was made about other Imams (a) as well,[39] but due to the low age of Imam al-Jawad (a), Shi'as felt it was more necessary about him.[40]\n" +
                "\n" +
                "There are several reports about Shi'a's questions and answers of Imam al-Jawad\n" +
                "in hadith sources. Imam's (a) answers promoted his position in the eyes of Shi'a and their acceptance of his imamate.\n" +
                "\n" +
                "However, Shi'a did not only tested Imam al-Jawad (a) by their questions, but they\n" +
                "tested others, who claimed to be imam, the same way.[41] Some people from Baghdad and other cities went to Medina during hajj. In a meeting they had with 'Abd Allah b. Musa, Imam al-Jawad's (a) uncle,-who was thought to be the Imam after Imam al-Rida (a)- they asked him some questions, but his answers was not right and they became disappointed and sad.\n" +
                "\n" +
                "Then they went to Imam al-Jawad (a) and asked him the same questions and he (a) gave them the right answers which made them happy, praised Imam (a) and prayed for him.\n" +
                "\n" +
                "\n");


        str.add("Many merits and virtues are reported for Imam al-Jawad (a). His superiority in debates and scholarly discussions with scholars in his childhood is among these mentioned virtues. Some of the wonders narrated for him are as follows:\n" +
                "\n" +
                "Healing Blindness:\n" +
                "\n" +
                "Qutb al-Din al-Rawandi narrated from Muhammad b. Maymun, \"when Imam al-Jawad (a) was a child and Imam al-Rida\n" +
                "had not yet gone to Khorasan, he (a) had a journey to Mecca and I was with him. Upon his return, I told him, 'I want to go to Medina. Please write a letter to Abu Ja'far Muhammad al-Jawad (a) I take to him.' Imam (a) smiled and wrote a letter. I took the letter to Medina. That time I had become blind. Muwaffaq, the servant of Imam, brought Muhammad al-Jawad (a) while he (a) was in his cradle and I gave him the letter. Imam (a) asked Muwaffaq to unseal the letter and open it. Then he asked, 'O Muhammad! How are your eyes?' I said, 'O son of the Prophet (a), my eyes have a disease and my eyesight is lost.' He (a) then touched my eyes and by the blessings of his hand, my eyes were healed. Then, I kissed his hands and feet and went out while I was not blind anymore.\"[80]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Acceptance of Prayer:\n" +
                "\n" +
                "Dawud b. al-Qasim said, \"One day, I went with Imam al-Jawad (a) to a garden. I told him, 'May I be sacrificed for you! I am greedy to eat mud. Please make a du'a for me!' (so that I give up this habit). Imam (a) did not answer and some days later, he (a) told me, 'O Abu Hashim! God removed [the habit of] eating mud from you.'\" Abu Hashim says that, \"Since then, there was nothing I hated more than mud.\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "Fertility of Trees:\n" +
                "\n" +
                "Upon the return of Imam al-Jawad (a) from Baghdad to Medina, a group of people accompanied Imam (a) out of Medina to see him off. By the time of maghrib prayer, they arrived in a place where an old mosque was located. Imam (a) went to that mosque to say his prayer. There was a cedar tree in the yard of that mosque which had not yielded any fruits until that time. Imam (a) asked for some water and made wudu beside that tree and then led a congregational prayer there and after the prayer made a sajda of gratitude. He (a) then said goodbye to people and went away. The next day, the tree yielded so much fruit and people became so surprised of that. It is narrated from al-Shaykh al-Mufid that he has seen this tree many years later and has eaten from its fruits.[81]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Conduct:\n" +
                "\n" +
                "Some sources considered the title of \"al-Jawad\" (the generous) given to Imam (a) because to his great generosity and giving to people.[52] According to a letter Imam al-Rida (a) sent to his son from Khorasan, Imam al-Jawad (a) was known for his generosity since the first years of his life. When his father was in Khorasan, his companions sent out Jawad (a) from a side door of the house to meet less people who would gather at his door to receive charity. According to this report, Imam al-Rida (a) sent a letter to his son and advised him not to follow those who told him not to use the main door. In that letter, Imam al-Rida (a) advised his son, \"whenever you want to go out of home, take some gold and silver with you. No one should ask you but you give them something.\" He (a) had also made special advice about his close relatives such as his uncles and aunts.[53]\n" +
                "\n" +
                "Al-Qarashi introduced Imam al-Jawad (a) the most ascetic and purest of the people of his time. He also spoke about the many nafila prayers Imam al-Jawad (a) performed. According to al-Qurashi, Imam al-Jawad (a) made a nafila prayer in every rak'a of which, he (a) recited each of the\n" +
                "suras al-Fatiha and al-Tawhid 70 times.[54] Also, according to a hadith transmitted by al-Sayyid b. Tawus, upon the coming of every new moon, Imam al-Jawad (a) performed two rak'as of prayer, in the first rak'a of which recited Sura al-Tawhid 30 times and in the second rak'a, he (a) recited Sura al-Qadr 30 times and after the prayer, he (a) give charity.[55]\n" +
                "\n");


        str.add("Imam al-Jawad (a) went to Baghdad twice following the request of his two contemporary caliphs. The first trip at the time of al-Ma'mun was not long.[82] Al-Mu'tasim, the Abbasid caliph summoned Imam al-Jawad (a) from Medina to Baghdad. On Muharram 28, 220/February 1, 835, Imam (a) entered Baghdad and passed away in Dhu l-Qa'da/November of the same year[83] at the age of 25 and was buried beside his grandfather Imam al-Kazim (a) in Kadhimiya.[84]\n" +
                "\n" +
                "The day and month of his martyrdom have been mentioned in some sources as Dhu l-Hijja 5 or 6 (December 4 or 5)[85] and in some other sources as the end of Dhu l-Qa'da (Dhu l-Qa'da 30, 220/November 25,835).[86]\n" +
                "\n" +
                "About the cause of his martyrdom, it is said that Ibn Abi Duwad, the judge of Baghdad slandered against Imam (a) after Imam's (a) opinion about cutting the hand of a thief was accepted and Ibn Abi Duwad and many other jurists and courtiers were discredited. After caliph was influenced by the words of the judge, he decided to kill Imam (a). Al-Mu'tasim used one of his ministers and poisoned Imam (a) and martyred him.[87] However, some believe that Imam (a) was poisoned by Umm al-Fadl, daughter of al-Mu'mun.\n" +
                "\n" +
                "Based on another hadith, when people were giving allegiance to al-Mu'tasim, he wrote a letter to 'Abd al-Malik al-Ziyyat, governor of Medina to send Imam al-Jawad (a) with Umm al-Fadl to Baghdad. When Imam (a) arrived in Baghdad, al-Mu'tasim showed a façade of respect toward him and sent some gifts for him and Umm al-Fadl. Based on this hadith, al-Mu'tasim sent an orange juice to Imam (a) by his servant (called Ashnas). Ashnas told Imam (a), \"The caliph has given this orange juice to some noble people including Ahmad b. Abi Dawud and Sa'id b. Khadib before you and now has ordered that you too drink of it.\" Imam (a) said, \"I will drink it at night.\" But, Ashnas insisted that he (a) should drink it as long it is cold and that its ice would melt. So, Imam (a) drink that and was martyred by it.");


        edesc.add(str);


        str=new ArrayList<>();

        str.add("امام محمد ابن الجواد (ع) ٹولور شیعہ کے نویں امام ہیں ، ان کا کنیا ابو جعفر تھا اور ان کا ذکر ابوذر الثانی (دوسرا ابو جعفر) کے نام سے ملتا ہے۔ وہ (ع) رجب 10 ، 195/8 اپریل 811 ء کو مدینہ منورہ میں پیدا ہوئے اور 17 سال تک امام تھے۔ جب وہ (ع) 25 سال کا تھا تو وہ شہید ہوا اور اسے اپنے دادا موسیٰ ابن جعفر (ع) کی قبر کے پاس کاظمین میں دفن کیا گیا۔ وہ شہید ہونے پر سب سے کم عمر امام تھا۔"+
                "ٹیکنوم: ابو جعفر ، ابوعلی\n" +
                "\n" +
                "ولادت: رجب 10 ، 195/8 اپریل 811\n" +
                "\n" +
                "جائے پیدائش: مدینہ ، عربیہ\n" +
                "\n" +
                "امامت: صفر 30 ، 203/6 ستمبر ، 818 (17 سال تک) سے\n" +
                "\n" +
                "شہادت: ذو القعدہ 30 ، 220 / نومبر 25،835 عراق کے کازمان میں\n" +
                "\n" +
                "تدفین کی جگہ: کاظمین ، عراق ،\n" +
                "\n" +
                "پیشرو: علی ابن موسی الردہ (ا)\n" +
                "\n" +
                "جانشین: 'علی بی۔ محمد الہادی (ا)\n" +
                "\n" +
                "باپ: علی بی۔ موسیٰ الردہ (ا)\n" +
                "\n" +
                "ماں: سبیکا\n" +
                "\n" +
                "شریک حیات (ز): سمانا ، ام الفضل\n" +
                "\n" +
                "بیٹا (ز): علی ، موسی\n" +
                "\n" +
                "بیٹی (زبانیں): فاطمہ ، اماما\n" +
                "ابو جعفر الثانی\n" +
                "\n" +
                "عنوانات: الجواد (فراخ دل) ، التقی (متقی) ، ابن ال\n" +
                "ردہ (ابن الردہ)\n" +
                "\n" +
                "\n" +
                "\n" +
                "چونکہ امام الجواد 8 سال کا بچہ تھا ، لہذا کچھ شیعہ عبد اللہ بی کی پیروی کرتے تھے۔\n" +
                "موسیٰ اور کچھ دوسرے لوگوں نے وکیفڈس کی پیروی کی۔ لیکن بیشتر شیعوں نے عمر کے باوجود سائنسی برتری کی وجہ سے امام جواد علیہ السلام کے امامت کو قبول کیا۔ اس وقت ، امام (ع) کے لئے عائد پابندیوں کی وجہ سے ، شیعہ سے اس کے تعلقات زیادہ تر ایجنٹوں کے ذریعہ ہی کیے گئے تھے۔\n" +
                "\n" +
                "امام جواد (ع) کے بچپن کے زمانے میں مختلف اسلامی فرقوں کے مذہبی اسکالروں کے ساتھ خلیفہ کے منصب جیسے فقہی معاملات اور حج کی رسومات جیسے فقہی امور میں سائنسی بحثیں امام (ع) کے معروف مباحث میں شامل ہیں۔");
        str.add("پیدائش:\n" +
                "\n" +
                "مورخین کی رپورٹ کے مطابق ، امام الجواد (ع) 195/811 میں مدینہ منورہ میں پیدا ہوئے۔ تاہم ، اس کی پیدائش کے دن اور مہینے کے بارے میں اختلاف رائے موجود ہے۔ کچھ نے 15 / جون 11 کو رمضان المبارک کو امام (ع) کی سالگرہ قرار دیا ہے۔ [5] مشہور اور انوکھی رپورٹ رجب 10/8 اپریل ہے جس کا تذکرہ الشیخ التوسی نے مصباح المتہاجد میں کیا ہے۔ [6]\n" +
                "\n" +
                "\n" +
                "\n" +
                "مبارک بچہ:\n" +
                "\n" +
                "امام الجواد (ع) امام الردہ (ع) کی زندگی کے آخری سالوں میں پیدا ہوئے تھے۔ انہوں نے کہا ہے کہ ان کی ولادت سے پہلے ، امام الردہ (ع) کی کوئی اولاد نہیں تھی اور کچھ دشمنوں نے یہ افواہ پھیلائی تھی کہ امام الردہ (ع) اپنے بعد کوئی نسب چھوڑنے والے نہیں ہیں اور امامت کا سلسلہ ٹوٹ جائے گا۔ بیانیے کے مطابق ، جب امام جواد (ع) پیدا ہوئے اور وہ اسے اپنے والد کے پاس لے آئے۔ امام الردہ (ع) نے کہا ، \"یہ بچہ ہے ، اس سے زیادہ مبارک ہمارے پیروکاروں کے لئے پیدا نہیں ہوا ہے۔\" نیز ابن اسبت اورعبد بی کی روایت کردہ ایک رپورٹ۔ اسماعیل نے کہا ، \"ہم امام الردہ (ع) کی موجودگی میں تھے کہ وہ ابو جعفر (امام الجواد (ا)) لے آئے۔ ہم نے پوچھا ، کیا یہ مبارک بچہ ہے؟\" امام الردہ (ع) نے کہا ، 'یہ بچہ ہے ، اس سے بڑھ کر اب تک کوئی برکت پیدا نہیں ہوتا ہے۔' []]\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیویاں:\n" +
                "\n" +
                "الممنون عباسی نے 202 / 817-18 [8] یا 215 / 830-1 میں امام الجواد (ع) سے ام الفدال نامی اپنی بیٹی کی شادی کی۔ [9] یہ شادی المعون کی درخواست کے بعد ہوئی ہے اور امام (ع) نے فاطم al الزہرہ (ع) (جو 500 درہم تھا) کی طرح جہیز بتانے کے بعد اس شادی سے رضامندی ظاہر کی تھی۔ [10] کچھ ذرائع نے بتایا ہے کہ امام الردہ (ا) خراسان میں قیام کے دوران ، امام الجواد (ع) ایک بار ان سے ملنے گئے [11] اور یہ وہ وقت تھا جب المومن نے اس سے اپنی بیٹی کی شادی کرنے کو کہا تھا۔ ابن کثیر کے مطابق ، امام الجواد (ع) اور المومن کی بیٹی کا نکاح نامہ امام الریدہ (ا) کے وقت ہوا تھا لیکن شادی کی تقریب 215/830 میں عراق کے شہر تکرت میں ہوئی تھی۔ . [12] ام الفضل کے ساتھ امام الجواد (ع) کی شادی المومن کی درخواست سے ہوئی تھی۔ المعمون نے کہا کہ وہ ایک ایسے بچے کے نانا بننے کی کوشش کرتا ہے جو پیغمبر اکرم (ص) اور امام علی (ع) کا اولاد تھا۔ الشیخ الموفد نے اس شادی کو امام الجواد (ع) سے المومن کی محبت کی وجہ سے سمجھا۔ کچھ محققین کا خیال ہے کہ اس شادی کے سیاسی محرکات تھے ، جن میں یہ بھی شامل ہے کہ المومن اس شادی کے ذریعہ امام الجواد (ع) اور شیعہ سے اس کے تعلقات پر قابو رکھنا چاہتا تھا [[13] یا خود کو علویس میں دلچسپی ظاہر کرنا اور اسے روکنا ہے انہیں بغاوت کرنے سے۔ [14] اس شادی نے المونون کے کچھ ایجنٹوں کی مخالفت کا سبب بنی ، کیونکہ وہ خلافت کو عباسیوں سے 'علویس' میں منتقل کرنے سے خوفزدہ تھے۔ [15]\n" +
                "\n" +
                "امام جواد (ع) کی دوسری بیوی سمانہ المغربیہ تھی ، جو ایک لونڈی تھی۔ [16] امام (ع) کی ام الفدال سے کوئی اولاد نہیں ہوئی [17] اور اس کے تمام بچے سمانہ سے ہیں۔ [18]" +
                "\n\n\n\n\n" +
                "بچے:\n" +
                "\n" +
                "الشیخ الموطف کے مطابق ، امام جواد (ع) کے چار بچے تھے ، جن کے نام 'علی (امام الہادی (ا)) ، موسی ، فاطمہ اور عمامہ ہیں۔ [19] تاہم ، بعض ذرائع نے امام (ع) کے لئے تین بیٹیاں حکیمہ ، خدیجہ ، اور ام کلثوم کے ناموں سے تعبیر کیں۔ [20]\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "امام الجواد (ع) کے امامت دو عباسی خلفاء کے ساتھ ہم عصر تھے: پہلا المومن (ر. 193 / 808-9 تا 218/833) تھا اور امام (ع) نے اپنی زندگی کے 23 سال گزارے اس کی خلافت کا وقت دوسرا المتثم ال عباسی (ر 218/833 تا 227 / 841-42) اس کی خلافت کے دو سال امام الجواد (ع) کے امامت کے ہم عصر تھے۔ امام الجواد (ع) کے امامت 203/818 سے 220/835 تک 17 سال تک رہیں۔ امام جواد (ع) کی شہادت کے بعد ، ان کے بیٹے ، امام علی بی. محمد الہادی (ع) نے امامت کی ذمہ داری قبول کی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "بچپن میں امامت:\n" +
                "\n" +
                "امام الردہ (ع) 203/818 میں اس وقت شہید ہوئے جب ان کے بیٹے ، امام جواد (ع) صرف 8 سال کے تھے اور امام بن گئے تھے اور اس وجہ سے شیعوں میں اختلاف پیدا ہوا تاکہ ان میں سے بعض نے عبد اللہ بن کی پیروی کی۔ . موسیٰ بی۔ جعفر ، امام الردہ (ا) کا بھائی۔ لیکن چونکہ وہ بغیر کسی وجہ کے کسی شخص کے امامت کو قبول نہیں کرنا چاہتے تھے ، ان میں سے بعض نے عبد اللہ سے کچھ سوالات پوچھے اور انھیں جواب ملنے سے قاصر ہونے کے بعد ،\n" +
                "انہوں نے اسے چھوڑ دیا۔ [28] بعض دوسرے شیعہ واقفوں میں شامل ہوئے۔ [29] بہر حال امام الردہ (ع) کے اکثر اصحاب امام جواد کے امامت پر یقین رکھتے تھے\n" +
                "(a) النبختی کے مطابق ، اس طرح کی تفریق کی وجہ یہ تھی کہ وہ بلوغت کی عمر کو امامت کے تقاضوں میں سے ایک سمجھتے ہیں۔ [] 30]\n" +
                "\n" +
                "بچپن میں امامت کا معاملہ کچھ لوگوں نے امام الردہ (ع) کے وقت اٹھایا تھا ، اور اس نے نبی عیسیٰ (ع) [عیسیٰ] کا ذکر کیا تھا اور کہا تھا ، \"جب عیسی (ع) کو نبوت دی گئی تھی عمر میرے بیٹے سے کم تھی \"۔ [31] یہ مسئلہ امام کی شہادت کے بعد مزید سنجیدگی کے ساتھ اٹھا\n" +
                "الریدہ (ا) اور حتی کہ امام الردہ (ع) کے کچھ قریبی ساتھی ، جیسے یونس ب۔ عبد الرحمٰن ، امام الجواد (ع) کے امامت کے بارے میں شکوہ کرتے ہیں۔ []२] بعد میں یہی مسئلہ امام الہادی (ع) اور امام مہدی (ع) کے امامت کے بارے میں اٹھایا گیا۔ [33 33] اس کا جواب قرآن سے حضرت یحییٰ (ع) (یوحنا) کی پیشگوئی کے بارے میں تھا ، جہاں قرآن کا ارشاد ہے: \"اور ہم نے اسے بچپن میں ہی فیصلہ دیا\" ، [] 34] اور حضرت عیسیٰ علیہ السلام کے متعلق گفتگو\n" +
                "(یسوع) پیدائش کے بعد پہلے دنوں میں [35] امام جواد (ا) نے حضرت داؤد (ع) (ڈیوڈ) کے بعد حضرت سلیمان (ع) (سلیمان) کی جانشینی کا ذکر کرتے ہوئے اس مسئلے کا جواب دیا اور کہا ،\n" +
                "\"جب حضرت سلیمان (ع) ابھی چھوٹے بچے تھے اور بھیڑوں کو چرنے کے لئے باہر لے گئے تھے ، تو حضرت داؤد (ع) نے انھیں اپنا جانشین بنا دیا تھا۔\" [36 36]" +
                "\n\n\n\n" +
                "\n" +
                "یقین کے لئے جانچ:\n" +
                "\n" +
                "اگرچہ متعدد معاملات میں امام الردہ (ع) نے امام جواد (ع) کے امامت کا اعلان کیا تھا ، [] 37] لیکن بعض شیعوں نے امام جواد (ع) کو کچھ سوالات کے ساتھ آزمایا اور زیادہ یقینی بن گیا۔ [38 38 ] یہ جانچ دوسرے ائمہ (ع) کے بارے میں بھی کی گئی تھی ، [39]] لیکن امام جواد (ع) کی عمر کم ہونے کی وجہ سے شیعوں نے محسوس کیا کہ یہ ان کے بارے میں زیادہ ضروری ہے۔\n" +
                "\n" +
                "شیعوں کے سوالات اور امام الجواد کے جوابات کے بارے میں متعدد اطلاعات ہیں\n" +
                "حدیث کے ماخذ میں۔ امام (ع) کے جوابات نے شیعہ کی نظر میں اس کے مقام اور ان کے امامت کی قبولیت کو فروغ دیا۔\n" +
                "\n" +
                "تاہم ، شیعہ نے نہ صرف ان کے سوالات کے ذریعہ امام الجواد (ع) کا تجربہ کیا بلکہ وہ بھی\n" +
                "دوسروں کو بھی آزمایا ، جنہوں نے بھی اسی طرح امام ہونے کا دعوی کیا۔ [41१] حج کے دوران بغداد اور دیگر شہروں سے کچھ لوگ مدینہ منورہ گئے۔ ایک ملاقات میں انہوں نے عبد اللہ بی کے ساتھ ملاقات کی۔ موسی ، امام جواد کے (ایک) ماموں ، - جو امام الردہ (ع) کے بعد امام سمجھے جاتے تھے ، انہوں نے اس سے کچھ سوالات پوچھے ، لیکن اس کے جوابات درست نہیں تھے اور وہ مایوس اور غمزدہ ہوگئے۔\n" +
                "\n" +
                "پھر وہ امام جواد (ع) کے پاس گئے اور ان سے وہی سوالات پوچھے اور آپ (ع) نے انہیں صحیح جوابات دیئے جس سے انہیں خوشی ہوئی ، امام (ع) کی تعریف کی اور ان کے لئے دعا کی۔");
        str.add("امام جواد (ع) کے لئے بہت ساری خوبیوں اور فضائل کی اطلاع ہے۔ بچپن میں علمائے کرام کے ساتھ مباحثوں اور علمی گفتگو میں ان کی برتری انہی خوبیوں میں شامل ہے۔ اس کے لئے بیان کردہ کچھ عجائبات حسب ذیل ہیں۔\n" +
                "\n" +
                "شفا بخشی:\n" +
                "\n" +
                "قطب الدین الروندی نے محمد بن سے روایت کیا۔ میون ، \"جب امام الجواد (ع) بچہ اور امام الردہ تھے\n" +
                "ابھی خراسان نہیں گیا تھا ، اس (ع) کا مکہ معظمہ تھا اور میں اس کے ساتھ تھا۔ واپسی پر ، میں نے اس سے کہا ، 'میں مدینہ جانا چاہتا ہوں۔ برائے کرم ابو جعفر محمد الجواد (ع) کو ایک خط لکھیں میں ان کے پاس جاتا ہوں۔ ' امام (ع) نے مسکراتے ہوئے ایک خط لکھا۔ میں خط لے کر مدینہ چلا گیا۔ اس وقت میں اندھا ہو چکا تھا۔ امام کا خادم ، معفق ، محمد الجواد (ع) کو لے کر آیا جب وہ (ا) اپنے جھولا میں تھا اور میں نے اسے خط دیا۔ امام (ع) نے معفق کو خط اتارنے اور کھولنے کو کہا۔ پھر اس نے پوچھا ، اے محمد! تمہاری آنکھیں کیسی ہیں؟ ' میں نے عرض کیا ، یا رسول اللہ (صلی اللہ علیہ وآلہ وسلم) ، میری آنکھوں کو بیماری ہے اور میری بینائی ختم ہوگئ ہے۔ اس کے بعد (ا) نے میری آنکھوں کو چھو لیا اور اس کے ہاتھ کی برکت سے میری آنکھیں ٹھیک ہوگئیں۔ پھر ، میں نے اس کے ہاتھ پاؤں چومے اور باہر چلا گیا جب میں اب اندھا نہیں تھا۔ \"[] 80]\n" +
                "\n" +
                "\n" +
                "\n" +
                "دعا کی قبولیت:\n" +
                "\n" +
                "داؤد b. القاسم نے کہا ، \"ایک دن ، میں امام جواد (ع) کے ساتھ ایک باغ میں گیا ، میں نے اس سے کہا ، 'میں تمہارے لئے قربان ہوں! مجھے کیچڑ کھانے کا لالچ ہے ، براہ کرم میرے لئے دوعا بنائیں۔ '! (تاکہ میں یہ عادت ترک کردوں) ۔امام (ع) نے جواب نہیں دیا اور کچھ دن بعد ، انہوں نے (ا) مجھ سے کہا ، 'اے ابو ہاشم! خدا نے تم سے کیچڑ کھانے کی عادت ختم کردی۔' \"ابو ہاشم کہتے ہیں ، \"تب سے ، مجھے کیچڑ سے زیادہ نفرت نہیں تھی۔\"\n" +
                "\n" +
                "\n" +
                "\n" +
                "درختوں کی زرخیزی:\n" +
                "\n" +
                "امام جواد (ع) کی بغداد سے مدینہ منورہ واپسی کے بعد ، لوگوں کا ایک گروہ امام (ع) کے ساتھ مدینہ سے باہر نکلا تو اسے روانہ ہوا۔ نماز مغرب کے وقت ، وہ ایک ایسی جگہ پہنچے جہاں ایک پرانی مسجد واقع تھی۔ امام (ع) اس مسجد میں نماز پڑھنے گئے۔ اس مسجد کے صحن میں دیودار کا ایک درخت تھا جس کو اس وقت تک کوئی پھل نہیں ملا تھا۔ امام (ع) نے پانی دریافت کیا اور اس درخت کے پاس وضو کیا اور پھر وہاں اجتماعی دعا کی اور نماز کے بعد شکر ادا کیا۔ اس کے بعد (ا) لوگوں کو الوداع کہا اور چلا گیا۔ اگلے دن ، درخت نے اتنا پھل نکالا اور لوگ اس پر حیرت زدہ ہوگئے۔ الشیخ الموطف سے روایت ہے کہ اس نے بہت سال بعد یہ درخت دیکھا ہے اور اس کے پھلوں سے کھایا ہے۔ [81]]" +
                "\n\n\n\n" +
                "طرز عمل:\n" +
                "\n" +
                "کچھ ذرائع نے \"الجواد\" (فراخدلی) کے لقب کو امام (ع) کو دیئے جانے کی وجہ سے اس کی عظیم فیاضی اور لوگوں کو عطا کرنے پر غور کیا۔ []२] خراسان سے اپنے بیٹے کو بھیجے گئے ایک خط کے مطابق امام الریدہ (ع) ، امام الجواد (ع) اپنی زندگی کے ابتدائی برسوں سے ہی سخاوت کے لئے جانے جاتے ہیں۔ جب اس کے والد خراسان میں تھے ، تو ان کے ساتھیوں نے جواد (ع) کو گھر کے ایک طرف والے دروازے سے کم لوگوں سے ملنے کے لئے روانہ کیا جو خیرات کے ل his اس کے دروازے پر جمع ہوتے تھے۔ اس رپورٹ کے مطابق ، امام الردہ (ع) نے اپنے بیٹے کو ایک خط بھیجا اور انہیں مشورہ دیا کہ وہ ان لوگوں کی پیروی نہ کریں جنہوں نے کہا تھا کہ وہ مرکزی دروازہ استعمال نہ کریں۔ اس خط میں ، امام الردہ (ع) نے اپنے بیٹے کو نصیحت کی ، \"جب بھی آپ گھر سے باہر جانا چاہتے ہو تو کچھ سونا چاندی اپنے ساتھ لے جائیں۔ کوئی آپ سے پوچھے نہیں لیکن آپ انہیں کچھ دیں۔\" اس نے (ع) اپنے قریبی رشتے داروں جیسے اپنے ماموں اور خالہ کے بارے میں بھی خصوصی مشورے دیئے تھے۔ [] 53]\n" +
                "\n" +
                "القراشی نے امام الجواد (ع) کو اپنے زمانے کے لوگوں میں سب سے زیادہ طالع مند اور خالص ترین افراد سے تعارف کرایا۔ انہوں نے امام الجواد (ع) کی ادا کردہ بہت سی نفلی نمازوں کے بارے میں بھی بات کی۔ القراشی کے مطابق ، امام الجواد (ع) نے ہر رکعت میں نفل نماز پڑھی ، جس (آپ) نے ہر ایک کی تلاوت کی\n" +
                "سورة الفاتحہ اور التوحید 70 مرتبہ۔ [] 54] نیز ، سید ابن توس کی ایک حدیث کے مطابق ، ہر نئے چاند کے آنے پر ، امام جواد (ع) نے پہلی رکعت میں سور ra التوحید کی تلاوت کی ، جس میں دو رکعت نماز پڑھی گئی تھی۔ 30 بار اور دوسری رکعت میں ، اس نے (الف) 30 بار سورة القدر پڑھا اور نماز کے بعد ، (ا) صدقہ کیا۔ [] 55]");


        str.add("امام جواد (ع) اپنے دو ہم عصر خلفاء کی درخواست کے بعد دو بار بغداد چلے گئے۔ المون کے وقت پہلا سفر زیادہ لمبا نہیں تھا۔ [] 82] معتصم ، عباسی خلیفہ نے امام الجواد (ع) کو مدینہ سے بغداد طلب کیا۔ محرم 28 ، 220 / یکم فروری ، 835 ء کو ، امام (ع) بغداد میں داخل ہوئے اور اسی سال [83 83] کے 25 سال کی عمر میں ، ذی القدہ / نومبر میں انتقال کر گئے ، اور انھیں اپنے نانا امام الثانی کے پاس دفن کیا گیا۔ کاظمین میں کاظم (ا)۔ [84]\n" +
                "\n" +
                "اس کی شہادت کے دن اور مہینے کو ذو الہجہ 5 یا 6 (4 یا 5 دسمبر) کے طور پر ذکر کیا گیا ہے [] 85] اور بعض دیگر ماخذ میں ذی القعد کے اختتام کے طور پر 'دا 30 ، 220 / نومبر 25،835)۔ [86]\n" +
                "\n" +
                "ان کی شہادت کی وجوہ کے بارے میں ، یہ کہا جاتا ہے کہ چور کا ہاتھ کاٹنے کے بارے میں امام (ع) کی رائے کو قبول کرنے کے بعد بغداد کے جج ابن ابی دوؤد نے امام (ع) کے خلاف غیبت کی اور ابن ابی دعا اور دوسرے بہت سارے فقہا اور درباری بدنام ہوئے۔ خلیفہ جج کے الفاظ سے متاثر ہونے کے بعد ، اس نے امام (ع) کو قتل کرنے کا فیصلہ کیا۔ معتصم نے اپنے ایک وزیر کو استعمال کیا اور امام (ع) کو زہر دے کر شہید کردیا۔ [] 87] تاہم ، کچھ کا خیال ہے کہ امام (ع) کو المومن کی بیٹی ام الفضل نے زہر آلود کیا تھا۔\n" +
                "\n" +
                "ایک اور حدیث کی بناء پر ، جب لوگ معتصم پر بیعت کر رہے تھے ، اس نے مدینہ کے گورنر عبد الملک الزیات کو ایک خط لکھا تاکہ امام الجواد (ع) کو ام الفضل کے ساتھ بغداد بھیجیں . جب امام (ع) بغداد پہنچے تو معتصم نے ان کی طرف عقیدت کا مظاہرہ کیا اور ان کو اور ام الفضل کے لئے کچھ تحائف بھیجے۔ اس حدیث کی بنا پر ، معتصم نے اپنے خادم (اشناس کے نام سے) کے ذریعہ امام (ع) کو سنتری کا رس بھجوایا۔ اشناس نے امام (ع) سے کہا ، \"خلیفہ نے یہ سنتری کا رس آپ سے پہلے احمد ابن ابی داؤد اور سعید ابن خدیب سمیت کچھ نیک لوگوں کو دیا ہے اور اب حکم دیا ہے کہ آپ بھی اس میں سے پیو۔\" امام (ع) نے فرمایا میں اسے رات کو پیوں گا۔ لیکن ، اشناس نے تاکید کی کہ جب تک وہ سردی ہے اور اسے برف پگھلے گی اسے (اے) پینا چاہئے۔ تو ، امام (ع) نے اسے پی لیا اور اس سے شہید ہوگئے۔");


        udesc.add(str);



        etitleH.add("Imam Ali ibne Muhammad al-Hadi (A)");
        utitleH.add("امام علی ابن محمد الہادی"
                +" (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Explaining Islamic Teachings" );
        str.add("Du'as and Ziyarahs");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();

        str.add("Biography In Brief\n");
        str.add("Life\n");
        str.add("Explaining Islamic Teachings\n" );
        str.add("Du'as and Ziyarahs\n");
        str.add("Martyrdom\n");


        utitle.add(str);


        str=new ArrayList<>();
        str.add("Imam Ali ibne Muhammad al-Hadi (A)\n "
                +"(امام علی ابن محمد الہادی (ع))"+
                "\n"+

                " is known as al-Naqī (ﻲﻘﻨﻟا, the pure) and al-Hādī (يدﺎﻬﻟا, the guide). He was the Imam\n" +
                "(leader) between 220/835 and 254/868 for a period of thirty-four years.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu l-Hasan\n" +
                "\n" +
                "Born:\tDhu l-Hijja 15, 212/March 10, 828\n" +
                "\n" +
                "Birthplace:\tSarya\n" +
                "\n" +
                "Imamate:\tFrom November 29, 835/Dhu l-Qa'da 30, 220(for 34 years)\n" +
                "\n" +
                "Martyrdom:\tRajab 3, 254/July 2, 868\n" +
                "\n" +
                "Cause of Martyrdom:\tBy Poisoning\n" +
                "\n" +
                "Burial:\tPlace Samarra\n" +
                "\n" +
                "Successor:\tAl-Hasan b. 'Ali (a)\n" +
                "\n" +
                "Father:\tMuhammad b. 'Ali (a)\n" +
                "\n" +
                "Mother:\tSamana\n" +
                "\n" +
                "Spouse(s):\tSalil\n" +
                "\n" +
                "Son(s):\tAl-Hasan, Muhammad, al-Husayn,Jafar\n" +
                "\n" +
                "Daughter(s):\t'A'isha\n" +
                "\n" +
                "Titles:\tal-Naqi(the pure)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Many years of the imamate (leadership) of Imam al-Hadi (a) took place in Samarra\n" +
                "under direct surveillance of the rulers of his time. His imamate was contemporary with the rule of some Abbasid caliphs including al-Mutawakkil al-'Abbasi.\n" +
                "\n" +
                "Different hadiths are narrated from Imam al-Hadi (a) about ideological issues, interpretation of the Qur'an, fiqh, and ethics. Al-Ziyarah al-Jami'a al-Kabira which includes Shi'a ideological concepts about the Imams, is narrated from Imam al-Hadi (a).\n" +
                "\n" +
                "Imam al-Hadi (a) was in contact with Shi'a and managed their affairs through the Wikala network. Some of his students and companions are as follows: 'Abd al-'Azim al-Hasani, 'Uthman b. Sa'id, Ayyub b. Nuh, al-Hasan b. Rashid and al-Hasan al-Utrush.\n" +
                "\n" +
                "His shrine is in Samarra. The dome and some minarets of his shrine were destroyed by terrorist attacks in 2006; and again, in 2008 other minarets of the shrine were also destroyed by another bombing. The shrine has been reconstructed from 2010 to 2015 by Iran.\n" +
                "\n");

        str.add("Birth:\n" +
                "\n" +
                "According to al-Kulayni, al-Shaykh al-Mufid, al-Shaykh al-Tusi and Ibn Athir, Imam al-Hadi's (a) birth was in the middle of Dhu l-Hijja, 212/March 10, 828 in a region called Sarya near Medina[5]. It was reported by some, that the 2nd or 5th day of Rajab (1st or 4th of October, 827) was the day of his birth.[6]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wife and Children:\n" +
                "\n" +
                "Imam al-Hadi's (a) wife was called Salil[10].\n" +
                "She was a concubine from Nawba[11]. She\n" +
                "was also the mother of Imam al-'Askari (a).\n" +
                "\n" +
                "Most Shi'a scholars have listed four sons of Imam al-Hadi (a), but there is disagreement regarding the number of daughters. Al-Hadini wrote Imam al-Hadi's\n" +
                "sons were al-Hasan (a), Muhammad, al-Husayn and Ja'far (who claimed\n" +
                "imamate and was later called Ja'far al-Kadhdhab).[12]\n" +
                "\n" +
                "Regarding his children, al-Shaykh al-Mufid wrote, \"His successor was Abu Muhammad al-Hasan who was Imam after him, and then there are al-Husayn, Muhammad and a girl named 'A'isha[13].\" Ibn Shahrashub mentioned another daughter for him called 'Aliyya.[14] However, according to different evidences and references, it may have been the case that Imam al-Hadi (a) had only one\n" +
                "daughter who had different names. According to Sunni scholars, Imam al-Hadi\n" +
                "(a) had four sons and one daughter.[15]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Imamate:\n" +
                "\n" +
                "Imam al-Hadi (a) became the Imam in 220/835. Since the Shi'a (except a few) had passed the issue of the small age of Imam al-Jawad (a) upon becoming Imam, no obvious doubt was raised about the Imamate of Imam al-Hadi (a). According to al-Shaykh al-Mufid, all followers of Imam al-Jawad (a) except a few, accepted the imamate of Imam al-Hadi (a). The other few people, for a short period of time believed in the imamate of Musa b. Muhammad (d. 296/909) known as Musa al-Mubarqa' who is buried in Qom; however, after a while, they turned from his imamate and accepted the imamate of Imam al-Hadi (a).[16] Sa'd b. Abd Allah attributed the turning of these people from Musa al-Mubarqa' due to the fact that Musa al-Mubarqa' himself rejected this belief.[17]\n" +
                "\n");

        str.add("Priority of the Qur'an:\n" +
                "\n" +
                "One of the deviations Ghulat (exaggerators) brought up and caused other Islamic sects to attack the Shi'a, was the issue of altering the Qur'an .Sunnis are also affected by this due to the insertion of inauthentic hadiths in their books.\n" +
                "\n" +
                "Against this accusation, Imams (a) of the Shia have always given priority to the Qur'an and have regarded any hadith opposite to the Qur'an as invalid and false.\n" +
                "\n" +
                "In an extensive treatise narrated by Ibn Shu'ba al-Harrani, Imam al-Hadi (a) strictly insisted on the priority of the Qur'an and mentioned it as an accurate standard for assessment of hadiths and distinguishing authentic ones from inauthentic ones. He oﬃcially declared the Qur'an as the only text that all Islamic groups refer to.\n" +
                "\n" +
                "Elsewhere regarding a conflicting issue, Imam (a) referred to the Qur'an and convinced everyone to agree with him.[34] Al-'Ayyashi narrated a hadith stating, \"Abu Ja'far and Abu 'Abd Allah, peace be with them, said we do not accept anything unless it agrees with the Book of God and the conduct of His Prophet (s)\"[35]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Question of Creation of the Qur'an:\n" +
                "\n" +
                "One of the most important issues of the third/ninth century which kept the Sunni school of thought occupied, was the dispute over the issue of Huduth and Qidam (creation or eternity) of the Qur'an which created divisions and sects among them.\n" +
                "\n" +
                "The Shi'a kept silent following the instructions of Imams (a) over this issue. In a letter, Imam al-Hadi (a) ordered one of the Shi'a not to give opinion over this issue and not to display any bias with either of the opinions regarding creation or eternity of the Qur'an.[36]\n" +
                "\n" +
                "This helped the Shi'a not to become engaged in such fruitless arguments.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Ilm al-Kalam (Theology):\n" +
                "\n" +
                "Different opinions among different Shi'a sects made it diﬃcult for the Imams (a) to direct the people. The Shi'ites were scattered in different regions which meant that every once in a while, they became influenced by others' opinions which added to the former mentioned issue. In this confusion, non-Shi'a groups and anti-Shi'a oppositions incited these disagreements and falsely projected them deeper than they actually were. There is a narration from al-Kashshi that explicitly shows a person made up three sects named Zurariyya, 'Ammariyya, and Ya'furiyya and attributed them to each of the great companions of Imam al-Sadiq (a) (i.e. Zurara b. A'yan, 'Ammar al-Sabati, and Ibn Abi Ya'fur).[37]\n" +
                "\n" +
                "Imams (a) of the Shia sometimes confronted questions, origins of some of which were these disagreements among Shi'a scholars, which were sometimes just discussion-oriented or sometimes deeper and the Imams (a) had to be judges among these issues.\n" +
                "\n" +
                "One of these issues was Tashbih and Tanzih of Divine Attributes. Since the beginning, Imams (a) of the Shia insisted on the truth of the theory of Tanzih.\n" +
                "\n" +
                "Discussions of Hisham b. al-Hakam and Hisham b. Salim on Tashbih and Tanzih caused disagreements among the Shi'a and Imams (a) frequently encountered questions in relation to these topics.\n" +
                "\n" +
                "Consequently, more than twenty one narrations are reported from Imam al-Hadi (a) about Tanzih, some of which are very comprehensive and they all indicate that Imam (a) approved of Tanzih.[38]\n" +
                "\n" +
                "Regarding the Imams' (a) opinions about predestination and free will, there is a comprehensive treatise available from Imam al-Hadi (a). In this treatise, Shi'a theological principles regarding predestination and free will, are explained according to the Qur'an and the interpretation of the hadith, \"La jabr wa la tafwid bal amrun bayn al-amrayn,\" (there is no predestination or free will, but the matter is between the two issues) narrated from Imam al-Sadiq (a).[39]\n" +
                "\n" +
                "Among narrations reported from Imam al-Hadi (a) with the title of Ihtijajat, most of them are about predestination and free will.\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("Imam al-Hadi (a) made great efforts in educating and familiarizing Shi'a Muslims with Shi'a teachings through Du'a (supplication) and Ziyarah (visiting either physical or vocal). Such du'as in different ways, mentioned some political and social points as well as supplicating to God. These points were very influential in the political realm of the Shi'a and regularly inspired certain concepts within the Shi'a society.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Al-Ziyarah al-Jami'a al-Kabira:\n" +
                "\n" +
                "This Ziyarah (visiting) is a wonderful course of Shi'a teachings and introduces the position of the Ahl al-Bayt (a) which was initiated by Imam al-Hadi (a) following the requests of the Shi'a.\n");

        str.add("According to some reports, Al-Mu'tazz al-'Abbasi poisoned Imam al-Hadi (a) and\n" +
                "martyred him.[51] In the funeral of Imam al-Hadi (a), people slapped themselves and scratched their faces. They took Imam's\n" +
                "body out of his house and placed him in front of the house of Musa b. Bagha (the commander of Abbasids army). When al-Mu'tazz al-'Abbasi saw them, he decided to do the Funeral Prayer on Imam's (a) body. He then ordered that the people place the body on the ground and he prayed before Imam's (a) body, even though Imam al-Hasan al-'Askari (a) and some Shi'a previously had prayed by the Imam's (a) body before the funeral. Afterwards, they buried Imam (a) in one of the houses in which he was imprisoned. It was such a\n" +
                "large crowd, that Imam al-'Askari (a) moved in the crowd with great diﬃculty. Then, a young man brought a horse for Imam (a) and people accompanied him to his house.[52]\n");

        edesc.add(str);

        str=new ArrayList<>();

        str.add("امام علی ابن محمد الہادی (ع) النقی (خالص) اور الہادی (رہنما) کے طور پر جانا جاتا ہے۔ وہ چونتیس سال کی مدت کے لئے 220/835 اور 254/868 کے درمیان امام (رہبر) تھے۔"+
                "\n\n\n\nٹیکنوم: ابو الحسن" +
                "ولادت: ذو الحجہ 15 ، 212 / مارچ 10 ، 828\n" +
                "\n" +
                "جائے پیدائش: سریا\n" +
                "\n" +
                "امامت: 29 نومبر ، 835 / ذی القعد 30 ، 220 (34 سال تک)\n" +
                "\n" +
                "شہادت: رجب 3 ، 254/2 جولائی ، 868\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے\n" +
                "\n" +
                "تدفین کی جگہ: سمرا\n" +
                "\n" +
                "جانشین: الحسن ابن علی (ع)\n" +
                "\n" +
                "والد: محمد ابن علی (ع)\n" +
                "\n" +
                "ماں: سمانا\n" +
                "\n" +
                "شریک حیات: سیل\n" +
                "\n" +
                "بیٹا (ز): الحسن ، محمد ، الحسن ، جعفر\n" +
                "\n" +
                "بیٹی (ے): 'عائشہ\n" +
                "\n" +
                "عنوانات: النقی (خالص)\n" +
                "\n" +
                "\n" +
                "\n" +
                "سامراء ا میں امام الہادی (ع) کی امامت (قیادت) کے کئی سال گذرے\n" +
                "اپنے وقت کے حکمرانوں کی براہ راست نگرانی میں۔ اس کے امتی متعدد عباسی خلفاء کی حکمرانی کے ساتھ ہم عصر تھے جن میں المتوککیل العبسی بھی شامل تھا۔\n" +
                "\n" +
                "نظریاتی امور ، قرآن کی تفسیر ، فقہ ، اور اخلاقیات کے بارے میں امام الہادی (ع) سے مختلف احادیث روایت ہیں۔ الزیار الجامعہ الکبیرہ جس میں ائمہ کے بارے میں شیعہ نظریاتی تصورات بھی شامل ہیں ، امام الہادی (ع) سے روایت کیا گیا ہے۔\n" +
                "\n" +
                "امام الہادی (ع) شیعہ کے ساتھ رابطے میں تھے اور وکلا نیٹ ورک کے ذریعہ ان کے امور کو سنبھالتے تھے۔ اس کے کچھ طلباء اور ساتھی کچھ اس طرح ہیں: 'عبد العزیم الحسنی ،' عثمان بی. سعید ، ایوب بی۔ نوح ، الحسن بی۔ راشد اور الحسن الترش۔\n" +
                "\n" +
                "اس کا مزار سمرہ میں ہے۔ 2006 میں دہشت گرد حملوں سے اس کے گنبد اور اس کے مزار کے کچھ مینار تباہ ہوگئے تھے۔ اور ایک بار پھر ، 2008 میں مزار کے دیگر مینار بھی ایک اور بمباری سے تباہ ہوگئے۔ ایران کے ذریعہ 2010 سے 2015 تک اس مزار کی تعمیر نو کی گئی ہے۔");


        str.add("پیدائش:\n" +
                "\n" +
                "الکیلانی ، الشیخ الموفد ، الشیخ التوسی اور ابن اثیر کے مطابق ، امام الہادی (ع) کی ولادت ذو الحجہ کے وسط میں ہوئی ، 212 / مارچ 10 ، 828 ایک خطے میں مدینہ کے قریب ساریہ کہلاتا ہے []]۔ کچھ لوگوں کے ذریعہ اطلاع ملی ہے کہ رجب کا دوسرا یا 5 واں دن (یکم یا 4 اکتوبر ، 827) اس کی ولادت کا دن تھا۔ [[]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیوی اور بچے:\n" +
                "\n" +
                "امام الہادی کی (ا) بیوی کو صلیل [10] کہا جاتا تھا۔\n" +
                "وہ نوبہ [11] کی رہائشی تھیں۔ وہ\n" +
                "امام الاسکری (ع) کی والدہ بھی تھیں۔\n" +
                "\n" +
                "بیشتر شیعہ علماء نے امام الہادی (ع) کے چار بیٹوں کی فہرست دی ہے ، لیکن بیٹیوں کی تعداد کے بارے میں اختلاف رائے پایا جاتا ہے۔ الحدینی نے امام الہادی کی تحریر کی\n" +
                "بیٹے تھے الحسن (ع) ، محمد ، الحسن اور جعفر (جنہوں نے دعوی کیا تھا)\n" +
                "امامت اور بعد میں اسے جعفر الکھدھب کہا گیا۔ [12]\n" +
                "\n" +
                "اپنے بچوں کے بارے میں ، الشیخ الموطف نے لکھا ، \"ان کا جانشین ابو محمد الحسن تھا جو ان کے بعد امام تھا ، اور پھر الحسن ، محمد اور ایک لڑکی عائشہ [13] ہے۔\" ابن شہرشوب نے ان کے لئے ایک اور بیٹی کا ذکر کیا جسے علیا کہتے ہیں۔ [14] تاہم ، مختلف شواہد اور حوالوں کے مطابق ، یہ معاملہ ہوسکتا ہے کہ امام الہادی (ع) کے پاس صرف ایک ہی تھا\n" +
                "بیٹی جس کے مختلف نام تھے۔ سنی علماء کے نزدیک ، امام الہادی\n" +
                "(ا) کے چار بیٹے اور ایک بیٹی تھی۔ [15]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "امامت:\n" +
                "\n" +
                "امام الہادی (ع) 220/835 میں امام بنے۔ چونکہ شیعوں نے (چند ایک کو چھوڑ کر) امام جواد (ع) کے امام بننے پر چھوٹی عمر کا معاملہ منظور کرلیا تھا ، لہذا امام الہادی (ع) کی امامت کے بارے میں کوئی واضح شبہ نہیں اٹھایا گیا تھا۔ الشیخ الموطف کے مطابق ، امام الجواد (ع) کے تمام پیروکاروں نے چند سوائے ، امام الہادی (ع) کی امامت کو قبول کیا۔ دوسرے کچھ لوگوں نے ، کچھ عرصے کے لئے موسی ابن محمد (296/909) کی امامت پر یقین کیا جو موسیٰ المبارکہ کے نام سے مشہور تھے جو قم میں دفن ہیں۔ تاہم ، تھوڑی دیر بعد ، انہوں نے اس کے امامت سے رجوع کیا اور امام الہادی (ع) کی امامت کو قبول کرلیا۔ [16] سعد بن عبد اللہ نے ان لوگوں کو موسیٰ المبارقہ سے ہٹانے کی وجہ اس وجہ سے کہ خود موسیٰ المبارکہ نے خود بھی اس عقیدے کو مسترد کردیا۔ [17]");


        str.add("قرآن کی ترجیح:\n" +
                "\n" +
                "غلات (مبالغہ آمیز) نے انحراف میں سے ایک انحراف کیا جس سے دوسرے اسلامی فرقوں نے شیعوں پر حملہ کیا ، یہ قرآن کی ردوبدل کا مسئلہ تھا ۔سنن بھی ان کی کتابوں میں غیر اخلاقی احادیث کے اضافے کی وجہ سے اس سے متاثر ہیں۔\n" +
                "\n" +
                "اس الزام کے خلاف ، شیعہ کے ائمہ (ع) نے ہمیشہ قرآن کو فوقیت دی ہے اور قرآن کے مخالف کسی حدیث کو باطل اور باطل سمجھا ہے۔\n" +
                "\n" +
                "ابن شعبہ الحارانی کے بیان کردہ ایک وسیع مقالے میں ، امام الہادی (ع) نے قرآن کی ترجیح پر سختی سے تاکید کی اور اسے احادیث کی تشخیص اور مستند افراد کو غیر مہذب سے ممتاز کرنے کے لئے ایک درست معیار کے طور پر ذکر کیا۔ انہوں نے واضح طور پر قرآن مجید کو واحد عبارت قرار دیا جس کا حوالہ تمام اسلامی گروہوں نے کیا ہے۔\n" +
                "\n" +
                "ایک اور متنازعہ مسئلے کے متعلق ، امام (ع) نے قرآن کا حوالہ دیا اور سب کو اس سے اتفاق کرنے پر راضی کردیا۔ [] 34] العیاشی نے ایک حدیث نقل کرتے ہوئے کہا ، \"ابو جعفر اور ابو عبد اللہ ، ان کے ساتھ ہو ، انہوں نے کہا کہ ہم کسی بھی چیز کو قبول نہیں کرتے جب تک کہ وہ خدا کی کتاب اور اس کے رسول (ص) کے طرز عمل سے متفق نہ ہوں\" [ 35]\n" +
                "\n" +
                "\n" +
                "\n" +
                "تخلیق قرآن کا سوال:\n" +
                "\n" +
                "تیسری / نویں صدی کا ایک سب سے اہم مسئلہ جس نے سنی مکتب فکر کو قابض رکھا ، وہ یہ تھا کہ قرآن کے ہودت اور قدم (تخلیق یا ابدیت) کے معاملے پر تنازعہ جس نے ان میں تفریق و فرقے پیدا کردیئے۔\n" +
                "\n" +
                "شیعہ اس مسئلے پر ائمہ (ع) کی ہدایت پر عمل کرتے ہوئے خاموش رہے۔ ایک خط میں ، امام الہادی (ع) نے شیعوں میں سے ایک کو حکم دیا کہ وہ اس مسئلے پر رائے نہ دیں اور قرآن کی تخلیق یا ابدیت کے متعلق کسی بھی رائے کے ساتھ کوئی تعصب ظاہر نہ کریں۔ [] 36]\n" +
                "\n" +
                "اس سے شیعوں کو ایسی بے کار دلائل میں مبتلا نہ ہونے میں مدد ملی۔" +
                "" +
                "\n\n\n\n\n" +
                "الکلام (الہیات):\n" +
                "\n" +
                "مختلف شیعہ فرقوں کے درمیان مختلف آراء نے ائمہ کرام (ع) کو لوگوں کو ہدایت دینے کی ہدایت کی۔ اہل تشیع مختلف علاقوں میں بکھرے ہوئے تھے جس کا مطلب تھا کہ ہر ایک دفعہ بعد میں ، وہ دوسروں کی رائے سے متاثر ہو گئے جس نے سابقہ \u200B\u200Bمسئلے میں مزید اضافہ کردیا۔ اس الجھن میں ، غیر شیعہ گروہوں اور شیعہ مخالف حزب اختلاف نے ان اختلافات کو بھڑکایا اور جھوٹے انداز میں ان سے واقعی کے مقابلے میں زیادہ گہرا اندازہ لگایا۔ الکششی کی ایک روایت ہے جس میں واضح طور پر ایک شخص کو ذکر کیا گیا ہے کہ اس نے تین فرقوں کا نام ذکریا ، عماریہ ، اور یافورییا تھا اور ان کو امام الصادق (ع) کے ہر بڑے صحابہ سے منسوب کیا (یعنی زورا b بی۔ اے) 'یان ،' عمار السبیطی ، اور ابن ابی یافور)۔ [] 37]\n" +
                "\n" +
                "شیعوں کے ائمہ (ا) بعض اوقات سوالات کا سامنا کرتے تھے ، ان میں سے کچھ شیعہ علماء کے مابین یہ اختلافات تھے ، جو بعض اوقات محض بحث و مباح یا کبھی گہری ہوتے تھے اور ائمہ (ع) کو ان امور میں جج بننا پڑتا تھا۔\n" +
                "\n" +
                "ان مسائل میں سے ایک خدائی صفات کا تسبیح اور تنزیح تھا۔ ابتداء ہی سے ، شیعہ کے ائمہ (ع) نے تنزح کے نظریہ کی حقیقت پر اصرار کیا۔\n" +
                "\n" +
                "ہشام کی گفتگو بی۔ الحکم اور ہشام بی۔ تاشبیح اور تنزیح پر سلیم کی وجہ سے شیعوں اور ائمہ کے درمیان اختلافات پیدا ہوگئے (ا) ان موضوعات کے سلسلے میں اکثر سوالات کا سامنا کرنا پڑتا ہے۔\n" +
                "\n" +
                "چنانچہ تنزیز کے بارے میں امام الہادی (ع) سے اکیس سے زیادہ روایتیں ملتی ہیں ، جن میں سے کچھ بہت جامع ہیں اور ان سب سے یہ اشارہ ہوتا ہے کہ امام (ع) نے تنزح کی منظوری دی۔ [] 38]\n" +
                "\n" +
                "پیش گوئی اور آزادانہ مرضی کے بارے میں ائمہ کرام (ع) کی رائے کے بارے میں ، امام الہادی (ع) کا ایک جامع مقالہ موجود ہے۔ اس مقالے میں ، شیعہ مذہبی اصول پیش گوئی اور آزادانہ ارادے سے متعلق ، قرآن اور حدیث کی تشریح کے مطابق ، \"لا جبر وا لا طفوید بال امرون بین الامرین ،\" کی وضاحت کی گئی ہے۔ آزاد ارادیت ، لیکن معاملہ دونوں امور کے مابین ہے) امام صادق (ع) سے روایت کیا [39]\n" +
                "\n" +
                "امام الہادی (ع) کی طرف سے احتجاج کے عنوان سے نقل کی گئی روایتوں میں ، ان میں سے بیشتر پیش گوئی اور آزادانہ مرضی کے بارے میں ہیں۔" );
        str.add("دعاس اور زیارہ\n" +
                "\n" +
                "امام الہادی (ع) نے دعائے مغفرت (زیارت اور زبانی) تشریف لانے کے ذریعہ شیعہ مسلمانوں کو شیعہ تعلیمات سے آگاہ کرنے اور ان سے واقف کرنے میں بڑی کوشش کی۔ اس طرح کے دعووں کو مختلف طریقوں سے ، کچھ سیاسی اور معاشرتی نکات کا ذکر کرنے کے ساتھ ساتھ خدا سے دُعا کرنا بھی ہے۔ یہ نکات شیعہ کے سیاسی دائرہ میں بہت زیادہ اثر و رسوخ رکھتے تھے اور شیعہ معاشرے میں باقاعدگی سے کچھ تصورات کو متاثر کرتے تھے۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "الزیارات الجامع al الکبیرہ:\n" +
                "\n" +
                "یہ زیارت (تشریف فرما) شیعوں کی تعلیمات کا ایک عمدہ نصاب ہے اور اہل بیت (ع) کے منصب کا تعارف کرواتی ہے جسے شیعوں کی درخواستوں کے بعد امام الہادی (ع) نے شروع کیا تھا۔");
        str.add("کچھ اطلاعات کے مطابق ، المعتز العبادی نے امام الہادی (ع) کو زہر دیا اور\n" +
                "اسے شہید کردیا۔ [51] امام الہادی (ع) کے جنازے میں لوگوں نے خود کو تھپڑ مارا اور ان کے چہروں کو نوچ ڈالا۔ انہوں نے امام کو لیا\n" +
                "اس نے اپنے گھر سے لاش نکالی اور موسیٰ ابن باغہ (عباسی فوج کا کمانڈر) کے گھر کے سامنے رکھ دیا۔ جب معتز al العبسی نے انہیں دیکھا تو اس نے امام (ع) کے جسم پر نماز جنازہ ادا کرنے کا فیصلہ کیا۔ اس کے بعد اس نے حکم دیا کہ لوگ جسم کو زمین پر رکھیں اور انہوں نے امام (ع) کے جسم سے پہلے نماز پڑھائی ، حالانکہ امام الحسن الاسکری (ع) اور کچھ شیعہ اس سے قبل بھی امام (ع) کے جسم کے ذریعہ نماز پڑھ چکے تھے آخری رسومات سے پہلے اس کے بعد ، انہوں نے امام (ع) کو گھروں میں سے ایک میں دفن کردیا جس میں وہ قید تھا۔ یہ ایسا ہی تھا\n" +
                "بہت بڑا ہجوم ، کہ امام الاسکری (ع) بڑی تعداد میں ڈیکلٹی کے ساتھ مجمع میں چلے گئے۔ پھر ، ایک نوجوان امام (ع) کے لئے ایک گھوڑا لے کر آیا اور لوگ اس کے ساتھ اس کے گھر چلے گئے۔ []२]");

        udesc.add(str);



        etitleH.add("Imam al-Hasan ibne Ali al-Askari (A)");
        utitleH.add("امام الحسن ابن علی الاسکری"
                +" (ع)");

        img=new ArrayList<>();

        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);
        img.add(R.drawable.imam1);

        images.add(img);


        str=new ArrayList<>();

        str.add("Biography In Brief");
        str.add("Life");
        str.add("Imam's (a) Representatives");
        str.add("Scholarly Life");
        str.add("Periods of Detention");
        str.add("Martyrdom");

        etitle.add(str);

        str=new ArrayList<>();
        str.add("Biography In Brief\n");
        str.add("Life\n");
        str.add("Imam's (a) Representatives");
        str.add("Scholarly Life");
        str.add("Periods of Detention\n" +
                "\n");
        str.add("Martyrdom\n");



        utitle.add(str);



        str=new ArrayList<>();
        str.add("Imam al-Hasan ibne Ali al-Askari (A)\n"
                +"(امام الحسن ابن علی الاسکری (ع))"+
                "\n"+

                " was the 11th Imam of Twelver Shi'a and the father of Imam al-Mahdi (a). He was given the title, Imam al-Askari(يﺮﮑﺴﻌﻟا مﺎﻣا), because he was forced to reside in Samarra which was also known as \"Askar\" (a military camp or town). His other titles include Ibn al-Rida,al-Hadi, al-Naqi, al-Zaki, al-Rafiq and al-Samit.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Teknonym:\tAbu Muhammad\n" +
                "\n" +
                "Born:\tRabi' II 8, 232/December 2, 846\n" +
                "\n" +
                "Birthplace:\tMedina\n" +
                "\n" +
                "Imamate:\tFrom Rajab 3, 254/June 28, 868(for 6 years)\n" +
                "\n" +
                "Martyrdom:\tRabi' I 8, 260/January 1, 874 in Samarra\n" +
                "\n" +
                "Cause of  Martyrdom:\tBy poisoning\n" +
                "\n" +
                "Successor:\tMuhammad b. al-Mahdi (a)\n" +
                "\n" +
                "Father:\tAli b. Muhammad (a)\n" +
                "\n" +
                "Mother:\tHudayth\n" +
                "\n" +
                "Brother(s):\tMuhammad, al-Husayn, Ja'far\n" +
                "\n" +
                "Spouse(s):\tNarjis\n" +
                "\n" +
                "Titles:\tIbn al-Rida (son of al-Rida), al-Naqi\n" +
                "(the pure), al-Hadi (the guide)\n" +
                "\n" +
                "\n" +
                "\n" +
                "Severe restrictions on Imam al-Askari's (a) life made him choose agents to communicate with the Shi'a. Uthman b. Sa'id was one of his special agents who became the first special deputy of Imam al-Mahdi (a) upon the beginning of his occultation after Imam al-Askari (a) was martyred.\n" +
                "\n" +
                "Imam al-'Askari (a) was martyred on the 8th of Rabi I, 260/874. He was buried in the same house where his father had been buried. The holy shrine of al-'Askariyyayn was attacked and destroyed two times by terrorists.\n" +
                "\n" +
                "Many hadiths have been narrated from Imam al-Askari (a) on different topics such\n" +
                "as exegesis of the Qur'an, ethics, jurisprudence, theology, supplications, and Ziyarahs.\n" +
                "\n");

        str.add("Birth:\n" +
                "\n" +
                "According to the majority of sources, he was born in Medina,[15] but other sources suggest that he was born in Samarra.[16] And according to the majority of early Imami sources, he was born in Rabi' II, 232\n" +
                "(December 846).[17] The same date was mentioned in a hadith from Imam al-Hasan al-Askari as well.[18] According to other Imami and Sunni sources, he was born in 231/845.[19] In his Masar al-Shi'a, al-Shaykh al-Mufid believes that the Imam was born on Rabi' II 10, 232/December 4, 846.[20] However, this account was dismissed in the 6th/12th century when the majority of the Imamiyya believed that he was born on Rabi' II 8, 232/December 2,846.[21]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Wife and Children:\n" +
                "\n" +
                "According to the famous report, Imam al-Askari (a) never married and his lineage\n" +
                "continued only through a concubine who was the mother of Imam al-Mahdi (a).[30]\n" +
                "Different sources have mentioned the name of the mother of Imam al-Mahdi (a) differently. It has been mentioned in sources that Imam al-'Askari (a) had several Roman, Turk and Sicilian servants and maids[31]; Maybe this difference of opinion about the name of the mother of Imam al-Mahdi (a) was because of having several servants or in order to hide the birth of Imam al-Mahdi (a).[32]\n" +
                "Acording to the majority of shi'a sources the only child of Imam al-Askari (a) is Imam al-Mahdi (a) named \"Muhammad\".[33] Also some sunni scholar such as Ibn Athir, Shablanji and Ibn Sabbaq al-Maliki mentioned \"Muhammad\" as a child of Imam al-Askari.[34]\n" +
                "\n" +
                "There are other reports about the children of Imam al-'Askari (a) as well. Some have listed three sons and three daughters for him.[35] Al-Khasibi has listed two sisters named \"Fatima\" and \"Dalala\" for Imam al-Mahdi (a)[36] and Ibn Abi l-Thalj has mentioned a brother called Musa and two sisters called Fatima and 'A'isha (or Umm Musa) for Imam al-Mahdi (a).[37] However, in some references of lineage, the above-\n" +
                "mentioned names are brothers and sisters of Imam al-Askari[38] which may have been mistaken with his children. On the contrary, some Sunni scholars such as Ibn Jarir al-Tabari, Yahya b. Sa'id and Ibn Hazm believed that Imam al-'Askari (a) did not have any children at all.[39]\n" +
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
                "that hadith from Imam al-Askari (a) in Mecca.[41] Except this trip to Mecca, some sources have also reported his journey to Jurjan as well.[42]\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("Strict limitations of the caliphs on the life of Imam (a) made him benefit from agents to communicate with Shi'a, among whom was 'Aqid, the special servant of Imam (a) who was raised by Imam (a) and delivered many of his letters to Shi'a.[56] Another agent was a person whose kunya was Gharib Abu al-Adyan who was another servant of Imam (a) and delivered some of the letters.[57] However, Uthman b. Sa'id was a particular person in some Twelver Shi'a sources who was called Bab (representative and the connection with Imam (a). Upon entering the age of Minor Occultation after Imam al-'Askari (a) was martyred, 'Uthman b. Sa'id became the first special deputy of Imam al-Mahdi (a).[58]\n" +
                "\n" +
                "\n");


        str.add("Shi'a Teachings:\n" +
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
                "\n");


        str.add("As it was mentioned previously, taking Imam al-Hadi (a) with Imam al-'Askari (a) to Samarra by the order of al-Mutawakkil, by itself meant detention of these two Imams (a) in that city in order to control them and their contacts with Shi'a. In some cases of their detention, they were bothered more, especially when certain movements emerged which were considered threats to the government, Imam al-'Askari (a) and some of his companions were imprisoned. There are many reports about detention of Imam al-'Askari (a). In al-Awsiya', al-Saymuri has reported that, \"I saw the handwriting of Abu Muhammad al-Askari (a) when he (a) was coming out of the prison of al-Mu'tamid and he (a) had written this verse of the Qur'an,“ They desire to put out the light of Allah with their mouths, but Allah shall perfect His light though the faithless should be averse. ”\n" +
                "— Qur'an, 61:8\n" +
                "\n" +
                "Al-Shaykh al-Mufid narrated from Muhammad b. Isma'il al-'Alawi, \"Imam al-Askari (a) was prisoned with Ali b. Awtamash (or Barmash) who was among serious enemies of the Ahl al-Bayt (a). He\n" +
                "was ordered to be harsh on Imam (a) as much as he could, but later after meeting Imam (a), he departed Imam (a) when he had learned about the greatness of Imam\n" +
                "more than anyone else and praised him greatly.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        str.add("Imam al-Askari was martyred on Rabi' I 8, 260/January 1, 874 during the reign of Mu'tamid al-Abbasi at the age of 28.[22]\n" +
                "\n" +
                "There are accounts of his martyrdom in Rabi' II and Jumada I as well.[23] According to al-Tabrisi in I'lam al-wara, many Imami scholars maintain that Imam al-Askari was martyred by poisoning. They appeal to the hadith, \"I swear to God that there is none of us (i.e. the Imams) who is not murdered and martyred.\"[24] Some historical reports imply that the two caliphs before al-Mu'tamid were also seeking to murder the Imam. According to a hadith, al-Mu'tazz al-'Abbasi ordered his personal security guard to murder the Imam on his way to Kufa, but the plan failed because it was leaked to people.[25] According to another report, Muhtadi al-Abbasi also decided to martyr the Imam in the prison, but the plan failed because his reign was over.[26] Imam al-Askari is buried in his own house in Samarra, where Imam al-Hadi had also been buried.[27] According to Abd Allah b. Khaqan (one of al-Mu'tamid al-Abbasi's viziers),[28] when Imam al-Askari was martyred, bazars were shut down, and Banu Hashim, prominent figures, statesmen, and other people attended his funeral.[29]\n" +
                "\n");

        edesc.add(str);

        str=new ArrayList<>();
        str.add("امام الحسن ابن علی ال عسکری (ع)  شیعہ کے گیارہویں امام اور امام المہدی (ع) کے والد تھے۔ انہیں امام ال عسکری کا لقب دیا گیا تھا ، کیونکہ انہیں سامرا میں رہائش پذیر ہونا پڑا تھا جسے \"عسکر\" (ایک فوجی کیمپ یا قصبہ) بھی کہا جاتا تھا۔ اس کے دوسرے لقبوں میں ابن الردہ ، الہادی ، النقی ، الزکی ، الرفیق اور السمیت شامل ہیں۔\n\n"+

                "\n\nٹیکنوم: ابو محمد\\n\"" +
                "ولادت: ربیع دوم 8 ، 232 / دسمبر 2 ، 846\n" +
                "\n" +
                "جائے پیدائش: مدینہ\n" +
                "\n" +
                "امامت: رجب 3 ، 254/28 جون ، 868 (6 سال تک) سے\n" +
                "\n" +
                "شہادت: ربیع اول 8 ، 260 / جنوری 1 ، 874 سمررہ میں\n" +
                "\n" +
                "شہادت کی وجہ: زہر اگلنے سے\n" +
                "\n" +
                "جانشین: محمد بی۔ المہدی (ا)\n" +
                "\n" +
                "والد: علی ابن محمد (ا)\n" +
                "\n" +
                "ماں: حدایت\n" +
                "\n" +
                "بھائی (ز): محمد ، الحسین ، جعفر\n" +
                "\n" +
                "شریک حیات: نرجیس\n" +
                "\n" +
                "القابات: ابن الریدہ (ولد الردہ) ، النقی\n" +
                "(خالص) ، الہادی (ہدایت نامہ)\n" +
                "\n" +
                "\n" +
                "\n" +
                "امام الاسکری (ع) کی زندگی پر سخت پابندیوں کی وجہ سے وہ شیعہ سے بات چیت کرنے کے لئے ایجنٹوں کا انتخاب کرتے تھے۔ عثمان بی۔ سعید ان کے خصوصی ایجنٹوں میں سے ایک تھا جو امام السکری (ع) کے شہید ہونے کے بعد اپنے خفیہ خیال کے آغاز کے بعد ہی امام مہدی (ع) کے پہلے خصوصی نائب بنے۔\n" +
                "\n" +
                "امام السکری (ا) ربیع اول ، 260/874 کی 8 تاریخ کو شہید ہوئے۔ اسے اسی مکان میں دفن کیا گیا تھا جہاں اس کے والد کو دفن کیا گیا تھا۔ دہشتگردوں کے ذریعہ العسکریائیین کے مقدس مزار پر دو بار حملہ کیا گیا تھا اور اسے تباہ کیا گیا تھا۔\n" +
                "\n" +
                "بہت ساری احادیث امام الاسکری (ا) سے مختلف موضوعات پر نقل ہوئی ہیں\n" +
                "جیسا کہ قرآن مجید ، اخلاقیات ، فقہ ، الہیات ، دعائیں ، اور زیراہح کی تفسیر ہیں۔");


        str.add("پیدائش:\n" +
                "\n" +
                "اکثریت کے ذرائع کے مطابق ، وہ مدینہ منورہ میں پیدا ہوا تھا ، [15] لیکن دوسرے ذرائع سے معلوم ہوتا ہے کہ وہ سامرا میں پیدا ہوا تھا۔ [16] اور ابتدائی امامی وسائل کی اکثریت کے مطابق ، وہ ربیع دوم ، 232 میں پیدا ہوا تھا\n" +
                "(دسمبر 846)۔ [17] اسی تاریخ کا ذکر امام الحسن ال عسکری from کی ایک حدیث میں بھی ہے۔ [18] دوسرے امامی اور سنی ذرائع کے مطابق ، وہ 231/845 میں پیدا ہوا تھا۔ [19] اپنے مسر الشیعہ میں ، الشیخ الموطف کا عقیدہ ہے کہ امام ربیع ثانی 10 ، 232/4 دسمبر ، 846 کو پیدا ہوا تھا۔ [20] تاہم ، اس اکاؤنٹ کو 6/12 ویں صدی میں اس وقت مسترد کردیا گیا جب امامیہ کی اکثریت کا خیال تھا کہ وہ ربیع 2 ، 8 ، 232 / دسمبر 2،846 کو پیدا ہوا تھا۔ [21]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "بیوی اور بچے:\n" +
                "\n" +
                "مشہور رپورٹ کے مطابق ، امام الاسکری (ع) نے کبھی شادی نہیں کی اور اس کا نسب\n" +
                "صرف ایک محبوبہ کے ذریعہ جاری رہا جو امام مہدی (ع) کی والدہ تھیں۔ [30]\n" +
                "مختلف ذرائع نے امام مہدی (ع) کی والدہ کے نام کا تذکرہ مختلف طور پر کیا ہے۔ ذرائع میں یہ ذکر کیا گیا ہے کہ امام العسکری (ا) کے متعدد رومی ، ترک اور سیسی لونڈی اور نوکرانی تھے []१]۔ ہوسکتا ہے کہ امام مہدی (ع) کی والدہ کے نام کے بارے میں یہ اختلاف اس وجہ سے تھا کہ کئی نوکر تھے یا امام مہدی (ع) کی ولادت کو چھپانے کے لئے۔ .\n" +
                "شیعہ وسائل کی اکثریت کے مطابق امام السکری (ا) کا اکلوتا بچہ امام المہدی (ا) ہے جس کا نام \"محمد\" ہے۔ [] 33] نیز کچھ سنی عالم جیسے ابن کثیر ، شبلنجی اور ابن سباق المالکی نے \"محمد\" کا ذکر امام السکری کے بچے کی حیثیت سے کیا ہے۔ [] 34]\n" +
                "\n" +
                "امام السکری (ع) کے بچوں کے بارے میں بھی دوسری اطلاعات ہیں۔ کچھ نے اس کے لئے تین بیٹے اور تین بیٹیاں درج کیں۔  الخسبی نے امام مہدی (ع)  کے لئے \"فاطمہ\" اور \"دلالہ\" کے نام سے دو بہنوں کی فہرست دی ہے اور ابن ابی ایل تھلج نے موسیٰ نامی ایک بھائی اور دو بہنوں کا نام فاطمہ اور عائشہ (یا عائشہ) بتایا ہے۔ ام موسیٰ) امام مہدی (ع) کے لئے۔ [37] تاہم ، نسب کے کچھ حوالوں میں ، مندرجہ بالا-\n" +
                "مذکور نام امام السکری [38] کے بھائی اور بہنیں ہیں جن کا ان کے بچوں کے ساتھ غلطی ہوسکتی ہے۔ اس کے برعکس ، کچھ سنی علماء جیسے ابن جریر الطبری ، یحییٰ بی. سعید اور ابن حزم کا عقیدہ تھا کہ امام العسکری (ع) کی کوئی اولاد نہیں ہے۔ " +
                "سمارا میں رہنا:\n" +
                "\n" +
                "امام الحسن السکری (ا) کو 233/847 میں اپنے والد کے ہمراہ سمرہ لایا گیا تھا جب وہ ایک سال کا تھا اور اپنی زندگی کے آخری وقت تک وہیں مقیم رہا۔ [40]\n" +
                "\n" +
                "امام الحسن ال عسکری (ع) اپنی زندگی کا بیشتر حصہ سمارہ میں بسر کرتے تھے اور مشہور ہے\n" +
                "کہ وہ (ع) واحد امام تھے جو حج نہیں گئے تھے۔ تاہم ، عیون اخبر الرڈا میں\n" +
                "اور کشف الغومہ ، ایک حدیث ہے ، جس کے راوی کہتے ہیں کہ اس نے سنا ہے\n" +
                "جو حدیث مکہ میں امام السکری (ع) سے ہے۔  مکہ کے اس سفر کے علاوہ ، کچھ ذرائع نے ان کے جورجن سفر کی اطلاع بھی دی ہے۔ ");
        str.add("امام (ع) نمائندے\n" +
                "\n" +
                "\n" +
                "امام (ع) کی زندگی پر خلفائے راشدین کی سخت پابندیوں نے شیعوں سے بات چیت کرنے کے ل انہیں ایجنٹوں سے فائدہ اٹھایا ، ان میں سے عاکد ، امام (ع) کا خاص خادم تھا جسے امام (ع) نے پالا تھا اور بہت سے لوگوں کو نجات دلائی تھی  شیعہ کو اپنے خطوط ایک اور ایجنٹ وہ شخص تھا جس کا کنیا غریب ابوالعدان تھا جو امام (ع) کا دوسرا خادم تھا اور اس نے کچھ خطوط پیش کیے تھے۔ تاہم ، عثمان بی۔ سعید کچھ ٹولور شیعہ ذرائع میں ایک خاص شخص تھا جسے باب (نمائندہ اور امام (ع)) سے تعل ق کہا جاتا تھا۔ امام العسکری (ع) کے شہید ہونے کے بعد معمولی دھندے میں داخل ہونے پر ، عثمان ب. سعید امام المہدی (ع) کے پہلے خصوصی نائب بن گئے۔ ");
        str.add("شیعہ تعلیمات:\n" +
                "\n" +
                "اس وقت کے نئے امام (ع) کے بارے میں پیچیدگیوں اور ابہاموں کے مطابق ، یہ امام الاسکری (ع) کی تقاریر اور خطوط میں دیکھا جاسکتا ہے ، جن کا ذکر انہوں نے کیا ، زمین خدا کے ثبوت سے باطل نہیں ہوگی [61] اور یہ کہ اگر امامت کاٹ دی گئیں تو ، زمین پر خدا کے امور میں پریشانی ہوگی۔ []२] آپ (ع) نے یہ بھی کہا کہ زمین پر خدا کا ثبوت ایک ایسی نعمت ہے جو خدا نے مومنین کو عطا کیا ہے اور انہیں اس ہدایت سے نوازا ہے۔ [] 63]\n" +
                "\n" +
                "ایک اور تعلیم ، جسے شیعہ پر دباؤ کی وجہ سے بار بار امام (ع) کی تقاریر میں دیکھا جاتا ہے ، وہ انہیں صبر کی طرف راغب کر رہا ہے اور راحت پر یقین رکھتا ہے اور اس کا انتظار کر رہا ہے۔ [] 64] نیز ، ان کی احادیث میں ، شیعہ معاشرے کے اندرونی تعلقات کا احترام کرنے اور مذہبی بھائیوں کے ساتھ شراکت کرنے پر خصوصی زور دیا گیا ہے۔ [] 65]\n" +
                "\n" +
                "\n" +
                "\n" +
                "قرآن کی تفسیر:\n" +
                "\n" +
                "قرآن کی ترجمانی ان سرگرمیوں میں سے ایک تھی امام الحسن الاسکری (ا)\n" +
                "اس کی بہت پرواہ کی کہ قرآن کی تفسیر (ایک شیعہ کے سب سے قدیم ورثہ ورثہ میں شامل) پر ایک وسیع متن کی طرف منسوب کیا گیا ہے۔ یہاں تک کہ اگر یہ وابستگی درست نہیں ہے تو ، یہ بھی یاد رکھنا چاہئے کہ مستثنی بحثوں پر امام (ع) کے زور نے اس وابستگی کی بنیاد بنا دی۔\n" +
                "\n" +
                "\n" +
                "\n" +
                "الہیات اور عقائد:\n" +
                "\n" +
                "امام الحسن ال عسکری (ع) نے شیعہ کی قیادت اس وقت سنبھالی جب اس سے قبل اپنے زمانے سے کئی دہائوں قبل ٹولور شیعہ کے درمیان کچھ نظریاتی مسائل پیدا ہوئے تھے اور کچھ اس وقت نمودار ہوئے تھے۔ مثال کے طور پر ، ایک\n" +
                "گفتگو کے عنوانات \"خدا کے مجسمے کو مسترد کرنا\" تھے جس کا تذکرہ کچھ سال پہلے ہوا تھا اور ہشام بی کے مابین کچھ اختلافات تھے۔ حکام و ہشام بی۔ سلیم ، دو ممتاز ساتھی آئمہ.\n" +
                "(ا)۔ امام الاسکری (ع) کے وقت یہ اختلاف اتنا سنگین ہوگیا کہ سہل بی۔ زیاد العادامی نے امام الحسن الاسکری (ع) کو خط لکھ کر ہدایت طلب کی۔\n" +
                "\n" +
                "امام الاسکری (ع) نے ان کو خدا کے جوہر کے بارے میں گہری بحث و مباحثہ کرنے سے منع کیا ، قرآن کی کچھ آیات کا تذکرہ کیا اور کہا: \"خدا ایک ہے اور انوکھا ہے ge نہیں پیدا ہوتا ہے ، نہ ہی اس کا پیدا ہوا تھا اور کچھ بھی یکساں نہیں ہے۔ اس کے ل. وہ خالق ہے اور پیدا نہیں کیا ہے۔ جو کچھ وہ چاہتا ہے تخلیق کرتا ہے یا مجسم نہیں… کچھ بھی اس کی طرح نہیں ہے اور وہ سنتا اور دیکھ رہا ہے۔ [] 66]" +
                "\n\n\n\n" +
                "قانون کا علم:\n" +
                "\n" +
                "حدیث کے مطالعے میں ، امام الحسن الاسکری (ع) کے لئے مذکور عنوانات میں سے ایک \"فقیہ\" ہے ، [] 67] جس کے ساتھ وہ (ا) خاص طور پر اپنے ساتھیوں کو جانا جاتا تھا۔ ان کی کچھ احادیث فقہ اور اس کی مختلف شاخوں کے بارے میں ہیں۔ چونکہ فقہ کے بارے میں مذہب کی تنظیم اس سے پہلے امام الصادق (ع) کے زمانے میں کی گئی تھی اور پھر اس کو کمال کی طرف بڑھا دیا گیا تھا ، لہذا امام الحسن الاسکری (ع) نے زیادہ تر ثانوی امور کے بارے میں تبادلہ خیال کیا جو سامنے آئے یا تھے اس کی اہم وجہ کچھ رمضان المبارک کا آغاز اور خمس کے بارے میں گفتگو۔");
        str.add("جیسا کہ اس کا ذکر پہلے ہوا ہے ، الموتواک کے حکم سے امام الہادی (ع) کو امام الاسکری (ا) کے ہمراہ سمرہ لے جانا ، خود اس شہر میں ان دو ائمہ (ع) کی نظربند ہونا تھا۔ ان پر اور شیعہ سے ان کے رابطوں پر قابو پالیں۔ ان کی نظربندی کے کچھ معاملات میں ، انہیں زیادہ پریشان کیا گیا ، خاص طور پر جب کچھ ایسی تحریکیں سامنے آئیں جو حکومت کے لئے خطرہ سمجھے جاتے تھے ، امام الاسکری (ع) اور ان کے کچھ ساتھی قید تھے۔ امام الاسکری (ع) کی نظربندی کے بارے میں بہت ساری اطلاعات ہیں۔ الاوسیا میں ، الصموری نے روایت کیا ہے کہ ، \"میں نے ابو محمد السکری (ع) کی دستی تحریر اس وقت دیکھی جب وہ (ا) معتمد کی جیل سے باہر آرہے تھے اور ان (ع) کو قرآن کی اس آیت میں لکھا ہے ، \"وہ اپنے منہ سے اللہ کی روشنی ڈالنے کی خواہش رکھتے ہیں ، لیکن اللہ اپنا نور پوری کردے گا حالانکہ کافروں کو ٹل جانا چاہئے۔\"\n" +
                "- قرآن ، 61: 8\n" +
                "\n" +
                "الشیخ المفید نے محمد بن سے روایت کیا۔ اسماعیل العلوی ، \"امام الاسکری (ع) کو علی ابن اوتماش (یا برماش) کے ساتھ قید کیا گیا تھا جو اہل بیت (ع) کے شدید دشمنوں میں شامل تھے۔\n" +
                "جتنا ہو سکے امام (ع) پر سختی کرنے کا حکم دیا گیا تھا ، لیکن بعد میں امام (ع) سے ملنے کے بعد ، جب انہوں نے امام (ع) کی عظمت کے بارے میں جان لیا تو وہ امام (ع) سے رخصت ہوگئے۔\n" +
                "کسی اور سے زیادہ اور اس کی بہت تعریف کی۔");
        str.add("امام السوری 28 ربیع الاول 8 ، 260 / یکم جنوری 874 ء کو معتمد عباسی کے دور میں 28 سال کی عمر میں شہید ہوگئے تھے۔ [22]\n" +
                "\n" +
                "ربیع ثانی اور جمعہ اول میں بھی ان کی شہادت کے واقعات ہیں۔ [23] اسلام الوارہ میں التبریسی کے مطابق ، بہت سارے امامی علماء یہ کہتے ہیں کہ امام ال عسکری کو زہر دے کر شہید کیا گیا تھا۔ انہوں نے حدیث سے اپیل کی ہے ، \"میں خدا سے قسم کھاتا ہوں کہ ہم میں سے کوئی (یعنی ائمہ) نہیں ہے جو قتل اور شہید نہیں ہوا ہے۔\" [24] کچھ تاریخی اطلاعات سے یہ معلوم ہوتا ہے کہ المعتظم سے پہلے کے دو خلیفہ بھی تلاش کر رہے تھے امام کو قتل کرنا۔ ایک حدیث کے مطابق ، معتز al العبسی نے اپنے ذاتی سیکیورٹی گارڈ کو کوفہ جاتے ہوئے امام کو قتل کرنے کا حکم دیا تھا ، لیکن یہ منصوبہ ناکام ہو گیا کیوں کہ یہ لوگوں کو لیک کیا گیا تھا۔ [25] ایک اور رپورٹ کے مطابق ، محدثی عباسی نے بھی قید میں ہی امام کو شہید کرنے کا فیصلہ کیا تھا ، لیکن یہ منصوبہ ناکام ہو گیا کیوں کہ اس کا دور ختم ہوگیا تھا۔ [26] امام السوری کو سمارا میں واقع اپنے ہی گھر میں سپرد خاک کیا گیا ہے ، جہاں امام الہادی کو بھی دفن کیا گیا تھا۔ [27] عبد اللہ کے مطابق ب. خاقان (المعتمد al عباسی کے ایک جادوگر) ، [२]] جب امام السکری کو شہید کیا گیا تو ، بازاروں کو بند کردیا گیا ، اور بنو ہاشم ، ممتاز شخصیات ، ریاست کار ، اور دیگر افراد ان کے جنازے میں شریک ہوئے۔ [29]");


        udesc.add(str);



        for(int i=0 ;i<etitleH.size();i++){
            id.add(i);
            for(int j=0;j<edesc.get(i).size();j++)
            {
                String res=edesc.get(i).get(j);

                res=res.replaceAll("\\[[^\\[]*]\n", "");
                //res=res.replaceAll("\\[.*?]", "");
                res=res.replace("[]", "");
                res=res.replace("[", "");
                res=res.replace("]", "");
               // if(i==13 && j==1) Log.d("myapp1",res);
                edesc.get(i).set(j,res);

                res=udesc.get(i).get(j);

                res=res.replaceAll("\\[[^\\[]*]\n", "");
                //res=res.replaceAll("\\[.*?]", "");
                res=res.replace("[]", "");
                res=res.replace("[", "");
                res=res.replace("]", "");
                // if(i==13 && j==1) Log.d("myapp1",res);
                udesc.get(i).set(j,res);

            }
        }




        final RecyclerView recyclerView=findViewById(R.id.recycle);
       // Toast.makeText(BioActivity.this,"Hi Syed",Toast.LENGTH_LONG).show();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<CountryItem> arr;
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
