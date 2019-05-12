package com.example.r00136656.finalassign;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

/**
 * Created by R00136656 on 02/12/2017.
 */

public class Frag {
    Button bn;
    boolean status= fasle;

    puprotected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);


            bn = (Button)findViewById(R.id.bn);
            bn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmag =getFragmentManager();
                    FragmentTransaction fragtra = fragmag.beginTransaction();
                    if (!status){
                        Fragment1 f1 =new Fragment1();
                        fragtra.add(R.id.fragment_conntainer,f1);
                        fragtra.commit();
                        bn.setText("getting second fragment");
                        status =true;
                    }
                    else{
                        Fragment2 f2 =new Fragment2();
                        fragtra.add(R.id.fragment_conntainer,f2);
                        fragtra.commit();
                        bn.setText("getting first fragment");
                        status =false;
                    }
                }
            });
        }
    }
