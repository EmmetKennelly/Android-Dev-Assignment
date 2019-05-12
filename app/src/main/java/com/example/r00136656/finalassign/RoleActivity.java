package com.example.r00136656.finalassign;

/**
 * Created by R00136656 on 25/11/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RoleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.role_layout);
    }
    public void  Jungle(View view ) {
        Button allb = Button(findViewById(R.id.btn_counters_dialog3));
        Intent intent1 = new Intent(this, JGL.class);
        startActivity(intent1);
    }

    public void Top(View view) {
        Button roleb = Button(findViewById(R.id.btn_counters_dialog2));
        Intent intent2 = new Intent(this, Top.class);
        startActivity(intent2);
    }
    public void  Mid(View view ) {
        Button allb = Button(findViewById(R.id.btn_counters_dialog));
        Intent intent3 = new Intent(this, Mid.class);
        startActivity(intent3);
    }

    public void  Sup(View view ){
        Button roleb = Button(findViewById(R.id.btn_counters_dialog4));
        Intent intent4 = new Intent(this, SUP.class);
        startActivity(intent4);


    }
    public void  ADC(View view ) {
        Button allb = Button(findViewById(R.id.btn_builds_dialog));
        Intent intent5 = new Intent(this, ADC.class);
        startActivity(intent5);
    }

}