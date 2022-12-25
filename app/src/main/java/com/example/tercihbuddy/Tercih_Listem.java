/*
Author: Mustafa Can Ince
 */

package com.example.tercihbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Tercih_Listem extends AppCompatActivity {

    private Button anamenu_button;
    private Button tercihlistemdenkaldir_button;
    private CheckBox checkBox0,checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,
            checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12,checkBox13,
            checkBox14,checkBox15,checkBox16,checkBox17,checkBox18,checkBox19,checkBox20,checkBox21,
            checkBox22,checkBox23,checkBox24;
    private DatabaseReference databaseReference1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercih_listem);

        anamenu_button = (Button) findViewById(R.id.ana_menu);
        tercihlistemdenkaldir_button    = (Button) findViewById(R.id.tercih_listemden_kaldır);

        checkBox0  = findViewById(R.id.checkbox_tercihlistem_0);
        checkBox1  = findViewById(R.id.checkbox_tercihlistem_1);
        checkBox2  = findViewById(R.id.checkbox_tercihlistem_2);
        checkBox3  = findViewById(R.id.checkbox_tercihlistem_3);
        checkBox4  = findViewById(R.id.checkbox_tercihlistem_4);
        checkBox5  = findViewById(R.id.checkbox_tercihlistem_5);
        checkBox6  = findViewById(R.id.checkbox_tercihlistem_6);
        checkBox7  = findViewById(R.id.checkbox_tercihlistem_7);
        checkBox8  = findViewById(R.id.checkbox_tercihlistem_8);
        checkBox9  = findViewById(R.id.checkbox_tercihlistem_9);
        checkBox10 = findViewById(R.id.checkbox_tercihlistem_10);
        checkBox11 = findViewById(R.id.checkbox_tercihlistem_11);
        checkBox12 = findViewById(R.id.checkbox_tercihlistem_12);
        checkBox13 = findViewById(R.id.checkbox_tercihlistem_13);
        checkBox14 = findViewById(R.id.checkbox_tercihlistem_14);
        checkBox15 = findViewById(R.id.checkbox_tercihlistem_15);
        checkBox16 = findViewById(R.id.checkbox_tercihlistem_16);
        checkBox17 = findViewById(R.id.checkbox_tercihlistem_17);
        checkBox18 = findViewById(R.id.checkbox_tercihlistem_18);
        checkBox19 = findViewById(R.id.checkbox_tercihlistem_19);
        checkBox20 = findViewById(R.id.checkbox_tercihlistem_20);
        checkBox21 = findViewById(R.id.checkbox_tercihlistem_21);
        checkBox22 = findViewById(R.id.checkbox_tercihlistem_22);
        checkBox23 = findViewById(R.id.checkbox_tercihlistem_23);
        checkBox24 = findViewById(R.id.checkbox_tercihlistem_24);

        anamenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain_activity();
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Users_tb");

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String userId = user.getUid();

        myRef.child(userId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // veriler değiştiğinde bu metod çağrılır
                String tercihList = dataSnapshot.child("Tercih_list").getValue(String.class);
                // tercihList değişkenine eriştim

                String[] tercihListArray = new String[0];
                if (tercihList != null) {
                    tercihListArray = tercihList.split(",");
                }else{
                    tercihList = "";
                }

                System.out.println(tercihListArray.length);

                for (int i = 0; i< tercihListArray.length; i++){

                    if (!Objects.equals(tercihListArray[i], "")){

                        try {
                            checkBox0.setText(tercihListArray[tercihListArray.length-1]);
                            checkBox1.setText(tercihListArray[tercihListArray.length-2]);
                            checkBox2.setText(tercihListArray[tercihListArray.length-3]);
                            checkBox3.setText(tercihListArray[tercihListArray.length-4]);
                            checkBox4.setText(tercihListArray[tercihListArray.length-5]);
                            checkBox5.setText(tercihListArray[tercihListArray.length-6]);
                            checkBox6.setText(tercihListArray[tercihListArray.length-7]);
                            checkBox7.setText(tercihListArray[tercihListArray.length-8]);
                            checkBox8.setText(tercihListArray[tercihListArray.length-9]);
                            checkBox9.setText(tercihListArray[tercihListArray.length-10]);
                            checkBox10.setText(tercihListArray[tercihListArray.length-11]);
                            checkBox11.setText(tercihListArray[tercihListArray.length-12]);
                            checkBox12.setText(tercihListArray[tercihListArray.length-13]);
                            checkBox13.setText(tercihListArray[tercihListArray.length-14]);
                            checkBox14.setText(tercihListArray[tercihListArray.length-15]);
                            checkBox15.setText(tercihListArray[tercihListArray.length-16]);
                            checkBox16.setText(tercihListArray[tercihListArray.length-17]);
                            checkBox17.setText(tercihListArray[tercihListArray.length-18]);
                            checkBox18.setText(tercihListArray[tercihListArray.length-19]);
                            checkBox19.setText(tercihListArray[tercihListArray.length-20]);
                            checkBox20.setText(tercihListArray[tercihListArray.length-21]);
                            checkBox21.setText(tercihListArray[tercihListArray.length-22]);
                            checkBox22.setText(tercihListArray[tercihListArray.length-23]);
                            checkBox23.setText(tercihListArray[tercihListArray.length-24]);
                            checkBox24.setText(tercihListArray[tercihListArray.length-25]);
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // bir hata oluştu
            }

        });

    }
    public void openMain_activity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }



}