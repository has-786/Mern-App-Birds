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

import com.example.myapplication.adapterMeet.RecyclerViewAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MeetActivity extends AppCompatActivity {
    public static final String MSG="com.example.myapplication.MEET";
    public static final String MSGlink="com.example.myapplication.MEETlink";

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
        getSupportActionBar().setTitle("Meetings With Imam"); // for set actionbar title
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


        etitle.add("Introduction");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("Meeting with Imām al-Mahdī (a) in the period of the Major Occultation has been a challenging issue for the Shi'as. Many Shiite scholars have talked about their meetings with Imam al-Mahdi (a) during the Major Occultation. However, some other scholars, such as al-Nu'mani, believe that it is impossible to meet the Imam (a) during the Occultation. The most important evidence in this regard is the last tawqi' by Imam al-Mahdi (a) addressed to his fourth deputy according to which whoever claims to have met the Imam (a) is called a liar. Some people believe that this is restricted to those who claim that they met the Imam (a) along with being his deputy or representative. Some hadiths have recommended supplications and practices for meeting Imam al-Mahdi (a), and there are hadiths according to which it is possible for special followers of the Imam (a) to have contact with, and meet, him. Some scholars, such as al-Shaykh al-Saduq and al-Shaykh al-Tusi have devoted particular chapters of their books to stories of people who have met the Imam (a) and have explicitly confirmed the possibility of meeting him. People who are said to have met Imam alMahdi (a) include: Mirza Muhammad Husayn Na'ini, Sayyid b. Tawus, Ibrahim alKaf'ami, Muhammad Taqi al-Majlisi, Abu lHasan Sha'rani, al-Shaykh al-Hurr al-'Amili, al-Muqaddas al-Ardabili, Mirza Muhammad Astarabadi, al-Shahid al-Thani, al-Sayyid Bahr al-'Ulum, al-Sayyid Ni'mat Allah al-Jaza'iri, and al-Shaykh Murtada alAnsari.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("The Meaning of Meeting");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("During the Major Occultation, it is possible for some people to see Imam al-Mahdi (a) without knowing him. It is also possible to see him in one's dreams. There is an agreement among the scholars that these two types of meeting are possible. What has always been subject to disagreements is meeting with the Imam (a) during the Major Occultation while recognizing him as Imam al-Mahdi (a) either during or after the meeting. There is a disagreement The Meaning of Meeting about the possibility of such a meeting among Shiite scholars. There are also discussions about having contacts with the Imam (a) through revelations and spiritual journeys and their reliability for religious beliefs or jurisprudential rulings.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Before the Major Occultation");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("There is an agreement among scholars about the possibility, and even occurrence, of meeting with Imam al-Mahdi (a) before the Major Occultation, both during the Minor Occultation and before it. In Shiite books of history and hadith, such as alKafi, al-Irshad, I'lam al-wara, Kamal al-din, alBefore the Major Occultation Ghayba by al-Shaykh al-Tusi, and al-Ghayba by al-Nu'mani, some people who managed to meet with Imam al-Mahdi (a) before the Minor Occultation and their stories are mentioned. They include Hakima bt. Imam al-Jawad (a), the paternal aunt of Imam alHasan al-'Askari (a) who witnessed the birth of Imam al-Mahdi (a). Other people have also been mentioned as those who met Imam al-Mahdi (a) before the Minor Occultation, such as Ahmad b. Ishaq b. Sa'd al-Ash'ari, Sa'd b. 'Abd Allah al-Ash'ari al-Qummi, Ibrahim b. Muhammad b. Faris al-Nishaburi, and Ahmad b. Hilal. It is reported in Shiite sources that during the sixty nine years of the Minor Occultation, several people other than the Four Deputies met Imam al-Mahdi (a), including Ibrahim b. Idris, 'Ali b. Ibrahim b. Mahziyar, Ahmad b. Ishaq al-Ash'ari alQummi, Muhammad b. Isma'il b. Musa alKazim (a), Muhammad b. Ja'far al-Himyari, and some other figures from Qom.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("During the Major Occultation");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("There are two views about meeting with Imam al-Mahdi (a) during the Major Occultation. Some people believe that it is possible and has occurred as well. The During the Major Occultation view was first propounded by al-Sayyid alMurtada and then became popular among recent scholars. It was also propounded by al-Muhaddith al-Nuri, al-Karajuki, and alShaykh al-Tusi. According to al-Sayyid alMurtada, it is possible for divine saints to meet with Imam al-Mahdi (a). It seems that initially it was only the possibility of such a meeting which was at issue, but since the time of Sayyid b. Tawus (d. 664/1265) when the stories of such meetings were reported, its occurrence became certain, although some of the stories go back to earlier times. For example, the first story is that of Ibn Qulawayh (d. 367/977) in 339/950. In some hadiths, supplications and practices are mentioned for meeting with Imam alMahdi (a). Many scholars wrote works in this regard and there are many accounts of people who claim to have met with Imam al-Mahdi (a). However, some other Shiite scholars maintain that it is not possible for the Shi'as to meet with Imam al-Mahdi (a) during the Major Occultation. One of the most significant arguments for this view is the last letter of Imam al-Mahdi (a) addressed to the Fourth Deputy in which he referred to people who claim to meet him as liars. Thus, according to the Imam's (a) command, any claim to meet him should be rejected.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Letter of the Imam of the Time (a.s.) to Shaykh Mufeed\n");
        esrc.add("Bihar al-Anwar, V.53, P.175\n");
        edetails.add("In the name of Allah, the Beneficent, the Merciful.\n" +
                "So to say: Peace be on you, O friend who is sincere in the religion of Allah (SwT) and is successful in certainty in us. We are thankful for our existence to Allah (SwT), except Whom there is no God. And we ask Allah (SwT) for blessings and mercy upon our Prophet Muhammad (S) and the Progeny of Muhammad (S). And may He always give you divine opportunity to help the truth and increase your rewards for speaking up in our favor.\n" +
                "We announce that we have been permitted to honor you with our letter and entrust you with responsibility of our friends who are present around you. May Almighty Allah (SwT) befriend them due to His obedience and may He suffice them in their important matters. May the Almighty Allah (SwT) help you against the pledge-breakers who have gone out of the religion of God. Then consider what I am explaining to you and convey it to those whom you trust, if Allah (SwT) wills.\n" +
                "If we are in such a position that we are away from the habitations of the oppressors and it is due to hidden wisdom that the Almighty Allah (SwT) has considered best for us and the believer followers of us, till the material wealth is in control of the transgressors. Inspite of all this we are perfectly cognizant of all your affairs and problems and nothing regarding you is hidden from us.\n" +
                "We have received information about the disgrace and humility suffered by you all due to most of you acting in opposition to the ways of your predecessors, regarding which you may not have received any information. And that we are concerned about you and we do not forget you and if this attention and favor had not been there, poverty and tension would have befallen you and your enemies would have destroyed you.\n" +
                "Therefore fear the Almighty Allah (SwT) and help us to save you from this mischief. Anyone whose death is near shall be killed in this mischief and one who has obtained his desire shall remain safe and this mischief is a sign of distance and proximity of our commands and prohibitions. Although the Almighty Allah (SwT) would perfect His light even if it is detestable to the disbelievers. Remain attached to dissimulation and keep away from stoking the fire of ignorance…\n" +
                "At the end he writes: This letter is for you, O sincere brother and friend. O loyal friend. May Allah (SwT) protect you. Keep this letter in safe custody and do not show it to anyone. Though you may convey the points mentioned therein to those whom you trust. And persuade them to act upon it, if Allah (SwT) wills.\n" +
                "And may Allah (SwT) bless Muhammad (S) and his Purified Progeny.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Grief for Imam Husain (as)");

        esrc.add("Mikiyaalul Makarem volume 2 page 75");
        edetails.add("\n" +
                "At the outset, it must be mentioned that there is a unique relationship between Imam Mahdi (as) and Imam Husain (as) – Imam Mahdi (as) is the one who will seek the revenge of Hazrat Imam Husain (as) on his reappearance. Imam Mahdi (as) is the lone successor from the children of Imam Husain (as) who is yet alive.Allamah Bahrul Uloom who was one of the greatest Shiite scholars used to travel a short distance from Karbala on the day of Ashurah to welcome the mourners along the way.\n" +
                "\n" +
                "Once his students saw that the Allamah, despite his position as a scholar and his respect amongst the people, began to beat his chest with great fervour along with the mourners in the procession. The other scholars who had come with him to welcome the mourners tried their best to protect the Allamah, but to no avail. Finally they created a cordon around him and walked along with him for fear that he would lose control and fall down. When the charged atmosphere had settled down, some scholars who were close to the Allamah asked him the reason why he had involuntarily joined the mourners in their action and was beating his chest with so much fervour.\n" +
                "\n" +
                "The Allamah replied, When I reached close to the procession of mourners of Imam Hussain (as), I saw Imam Mahdi (as) barefoot and with his head uncovered. He (as) was amongst the crowd of mourners and was beating his head and chest and was crying. When I saw Imam Mahdi (as) beating his chest and crying in this way, I could not control myself at this scene and threw myself into the crowd of mourners.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Letter of Deliverance – Shaikh Haaj Ali Baghdadi\n");

        esrc.add("Najmus Saaqib, page 484");
        edetails.add("Shaikh Abbas Qummi has reported the incident of Shaikh Haaj Ali Baghdadi in Mafatihul Jinaan. This is a long, but very useful and enlightening incident.Shaikh Ali Baghdadi says – I was in possession of 80 Tumans that were of Sahme Imam. I travelled to Najaf and from this amount, gave 20 Tumans to Ayatollah Shaikh Murtuza and another 20 Tumans to Shaikh Mujtaba Kazmini and another 20 Tumans to Ayatollah Shaikh Mohammed Hasan Sharouqi. Now there were only 20 Tumans that remained my responsibility. I decided that on my return to Baghdad I would immediately pass on the balance to Shaikh Mohammed Hasan Kazmini Ale’ Yaseen.\n" +
                "\n" +
                "Scholars are the custodians of Khums\n" +
                "\n" +
                "It was the day of Thursday when I presented myself for the Ziyarat of Imam Musa Kazim (as) and Imam Mohammed Taqi (as) in Kazmain. I met Shaikh Mohammed Hasan Kazmini Aale’ Yaseen and as intended gave him the 20 Tumans. I promised him that over a period of time, I would give him some more.\n" +
                "\n" +
                "On that very day, after reciting the afternoon prayers, I prepared myself to leave for Baghdad. The respected Shaikh invited me to stay over at his house, but I declined saying that I usually pay off my workers on the eve of Friday (Shabe Jumuah) and so would like to return to Baghdad.\n" +
                "\n" +
                "Consequently I began my journey towards Baghdad. After I had completed about a third of the distance when I saw a noble person who was coming from the direction of Baghdad. When we came close to each other, he welcome me warmly and I extended my arm for a handshake. We embraced each other and kissed each other on the forehead. He was wearing a green turban and there was a mole on his cheek. He addressed me by name and said, Haaj Ali, how are you? Where are you going? I replied, I have just completed my Ziyarat in Kazmain and am now returning home to Baghdad. He said, Today is Shabe Jumuah. Come on let us go to Kazmain. I declined saying, O Sayyed, it is not possible for me to go back to Kazmain today.\n" +
                "\n" +
                "He said, Come with me so that I may be your witness before my respected father Hazrat Ameerul Momeneen (as) that you are amongst the believers and the friends of Ahle Bayt (as). And the Shaikh too shall be your witness. Both of us (myself and the Shaikh) shall bear witness for you, for Allah has said that bring two witnesses.\n" +
                "\n" +
                "This dialogue was pointing towards an intention, which was hidden in my heart. I had intended that when I would meet Shaikh Hasan in Kazmain, I would request him to write for me a paper saying that he knew me as one who had accepted the infallibility and the purity of Ahle Bayt (as). I also intended that when I would die, this paper would be buried along with me.\n" +
                "\n" +
                "I asked my respected companion, How come you are aware of this hidden intention and how will you bear witness for me? He said, When a person fulfils the right of someone over him, then how can it be that he does not recognise him. I asked, which right are you referring to? He said, the same right which you have fulfilled with respect to my representatives.\n" +
                "\n" +
                "I asked, Who are your representatives? He replied, Shaikh Mohsin.\n" +
                "\n" +
                "I asked, Is he your representative? He replied, yes, he is my representative.\n" +
                "\n" +
                "At this point, a thought came to my mind that who is this person who knows me by names despite the fact that I do not know him and do not recognise him? Then I thought to myself, maybe he knows me in some way and I would have forgotten him.\n" +
                "\n" +
                "Then a thought arose that maybe this person is desirous of some money from Sahme Saadaat (one part of Khums) and it is better that I give him some from it. I said to him, some of the money, which is your right was with me and I have given it to Shaikh Mohammed Hasan. Now if I have to give it someone else, then I must take his permission before I do so.\n" +
                "\n" +
                "At this he smiled and said, You are right. You have also reached some of my right to my representatives in Najaf. I asked, Whatever amount I have given, has it been accepted? He said, Yes, it has been accepted.\n" +
                "\n" +
                "At this point, a thought came to my mind that who is this person who calls the scholars as his representatives? I pondered over this for a while and said to myself, The scholars are the representatives for collecting Sahme Saadaat.\n" +
                "\n" +
                "Strange amazing sights with Imam Mahdi (as)\n" +
                "\n" +
                "Then he said to me, come let us go together for the Ziyarat of my respected father. And so I went along with him towards Kazmain. He was walking on the right and I walked at his left side. As we were walking we came across a river which had the whitest and most clean water that I had ever seen. On the banks of the river were trees of different kinds such as pomegranate, lemons, grapes and the like. All these trees were seen at the same place at the same time! And most surprisingly, it was not even the season for these fruits! As we walked, we were shaded from the heat of the sun by these trees.\n" +
                "\n" +
                "I asked my companions, What is this river and these trees? He said, All this is for the one who is from our friends and performs the Ziyarat of my respected grandparents.\n" +
                "\n" +
                "Importance of Wilayat of Ameerul Momeneen (as)\n" +
                "\n" +
                "I said, O respected Sayyed! I would like to ask you a question. He said, Go ahead.\n" +
                "\n" +
                "I said, the late Shaikh Abdur Razzaaq was a teacher. One day I presented myself before him. He used to say that if there is a person who fasts for the entire day, spends his entire night in worship, performs 40 Hajj and 40 Umrah and is killed between Safa and Marwah, if he is not from amongst the friends of Ameerul Momeneen Ali Ibne Abi Talib (as), then none of his actions will benefit him. He (as) replied, By Allah, this is correct. None of his actions will benefit him.\n" +
                "\n" +
                "Then I raised a question about one of my relatives that whether he was amongst the friends of Ameerul Momeneen (as) or not. He said, Yes, he and other like him who are related with you, is amongst the friends of Ameerul Momeneen (as).\n" +
                "\n" +
                "Importance of Ziyarat of Imam Husain (as) on Thursday night\n" +
                "\n" +
                "I sought his permission to ask another question to which he agreed. I said, Those who recite the majlis of Imam Husain (as) say that Sulayman Aamish asked another about the position of the Ziyarat of Imam Husain (as). He was told that it is an innovation. That very night, Sulayman Aamish saw a dream in which there was a palace extending between the sky and the earth. He asked, who is in this palace? He was replied, that Hazrat Fatemah Zahra (sa) and her mother Hazrat Khadijatul Kubra (sa) are in this palace. Sulayman asked, where are they going? They said,, since today is Shabe Jumuah, they are going for the Ziyarat of Imam Husain (as). Sulayman saw that they were throwing some pieces of paper from the palace and on that paper it was written – “This a protection from the fire for the visitors to the grave of Imam Hussain (as) on Shabe Jumuah. This is a protection on the Day of Qiyamat.” Is this a correct tradition? He said, Yes, it is a correct tradition and the meaning is complete.\n" +
                "\n" +
                "I asked, then is it correct to say that one who visits the grave of Imam Hussain (as) on Shabe Jumuah, then he will be protected from the fire on the Day of Qiyamat? He said, Yes By Allah! And tears started flowing from his eyes.\n" +
                "\n" +
                "Grace of Imam Reza (as)\n" +
                "\n" +
                "I sought his permission to ask another question to which he agreed. I said, In the year 1269 AH, I had gone for the Ziyarat of Imam Ali ibn Musa ar Reza (as). In Nishapur, I met a person who was from the Sharooqi clan of Arabs. I kept him as a guest with me and asked him about the position of the wilayat (mastership) of Imam Ali ibn Musa ar Reza (as). He replied, ‘It is like heaven. It has been 15 days that I am eating as a guest of Imam Reza (as). I am confident that when I die, Munkir and Nakeer will not harm me as my body and my blood is formed from what I have eaten from the property of Imam Reza (as).’ Is this correct? When we die, will Imam Reza (as) come to our help in the grave?\n" +
                "\n" +
                "He said, By Allah, this is correct. My respected father will be a protector in the grave.\n" +
                "\n" +
                "I sought his permission to ask another question to which he agreed. I asked that whether my Ziyarat of Imam Reza (as) has been accepted or not? He said, Inshallah, it is accepted.\n" +
                "\n" +
                "I sought his permission to ask another question to which he agreed. I asked whether the Ziyarat of Imam Reza (as) by Haaj Ahmed Bazzaaz Pashi (my companion in Mashhad) is accepted or not? He replied, the Ziyarat of Abdus Saleh is accepted.\n" +
                "\n" +
                "I sought his permission to ask another question to which he agreed. I asked about the acceptance of one person in Baghdad who had accompanied us to Mashhad. (This person was amongst the elite of Baghdad and was involved not only in spreading corruption, but also in killing his mother) I did not get a reply this time. I repeated, O my master, is his Ziyarat accepted or not? Again I did not get a reply.\n" +
                "\n" +
                "Some other questions…\n" +
                "\n" +
                "At this point, we had reached a place, which had gardens on both sides of the road. The city of Kazmain could be seen in the distance. Orphans who were of the saadat (family of the Holy Prophet (sawa)) occupied some portion of this road. The government had seized their land and had attached it to this road. The pious and god fearing people of the city knew this fact and generally avoided taking this route for fear of usurping the right of the orphans. But I saw that my companion was taking this road. I said, O my respected Sayyed! This road is built on the land of the saadat orphans. It is not correct to infringe upon the rights of these orphans. He said, this property belongs to my respected father Ameerul Momeneen (as) and his progeny. And these orphans are our children. It is permissible for the friends of Hazrat Ali (as) that they travel along this road.\n" +
                "\n" +
                "At some distance there was a garden which was famous as the garden of Haaj Mirza Hadi. He was among the wealthy people of Iran who was at present settled in Baghdad. I asked, people say that the garden of Haji Mirza Hadi is on the land which belongs to Imam Musa Kazim (as). Is this correct? He replied, how does this matter concern you?\n" +
                "\n" +
                "We then reached a place where a canal had been constructed from the water of the river and the sea and this passed through the middle of the road. From this place, there were two roads, both of which led to Kazmain. One of these roads was named Raahe’ Sultani Raah. The other road was famous as Raah’e Saadaat. I suggested that we go along Raahe’ Sultani. He said, No, we will go along my road.\n" +
                "\n" +
                "We had just travelled a short distance along this road, that I found myself at the holy courtyard of the mausoleum. This is the place where one generally removes one’s shoes before entering the mosque. My respected companion had gone ahead and I saw him entering the mausoleum from the west (from the direction of the holy feet of Imam Kazim (as)). He did not wait at the door and without reciting the Dua seeking permission to enter, he went straight inside the mosque. He stood at one side and asked me to recite the Ziyarat. I declined saying that I could not read. He said, Okay, should I recite the Ziyarat on your behalf? I accepted his offer. He began reciting the Ziyarat thus –\n" +
                "\n" +
                "O Allah, I seek permission to enter. Peace be upon you, the Holy Prophet of Allah (sawa). Peace be upon you, Ameerul Momeneen (as). In this way, he continued to convey salutations and blessings to every Imam (as) till he reached the name of Imam Hasan Askari (as). He said, peace be upon you, Aba Mohammed Al Hasan Al Askari (as). Then he turned to me and said, do you know Imam Mahdi (as)? I said, Of course! He then said, then convey salaam to him (as).\n" +
                "\n" +
                "I said, peace be upon you, the Proof of Allah, O Sahebaz Zaman Ibne Hasan (as).\n" +
                "\n" +
                "He smiled at me and said, Alaykas Salaam wa Rahmatullahe wa Barakato (which is the standard response to one who conveys salaams)\n" +
                "\n" +
                "Then he entered the Haram and touched the blessed shrine of Imam Kazim (as) and Imam Mohammed Taqi (as) and kissed it. He then asked me to recite the Ziyarat. I declined again saying that I could not read. He said, shall I recite the Ziyarat on your behalf? I accepted. He asked me which Ziyarat should he recite. I replied saying that recite whichever Ziyarat is having more merit. He said, Ziyarat Ameenullah is having greater merit. And he began reciting the Ziyarat.\n" +
                "\n" +
                "Towards the latter half of the Ziyarat, I saw that the lights inside the haram had come on. This was not an unusual event, except that this time, there seemed to be a different kind of brightness that I had never seen before. The entire place seemed to be illuminated by this light. The lamps of the haram paled in comparison with the brightness of this light just as any light would seem pale before the brightness of the sun. My mind was in such a state that despite these signs, I was unable to comprehend the meaning of all these events.\n" +
                "\n" +
                "After completing the Ziyarat, we moved from the direction of the holy feet of Imam (as) towards the holy head of Imam (as). He turned to me and said, do you intend to recite the Ziyarat of my respected father, Imam Hussain (as)? I said, yes, it is Shabe’ Jumuah, we must recite the Ziyarat.\n" +
                "\n" +
                "He recited Ziyarat Waretha. By this time, the dusk prayers were upon us and the Azaan of the dusk prayers had just been completed. He turned to me and said, Go and recite the namaz of Maghreb with the congregation. We went together into the mosque, which is towards the holy head of Imam (as). The people had already gathered for prayers. My respected companion however stood separately towards the right side of the imam leading the prayer and began reciting his prayers. I stood in the first row of the congregation and began the prayers. When I completed my prayers, I looked in the direction where the respected Sayyed was praying, but I could not see him. I quickly got up from my place and looked all over for him – outside the mosque and at every place in the haram, but could not find him. My intention was to be a host to him and to serve him and present a few copies of Quran to him.\n" +
                "\n" +
                "Suddenly, an amazing feeling passed over me. It was as if I had got up from a dream. A few thoughts passed through my mind – who was this respected Sayyed, my companion? There were so many miraculous events that occurred during my journey with him. He convinced me to return with him to Kazmain, despite the fact that I had made up my mind not to return today. I had never seen him before, yet he was familiar with my name. His knowledge of the hidden things in my heart and his bearing witness to my faith, the flowing of the river, the presence of the trees laden with fruits despite the fact that it was not the season for them, and replying to the salaam which I recited for Imam Mahdi (as)!\n" +
                "\n" +
                "Finally I came to the place where I had taken off my shoes. I asked the caretaker whether he had seen the person who had accompanied me when I entered the haram. He said that this person had just left. He asked me, was this person your companion? I replied in the affirmative and left the place.\n" +
                "\n" +
                "I spent the night at the house of my host. In the morning, I presented myself before Aqa Shaikh Mohammed Hasan and narrated the entire incident before him. He placed his hand on his mouth indicating that I should not narrate this incident to anyone and prayed to Allah in my favour.\n" +
                "\n" +
                "I complied with his request and did not narrate this incident to anyone. It was about one month since this event that I was in Kazmain where a respected Sayyed walked up to me and said, what have you seen? I said, I have not seen anything. He repeated the question and I repeated my answer. This time I was more firm in my reply than before. Suddenly he disappeared from my eyes and then I did not see him again. It struck me that he was none other than my master Hazrat Imam Mahdi (as). I regretted that at the time of meeting me, I was not attentive towards him. I searched all over for him but regretfully, I could not meet him again. I was grieved at my separation from him.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Sunni Scholar and a Glimpse of Imam Mahdi (as)\n");
        esrc.add("Mulaqaat Ba Imame Zamana (as), volume 1, page 264");
        edetails.add("A scholar from the Zaidi school of thought, Sayyed Bahrul Uloom Yamani, used to deny outright the merciful existence of Imam Mahdi (as). He used to say that the words of the Shiah regarding the Imam (as) – that Allah has kept the Imam (as) alive for the sake of guidance of mankind; that the existence of this world is due to his blessed existence; that he is in occultation and cannot be recognised by the people and on the order of Allah will reappear – all of these are lies.He kept up a steady conversation on this subject through letters with leading Shiah scholars and jurists of the time. He sought from them proofs regarding his (as) sacred existence and on his long life. The Shiah scholars offered several proofs which were available in books, but he rejected them all outright saying that he too had read these books (but was not satisfied with the response). He once wrote a letter to Ayatollah Isfahani seeking a solid proof from him on this subject.\n" +
                "\n" +
                "Ayatollah Isfahani wrote back to him that he was not inclined to offer a reply in letter, but invited him to Najaf where he would offer a response which would be acceptable to his heart and would be conclusive.\n" +
                "\n" +
                "When this letter reached him, he sought the advice of his close friends and thereafter along with his son Ibrahim and some of his close associates, he left from Yemen towards Najaf. After a long journey, Sayyed Bahrul Uloom Yamani reached Najaf where he met Ayatollah Isfahani along with other scholars. After a few courtesies, Sayyed Bahrul Uloom Yamani said to Ayatollah Isfahani, I came to Najaf on your insistence. Now please offer me the reply which you have promised.\n" +
                "\n" +
                "Ayatollah Isfahani said, tomorrow night you come over to my house. I will offer you my reply there.\n" +
                "\n" +
                "Thereafter he arranged for the food and lodging for the visitors. The next day came and passed away bringing with it the promised night. The visitors arrived at the house of Ayatollah Isfahani and ate to their fill. As time passed, slowly the other guests started leaving for their homes. Sayyed Bahrul Uloom Yamani was anxiously awaiting the promised response till such time that half the night passed away. He was thinking that I was invited from Yemen for a reply to my question and was promised that I would be answered in the night, but now it is past midnight and there seems to be no sign of any answer.\n" +
                "\n" +
                "He was lost in these thoughts when suddenly the voice of Ayatollah Isfahani hit his ears. He was saying to his servant who was clutching a lamp – tell the son of Sayyed Bahrul Uloom to come here. The servant conveyed the message. Those who had come along with Sayyed Bahrul Uloom narrated that we rushed towards the door, but we were told not to enter. We stopped at the door and only Sayyed Bahrul Uloom and his son along with the servant went forth, but we don’t know where.\n" +
                "\n" +
                "In any case, the next day dawned and we got a chance to meet Sayyed Ibrahim. We asked him about the events of the previous night. Sayyed Ibrahim said, All praise be to Allah! We have become people of vision and have accepted the faith of the Shiah Ithna Ashari. I asked, what is the reason for that!?\n" +
                "\n" +
                "Sayyed Ibrahim said, because during that night, we were blessed with a meeting with Hazrat Imam Mahdi (as) along with Ayatollah Isfahani. When I pressed him further for details, he said, in the darkness of the night, when we left the house, we had no idea where we were going. We kept on walking till such time that we left the city and entered Wadi Us Salaam (cemetery outside the city of Najaf). In the centre of the Wadi, there is a place which is famous as the place of Imam Mahdi (as).\n" +
                "\n" +
                "Ayatollah Isfahani took the lamp from Hussain Mashhadi (the servant) and thereafter my father, myself and the Ayatollah entered the courtyard. There was a well in the courtyard. Ayatollah Isfahani took out some water from the well and performed ablution with it. We were both amused at his actions. Thereafter he went forward to a place and prayed four units of prayer. He had barely completed his prayer and some words had escaped his lips, when the entire area was illuminated. Then he called out to my father. My father had just gone to his place when shortly I heard the sound of his crying. Suddenly he screamed and fell down in a faint. I was terrified by this scene and ran towards him. I saw that Ayatollah Isfahani was shaking the shoulder of my father. Finally he came to his senses. I was relieved by seeing this.\n" +
                "\n" +
                "When we returned from there, my father said, I was granted the good opportunity to meet with Imam Mahdi (as) without any veil between us. I have now become a person of vision and have accepted the faith of Shiah Ithna Ashari.");



        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("The Good Fortune of Haji Mohammed Ali Fashandi");
        esrc.add("pages 149-154 of the book Shiftgaane’ Hazrat Imam Mahdi (as)");
        edetails.add("This incident is reported on pages 149-154 of the book Shiftgaane’ Hazrat Imam Mahdi (as). Haji Mohammed Ali Fashandi was a resident of Iran. He narrates his meeting with Imam Mahdi (as) as follows.In my youth I had decided that I would raise my level of piety to that extent that when I would travel for Hajj to Makkah, I would get an opportunity to meet Imam Mahdi (as). Therefore with this intention, I travelled for Hajj every year to Makkah. In one particular year, when I went for Hajj, I was having the responsibility of a few Hajis. On the eve of 8th Zilhajj, I decided to gather all my belongings and items and go to the ground of Arafat so that I would be able to prepare and book a good place for my companions when they would arrive the next day.\n" +
                "\n" +
                "At the ground of Arafat, I was able to book a tent and keep all my belongings there. I was aware that at that time, there was no one in Arafat other than myself. There was a guard at the entrance of the tent and he came to me and said, “Why have you come here today? Do you not know that you are alone here? Your belongings could be stolen by thieves who operate in this area. In any case since you have come here, it is better that you remain awake the entire night and guard your belongings.” I said, “No problem. I will remain awake till morning and guard my possessions.”\n" +
                "\n" +
                "I remained awake in the night and made myself busy in prayers and duas. It was towards midnight that my attention was drawn towards a respected Sayyed who was wearing a green turban. He came towards my tent and called out to me by my name. He said, “Haji Mohammed Ali, salaam alaykum!”\n" +
                "\n" +
                "I got up from my place and after replying to his salaam we entered the tent. After some time, we were joined by some of his young companions who stood outside the tent in readiness to serve him (as). I was overcome with fear, but after a few seconds of talking with him, my heart was filled with his love and I began to trust him. His companions continued to stand outside while their Sayyed was inside the tent.\n" +
                "\n" +
                "He turned to me and said, “Haji Mohammed Ali, you are very fortunate, you are very fortunate!” I asked, “Why is that?”\n" +
                "\n" +
                "He replied, “You have remained awake in the night in the ground of Arafat. My respected father Hazrat Imam Hussain (as) also remained awake when he spent his night at Arafat.” I asked, “What should one do in this night?” He replied, “Recite two units of prayer such that in every unit, after Surah Hamd, recite Surah Tawheed 11 times.”\n" +
                "\n" +
                "We got up from our place and I prayed the namaz as per the instructions along with the respected Sayyed. After completing the namaz, he recited a dua, which I had never heard before. I was really very fortunate. Tears were flowing from my eyes and I was trying to memorise every word of this dua. The respected Sayyed saw this and said, “This dua is for the Infallible Imams (as). Even if you memorise this dua, you will not be able to retain it in your memory");



        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Miracle of Hazrat Zahra (sa)\n");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 2");
        edetails.add("Ayatollah Sayyed Mohsin Ameen Ameli narrates, the incident pertains to the time of rule of Janab Shareef Ali, the father of Janab Shareef Hussain. His rule was the last by a king related to the sadaat (from the progeny of Hazrat Zahra (sa)).I had reached Makkah Mukarramah for Hajj and at every stage – Tawaaf, Arafah, Mina and Mash’har – I sought the Ziyarat (meeting) of Imam Mahdi (as). From the traditions of the Imams (as), I was 100 percent sure that Hazrat Imam Mahdi (as) comes to Makkah Mukarramah every year during the season of Hajj for the Ziyarat of Kabah. That year, I had intensely prayed to Allah that He grant me the opportunity to meet Imam Mahdi (as). However, the days of Hajj came to an end and I was unable to meet the Imam (as).\n" +
                "\n" +
                "I was now in a dilemma. At that time, my options were I could either go back to my home town and return next year for Hajj to once again seek an audience with the Imam (as); or I could wait in Makkah for one year till the season of Hajj and pray to Allah the Merciful that He accept my supplication for meeting the Imam (as). Finally keeping my conditions in mind, I decided to stay back in Makkah with the hope that during the season for Hajj, I would be granted an opportunity to perform the Ziyarat of the House of Allah and also the Ziyarat of the true successor of the Kaabah.\n" +
                "\n" +
                "Anyhow I completed one year in Makkah till the arrival of the season of Hajj. I completed the rituals of Hajj, but I was not granted an audience with the Imam (as). In a state of utter hopelessness and regret I once again contemplated the further course of action – should I return to my home town or should I stay back. Perhaps Allah, the Acceptor of Duas would consent to my supplication to meet my beloved, the Imam of the Time (as).\n" +
                "\n" +
                "Finally, I decided to stay back with the sole intention of meeting my master. For another year, I endured the difficulties of staying in a foreign land and awaited the long cherished meeting with the Imam (as) till such time that the Hajj season returned. At every stage, I yearned for one meeting with the Imam (as). However, this year too, like earlier, Allah had ordained otherwise and I was unable to meet with the Imam (as).\n" +
                "\n" +
                "I began thinking about the future – what should I do? For how long could I stay in a foreign land? I thought that perhaps, it was not to be that I should meet the Imam (as) and maybe it would be better if I returned home. For long my family and friends would be awaiting my return. Then it struck me that I should not despair of Allah’s mercy. Perhaps I would get a chance this year to meet the Imam (as). Who knows what fate awaited me at home; would I get such an opportunity to come back to Makkah? Would the conditions at my home permit me to return? These thoughts raced through my mind as I thought that perhaps I would not get another chance to fulfil my hope to meet the beloved Imam (as). Therefore, I decided to stay back for one more year. Surely Allah the Almighty is the One who creates opportunities; He is the One who solves the difficulties. I was lost in these thoughts when I decided to stay back and with this hope I spent 5 years in Makkah with the intention of meeting the Imam of the Time (as).\n" +
                "\n" +
                "Due to my long stay in Makkah, I developed good relations with the king of the Hejaz – Janab Shareef Ali. My relationship with the king reached such a level of comfort that I was permitted to visit him at any time even without an appointment.\n" +
                "\n" +
                "The season of Hajj arrived in my last year of stay in Makkah and I completed its rituals. I stood before the Kaabah and clutching its curtain, I wept profusely and prayed to Allah – O Lord! For so many years I stayed in this strange land with the anticipation of meeting the Imam of the Time (as), but till now You did not grant me the opportunity for this meeting!? I remained in this condition for a long time and confided my secrets to Allah.\n" +
                "\n" +
                "Finally, I separated from the Kaabah and climbed one of the mountains of Makkah. At this height I looked around and saw a green patch. Inexplicably, a wave of happiness spread through my body on this sight. I asked myself – what is this place which is green and prosperous in the outskirts of Makkah? How is it that after all these years that I spent in Makkah, I missed this place and never came here?\n" +
                "\n" +
                "Finally, I came down from the mountain towards this place. As I approached this lush garden, my eyes fell upon a tent right in the centre that looked very regal. I carefully measured my steps and moved towards this tent. I saw some people sitting in the tent. They were listening to a majestic personality whose radiant countenance gave an impression of servitude and worship. I came closer and entered the tent. I saw that there were several people gathered in the tent. I stood at one side and directed my attention to the words of this person.\n" +
                "\n" +
                "He was saying – One of the miracles of my mother Hazrat Zahra (sa) is that the children from her progeny die on the correct faith; at the time of their death a reminder of the faith and wilayat is done to them; and none of them departs this world, except on the right belief.\n" +
                "\n" +
                "I heard this for a moment looked towards the green garden and then as I turned my attention to the tent, I realised that the tent and the people within it had completely disappeared. There was no sign of them. I was surprised by this and once again turned towards the green area, but I now realised that there was no sign of it as well. I found myself alone on the mountain in the middle of the sands of the deserts of Hejaz. I descended from the mountain and entered the city of Makkah where another surprise awaited me. It appeared that the atmosphere of the city had changed. People were whispering amongst themselves and the administration of the city appeared to be in a state of grief. I asked the people about what had occurred.\n" +
                "\n" +
                "The people told me that the king of Hejaz was on the throes of death.\n" +
                "\n" +
                "This news saddened me and I rushed towards the residence of the king which was very close to the Haram and the market. The people from the establishment were not permitting any person to enter the house of the king. However when they saw me, they allowed me to enter as they knew that I was having a good association with the king.\n" +
                "\n" +
                "When I entered, I saw that the king was on the verge of death. Several scholars and jurists from the schools of the Ahle Sunnah (Hanafi, Shafaei, Maliki and Hambali) were gathered around his bed. Even his son Shareef Hussain was present there. The scholars of the Ahle Sunnat were reciting the talqeen (last reminders for the dying person) as per their own beliefs. However there was no movement on the lips of the king. I too sat next to the bed of the king.\n" +
                "\n" +
                "I had just sat down when I saw the same majestic personality who I had seen in the green fresh path and who was conversing with people in the tent enter the room of the king and sit down next to the king. He said, O Shareef Ali say – Ash’hado An La Ilaha Ilallah. At that moment, there was a movement on the lips of the king and he repeated – Ash’hado An La Ilaha Ilallah (I bear witness that there is no God but Allah).\n" +
                "\n" +
                "The person said, O Shareef Ali, say – Ash’hado Anna Mohammadur Rasoolullah (I bear witness that Mohammed (sawa) is the Messenger of Allah). Shareef Ali repeated – Ash’hado Anna Mohammadur Rasoolullah.\n" +
                "\n" +
                "Then he said, say Ash’hado Anna Aliyan Waliyullah Wa Khalifato Rasoolullah (I bear witness that Ali (as) is the Wali of Allah and the Successor to the Messenger of Allah). Shareef Ali repeated this sentence.\n" +
                "\n" +
                "Then he said, O Shareef Ali, say, Ash’hado Annal Hasana Hujjatullah (I bear witness that Hasan (as) is the proof of Allah). Shareef Ali repeated this sentence word for word. Then he said, O Shareef Ali, say, Ash’hado Annal Husaino Be Karbala, Hujjatullah (I bear witness that Hussain (as) of Karbala is the proof of Allah). Shareef Ali repeated this sentence word for word.\n" +
                "\n" +
                "In this manner, the person brought forward such sentences which bore witness to the Imamate of each of the Imams till such time he said, O Shareef Ali, say, Ash’hado Annaka Hujjatullah (I bear witness that you are the proof of Allah).\n" +
                "\n" +
                "I was watching this scene in a state of astonishment when suddenly, this person stood up from his place and walked outside. At that moment Shareef Ali also breathed his last and passed away. I gathered my wits and speedily went outside to seek this person, but I could not find him. I asked the courtiers and the gate keepers to the palace, but they replied that no person had entered nor left from the palace. I returned back to the palace and found that the scholars of the four schools of the Ahle Sunnah were discussing the last words of Shareef Ali amongst themselves. They were asking themselves about the identity of the person who had arrived there.\n" +
                "\n" +
                "At that moment, I became 100% certain that the person who had come there and had repeated the talqeen for Shareef Ali was none other than Hazrat Imam Mahdi (as). While I had got the opportunity to meet the Imam for the second time, I regretted that I had been unable to recognise him");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Ziyarat Waretha and the Lamentation of Imam Mahdi (as)");
        esrc.add("Mulaqaat Ba Imame’ Asr (as), page 324");
        edetails.add("Janab Maynou narrates – I visited Karbala several times for Ziyarat. On one such visit, I decided to first pray at the place of the blessed head of Imam Husain (as) – the place where duas are accepted very swiftly – for the opportunity to meet Imam Mahdi (as). I intended that I would recite the Ziyarat will full attention after seeking this dua.I reached the Euphrates and after having a bath and washing my clothes, I left for the shrine of Imam Husain (as). Along the way, I kept thinking about the supplication for the opportunity to meet Imam Mahdi (as). At last, I reached the shrine of Imam Husain (as). In my heart I hoped that I would not be disturbed by some uneducated Arabs who would come over and request to recite the Ziyarat in a loud voice so that they could listen and take benefit from it. I made an intention that after reciting the Izne Dukhool (prayer for seeking permission to enter the shrine), I would recite Ziyarat Jameah. I barely had stood for the Izne Dukhool when an Arab came over and stood by my side and said, Mister! Can you please recite Ziyarat loudly so that I may recite it along with you? I was a bit annoyed by this request because I wanted to recite Ziyarat in solitude. I thought to myself that since this person is a visitor of Imam Husain (as), I would recite a short Izne Dukhool for him and then I would recite a comprehensive Ziyarat. Thus I recited Izne Dukhool and after entering the shrine, I faced the blessed grave of Imam Husain (as), then turned to the Arab and said, which Ziyarat would you like me to recite for you? He said, Ziyarat Waretha. I started the recitation of the Ziyarat. I had barely completed the first sentence of the Ziyarat – Assalamo Alaika Ya Waretha Adama Safwatillah – that this Arab started weeping profusely. As I recited the Ziyarat, the intensity of his lamentation kept on increasing in such a manner that when I reached the sentence – Assalamo Alaika Ya Tharallahe Wabna Thaarehi – he was weeping so much that I too was affected by it. I also started weeping severely such that I was unable to continue the recitation of the Ziyarat. I recited the Ziyarat one sentence at a time, following each sentence with severe lamentation. I thought to myself that I had not wanted to be disturbed, however the presence of this Arab had cast a strange feeling over me. While reciting the Ziyarat, I witnessed some lights which had engulfed the shrine in their brightness. However, at that time, I dismissed the thought thinking that perhaps the tears in my eyes were playing tricks with my vision. Finally, with a lot of difficulty, I was able to complete the Ziyarat and then the Arab and I moved towards the zarih of Imam Husain (as). We moved to the side of the zarih to recite the namaz of Ziyarat. After completing my namaz, I turned towards my partner in order to remind him of a prayer which should be recited after this namaz. However, when I turned, I saw that he was not there. I thought that perhaps he had gone to perform a Tawaaf (circumambulation) of the zarih. I got up from my place and performed a Tawaaf while looking for him. I could not see him and in that effort completed another Tawaaf of the zarih. But I was unable to find him. This surprised me – how is it that he was with me just a few moments ago, but now he seemed to have disappeared. Anyway, in his search, I even stepped outside the shrine, but could not find him. I was anxious and came to the caretaker of the shoes of the pilgrims and said to him, just a short while ago, an Arab entered the shrine along with me. Have you seen him? He replied, actually, I did not see any person accompanying you. At that time it struck me that the Arab was none other than the Imam I was seeking, my beloved Imam Mahdi (as). As soon as this thought came into my mind, I was dumbfounded. My mind did not know how to respond to the situation and it was as if an extraordinary feeling had overcome me. I began thinking of where I should search for him. I entered the shrine again so that I may search for him inside, but I could not find any trace of him. I anxiously looked for him everywhere but I was unable to find him. I sat next to the zarih and wept profusely praying that I would get an opportunity again to meet him. I was saying, O Master! I did not want to meet you in this way. Rather I desired that I should meet you in the condition that I would recognise you. O my Master! I will not leave the shrine till such time that I get the chance to meet you once again. Hardly these words had left my lips that a hand appeared and caught my finger which was raised towards the heavens. A voice was heard saying, “As Alokad Dua” (I seek your prayers) On hearing this voice, I turned in its direction, but I could not see any person. However these words which were from the lips of my master were like a cool balm for my burning heart. I thought to myself that I was unworthy of meeting my master more than this.The reason of construction of Masjid Jamkaran was that that ShaykhAfifSaaleh Hasan bin MuthlaJamkarani says: It was the night of Tuesday, the seventeenth of the month of Ramazan 293 A.H. – and I was asleep in my house. A part of the night had passed. Some people came to my door and woke me up saying: Get up, SahibuzZamaan has summoned you. So I arose at once and said: All right, I\\’ll be there immediately. I picked up a shirt to put it on, but a voice came from inside the house: This is not your shirt. I put on another shirt; then reached for the Pajama; again a voice came that it was not mine. So I put it down and wore another. After that I started to search for the key, but a voice came: The door is already open. At last, Ireached the door to find many elders standing there. I greeted them; they replied and then conveyed me to the location where the Masjid stands today. At that place I decried a wooden platform covered by a very fine carpet. A mattress and pillows were also arranged on it and a young man of around thirty years was seated there. Before him was an elderly gentleman, reading from a book. Around sixty persons, some dressed in white and some in green, were busy praying. I learnt that the young man was HazratHujjat and the elderly gentleman was His Eminence, Khizr (a.s.). When I reached them, His Eminence, Khizr (a.s.) offered me a seat and HazratHujjat addressed me by my name and said: “Go to Hasan Muslim and tell him: You have put this land for your personal use since some years, and you try to cultivate crops on it, but we destroy them, in spite of that you do not desist. This year also you wanted to do the same. Now, you are not permitted to do so; and return whatever you have gained from this land, so that it can be utilized for building a Masjid on it. Tell him that this is an honored place and the Almighty Allah has bestowed it a special rank over other lands, which you are trying to include in your property. Your two adolescent sons passed away, but you did not heed the warnings. If you still don\\’t toe the line, you will be punished in such a way that you won\\’t know what hit you.” Hasan Maslah says: I said: My master, I would need a sign, as without it, no one would believe me. He said: We are leaving a sign here in order to verify your statements, you just convey the message. Go to Abul Hasan and ask him to recover from HasanMuslim the profits he had made in last few years and hand the money over to others so that construction may commence; and the remaining expenses can be taken from the agricultural income of our lands at Rahaq. We have endowed half of this rural property in favor of this Masjid. Announce it to the people that they should become inclined to it and be devoted to it. They should recite four units (rakats) of prayer in it: Two units (rakats) of prayer for honoring of Masjid: in each unit (rakat) of which they should recite Surah Hamd once and Surah Tauheed seven times; in Ruku and Sujood, they should recite the praises seven times. After that recite two units (rakats) of Prayer of Imam Zamaan (a.s.), in the following manner: Begin with Surah Hamd and when you come to IyyakaNa\\’bodowaiyyakaNaste\\’e\\’n, you should repeat this a hundred times and then proceed and complete Surah Hamd. The same method is to be followed in the second unit (rakat) as well. Repeat the Zikr seven times in Ruku and Sujood. After concluding the prayer, recite the Tahleel, e.g. Laaelaahaillallaahowahdahuwahdahu. And recite Tasbeeh Fatima Zahra (s.a.). After that prostrate and recite Salawat on Muhammad and Aale Muhammad (a.s.) in prostration a hundred times. After that the Imam\\’s words were as follows: If one recites the two prayers, it is as if he has prayed in the BaitulAteeq. After that Imam (a.s.) asked me to proceed. As soon as I started, he called me back and said: A goat is to be purchased from the flock of Ja\\’farKashani, the shepherd; if the villagers pay for it, well and good, if not, you pay for it yourself and slaughter it here tomorrow night. The following daywould be the 18th of month of Ramazan; on that day the mutton should be distributed among those who are ailing; Allah will cure those who eat from it. That goat is spotted, very hairy and having seven black and white marks the size of a dirham coin: three on one side and four on the other. Hasan bin Maslah says: After that I returned home and remained in deep thought all night. At last it was dawn. After prayers, I went to Ali bin Mundhir and narrated the whole incident to him. Then the two of us came to that same place and found in accordance to the statement of the Imam, chains and pegs, which were supposed to be the signs . After that we came to the place of SayyidAbul Hasan. The moment we reached his door, his servants said: The master is expecting you since dawn, are you a residents of Jamkaran? Then he was informed and I entered his place and greeted him with respect. He replied in a cordial way and offered me a seat near him. Before I could say anything, he started: O Hasan bin Maslah, last night I saw a gentleman in dream,who told me: Hasan bin Maslah, a resident of Jamkaran, will approach you in the morning. You must testify to whatever he says and rely on his words; his statement is our statement; you must not reject his words. I am waiting for you since I saw that dream. After that I narrated the incident in detail. Abul Hasan asked his men to saddle the horses. All of us mounted and set out from there. On reaching Jamkaran, we saw Ja\\’far with his herd at the side of the road. As I approached, a goat, which was at the rear, came bouncing to me. When I wanted to pay the cost to Ja\\’far, he swore that the goat did not belong to his herd. He said: I have never seen it before today and after that I was not able to catch it, no matter how much I tried. Thus, we brought that goat to the place that Imam (a.s.) had mentioned and slaughtered it there. Sayyid Abul Hasan summoned Hasan Muslim and the amount was recovered from him. Monies were also taken from the income of Rahaq village and the roof of the Masjid was completed. SayyidAbul Hasan carried those chains and pegs with him to Qom; they were kept at his home. Ailingpersons came and by Allah\\’s permission sought cure from them by rubbing them on their bodies. It is said that after the passing away of SayyidAbul Hasan, when his son fell ill, the case containing the chains and pegs was opened, but nothing was found in it .This, in brief, is the account of that place, which is mentioned there. The author says: In the Persian version of Taareekh Qom,and in its Arabic version, which the prominent scholar Agha Muhammad Ali Kermanshahi has mentioned this incident briefly in the marginal notes of Rejaal Mir Mustafa in the chapter of Hasas, the date of the incident is mentioned as 293 A.H. And apparently it was abrogated and the actual date was 273 A.H., which is the meaning of seventy, because the death of Shaykh Saduq was before 290 A.H.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Forgiveness of Sins");
        esrc.add("Mulaqat Ba Imam E Zaman Dar Karbala, Muhammad Yusufi");
        edetails.add("The late respected Allamah Bahrul Uloom narrated,  Once, I was travelling to Samarrah. Along the way, a question arose suddenly in my mind that are the sins of those who shed tears upon Imam Hussain (as) forgiven or not?\n" +
                "\n" +
                "No sooner had this question come to my mind that I saw a horse rider coming towards me. He came close to me and after offering his salutations, he said, O respected Sayyed! What are you thinking about? If it is a religious question, then do narrate it. Perhaps I can offer you a solution.\n" +
                "\n" +
                "I replied, I was thinking how Allah, the Merciful and Generous, has ordained a reward for the visitors of Imam Hussain (as) that for those who walk to his (as) shrine, in exchange of each step, Allah writes for them the reward of a Hajj and Umrah in their book of deeds. And as for those who cry upon his difficulties, in exchange for each tear, Allah forgives their large and small sins.\n" +
                "\n" +
                "The horse rider said, Don’t be surprised by this. Let me narrate for you an example which will solve your dilemma.\n" +
                "\n" +
                "He continued, One day, a king left for hunting along with his courtiers. During this hunt, the king was separated from his courtiers such that they were both unable to reach each other. He tried his best to make contact with his companions, but was unsuccessful. He was tired and so weakened that even walking was difficult for him. Hungry and thirsty, he just did not know what to do. Suddenly he saw a tent in the distance and started walking towards it.\n" +
                "\n" +
                "An old woman stayed in the tent along with her son. Her only worldly possession was a goat with whose milk she was able to eke out a living. When the king arrived at her door step, she did not recognise him. Nevertheless, she was hospitable to him. She sacrificed her goat and fed its meat to the king as she did not have anything else to offer to him. The king ate to his fill and stayed there for the night. The next morning the king graciously took her leave and was soon reunited with his companions. Thereafter, he narrated the previous night’s episode to his companions and then asked them –\n" +
                "\n" +
                "If I wish to reward this lady and her son, then what is an appropriate compensation for their service?\n" +
                "\n" +
                "One of the courtiers stood up and said, O king! You can pay her back by granting her 100 sheep. Another courtier proffered, you can grant her 100 sheep and 100 gold coins. A third suggested that the king gift her a particular piece of land.\n" +
                "\n" +
                "The king said, whatever I grant her, it will fall short of the favour she has conferred upon me. If I grant her complete control over my kingdom, it will equal what she has done for me. This is because she gave up all she had for me. Therefore if I wish to compensate her fully, it is only correct that I give up everything I have in her favour.\n" +
                "\n" +
                "After this, the horse rider said, O Bahrul Uloom! Whatever Imam Hussain (as) had at his disposal – his wealth and possessions, his family and friends, his brother, his sisters and even himself (as), he gave it all up in the way of Allah. (It is not possible that the Divine will grant His divinity to the Imam (as)). Therefore if Allah rewards the visitors and mourners of Imam Hussain (as) in this manner, then you should not be astonished for this is an ordinary task and very easy for Him (Undoubtedly, this is Allah whose award is without any limit, whose bounty is all encompassing and whose generosity is beyond compare such that none can estimate its extent)\n" +
                "\n" +
                "Saying this, the horse rider kept silent which drew my attention to him, but I realised that he was not there! For a moment, I was stunned. Then my mind guided me that the horse rider was none other than Imam Mahdi (as). I searched for him in the nearby area and up to the distance I could see, I looked for him, but I could not get the chance of meeting him (as). A wave of regret and remorse arose in my heart on the loss of this opportunity");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Incident of Sayyed Muhammad Jabal Amili");
        esrc.add("This incident is reported in Najmus Saqib under the Chapter of Those who met Imam Mahdi (as) in Ghaybat Kubra.\n");
        edetails.add("The righteous and pious scholar, Sayyed Muhammad Amili narrated that once I went for the Ziyarat of the holy Mashhad of Imam Ali Reza (as) and I stayed there for a long time. Since I was in extremely poor financial conditions, whenever I decided to go with a caravan, I did not have the provisions for the journey and I was compelled to stay behind. Once, when some pilgrims set out, after they left, I decided not to leave this caravan in any way.\n" +
                "\n" +
                "Winter was approaching and I had no clothes and I would perish in that climate. If I was unable to get a caravan and if I died of hunger or thirst it would be better. So I set out from the holy sanctuary in the afternoon. I came out of the town and took the road on which those pilgrims had departed; but I did not meet anyone till sunset. So much so that night fell and I had nothing to eat. I was terribly hungry and in that forest nothing was seen, except trees of bitter colocynth. In restlessness of hunger I picked quite a few of them that perhaps I will be able to consume them, but I did not succeed. After walking sometime I saw a mound and I climbed it. There I saw a spring, which amazed me a great deal and I thanked the Almighty Allah and drank from it thinking that as I was facing a certain death, I should perform ablution and pray so that I may not die leaving prayers unperformed.\n" +
                "\n" +
                "So I made the ablution and prayed the Maghrib and Isha prayer. After that the forest filled up with the sounds of wild animals. At that time I had completely lost hope of survival. It was a dark night and the wilderness was terrifying and I was involved in the difficulties of the journey. In that condition I was only reminded of God and the believers in God. I fell down on the earth and felt a rider approach. I thought that death was near.\n" +
                "\n" +
                "However, when the rider came near, he greeted me and I responded. Then he asked what the matter was. I gestured to my weakness and he said: You are having three musk melons, why don’t you eat them? Look behind. I glanced at my back and saw a tree of musk melons bearing three fruits. He said: You are hungry. Eat one of them now and take two with you and depart from this straight path. Then eat half a fruit in the morning and half in the afternoon. But keep the third one safe as you will be in need of it. You will reach a black tent by nightfall and the owners of that tent will convey you to the caravan. Saying this that person disappeared.\n" +
                "\n" +
                "I arose and plucked those musk melons. Ate one of them immediately which was so sweet and tasty that I had never eaten anything so delicious before. I took two musk melons with me and set out on the road suggested by that gentleman till the sun arose. I cut this second musk melon and ate half of it. When it was afternoon I ate the other half. My journey continued. Night began to fall and it was the time of sunset, when I decried that tent. Some people emerged from the tent and they came running to me and held me tight and took me as if I was a spy. When they brought me before their leader, he asked me in a threatening manner: Where do you come from? Tell the truth or I will kill you.\n" +
                "\n" +
                "I explained my circumstances and offered various justifications, but it was of no use. He said: The route from where you claim to come is such way that no one can take it without being dead or being killed by wild animals. Secondly the distance from here to Mashhad Muqaddas is a journey of three days. Now, tell me the truth or I will eliminate you. He pulled out the sword, but he noticed the musk melon with me. I narrated the whole story to him hearing which all them unitedly said: Firstly, there is no musk melon tree in this wilderness; secondly how is its presence possible when we have not seen the like of it. Then they thought for sometime and discussed among themselves from which I understood that they now believed in my truthfulness and they understood that it was a miracle of Imam (as). Then they changed their attitude. All of them kissed my hands and accorded great honor to me. They took away my garments as blessings and provided me with new clothing. They kept me as a guest for two days and on the third day gave me ten Tumans and sent three persons with me till I joined that caravan.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Ya Aba Saleh Al-Mahdi Adrikni");
        esrc.add("Najmus Saqib \n");
        edetails.add("Haji Noori writes in his book Najmus Saqib about Shaykh Ali Rashti who was an extremely pious and knowledgeable Islamic scholar. He was a student of Shaykh Murtuza Ansari. He narrates an incident as follows, Once I was returning to Najaf after completing the ziyarat (visitation) of Imam Husain (as) in Karbala.\n" +
                "\n" +
                "Along the way I came across the river Euphrates and got aboard a small boat that was used generally to cross the river. At that time, my companions in the boat were mostly people from the city of Hilla. I saw that all the people on the boat, save one, were engrossed in vain talks and laughter. This respectable person was sitting quietly in one corner of the boat, but was soon becoming the object of ridicule of the other members of the boat who were poking fun at him and pulling his leg. They were even making fun of his religion and faith.\n" +
                "\n" +
                "Finally we reached a place where the water level was very low. The boat was packed with people and consequently heavy, so we feared that it may sit down and get stuck in the soft mud of the river bed. We were made to get off the boat and we started walking along the riverbank. At this time, I caught up with the respectable person and asked him, “Why are you travelling with such people who are constantly troubling you? And why are they troubling you in this manner?”\n" +
                "\n" +
                "He replied, “These people are from my community. They are all followers of the Ahle Sunnah sect of Islam. My respected father too was a follower of the Ahle Sunnah sect. But my mother was a Shiah. I too was a Sunni at some point of time, but by the grace of Imam Mahdi (as), I have become a Shiah.”\n" +
                "\n" +
                "I then asked him, “How did you become a Shiah?”\n" +
                "\n" +
                "He replied, “My name is Yaqut and I was an oil trader in Hilla. Some years ago, I left with a few companions outside Hilla for business. When we had finished our work, we turned back to return home. During the return journey, we stopped at a place to take some rest. I went to sleep there. When I awoke, I saw that my companions had already left the place and I was alone in the desert. The area was dangerous and infested with wild animals. Also there were no inhabitants in that area. Anyway, I got up from my place, picked up my stuff and started along the way I thought my friends might have taken. I had no idea how to get back to Hilla and knew that I had lost my way. I was alone and worried. I was also extremely thirsty and feared that I would soon become the prey of wild animals.”\n" +
                "\n" +
                "He continued, “My heart will filled with dread and fear. I began calling out to those who I had accepted as my masters at that point of time. For example, I began calling out to Abu Bakr, Umar and Usman. I kept on calling out to them, but no solution seemed to be in sight. I had by now lost all hope. At that time, I remembered the saying of my respected mother that our Imam Mahdi (as) is alive. Whenever you are in some trouble or have lost your way, you must call out to him and he will help you. His Kuniyat is Aba Saleh. I instantly made a promise to Allah (swt) that if ever I was saved from this situation, I would accept the faith of my mother.”\n" +
                "\n" +
                "He continued, “I began calling out to Imam Mahdi (as). Ya Aba Salehil Mahdi Adrikni, Ya Aba Salehil Mahdi Adrikni (O Aba Saleh, O Imam Mahdi, help me).”\n" +
                "\n" +
                "“Suddenly I saw that I was not alone. A person was walking alongside me. He was wearing a green turban. He began explaining to me the way to reach home and said that you accept the religion and faith of your mother. Soon you will reach this village along the way where all its inhabitants will be Shiahs.”\n" +
                "\n" +
                "I said to him, “O my master, Will you not accompany me till this village?”\n" +
                "\n" +
                "He said, “No, because at this time, there are thousands of people who are calling out to me and I must reach to their help.” Saying this, he disappeared from my eyes.\n" +
                "\n" +
                "I had hardly walked a small distance when I came across this village of Shiahs. My companions reached this place almost a day after I had reached there. When I reached Hilla, I went to meet an scholar Allamah Sayyed Mahdi Qazvini who was a resident of the city. I presented myself before him and narrated the entire incident before him. I accepted the Shiah faith before him and memorised the tenets of the sect. I said to him, “O Sayyed, I would like to meet Imam Mahdi (as) once more. What should I do?”\n" +
                "\n" +
                "He advised me to spend 40 Shab Jumuah (Thursday nights) in the haram of Imam Hussain (as) in Karbala so that I would meet Imam Mahdi (as). I started this action and every Thursday night, I would travel from Hilla to Karbala and spend the night there in worship.\n" +
                "\n" +
                "On the last night however, I encountered a problem. The authorities of Karbala had ordered that all those who wished to enter the city would have to produce their identification cards, failing which they would not be allowed to enter the city. They were being strict about this rule and were not allowing those without identity cards to enter Karbala. I was not carrying my identification card with me nor was I carrying a ticket. I also did not have money with me to arrange for these things. My heart sank in the knowledge that I would not be able to complete the task that I had set myself to do. I also tried to enter the city secretly, but it was not possible for me to do so.\n" +
                "\n" +
                "At that time, I saw Imam Mahdi (as) standing in the distance. He was dressed in the clothes of the Irani scholars. He had already entered the city. At that time, I was standing behind the door of the city. I called out to him for help. He came over to me and took my hand and brought me inside the city. It seemed that no one was aware of my presence and of my entering the city. I thought that I would talk to him (as) but realised that he had disappeared from my sight. After that I did not see him again.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Imam Knows The Needs of Believers");
        esrc.add("Aqa Sayyed Murtuza Hussaini Qummi narrates this incident in the book of Masjid Jamkaran");
        edetails.add("Aqa Shaykh Ayatollah Mohammed Taqi Bafeqi was amongst those scholars who was well known for fulfilling his responsibilities of Amr bil Maroof (calling people towards goodness) and Nahi Anil Munkar (preventing people from evil). He lived in the time of Reza Shah Pahlavi, which was an era of extreme evil and immorality. Despite pressure from the corrupt government, Aqa Bafeqi never wavered in the performance of these duties.\n" +
                "\n" +
                "For this, he was imprisoned many times and was even exiled from his home. Despite this, he continued to persevere in these actions. He was granted the opportunity to meet Imam Mahdi (as) many times. There are numerous accounts of his audiences with the respected Imam, one of which is enumerated below.\n" +
                "\n" +
                "Aqa Sayyed Murtuza Hussaini Qummi narrates this incident in the book of Masjid Jamkaran. He says that every Thursday night, our group of companions used to visit Masjid Jamkaran and spend the night there in worship. Aqa Bafeqi also used to accompany us in these nights.\n" +
                "\n" +
                "One such night was extremely cold and it was snowing heavily. I was sitting at home when I suddenly remembered that it was a Thursday night and that we were to go to Masjid Jamkaran with Aqa Bafeqi. In those days, there was no provision to travel to the Masjid by taxi or by any vehicle. One had to travel by foot to reach there. It was still snowing heavily, so I did not expect any person to venture out in this weather. And even if someone were to go out of his house, he would find it extremely difficult to reach the Masjid.\n" +
                "\n" +
                "In any case, I decided to step out of my house and look for Aqa Bafeqi so that I could persuade him not to go to the Masjid tonight. I went to his house, but did not find him there. I looked all over Qum for him, but found no sign of him. Finally I went to Mir Square which falls on the way to Masjid Jamkaran. I stood there for some time looking here and there. At the Square, there was a tea stall, which was owned by my friend. He saw me and asked me whether I was looking for someone. I asked him about Aqa Bafeqi, to which he replied that he had seen him along with his companions moving towards Masjid Jamkaran. He mentioned that since they had passed by this way quite some time ago, it would be difficult for me to catch up with them and that they would have already reached the Masjid by now.\n" +
                "\n" +
                "Reluctantly I turned back to go home. Throughout the night I remained awake in a state of anxiety. Towards the morning, I was able to catch some sleep. In my sleep I saw a dream in which I was blessed with the ziyarat of Imam Mahdi (as). He came towards me and asked me the cause of my worry. I told him that I was worried about the condition of Aqa Bafeqi who had gone to the Masjid in this hostile weather.\n" +
                "\n" +
                "The Imam (as) spoke to me gently, “O Sayyed Murtuza, do you think that I am distant from Aqa Bafeqi? I have just visited the Masjid and have made all the necessary arrangements for his comfort and that of your friends there.”\n" +
                "\n" +
                "I awoke from my sleep and rushed to give the good news that I had seen Imam Mahdi (as) in my dream and that he had made the arrangements for the safety of Aqa Bafeqi and my companions. My family members, who were also worried, relaxed on hearing this news.\n" +
                "\n" +
                "The next night I left my house and happened to meet a person who was with Aqa Bafeqi the previous night. He said to me, “We had kept a place for you last night. Aqa Bafeqi first took us to Masjide’ Jamkaran. It was an amazing night. For some reason, we felt as if it was not snowing. The ground on which we were walking was completely dry. So we were able to reach our destination very quickly. When we reached the Masjid, we saw that there was no one there. It was however very cold there and we did not know what to do.”\n" +
                "\n" +
                "In those days, Masjid Jamkaran was a small broken down place. There was no building like there is today. Only a few people used to visit the place and benefit spiritually from it.\n" +
                "\n" +
                "Suddenly we saw that a respected Sayyed walked into the Masjid. He said to Aqa Bafeqi, “If you desire tea and some items for your comfort, I can organise them for you.” Aqa Bafeqi said, “Whatever you think best.” The Sayyed went out of the Masjid and returned after some time with the items. This was very surprising because there were no inhabitants in that area, yet he was able to procure all these things without much difficulty.\n" +
                "\n" +
                "When the Sayyed was about to leave, one of our companions asked him, “Are you going to go to Qum early in the morning? In that case, who should we leave these things with?” The Sayyed said, “The one who has brought these things will take them back also.” Saying this, he left from there. After he left, we began thinking how this Sayyed was able to arrange all these items so quickly since the area was not inhabited. Even if he had brought it from the village of Jamkaran, it would have been very difficult for him in this cold and snowy weather. In any case, we spent the night in comfort and ease and early in the morning, we left those things there and came back to Qum.”\n" +
                "\n" +
                "I then narrated my dream to him and told him that Imam Mahdi (as) does not leave his friends without any help or support");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");

        etitle.add("Cure From Disease");
        esrc.add("Najmus Saqib volume 1 chapter 7 page 639");
        edetails.add("\n" +
                "This incident is reported about Mirza Muhammad Husain Naini Isfahani, a prominent and pious scholar. The incident is narrated by his brother as follows – Around the year 1285, my brother developed pain in his leg and swelling appeared at the back of the foot, where a blood clot rendered him unable to walk.\n" +
                "\n" +
                "They brought Mirza Ahmad the physician, son of Mirza Haji Abdul Wahhab Naini for his treatment and he treated him and his leg and foot were restored to health. Within a few days another abscess appeared between his knees and calf and after another few days another abscess appeared in his thigh and a third abscess between the shoulders; each of which became infected and were very painful. They festered and became full of puss.\n" +
                "\n" +
                "More than a year passed in that condition and all kinds of treatments were taken, but none proved effective. On the contrary, the wounds continued to increase by the day and during this long time, he was unable to put his foot on the ground and they used to carry him from one place to another on shoulders.\n" +
                "\n" +
                "Because of the prolonged illness, his mood became weak and due to excess bleeding and puss he was reduced to a bundle of skin and bones and it became very difficult as any treatment they adopted only worsened his wounds and weakened his condition further.\n" +
                "\n" +
                "During those days a severe epidemic appeared in Nain, and we took refuge from it in one of the villages. Thus, we were informed that an expert surgeon called Agha Yusuf was staying at a nearby village.\n" +
                "\n" +
                "Someone was sent to him so that he may attend to the patient. However when my indisposed brother was brought before him for treatment, he was shocked for a moment till my father went out and I remained with him along with one of my uncles, Mirza Abdul Wahhab. He spoke to him in private for some time and we concluded from what we overheard that he was conveying the message of despair to him and he was concealing it from me lest I should inform my mother. Then he became distressed and very much worried.\n" +
                "\n" +
                "Then my father returned. That surgeon said: I will take this much as advance and then I will begin the treatment and his aim was that the denial of my father would become an excuse for him to leave before starting the treatment.\n" +
                "\n" +
                "My father refused to pay any advance before the treatment and he got an opportunity and returned to his village. My parents knew that this was because the doctor had no hope to treat the patient; and despite having such expertise, he had given up.\n" +
                "\n" +
                "I had another uncle, Mirza Abu Talib who was very religious and was well known in the area, because he wrote letters addressed to Imam Mahdi (as) on behalf of people, which were very effective and people often contacted him during hardships and calamities.\n" +
                "\n" +
                "My mother requested him to write a letter seeking the help of the Imam to cure her son. He wrote it on Friday. The mother took it and taking my brother, went to a well near our village. My brother dropped that letter into the well and it remained suspended at the top of the well in the hands of the mother and this moved both of them and they wept intensely; and it was the last hour of Friday.\n" +
                "\n" +
                "After a few days, when I dreamt that three mounted men have arrived in the form they had arrived in the incident of Ismail Harqali, from the desert and reached our place. In that condition I recalled the incident of Ismail and at that time I was aware of it and its details were in my knowledge. (Read this incident)\n" +
                "\n" +
                "So, I noticed that the rider preceding them was Imam Mahdi (as) and that the Imam had come to cure my brother. My brother was lying on his back or leaning on his bed as was his practice most of the time. The Imam (as) approached with a spear which he passed over his body and said, Get up, as your uncle has returned from the journey.\n" +
                "\n" +
                "In this way, I realized that Imam (as) implied another uncle of ours, Haji Mirza Ali Akbar, who had gone on a business trip since a long time and we were worried about him because of the delay due to the changing times and severe famine.\n" +
                "\n" +
                "When the Imam passed the spear on his shoulder and uttered that statement, my brother woke up and hastened to the door to welcome that uncle.\n" +
                "\n" +
                "After I awoke, I saw that it was morning and the atmosphere was lit up and no one had risen up for the morning prayers. I rose up in haste and went to my brother before changing my clothes.\n" +
                "\n" +
                "I woke him up and said, Imam Mahdi (as) has cured you; you may get up.\n" +
                "\n" +
                "I took his hand and made him stand up. My mother woke up and cried: Why are you waking him? He was awake most of the night due to pain and a little more sleep will be good for him. I said, Imam Mahdi (as) has cured him.\n" +
                "\n" +
                "When I made him stand up, he started walking around the room and though he was unable to stand up since a year or more and was carried from one place to another by others.\n" +
                "\n" +
                "This incident was publicized in that village and all relatives and acquaintances came to see him as they could not believe it. I narrated the dream to them and I was pleased that I made haste to narrate about the cure while he was asleep and the blood and puss stopped that day and his wounds were cured within a week.\n" +
                "\n" +
                "After some days our uncle arrived safe and sound and on this date, which is year 1303 and all the persons mentioned in this story are alive, except my mother and the surgeon, who passed away. And all praise is for Allah alone.");



        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Cure for Ismail Harqali");
        esrc.add("The accomplished scholar, Ali Ibne Isa Irbili says in Kashful Ghummah");
        edetails.add("The accomplished scholar, Ali Ibne Isa Irbili says in Kashful Ghummah says that, some people informed me from my trusted friends that there was a person in Hilla known as Ismail Ibne Hasan Harqali from a village known as Harqal, who died during my time, but whom I did not have the chance to meet.\n" +
                "\n" +
                "His son, Shamsuddin narrated to me that his father said that an abscess came up on his left thigh and became as big as a fist. This abscess was there for a long time and it particularly gave him severe pain during the spring season. He used to lose a lot of blood through it. He said that he wasn’t able to properly offer his mandatory prayers because of the abscess. He worried so much about this that he went from his village to the town of Hilla. There he met Sayyed Raziuddin Ibne Taaoos, who was the most eminent scholar of the Shia during those days although he wasn’t recognized as their Marja, only, perhaps because he abstained from issuing edicts to the believers.\n" +
                "\n" +
                "Ismail Harqali met him and explained his problem to him. Sayyid Raziuddin called all the physicians of Hilla and sought their advice. They suggested that the only possible cure was the amputation of the abscessed limb. But they also said that there was great risk even in amputation, because there was the risk of severance of some vital veins in the process of amputation. The physicians were believers, and they didn’t want to give him careless advice.\n" +
                "\n" +
                "Sayyid Raziuddin told Ismail Harqali: “The Shariah gives permission to offer your prayers despite the impurity of the pus oozing from the abscess.” He said, in fact, prayers in such excruciating conditions will be doubly felicitous.\n" +
                "\n" +
                "Now, there was only one city, Baghdad, where there could perhaps be a possibility of his finding a cure. Baghdad was the capital of the realm of Islam and scholars of all disciplines were assembled there. Ismail Harqali thought that he must head for Baghdad. He met the personal physician of the Caliph and went to heavy expenses to take his treatment. He spent all his money, but the cure was not in sight. He had spent all his funds and was then subject to abject penury. He now thought that he would go and seek the help of the Imam Mahdi (as) in Samarrah. Therefore, he proceeded from Baghdad to Samarrah.\n" +
                "\n" +
                "For many days he continued to visit the Mausoleum of the Imams (as) and also visited the cellar from where the Imam Mahdi (as) went into Ghaybat. Although the cellar at Samarrah isn’t the abode of the Imam (as), it is certainly associated with his memory. Many days went by when he thought that there was no hope of his recovery from the abscess and he was thinking of returning home disappointed. He thought that he had left his wife and children at home long enough and that he must go back to them.\n" +
                "\n" +
                "Therefore, the next morning, early with the sunrise, he went out of the ramparts of the city. Near the ramparts was flowing the river Tigris. He took a bath there and wanted to visit the mausoleums to bid adieu to the Imams (as). He changed into a clean dress and carried water in a pitcher for cleaning the abscess if it suppurated.. This was as a caution for his entering the mausoleum in a clean state. As he entered the ramparts of the town, he found four persons cantering on horses towards him. Their personalities and garments were different from those of the Samarrans. He thought that they must be some travelers passing through the town.\n" +
                "\n" +
                "They came near him and suddenly stopped. Two of them were youths. They came and stood on his left. There was one elderly person who stood on the other side. The fourth person, who was neither a youth nor an old person, stood in front of him and inquired about the condition of the abscess and said that he would like to inspect it. He replied that the abscess was increasing by the day. Ismail thought that he had just cleaned himself and was going for the Ziyarat. He was wondering if he would lose his cleanliness if the person touched his abscess. He therefore refused to oblige. Now, the person strongly protested why he wasn’t willing to show them his abscess? Then the person bent low, pushed aside the garment from his thigh, held the abscess in his hands. Suddenly the pus gushed out from the abscess. He felt pain for a while, but was relieved soon thereafter.\n" +
                "\n" +
                "Then the person put his hand over the area of the abscess and it looked completely cured. The person put back his garment in its place and said, “O Ismail! You are now fully healed!” He wondered who this person was? How could he know his name? He asked, puzzled and amazed, “How is it that you know me by name?!” The elderly person standing on his right said, “Ismail! Greet him! He is your Imam Mahdi (as)!” Ismail greeted the Imam (as). But replying to his greeting he swiftly mounted the steed and the four persons sped away from sight in no time!\n" +
                "\n" +
                "Ismail tried to sprint behind the horse of the Imam (as). For once the Imam (as) stopped his horse and asked him to turn back. He continued to run behind the Imam’s steed. He stopped a second time, and a third time when he said angrily, “O Ismail! I am your Imam-e-Zamana and I have asked you twice not to follow me! Even then in sheer disobedience you continued to follow us!”\n" +
                "\n" +
                "Ismail was taken aback. He turned back towards Samarrah. It was early morning and people were stirring out of their homes. He asked them if they had seen the four persons speeding through the town on their steeds. They replied in the affirmative. Ismail asked them if they knew the four riders? They said that they didn’t know them, but their faces and attire indicated that they were not from that area. Then Ismail said that they had deprived themselves the opportunity of meeting Imam Zamana (as). People gathered around him and asked if he had been able to meet the Imam (as).\n" +
                "\n" +
                "He told them that he was visiting Samarrah seeking a cure for the abscess on his thigh. He informed them that the Imam (as) himself touched the abscess and it was instantly cured. The persons removed the cloth from his thigh to see if that was the case. They also inspected the other thigh. There wasn’t any sign if ever there was an abscess on any of his thighs. The persons snatched away small pieces of his garment to keep with themselves as a memento. They said that Ismail was the fortunate person, whose body was touched by the Imam (as). He went with difficulty to the inn, changed into a fresh garment and started for Baghdad.\n" +
                "\n" +
                "When he reached the Baghdad Bridge, he saw a wondrous scene. The story of his miraculous cure had preceded him and there was a huge crowd waiting for him on the bridge. Whenever any traveler reached the bridge, they would ask his name and then let him pass. Ismail didn’t know why they were asking the name of the new arrivals. When he told them that he was Ismail Harqali, they caught hold of him as was done by the men in Samarrah. It was almost a stampede and he was about to swoon and fall down. Then he noticed Sayyed Raziuddin Ibne Taaoos coming towards him with a big crowd following him. He asked the men to allow him some fresh air.\n" +
                "\n" +
                "Hearing his admonition, the men moved away from Ismail. Sayyid Raziuddin caught hold of his shoulder and took him to his house in Baghdad. He told Ismail that the entire populace in Baghdad knew about his miraculous cure. Ismail related to him the entire episode. He told him that not only the story was correct, but the Imam (as) had sent a personal message for Sayyed Raziuddin. Sayyid Raziuddin immediately offered a prayer of thanksgiving and took him along to the caliph.\n" +
                "\n" +
                "The caliph was a follower of the Ale Mohammed (as). Sayyid Raziuddin recounted the entire event to the vizier. The vizier informed about it to the caliph. The caliph called them immediately to his court and ordered all the eminent physicians of Baghdad to immediately report at the court. They all came there. The caliph asked them if they remembered Ismail who approached them some days ago for the treatment of the abscess on his thigh. They confirmed that they did inspect the abscess and also that they thought that it wasn’t possible to treat it. The only alternative was the amputation of the limb. The caliph asked, if the abscess had healed, what would have been the result? They replied that if the abscess really healed, it would leave an ugly mark on the spot for at least two months or more, which would then turn into a white mark that the person would carry for his entire life. Now, the caliph asked Ismail to move his garment from the spot where the abscess was. The physicians inspected it minutely and were surprised that there wasn’t any mark of the abscess there and the skin was as healthy as that of a normal person.\n" +
                "\n" +
                "One of the physicians was a Christian. He said that what happened could only be a miracle of Hazrat Isa (as). Now, the team of the physicians was sent away. The caliph wanted to give to Ismail a thousand Dinars as a gift, which he politely refused. The caliph was surprised why he was not accepting the gratuity. He said that the one, who cured him has ordered him not to accept any gift. Ismail now went back to the place of Sayyed Raziuddin Ibne Taaoos. He wrote a letter to Ali Ibne Owais, who sent to Ismail a purse containing 1,000 Dinars. When Ismail Harqali returned to his village, his son saw the thigh and was surprised that the abscess had totally disappeared and there was no mark left! Even hair had grown at that spot as it normally does.\n" +
                "\n" +
                "Also his son, Shamsuddin narrated: After this incident, my father used to remain very sorrowful due to the separation. Thus, he used to go and stay in Baghdad during the whole of winter and travel to Samarrah and perform the Ziyarat. This year he performed Ziyarat for the fortieth time only in the hope that perhaps he gets the same chance again to see Imam Zamana  (as). But may Allah have mercy on him; he passed away this year with the hope that he will see the Imam again.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("My Son Mahdi Is At Kufa Mosque");
        esrc.add("This incident is present in many books of Rejal that deal with the biography of Muqaddas Ardabeli. (Those who were successful in the Search for Qaem (as) pages 27-30)\n");
        edetails.add("One of those exalted personalities who have had the honour of meeting Imam (as) and having their problems solved by Imam (as) was the great scholar Muqaddas Ardabeli (died 993 A.H.). He was so famous for his piety and worship that whenever a comparison was intended he was mentioned as the ideal example.\n" +
                "\n" +
                "It is well-known that whenever Muqaddas Ardabeli came across a difficult question he used to go near the tomb of Ameerul Momineen Ali (as) and seek the solution for the same. Imam Ali (as) used to provide the answer to his question. He had reached such a high position due to his piety and firm belief in Imamat that he was capable of direct communication with Imam Ali (as) One of the students of Muqaddas Ardabeli and a scholar in his own right was aware of his master’s capabilities.\n" +
                "\n" +
                "He writes that, one night I was tired due to prolonged study, and in order to refresh myself, I was taking a stroll in the courtyard of the mausoleum of Ameerul Momineen Ali (as). Suddenly, I saw a shadow approaching the tomb although all the doors of the building were locked. Curious to see the outcome of this all, I followed the shadowy figure.\n" +
                "\n" +
                "When the figure reached the sanctum all the locks opened automatically and the door swung open as he put his hand on it. He finally stood before the tomb of Imam Ali (as) and saluted. I even heard the reply to his salaam. Then a conversation began in the same voice. Before the conversation could reach to its conclusion, the shadowy figure emerged and began to walk out of the city in the direction of the Kufa mosque. I began to follow him. The person entered the mosque of Kufa and upon reaching the niche he began to converse with someone.\n" +
                "\n" +
                "When the conversation ended he came out of the mosque and began to walk back to the city. The whiteness of dawn had begun to spread all over the surroundings. People were slowly arising from their beds and preparing themselves for the morning prayers. As I was following the figure quietly, I could not suppress a sneeze. The person I was following became aware. He turned around and looked at me. When I looked at his face, I saw that he was my teacher, Ayatullah Muqaddas Ardabeli.\n" +
                "\n" +
                "I conveyed my salaam to him and confessed that I had been following him all night since he had entered the tomb of Ameerul Momineen (as). I then implored him to tell whom he was conversing within the purified sanctuary and the mosque of Kufa.\n" +
                "\n" +
                "Muqaddas Ardabeli first made me promise that I will not divulge this secret during his lifetime. Then he said, My son! Sometimes I find a particular problem difficult to solve. I present it to Ameerul Momeneen Ali Ibn Abi Talib (as) and obtain the solution from him. Last night Ameerul Momineen (as) guided me towards Imam Mahdi (as) and said, My son Mahdi is in the Mosque of Kufa. He is the Imam of your time. Go to him and seek the reply to your question.\n" +
                "\n" +
                "I went to the mosque of Kufa as per his orders and found my master Hazrat Mahdi (as) standing in the niche of the mosque. I asked him the questions and received their replies.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Appointment of Mujtahid");
        esrc.add("Ganjeena-e-Danishmandan volume 8");
        edetails.add("After the demise of Ayatullah al-Uzma Haaj Shaykh Muhammad Hasan Najafi (r.a.) (the author of al-Jawaahir) the people considered Shaykh Murtuza Ansari as the Marjae Taqleed (the most learned Mujtahid to be followed).\n" +
                "\n" +
                "Consequently, they requested him to compile his Tauzeeh al-Masael (book of Islamic Law). Upon this he said, I refuse to accept this great position because Sayyidul Ulama (the chief of the learned), Ayatullah Mazandarani is yet amongst us. He is more learned than me and resides at Babel. Thus I cannot compile my own Tauzeeh al-Masael.\n" +
                "\n" +
                "Shaykh Murtuza Ansari wrote a letter to Sayyid ul Ulama requesting him to come to Najaf al-Ashraf so that he may assume control and supervision of the Shiah institutes of learning.\n" +
                "\n" +
                "Sayyidul Ulama replied to Shaykh Ansari, It is true that when I was at Najaf al-Ashraf, I used to be more knowledgeable in jurisprudence when I held debates with you. But I have settled down in Babel for quite some time. I do not participate in classes nor do I teach any more. I have also stopped all kinds of debates and discussions. Hence, I consider you more learned and eligible for this position and request you to accept the same.\n" +
                "\n" +
                "Despite this communication, Shaykh Murtuza Ansari refused to accept the position of Marjae Taqleed and thought to himself, If my Master,Hazrat Imam Mahdi (as) gives me the permission and bestows favor upon me by appointing me to this post, I shall accept it.\n" +
                "\n" +
                "One day Shaykh Ansari was delivering a lecture to his students. A stranger entered the gathering. He seemed to be of a noble and dignified lineage. The Shaykh welcomed him with respect. The stranger posed a question to Shaykh Ansari in the presence of his students,\n" +
                "\n" +
                "What is the order for a woman whose husband has transformed into any other form (Maskh)? (Maskh is the transformation of a human being into a stone, plant or an animal. This type of punishment was prevalent in the age of Prophets prior to Holy Prophet (sawa)). Since this type of punishment has not been decreed for the people of this age, we do not find this problem in any of the books of Islamic Law.\n" +
                "\n" +
                "Shaykh Ansari answered, as this question is not mentioned in the books of jurisprudence, I am unable to reply.\n" +
                "\n" +
                "But suppose such an eventuality does occur, then what would be the duty of the woman whose husband has undergone transformation? the stranger persisted.\n" +
                "\n" +
                "At this Shaykh Ansari replied, My opinion (Fatwa) is that a woman whose husband has turned into an animal should observe iddah of divorce and after this period, she can remarry. It is because her husband is still alive and has a soul intact. As for the woman whose husband has turned into a dead object, must observe the iddah of death (of husband). She can marry only after this iddah. This is due to the fact that her husband has turned into a dead thing and should be considered dead.\n" +
                "\n" +
                "Upon hearing this gentleman said, You are a Mujtahid! You are a Mujtahid! You are a Mujtahid!\n" +
                "\n" +
                "Then he got up and went out of the gathering. Shaykh Ansari realized that it was none but Hazrat Imam Mahdi (as) and that he (as) has given him his express permission to become Marajae Taqleed. He told his students to search for this gentleman. The students rushed out, looked for him everywhere but without success. After this Shaykh Ansari agreed to compile his laws of Shariah so that people could follow him (i.e. do his Taqleed).");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Amir Ishaq Astarabadi (Tahyul Arz)");
        esrc.add("Beharul Anwar volume 52 chapter 29");
        edetails.add("\n" +
                "In our time was a noble and righteous personality by the name of Amir Ishaq Astarabadi. He had completed 40 Hajj on foot. It was famous among the people that the earth used to fold up for him.\n" +
                "\n" +
                "One year he came to Isfahan. I went to him to ask him about the fame he had earned. He told me, The cause of that honor is that one year when I was on my way to the Holy House of Allah, along with other pilgrims, and when we were at a distance of seven or nine stages from Makkah, I was, for some reason, left behind the caravan and soon they went out of my sight. I lost my way and overcome with thirst, I was about to die when I prayed, “O the righteous one, O Aba Saleh guide us to the path, may Allah have mercy on you.”\n" +
                "\n" +
                "Suddenly an apparition became visible at the end of the desert, before I could make it out, it had already reached me. I saw a handsome youth wearing clean clothes of green hue and having a noble demeanor riding a camel and carrying a water in a container. I saluted him and he replied to my salaam and asked, are you thirsty?\n" +
                "\n" +
                "Yes, I replied.\n" +
                "\n" +
                "He gave me the vessel and I drank the water. Then he asked, would you like to join your caravan? Again I replied, yes.\n" +
                "\n" +
                "He made me mount behind him and moved to Makkah. I had the habit of reciting the Hirz-e-Yamaani everyday. At that time also I began to recite it. At some points he corrected me and said, recite like this.\n" +
                "\n" +
                "Not much time passed that he said to me, do you recognize this place?\n" +
                "\n" +
                "I looked and saw that I was at Abtah. He asked me to alight which I did. But when I turned back he had disappeared. At that moment I realized that he was Imam Mahdi (as). I became regretful and sad at his separation and was affected that I had not recognized him. Thus when seven days had passed, my caravan reached Makkah and people found me there – while they had lost hopes of my survival – therefore I became famous for having the land folded for me");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Incident of Deceptive Pomegranate");
        esrc.add("Beharul Anwar volume 52 chapter 29");
        edetails.add("Allamah Majlisi says, I heard from some reliable scholars that at the time of British rule in Bahrain, they appointed a Sunni Muslim as governor despite the fact that the majority of the population was Shiah.\n" +
                "\n" +
                "There was also a particular Sunni minister who was enmical towards the Shiah. One day he brought a pomegranate to the governor. On the pomegranate,the names of Abu Bakr, Umar, Uthman and Imam Ali (as) were found,together with the inscription that these were the four rightful caliphs of the Muslims.\n" +
                "\n" +
                "The minister claimed that this was a natural miracle and a sign from Allah that the Shiah belief was incorrect. He urged that now the Shiah should not be regarded as Muslims and be asked to become “true” Sunni or be killed or made to pay the taxes of non-Muslims.\n" +
                "\n" +
                "The governor was delighted at this occurrence and summoned the Shiah scholars and put three alternatives to them.\n" +
                "\n" +
                "The Shiah were perplexed when they saw the fruit and asked for three days to return with their reply. This time was granted to them and they went away wondering what to do. Finally they decided to seek help from Imam Mahdi (as).Three pious scholars were selected and each one was to go out of the city into the wilderness and pray for the assistance of the Imam (as). On the first two nights, the first two scholars spent the whole night in prayers and supplications, but with no success. On the third night, the third scholar, saw an impressive personality approach him at dawn.\n" +
                "\n" +
                "The man asked him what the problem was. He replied that if he was truly his Imam then he would surely know the problem. The Imam (as) then replied that he was aware of the difficulty and not to worry. He told the scholar to go with the governor to the minister’s house the next day, and insist on going to the terrace. There he would find two moulds with the false inscription printed on them. These moulds had been fitted into the growing fruit so that, as it grew, the words were embedded on it’s skin. He further told him to ask the minister to break open the fruit and witness the power of Allah.\n" +
                "\n" +
                "The next morning matters proceeded as the Imam (as) had ordered. When the minister was told to take everybody on to the terrace he went pale and began to make excuses.\n" +
                "\n" +
                "At the governor’s insistence, he reluctantly led them to the place, where they found the articles as described by Imam Mahdi (as). Eventually the governor asked the minister to break open the fruit. When he did so, black dust flew from it and smeared his eyes and beard. The minister was executed for his treachery while the Shiah scholars left with honor and dignity.");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Recommendation to Recite Dua Faraj");
        esrc.add("Muntahiul  Aamal page 1141; Darus Salam Iraqi page 351; Najmus Saqib page 480; Sahifa Mahdaviyah (translation) page  121 quoting from Tabsiratul Waali page 192; Beharul Anwar volume 91 page 349; Dalaelul Imama page 551");
        edetails.add("This incident is narrated in Ghaybat Kubra from Abul Husayn bin Abul Baghl Katib who says, I took on a duty from Abu Mansur Ibne Salihan and then something happened between me and him that caused me to go into hiding.\n" +
                "\n" +
                "Abu Mansur asked for me and threatened me. I waited in hiding with fear and then went to the graveyard of Quraysh in Baghdad on a Thursday night (Shabe Jumuah). I intended to spend the night there, praying and supplicating.\n" +
                "\n" +
                "It was a windy and rainy night. I asked Abu Jafar, the custodian, to lock the doors and make sure no one remains there so I may pray and supplicate in solitude. Also I wanted to be safe from the evil of anyone because I was fearful.\n" +
                "\n" +
                "He did that and locked the doors. Half past the night, the winds and rains were so powerful that they made sure no one came to the place. I stayed praying and reciting Ziyarat, and worshipping. As I was like that, I heard footsteps there before the tomb of Imam Musa (a). There was a man reciting Ziyarat. He greeted Hazrat Adam (as) and the other great prophets (as) and then the Imams (as), one after the other until he reached the name of Imam Mahdi (as) But he did not mention him by name. I wondered why and thought perhaps he has forgotten or he does not know or maybe this is his belief.\n" +
                "\n" +
                "When he finished his Ziyarat, he offered two rakats of prayers. I was fearful of him, since I did not know him. He seemed a full young man, dressed in white clothes, wearing a turban with its end coming down under his chin and going over his shoulder, with braided hair, and had a cloak with long threads at its margins on his shoulder. He said, O Abu Husayn Ibne Abul Baghal, why are you not reading the supplication of Faraj?\n" +
                "\n" +
                "I asked, and which supplication is that, my master?\n" +
                "\n" +
                "He said, Pray two rakats, and say –\n" +
                "\n" +
                "يَا مَنْ أَظْهَرَ الْجَمِيلَ، وَ سَتَرَ الْقَبِيحَ، يَا مَنْ لَمْ يُؤَاخِذْ بِالْجَرِيرَةِ، وَ لَمْ يَهْتِكِ السِّتْرَ،\n" +
                "\n" +
                "يَا عَظِيمَ الْمَنِّ، يَا كَرِيمَ الصَّفْحِ، يَا حَسَنَ التَّجَاوُزِ، يَا وَاسِعَ الْمَغْفِرَةِ،\n" +
                "\n" +
                "يَا بَاسِطَ الْيَدَيْنِ بِالرَّحْمَةِ، يَا مُنْتَهَى كُلِّ نَجْوَى، يَا غَايَةَ كُلِّ شَكْوَى،\n" +
                "\n" +
                "يَا عَوْنَ كُلِّ مُسْتَعِينٍ، يَا مُبْتَدِئاً بِالنِّعَمِ قَبْلَ اسْتِحْقَاقِهَا\n" +
                "\n" +
                "Translation: O He, Who reveals virtue, O He, Who conceals vice, O He, Who does not call to severe account for sins, O He, Who does not disclose the disgrace of His servants, O He, Who is the best forgiver, O He, Who overlooks errancy, O He, Whose forgiveness extends over all, O He, Whose Hands are stretched forth in mercy, O He, Who knows all secrets, O He, to Whom all complaints are directed. O helper of all those who seek help. O initiator of the bounties before one becomes deserving for them.\n" +
                "\n" +
                "Then recite each of the following ten times:\n" +
                "\n" +
                "يَا رَبَّاهْ\n" +
                "\n" +
                " يَا سَيِّدَاهْ\n" +
                "\n" +
                " يَا مَوْلَيَاهْ\n" +
                "\n" +
                " يَا غَايَتَاهْ\n" +
                "\n" +
                " يَا مُنْتَهَى رَغْبَتَاهْ\n" +
                "\n" +
                "Translation: O Lord! O Chief! O Master! O final aim! O Limit of inclination!\n" +
                "\n" +
                "Then recite:\n" +
                "\n" +
                "أَسْأَلُكَ بِحَقِّ هَذِهِ الْأَسْمَاءِ، وَ بِحَقِّ مُحَمَّدٍ وَ آلِهِ الطَّاهِرِينَ إِلَّا مَا كَشَفْتَ كَرْبِي،\n" +
                "\n" +
                "وَ نَفَّسْتَ هَمِّي، وَ فَرَّجْتَ عَنِّي، وَ أَصْلَحْتَ حَالِي\n" +
                "\n" +
                "Translation: I ask You by the right of these names, and by the right of Mohammed and his purified progeny, that You remove my grief, dispel my sorrow, bestow success to me and improve my condition.\n" +
                "\n" +
                "And then you ask for your desire and then you put your right cheek on the earth and say a hundred times in Sajdah –\n" +
                "\n" +
                "يَا مُحَمَّدُ يَا عَلِيُّ، يَا عَلِيُّ يَا مُحَمَّدُ، اكْفِيَانِي فَإِنَّكُمَا كَافِيَايَ\n" +
                "\n" +
                "وَ انْصُرَانِي فَإِنَّكُمَا نَاصِرَاي\u200F\n" +
                "\n" +
                "Translation: O Mohammed! O Ali! O Ali! O Mohammed! Suffice me as you two are sufficers. Help me as you two are helpers.\n" +
                "\n" +
                "And you place your left cheek on the earth and say a hundred times\n" +
                "\n" +
                "أَدْرِكْنِي\u200F,\n" +
                "\n" +
                "help me\n" +
                "\n" +
                "and repeat it over and over and you say\n" +
                "\n" +
                "الْغَوْثَ الْغَوْث\u200F\n" +
                "\n" +
                "refuge, refuge\n" +
                "\n" +
                "until you run out of breath and then raise your head. Allah will fulfill your wish through His generosity.\n" +
                "\n" +
                "As I applied myself to the prayers and supplications, he left.\n" +
                "\n" +
                "When I was finished, I decided to go out to Abu Jafar to ask him about the man and how he had entered. I saw all the doors had been locked the way they were. I was perplexed much and thought perhaps he had spent the night there and I may not have realized. I found Abu Jafar, the custodian. He came out to me from the oil-room. I asked him about the gentleman and his entrance. He said, The doors are locked as you see them. I have not opened them.\n" +
                "\n" +
                "I told him about the incident. He said, This is our master, Imam Mahdi – the Master of the Age, (as). I have seen him many times in the nights like this when the shrine is empty from the people.\n" +
                "\n" +
                "I became much sad for the missed opportunity. I exited near dawn and went to Karkh towards the place where I was hiding. It was but the daybreak when men of Ibne Salihan were begging to meet me and were asking my friends about me.\n" +
                "\n" +
                "They were carrying a letter of pledge of protection from the minister and a slip in his handwriting that had every pleasant thing. I went to him with a trustworthy friend of mine. He rose and embraced me and treated me in a way that I had never seen from him before. He said, Have things worsened so much for you that you had to complain about me to Imam Mahdi (as). I said, I simply prayed and supplicated.\n" +
                "\n" +
                "He replied, I saw my master the Master of the Age in my dream last night. He meant the previous night – Thursday night. He was ordering me to do every good deed and expressed a dislike to me that frightened me.\n" +
                "\n" +
                "I said: La Ilaaha Illallah! I bear witness that they are the truth and the pinnacle of righteousness. Last night I saw our master while I was awake. And he asked me to do such and such things.\n" +
                "\n" +
                "Thus I explained to him what I had seen in the shrine.\n" +
                "\n" +
                "He was astounded. He conferred great favors upon me with respect and I reached a level I did not anticipate. All this was from the blessings of our master, Imam Mahdi (as).");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Ali Ibne Mahziyar");
        esrc.add("Dalael Al Imamah page 539");
        edetails.add("Ali bin Ibrahim bin Mahziyar Al-Ahwazi was one of the fortunate Shiahs who has the opportunity to meet Imam Mahdi (as). His meeting was not a chance meeting rather he was specially invited for the same. Ali Ibne Mahziyar travelled for Hajj 20 times just so that he would get the opportunity to meet Imam Mahdi (as). His meeting with the Imam (as) happened on the 21st journey for Hajj.\n" +
                "\n" +
                "Ali bin Mahziyar narrates, one year on my way to Hajj, I went to Medina and stayed a few days. I was asking and looking for Imam Mahdi (as). However, I did not hear anything about him nor did I see any sign of him. I was extremely saddened and was worried that I might not attain my goal of meeting him (as).\n" +
                "\n" +
                "I went to Makkah and performed the rituals of Hajj and stayed an extra week in Makkah looking for the Imam (as). One day when I was next to the Kabah, I saw the door of the Kaabah open and I saw a handsome man wearing a garment on his shoulders and another garment around his waist. The man had one side of his garment raised to his opposite shoulder. When I looked at him, my heart felt very comfortable and I started moving toward him.\n" +
                "\n" +
                "When I reached him he asked me, “Where are you from?” “Iraq,” I replied.\n" +
                "\n" +
                "“Which part of Iraq?” the man asked. “Ahwaz,” I replied.\n" +
                "\n" +
                "“Did you know a man named Khaseeb/Hudhain?” the man asked. “Yes,” I replied.\n" +
                "\n" +
                "The man said, “May Allah’s Mercy be on him (his soul). His nights were long (with prayers) and filled with tears and great results.”\n" +
                "\n" +
                "Then the man asked me, “Do you know where (the son of) Mahziyar is?”\n" +
                "\n" +
                "“I am him,” I replied.\n" +
                "\n" +
                "The man said, “May Allah enliven you with Salaam, O Abal Hasan!”\n" +
                "\n" +
                "Then he shook my hand, hugged me, and asked, “O Abal Hasan! What did you do with the sign that (Imam) Abu Mohammad, (Hasan bin Ali Al-Askari (as)) – may Allah beautify his face – gave you?”\n" +
                "\n" +
                "“I have it with me,” I replied.\n" +
                "\n" +
                "Then I put my hand in my pocket and took out a ring which had “Mohammed and Ali” engraved on it and showed it to the man. When he saw the ring, he started crying so much that the garment that was on his shoulder became wet.\n" +
                "\n" +
                "Then he said (referring to Imam Hasan Al-Askari (as)), “O Aba Mohammed! May Allah’s mercy be upon you. You are the beauty of this nation. Allah honoured you with the Imamate and placed the crown of knowledge and understanding on your head. And (soon) we shall join you.”\n" +
                "\n" +
                "Then he shook my hand, hugged me again, and said, “What are you looking for, O Abal Hasan?”\n" +
                "\n" +
                "“The Imam who is hidden from the world,” I replied.\n" +
                "\n" +
                "The man said, “He is not hidden from you people but your evil deeds have created a shield between him and you. Go back to the place of your stay and be prepared for meeting the Imam. Meet me between Safa and Marwa when the sun goes down and the sky is filled with the shining stars.”\n" +
                "\n" +
                "My soul was relieved and I became certain that Allah had blessed me. I was (eagerly) waiting until it was time. I rode my donkey until I saw the man (from far).\n" +
                "\n" +
                "He said to me, “Come toward me, O Abal Hasan!” When I reached him, he greeted me with Salaam.\n" +
                "\n" +
                "He said, “Follow me, O brother!” We kept moving from deserts to mountains until we reached Taef.\n" +
                "\n" +
                "Then the man said to me, “O Abal Hasan! Let us stop to pray the remainder of the night prayers.”\n" +
                "\n" +
                "I followed behind him as he performed two units of prayer, and then another unit, and then Fajr prayers.\n" +
                "\n" +
                "I asked him about the first two units and he said, “They are from the night prayers and also the Watr (the one unit) is from the night prayers, and Qunoot is permissible in all of these prayers.”\n" +
                "\n" +
                "Then he said, “O brother! Let us move now.”\n" +
                "\n" +
                "We started moving from deserts to mountains until we reached a large valley (that smelled) like camphor. In the middle of this valley, there was a house (tent) made of (camel) hair which was shining with light.\n" +
                "\n" +
                "The man said to me, “Look! Do you see anything?”\n" +
                "\n" +
                "“I see a house made of hair,” I replied.\n" +
                "\n" +
                "“Your hope and your success are in this valley,” the man said.\n" +
                "\n" +
                "Then I followed him until we reached the middle of the valley. The man came down from his mule and left it alone. Then I descended from my donkey.\n" +
                "\n" +
                "The man said to me, “Leave it here.” “What if she gets lost?” I asked.\n" +
                "\n" +
                "“No one but believers enter this valley and no one but believers leave it,” the man replied. Then he went ahead of me and entered the tent.\n" +
                "\n" +
                "Shortly thereafter, he came out and said, “Rejoice, for you have been given permission to enter.” 5o I entered and I saw light emanating from every corner of the house. I saluted the lmam (as).\n" +
                "\n" +
                "The Imam (as) said, “O Abal Hasan! We have been expecting you day and night. What took you so long to come to us?”\n" +
                "\n" +
                "“O my master! I could not find anyone who would guide me to you,” I replied.\n" +
                "\n" +
                "Imam (as) said, “You did not find anyone who would guide you?!”\n" +
                "\n" +
                "Then he scratched the ground with his finger and said, “No, but you people have (focused) on increasing your wealth, you (people) have oppressed the believers who are weak, and you have dissociated yourselves from your families. So what excuse do you people have now?”\n" +
                "\n" +
                "“I repent, I repent, I seek forgiveness, I seek forgiveness,” I said.\n" +
                "\n" +
                "Imam- said, “O son of Mahziyar! If it was not for you people seeking forgiveness for one another, everyone would be destroyed except the specific group of Shia whose words and actions match each other.”\n" +
                "\n" +
                "Then the lmam (as) extended his hand (toward me) and said, O son of Mahziyar! Let me give you some news!\n" +
                "\n" +
                "When the boy will sit down, the man from the west will start moving. The Omani will rise and people will pay allegiance to Sufyani. Allah will give me permission to rise from between Safa and Marwa with three hundred and thirteen men. Then I will go to Kufa and destroy the mosque in it. I will rebuild it the way it originally was built and I will destroy the buildings of the oppressors around it.\n" +
                "\n" +
                "Then I will lead the people and will go for Hajj. Thereafter, I will travel to Medina and destroy the room (where the two are buried). I will exhume their corpses which still look fresh. I will order them to be moved toward Baqee and then I will crucify their bodies on two pieces of wood (dead trees) which will become fruitful. (Many) will be allured by this, and this will be a greater sedition than the first sedition (incident of Saqifah)\n" +
                "\n" +
                "Then the caller will call from the heavens, “O sky, eradicate them! O earth, swallow them!”\n" +
                "\n" +
                "On that day, no one will be left on earth except believers whose hearts are pure in believing.\n" +
                "\n" +
                "Then I asked, “O my master! What will happen after that?”\n" +
                "\n" +
                "Imam (as) replied, “The returning, the returning, the coming back!Then he recited this verse, “Then We gave back to you the turn to prevail against them, We aided you with wealth and children and made you a numerous host");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Imam Mahdi (as) Completes the Verses");
        esrc.add("Al-Kalaam Yajirul Kalaam volume 2 page 110");
        edetails.add("Mohtashim Kashani had a son, who died young, so he composed a few couplets in his grief. One night, he saw the Messenger of Allah (s) in dream, who said: You have composed a an elegy (Marsiya) for your son, but did not compose one for my son?\n" +
                "\n" +
                "Mohtashim says: I woke up; but since I had never done that before, I did not know how to begin a Marsiya for Imam Husayn.\n" +
                "\n" +
                "The following night again I saw the Holy Prophet (s) in dream and he was asking me: Why do you not compose a Marsiya about the tragedy of my son?\n" +
                "\n" +
                "I said humbly: Because I have never done this before.\n" +
                "\n" +
                "The Holy Prophet (sawa)  said, Say – Now, what is the revolution, which has taken place among the creatures of the world?\n" +
                "\n" +
                "I woke up and took this to be the opening line of my Marsiya and added the rhyming lines to it. Till I reached the following line: It is in grief, even though it may be the being of the Mighty and Sublime.\n" +
                "\n" +
                "But at this point I encountered a block and did not know how to conclude; lest it may be audacity against Almighty Allah.\n" +
                "\n" +
                "At night I saw the Imam of the Time, Imam Mahdi (as) in my dream and he asked, Why don’t you conclude your Marsiya?\n" +
                "\n" +
                "I said: I could not proceed beyond this line.\n" +
                "\n" +
                "The Imam (as) said, Say: He is in the heart and there is no heart without grief.\n" +
                "\n" +
                "I woke up and adding this line, concluded my verse.\n" +
                "\n" +
                "Today these verses are used in places of mourning as a reminder of this incident.");
        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Imam (as) Helps to Complete The Book");
        esrc.add(" The incident about Allamah Hilli related from Majalisul Momineen of Shaheed Salis Qazi Nurullah Shustari is well known among the people.");
        edetails.add("Allamah Hilli (ar) (648-726 AD) was a remarkable personality of the Shiahs. He had no equal during his period and was an outstanding Shiah scholar. He was specially blessed by Imam Mahdi (as) with a special favour. The following incident about Allamah Hilli related from Majalisul Momineen of Shaheed Salis Qazi Nurullah Shustari is well known among the people.\n" +
                "\n" +
                "One of the exceptional aspects of Allamah Hilli’s time was that during his tenure a person had written a book against the beliefs of the Shiah and he used to quote from it in assemblies and thus managed to mislead quite a few people and created doubts regarding the Shiite faith. However, he never lent anyone this book for the fear that it may fall into the hands of the Shias and they may write a rebuttal.\n" +
                "\n" +
                "In order to obtain this book, Allamah Hilli began to attend the sermons of this person and introduced himself as a student of this person.  After having achieved the confidence of his teacher, he requested him to lend the book for some time. It was difficult for that person to refuse Allamah Hilli, so he told him,  “I have vowed that I will not give this book to anyone for more than a single night.”\n" +
                "\n" +
                "Allamah Hilli accepted it as there was no other way.  That night he felt very elated and began to copy the book.  He had planned to take down as much as possible so that he could refute the arguments of the book.  Around midnight when he could not resist the onslaught of sleep, a respectful guest arrived and after a few pleasantries he encouraged Allamah Hilli to rest for some time and entrust him with the completion of the book.\n" +
                "\n" +
                "Allama agreed to it without any questions. When he awoke after some time, he found that there was no sign of his guest. Upon searching he found that his guest had already completed the book and at the end of it something extra was mentioned. When he looked closely he found that the following words had been added at the end: “Inscribed by the Hujjat”.\n");

        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");





        etitle.add("FOUNDATION OF MASJID JAMKARAN");
        esrc.add("Shaykh Hasan bin Muhammad bin Hasan Qummi, a contemporary of ShaykhSaduq (r.a.) has reported in Taareekh Qom quoting from the book of MoneesulHazeen fee MaarefatulHaqqwaYaqeen ; by Shaykh Abu Ja’far Muhammad bin BabawayhQummi");
        edetails.add("The reason of construction of Masjid Jamkaran was that that ShaykhAfifSaaleh Hasan bin MuthlaJamkarani says: It was the night of Tuesday, the seventeenth of the month of Ramazan 293 A.H. – and I was asleep in my house. A part of the night had passed. Some people came to my door and woke me up saying: Get up, SahibuzZamaan has summoned you. So I arose at once and said: All right, I\\’ll be there immediately. I picked up a shirt to put it on, but a voice came from inside the house: This is not your shirt. I put on another shirt; then reached for the Pajama; again a voice came that it was not mine. So I put it down and wore another. After that I started to search for the key, but a voice came: The door is already open. At last, Ireached the door to find many elders standing there. I greeted them; they replied and then conveyed me to the location where the Masjid stands today. At that place I decried a wooden platform covered by a very fine carpet. A mattress and pillows were also arranged on it and a young man of around thirty years was seated there. Before him was an elderly gentleman, reading from a book. Around sixty persons, some dressed in white and some in green, were busy praying. I learnt that the young man was HazratHujjat and the elderly gentleman was His Eminence, Khizr (a.s.). When I reached them, His Eminence, Khizr (a.s.) offered me a seat and HazratHujjat addressed me by my name and said: “Go to Hasan Muslim and tell him: You have put this land for your personal use since some years, and you try to cultivate crops on it, but we destroy them, in spite of that you do not desist. This year also you wanted to do the same. Now, you are not permitted to do so; and return whatever you have gained from this land, so that it can be utilized for building a Masjid on it. Tell him that this is an honored place and the Almighty Allah has bestowed it a special rank over other lands, which you are trying to include in your property. Your two adolescent sons passed away, but you did not heed the warnings. If you still don\\’t toe the line, you will be punished in such a way that you won\\’t know what hit you.” Hasan Maslah says: I said: My master, I would need a sign, as without it, no one would believe me. He said: We are leaving a sign here in order to verify your statements, you just convey the message. Go to Abul Hasan and ask him to recover from HasanMuslim the profits he had made in last few years and hand the money over to others so that construction may commence; and the remaining expenses can be taken from the agricultural income of our lands at Rahaq. We have endowed half of this rural property in favor of this Masjid. Announce it to the people that they should become inclined to it and be devoted to it. They should recite four units (rakats) of prayer in it: Two units (rakats) of prayer for honoring of Masjid: in each unit (rakat) of which they should recite Surah Hamd once and Surah Tauheed seven times; in Ruku and Sujood, they should recite the praises seven times. After that recite two units (rakats) of Prayer of Imam Zamaan (a.s.), in the following manner: Begin with Surah Hamd and when you come to IyyakaNa\\’bodowaiyyakaNaste\\’e\\’n, you should repeat this a hundred times and then proceed and complete Surah Hamd. The same method is to be followed in the second unit (rakat) as well. Repeat the Zikr seven times in Ruku and Sujood. After concluding the prayer, recite the Tahleel, e.g. Laaelaahaillallaahowahdahuwahdahu. And recite Tasbeeh Fatima Zahra (s.a.). After that prostrate and recite Salawat on Muhammad and Aale Muhammad (a.s.) in prostration a hundred times. After that the Imam\\’s words were as follows: If one recites the two prayers, it is as if he has prayed in the BaitulAteeq. After that Imam (a.s.) asked me to proceed. As soon as I started, he called me back and said: A goat is to be purchased from the flock of Ja\\’farKashani, the shepherd; if the villagers pay for it, well and good, if not, you pay for it yourself and slaughter it here tomorrow night. The following daywould be the 18th of month of Ramazan; on that day the mutton should be distributed among those who are ailing; Allah will cure those who eat from it. That goat is spotted, very hairy and having seven black and white marks the size of a dirham coin: three on one side and four on the other. Hasan bin Maslah says: After that I returned home and remained in deep thought all night. At last it was dawn. After prayers, I went to Ali bin Mundhir and narrated the whole incident to him. Then the two of us came to that same place and found in accordance to the statement of the Imam, chains and pegs, which were supposed to be the signs . After that we came to the place of SayyidAbul Hasan. The moment we reached his door, his servants said: The master is expecting you since dawn, are you a residents of Jamkaran? Then he was informed and I entered his place and greeted him with respect. He replied in a cordial way and offered me a seat near him. Before I could say anything, he started: O Hasan bin Maslah, last night I saw a gentleman in dream,who told me: Hasan bin Maslah, a resident of Jamkaran, will approach you in the morning. You must testify to whatever he says and rely on his words; his statement is our statement; you must not reject his words. I am waiting for you since I saw that dream. After that I narrated the incident in detail. Abul Hasan asked his men to saddle the horses. All of us mounted and set out from there. On reaching Jamkaran, we saw Ja\\’far with his herd at the side of the road. As I approached, a goat, which was at the rear, came bouncing to me. When I wanted to pay the cost to Ja\\’far, he swore that the goat did not belong to his herd. He said: I have never seen it before today and after that I was not able to catch it, no matter how much I tried. Thus, we brought that goat to the place that Imam (a.s.) had mentioned and slaughtered it there. Sayyid Abul Hasan summoned Hasan Muslim and the amount was recovered from him. Monies were also taken from the income of Rahaq village and the roof of the Masjid was completed. SayyidAbul Hasan carried those chains and pegs with him to Qom; they were kept at his home. Ailingpersons came and by Allah\\’s permission sought cure from them by rubbing them on their bodies. It is said that after the passing away of SayyidAbul Hasan, when his son fell ill, the case containing the chains and pegs was opened, but nothing was found in it .This, in brief, is the account of that place, which is mentioned there. The author says: In the Persian version of Taareekh Qom,and in its Arabic version, which the prominent scholar Agha Muhammad Ali Kermanshahi has mentioned this incident briefly in the marginal notes of Rejaal Mir Mustafa in the chapter of Hasas, the date of the incident is mentioned as 293 A.H. And apparently it was abrogated and the actual date was 273 A.H., which is the meaning of seventy, because the death of Shaykh Saduq was before 290 A.H.");


        utitle.add("Sorry Not Available");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");






        etitle.add("MEETING THE IMAM IN KAZMAIN SHRINE");
        esrc.add("Najmus Saqib Vol 1 chp 7 Pg 678");
        edetails.add("The revered Sayyid, author of Farajal Mahmoom Fee Maarefate Nahjul Halaal wal Haraam Menan Nojoom says that he has met a number of people, who claim to have seen Imam Mahdi (a.s.) and some of them have also received letters from him: “Thus, one of them who did not allow his name to be mentioned, says: I prayed to the Almighty Allah to give me the honor of seeing Imam Mahdi (a.s.). He dreamt that someone was saying: When it is time to see him, you will be signaled. So when the time approached, he was in the shrine of Imam Moosa Kazim (a.s.). He heard the same voice he had heard reciting the Ziyarat at the grave of Imam Muhammad Taqi (a.s.). He went inside immediately and stood at the foot of the grave and with regard to the one about whom it was certain that only he is Imam Mahdi (a.s.) and is busy reciting the Ziyarat, when he came out, there was another person with him. But this man (narrator) could not speak to him, because of extreme humility");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Fulfillment of Sayyid Muhammad Jalil Amili’s supplication");
        esrc.add("Najmus Saqib Vol 1 chp 7 Pg 644");
        edetails.add("After migrating from his native place, he continued to tour around the area and during that period of roaming he saw strange things in dream and wakefulness till he became the caretaker of Najaf Ashraf shrine and got the opportunity to stay in a part of the holy courtyard. Five years passed after leaving home. His death occurred at this place only. He used to visit me at times. Sometimes he borrowed books of supplications from me. He was having tight financial conditions and he often recited supplications for increase in sustenance and he did not omit any of the effective supplications. So much so that once he supplicated for forty days in the service of the master of the age in such a way that every day he wrote a application and left the town before sunrise and at a distance of three miles where no could see him, he used to conceal that letter of plea in mud and entrusting it to one of the deputies of Imam (a.s.) used to put it in the river. Thirty-eight or thirty-nine days passed in this manner, when returning from there he narrated that I was going on my in a very sorrowful mood, when a gentlemen in Arabic attire came from behind and greeted me. I replied in very ordinary way, but I did not become attentive to him. He walked with me for a distance and addressed me in the dialect of my native village: What is the matter Sayyid Muhammad? Why do you leave before sunrise and present a letter of request? Do you think that your Imam is not aware of your need? I was very amazed at this statement as till date no one was aware of this act and neither there is anyone from Jebel Amil in Najaf, whom I am not acquainted with. All of a sudden, I realized that it seems to be the Imam of the time. Because I had always heard that no one could be compared to the Imam with regard to the delicateness and softness of his hand. So I wanted to shake his hand in order to be sure and that I should adopt a conduct suitable for the presence of the Imam. So I stretched out my hand, shook hands and found them to be same as I had heard. Then I became sure that it was the Imam. At that time I was bestowed a great favor and I had succeeded in my aim. But when I wanted to kiss the hands, I did not find anyone there and the Imam disappeared from sight.\n" +
                "The author says: The softness of the blessed hands, as mentioned in this incident remindsus of the similarity of His Eminence with his holy grandfather in physique as well as in habits. This is further supported by the report, which Abu Muhammad Ja’far bin Ahmad bin Ali Qummi Naziri has narrated in the book of Musalsilaat; from Husain bin Ja’far that he said: Said Muhammad bin Isa bin Abdul Karim TarToosi in Damascus that Umar bin Saeed bin Yasaar Munji said: Ahmad bin Dahqan said: Khalaf bin Tameen said: I came to Abu Hurmuz to visit him during his illness. He said: I met Anas bin Malik to pay condolence to him.\n" +
                "He said: I shook hands with the Messenger of Allah (s.a.w.a.) with these hands; after that I did not touch any brocade or silk, which was softer than the blessed hands of His Eminence.\n" +
                "Abu Hurmuz said: Then we said to Anas bin Malik: Shake hands with us with the same hands that you shook with the Messenger of Allah (s.a.w.a.). So he shook hands with us and said: Peace be on you. Khalaf bin Tamim said: I asked Abu Hurmuz: Shake hands with us with the hands that you shook with Anas bin Malik; so he shook hands with us and said: Peace be on you.\n" +
                "Ahmad bin Dahqan said: We said to Khalaf bin Tamim: Shake hands with us with the hands that were shook with Abu Hurmuz. So he shook hands with us and said: Peace be on you.\n" +
                "Umar bin Saeed said: We said to Ahmad bin Dahhaan: Shake hands with us with the hands that were shook with Khalaf bin Tamim. So he shook hands with us and said: Peace be on you.\n" +
                "Muhammad bin Isa bin Abdul Karim said: We said to Umar bin Saeed: Shake hands with us with the hands that were shook with Ahmad bin Dahqan. So he shook hands with us and said: Peace be on you.\n" +
                "Husain bin Ja’far said: We said to Muhammad bin Isa: Shake hands with us with the hands that were shook with Umar bin Saeed. So he shook hands with us and said: Peace be on you.\n" +
                "Abu Muhammad Ja’far bin Ahmad bin Ali Raazi, the author of this book said: We said to Husain bin Ja’far: Shake hands with us with the hands that were shook with Muhammad bin Isa. So he shook hands with us and said: Peace be on you.\n" +
                "Supporting this is the statement of Sahib bin Abbad in the book of Muheetul Lughat that the term of ‘Shushanul Kaffain’ mentioned in the tradition describing the Messenger of Allah (s.a.w.a.) is quite well known among Ahle Sunnat and Shia andthey have narrated it through reliable chains of narrators; it has come with the two dots over the Arabic letter of Taa, which is inthe meaning of softness as he has mentioned there: Shutun is softer than clothes and its singular is hatan and it is mentionedin traditions that the hands of the Messenger of Allah (s.a.w.a.) were Shatan and one, who has narrated as ‘Tha; has misquoted the tradition; but all the tradition scholars, commentators of traditional report and experts of language have recorded it as Tha. On the contrary, they regard the statement of the author of Muheet as odd.\n" +
                "After narrating the whole report in Maniul Akhbar , Shaykh Saduq says: I asked Abu Ahmad Hasan bin Abdullah bin Saeed Askari about the exegesis of this report.\n" +
                "He replied: So that it may be said in the explanation of the washing of hands: that is the blessed hands of His Eminence were rough and coarse and Arabs praise men with hard hands and the ladies with soft hands.\n" +
                "Ibne Athir Jazari says in Nihaya : That is his two blessed hands were inclined to coarseness and shortcoming.\n" +
                "And some have said that there was hardness in his fingers without any shortcoming and this is preferred in males. Because this is more severe to them than to captivate them; that is to take something, which is the activity of males; hence this is a preferable quality in males and unpreferred in females.\n" +
                "His statement is supported by the fact that the hands of Ameerul Momineen (a.s.) were also hard and rough. Shaykh Mufeed has narrated in Al-Irshaad , that when the Commander of the faithful, peace be on him, headed for Basra, he stopped at al-Rabadha. The last (of the returning) pilgrims met him there. They gathered together to listen to some words from him, while he was still in his tent.\n" +
                "Ibne Abbas, may God be pleased with him, reported:\n" +
                "I went to him and found him stitching a sandal. I said to him: “We have a great need (to know) what you will do in order to put right our affairs.”\n" +
                "He did not speak to me until he had finished his sandal. He put it next to the other one and then he asked me: “(How much do you) value them?”\n" +
                "“They have no value,” I answered.\n" +
                "“More than that,” he retorted.\n" +
                "“A fraction of a dirham,” I suggested.\n" +
                "He said: “By God, they are more lovable to me than these affairs of yours, but for the fact that I must establish (what is) true and ward off (what is) false.”\n" +
                "“The pilgrims have gathered together to listen to some of your words,” I said. “Would you permit me to address them? If (my words) are good, they will be yours. If they are not, then they will be mine.”\n" +
                "“No, I will speak,” he answered, and he put his hands on mybreast. The palms were rough andhard and it hurt me. It could only be that ‘ba’ was actually ‘tha’ otherwise there is no other reason as the softness of the hand does not cause pain.\n" +
                "It is narrated from Yaqub bin Manqush in Kamaaluddin that he said: “I went to Abu Muhammad Hasan bin Ali (a.s.) to find him sitting on his usual place in his house. There was a room to his right with a curtain at its entrance.\n" +
                "I asked the Imam: Who is the master of this affair?\n" +
                "He replied: Lift that curtain.\n" +
                "When I lifted the curtain A five-year-old boy came towards us…then he describes His Eminence including the statement thathis hands were “Soft and clear”; and in the copy ‘ba’ is actually ‘Tha’ and Majlisi has interpreted wrongly in Behaarul Anwaar.\n");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Special Signs of Surah Hashr");
        esrc.add("The book Masjid-e-Jamkaran ");
        edetails.add("There are numerous tradition which enumerate the miraculous physical and spiritual benefits of the Holy Quran. Ayatollah Mohammed Taqi Najafi Isfahani has also brought many benefits of the verse of Quran in his book – ‘Special Signs\\’. The book “Masjid-e-Jamkaran” narrates an incident about Aqa Hussain who was a driver. He says that he lost his mother in his childhood following which his father remarried. He was unhappy with this arrangement and so he ran away from Iraq, his homeland and learnt driving. Over a period of time, he even learnt some mechanical aspects and started working in the workshop of a Jew. During this period he developed a severe pain in his back and this was causing him a lot of trouble. He met many doctors for its treatment but no medicines were beneficial for it. He took a lot of x-rays and even met doctors outside Iran for its treatment. He even had an operation for his back. But the more he struggled for its treatment, the more he became convinced that this pain would not go away. Finally the doctors told him that the area of his back had become weak and hence any treatment for the pain was useless. He finally traveled to the Masjid of Jamkaran in Qum and sought the help of Imam Mahdi (as) that he may be delivered from this pain. He stayed there for some days in a hotel, but it was of no use and he returned back to Qum. That night he saw a dream in which someone told him that if you wish to get your desires fulfilled you must spend less time at the hotel and the nights remaining awake in the mosque! He went again to Jamkaran mosque. This time he intended that in the month of Rajab he would perform the prayers of the mosque of Jamkaran. That night he was alone in the mosque. There was no one with him. When he completed his prayers, he saw a respectful person in a green dress who had a halo of light around him enter the mosque and sat down. At that time, his back was aching severely and he was in great difficulty. The Sayyed turned towards him and said, Where do you feel the pain? He replied, For quite some time I am having severe pain in my back. The Sayyed came closer to him and put his noble hands on the spine and rubbed it with his palm. Then he slowly started rubbing his palm over each bone in the spine and as he massaged the back, he kept on reciting the last four verses of Surah Hashr. Then the Sayyed said, You have been cured. He moved his back a little but could not feel any pain. He then moved his body a little more to the right and left, but found that the pain had vanished completely. He got up and walked a little, even ran in the compound of the mosque, but could feel no pain! There was a big stone lying outside the mosque. He picked it up and raised it above his head – no pain! He tested his back with different positions and exercises and found it to be strong and healthy. He went inside the mosque to thank this Sayyed but could find no sign of him. He realised that the Sayyed was Imam Mahdi (as). He looked all over for him but the Sayyed had disappeared completely.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



       etitle.add("Cure for Shaykh Hurre’ Amili");
        esrc.add("Shaykh Hurre’ Amili writes in his in book Isbatul Huda");
        edetails.add("The author of Wasaelus Shiah and other great Islamic books, the late Shaykh Hurre\\’ Amili writes in his in book Isbatul Huda. At the age of 10 I was afflicted with such an illness that even the doctors who were treating me seemed helpless before my condition.At one point in time, my relatives and close companions had gathered round my bed as if they were awaiting my imminent death. They were sure that I was going to die and were crying out in grief. That night I was blessed with a visit from the Holy Prophet (sawa) and the 12 holy Imams (as). They were standing around my bed. I conveyed salaam to them and shook hands with each one of them. Imam Jafar Sadiq (as) and I had a small discussion which I am unable to remember now, but what I do remember clearly is that the Holy Prophet (sawa) prayed to Allah in my favour. When I shook hands with Imam Mahdi (as), I told him while I was in tears, O Master, O Sayyed, I am afraid that I will die due to this illness. My desire to seek knowledge will remain unfulfilled. Imam Mahdi (as) said to me, Do not be afraid. You will not die because of this disease. Allah (sawa) will grant you a cure from it. You will have a long life. There was a glass of water in his (as) hands, which he gave me. I drank the water from the glass and immediately I felt that I was cured. My family members who were sitting there was astonished at this miraculous recovery. After a few days, I told them about this incident that that resulted in my cure.");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add(" The Wound of Siffeen");
        esrc.add("Beharul Anwar");
        edetails.add("In the book of Beharul Anwar, Muhiudeen Arbeli reports – Once I was sitting with my father. At that time, another person was also with us whose turban fell down. We noticed that there was the mark of a wound on his head. My father questioned him about it to which he replied that this was a wound of the battle of Siffeen.My father was astonished and he said, What are you saying? The incident of Siffeen is a very old one. It is not possible that you would have been present at that time. The person said, Once it so happened that I was going towards Misr (Egypt). In the journey, I happened to be with a person from the tribe of Ghazrah. During the course of our discussion we touched upon the topic of the battle of Siffeen. My companion remarked that if I were present in the battle of Siffeen, I would have coloured my sword with the blood of Ali (as) and the companions of Ali (as). I replied saying that if I were present in the battle of Siffeen, I would have coloured my sword with the blood of Muawiyah (la) and the companions of Muawiyah (la). At this time, you and myself are the companions of Ali (as) and Muawiyah (la). Saying this a battle ensued between us and it was a severe battle in which both of us were badly wounded. I was in a bad condition and I fell on the ground unconscious. When I opened my eyes, I saw that a person was getting off his horse and coming towards me. He rubbed my hands over my wounds after which I saw that my wounds had healed. He asked me to wait there and disappeared for some time. When he returned, I saw that he had the head of my enemy in his hands and also his horse was with him. He said, This is the head of your enemy. You have helped us and we have helped you. Allah helps those who help Him. I said, please tell me who are you. He said I am so and so, implying he was Imam Mahdi (as). While leaving he said, whenever any person asks you about this wound, you say that it is the wound of Siffeen.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("A cure from TB (Tuberculosis)");
        esrc.add("Barakaate’ Wali Asr, page 103");
        edetails.add("Shaykh Mirza Abdul Jawad Mahallati narrates – Shaykh Mohammed Taqi Qazvini, the head of the madrasah was unmatched in the matters of knowledge and action, in piety and in his efforts for religion. He used to say that he had only one dua from Allah which he used to recite frequently at every place, even in the shrine of Hazrat Ameerul Momeneen Ali (as) and the dua was that he should get the opportunity to meet Imam Mahdi (as).He says that I used to plead and frequently recite these sentences from Dua Ahad – Allahumma Arinit Tal\\’atar Rasheedah, Wal Ghurrratal Hameedah (O Allah, (please do) show me his magnificent appearance and his praiseworthy forehead; delight my eyes by letting me have a look at him…) Once it so happened that he was afflicted by tuberculosis (TB). While he was extremely poor, he had a high sense of independence and self respect due to which he would not speak about his condition to any person. Hence, ordinarily, people would not come to know of happenings in his life. His disease progressed till such time that when he coughed, blood would come out. Due to this, he was put in a small common room so that if he coughed blood, it would not soil a good room. For many days, he remained in this room and his treatment continued. However there was no improvement in his condition and whenever he coughed, blood continued to emerge so much so that people became hopeless about his cure. They did not expect that he would ever be cured from this dangerous disease. However after some days, the news became common amongst the people that he has been cured completely. This news stumped the people since his disease had progressed so much that people were no having any hope that he would be cured. The question on everyone\\’s lips was how did he get cured? This seems to be the work of some invisible force since it was not possible for any ordinary person to cure him. People began visiting him and questioning him about his miraculous recovery. Shaykh Mohammed Taqi replied, One night, my condition worsened such that I was not having the strength to breath leave aside the strength to move. I was not in my senses and in this way, the night progressed slowly till such time that the whiteness of the morning was visible in the horizon. Suddenly I saw that a man entered the roof of the house. He was carrying a chair which he placed in front of me. Hardly some moments had passed that another person entered the roof and sat on the chair. At that moment, I became aware that the person is Hazrat Ameerul Momeneen Ali Ibne Abi Talib (as). He (as) turned towards me and said, how is your health? I replied, O my master and lord! I desire that I should be cured of this disease and that I should be relieved of my life of poverty. He (as) replied, as regards your disease, you are cured. Now you have no illness. I said, , O my master and lord! What about my dua which I recited every morning and evening in your mausoleum? He replied, tomorrow before the sun rises, come to so and so place in Wadi-Us-Salaam. When you reach the place, sit down on the road which comes from Karbala. At that time, my son Hazrat Imam Mahdi (as) (as) will come from Karbala. He will be accompanied by two companions. Convey salutations to him and follow him wherever he goes. Thereafter I returned to my senses and saw that there was no one there. At that time, I thought I was hallucinating or that I must have seen this vision in a dream. However when I saw that I had not coughed for quite some time and basically, I felt quite well. I was amazed that I had been completely cured. The entire day passed and night fell, yet I had not coughed at all. Now I began to think that if the promise of Ameerul Momeneen (as) comes true then it will be a great fortune for me. At morning, before sun rise, I reached the place which Hazrat (as) had directed me to. I turned in the direction of the road from Karbala and sat there. I waited there at the peak of my anticipation for meeting with my master when suddenly I saw three men coming along the road. One of these men walked ahead of the others with a regal demeanour. When I saw this scene, I was overcome by such awe that when they came close to me, I was unable to say anything else other than salaam. They continued walking along the wall of the city which leads to the special place of Imam Mahdi (as). When we reached there, the Sayyed entered the room and sat at a special place. The other two men stood silently at the door of the room. I too stood next to them till such time that the sun arose. I could control myself further. I began thinking in my mind – let me enter and kiss the feet of my master Imam Mahdi (as). As soon as I entered the room, I saw that there was no one there. I was stunned at this scene. It was as if the entire world became dark for a couple of moments. When I came to my senses, I searched all over for him, but I could not find him.");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("The Secret of Shaykh Murtuza");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 3, page 49");
        edetails.add("The late Sayyed Ali Shustari narrates – It was a regular practice that on special occasions, Shaykh Murtuza Ansari and myself used to travel from Najaf Ashraf to Karbala for Ziyarat and stay there for some days.On one such occasion, we stayed in Karbala for three days. On the last night, Shaykh Murtuza Ansari said, let us return to Najaf tomorrow. I said okay. More than half the night had passed when I awoke suddenly. I saw the Shaykh performed ablution and after wearing his dress and turban, left the house. I thought that perhaps he is under the impression that it is morning and it is time to leave whereas it was just over midnight and the time for Namaz Shab had not yet set in. I was thinking about this when he had crossed the courtyard. I was curious to know where he was going at this time of the night. I thought that I should follow him. Therefore, I quickly put on my robes and silently started following him so that he would not be aware of my presence. He walked quickly through the streets of Karbala till such time that he came close to a door which was famous as “Baghdad.” There was a small house at this door. Shaykh Murtuza stood before this house. I too stopped at a distance and started observing him. I saw that he stood before the door and conveyed Salaams to someone. A person replied to his salaams in a beautiful voice from inside the house. Shaykh Murtuza said, I intend to leave tomorrow. Do I have your permission? A voice from the house said, have you completed the work? He replied, no. The voice said, Then stay here. Don\\’t go tomorrow. Shaykh Murtuza said, I submit myself to your command. Saying this, he left from there. When I saw him turning, I swiftly turned from there and ran home and lay down on my bed so that he would not know of my activity. As morning approached, we busied ourselves in Quran, namaz and supplications. Thereafter, I said, we have to leave for Najaf. Let us get ready for the journey. Shaykh Murtuza said, not today. We will go tomorrow. I remained silent and deliberately did not seek any further explanation from him. In this way, the day passed and evening set in. I was intrigued to know the reason for this strange episode. Just the previous day, Shaykh Murtuza had indicated his intention to leave Karbala, then in the middle of the night, all by himself, he had performed ablution and gone to a place where after conveying salaams, he had sought permission from someone to leave. I could not understand who was this person and why was permission sought from him. Finally, I decided that I would remain awake and see how this episode unfolds, what would happen tonight and where he will go. When it was time to sleep, I lay down on my bed, but remained awake. At exactly the same time as the previous night, Shaykh Ansari got up from his bed silently so that he would not disturb me. He put on his clothes, performed ablution and quietly left the house. As soon as he left, I got up from the bed and started following him silently. I saw that he took the same route as the previous night till he came to the same house and stood before its door and conveyed salaams. A person replied to the salaams from inside the house. Then Shaykh Ansari said, do you permit me to leave tomorrow? In reply, the voice said, have you completed the work? The Shaykh said, yes Sir, I have completed the work. In reply, the person said, yes, you have my permission. You can leave. Shaykh Murtuza turned to return to our house. I quickly came back to the house before him and lay down on the bed as if I had never moved from there. He came to our house and slept contentedly. The next day, we left Najaf Ashraf as decided. When we had left the city gates and entered into the jungle area, I turned to him and said, I wanted to ask you two questions. He said, yes, go on. I said, What is the reason that he does not stay in good houses with courtyards and chooses to reside in small houses? (referring to the person who Shaykh Ansari was meeting in the night) Shaykh Ansari said, who are you referring to? I replied, I am referring to our Master and leader who was in the house. I want to let you know that I am aware of the happenings; I only wanted to understand what is this secret? Shaykh Ansari asked me lot of questions to verify that indeed I was aware of the entire episode. Then I said, my question is that on the first night, when you sought permission to leave, the Imam (as) asked you about a work which you had not done. On the second night, he asked you again when you sought permission to leave. This time, you affirmed that you had completed the work. What was this work? Shaykh Ansari said that I cannot disclose this to you. It is a secret. Despite my insistence, he did not disclose the secret to me. He also took a promise from me that I would not disclose this episode to any person in his lifetime. I remained true to this promise and did not speak to any person about this incident till he was alive.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Help from Imam Mahdi (as)");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 3, page 142");
        edetails.add("Janab Ayatollah Ziya Iraqi narrates, a person from the city of Qatif in the Hejaz, left his home with the intention of completing the Ziyarat of Imam Ali Reza (as). While walking, when he had completed half the distance to his destination, he fell short of the money which he had carried with himself for expenses. He did not have enough money to either return home or to continue the journey. He was distressed and troubled over his poor condition. He was in two minds over what he should do. A thought came into his mind that he should seek help from Imam Mahdi (as) so that he (as) can help him resolve his difficulty. While he began to seek help from Imam Mahdi (as), he saw suddenly that a person with a splendid personality was walking alongside him. This person said, Mister! Take this money which will be sufficient to reach Samarrah. When you reach Samarrah, you can get in touch with my representative, Sayyed Mirza Shirazi. When you meet him, inform him that Sayyed Mahdi has sent you to him. Inform him that some of his money is in his possession and from that, he should give you that much amount which will help you to reach the Ziyarat of Imam Ali Reza (as). The poor person says that I was not very attentive to the words of this Sayyed. Finally I said, When I meet Sayyed Shirazi, he will definitely ask me who is the person who has sent you. What did he look like and what are his special features? What will I reply to him? He said, When Sayyed Shirazi will ask you, you should inform him that Sayyed Mohammed said that this year, in the summer, you visited Shaam (Damascus) for the Ziyarat of my aunt Hazrat Zainab (sa) along with Mulla Ali Kani Tehrani. Due to the high number of pilgrims, some dirt had collected there in the courtyard. At that time, you had taken off your cloak (Aba) and starting cleaning the courtyard. You collected the dirt at one place and Haji Mulla Ali Kani threw it out. At that time, I was there… The person narrates that when I reached Samarrah and related this episode to Ayatollah Shirazi, he involuntarily stood up in his place. Then he came forward and embraced me. He kissed me and congratulated me. Then he gave me some money using which I was able to comfortably complete the Ziyarat and return home.");



        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



      etitle.add("A Complete Cure");
        esrc.add("Bulbule’ Bostaane’ Hazrat Mahdi (as), volume 3, page 209");
        edetails.add("A resident of Kashan left for the Ziyarat of Makkah along with a few friends. Initially, they visited Iraq and then spent a few days in Najaf Ashraf. At Najaf, he fell ill and despite best efforts, he did not get any special benefit from the treatment of the doctors.Doctors advised him to rest and told him he should avoid too much stress from walking or travelling as it was not good for him; rather it could be fatal for him since his body did not have strength to walk. Due to his diagnosis, he was distressed, and upset, and was compelled to stay in Najaf. The people of his group waited along with him for a few days. However when they saw no signs of improvement in his health, they packed their bags with the intention of leaving for Makkah. With great regret, they visited the shrine of Hazrat Ameerul Momeneen (as) and explained their situation to an aide in the shrine. They said, brother! We are Iranis and left from Kashan for the Ziyarat of Makkah. Unfortunately one member from our group has fallen sick. We took him to several doctors, but the treatment has not helped him. We wish to go forward to Makkah. Can you do us a favour and look after him in our absence? We will return soon from our Ziyarat. We will compensate you for this effort. Also, since he is unwell, God forbid if he passes away, then please conduct his the last rituals of ghusl and shroud and bury him. Keep his possessions with yourself. When we return, we will collect them from you and pass them on to his family members in Kashan. If he improves in health, then Inshallah, next year, we can take him for Ziyarat of Makkah. Finally they left this poor person in the custody of the aide and went away. This aide was a rude and harsh person. Every morning, he would lock the patient in his room and go away. He would return only in the afternoon after Asr. The patient would remain all alone in the dark room in a state of regret and sorrow. Finally after days of hunger and thirst, one day, in the morning, when the aide was preparing to lock him in the room, he said, Mister! I am not having the strength to walk. Can you do me a favour and take me any how to Wadi-us-Salaam. There is the place known as the place of Imam Mahdi (as). When I was better, I had gone there with my friends. When you return in the afternoon, you can pick me up from there. The patient pleaded and implored the aide to such an extent, that finally he agreed. He took the patient to Wadi-us-Salaam at the place of Imam Mahdi (as). There he made the patient sit in one corner. Then he washed his shawl and hung it to dry on a tree. Then he turned to the patient and said, see I have hung my shawl to dry. Do ensure that no one takes it. Saying this, he left from there. The patient narrates, hardly some time had passed after the aide had gone that my mind wandered to the question as to why this place was known as the place of Imam Mahdi (as). Did the Imam bestow a special grace upon some person at this place? Or had some person met the Imam (as) at this place? I was lost in these thoughts when suddenly I saw a young man enter the Wadi and come close to me. He conveyed salaams and passed from my side. Then he turned again towards me and spoke something in Arabic which I could not understand. I spoke to him in Persian saying, Mister! I could not understand a word of what you just spoke. He replied to me in Persian, where are you from? I replied, from Iran. He asked, from which city in Iran? I replied, from Kashan. He asked, from which locality of Kashan? I replied, from the locality of Sultan Meer Ahmed. He started conversing with me in Persian in such a Kashani style that I thought to myself that actually this person is from Kashan only and that he is only dressed as an Arab. He asked, what are you doing here? I replied, Sir! We were a group of friends who left Kashan with the intention of visiting Makkah. Since I fell ill here, they left have left me here and have gone ahead for the Ziyarat of Makkah. He said, Inshallah, you shall recover well from your illness and will visit Makkah, but not this year, but next year. I said, Sir! I am all alone here without any helper. I request you to sit here for some time with me so that my saddened heart may be pleased with your presence. Hearing this, he sat down. However after some time, he got up to leave. I said, Sir! There is no one here. The loneliness is killing me and my heart is troubled. I request you to spend some more time with me. Once again he sat down for some time, then he got up to leave. Again, I pleaded with him to stay for some more time to which he responded, I have to reach other some other place. Saying this, he got up and left. Not much time had passed since his departure that a strong gust of wind blew the shawl which was hanging on the tree to the ground. I got up from my place, picked up the shawl, washed it again and hung it on the tree to dry. Then I returned to my place to take rest. At that instant, it struck me that I was not having any strength to walk, leave alone wash the shawl. How is it possible that I was able to get up from my place and walk to the tree and wash the shawl and hang it to dry. I was astounded by this scene and I got up from my place again just to check that I was able to do so. I walked a few steps as well and observed that I felt no pain. At this point, the question which arose again and again was how I had managed to get up and walk. Then I thought that perhaps the person who had come was none other than Hazrat Imam Mahdi (as) who cured me of my illness. How is it that I was unable to recognise him…");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Meeting in Masjid Kufa");
        esrc.add("Najmus Saqib");
        edetails.add("In the book of Najmus Saqib, there is an incident narrated about Shaykh Mohammed Taher Najafi. The Shaykh served with Masjid Kufa for many years and was staying there along with his family. He was a very pious and God fearing person. Towards the latter part of his life, he became blind.Some of the scholars have narrated his incident as follows – A few years ago a fight erupted between two tribes in the city of Najaf. Due to this war-like situation, the scholars and visitors to Najaf were unable to travel to Masjid Kufa. It was for quite some time, that in the city of Najaf, the hotels with which I was associated were not seeing any pilgrims due to the wars. Even the scholars were not coming to Najaf. At this, I became very worried as I had a large family to support. There was an added responsibility of some orphans on me also. Things were getting very difficult and I was living a hand to mouth existence. On one Shabe Jumuah it so happened that there was nothing to eat at all. My children were crying due to hunger. At this time, my heart was very sad. I left my house and began walking and narrating my condition to Allah. I said to Allah, “O Allah! I am satisfied with my condition and whatever you have ordained for me. But what should I do – I have yet to be blessed with a visit of my master Imam Mahdi (as). If you grant me permission to see the honourable face of my master Imam Mahdi (as), I promise that I will never ask you for anything else ever again and will be happy and satisfied with the poverty that you have destined for me.” Suddenly, I got up from my place. I saw a white cloth my hand (this cloth was one which people normally place at the place of prostration in namaz). My other hand was in the hands of a handsome and awesome youth. His strong personality and striking features gave me the impression that he was some emperor. My mind was in a daze and I did not know what is happening. Then I saw that he had worn a green turban and a person dressed in white clothes was standing next to him. We started walking towards the mehraab (prayer niche) in the mosque. When we reached there, the person who had taken hold of my hand turned to me and said, “O Taher, spread the cloth for namaz.” I spread the cloth. It was the whitest cloth I had ever seen and was outstandingly beautiful, but I could not make out the material with which it had been made. As I laid out the cloth and turned it towards the Qiblah, this handsome Sayyed stood on it and began reciting his namaz. I was mesmerized by his presence and slowly the noor (light) from his face increased so much that it was difficult to look at his face directly. His companion too stood behind him and got busy in reciting his prayers. I stood ahead of them and was watching them. Who are these persons, I wondered? When they had completed their prayers, I saw that the person who was praying behind was no longer with us. Before I could absorb this, I became aware of a chair, which was about 4 feet in height and even had a shade attached to it. The respected Sayyed who was praying ahead on the white cloth was sitting on it. The illumination from the chair and the face of this person was making it difficult for my eyes to see. The respected Sayyed said, “O Taher, which emperor do you take me for?” I said, “O Master, you are the emperor of emperors. You are a leader in knowledge and are not like the other kings.” Then he said, “O Taher, you have succeeded in your objective (of meeting Imam Mahdi (as)). What do you wish now? Do we not take care of your needs everyday? Are your deeds not presented before us?” Finally the respected Sayyed promised me that my condition and wealth would improve and that I would never face poverty again. At that time, a sinful person, who I knew by name and character entered Masjid Kufa from the direction of the courtyard of Hazrat Muslim Ibne Aqeel (as). Suddenly I saw that the holy face of Imam was seized with anger. He turned his face towards that person and said, “Till where will you run and escape? Is no the earth and heaven our kingdom? Follow the orders which we have issued, for you have no choice.” Then he turned towards me, smiled and said, “You have fulfilled your desires. Now do you want anything else?” I was so dumbstruck by his magnificence and brilliance that I could not speak up. He repeated his question and again I was in such a state that I could not reply. I was unable to express my happiness in words. Then within a flash, I saw that I was alone in the mosque and that Imam Mahdi (as) had disappeared. I looked towards the east and saw that morning was almost upon me.\\’ After this, the Shaykh says that the doors of sustenance were opened to him and he never faced the shortage of anything in my life. The truth is that to love Imam Mahdi (as) to that extent that the love of meeting him is created is the best cushion for this world and Hereafter. And by meeting him (as), the poverty of the world and Hereafter is removed. With this incident Imam Mahdi (as) has pointed out towards two important things. One is that we must pay special attention towards our deeds because our deeds are reported to him (as). It is narrated that if our deeds are good then Imam (as) becomes happy and prays for more reward for us. However, if our actions are bad, then Imam (as), after looking at them cries and wails over them. We must ask ourselves this question – have we been created to make our Imam cry over us or that we cry over Imam Husain (as). The other thing, which Imam (as) has pointed out, is that he is not unaware of our affairs. It may be another thing that we may be involved in problems due to the examinations but it is only through the infallible Imams (as) that our problems will be solved. And the blessings of this world and the Hereafter can be achieved.");



        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Visit from Imam Mahdi (as) in Sickness");
        esrc.add("Mulaqaaat Ba Imame’ Asr (as), page 122");
        edetails.add("The wife of Janab Sayyed Abdullah Rafe\\’ei narrates that in his last days, Janab Abdullah was troubled by an illness which weakened him to such an extent that he was not having the strength to move out of his house. All his work was therefore done by his wife.She says – One day I offered him dinner and prepared his bed for rest. Not much time had passed that someone\\’s voice was heard, O Allah! O Allah! I immediately stepped into the courtyard of the house to investigate and saw that in the dark of the night, a Maulana bearing a black turban, dressed in a white colour dress and yellow shoes. I saw him and said, O Maulana, welcome. He entered the room and sat at the side of Janab Rafe\\’ei. After conveying salaams, he asked about his condition. I went into the kitchen and while preparing tea, tried to hear what they were saying. I tried my best to understand their conversation, but was unable to do so. They were conversing in Arabic. When the tea was prepared, I poured it into a cup and placed it in front of him. He said, I don\\’t drink tea. I said, please recite some dua by which he can benefit and be cured by it. He picked up the cup of tea, recited a dua and blew into it. He then kept it back in its place and after conveying greetings, got up and left from there. When he reached the door of the room, he turned towards me and offered some advice regarding Janab Rafe\\’ei. Then he told me something about him which no person was aware about. But even then I did not pay attention to it. Then after conveying greeting, he turned and left the room. I said to myself, it is better that I accompany him to the door of the courtyard and bid him goodbye. With this thought in mind, I started walking towards him. However, he had barely left the house, when he disappeared. I was stunned at this occurrence and rushed out of the house to catch a glimpse of him. However there was no one except for my neighbour in the lane of our house. I asked her, a person with such and such features just stepped out of my house. Did you see him. Did you see which way he went? He appeared surprised by my questions. She said, I have not seen any person leaving your house. Perhaps you have seen a dream. At that moment, I knew that the person was Imam Mahdi (as) who had come to visit Janab Rafe\\’ei in his illness.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Emphasis for Reciting Quran");
        esrc.add("Barakate’ Hazrat Wali Asr (as), page 236");
        edetails.add("Shaikh Mohammed Hasan Mazandarani (Mazandaran is the name of a city in Iran) says that after a few days of my marriage I was afflicted with tuberculosis (TB). On account of this illness, I became very weak and soon I was unable gather strength to even leave my house.However I maintained my ritual of going for Ziyarat every afternoon after Asr. Due to my illness, I was unable to stay there for very long. So I used to recite the Ziyarat quickly and return home. My family members used to put up my bed on the terrace, so as soon I used to return from Ziyarat, I used to go to the terrace and lie down on my bed. Once, as was my custom, I returned from Ziyarat and was resting on my bed when a person who looked similar to Sayyed Mahdi Qazvini (Qazvin is a place in Iran. Sayyed Mahdi was from that place) came up to the terrace without informing any one. I was surprised by this. I made a movement to stand up in his respect. I also wanted to inform the ladies not to come upstairs. Instantly, he made a sign with his hand indicating that I should keep silent and not move. He came close to me and started caressing my forehead with his hand. Then he said, how is your condition now? Recite the Quran excessively. At that moment I felt that I had been completely healed. At the same instant, I became attentive that the person had disappeared. I looked all over for him; I even asked my family members, but no one had seen this person coming or going. It struck me that he person was my master Imam Mahdi (as). I looked everywhere for him, but could not find any sign of him.");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Cure For The Sick");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 1, page 240");
        edetails.add("The late Maulana Meer Jahan was engulfed in a severe illness. He travelled several times to Isfahan, Tehran and Khorasan for a cure, but did not succeed in his effort.He narrates, one day, some of my friends came over and took me to a place called Sheerwan. On the way back, we stopped at a place called Quchaan. Outside the city, there was the tomb of Imamzadeh Ibrahim, (one of the sons of an Imam (as)). We reached that place which had a very good climate. A soft breeze was blowing. My friends said that we would wait there till afternoon since it was a very peaceful place. I said, I am okay, whatever you think best. While my friends were busy in preparing lunch. I said to them, I would like to walk to the river and wash my hands and feet. The advised me against it saying that the river was far from there and that I would face difficulties in reaching it. I insisted saying that I would walk slowly. Inshallah, nothing would happen to me. Finally, I started walking slowly towards the river so that my feet would not hurt. I reached the river and after performing ablution, I sat on it banks and started observing the beautiful scenery. Suddenly, I saw a person coming towards me. He came close to me and after conveying salaams, said, Meer Jahan! You are a person of dua and medicine. You have not found a treatment for your leg\\’s disease? Do you want that I should treat your leg? I said, It will be my pleasure if you can offer me a solution. I will be indebted to you. The person came close to me and extracted a knife from his pocket. He first placed the knife at the area of the pain and then started moving it along the length of my leg right up to my sole of my foot and then he pressed my leg a bit. That caused me severe pain and a cry escaped my lips. Then he looked at me and said, now you are fine. I wanted to get up with support of my walking stick, but he took away my stick and threw it in the direction of the river. I felt that my leg had healed completely. I was able to stand up easily and could not feel any pain in my leg. I turned to him and said, where are you from? He indicated all four directions with his hand and said, I am from here only. I said, if I wanted to meet you, where can I find you? He replied, you will not understand the directions to my location. However I know your residence. He then narrated my exact address and added, whenever there is a need, I will come myself to you. Saying this, he started walking away from me. At that moment, my friends reached the river and asked, where is your walking stick? I asked, did you see our lord and master? They replied in the negative. I said, the Imam (as) was here just a few moments ago. He has cured me and now I am completely fine. Hearing this, he searched extensively for him, but could not find the Imam (as).");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Solution to the Problem in Tawaf");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 2, page 172");
        edetails.add("Ayatollah Sayyed Mohammed Mahdi Mutazawi Langroodi narrates – Some years ago when I travelled for Hajj, I took a lot of effort to perform the rituals of Tawaf (circumambulation of the Kaabah) as per the Ja\\’fari school of thought. However I could not succeed because some of the others were not following the correct method of Tawaaf.Due to this they ended up inconveniencing the Hajis by pushing them this way and that. To the best of my ability, I tried to complete the Tawaf, but found it difficult to do so. I managed to complete five rounds of the Kaabah, but in the sixth round, I was pushed aside. When this happened several times, I lost hope, left the Tawaf and went to one corner of Masjidul Haram and began crying there. I pleaded with Allah (swt) saying, O my Lord! I ask you by the right of the Prophets (as) and the Imams (as), that you send Imam Mahdi (as) to help me. In a short while I saw a Sayyed coming towards me. He called out to me by name and said, do you want to perform Tawaf? I replied, yes. He said, come with me for Tawaf. An old person who had dyed his hair was accompanying him. I said, O Sayyed! It is impossible to perform the Tawaf right now! He replied, why not? Come perform Tawaf with us. I said, Sayyed! Is it okay that I clutch your ehraam (dress of the Haji) from behind. As you walk ahead, I will follow your footsteps and complete the Tawaf. He said, no problem, come with me. I said, in the same manner, this old person will come behind me. He said, no problem. Since you are from the family of the Prophet (sawa), he will not mind. Thus, I clutched the ehraam of the Sayyed and we began the Tawaf in the manner that I was in the centre, the young Sayyed was in front and the old person was behind me. During the Tawaf, I realised that there was no person ahead or around us. It was as if the crowd had disappeared and the place had been emptied for us. However even then I did not realise who this person is. Finally he said, mister! We have completed seven rounds, now you can go and kiss Hajare\\’ Aswad (the black stone). I turned to him and said, Sir! I think we have completed six and not seven rounds. As I said this, I realised that he had disappeared. A voice called out to me, you have completed the Tawaf with Imam Mahdi (as). Do not harbour any doubts in your mind. I regretted that despite spending so much time with my master, I was unable to recognise him.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("The Meeting in the Night");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 3, page 327");
       edetails.add("Maulana Sayyed Baqir Musawi says – In the year 1337 AH or 1338 AH, I met a scholar in the shrine of Imam Reza (as) in the holy city of Mashhad. He was approximately 50 years old. After conveying salaams, we struck a conversation.During this conversation, I realised that his person is an extremely pious person. He was impaired in his eye sight in one eye. I asked him the cause of damage in this eye to which he narrated this incident. I had a friend by the name of Khairaat Khan. He made a programme to travel to his home town so he came up to me and said, I am planning to visit my native place for some days. So while I am away, you please sleep in my room at the madrasah (religious school). I agreed and soon thereafter he left for his home. Once, in the early part of the night, I left for Ziyarat to the shrine of Imam Reza (as). I busied myself in the recitation of Quran, Ziyarat and other duas. After a long time I came outside and remembered my promise to sleep in my friend\\’s room. However I realised that it was very late and it was likely that it the door to his room would be closed. I did not know what to do. I regretted the delay and was lost in my thoughts regarding the next course of action. Finally, I started walking towards the madrasah. I reached the madrasah and put my hand on the door. To my pleasant surprise, it opened easily. When I entered, I saw two people standing near the hawz (water pond) in the madrasah. One of them was aged and the other was young. I wondered what they were doing there at that time of the night. I observed that their faced radiated a light which illuminated the darkness of the madrasah. I was lost in my amazement of the scene, when the young person called out to me by name and said, how are you? I replied, Alhamdulillah, I am fine. He said, if you have any difficulty, then you can narrate it to me. After this he smiled at me and started conversing with me. I was so awe struck in his presence that none of my difficulties and problems came to my mind. I said, No, thank you. I have no problems. I was facing them when they started walking towards the door of the madrasah. When they passed by me, the aged person turned towards me and said, did you recognise this person (the youth)? I replied in the negative. He said, this person is your Imam Mahdi (as). If you have a difficulty of any kind, you can narrate it to him. However even after that I was unable to gather my wits and say anything. The instant they stepped out of the madrasah, I came to my senses and rushed towards the door. But as soon as I reached the door, I saw that the door was shut and to my astonishment, the door was latched from inside. I was stunned that how they were able to go outside when the door is locked from inside. Anyways, I opened the door and stepped outside. I searched for them but could not find any sign of them. I became certain that the person was Imam Mahdi (as). I regretted that I did not recognise him.");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Sorrow of Imam Mahdi (as)");
        esrc.add("Shiftagaan  Hazrat Mahdi, volume 3, page 173");
        edetails.add("Shaikh Abduz Zahra Kaaba was a famous, celebrated orator of his time. He narrates as follows – One afternoon, after Zohr, I went to the shrine of Hazrat Imam Husain (as). I saw a person in the courtyard near one of the rooms of the shrine selling religious books.Since I was known to him, as soon as he saw me, he turned towards me and said, Mister! I have a book just suited for you. If you want you can take it. It will be of great benefit to you. This book has beautiful verses of poetry, and what\\’s more, I won\\’t even charge you any money for it. I only want that you read it for me. I took the book from it. As soon as I opened it, I saw that it contained the verses of praise written by Ibne Arandous Hilli. I had lost this and was searching for it for quite some time. Immediately, I took the book and said, okay, I will read it aloud for you. As soon as I started reciting it, I felt the presence of a person next to me. I turned and saw that an Arab was standing beside me. As I continued to recite, he wept profusely till such time that I recited the sentence of the elegy, Was Husain (as) really martyred in Karbala thirsty And was every part of his body, even the tips of his fingers not satiated with water? As I recited the above verses, the intensity of his lamentation reached its peak and while weeping, he turned towards the zarih of Imam Husain (as) and kept on repeating the above verses. His lamentation was like that of a mother who has lost her young son. Thereafter, I completed the recitation of the verses and turned towards the Sayyed, but, to my amazement, I did not find anyone there. I was surprised with this scene because till then he was just standing and weeping beside me. However I could not see him any longer. I asked the book seller whether he knew of the whereabouts of the Arab who was standing beside me. He replied, I did not see any person standing and weeping next to you. I searched all over for him – inside the haram and even in the precincts of the shrine, but I could not find any trace of him. I was then 100% sure that the Arab was none other than Imam Mahdi (as).");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("An Opportunity to Meet the Imam (as)");
        esrc.add(" Barakaate’ Hazrat Wali-e-Asr, page 150");
       edetails.add("\n" +
               "Sayyed Taqi Qateefi reports – On one eve of Friday, I decided to spend the night at Masjid Kufa. In those days, the road to the mosque was fraught with danger. It was for this reason that perhaps this road was not very frequented by travellers. Only those who travelled in groups or those who had the ability to defend themselves from thieves and dacoits could travel on that road. I went even though I was accompanied only by a student.When we entered the mosque, there was only one pious and devout person there. We began performing the special acts of the mosque till such time that the sun set. Due to the prevailing fearful conditions at that time, we closed the doors of the mosque and stacked up bricks and stones against it. We were now relieved and very confident that no person would be able to open the door of the mosque. We returned to our places and continued the acts of the mosque. When we completed the acts of worship of the mosque, both the student and I sat at Dakkatul Qaza facing the Qiblah (This is the place in Masjid Kufa where Hazrat Ameerul Momeneen (as) used to pass judgements). At that time, the pious worshipper was in the courtyard of the mosque, weeping profusely while he was reciting the supplication of Kumayl. The moon had risen till then and had cast its soft light in the mosque. A thought just came to my mind and I looked towards the sky when I sensed a captivating fragrance in the air. The entire surroundings were perfumed by it. This fragrance was far better than musk or any other fragrance I had experienced before. Then I saw a light, so brilliant that it engulfed the light of the moon. I was observing this light when the sound of the supplication of the pious believer became silent. As I turned towards the direction of the believer, I saw a magnificent personality who was coming from the direction of the door of the mosque. He was dressed in the attire of the people of the Hejaz (Arabs). He had a prayer mat on his shoulder. With great splendour and majesty, he began walking towards the door near the shrine of Hazrat Muslim Ibne Aqeel. At that time, a strange feeling came over me. Our eyes were dazzled by the brilliance of his countenance and we had lost all our thoughts. When he came close to us, he conveyed his salaams to us. My partner was so dumbstruck that he did not have the strength to even reply to the salaam. I too was mesmerised, but anyhow, I managed to reply to the salutation. When this majestic personality entered the courtyard of the shrine of Hazrat Muslim, our senses returned as if miraculously. We looked at each other asking, who was this person? How did he enter the mosque while we had closed the door of the mosque in such a manner that it was impossible for any person to enter. We were still stumped with these questions when we decided to go to the pious believer who was earlier reciting Dua Kumayl. However we saw that he his condition was such that he was weeping like one overwhelmed by difficulties. We asked him, what is the matter? Why are you weeping so much? He replied, I have been coming here for the last 40 Thursday nights with the intention of meeting Imam Mahdi (as). However, I am distressed that till now I have not been blessed with the opportunity of meeting the Imam (as). I was just reciting Dua Kumayl tonight, when a person came up to me and said, what are you reciting? I was overawed by his presence that I could not reply to his question and he went away as you just witnessed. We rushed to the door of the mosque and saw that it was shut in the same secure way as we had left it and was blocked by stones and bricks. At that time, it struck us that the person we met in the mosque was none other than Imam Mahdi (as). We regretted that we were unable to recognise him.");
        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Advice to Acquire Knowledge");
        esrc.add("Karamaate’ Ulama, page 78, reported from Inayaate’ Hazrat Mahdi Ba Ulama Wa Tullaab");
        edetails.add("\n" +
                "Sayyed Hashim said – When my father expired, the responsibility of the entire household came upon my shoulders, even though at that time, my financial condition was very poor.One day, it so happened that a student of my father from Tabriz came over and gave me a bundle of sticks. I took this bundle and went to the Hashemi fort. Along the way I saw a distinguished personality coming towards me. As I came close to him, I observed that he was wearing a black turban and had a green cloth on his waist. I was dazzled by the brilliant light emanating from his face. I was mesmerised and awe struck by this scene. He said to me, Sayyed Hashim! Acquire knowledge. Why are not you studying? It does not befit a sayyed that he remains bereft of knowledge. I replied, Mister! I am a poor man and don\\’t have the financial means to study. He said, Visit the university for studying. As regarding the issue of money, I will instruct Mulla Hashim. He will help you in this regard. He added, Ask the people of your village that why do they trouble the maulana? We had a conversation till such time that suddenly he became silent and I could not hear his voice. I looked up towards the person, but I could not see him anymore. I concluded that the person who was my companion for this time was no ordinary person, but he was the Imam of the time, Imam Mahdi (as). I regretted that he had vanished. I searched everywhere for him, but did not get an opportunity to meet him again. With tears in my eyes, I returned home and sat in a corner. I was grieved by his separation and cried for some time. I deeply regretted that I had not recognised my master Imam Mahdi (as). Seeing my distressed condition, my mother enquired, why are you crying? I narrated the entire episode to her. After some time, Sakina Khatoon, a maid at the house of Mulla Hashim came to my house and said, the maulana has called for you. I stood up from my place and rushed to his house. I stood at his door, and after securing his permission, I entered his house. On seeing me, he asked, Sayyed Hashim! How is your condition? Today you met a person on the road. What did he say to you? I was surprised how he knew of the incident since I had not disclosed this incident to any person. When I narrated the entire episode to him, he said, congratulations! The person you are referring to was Hazrat Imam Mahdi (as). He (as) came to my house and granted me the opportunity to meet him. He has instructed me in your regard. From today, I will pay your entire fees for the university. You can commence your studies without any worry. However, there is one thing – do not disclose this secret to anyone till the time I am alive. Therefore till the time he was alive, I did not speak of this matter to anyone.");



        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Correction of a Fatwa");
        esrc.add("Barakaate’ Hazrat Wali-e-Asr, page 172");
        edetails.add("\n" +
                "\n" +
                "During the period of Shaykh Mufeed, a person from the village region came to him and asked him, Sir! A pregnant lady has passed away, but the child in her womb is alive. Should the womb of this lady be cut to extract the child or should she be buried in the same condition? Shaykh Mufeed replied, the lady should be buried in this condition only.Having received a reply, the person left from there. However, not much time had elapsed when he sensed that a person is coming behind him on horseback. The horse rider called out to him, Mister! Shaykh Mufeed has said that the womb of the lady should be cut, the child should be taken out and then the lady should be buried. The person returned back to his village and acted as per the directive of the fatwa (religious decree). After a few years, the villager narrated the entire episode of the horse rider to Shaykh Mufeed. He said, I did not send any person after you. Therefore the person who guided you was none other than Imam Mahdi (as). This means that I have made an error of judgement in issuing fatwas regarding the laws of the faith. Therefore from today I will not issue any further fatwas. Saying this, Shaykh Mufeed closed the door of his house and did not leave his house. He was in a state of remorse and regret. However in a short time, a tauqee (letter) was issued by Imam Mahdi (as) in favour of Shaykh Mufeed, the gist of which was, your duty is to issue the fatwa. My responsibility is to correct it. Have faith that I will not allow you to fall into error. Thus, after receiving this letter, Shaykh Mufeed resumed the issue of fatwas from his side.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");




        etitle.add("Imam Mahdi(atfs) and his solution to a Religious Difficulty");
        esrc.add("Bulbule’ Bostaane’ Hazrat Mahdi (as), volume 2, page 192");
        edetails.add("\n" +
                "Respected Allamah Meer narrates – Once I left my house in the last part of the night for the Ziyarat of Hazrat Ameerul Momeneen (as). It was pitch dark at that time of the night. As I walked towards the shrine, I sensed that there was a person ahead of me. I quickened my pace so that I could catch up with him and see who it is. As I came close to him, I observed that it was Muqaddas Ardabeli.I slowed down and began walking behind him to understand where he was going so late in the night. I followed him at a short distance till such time that he reached the door of the holy shrine and stopped there. I too stopped behind to observe what his next step would be. He called out to someone but I could not understand what he said. At this time, the door of the shrine opened and a voice called out to him – Janab Ardabeli, come in. He went inside the shrine. I wanted to follow him and ran to the door, but by then the door had closed and I had to wait outside. After some time he came outside and went in the direction of the market. From there he left along the road which led to Masjid Kufa. I followed him at a distance till he reached Masjid Kufa. In the mosque, the place known as place of Hazrat Ibrahim appeared illuminated by a light. Muqaddas Ardabeli went towards that light and stood respectfully before it. I tried my best to come closer and observe what is happening, but was unable to do so. After some time, Muqaddas Ardabeli left from there and returned back to Najaf. Once again, I followed him. When we crossed Masjid Hannana, I sneezed. He immediately turned in the direction of the sound and said, who is it? I said, I said, it is me. He replied, Meer, is it you? I replied in the affirmative and said, I have been following you from Najaf Ashraf. I wanted to enter the shrine along with you, but the door closed before I could enter. I hid there for some time and waited for you to come out. Thereafter, I walked behind you for the entire distance of eleven kilometres till Masjid Kufa. While you stood before the light, I waited at a distance and tried to observe what was happening. After that I followed you from the mosque till I sneezed. For the sake of God, please do clarify this matter for me. Muqaddas Ardabeli asked me to promise that I would not disclose this secret to any person in his lifetime. I did so. He said, O Meer! Whenever I faced any difficult religious query, I sought its answer from Imam Ali (as). He (as) always responded to my queries and solved my difficulties. Today, I was presented with a religious query which, despite my best efforts, I was unable to get its answer. So I came, as was my custom, to the door of Imam Ali (as) so that he could relieve me of this difficulty. This time however, he instructed me to go to Masjid Kufa and meet his son, Hazrat Imam Mahdi (as) and present this case to him. He would provide me with the answer. Thus, I met Imam Mahdi (as) in the mosque and he gave me a satisfactory answer to my question. All praise be to Allah! Our countless salutations upon our scholars and may the mercy and blessings of Allah (swt) be upon those who had the good fortune of meeting with Imam Mahdi (as)! Indeed they were blessed with a good fortune to meet with the Imam (as) and to benefit from the ocean of his (as) knowledge. O Allah! Grant us too the opportunity to meet with the Imam of the Time, Hazrat Imam Mahdi (as). Ameen!");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");






        etitle.add("Completion of a Manuscript by Imam al Mahdi (a)");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("This is concerned with a book which was borrowed by al-'Allama al-Hilli from a Sunni scholar. Al-'Allama was supposed to transcribe the book until the next day. However, at midnight, he fell into sleep and thus, he could not transcribe the book. At this time, Imam al-Mahdi (a) went to him and asked him to leave the transcription of the book to him. When al-'Allama al-Hilli woke up in the morning, he saw a full transcribed copy of the book. The oldest source of this story is Majalis al-mu'minin by Qadi Nur Allah Shushtari. He did not cite a written source for the story, only saying that the story was well-known among the Shi'as.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        etitle.add("Meeting on the Way to Karbala");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("This is cited in Qisas al-'ulama by Muhammad b. Sulayman al-Tunikabuni. On his account, in one of his trips to Karbala, al-Allama al-Hilli was accompanied by a Sayyid. After having conversations with him, he found that the person was very knowledgeable. So, he asked him about some of his problems and received answers. He asked the stranger if it was possible to meet Imam al-Mahdi (a) during the Major Occultation. At this time, the whip (with which he rode his horse) fell from his hand. The stranger took the whip and gave it to al-Allama, and then answered: \"how is it not possible while his hand is now in your hand?\" Thus, al-Allama al-Hilli found that the stranger was Imam al-Mahdi (a), and so he kneeled in front of him. \n" +
                "Al-Tunikabuni cited no sources for the story. He only cited it as a folklore anecdote which was well known among people. A piece of evidence appealed by al-Tunikabuni to support the story is that in their conversations, the stranger talked about a hadith in al-Shaykh al-Tusi's Tahdhib al-ahkam of which al-'Allama was unaware. When al-'Allama went back home, he found the hadith and wrote on the margin that Imam al-Mahdi (a) attracted his attention to this hadith. Al-Tunikabuni quoted the story from a person called Mulla Safar 'Ali Lahiji, a student of Sayyid Muhammad Mujahid, the author of Manahil. Lahiji quoted his teacher, Sayyid Muhammad, as saying that he saw the manuscript and the note by al-Allama on its margins.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");





        etitle.add("Repayment of Loan");
        esrc.add("Bulbule Dostaan Hazrat Mahdi (as), volume 2, page 234");
        edetails.add("\n" +
                "Mirza Zainul Abedeen Salmaasi says – Once it so occurred that some wealthy people from Tehran came to Najaf Ashraf for Ziyarat and stayed at my residence. One early Wednesday morning, I brought them over from Najaf to the mosque of Kufa. We sat together in that part of the mosque where Hazrat Ameerul Momeneen (as) used to recite his prayers and was fatally wounded with the sword.We had just sat there when Maulana Abdul Hameed Qazvini came there. He was carrying a tumbler of water and a food mat under his arm. He saw and turned in my direction. When he saw the other people from Tehran, he turned away and went in the direction of the grave of Janab Muslim Ibne Aqeel. I called out to him, Come over, all of these are our people only. He came over and sat down amongst us. We exchanged greetings and then I asked him, where were you? He replied, Last night, as it was the eve of Wednesday, I was in Masjid Sehla till morning. I came to Kufa and soon I will leave for Najaf. I said, what is it with you that you frequently visit the mosque of Sehla? Have you observed something special there? He kept silent and did not reply. When I pressed him further for details, he said, I was once deep in debt and I had no means to repay it. I was very fearful that I should not die while I was having loans on my neck. God forbid, if that had to happen, how would I face the people (on the Day of Judgement). With these worries, I went one day to the blessed shrine of Hazrat Ameerul Momeneen (as). I just sat there and fixed my eyes on at the grave of the Imam (as). I was narrating my difficulties to the Imam (as) when a young student passed from there and said to me, Janab Abdul Hameed Qazvini, why are you looking so worried? I replied that I am very deep in debt and am troubled how I will repay my loans. He said, you are anxious for nothing. I said, why do you say that? He replied, the one who has Imam Mahdi (as) with him, then he has no reason to be worried. I was highly inspired by these words of the student and said, so what should I do? He said, go and spend 40 Tuesday nights (eve of Wednesday) in Masjid Sehla and seek help from Imam Mahdi (as). Inshallah, he will solve your difficulties. Thus, I started visiting Masjid Sehla every Tuesday night. Even before the passage of 40 nights, I was able to repay my entire loan. I was very motivated by this and made up my mind that I will repeat this act and spend another 40 Tuesday nights in Masjid Sehla, this time with the intention of getting an opportunity to meet with my master Hazrat Imam Mahdi (as). I was performing this act regularly when the fortieth Tuesday night of the sequence fell on the day of Arbaeen (fortieth day of martyrdom) of Imam Husain (as). On account of Arbaeen, people were travelling to Karbala. I was in a dilemma. If I went to Karbala, I would lose the fortieth night in Masjid Sehla and it is not appropriate that I don\\’t go to Karbala on Arbaeen. Finally, I decided that, God willing, if life permitted, I would perform the Ziyarat of Imam Husain (as) next year. This year, I decided that I would complete the act which I had set out to do. On Tuesday night, I reached Masjid Sehla and found that I was alone. Everybody had left for Karbala. There was no one there and the mosque was enveloped in darkness. I completed the aamaal of Masjid Sehla, went to the roof of the mosque and after eating something, I went to sleep. After about two and a half hours, a person came to the mosque and shaking my leg said, O Abdul Hameed Qazvini, get up. I awoke and saw an Arab standing over me. I said, Yes, what is it? He said, get up. If you wish to do the Ziyarat of the prince, then do so. I thought to myself, perhaps some ajamee (non Arab) person has come and this person wants me to meet him since I am the only one available here. With this thought in mind, I said to him, you go. I have nothing to do with him. Hearing my response, the Arab went away. As I lay down to go back to sleep, a thought struck me that anyways I had not gone close enough to him to meet him. It may not be a bad idea to catch a glimpse of him from afar and see who he is. I stood up and saw that a respected personality was seated in the western area of the mosque. His face was radiant as the full moon and some people were sitting around him. I turned to go back to sleep, but as I lay down a thought came to my mind that when I entered the mosque, all the lamps were silent and there was darkness all around. Then what was the reason that the mosque appeared illuminated? I got up from my place and went again to take a look, but saw that there was nobody there.");


        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("");




        etitle.add("Supplications and Dhikrs for Meeting with Imam al-Mahdi(a)");
        esrc.add("WikiShia-An Authentic Iranian Website");
        edetails.add("Some supplications, Istighathas (beseeching for help), and Visitation Supplications are transmitted for meeting Supplications and Dhikrs for Meeting with Imam al-Mahdi (a) with Imam al-Mahdi (a), such as the Supplication of Nudba, Ziyara Al Yasin, and al-\\'Ahd Supplication. Moreover, some supplications have been transmitted with regard to practices and supplications specific to the meeting with Imam alMahdi (a): 1. In his Makarim al-akhlaq, al-Hasan b. alFadl al-Tabrisi writes: \\\"it is transmitted that if one continuously recites the following supplication after every obligatory prayer, his life will be so long that it would be boring for him and he would finally meet with Sahib al-Amr (that is, Imam al-Mahdi). Here is the supplication: \\\"O God! Send your peace to Muhammad and the family of Muhammad! O God! Truly your truthful, accredited messenger, your peace be upon him and his family, said that you said: ‘I never doubted anything I do as I doubted the reception of the soul of My faithful servant who dislikes death and I dislike to bother him.\\' O God! So send your peace to Muhammad and the family of Muhammad and hasten the faraj, victory, and comfort of Your saints and do not bother me and such and such a person (here you can mention anyone you want).\\\" 2. Another long supplication is also transmitted from Imam al-Sadiq (a). He said if one recites the supplication after every obligatory prayer, he will meet Imam al-Mahdi (a) while awake or in his dreams.");



        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");



        etitle.add("Agha Bahjat About Meeting Imame Zamana atfs");
        esrc.add("Bahjat.ir");
        edetails.add("Question: I am eager to meet the Imam of our time, Imam Mahdi, peace be upon him. I request you to pray for the fulfillment of this desire of mine.\n" +
                "\n" +
                "Answer: Recite Salawat a lot and present them to him, along with praying for the hastening of his reappearance. In addition, go to Masjid Jamkaran a lot, and offer the prayers of the Masjid.");

        utitle.add("");
        usrc.add("Sorry Not Available");
        udetails.add("Sorry Not Available");


        Log.d("myapp1",etitle.size()+" "+utitle.size()+" "+edetails.size()+" "+udetails.size());
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
            etitle.set(i,etitle.get(i).replace("\\",""));
            edetails.set(i,edetails.get(i).replace("\\",""));
            s=esrc.get(i)+"\n";
            esrc.set(i,s);

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
            utitle.set(i,utitle.get(i).replace("\\",""));
            udetails.set(i,udetails.get(i).replace("\\",""));
            s=usrc.get(i)+"\n";
            usrc.set(i,s);

        }
        Intent intent=getIntent();
        String d=intent.getStringExtra(MeetActivity.MSG);

        if(d!=null)
        {
            Intent intent1=new Intent(this,MeetNextActivity.class);
            intent1.putExtra(MeetActivity.MSG,d);
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


       final RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MeetActivity.this, arr);
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
