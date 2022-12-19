package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Tercih_Listem extends AppCompatActivity {

    private Button anamenu_button;
    private Button tercihlistemdenkaldir_button;
    private CheckBox checkBox0,checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,
            checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12,checkBox13,
            checkBox14,checkBox15,checkBox16,checkBox17,checkBox18,checkBox19,checkBox20,checkBox21,
            checkBox22,checkBox23,checkBox24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercih_listem);

        anamenu_button = (Button) findViewById(R.id.ana_menu);
        tercihlistemdenkaldir_button    = (Button) findViewById(R.id.tercih_listemden_kaldır);

        checkBox0  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_0);
        checkBox1  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_1);
        checkBox2  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_2);
        checkBox3  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_3);
        checkBox4  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_4);
        checkBox5  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_5);
        checkBox6  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_6);
        checkBox7  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_7);
        checkBox8  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_8);
        checkBox9  = (CheckBox) findViewById(R.id.checkbox_tercihlistem_9);
        checkBox10 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_10);
        checkBox11 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_11);
        checkBox12 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_12);
        checkBox13 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_13);
        checkBox14 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_14);
        checkBox15 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_15);
        checkBox16 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_16);
        checkBox17 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_17);
        checkBox18 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_18);
        checkBox19 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_19);
        checkBox20 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_20);
        checkBox21 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_21);
        checkBox22 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_22);
        checkBox23 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_23);
        checkBox24 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_24);

        anamenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain_activity();
            }
        });
    }
    public void openMain_activity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }



}