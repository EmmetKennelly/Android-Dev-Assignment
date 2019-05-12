package com.example.r00136656.finalassign;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by R00136656 on 25/11/2017.
 */

public class ListActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
    }
    public void  Ahri(View view ) {
        Button allb = Button(findViewById(R.id.bAhri));
        Intent intent1 = new Intent(this, Ahri_Activity.class);
        startActivity(intent1);
    }

    public void Thresh(View view) {
        Button roleb = Button(findViewById(R.id.bThresh));
        Intent intent2 = new Intent(this, ThreshActivity.class);
        startActivity(intent2);
    }
    public void  Zed(View view ) {
        Button allb = Button(findViewById(R.id.bZed));
        Intent intent3 = new Intent(this, ZedActivity.class);
        startActivity(intent3);
    }

    public void  Poppy(View view ){
        Button roleb = Button(findViewById(R.id.bPoppy));
        Intent intent4 = new Intent(this, PoppyActivity.class);
        startActivity(intent4);


    }
    public void  Hecarim(View view ) {
        Button allb = Button(findViewById(R.id.bHecarim));
        Intent intent5 = new Intent(this, HecarimActivity.class);
        startActivity(intent5);
    }

    public void  Nami(View view ){
        Button roleb = Button(findViewById(R.id.bNami));
        Intent intent6 = new Intent(this, NamiActivity.class);
        startActivity(intent6);



    } public void Jinx(View view ) {
        Button allb = Button(findViewById(R.id.bJinx));
        Intent intent7 = new Intent(this, JinxActivity.class);
        startActivity(intent7);
    }

    public void  Jhin(View view ){
        Button roleb = Button(findViewById(R.id.bJhin));
        Intent intent8 = new Intent(this, JhinActivity.class);
        startActivity(intent8);


    }
    public void  Caitlyn(View view ){
        Button roleb = Button(findViewById(R.id.bCaitlyn));
        Intent intent9 = new Intent(this, CaitlynActivity.class);
        startActivity(intent9);


    }


}
