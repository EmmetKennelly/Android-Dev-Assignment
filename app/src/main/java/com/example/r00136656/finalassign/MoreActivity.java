package com.example.r00136656.finalassign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MoreActivity extends AppCompatActivity {
    ListView listView1;
    String url ="https://na.leagueoflegends.com/en/game-info/champions/Ahri/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ahri_more_activity);
        listView1=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(com.example.r00136656.finalassign,android.R.layout.simple_list_item_1,url);
        listView1.setAdapter(adapter);

        registerForContextMenu(listView1);
    }
}
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Would you like to get more information?");
        menu.add(0, v.getId(), 0, "MoreInfo");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="MoreInfo"){
            Toast.makeText(getApplicationContext(),"going to provided URL",Toast.LENGTH_LONG).show();
        }

        else{
            return false;
        }
        return true;
    }
}