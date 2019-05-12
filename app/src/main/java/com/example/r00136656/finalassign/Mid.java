package com.example.r00136656.finalassign;

/**
 * Created by R00136656 on 24/11/2017.
 */

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Mid extends Activity
{

    ListView list;
    private List<String> List_file;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mid_activity);
        List_file =new ArrayList<>();
        list = (ListView)findViewById(R.id.listview);

        CreateListView();
    }
    private void CreateListView()
    {
        List_file.add("Ahri");
        List_file.add("Zed");


        list.setAdapter(new ArrayAdapter<string>(Example.this, android.R.layout.simple_list_item_1,List_file));
        list.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3)
            {

            }
        });
    }
}
