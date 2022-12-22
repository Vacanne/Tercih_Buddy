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
        /*
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
*/
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

                //String str = Objects.requireNonNull(someObject);
                //String[] parts = str.split("\\.");


                String[] tercihListArray = new String[0];
                if (tercihList != null) {
                    tercihListArray = tercihList.split(",");
                }else{
                    tercihList = "";
                }

                System.out.println(tercihListArray.length);

                for (int i = 0; i< tercihListArray.length; i++){
                    if (!Objects.equals(tercihListArray[i], "")){

                        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_tercihlistem_0);
                        checkBox.setText(tercihListArray[tercihListArray.length-1]);
                        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_1);
                        checkBox1.setText(tercihListArray[tercihListArray.length-2]);
                        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_2);
                        checkBox2.setText(tercihListArray[tercihListArray.length-3]);
                        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_3);
                        checkBox3.setText(tercihListArray[tercihListArray.length-4]);
                        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_4);
                        checkBox4.setText(tercihListArray[tercihListArray.length-5]);
                        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_5);
                        checkBox5.setText(tercihListArray[tercihListArray.length-6]);
                        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_6);
                        checkBox6.setText(tercihListArray[tercihListArray.length-7]);
                        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_7);
                        checkBox7.setText(tercihListArray[tercihListArray.length-8]);
                        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_8);
                        checkBox8.setText(tercihListArray[tercihListArray.length-9]);
                        CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_9);
                        checkBox9.setText(tercihListArray[tercihListArray.length-10]);
                        CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_10);
                        checkBox10.setText(tercihListArray[tercihListArray.length-11]);
                        CheckBox checkBox11 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_11);
                        checkBox11.setText(tercihListArray[tercihListArray.length-12]);
                        CheckBox checkBox12 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_12);
                        checkBox12.setText(tercihListArray[tercihListArray.length-13]);
                        CheckBox checkBox13 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_13);
                        checkBox13.setText(tercihListArray[tercihListArray.length-14]);
                        CheckBox checkBox14 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_14);
                        checkBox14.setText(tercihListArray[tercihListArray.length-15]);
                        CheckBox checkBox15 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_15);
                        checkBox15.setText(tercihListArray[tercihListArray.length-16]);
                        CheckBox checkBox16 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_16);
                        checkBox16.setText(tercihListArray[tercihListArray.length-17]);
                        CheckBox checkBox17 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_17);
                        checkBox17.setText(tercihListArray[tercihListArray.length-18]);
                        CheckBox checkBox18 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_18);
                        checkBox18.setText(tercihListArray[tercihListArray.length-19]);
                        CheckBox checkBox19 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_19);
                        checkBox19.setText(tercihListArray[tercihListArray.length-20]);
                        CheckBox checkBox20 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_20);
                        checkBox20.setText(tercihListArray[tercihListArray.length-21]);
                        CheckBox checkBox21 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_21);
                        checkBox21.setText(tercihListArray[tercihListArray.length-22]);
                        CheckBox checkBox22 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_22);
                        checkBox22.setText(tercihListArray[tercihListArray.length-23]);
                        CheckBox checkBox23 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_23);
                        checkBox23.setText(tercihListArray[tercihListArray.length-24]);
                        CheckBox checkBox24 = (CheckBox) findViewById(R.id.checkbox_tercihlistem_24);
                        checkBox24.setText(tercihListArray[tercihListArray.length-25]);
                        System.out.println(i+" : "+tercihListArray[i]);
                        System.out.println("length " + tercihListArray.length);
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