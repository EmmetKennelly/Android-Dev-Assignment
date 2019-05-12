package com.example.r00136656.finalassign;
/**
 * Created by R00136656 on 02/12/2017.
 */

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
public class getInfoList {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    String size = spinner.getSelectedItem().toString();
    int spinner_pos = spinner.getSelectedItemPosition();
    String[] size_values = getResources().getStringArray(R.array.spinItem);
    int size = Integer.valueOf(size_values[spinner_pos]);

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_rows);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.rg_strong_weak_actcounters);
        btnDisplay = (Button) findViewById(R.id.btnSubmit);

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = radioGroup.getCheckedRadioButtonId();


                radioButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(Ahri_Activity.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();

            }
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId) {
                    case R.id.rb_strong_against_actcounters:
                        RadioButton value = Integer.parseInt(((RadioButton) findViewById(R.id.rb_strong_against_actcounters).getText()) * 3);
                        break;
                    case R.id.rb_weak_against_actcounters:
                        RadioButton value2 = Integer.parseInt(((RadioButton) findViewById(R.id.rb_weak_against_actcounters).getText()) * 3);
                        break;


                }


        }


}