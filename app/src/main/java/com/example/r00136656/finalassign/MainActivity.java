package com.example.r00136656.finalassign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.HashMap;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {


    static final String ChampName = "title";
    static final String FavoriteItem = "artist";
    static final String Tier = "duration";
    static final String KEY_THUMB_URL = "thumb_url";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);
        ListView list;
        ArrayList  lt;
        HashMap lt;
        String gt;
        champList = new ArrayList & lt; HashMap & lt;


        XMLParser parser = new XMLParser();
        String xml = parser.getXmlFromUrl(URL);
        Document doc = parser.getDomElement(xml);

        NodeList nl = doc.getElementsByTagName(ChampName);

        for (int I = 0; I &lt; nl.getLength(); i++) {


            Element e = (Element) nl.item(i);


            map.put(ChampName, parser.getValue(e, ChampName));
            map.put(FavoriteItem, parser.getValue(e, FavoriteItem));
            map.put(Tier, parser.getValue(e, Tier));
            map.put(KEY_THUMB_URL, parser.getValue(e, KEY_THUMB_URL));


            champList.add(map);
        }

        list=(ListView)findViewById(R.id.list)
        adapter=new Adapter(this, champList);
        list.setAdapter(adapter);

        // Click event for single list row
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void allChar(View view) {
                Button allb = Button(findViewById(R.id.btn_builds_dialog));
                Intent intent1 = new Intent(this, ListActivity.class);
                startActivity(intent1);
            }

            public void roleList(View view) {
                Button roleb = Button(findViewById(R.id.btn_builds_dialog));
                Intent intent2 = new Intent(this, RoleActivity.class);
                startActivity(intent2);

            }