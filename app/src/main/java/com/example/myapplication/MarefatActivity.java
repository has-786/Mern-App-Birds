package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.myapplication.adapterMarefat.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MarefatActivity extends AppCompatActivity {
    public static final String MSG="com.example.myapplication.MAREFAT";
    public static ArrayList<String> etitle=new ArrayList<>();
    public static ArrayList<String> utitle=new ArrayList<>();

    public static ArrayList<String> esrc=new ArrayList<>();
    public static ArrayList<String> usrc=new ArrayList<>();

    public static ArrayList<String> edetails=new ArrayList<>();
    public static ArrayList<String> udetails=new ArrayList<>();
    public static ArrayList<Integer> id=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);
        getSupportActionBar().setTitle("Marefat of Imam"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.green));



        final RecyclerView recyclerView=findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        etitle=new ArrayList<>();
        utitle=new ArrayList<>();

        esrc=new ArrayList<>();
        usrc=new ArrayList<>();

        edetails=new ArrayList<>();
        udetails=new ArrayList<>();
        id=new ArrayList<>();



        etitle.add("Importance of Recognition of Imam");
        esrc.add("Al-Islam.org");
        edetails.add("The belief of Imamate is that important pillar of Islamic belief, without which the religious structure remains incomplete. The acceptance of all actions depends on the belief in Imamate. When the Holy Prophet (s.a.w.a.) commenced his mission with Daawat al-Zul Asheerah, along with the call for Divine Monotheism, proclamation of his own messengership, he (S) also announced the mastership and wilayat of Amir’ul-Mu’minin (a.s.).\n" +
                "\n" +
                "He invited one and all for accepting this invitation. From then onwards, the Holy Prophet (S) kept informing and announcing the people about Imamate and Caliphate. Finally, on 18th Zilhajj, 10 A.H., in the vast plain of Ghadir al-Khumm, in front of a crowd of 1,24,000 pilgrims, he (S) not only announced the successorship and Imamate of Amir’ul-Mu’minin (a.s.) in clear terms, but, even ordered the people to pay allegiance to ‘Ali (a.s.). The Muslims duly obliged. Later, in the destruction of Harith Ibn No'man, people also saw the fate of him who denies ‘Ali's mastership.\n" +
                "\n" +
                "Along with the announcement of the mastership of ‘Ali (a.s.), the Holy Prophet (S) also declared the Imamate and mastership of his eleven descendants. On various occasions, and in numerous ways, he made it clear that after him, till the Day of Judgement, the number of his successors and caliphs shall remain only twelve. The first of them will be ‘Ali (a.s.) and the last, Imam Mahdi (a.t.f.s.).\n" +
                "\n" +
                "In a number of traditions, he has also mentioned the names, titles, agnomens, and characteristics of these twelve successors. Through his companion, Jaabir Ibn Abdullah Ansari, he sent salutations to the fifth among the Imams, Imam Muhammad al-Baqer (a.s.). All these are practical testimonies of the truthfulness of the Holy Prophet (s.a.w.a).\n" +
                "\n" +
                "The series of Imamate and guidance continues today and will go on till the dawn of resurrection. The Messenger of Allah (S) has underlined the significance of Imam al-Asr's (a.s.) recognition through the famous tradition,\n" +
                "\n" +
                "\"من مات ولم يعرف امام زمانه مات ميتة جاهلية.\"\n" +
                "\n" +
                "\"One who dies without knowing the Imam of his time, dies the death of ignorance (i.e. unbelief).\n" +
                "\n" +
                "As is evident, the unbelievers will not attain salvation. They will go to hell and shall abide in it forever. Anybody who desires to save himself from the perennial chastisement of hell and gain the everlasting bounties of paradise, then it is for him to gain the recognition of the Imam of his time.\n" +
                "\n" +
                "On the flip side, one who does not recognize the Imam of his time, his religion is not perfect, his bounties are not complete and Allah the Almighty is not satisfied with him.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("An Important Anecdote");

        edetails.add("Due to the bad political atmosphere that was established by the perverted and cursed[1] government of the Abbasid and Umayyad and inability of (Alawis) the descendant of Ali to convene a Just nation, our holy Imams (peace be upon them) were not opportune to explain the divine mysteries, to this end it was said the first person whose right was usurped was Ali son of Abi Talib (peace be upon him).\n" +
                "The Prophet (peace be upon him and his family) had a lot mystery that wasn't known except by few individuals if not because of the despotic rulers of this nation the mystery could have be divulged to us.[2]\n" +
                "They did not explain and divulge this mystery to general people except to few among their associates and friends hence they were not able to reveal the mysteries and spiritual facts due to the weakness of the people to endure it, because they were under the usurped government which will prevail till the coming of the divine government.\n" +
                "Imam Sadiq (peace be upon him) said regards the following verse, {by the night when it journeys on!}[3]\n" +
                "It is the usurped nation which shall prevail till the coming of the awaited one, Imam Mahdi (peace be on him)[4]\n" +
                "They mentioned a lot of these mysteries under the pretext of prayers and supplications through which you perceive it and the facts in it.\n" +
                "The explanations given by the Ahlulbayt (peace be upon them) did not only confined to the political atmosphere of their time rather they have mentioned other important issues in ideology and exalted sciences in the prayers and supplications. The manifestation of this fact is by referring back to their supplications. In addition to their explanation concerning mysteries and ideology, they have also treated a lot of issues that has impact in human's life and they have also enlightened the society the best lesson in life.\n" +
                "Be aware precisely the \"Psalm of Imam Sajjad\" which it's authenticity was approved by the awaiting Imam Al- Mahdi (May our souls be sacrifice for him), you will observe how Imam Sajjad (peace be upon him) has expound tremendous facts in a short word under the pretext of prayers and supplications. You should also be precise in other supplications from Imam Sajjad (peace be upon him) and other Imams from the progeny of the holy Prophet (peace be upon them).\n" +
                "Presently we will mention some similitude of the lively lessons which they have teaches us through supplications:\n" +
                "We pray to Allah in the Gospel supplication of Imam Sajjad (peace be upon him) that:\n" +
                "O' God I seek for exalted determination from thee.\n" +
                "This is a word of exhortation from Imam Zainul Abideen for all those that are calling Allah. Meaning that any caller, who lowered himself, will request from Allah to grant him an exalted determination so that he might possess a tremendous changing in his life, henceforth his existence will have fundamental effect and impact in the society. This fact will manifested when the light of the Imam (peace be upon him) flashes the heart of human being.\n" +
                "The supplications which was a sublime mountain of guardianship for who desired to go to the right side valley and climb the sublime mountain of guidance should take off his shoes and purify his wears and study the manner of prayers and its acceptance in order to envisage concern and acceptance.This is what came to us from the Qur'an and traditions of the infallible ones, so hold fast with it in order to benefit from it and don't be despaired from God's comfort. {of God's comfort no man despairs, excepting the people of the unbelievers}[5]\n" +
                "Be certain of that as you will envisage the light and you will also be acquainted with the mystery because the Imams (peace be on them) guides people to mysteries and facts in all they have said in their prayers and supplications.\n" +
                "----------------------------\n");


        esrc.add("Sahifa-e-Mahdiya\n [1] - The word habtar in Arabic language means the first that usurp the right of the divine sucessors.\n"+
                "[2] - Al- Bihar 95: 306.\n" +
                "[3] - Qur'an 89: 4\n" +
                "[4] - Al-Bihar 24: 78.\n" +
                "[5] - Qur'an 12: 87.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("The Persistence in supplications and it's importance");

        esrc.add("Sahifa-e-Mahdiya");
        edetails.add("Persistence in supplications has important impact in acceptance of supplication so that the caller achieves his objectives. This is an important point which all callers should take note of, because majority of people may not be able to achieve their aims just for reading their prayers and supplications for a time. For instance a sick person whose sickness is minor can treat his sickness once but those whose sickness is chronic needs long time treatment for its cure, the same apply to those having psychiatric or psychological sickness, peoples that are affected with this type of sickness whether chronic or not cannot subdued it with one supplication rather it is incumbent on him to take repetition of prayers till he is fully cure and relief of his sickness just like other physical sickness.\n" +
                "To this end as the physical sickness need repetition of treatment in order to see the impact of the drugs the same applies to any issues that fall into the scope of supplication, then it is necessary to make repetition of our prayer in order to see the impact of its acceptance.\n" +
                "Indeed, it is possible for some people to attain their ambition by offering supplication once but that is very rare and uncommon. It is not proper for other people to expect the acceptance of their prayers by just offering supplication for once. So repetition of supplication is one of the emphases laid by the infallible ones in their traditions (peace be on them).\n" +
                "\n");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Necessity of Prayers to the Leader of Time atfs");

        esrc.add("Sahifa-e-Mahdiya\n [1] - Jamal Al-Usbuy : 307.\n" +
                "[2] - Falahi Ssaa'il : 44.\n" +
                "[3] - Mikyalil Makarim 1: 438.");

        edetails.add("Praying for the reappearance of our master, the God's remnant in the world is the most important prayer during the time of his occultation, because he is our companion, the leader of the time and the guardian of the worlds, how then do we heedless of him while he is our leader! Negligence of the Imam is negligence of one of the principle of Religion, and then we should initially pray for him before praying for ourselves, our family and our brothers.\n" +
                "Sayyid Al-Ajal Ali bn Taa'us in his book title ''Jamal Al-Usbuy'' said: we have presented in the book the precise duty to be done during the day and night and the importance which the exemplary ones has previously given in their prayer for Imam Mahdi (peace be upon him) which implies that praying for him is very essential for the Muslims and the Believers. We have also related a narration under the supplication after (Zuhr) mid day prayer as supplication from Imam Ja'afar Sadiq bn Muhammad (peace be upon him) which he offers for Imam Mahdi (peace be upon him).\n" +
                "Like wise we had mentioned a narration under the supplication of after (Asr) afternoon prayer where Imam Musa Al-Kazim bn Ja'afar (peace be upon him) has prayed for Imam Mahdi (peace be upon him). So imitating Imam Ja'afar and Al-Kazim is a pretext for those who know their reputation and rank in Islam.[1]\n" +
                "Ibn Taa'us after mentioning the virtues of offering prayer for ones brother said: If offering prayer for ones brother possess all this virtue what will be the virtue for he who offer pray for his chief who was the cause of his existence and you believe that if not him God couldn't have created you and other creatures in his and your time, and all you possess was due to the grace of his existence (peace be upon him).\n" +
                "I advise you not to put forward yourself and other creatures in your prayer and allegiance before him.\n" +
                "Prepare your mind and your tongue when praying to that tremendous master and personality. Don't have the believe that Imam need your prayer, never and never hence such believe show the illness of your allegiance and your doctrine, requesting you to pray for him was due to his right known to you and his immense kindness to you. If you offer prayer for him before yourself, that will make the ways of accepting your prayer closer and quicker before God Almighty.\n" +
                "Ways of accepting prayers has been band due to our atrocities and if you offer prayer for him before the owner of life and death your prayer may be accepted because of him. Then you include yourself in the prayer you offered for him in the company of his favour for the expansion of God's mercy, honor and providence on you for attaching yourself with his rope during your supplication.\n" +
                "Avoid the impression that you've not seen so and so person among our elders we are following that are observing all I am saying to you, that you met them being negligence of Imam (peace be upon him).\n" +
                "I am telling you to act according to what I told you because it is a clear reality, to God; it is a scandalous for those that neglect Imam after all that been mentioned in his respect.\n" +
                "How will Imam (peace be upon him) regard those who neglected him? Is it as you neglected this distinct position? It doesn't mean to offer a lot of prayers to him! He whose prayer for him is legalized in your daily compulsory acts!\n" +
                "Then you don't have an excuse if you did not show importance and concern to him.[2]\n" +
                "It was said in ''Mikyalil Makarim'' that supplication according to the Qur'anic verses and Prophetic traditions is one of the greatest aspect of worship and there is no doubt that the most glorified and tremendous supplication is for those whom God has made their right incumbent on us hence praying for him is compulsory for every living being and with the benefit of his existence blessing flows to all creatures. Also there is no doubt that the meaning that one should occupy himself with God is to occupy oneself with His worshipping this should be continuous in order to achieve His approval and to make him among His good friends.\n" +
                "In conclusion it is obvious that persistence in praying for our master, the proof (peace be upon him) and requesting for his quick reappearance, and obtaining his pleasure will make it incumbent on you to achieve exalted benefits.\n" +
                "Then it is necessary for every believer to exhibit concern and persistency in praying for Imam every where and all the time.\n" +
                "In reference to all we have mentioned was the statement of Mirza Muhammad Baqir Isfahani, he said: I saw Imam Hasan Al-mujtaba (peace be upon him) in my dream or between my dream and when I was awaken and gave me the following assignment:\n" +
                "Command people from the pulpit (Minbar) to repent and to pray for the safety and the reappearance of the Imam (peace be upon him). This command is not a collective duty rather it is compulsory like your five times daily prayer which is individual duty, till end of his speech, in all our condition it is from God we demand for help[3]\n" +
                "From all the aforementioned it is very clear the significance of prayer for the reappearance of the awaited Imam (May our souls be sacrifice for him).\n" +
                "----------------------------\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");





        etitle.add("The First Oppressed in This World");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Bustanul Wilayat 2: 18");

        edetails.add("It is very unfortunate that people were heedless of praying for the quick reappearance of the leader of the time (May our souls be sacrifice for him). Had it been we are aware of our negligence to him we will realized that he was the first oppressed in this world.\n" +
                "                We will mention below some instances where Imam (peace be upon him) was oppressed:\n" +
                "        1-Hujjatul Islam Hajj Ismail Ashsharafi (may Allah be pleased with him) said: I went to the sacred place of Karbala to visit the lord of the martyrs (peace be upon him) I was then offering (Ziyarah) prayer and it occurred to me that visitor's prayer is accepted if he offers it at the blessed head position of Imam Husein, I then request from Allah to grant me the opportunity of seeing my master, the leader of the time (peace be upon him) when I was still engaged offering my (Ziyarah) prayer, his beautiful Sun rises even though I didn't knows him but my mind inclines towards him, I went closer and saluted him inquiring from him who are you?\n" +
                "                He said: I am the first oppressed in this world! Then I didn't understood what he meant by his statement and I inspire to myself that he may be one of the learned scholar in Najaf whom people did not pay him attention, that is why he feel to be the first oppressed in the world! He then out of my sight hence I believe that God has accepted my prayer and that was my master the leader of the time whom I have just met with.\n" +
                "        2- Hujjatul Islam Sayyid Ahmad Musawi (he is among those who are eager to see the leader of the time (may Almighty Allah hasten his reappearance) he reported from Hujjatul Islam Sheikh Muhammad Ja'afar Al-Jawadi, the later was opportune to witness the awaiting Imam (may our souls be sacrifice for him) but he was very depressed, he inquired from him about his condition (peace be upon him) Imam replied him: my heart is filled up of blood, my heart is filled up of blood meaning that he is depressed (peace be upon him).\n" +
                "        3- Imam Husein (peace be upon him) said to one scholar in Qum through unveiled world:\n" +
                "        Our Mahdi is oppressed in his time, so therefore preach and write about the personality Of Imam Mahdi (peace be upon him) to your last ability. Indeed preaching about the personality of this infallible Imam is like preaching on the personality of the whole infallibles (peace be upon them) because they were all offended in their infallibility, guardianship and in their Imamate, so far this is the time of our Mahdi you ought to preach about his personality.\n" +
                "                He (peace be upon him) concluded his speech by saying:\n" +
                "        I am still emphasising it again, preach and write a lot about our Mahdi. It is compulsory to write more than what was previously said about him because Our Mahdi is oppressed.[1]\n" +
                "        ----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("An Admonition From Hajj Sheikh Rajab Ali Al-Khayat (May Allah be pleased with him)");

        esrc.add("Sahifa-e-Mahdiya\n[1] - What he has mentioned (may Allah raises his rank) was narrated from the Messenger of Allah (peace be upon him and his family) and Ayatullah Sheikh Ali Akbar Nahavandi has quoted the narration in his book 'Golzar Akbari'.\n");

        edetails.add("After we have clarified the necessity for offering prayer for the leader of the time (may our soul be sacrificed for him) it is compulsory for us not to focus our intention when supplicating only to reach some prestige rather we should pray to God seeking for His pleasure, nearness to Him and the awaiting leader (peace be upon him). Then you should aware of this matter. Sayyid Ashsharafi (may Allah be pleased with him) said: we do travel to different countries for the purpose of propagating Islam, in one of our journey which was very close to the holy month of Ramadan, I was along with some of my friends under the service of Hajj Sheikh Rajab Ali Al-Khayyat, we demanded him to teach and admonish us, he taught us how to use this holy verse: {And whosoever fears God }[1]\n" +
                "He said: we should first give alms (sadaqah), fast for forty days and recite the verse while fasting. In a nutshell what was important in his explanation (may Allah raises his position) is as follow:\n" +
                "This duty must be with the intention of nearness to the eighth Imam (peace be upon him) and should not be done seeking for materials.\n" +
                "Sayyid Ashsharafi (m.a.b.p) said: I commenced the assignment but was not able to concludes it while I stop but my friend completed the assignment and he later travel to the holy city of Mash'had to visit Imam Ali Rida, the eighth Imam (peace be upon him) and saw him in a form of light and after a while he was able to witness and talk with the Imam (peace be upon him).\n" +
                "Our aim in narrating this issue was to explain some important point one need to observe while praying and supplicating, that is in addition to observing sincerity in his supplication he should also offer his prayer with the intention of seeking nearness to Allah, the Prophet and his household (peace be upon them) meaning that one should observe his supplication with the intention of worship and not to attain rank and prestige in this world.\n" +
                "Regard to this matter a popular man whose prayer is having effect in solving peoples problems said to a man is believing that he possess insight: in your opinion what is my stature before Almighty Allah?!\n" +
                "He replied after deep pondering: you have much interference in the issues concerning God!\n" +
                "It is then incumbent to anybody that offers prayers not to misuse the opportunity rather he should offer his prayers as worship without interfering in the issues concerning God and should not try to attract people to himself.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("An Important Experience of hajj Sheikh Hasan Ali Isfahani");

        esrc.add("Sahifa-e-Mahdiya\n[1] - My late father Al-Muazzam is one of the sincere companion to late Ayatullah Hajj Sayyid Ali Ridawi who was one of the scholar in the holy city of Mash'had.\n");

        edetails.add("Because we have talk about the person of Hajj Sheikh Hasan Isfahani in this discussion we will mention an important issue that concerns him.\n" +
                "The Sheikh has engaged himself right from his youth with worships and Islamic devotion and endure a lot of inconveniencies in order to attain some spiritual ranks, he then have write up that is comprise of mysteries and an important point that he did not exposed or divulge to general people.\n" +
                "My late father Muazzam (may Allah raises his position) told me about this write up of Sheikh:\n" +
                "Verily Hajj Sheikh Hasan Ali Isfahani towards the end of his life has given this book to late Ayatullah Hajj Sayyid Ali Ridawi.[1]\n" +
                "Our reason for reporting this issue was the important point mentioned by Sheikh Hasan Ali Isfahani (may Allah be pleased with him) at the end of his book which is incumbent for those who wanted to pass through spiritual stages to benefit from it as follows:\n" +
                "I wish all I have done in readings, litanies and so on for the purpose of reaching spiritual rank should be done for the purpose of nearness to my master, the leader of the time (may Allah hasten his reappearance).\n" +
                "Take note of the speech of this religious and divine man who was well known among the Sunni and Shi'a, how he has shown his regret for all good jobs he has put forward hoping to have done that for the purpose of nearness to Imam of the time (may our soul be sacrificed for him). There is no doubt that Hajj Sheikh Hasan Ali Isfahani is possessing spiritual strength and it is hard to get his type,\n" +
                "with all this he is still having the notion that all he has done throughout his life was just for the nearness to the chief of this world of existence. He did not struggle to attain strength for mediation and pleasure even similar to that was the purpose for all his actions.\n" +
                "The great example for anyone (in any field he belongs to) is to copy from the experience of the great men of that field and to benefit from their struggles throughout their life and from what they have achieved most especially to focus on the last period of their life.\n" +
                "Be very careful of this point: to benefit from the important experience of the great men increases the spiritual value in ones life.\n" +
                "Try in your deeds what late Hajj Sheikh Hasan Ali has experienced which he has written in his book. Offer your prayers, supplications and other aspect of your worship in nearness to God so that you can be closer to His caretaker, our master, the Imam of the time (may Allah hasten his reappearance) and cast off little ambition. This is a reality which will benefit you if you hinder to it.\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Organizing Gatherings for Supplication\n");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Mikyalil Makarim 2: 169.\n");

        edetails.add("It is possible to organize prayers collectively just like individual, that is by organizing gatherings in remembrance of Imam (peace be upon him). Such gatherings in addition to the prayer we offered for the Imam (peace be upon him) there are other good things that is included, like reviving the issues of the Imams and mentioning their traditions (peace be upon them) and so on.\n" +
                "The writer of Al-Mikyal (may Allah raises his position) includes organizing gatherings in remembrance of the Imam among the duties of the creatures during the occultation of Imam (may our soul be sacrificed for him) mentioning during the gathering his virtues, merits, praying for him and spending our lives and money in this respect because that is among propagation of Islam, announcing the words of God, assisting good and faith, glorifying the signs of God and helping the friends of God.\n" +
                "CAUTION: Sometime such gathering may become compulsory if such gathering can serve as an avenue to bring back to guidance and right path those that are exposed to deviation and straying from the right path, base on the law of enjoining people to good and abstaining them from bad (Amr bil Ma'ruf wa Nahyi anil Munkar) like wise the law of guiding an astray person and abstaining people from innovation. Allah the Most High is the Protector in all condition.[1]\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Be aware of the Duties during the time of occultation\n");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Refer to another book by the author: (Daulat karimeh Imam Zaman) in Persian language.\n");

        edetails.add("With the success of God and the grace of Imam of the time (may our soul be sacrificed for him) we have authored this book just to be acquainted with one of the duty during the period of occultation, which is praying for the quick reappearance of the Imam (may our soul be sacrificed for him) but we ought to write from the beginning some other duties during the darkness and occultation hoping by God's Grace to accomplish the Imam being in the last stage of occultation. According to the tradition reported from the purified Imams, it is incumbent on us to be expecting both day and night the reappearance of the Imam (peace be upon him).\n" +
                "But very unfortunate, our community up till now is not being acquainted with the whole duties during the period of occultation. The precious books written on this respect has mentioned some duties but not all, had it be people are aware of their missing condition at the earlier stage of occultation, it couldn't have taking longer time as it was now.\n" +
                "What ever condition, it is incumbent especially for those whose responsibility are to explain people's duty to them during the period of occultation (though they were also heedless and negligence of that) to be in a state of embarrassment and sorrow for not taking up their duty.\n" +
                "It is not proper for us to be negligence of the chief of the world of existence and the all knowing of our need in this universe while he exists within us.\n" +
                "Is it proper for billions of brains to be in the veil of darkness due to the concealment of God's light?\n" +
                "Is it proper for human kind to have mirror which suppose to reflect the world to them (that is the mind) but heedless of its majesty?\n" +
                "When will the mind return to its original life to perceive the reality in life and the exaltedness of humanity?\n" +
                "When will people know the majesty of their mind, the mirror by which we witness the world?\n" +
                "When will people's sense be active towards high rank of knowledge?\n" +
                "When will people leave darkness, oppression and aggression to enable them attain the worldly government of divine Justice?\n" +
                "When and when .and when .\n" +
                "Is it possible for the occurrence of all this except during the government of our master, the Imam of the age (peace be upon him)?\n" +
                "Why we didn't perceive the period of reappearance? Why we didn't protest against the darkness of this time? Why we are not cognizance about the future of this world![1] And why we didn't take up of our duties during the days of occultation?!\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("They alter your ways of thought!\n");

        esrc.add("Sahifa-e-Mahidya");

        edetails.add("Answer to the entire question is that we have solidified the period of occultation, the darkness and the oppression in it! For that we become attracted to the darkness and the oppression to the extent we became habituated with it. Habit attains the strength for attracting one to either good or bad attitude without intending it.\n" +
                "For one to become habituated with anything that draws him, just like ones instinct and nature to the extent one will be as if he does not possess volition to against it. God has given the same strength to the habit and custom till it draw you to offer good thing or to abstain from bad deed without intending it. In this respect the commander of the Faithful (peace be upon him) has counted custom to be the second nature, and said:\n" +
                "custom is the second nature.[1]\n" +
                "This statement never the less is precise but it contains an important facts, base on what the Imam said: custom stimulates one just like the nature and instinct stimulates.\n" +
                "It is necessary for everyone to benefit from this great strength in an exalted and authentic ambition and to abstain from polluting of oneself with bad custom.\n" +
                "Very unfortunate our community has become habituated with bad custom both individually and collectively due to absence of good leader to lead the society towards laudable ethics and exalted rank of humanity. The collective custom is stronger than that of individual custom as it is very easy to draw some people to what the society is habituated with!\n" +
                "Habituated with the occurrence and happenings on people and the patient with it without thinking of the future and the coming of the savior is the worst societal custom that the communities are afflicted with!\n" +
                "Even though the Prophet (peace be upon him and his family) and the Ahlulbayt has explained issues concerning 'Anticipation' i.e. the coming of Imam Mahdi and has encouraged people to that and they have announced that it is permissible for you to be in anxiety and be patient, this explanation of theirs has led people to the future luminous that shall come out.\n" +
                "Very unfortunate, those whose duty is to explain this issue to people has refrained from their duties and they did not struggle to reach the future east which have prolong the period of occultation.\n" +
                "Up till now a lot of individuals are still accustoming to negligence regards the reappearance of the great friend of God (may our soul be sacrificed for him) and has inherited it from their forefathers. In a nutshell our community needs to move towards exalted degree, though if people abstain from their bad custom and engage themselves with humanity, they will surely elevate to an exalted degree.\n" +
                "Our master, the commander of the faithful (peace be upon him) said:\n" +
                "To subdue one's custom will elevate him to a noble rank.[2]\n" +
                "It is necessary for our community to leave in a state of anticipation and pray for the reappearance of the world saviour our master, the leader of the time (may Allah hasten his reappearance) and refrain from our old custom that is negligence of the existence of darkness during the occultation period! We should pray earnestly to Almighty Allah for the quick reappearance of the Just government of Mahdism.\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("To the chief of the present world\n");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Sharh Gurar Al-Hikam 5: 305.\\n\" +\n" +
                "                \"[2] - Reffer to the chapter of Ziyarah of this very book.\\n\" +\n" +
                "                \"[3] - Reffer to the chapter of Ziyarah of this very book.\\n\" +\n" +
                "                \"[4] - Al-Bihar 52: 153.\\n\" +\n" +
                "                \"[5] - Qur'an 20: 12\\n\" +\n" +
                "                \"[6] - Nahj Balaghah short words: 295.");

        edetails.add("Be aware that whoever certainly seeks for the awaiting leader (may our soul be sacrificed for him), serve in his path, pray for his quick reappearance and struggle in this aspect, at the end he will be guided to the path and all the ways will be opened for him. For this reason we should not refrain from his service during the occultation period because his hands was tied which is just like the rope the enemies tied on the neck of the first oppressed one, the commander of the faithful (peace be upon him).\\n\" +\n" +
                "                \"When we struggle in advance for the reappearance of Imam (May our soul be sacrifice for him) this rope will cut off. Be sure that whoever sacrifice his life in the ways of his Imam (peace be upon him) and did not entertain any doubt in it, he will be under the view of the Imam and will make him happy with words or speech and he will be pleased.\\n\" +\n" +
                "                \"If one can not proceed in the ways of seeking for fact, he will not achieve all or even part of it.\\n\" +\n" +
                "                \"The commander of the faithful (peace be upon him) said:\\n\" +\n" +
                "                \"Whoever seeks for anything, achieve all or part of it[1]\\n\" +\n" +
                "                \"Have the belief very strongly that Imam (peace be upon him) is the centre of pivot even though we are in the period of occultation and the period of his government hasn't come. He is the chief of this existing world and his reign is absolute and comprises the entire world.\\n\" +\n" +
                "                \"Thus we do read in his Ziyarah that:\\n\" +\n" +
                "                \"Peace be upon you, O' the centre of pivot.[2]\\n\" +\n" +
                "                \"All the existence during the dark period of occultation and during the period of his reappearance leaves under the canopy of his sacred existence and the entire world are indebted to his leadership and reign without an exception.\\n\" +\n" +
                "                \"Due to Imam and his purified ancestor's grace Prophet Isa the spirit of Allah (peace be upon him) attained all his ranks and he (peace be upon him) will not only be under the leader of Imam during his reappearance but right now he receive his instructions from him.\\n\" +\n" +
                "                \"We read in his Ziyarah (prayer): peace be upon you, O' the leader of Jesus Christ.[3]\\n\" +\n" +
                "                \"The reign of Imam is not specialize to the period of his reappearance, even now his government is in force, the followers of Imam are proud of being under his leadership (peace be upon him). In this period all noble ones, chief and other good friends of God that are royal in their intentions and refrain from their personal causes has attain way to luminance rank i.e the light of the existing world and the Imam of the time spend his loneliness with those personalities that has been elevated to exalted rank.\\n\" +\n" +
                "                \"It is has been reported in tradition that:\\n\" +\n" +
                "                \"With the strong thirty allies of Imam, he is not in loneliness.[4]\\n\" +\n" +
                "                \"Our purpose for explaining this issue is that occultation doesn't mean cutting off of his invisible auxiliaries from the creatures and that he (may our soul be sacrificed for him) did not assist anyone, and there is no any avenue to his light but rather as we have earlier said those who sincerely struggle to reach him are anticipating for his reappearance throughout their life and strengthens their heart with view and information from him.\\n\" +\n" +
                "                \"That is how we hear the address of this sincere personality\\n\" +\n" +
                "                \"{put off thy shoes; thou art in the holy valley, Towa}[5]\\n\" +\n" +
                "                \"Take up your shoes to see how you've injured your feet before the journey to the chief of this existing world. But very unfortunate some individual not only they are not royal in their intention, they also in addition trouble and cause affliction to other people and also put pebbles in their shoes. Those people sting the heart of those who love Imam (peace be upon him) with their sharpen tongues (because they are agents of Satan) they incline towards putting an end to all ways that leads to Imam (may our soul be sacrificed for him) as if they don't know that having enmity with his path and those that loves him is like having enmity with his honorable person (may our soul be sacrificed for him). Does the commander of the faithful (peace be upon him) never say the following?!\\n\" +\n" +
                "                \"Your friends are three likewise your enemies; your friends are (a) your friend (b) the friend of your friend (c) the enemy of your enemy. And your enemies are (a) your enemy (b) the enemy of your friend (c) the friend of your enemy.[6]\\n\" +\n" +
                "                \"Base on this, is having enmity with the lovers of the awaiting Imam (peace be upon him) not a transgression over his person (peace be upon him)?\\n\" +\n" +
                "                \"----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("The importance of paying attention to the awaiting leader\n");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Al-Bihar 39: 349.\n" +
                "[2] - Al-Bihar 72: 135.\n" +
                "[3] - Darus Salam by Iraqi page 317, we have transmitted the entire issue in Sahifah al-Mahdiyyah: 296.\n" +
                "[4] - Qur'an 17: 71.\n" +
                "[5] - Al-Bihar 8: 10.\n" +
                "[6] - Al-Bihar 53: 174\n" +
                "[7] - Ziyarah Nudbah, it will be mention under the chapter of Ziyarah.\n" +
                "[8] - Qur'an 12: 97.");

        edetails.add("We should be aware that paying attention to the awaiting Imam (peace be upon him) is same as paying attention to Allah like wise paying attention to the rest purified Imams is same as paying attention to Almighty Allah.\n" +
                "So visiting the purified Imams and imploring with them necessitate paying attention to Almighty Allah because whoever intended Allah paid attention to them.\n" +
                "We read in Ziyarat Al-Jami'at Al-Kabir the following:\n" +
                "Whoever intended Allah paid attention to them.\n" +
                "Verily if people paid attention to the honorable Imams he is inviting avenue of elevation to himself and clearing away all the obstacles that may hinder him from reaching an exalted ranks. To the extent that if people paid attention to our master, the leader of the time (may our soul be sacrificed for him) and other purified Imams he opens the ways of Allah, His blessing and forgiveness to himself likewise he has lifted all darkness from inside himself.\n" +
                "Imam Baqir (peace be upon him) while explaining this statement of Imam Ali (peace be upon him) \"I am Allah's gate\" said:\n" +
                "Whoever paid attention to Allah through me will be pardon and forgiven[1]\n" +
                "To this end whoever paid attention to Allah, He will forgive him and take off all his obstacles. All the infallibles (peace be upon them) possess luminance position, in this respect we need to pay attention to all of them without any exception because they were acquainted with all period and time but due to the descending of position it is incumbent to be more concentrated to the Imam of the time more than other Imams (peace be upon them).\n" +
                "Take note of the following tradition: it was reported from Abdullah bn Qudamah Attarmadi from Abi Al-Hasan (peace be upon him) who said:\n" +
                "Who ever entertain doubt in four things has disbelieve in everything Allah has descended; one of this four things is knowing the Imam of every era, his personality and his attributes[2]\n" +
                "It is incumbent to know the Imam of every era, how does it possible for someone to knows his Imam (peace be upon him) and he will not concentrate on him?!\n" +
                "Base on this, it is not proper for someone not to concentrate on the awaiting Imam (may our soul be sacrificed for him) and not to know his attributes and his exalted position even though he concentrates on the other Imams (peace be upon them).\n" +
                "Therefore our duty this very time is to have special concentration on our master (may our soul be sacrificed for him) whom we are under his leadership.\n" +
                "We read in the supplication teaches by Imam (peace be upon him) to his companion which was revealed to one renown scholar by name late Mulla Qasim Rashti, he said teach this supplication to the believers to enable them solve their problems, the supplication reads as follows:\n" +
                "O' Muhammad, O' Ali, O' Fatimah, O' the leader of the time accept me and don't destroy me.\n" +
                "He said: when I was taught of this supplication I ponder over it, did you observe any mistake in it? Yes, I said to him, the statement was addressed to four people and why the verb at the conclusion is not plural?!\n" +
                "You made mistake, he said, because the care taker of this world at this time is the leader of the time, in the above supplication we use Muhammad, Ali and Fatimah (peace be upon them) as a mediators before him, so we obtain from him alone.[3]\n" +
                "It is necessary to take note of this point.\n" +
                "As Salman, Abu zar, Miqdad and other good friends of God during the period of the Prophet (peace be upon him and his progeny) and the commander of the faithful (peace be upon him), they concentrated on both of them likewise the good friends of God during the time of Imam Al-Mujtaba (peace be upon him) and the chief of martyrs (peace be upon him) they concentrated on both of them, the same applies to those who were elevated to exalted rank in this era because they didn't forget the remembrance of the master (may our soul be sacrificed for him) thus they concentrated on him.\n" +
                "Thus we read in supplication of Nudbah as follows:\n" +
                "Where is Allah's direction by which all His good friends faces.\n" +
                "The good friends of God at this time concentrated on the leader of the time even though they were not known within the community but they had connection with their Imam and benefited from his words.\n" +
                "Thus we read in Ziyarat Aali Yasin as follows:\n" +
                "Peace be upon you whenever you recite Qur'an and expound it.\n" +
                "Base on this, it is necessary for everyone to give special concentration on the leader of his time.\n" +
                "Thus we mention a narration of the eighth Imam (peace be upon him), be aware of it: From our master Imam Rida reporting from his forefathers (peace be upon them) he said:\n" +
                "The holy Prophet (peace be upon him and his progeny) said regards the following saying of Allah the Most High {On the day when we shall call all men with their leader}[4]\n" +
                "Every community shall be call upon with the Imam of their time, the Book of God and the custom of their Prophet.[5]\n" +
                "The meaning of the narration is that on the day of Judgement every one shall be asked of three questions: (1) Did you execute your duty as a follower regards to your Imam (2) The Book of God (3) The custom of Allah's Prophet (peace be upon him and his progeny), Or not?!\n" +
                "So one will be asked on the Day of Judgement whether he knows the Imam of his time or he didn't knows him!\n" +
                "The best way to concentrate on the leader of the time is to offer prayers and supplications that were reported to us from the purified Imams in his regard (peace be upon him) or the one that was issued by the Imam of the time.\n" +
                "This was the admonition of Muhammad bin Uthman (the second deputy of Imam during the minor occultation) to Ahmad bn Ibrahim when he requested from the former a supplication for Imam.\n" +
                "Concentrate with him with supplications and Ziyarah[6]/[7]\n" +
                "We may deduced from this word that by offering prayers and supplications that concerns him (peace be upon him) one will be more concentrated to his noble existence.\n" +
                "Concentration on the Imam's personality or to feel grief and tormented is not only meant for the period of occultation rather it has been existing even during the time of other Imams (peace be upon them) and Ahlulbayt has expounded the greatness of his rank and his personality (may our soul be sacrificed for him) and manifested the grief for his occultation and separation.\n" +
                "In reality they did not only manifested explanation of people's duty towards the Imam rather they put it into practice by weeping and crying for his long occultation. Thus do they acquaint people with their actions, anticipation and grief for his occultation!\n" +
                "But very regretful that the Shi'a has neglected this fundamental issue which had great impact in their life both in this world and the world Hereafter.\n" +
                "The great scholar whose duty suppose to be enlightening people to this important issue also ignore it and because of the Shi'as negligence (both the previous and the present ones) to this same issue, the world had been deprived the blessing of the reappearance of the great legacy of God (may our soul be sacrificed for him). That is how the world will be governed by oppression, opulence and falsification, and the continuation of this government whose hands are polluted with blood as an affliction to billions of Muslims and none Muslims.\n" +
                "The community had been sunk into worldly affairs and laid importance on the causes and forget about the effect.\n" +
                "Never the less this world is home of causes and we need to struggle in it but it should not reach the extent we ignore the effects. The society had only paid little attention to the effect they also forget its guardians and master.\n" +
                "Not being acquainted with the personality of the Imam (peace be upon him) is the important reason that leads most people not to concentrate on Imam.\n" +
                "It is very regretful that those whose duty is to propagate this fact to people by guiding them to the leader of this existing world were not successful in carrying out this important and vital Islamic duty.\n" +
                "Presently we will repeat the same statement of Prophet Yusuf's father. To this end we are apologizing to our merciful Imam seeking for pardon from him:\n" +
                "our father, ask forgiveness of our crimes for us; certainly we have been sinful[8]\n" +
                "With this pardon and forgiveness for our previous actions we hope to redress the future and put him in remembrance and try all our possible best to make people concentrates in him.\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Anticipating for relief or believing it\n");

        esrc.add("Sahifa-e-Mahdiya");

        edetails.add("Anticipating for the coming of Imam doesn't mean preparation to perceive the reappearance only but in addition to that one need to ponder and have the hope of perceiving it.\n" +
                "It is possible for a lot of people to prepare for a guest but he may decide not to invite any guest and may also not be anticipating for any guest. Such person will not be refer to as someone expecting guest even though it is possible for him to receive a guest, because he is not expecting a guest and he will not be grief if the guest didn't arrive.\n" +
                "It is obvious from our statement that purifying the soul will not be completed if we are heedless of the coming day when the world will be freed from oppression. Those who did not notice he had ignored an important duty i.e. anticipation for the purification of this world and movement towards this exalted destination.\n" +
                "in another expression: Indeed reforming the soul will not reach its perfection until one has the view of reforming the whole world and whoever struggle to reform himself should be in expectation of the reappearance of the reformer of the world and should not be contented with only believing in it.\n" +
                "To this respect one should be aware that there is difference between anticipating for the coming of Imam and believing in it, because all the Shi'a and even other Religion believe on the coming of the reformer of this world to fill it with Justice and equity but not every body having this believe are anticipating for his coming.\n" +
                "The person who is anticipating in addition to his believe, is he who is expecting to perceive the period of reappearance of the Imam and act base on his hope and his anticipation.\n" +
                "The reported narrations in praise of the period of anticipation is an evidence supporting the importance of having hope in occurrence of relief and perceiving the reappearance of the awaiting Imam (may our soul be sacrificed for him) because if there is no hope and anticipation and people are despairs in reaching the period of reappearance, how will they act base on the traditions teaching hope and anticipation?!\n" +
                "In addition to having the believe of reappearance of the awaiting Imam and preparation to its obtainment, the duty of each an everyone is to ponder over the reappearance and to be of the hope of obtaining it and to believe that it will occur, hence he should supplicates to obtain it with good health.\n" +
                "Be aware that Allah does what ever he wishes.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("The exalted rank of the awaited Imam (a.t.f.s) according to Ahlulbayt\n");

        esrc.add("Sahifa-e-Mahdiya\n[1] - Al-Bihar 51: 91.\n" +
                "[2] - Kifayatul Athar: 158; Al-Bihar 36: 337; and 51: 109.\n" +
                "[3] - Al-Bihar 51: 131.\n" +
                "[4] - The mother of the Imam (peace be on him) is one of the children of the roman king, for the purpose of being part of the house hold of the Prophet she pretend to be a slave girl and this has made her earn the mothership of the Imam, that is why she is refer to in the narration as the best of the slave girl\n" +
                "[5] - Al-Bihar 51: 36.\n" +
                "[6] - Al-Geibat Nu'mani: 229.\n" +
                "[7] Al-Bihar 51: 121.\n" +
                "[8] - Al-Bihar 51: 115.\n" +
                "[9] - Nahju Balagah by Faiful Islam from sermon 26.\n" +
                "[10] - Al- Gaibah by Nu'mani: 273.\n" +
                "[11] - Al-Bihar 51: 139, 24, 241, 36, 394.\n" +
                "[12] - Al-Gaibah by Nu'mani : 273; Al-Bihar 51: 148. In \"Aqd Darar\" this narration and other ones was ascribed to Aba Abdullah Al-Husein (peace be on him) instesd of Aba Abdullah Assadiq (peace be on him) , which is not correct due the chain of collectors of the tradition, although the mistake occurred due to similarity in their nickname.\n" +
                "[13] - Falahi Ssa'il: 170.\n" +
                "[14] - Biharul Anwar : 86: 81.\n" +
                "[15] - Al-Gaibah by Nu'man: 180; Kamalu Ddeen: 370; Al-Bihar 51: 152; Ilzamu Nnasib 1: 221.\n" +
                "[16] - Ilzamu Nnasib 1: 271.\n" +
                "[17] - Al-Ghadeer 2: 361; Allamah Majlisi (may Allah have mercy on him) has narrated this type of narration in Bihar al-Anwar 51: 154.\n" +
                "[18] - Ilzamu Nnasib 1: 271.\n");

        edetails.add("Knowing the exalted rank of our master, the leader of the time (peace be upon him) is an influencing way to bring people into path of anticipation.\n" +
                "The narrations that came from Ahlulbayt regarding the greatness and the personality of the Imam, the leader of the time (may our soul be sacrificed for him) are very influential which necessitate astonishment in man.\n" +
                "How the community's heart are not attached with the Imam (peace be upon him) with all this narrations with inward impact! Why do they chooses loneliness and deceit instead of \"the chief of the paradise\"[1] Why all this negligence?! This gloominess is for what?! Did the scholars and great men in Religion act in a way suitable to him? Did those who ascribe themselves to Imam (peace be upon him) render their service as expected? Did the wealthy ones struggle to assist this fundamental cause of life? Has other people's hidden thought and agenda changed to concentration on the leader of the time (may our soul be sacrificed for him)?\n" +
                "The fact is that every creed has role to play in this aspect but there are still among the scholar and others who had stamp the sign of grief in their heart!\n" +
                "They are living with regret, sorrow and they are serving in this very path.\n" +
                "Here are some narrations from Ahlulbayt to observe how they had expressed the issue of the leader of the time and they had tried to let the people pay attention to him! Observe also how they have taught us how to honour and dignifies him (may our soul be sacrificed for him)!\n" +
                "1-The Messenger of God (peace be upon him and his family) said: \"may my father and mother be sacrifice for him; his name is like mine and he is in my resemblance\".\n" +
                "The holy Prophet (peace be upon him and his family) made this statement to the commander of the faithful (peace be upon him) after he has informed him about what shall happen during the days of occultation of the awaiting Imam (peace be upon him).\n" +
                "Be aware of the following statement of the Prophet (peace be upon him and his family):\n" +
                "There will be mutilated sedition after me, therein an intimate friends will fell victim, that will be when your followers will lose the fifth from the seventh of your descendant, the inhabitant of Heaven and Earth will be grief for missing him, how many believing men and women that will be in regret and perplexing when he is missed! Then he keeps silent for a while and later raises his head and said: May my father and mother be sacrifice for him, he is my name sake, my resemblance, and the resemblance of Musa son of Imran, he shall be on luminous garment, which shall be kindling from the ray of Al-Quds[2]\n" +
                "2- The commander of the faithful (peace be upon him) said about the hidden Imam (peace be upon him): May my life be sacrifice for him this statement was transmitted by Allamah Al-Majlisi from the commander of the faithful (peace be upon him) in a collection of poem ascribed to him (peace be upon him) he said:\n" +
                "Then the Qa'im shall rise up among you with fact;\n" +
                "He shall bring fact to you and act with fact;\n" +
                "Same name with the Prophet may my soul be sacrifice for him;\n" +
                "O' my descendants quickly assist him and don't disappoint him.[3]\n" +
                "i.e. at that time (after the tyrant governments) someone shall rise among you and give life to that fact\n" +
                "and he shall act according to that fact, his name is same as that of the Prophet (peace be upon him and his family) may my soul be sacrifice for him, O' my descendants you should struggle to assist him.\n" +
                "3- The commander of the faithful (peace be upon him): may my father be sacrifice for him, son of the best among the slave girls.[4]\n" +
                "Thus the commander of the faithful (peace be upon him) utter this statements showing his great affection to him after mentioning the bodily attributes of the leader of the time (may our soul be sacrificed for him).\n" +
                "Jabir Al-Ja'afi (one of the honourable and confidant of Imam Baqir (peace be upon him) reported this narration:\n" +
                "The commander of faithful (peace be upon him) it is suffice to mention the beautiful bodily attributes of the Imam (peace be upon him) with out mentioning his spiritual attributes because he is conversing with those who are the causes of destruction in this world.\n" +
                "The commander of the faithful (peace be upon him) appeased Umar bn Khatab when the later inquire about the name of Al-Mahdi! He said: I had covenant with the Prophet not to mention his name until Allah delegates him, then inform me of his attributes Umar inquired. He said:\n" +
                "he is a young man of medium height with handsome face and hair, his hair shall falls on his shoulder the brightness of his face is above his beard and his head, may my father be sacrifice for him, the son of the best creature.[5]\n" +
                "4- Commander of the faithful (peace be upon him): may my father be sacrifice for him, the son of the best among the creatures.\n" +
                "The commander of the faithful (peace be upon him) repeated this statement in several occasions and was reported by Harith bn Hamdani.\n" +
                "He expounds in this narration the conclusion of the tyrant's oppression with reprisal sword that is under the control of the leader of the time (may our soul be sacrificed for him, he said:\n" +
                "He shall quench the thirst of the world oppressors with cup of punishment.\n" +
                "Be attentive to this statement that delighted the heart of the grieved ones.\n" +
                "May my father be sacrifice for him, son of the best among the creatures (i.e. the riser among his descendant (peace be upon him) he shall impose humiliation to them, and shall quench their thirst of oppression with cup of punishment and shall give them a commotional sword.[6]\n" +
                "Verily that day shall be the end of people of Saqifa's government and those that inherited them and shall quench their thirst of oppression with cup of punishment.\n" +
                "5- The commander of the faithful (peace be upon him): may my fatherbe sacrifice for him, the son of the best among the creatures.\n" +
                "The commander of the faithful (peace be upon him) also repeated this statement in one of his sermon:\n" +
                "Look at the Ahlulbayt of your Prophet, adhere to them if they remain, assist them if they seek for your help, Allah will surely delegate a man from us (Ahlulbayt), may my father be sacrifice for him, the son of the best among the creatures, he will not give them except a commotional sword, and he is having eight responsibilities [7]\n" +
                "The commander of the faithful (peace be upon him) gives glad tiding in this sermon that the world shall be purified and reformed from the cursed ones, and the war against the tyrant shall last for eight months after then love and peace shall prevail.\n" +
                "6- The commander of the faithful (peace be upon him):\n" +
                "Oh' yearning for seeing him.\n" +
                "The commander of the faithful (peace be upon him) made this statement when explaining the affliction that shall come and that is after he had expounded the attributes of the leader of the time (may our soul be sacrificed for him):\n" +
                "Oh' (he pointed to his chest) yearning for seeing him.[8]\n" +
                "Due to his encompassing knowledge, he knows that the problems cultivated in Saqifa will affect the whole world for a very long time, the world will be oppressed and it will continue till the appearance of (Qa'im) the riser from among the Ahlulbayt (peace be upon him) along with three hundred and thirteen trained and reformed men, whom issue of legacy is firm in their heart and some other believers and shall retaliate for the oppressed ones.\n" +
                "If there are men at the day of Saqifa who has sacrifice their life for the commander of the faithful (peace be upon him) the enemies wouldn't have able to put ablaze the home of revelation and they wouldn't have able to tied rope on the neck of the chief of the existing world hence no one is able to darken the face of the moon!.\n" +
                "The commander of the faithful (peace be upon him) in one of his sermon said:\n" +
                "I look round I couldn't see any helper except the members of my house, then I conceded with them instead of death, then I kept my eyes closed despite motes in them. I drank despite choking of throat. I exercise patience despite trouble in breathing and despite having to take sour colocynth as food [9]\n" +
                "After the commander of the faithful (the first oppressed one in this existing world) has expounded the oppression done to him and had also caution about the future affliction, he mentioned the name of the lifter of this oppression, he said: Oh', yearning for seeing him!\n" +
                "7- Imam Baqir (peace be upon him) said: I will retain myself for the leader of the time, if I reach the time.\n" +
                "The statement came from he who knows all knowledge of this existing world who knows the secret behind the creation, whom the previous and present people are like the present existence before him.\n" +
                "He (peace be upon him) after expounding the present and the previous and the events that will occur before the rising of Al-Mahdi (may our souls be sacrifice for him) said:\n" +
                "regards to me, I will retain myself for the leader of the world if the time reach me.[10]\n" +
                "Ayatollah Sheikh Muhammad Jawad Khurasani in his book said: What the Imam meant in the narration was the time people will come out to take their rights.\n" +
                "8- From Imam Baqir (peace be upon him): may my father and mother be sacrifice for him, he who is called with my name and his nickname with mine, may my father and mother be sacrifice for him, he who shall fill the Earth with justice and equity as it was filled with oppression and inequity.\n" +
                "This tradition was reported by Abu Hamza Thumali (one of the great companion of Imam Baqir) he said: one day I was with Imam after all the visitors has gone he said to me:\n" +
                "O' Aba Hamza among the inevitables Allah has done was the rising of our riser (Qa'im) whoever entertain doubt in my statement will meet Allah as an unbeliever, he then said:\n" +
                "may my father and mother be sacrifice for him, he who is called with my name and nickname, the seventh among my descendant, may my father be sacrifice for him, he who will fill the Earth with justice and equity as it was filled with oppression and inequity.\n" +
                "O' Aba Hamza, who ever meet him and submitted to him what he has submitted to Muhammad and Ali, it is incumbent for him to enter Paradise, and it will be prohibited for him to enter paradise whoever did not hand over to him, hence Hell fire shall be his abode, how wretched the abode of the oppressor.[11]\n" +
                "9- Imam Sadiq (peace be upon him) said: if I meet him I will be at his service throughout my life.\n" +
                "This was the answer of Imam Sadiq (peace be upon him) when he was asked about the giving birth to Imam Al-Mahdi (may our souls be sacrifice for him) he said:\n" +
                "No, he is not born; if I meet him I will be at his service through out my life.[12]\n" +
                "10- Imam Sadiq (peace be upon him): supplication for the light of Muhammad's family (peace be upon them).\n" +
                "Ibad bn Muhammad Al-Mada'ini said: Verily Imam Sadiq (peace be upon him) raises his hands after Zuhr prayer and supplicates. I inquire from him May my soul be sacrifice for you! did you pray for yourself? He replied: I prayed for the light of Muhammad's family (peace be on them) their leader who will retaliate from their enemies by the command of God.[13]\n" +
                "Indeed, the whole Imams (peace be on them) are lights, their knowledge of luminance is knowing God but according to the statement of Imam Sadiq (peace be upon him) in this tradition the leader of the time (peace be upon him) is a light among the lights.\n" +
                "11- Imam Al-Kazim (peace be upon him): may my father be sacrifice for him, he who for the course of God would not be blame by those that blame, may my father be sacrifice for him, the riser with the command of Allah.\n" +
                "From Yahya bn Nufali, indeed Musa bn Ja'afar (peace be upon him) raise his hands and supplicates after Asr prayer, I inquire from him saying, to whom did you offer prayer for? He said: to Al-Mahdi among the family of Muhammad (peace be on them) and said: may my father be sacrifice for him, he is having big stomach, his eyebrow are very close, his legs are very energetic, his shoulder is wide, brown in colour and close to be yellowish, may my father be sacrifice for him, his night shall guard the stars by his bowing down and prostration to Allah, may my father be sacrifice for him, he whom the blames of those that blame shall not affect him before Allah, he is the luminous lamp, may my father be sacrifice for him, he shall rise with the command of Allah.[14]\n" +
                "12- Imam Rida (peace be upon him):\n" +
                "May my father and mother be sacrifice for him, he was named like my grand father (peace be upon him and his progeny) he resemble me and Musa bn Imraan.\n" +
                "Imam Rida (peace be upon him) utters this statement after he has expounded the difficult affliction that would occur during the occultation of the awaiting Imam (may our souls be sacrifice for him). This tense sedition, the good servants shall fell victim even though they manifested their religiousness and faith, their going astray is part of the reason surrounding the necessitation of Imam's loneliness of the awaiting one (may our souls be sacrifice for him) to the extend the inhabitant of the Heaven and Earth and every free independent people shall cry for him.\n" +
                "Be aware of this tradition that was narrated from the eighth Imam (peace be on him):\n" +
                "There is no doubt for the intense sedition that shall occur where intimate friends shall fell victim, that shall be when the followers lose the third of my descendant, the inhabitant of Heaven and Earth shall lament for him including those that grief. He later said: may my father and mother be sacrifice for him, he shall be named after my grand father (peace be on him and his holy progeny) he is my resemblance and that of Musa son of Imran (peace be on him) he will be on luminous garment, and kindle from the ray of Al-Quds[15]\n" +
                "This type narration was also narrated from the Prophet (peace be on him and his holy progeny).\n" +
                "It was narrated from our master Rida (peace be on him) in his seating a Khurasan, he stood up when the word Al-Qa'im was mentioned and rest his hand on his honourable head and said:\n" +
                "O' Allah! May You hasten his relief and make his coming very easy, he also mentioned some of the significance of his government.\n" +
                "Muhadith Nuri (may Allah have mercy on him) mentioned in his book \"Annajmu Thaqib\" what I have translated into Arabic language: this type of dignity when this name is mentioned is usual between the Shi'ah all over the world especially within the Arabs, none Arabs, Turkish, Indians, and others, even it is also common among our Sunni brothers.[16]\n" +
                "Allamah Amini in \"Al-Ghadeer\" said: it was narrated that when Da'abal read his poems before Imam Rida (peace be on him) and mentioned the Proof (May our souls be sacrifice for him) by his saying:\n" +
                "If not because of he whom I hope for his coming today or tomorrow;\n" +
                "My soul could have cut off due to sadness;\n" +
                "There is no doubt in the coming out of the Imam;\n" +
                "He shall rise by the name of Allah and His blessings.\n" +
                "Imam Rida (peace be on him) lay his hand on his head and respectfully stood up and pray for his quick relief and reappearance.[17]\n" +
                "We concludes this introduction by what has been narrated in \"Tanzihil Khatir\", Imam Sadiq (peace be on him) was asked for the reason for standing up when the world \"Al-Qa'im\" is mention, which is one of the nickname of Imam, the proof peace be on him, he said: because he shall have long occultation and due to his much kindness to his well-wishers, he looks at whoever remembered him with this nickname, as the symbol of his government and lost for his loneliness, it is among respect to him by standing up in humbleness before him and when the great master looks at him with his honourable sight, he should seek from Allah the Majesty, the quick relief and appearance of Imam.[18]\n" +
                "We ask Allah the Most High to make us among those that anticipates for his reappearance, peace be on him.\n" +
                "All praise be to Allah, the Lord of the worlds.\n" +
                "There is no success except from God\n" +
                "MURTADA MUJTAHIDI SISTANI.\n" +
                "----------------------------");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        //start from here

        etitle.add("Imam Ali a.s about Imam Mahdi atfs");
        esrc.add("Nur alThaqalayn v.4 p.110");
        edetails.add("Imam Ali (A), with regards to the Qur’anic verse: “And we desired to show favour to those who were abased…” said, ‘This refers to the progeny of Muhammad. Allah will send them their rightly guided Saviour [the Mahdi] after their struggle, and he will raise their status and abase their enemy.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");





        etitle.add("Imam Sajjad a.s. About Imam Mahdi atfs");
        esrc.add("Bihar-ul-Anwar v.82 p.173");
        edetails.add("Whoever dies accepting our Wilayah during the occultation of the one who will rise up [the awaited twelfth Imam, al-Mahdi], Allah will grant him the reward of a thousand such martyrs as died in the battles of Badr and Uhud.");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");





        etitle.add("Imam Jafar Sadiq a.s about Imam Mahdi atfs");
        esrc.add("Kamal al-Din, p.346, no. 33");
        edetails.add("Imam al-Sadiq (AS) said, ‘The people miss their Imam [Mahdi], but he witnesses the season [of Hajj] and sees them, though they do not see him.'");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");






//Start from Here Today
        etitle.add("Divine savior is assigned to set right all previous deviations, Imam Khomeini explained\n");
        esrc.add("");
        edetails.add("Highlighting the significance of mid-Sh’aban which marks birth anniversary of Imam Mahdi (PBUH), the late founder of the Islamic Republic through a series of historic messages said the divine savior is assigned to set right all these perversions and deviations.\n" +
                "\n" +
                "ID:   63753   09/04/2020\n" +
                "\n" +
                "Imam Khomeini said on various occasions as following: \n" +
                "\n" +
                "Imām Mahdī (PBUH) is assigned to set right all these perversions and deviations. He will bring man from the abyss of depravation. It is said: “He fills the earth with justice after having been replete with tyranny.” (  Sahifeh-ye-Imam, Vol.12, page 409)\n" +
                "\n" +
                "How auspicious is the birthday of the one who is to establish universal justice, for which purpose all the divine prophets (peace be upon them) have been sent!  (Sahifeh-ye-Imam, Vol.14, page 402)\n" +
                "\n" +
                "Then he will reappear and the world will be filled with justice at a time when there is injustice everywhere and that is why he is now hidden from the sight of men. And when he comes with his back towards the Ka'bah's edifice,\n" +
                "\n" +
                "Amir al-Mu'minin said: \"Our Qa'im has an occultation which will be of great devotion... Beware! Everyone who is firm in his religion, and does not become hard-hearted from the lengthening of the occultation of this man (and turn away from his religion) will find himself in the same rank as me on the Day of Resurrection.\"\n" +
                "\n" +
                " Then he said: \"Our Qa'im, when he rises, has no responsibility for anyone's allegiance to him, and for this reason his birth will be secret and he will be hidden.\" 3. Muhammad ibn Muslim said that he heard from Imam Ja'far as-Sadiq (A.S.) that he said: \"If you hear of the occultation of your Imam, do not deny it.\" 4. At-Tabarsi wrote: \"The hadiths of the occultation were recorded by the Shi'ite narrators in books which were composed in the time of Imam Baqir and Imam Sadiq (A.S.). \n" +
                "\n" +
                "The belief in the reappearance of the expected Mahdi (A.S.)the universal reformer is not confined to the Shi'ite Muslims. Other Islamic groups and even non-Islamic groups like the Jews and the Christians and some of the great world intellectual figures believe in the appearance of a great spiritual reformer. In Psalm 37 is written: \"...Trust in the Lord and do good; so you will dwell in the land, and enjoy security. ...For the wicked shall be cut off: but those who wait for the Lord shall possess the land. ...But the weak shall possess the land, and delight themselves in abundant prosperity.\n" +
                "\n" +
                "...The Lord knows the days of the flawless, and their heritage will abide forever. ...For those blessed by the Lord, shall possess the land, but those cursed by Him shall be cut off. ...The righteous shall possess the land, and dwell upon it at peace for ever...\"");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Concepts of divine savior forms basic pillar of all divine religions, Imam Khomeini explained\n");
        esrc.add("ar.imam-khomeini.ir");
        edetails.add("\n" +
                "Imam Khomeini through his theological works and historic speeches stressed that the belief and concept of divine savior and reformer who would spread justice is considered to be a basic pillar of all divine religions. Followers of all divine religions have firm belief and faith in emergence of a divine savior who could relieve the world from clutches of cruelty, injustice and inequality.\n" +
                "\n" +
                "ID:   63744   06/04/2020\n" +
                "\n" +
                "The founder of the Islamic Republic maintains that emergence of the current infallible Imam, who is one of the truthful successor of the holy prophet of Islam, forms essence of particularly Shia Muslims' belief which reminds us of faith, hope, and victory of good powers over evil ones, and ultimate fortune.  \n" +
                "\n" +
                "The promised Mahdi, who is usually mentioned by his title of Imamu'l-'Asr (the Imam of the Period) is the son of the Eleventh Imam. His name is the same as that of the Holy Prophet.\n" +
                "\n" +
                "In a hadith upon whose authenticity everyone agrees, the Holy Prophet has said, \"If there were to remain in the life of the world but one day, God would prolong that day until He sends in it a man from my community and my household. His name will be the same as my name. He will fill the earth with equity and justice as it was filled with oppression and tyranny.\" On the Appearance of the Mahdi:\n" +
                "\n" +
                "In the discussion on prophecy and the Imamate it has been indicated that as a result of the law of general guidance which governs all of creation, man is of necessity endowed with the power of receiving revelation through prophecy, which directs him toward the perfection of the human norm and the well-being of the human species.\n" +
                "\n" +
                "Obviously, if this perfection and happiness were not possible for man, whose life possesses a social aspect, the very fact that he is endowed with this power would be meaningless and futile.\n" +
                "\n" +
                "And the leader of such a society, who will be the saviour of man, is called in the language of the hadith, the Mahdi . In the different religions that govern the world such as Hinduism, Buddhism, Judaism, Christianity, Zoroastrian-ism and Islam there are references to a person who will come as the saviour of mankind. These religions have usually given happy tidings of his coming, although there are naturally certain differences in detail that can be discerned when these teachings are compared carefully. The hadith of the Holy Prophet upon which all Muslims agree, \"The Mahdi is of my progeny,\" refers to this same truth. There are numerous hadiths cited in Sunni and Shi'ite sources from the Holy Prophet and the Imams concerning the appearance of the Mahdi, such as that he is of the progeny of the Prophet and that his appearance will enable human society to reach true perfection and the full realization of spiritual life.\n" +
                "\n" +
                "In addition, there are numerous other traditions concerning the fact that the Mahdi is the son of the Eleventh Imam, Hasan al-'Askari. They agree that after being born and undergoing a long occultation the Mahdi will appear again, filling with justice the world that has been corrupted by injustice and iniquity. As an example, 'Ali ibn Musa ar-Rida (the Eighth Imam) said, in the course of a hadith, \"The Imam after me is my son, Muhammad, and after him his son 'Ali, and after 'Ali his son, Hasan, and after Hasan his son Hujjatu'l- Qa'im, who is awaited during his occultation and obeyed during his manifestation.\n" +
                "\n" +
                "If there remain from the life of the world but a single day, Allah will extend that day until he becomes manifest, and fill the world with justice in the same way that it had been filled with iniquity.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Imam Khomeini: God has preserved The Promised Mahdī (atfs)");
        esrc.add("Sahifeh-ye-Imam, Vol.12, page 408\n" +
                "\n" +
                "ar.imam-khomeini.ir");
        edetails.add("God has preserved The Promised Mahdī in reserve to carry out prophets' mission when God deems fit.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Khomeini: Imam Mahdi (atfs) will bring man from the abyss of depravation.");
        esrc.add("Sahifeh-ye-Imam, Vol.12, page 409\n" +
                "\n" +
                "ar.imam-khomeini.ir");
        edetails.add("Imam Mahdi will bring man from the abyss of depravation. It is said: “He fills the earth with justice after having been replete with tyranny.”  \n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Khomeini: Imam Mahdī (atfs) will spread righteousness");
        esrc.add("Sahifeh-ye-Imam, Vol.12, page 409\n ar.imam-khomeini.ir");
        edetails.add("Imam Mahdī will spread righteousness and the globe will be filled with justice at its various grades.  \n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Khomeini: The issue of the disappearance of the Imām Mahdi(atfs)");
        esrc.add("Sahifeh-ye-Imam, Vol.12, page 408\n   ar.imam-khomeini.ir");
        edetails.add("The issue of the disappearance of the Imām Mahdi is a great matter that makes us to understand “Real justice should be spread in the world in its true sense.”\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Imam Khomeini: The revolution of the Iranian people is the starting point");
        esrc.add("ar.imam-khomeini.ir");
        edetails.add("The revolution of the Iranian people is the starting point for the grand revolution of the IslamicWorld under the stewardship of Hadrat Hujjah.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Khomeini: 15th of Sha'ban Is the Most Auspicious and Significant Eid for Humanity\n" +
                "\n");
        esrc.add("ar.imam-khomeini.ir");
        edetails.add("Imam Khomeini the religious and spiritual leader of the Muslim world frequently used to highlight significance of the 15th Sha'ban, the birthday of twelfth infallible Imam known as savior-and described the event as the most significant Eid for all humankind.The belief for emergence of the contemporary infallible Imam is considered to be a firm pillar of Shia Muslims' beliefs which reminds us of hope, faith, ultimate fortune and victory of good powers. This belief is well- established and confirmed by the holy verses of noble Quran as well. \"And We wished to do a favor to those who were weak (and oppressed) in the land, and to make them rulers and to make them the inheritors.\" (al-Qasas, verse 5)This belief of great significance has been manifested in practical life of the founder of the Islamic Republic during all years of his righteous and sacred life. For an instance, one of his pupils once complained about the ongoing tough condition and circumstances, and expressed his doubts about the imminent victory during years of struggle for the Islamic Revolution. However, the great Imam consoled him and voiced his strong hope for victory despite all obstacles and hurdles.\"We will emerge victorious despite all tough circumstances,\" said the great Imam.The great leader of the Muslim world said elsewhere: \"I am hopeful that the certain day will approach when the promise of God will come true and the oppressed will become inheritors of the earth. These are promises and good tidings of God the Almighty which will never fall short and will fully be fulfilled.\"According to Imam Khomeini, the victory of goodness shows that the universe never stays impartial regarding the good and bad. It also indicates that creator of this world doesn't remain neutral about the occurrences and happenings of this universe.Imam had strong belief that the creator of humankind and all other creatures was managing this universe with a very deep perception and wisdom. For that reason, he sent a historic letter to the former president of the then Soviet union and maintained that the eastern and western blocs were suffering from lack of spirituality and confronted with social moral decline. The historical facts and figures show that the great Imam's prediction came true in this regard within some years. We may easily jump to the conclusion that the belief in emergence of the twelfth Imamthe saviorshould be interpreted as undertaking serious efforts to launch and establish justice across the world's societies. In this sense and context, everybody who takes concrete and solid steps to implement real justice, will be considered closely associated to the infallible savior. For that reason, the great Imam closely allied and linked the Islamic Revolution wit.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: Pray for the reappearance of Imam Mahdi\n");
        esrc.add("Bahjat.ir");
        edetails.add("The sole way of getting rid of difficulties is to pray for the reappearance of Imam Mahdi, peace be upon him, in solitude, not the usual prayers and the movement of the tongue; rather prayers with sincerity and purity of intention, accompanied with repentance.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Agha Bahjat: People that are only for Imam Mahdi\n");
        esrc.add("Bahjat.ir");
        edetails.add("They want people that are only for Imam Mahdi, peace be upon him. Only those who are waiting for the sake of God, and in the way of God, and not for the fulfillment of their personal desires, are those who are really waiting for the reappearance.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Agha Bahjat: Talk about the time of the reappearance of Imam Mahdi\n");
        esrc.add("Bahjat.ir");
        edetails.add("I wish we would sit and talk about the time of the reappearance of Imam Mahdi, peace be upon him, so that we would at least be regarded as those awaiting his reappearance.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: May God sweeten the mouth of all the Shiites with the reappearance\n");
        esrc.add("Bahjat.ir");
        edetails.add("May God sweeten the mouth of all the Shiites with the reappearance of the hidden Imam, peace be upon him! Sweets are foods that are beyond our necessities, but the sweetness of the reappearance of Imam Mahdi, peace be upon him, is of the greatest of necessities.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: Should we not ponder and pray for the arrival of the true reformer?\n");
        esrc.add("Bahjat.ir");
        edetails.add("Should we not ponder and pray with grief and humility for the arrival of the true reformer, and relief for the Muslims, i.e. Imam Mahdi, may god hasten his reappearance? ");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: The Imam himself requests them to pray for the hastening of his reappearance\n");
        esrc.add("Bahjat.ir");
        edetails.add("It is a pity that everyone goes to Masjid Jamkaran for the fulfillment of his or her personal desires, whilst he or she do not know how the Imam himself requests them to pray for the hastening of his reappearance.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: it is not unlikely to inform us that he shall re-appear tomorrow\n");
        esrc.add("Bahjat.ir");
        edetails.add("They have mentioned certain and uncertain signs of the reappearance of the Imam, peace be upon him; but it is not unlikely for them to inform us that he shall re-appear tomorrow. The consequence of this is that alteration of the Divine Will would take place in some of the signs, whilst some of the imminent signs would occur right at the time of reappearance. ");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat Concerning the Love for Imam Mahdi atfs\n");
        esrc.add("Bahjat.ir");
        edetails.add("We are on the verge of drowning in the sea of life, and we are in need of the assistance of God's Wali in order to reach the destination safely. We must seek help from Imam Mahdi, may God hasten his reappearance, so that he may lighten the path for us, and take us with himself, to the destination.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat on Seeking the intercession of the Imam before prayers");
        esrc.add("Bahjat.ir");
        edetails.add("Reforming the prayers means reforming its apparent as well as its inner reality, and refraining from apparent and hidden evils. Amongst the ways of reforming prayers is seeking the intercession of the Imam seriously, just before starting the prayers.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat on The kindness of Imam Mahdi atfs");
        esrc.add("Bahjat.ir");
        edetails.add("Is it possible for our Master, Imam Mahdi, peace be upon him, to be grieved, and for us to be happy; for him to weep because of the afflictions of his friends, and for us to laugh and be cheerful; and despite all of this, consider ourselves his followers?");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("The Real Green Island");
        esrc.add("Bahjat.ir");
        edetails.add("Wherever the Imam is, it is green. The heart of a believer is the Green Island. Wherever he (a believer) is, the Imam treads there.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat on The necessity of having a relationship with the Imam");
        esrc.add("Bahjat.ir");
        edetails.add("Find a way for establishing a relationship with the Imam\n" +
                "Everyone should be worried about his own self and find a way for establishing a relationship with the Imam and for his own aid, regardless of whether Imam’s reappearance is near or close.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Are we thirsty for cognizance and meeting the Imam?");
        esrc.add("Bahjat.ir");
        edetails.add("Indeed, those that are thirsty receive the drop of reunion, and the seekers of beauty are given the drink of eternal life and cognizance. Are we thirsty for cognizance and seek to meet him and he does not give us from the spring of life despite the fact that he is responsible for being just to all and looks after the pain-stricken people of the entire world?");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat on Relation with the Imam");
        esrc.add("Bahjat.ir");
        edetails.add("The sun is to shine even behind the clouds. Imam Mahdi, peace be upon him, is the same, even though he's in occultation! We don’t see him but there were and still are, people who do see him or even if they don’t see him, they have some relations with him.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: Asking for the Most Important Need");
        esrc.add("Bahjat.ir");
        edetails.add("Whoever goes to a sacred place, such as Masjid Jamkaran, for a need, must first ask God for the Imam’s relief, which is the greatest desire of the Imam himself");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Agha Bahjat: the Reason behind the Occultation of the Imam");
        esrc.add("Bahjat.ir");
        edetails.add("We ourselves are the reason behind the occultation of the Imam.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("One of the shining suns");
        esrc.add("Khamenei.ir");
        edetails.add("One of the shining suns—by the mercy, assistance and will of God—that exist in our time as what remains on Earth of God's provision (Baqiatallah fi ardhih), as God's proof to His servants, is the Lord of the Time (Sahib al'Zaman), the Absolute Wali of God on earth. The blessings of his existence and the bright light of his existence continue to reach out to humankind. Today, humankind—with all its weaknesses, aberrations, and afflictions—enjoys the shining rays of this spiritual and divine Sun, which is a descendant of the Ahl-ul-bait (Prophet's lineage). Today the sacred existence of Hazrat al-Hujjat (May our souls be sacrificed for him) among the humans on earth, is the source of blessings, the source of knowledge, the source of brilliance, splendour, and all that is good.  Our obscure, undeserving eyes cannot see his heavenly face closely; but, he is like a shining Sun, connected to hearts and souls. And for any human who enjoys wisdom, there is no bliss greater than feeling that the Friend of God (Wali of God), the justly appointed Imam, the pious servant of God, the chosen servant among all servants of the world, the one who is the address of Divine Caliphate on earth, is with him to accompany him: he sees him and communicates with him. The dream of humankind is the existence of such a lofty entity. The unresolved complexes of humans throughout history looks up, in hope, to the horizon; whereupon, a lofty and chosen man from among the chosen men of God will come to untie the warp and woof of oppression and tyranny, knitted by evil humans throughout history. Today, mankind is afflicted with injustice and oppression more than any time before, but also, the progress that mankind has made is greater today: the wisdom he has gained is more developed. We have approached the time of the reappearance of the Mahdi—Imam of our Time—(may our souls be sacrificed for him), the true beloved one of mankind, because our wisdom has progressed.\n" +
                "\n" +
                "Presently the mind of humankind is ready to understand, to learn, and to know, undoubtedly, that a lofty human will come to save them from the burden of oppression and tyranny. The exact effort that all the prophets made, the exact promise the Prophet of Islam (pbuh) has made to people via the Quranic verse: \"And relieves them of their burdens and the shackles that were upon them,\" [7:157] is expressed. The hand of divine power can make this dream of humankind come true through a heavenly human, a divine human, a human connected to worlds of mystery, spirituality, and worlds that are not understandable to shortsighted humans like us. Hence, the hearts, the enthusiasm, and love are attracted to that point; and, every day they grow more attracted than the day before. The Iranian nation, enjoys a great privilege today: the atmosphere of the country is an atmosphere of Imam Mahdi (aj). Not only Shias across the world, but all Muslims are awaiting the Promised Mahdi. The privilege of the Shia is that they know this divine and certain promise made to all Muslim nations as well as followers of all religions, by name, attributes, characteristics and birth date. Many of our great scholars have personally met with this beloved (Imam) of hearts of the admirers during his occultation; many have made a pledge to him in person; many have heard from him some heartwarming words; many have been caressed by him and many others have received his kindness, care, and love without having recognized him. On the battlefield, of the imposed war on Iran, there were many young men who felt a spiritual and bright presence at their most crucial moments: they sensed and received an assurance in their hearts without recognizing and knowing the source. The same is true today.\n" +
                "\n" +
                "\n" +
                "Ayatollah Khamenei, November 23, 2008");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Mahdi’s birth anniversary is a manifestation of optimism about the future\n");
        esrc.add("Khamenei.ir");
        edetails.add("The 15th of Sha'ban is the embodiment of our hopeful outlook towards the future. All the hope that we invest in something may or may not have the outcome that we hoped for; however, the hope towards the final salvation by the absolute Wali [representative of God] of the Almighty God— the Imam of the Time (may God hasten his reappearance, and may our souls be sacrificed for his sake) — is an inviolable hope... It is not only Shi’as that have made this claim; it is not only Muslims that have made this claim: all religions of the world are waiting for such a day to come. Our privilege is that we know him: we feel his existence; we believe in his existence; we speak to him; we address him; we make requests to him and he grants us our requests. This is the difference between us and others. Others —non-Shia Muslims and non-Muslim believers — believe in something that is vague; however, this is not the case with us Shi’as. It is clear what we want and whom we speak to. The 15th of Sha'ban is a day of hope.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Seeking intercession from Imam Mahdi (a.s.) is a means for expressing obedience to God\n");
        esrc.add("Khamenei.ir");
        edetails.add("As for the Imam of the Time (may God hasten his reappearance and God's greetings b upon him), the first point is that the great personality is the inviter to God. Looking at that great Imam (a.s.) is a way of expressing one's love for and obedience to Allah the Exalted: \"greetings be upon you who invite to God and who are conversant with His signs\" [Ihtijaj, Vol.2, page 493]. All matters, all prophets, all saints, all sanctities and all pure souls who cast light on our lives, on our world and on the entire universe are the signs and reflections of God. This is a point that should receive attention. We pay attention to the Imam of the Time (a.s.), and we appeal and show humbleness before that great Imam (a.s.) so that this humbleness reaches the Essence of the Only One and so that we show our obedience to Allah the Exalted.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("The greatest quality of belief in Mahdawiyyah is creating hope\n");
        esrc.add("Khamenei.ir");
        edetails.add("The greatest characteristic of this belief among Shias is that it engenders hope. The Shia community is not reliant only on its prominent historical events in the past. It also looks forward to the future. A person who believes in the issue of Mahdawiyyah on the basis of Shia ideology does not empty his heart of hope even in the most difficult circumstances. There is always a ray of hope in the heart of such a person. They know that this dark era and this era of oppression and illegitimate domination will definitely come to an end. This is one of the most important results and achievements of this belief. Of course, Shia belief in the issue of Mahdawiyyah is not confined to this point: \"People all over the world feed from his blessings and the heavens and the earth gain strength thanks to his existence\" [Commentary on Usul al-Kafi, Vol. 1, p. 4]. Such is the belief in Mahdawiyyah. This bright flame and this shining light has existed in Shia societies in the course of past centuries and it will continue to exist. By Allah's favor, the era of anticipation will come to an end.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Belief in the Savior is a component of religions’ worldviews\n");
        esrc.add("Khamenei.ir");
        edetails.add("Belief in the Imam of the Time (a.j.) is a component of religions’ worldviews. That is, just as divine religions hold viewpoints within their general worldviews about the universe, mankind, origin and the end of human life’s trajectory—about genesis and resurrection—they also hold viewpoints in their worldviews about the final destination of the caravan of humans. A worldview is a great system which lays the foundation for all the thoughts, obligations and rules of religions. It addresses the issues of the afterlife and the hereafter. Another issue is where the mankind is heading to. If we liken the human community throughout history to a caravan which is taking a specific path, then we are faced with this question: Where is this caravan going? What is the destination of this caravan? What is the end of this path? This is a serious question and every worldview should answer it. Religions have answered this question... all of them believe that this caravan will reach a favorable, sweet and pleasant destination in the end. The main characteristic of this destination is justice. Justice has been humanity's general request from the first day until today and it will remain mankind’s main request until the end. Those people who try to believe in variety, diversity and change in their principles and main philosophies cannot deny the fact that humanity has had certain requests from the first day until today, the most important of which is justice. Humanity is after justice. It has never changed its mind about this demand and in the end, this demand will be met.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Self-edification is a prerequisite to awaiting\n");
        esrc.add("Khamenei.ir");
        edetails.add("Awaiting requires that we prepare ourselves. We should know that a great event will take place and we should always expect it to happen. We can never say that the event will not happen in a few years nor can we say that the event will happen in the near future. We should always wait for it. Those who are waiting should develop characteristics and manners that are expected in the awaited era. This is the requirement for awaiting. If there is supposed to be justice, truth, monotheism, purity and submission to God in the awaited era, then as the people who are waiting, we should get closer to these qualities. We should become familiar with justice. We should prepare ourselves for justice. We should prepare ourselves for accepting the truth. These are the consequences of awaiting.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Without Mahdawiyyah, all efforts by the all prophets will turn futile\n");
        esrc.add("Khamenei.ir");
        edetails.add("If Mahdawiyyah did not exist, it would mean that all the efforts by divine prophets, all prophetic missions, all the strenuous efforts of divine prophets were futile. Therefore, the issue of Mahdawiyyah is an essential issue. It is one of the central divine teachings. For this reason, as far as I know, in all divine religions, there are teachings which are essentially the equivalent to Mahdawiyyah. However, these teachings have been distorted and blurred over time and it is not clear what they are trying to say. The issue of Mahdawiyyah is among the undeniable Islamic realities. That is to say, Mahdawiyyah is not limited to Shia Islam. There is a consensus among all Islamic denominations on the end of the days-- which includes when Imam Mahdi (may God hasten his re-appearance) establishes ultimate justice in the world. There are valid narrations [confirming that] by the Holy Prophet (s.w.a.) and Islamic luminaries from different denominations of Islam. Therefore, there is no doubt in this regard. However, Shia Islam has an advantage among other denominations; because the issue of Mahdawiyyah is not an ambiguous issue in Shia Islam. The issue of Mahdawiyyah is not a convoluted issue; it is not complicating to understand. It is clear. Mahdawiyyah has an epitome and we are familiar with this epitome. We know his characteristics. We know his ancestors. We know his family. We know when he was born. We know the details. And this familiarity is not based on Shia narrations alone. There are non-Shia narrations that clarify the details for us. Followers of other Islamic denominations should pay careful attention in order to understand this clear truth.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("The time after the reappearance of Imam Mahdi is the time of the true rule of spirituality and religion over mankind’s life\n");
        esrc.add("Khamenei.ir");
        edetails.add("The topic of Mahdawiyyah is among the main topics in the cycle and set of noble religious knowledges; such as the topic of Prophethood. That is, it is comparable to prophethood: this is the importance that we should attach to the issue of Mahdawiyyah. Why? Because Mahdawiyyah represents what all prophets were sent for - namely, building a monotheistic world on the basis of justice using all the capacities that Allah the Exalted has bestowed on humanity. This is the era that will come after the reappearance of Imam Mahdi (God's greetings be upon him and may God hasten his re-appearance): the era in which monotheism and genuine spirituality will be dominant over the entire life of human beings, the era in which justice will be established in the real sense of the word. Well, this was what prophets were sent for.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Who is the promised Imam of the Shias and the Savior of the world? Is the belief in him logical?\n");
        esrc.add("Khamenei.ir");
        edetails.add("The Shias are awaiting the arrival of the promised savior-- Imam Mahdi (a.s.) -- and are not lost in their fantasies; they are searching for an existing reality. He is alive and lives among the people. He sees people. He can feel their sufferings. Those who are lucky enough and have the capacity sometimes meet him without recognizing him. He does exist. He is a real human: a known being with a given name; his parents are known and he lives among the people and with them. This is how our—the Shias’—belief is. And the followers of other faiths who do not believe in this reality have never been able to provide any logical reasons to reject this belief. There are several obvious and strong reasons, also accepted by Sunni Muslims, which are a testimony to the existence of this exalted servant of God. All these reasons provide evidence that Imam Mahdi (may our souls be sacrificed for his sake) is living among us - and we are all aware of his characteristics. This is what has been cited in many non-Shia sources as well. The birth date of the pure-hearted son of Imam Hassan al-Askari (a.s.) is known to everyone. His miracles and those who are connected with him are also known to us. God Almighty has granted a long life to him. These are the characteristics of the Imam of the Time (may our souls be sacrificed for his sake) whom all the nations of the world, all ethnic groups, and people from all faiths and races have been impatiently waiting for at all times. These are the beliefs of Shia Muslims about this important issue.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("What is meant by faraj [salvation]?\n");
        esrc.add("Khamenei.ir");
        edetails.add("One important point regarding the issue of Mahdawiyyah is that in the Islamic and Shia belief systems, waiting for the arrival of Imam Mahdi has been interpreted as waiting for salvation. What does salvation mean? It means being saved. When do we usually yearn for salvation? We do so when we are in a difficult situation, and when there is a problem. When we face problems, we are in need of salvation - that is someone who can solve our problems and save us. This is an important point. The true meaning of waiting for a savior is that those who believe in Islam and the religion of the Prophet's household (a.s.) identify the problems of humans in the modern world. This is what they should actually do. They are waiting for the problems of humanity to be solved. The issue is not limited to my or your problems only. The Imam of the Time (may our souls be sacrificed for his sake) will come to solve the problems of humanity. He will come to save humanity forever. This means that those who are waiting for the arrival of Imam Mahdi are discontent about the current situation of the world - the unfair situation of the world in which many innocent people are oppressed, many are misled, and many others do not find the opportunity to worship God. Waiting for the arrival of Imam Mahdi means opposing the current situation that is prevalent in humans' life, and which has been caused due to the prevalence of ignorance and carnal desires in humans' life. This is the true meaning of waiting for the arrival of Imam Mahdi.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Hopefulness and justice: two prominent qualities of awaiting the Savior\n");
        esrc.add("Khamenei.ir");
        edetails.add("One quality of the 15th of Sha'ban and the birth anniversary of the Imam of the Time (may our souls be sacrificed for his sake) is hope and justice. There are two outstanding points in our anticipation and our celebration of 15th of Sha'ban. One is the issue of raising hopes about this birth and the future that humanity is waiting for as a consequence of this birth. This is a source of hope. Another is that in the world that will be created after the reappearance of that great Imam (a.j.), the most prominent characteristic is justice. When you take a look at all the narrations and ahadith that have been narrated about that great Imam (a.j.) and that era, you see that the main focus is not on people's piety. Of course, people will be pious and religious in that era, but the main focus is on the fact that people will benefit from justice at that time and that justice and equality will be established. This matter exists in all supplications (duas), prayers and narrations about that great Imam (a.j.). That is to say, an outstanding feature in that promising future is justice, as humanity is thirsty for justice.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Which society can receive the Promised Mahdi (a.s.)?\n");
        esrc.add("Khamenei.ir");
        edetails.add("It is nonsensical to say Imam Mahdi (a.s.) will come and do the work. What is your duty today then? What should you do today? You should prepare the grounds so his excellency can come and act in the prepared grounds. It is impossible to start from scratch. A society can receive the Promised Mahdi (Our souls be sacrificed for him) that is prepared and has the potentials; otherwise, it will end in the same way as the efforts of prophets and Imams throughout history did. Why did many of the messengers of God come but couldn't rid the world of evil? Because they lacked prepared grounds... Then, if Imam Mahdi (a.s.) reappears in an unprepared society, the result will be the same! Preparation is needed. How does the preparation happen? It can happen in the forms you already see in your own society. Today, in the Islamic Iran, there are cases of spiritual accomplishments, which are unparalleled in the world, as far as we know and are informed – and we are not unaware of the world.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("By acting according to Islamic laws, we should prepare the ground for the reappearance\n");
        esrc.add("Khamenei.ir");
        edetails.add("We will be considered as truly awaiting the Savior only when we prepare the ground for it. For the reappearance of the promised Imam Mahdi (may our spirits be sacrificed for him) the ground needs to be prepared. And that is achievable by acting upon Islamic laws and the rule of Qur'an and Islam. As I said, it is narrated that: by God, you will be tested, and by God you will be sifted. This great trial which faces the followers and the Shia of Imam Mahdi (may our spirits be sacrificed for him) is a test of making efforts for fulfilling the rule of Islam. You must endeavor for the fulfillment of the rule of Islam. Our great nation made this one step. I must say, in this city of Qom-- which is the birthplace of resistance and revolution, and in this holy place which has witnessed long devoted efforts and endeavors for God, during the movement, before and after the revolution-- that the first step for the rule of Islam and for Muslim nations to get nearer to the time of reappearance of Imam Mahdi (may our spirits be sacrificed for him and may God hasten his reappearance) was taken by the Iranian nation. And that is, establishing the rule of Qur'an. This is what the materialistic world would not want to believe. After centuries of trying to outdo religion, and especially the holy religion of Islam, they would not want to see that this religion has appeared on the world scene, governing a country, attracting and pulling nations towards itself. That is why the animosity of imperialism, enemies of religion, and the fronts of Arrogance, heresy and paganism started to counter the Islamic Republic.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Why does the whole of the mankind await the reappearance of the Savior?\n");
        esrc.add("Khamenei.ir");
        edetails.add("Imam Mahdi (a.s.) is the key to justice and the symbol of divine justice on earth. As a result, all the humanity look forward to his Excellency’s reappearance, in one way or another. Well, Muslims have precisely identified this great awaiting, and the Shia have clear and detailed information about the redeemer. So the matter of awaiting Imam Mahdi, from this perspective, is not only specific to Shia, and not even only to Islam. Rather, it represents awaiting among people from all walks of life and all nations of the world. It represents hope in the hearts of humanity: history of humankind moves toward improvement. This hope gives power to bodies, light to the hearts, and determines that every move towards seeking justice is aligned with the natural direction and order of the world and human history. Consequently, before the revolution when our nation was fighting, they felt like they were advancing toward the ideal of humanity. Similarly, after the revolution, the Iranian nation feel like every move and action they take, every fight and hardship they endure, is directed towards a goal which is shared by all the humans and all the believers. The purpose is to establish justice and the goal is to achieve justice for all the humans. Islam will provide this justice.\n" +
                "\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Aghae Khamenei on Imam Mahdi(atfs)");
        esrc.add("Islamic Pulse Official Channel");
        edetails.add("As a people awaiting the Imam Mahdi (A) (the Savior), we should establish and build our lives directed upon the same path of our Imam (May hundreds of greetings and praise be upon him and may God hasten his return), today. Of course, we are too trivial to construct the same establishment that the divine friends of God made or will make, but we should work hard towards that path.\"\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");













        etitle.add("Becoming Distressed before the Reappearance");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("Reading the stories about the Household of the Prophet (‘a) and the details of their lives, increases our affection for them. However, not much information has been narrated from the Imam of the Time (‘a.j.) who has always been in Occultation. Instead, we should use our power of thinking more! For example, let’s think some about the amount Imam_Mahdi (‘a.j.) loves us. Why does he review the file of our actions every week? Is it due to his curiosity? Or, is it due to his fondness for us, like kind parents who care about their child’s educational status? Let’s not pass on this subject that easily. Let’s think about it. If we spend time thinking about this, it can transform us and increase our love for the Imam (‘a.j.).");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("How can we increase our affection for the Imam of the Time (‘a.j.)?");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("In the Holy Qur’an, the Almighty God says, “We shall test you with something of fear and hunger, and a decrease in goods, life and fruits. Give glad tidings to the patient.” [Qur’an 2:155] The traditions have said this verse is mainly about events before the Reappearance of the Imam of the Time (‘a.j.). The tests in this verse happen at the end of time, before the Reappearance of Imam Mahdi (‘a.j.) There are tribulations, which bring widespread fear. They cause deaths. They cause widespread financial problems. There are floods and devastation, which we can see in natural occurrences in the world. Why should these tribulations be so widespread before the Reappearance? Why should the introduction to the Reappearance be tribulations? A very important philosophy behind this, and we can see its wisdom in this widespread disease, is that human beings should understand the need for the management of God’s Guardian for the world. People should gain preparedness and acceptance of the governance of the Guardian from God. Even the murder of one oppressed person is important for the Almighty God. “When the buried female infant is asked for what crime she was slain.” [Qur’an 81:8-9] In the verses of the Holy Qur’an, God explicitly indicates that on the Day of Judgment He will line up billions of people. One of the key questions there is about for what crime that child was slain. This shows how important oppression is for the God of the universe. We human beings easily pass by oppression. We easily pass over the bombing of the oppressed people of Yemen. We easily pass over these. But, the Almighty God doesn’t pass over these. Understanding the necessity of the guardianship of the “Great Guardian from God” is not easy for many people, unless they understand the necessity of the guardianship of the “Great Guardian from God” with these widespread tribulations. Yes, the believers and knowledgeable people understand this necessity when they see one oppression somewhere. In the same way that we feel the need for the existence of the Imam because of this disease, they feel the same amount of need when they see ignorance in the world. In addition to the believers, how can the public understand this necessity? This is not something simple. This is why with widespread tribulations people must understand the necessity of the presence of the “Great Guardian from God” in the world and his governance. In the same amount that we deprive people from knowledge and spreading knowledge about the necessity of the governance of the Guardian from God, these tribulations will come instead. Do we want these tribulations to be less? We should look at the philosophy behind tribulations. The philosophy of tribulations is nothing but for people to understand that the management of the world by these corrupt people is impossible. What should we do for this oppression to be eliminated? The Guardian from God should become the ruler. The “Great Guardian from God” should govern the world.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Two Important Features of the Lifestyle in a True Islamic Civilization");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("There will be two important features of people’s livelihood and lifestyle during the reign of Imam Mahdi (‘aj) and in a true Islamic civilization. Firstly, people will participate substantially in administrating their own affairs. Secondly, people will be coordinated and organized. It is this cooperation of the people, which gives them the power and ability to administer affairs. \n");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("That which Is Needed to Establish Imam Mahdi’s (‘aj) (Mahdawi) Government  \n");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("That which is needed for the government of Imam Mahdi (‘aj) to be established is to reach growth and rationality in collective life. This collective life should be in such a way that people become powerful and manage their own affairs. For now, humankind is deceived by meaningless slogans like democracy and empty claims like freedom and human rights. Humankind is the captive of the promises of hypocritical and oppressive powers");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("The Time of the Appearance of Imam Mahdi (‘a.j.)\n");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("A tradition says, “When the Imam appears, the believers will say, ‘We didn’t expect it to be this soon.’” Who will say this? You and I will say it.\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("God forbid you should say in the future, 'I did not have any role in the Reappearance of the Saviour!'");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("A person who looks at phenomena from above becomes active and considers the future. \n" +
                "God forbid you should say in the future, “I did not have any role in the Reappearance of the Saviour!”\n" +
                "\n" +
                " Perspective (5)\n" +
                "\n" +
                "One of the parts of a good #perspective is that a person should be able to look at things from above and not become drowned in the phenomena. If a person looks at phenomena from the outside, he/she will see the agents and effects of any phenomenon. He/she will be able to distinguish its roots and consequences. \n" +
                "\n" +
                "If we look at the process of how feelings for #Imam_Husayn (‘a) become strong in the hearts of people from the outside, we can understand that Imam Husayn (‘a) will take over the world. And, we can feel how close we have come to the #Reappearance of Imam Mahdi (‘a.j.)\n" +
                "\n" +
                "When some people go on the #Arbaeen walk, they become drowned in the event itself and do not look at the totality of Arbaeen from the outside. Therefore, they do not understand its greatness. \n" +
                "\n" +
                "If you feel that the world is rapidly moving towards Imam Husayn (‘a), you will be careful not to be left behind this caravan. You will become avid to catch up to it. God forbid you should regretfully say tomorrow, “I did not have any role in the Reappearance of the Saviour, or I only had a small role!”\n" +
                "\n" +
                "A person who looks at phenomena from above becomes active and considers the future. It depends on your way of looking at things for you to become avid and enthusiastic to act. Especially today, when you see the process and the speed with which the truth is winning, you will become avid not to be left behind and to put more effort.\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Our Relationship with the Imam of the Time (‘a.j.)\n");
        esrc.add("Agha Alireza Panahian Official Page-Famous Iranian scholar of Islamic studies & ethics, especially among youth & collogue students\n");
        edetails.add("The same relationship, which exists between a mother and her baby, exists between the Imam of the Time (‘a.j.) and us too. We need to look deeply within ourselves to find this relationship and our need for the Imam, and then we will find him. Until we come to be in the presence of the Imam (‘a.j.) we will be restless, and no matter how much we deceive ourselves, we will not reach ultimate calmness.\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Is it possible for a sinful person, to see the Imam of his time Imam Mahdi (AJ)?");
        esrc.add("Maulana Nusrat Abbas Bukhari Official Page");
        edetails.add("Ayatollah Bahjat (a.r.) was asked:\n" +
                "Is it possible for a sinful person, to see the Imam of his time Imam Mahdi (AJ)\n" +
                "\n" +
                "He answered:\n" +
                "Shimr (who killed Imam Hussayn A.S.)  also saw the Imam of his time, but could not recognize him...\n" +
                "\n" +
                "Allahumma Arrifni Hujjatak...\n" +
                "O Allah! bless me with the recognition of your Hujjat..!\n" +
                "(Dua-e-Marefah)");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Why are we unable to see Imam Mahdi?");
        esrc.add("Maulana Nusrat Abbas Bukhari Official Page");
        edetails.add("Once a student of Allamah Tabatabai asked him to briefly explain the reason why he couldn't see Imam Mahdi. \n" +
                "Allamah Tabatabai told him to turn his back to him and asked: \"Can you see me now?\"\n" +
                "Student: \"No\"\n" +
                "Allamah: \"Why?\"\n" +
                "Student: \"Because I have turned my back to you.\"\n" +
                "Allamah: \"This is exactly what we have done to Imam Mahdi.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Why dont we link the work we are doing to the Imam (AJF)?");
        esrc.add("Maulana Nusrat Abbas Bukhari Official Page");
        edetails.add("Why dont we link the work we are doing to the Imam (AJF)?  We don’t need to do anything new, we can be the top in our profession for the sake of the Imam (AJF).\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Qasem Soleimani & the Rising of Imam Mahdi (A)");
        esrc.add("Islamic Pulse Official Channel");
        edetails.add("We are living in incredibly exciting times. The mainstream media, American politicians, their mouthpieces and social media platforms are all putting their best efforts into attempting to quash the truth. They’re failing. Despite their best efforts to defame Qasem Soleimani, their clichéd repetition of ‘terrorist! terrorist!’, as well as their continuous insistence that Iranians hate the Islamic Revolution - all these clichéd slogans are failing and people globally have recognised the truth. The world should know that with the martyrdom of Qasem Soleimani and the subsequent events that transpired, the world has witnessed the ‘Days of Allah’, never to be forgotten and always to be recognised. The movement of Imam Mahdi (A) has already begun and victory is assured for those on the path of the Islamic Revolution… the only question is, where do YOU stand in the fight for justice, freedom and humanity? ");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Message of maulana Abid Bilgrami sahab from a majlis in Tajpur Ahemdabad.( Roman Urdu )\n");
        esrc.add("A Majlis by  Maulana Abid Bilgrami");
        edetails.add("Zulm ke khilaf protest karo jab shezadi Fatema s.a. ne darbar me unke haq ke liye gayi tab kya unko pata nahi tha ke unka haq nahi milega .unhone hame zulm ke khilaf aawaz uthana shikhaya he.sheikh nimr ki sahadat aur aale saud KA zulm dunya ko Batao.\n" +
                "\n" +
                "Waledayn ki izzat aur aheteram karo unke samne kyu na karo. Jo ma bap ki izzat nahi kar sakta vo Imame Zamana a.t.f.s ki izzat kese karpayega.\n" +
                "\n" +
                "Nahjul balagah imam ke sayings padho. Roz ek page hi kyu na padho par imam ke saying padho aur usse ilm hasil karo.\n" +
                "Music,shave karne se bacho.\n" +
                "\n" +
                "Ayatullah ne apni puri life hadees ko jama karne me aur book likhne me bitayi he jab aaj ke zamane ki pen nahi thi syahi se book likhi he .vo bhi vo zamane me jab zaalim badshah the aur imam Ali ke shia ko katl kar dete the.unki book ko padho aur film hasil karo.\n" +
                "\n" +
                "Taqleed zaruri he  taqleed to badal bhi sakte he Imam ki itaat hoti he taqleed nahi Imam ko kese badloge so ye taqleed ke khilaf propaganda se bacho.\n" +
                "\n" +
                "Hasad na karo hasad gunahe kabira he aur tumhe barbaad kar dega. Balki dua karo ke mere bhai ko Allah ne diya Allah usko aur zyada de aur tumhare paas Jo bhi he uska shukr karo.\n" +
                "\n" +
                "Masomeen ki ziarat ko jao pese bachao nahi agle saal jaunga ye sochte ho tumhe pata he agle saal tum zinda rahoge ya nahi Imam kisika rakhte nahi .Jo ek roti ke badle untoo(camel)ki katar deta he vo tumko bhi tumhare kharch se zyada dega.\n" +
                "\n" +
                "Youth ke liye paigaam social network se Islam ko promote karo Masomeen kay hadees forword karo aur koi aisa kaam mat karo social networking par jo haram hai aur tumhey tumharey Imam say door karrey.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");













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

            s=utitle.get(i);
            res="";
            for(int j=0;j<s.length();j++)
            {
                if((s.charAt(j)>='A' && s.charAt(j)<='Z' )|| (s.charAt(j)>='a' && s.charAt(j)<='z')){
                    if(j==0 || s.charAt(j-1)==' ')res+=Character.toUpperCase(s.charAt(j));
                    else res+=Character.toLowerCase(s.charAt(j));}
                else res+=s.charAt(j);
            }
            utitle.set(i,res.trim());

        }
        Intent intent=getIntent();
        String d=intent.getStringExtra(MarefatActivity.MSG);
        if(d!=null)
        {
            Intent intent1=new Intent(this,MarefatNextActivity.class);
            intent1.putExtra(MarefatActivity.MSG,d);
            startActivity(intent1);
            finish();

        }




        JSONArray arr=new JSONArray();

        try{
            Log.d("myapp1",Integer.toString(etitle.size()));
            for(int i=0;i<etitle.size();i++)
            {
                String x=utitle.get(i);
                if(x.equals("Sorry Not Available"))utitle.set(i,"");
                JSONObject obj=new JSONObject();
                obj.put("english",etitle.get(i));
                obj.put("urdu",utitle.get(i));
                obj.put("edetails",edetails.get(i));
                obj.put("udetails",udetails.get(i));
                obj.put("eref",esrc.get(i));
                obj.put("uref",usrc.get(i));

                arr.put(obj);
            }


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
                obj.put("english",res);

                arr.put(i,obj);



            }catch(Exception e){}

        }

        final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MarefatActivity.this, arr);
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
