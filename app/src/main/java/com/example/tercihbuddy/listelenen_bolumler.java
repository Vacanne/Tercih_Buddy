/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class listelenen_bolumler extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private Button tercihlistemeekle_button;
    private Button listbol_ana_menu_button;
    private Button tercih_listem;
    private CheckBox listbol_checkBox0, listbol_checkBox1, listbol_checkBox2, listbol_checkBox3, listbol_checkBox4, listbol_checkBox5,
            listbol_checkBox6, listbol_checkBox7, listbol_checkBox8, listbol_checkBox9, listbol_checkBox10, listbol_checkBox11, listbol_checkBox12, listbol_checkBox13,
            listbol_checkBox14, listbol_checkBox15, listbol_checkBox16, listbol_checkBox17, listbol_checkBox18, listbol_checkBox19, listbol_checkBox20, listbol_checkBox21,
            listbol_checkBox22, listbol_checkBox23, listbol_checkBox24;
    private FirebaseAuth myAuth;
    private FirebaseUser activeUser;
    private String activeUsername;
    private DatabaseReference userPath;
    String activeUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listelenen_bolumler);

        myAuth = FirebaseAuth.getInstance();
        activeUser = myAuth.getCurrentUser();

        tercihlistemeekle_button = (Button) findViewById(R.id.listbol_tercih_listeme_ekle_button);
        listbol_ana_menu_button = (Button) findViewById(R.id.listbol_ana_menu_button);
        tercih_listem = (Button) findViewById(R.id.listbol_tercih_listem_button);



        listbol_checkBox0  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_0);
        listbol_checkBox1  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_1);
        listbol_checkBox2  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_2);
        listbol_checkBox3  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_3);
        listbol_checkBox4  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_4);
        listbol_checkBox5  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_5);
        listbol_checkBox6  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_6);
        listbol_checkBox7  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_7);
        listbol_checkBox8  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_8);
        listbol_checkBox9  = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_9);
        listbol_checkBox10 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_10);
        listbol_checkBox11 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_11);
        listbol_checkBox12 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_12);
        listbol_checkBox13 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_13);
        listbol_checkBox14 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_14);
        listbol_checkBox15 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_15);
        listbol_checkBox16 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_16);
        listbol_checkBox17 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_17);
        listbol_checkBox18 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_18);
        listbol_checkBox19 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_19);
        listbol_checkBox20 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_20);
        listbol_checkBox21 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_21);
        listbol_checkBox22 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_22);
        listbol_checkBox23 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_23);
        listbol_checkBox24 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_24);

/*
        CheckBox checkBox = findViewById(R.id.checkbox_id);
        boolean isChecked = checkBox.isChecked();


        checkBox.setChecked(true);  // to check the CheckBox
        checkBox.setChecked(false);  // to uncheck the CheckBox


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Perform action here
            }
        });

         */

        listbol_ana_menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain_activity();
            }
        });
        tercih_listem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercihlistemactivityopen();
            }
        });
        tercihlistemeekle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercihlistemeekle_func();
            }
        });
    }

    public void openMain_activity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void tercihlistemactivityopen() {
        Intent intent = new Intent(this, Tercih_Listem.class);
        startActivity(intent);
    }

    String[] checkbox_list21 = {};

    String fin = "";
    String sep = ",";
    public void tercihlistemeekle_func() {

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Kullanıcı giriş yaptı
            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Users_tb").child(user.getUid());
            // Kullanıcının veritabanı referansı
            //String newTercihList = "your-new-tercih-list";

            if (listbol_checkBox0.isChecked()) {
                fin = fin + (String) listbol_checkBox0.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox1.isChecked()) {
                fin = fin + (String) listbol_checkBox1.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox2.isChecked()) {
                fin = fin + (String) listbol_checkBox2.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox3.isChecked()) {
                fin = fin + (String) listbol_checkBox3.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox4.isChecked()) {
                fin = fin + (String) listbol_checkBox4.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox5.isChecked()) {
                fin = fin + (String) listbol_checkBox5.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox6.isChecked()) {
                fin = fin + (String) listbol_checkBox6.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox7.isChecked()) {
                fin = fin + (String) listbol_checkBox7.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox8.isChecked()) {
                fin = fin + (String) listbol_checkBox8.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox9.isChecked()) {
                fin = fin + (String) listbol_checkBox9.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox10.isChecked()) {
                fin = fin + (String) listbol_checkBox10.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox11.isChecked()) {
                fin = fin + (String) listbol_checkBox11.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox12.isChecked()) {
                fin = fin + (String) listbol_checkBox12.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox13.isChecked()) {
                fin = fin + (String) listbol_checkBox13.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox14.isChecked()) {
                fin = fin + (String) listbol_checkBox14.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox15.isChecked()) {
                fin = fin + (String) listbol_checkBox15.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox16.isChecked()) {
                fin = fin + (String) listbol_checkBox16.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox17.isChecked()) {
                fin = fin + (String) listbol_checkBox17.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox18.isChecked()) {
                fin = fin + (String) listbol_checkBox18.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox19.isChecked()) {
                fin = fin + (String) listbol_checkBox19.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox20.isChecked()) {
                fin = fin + (String) listbol_checkBox20.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox21.isChecked()) {
                fin = fin + (String) listbol_checkBox21.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox22.isChecked()) {
                fin = fin + (String) listbol_checkBox22.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox23.isChecked()) {
                fin = fin + (String) listbol_checkBox23.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }
            if (listbol_checkBox24.isChecked()) {
                fin = fin + (String) listbol_checkBox24.getText();
                fin = sep + fin + sep;
                databaseReference.child("Tercih_list").setValue(fin);
                Toast.makeText(listelenen_bolumler.this, "Bolumler eklendi.", Toast.LENGTH_LONG).show();
            }

        } else {
            // Kullanıcı giriş yapmadı
        }
    }



}