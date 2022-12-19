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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class listelenen_bolumler extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private Button tercihlistemeekle_button;
    private Button listbol_ana_menu_button;
    private Button tercih_listem;
    private CheckBox listbol_checkBox0, listbol_checkBox1, listbol_checkBox2, listbol_checkBox3, listbol_checkBox4, listbol_checkBox5,
            listbol_checkBox6, listbol_checkBox7, listbol_checkBox8, listbol_checkBox9, listbol_checkBox10, listbol_checkBox11, listbol_checkBox12, listbol_checkBox13,
            listbol_checkBox14, listbol_checkBox15, listbol_checkBox16, listbol_checkBox17, listbol_checkBox18, listbol_checkBox19, listbol_checkBox20, listbol_checkBox21,
            listbol_checkBox22, listbol_checkBox23, listbol_checkBox24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listelenen_bolumler);

        tercihlistemeekle_button = (Button) findViewById(R.id.listbol_tercih_listeme_ekle_button);
        listbol_ana_menu_button = (Button) findViewById(R.id.listbol_ana_menu_button);
        tercih_listem = (Button) findViewById(R.id.listbol_tercih_listem_button);


        listbol_checkBox0 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_0);
        listbol_checkBox1 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_1);
        listbol_checkBox2 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_2);
        listbol_checkBox3 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_3);
        listbol_checkBox4 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_4);
        listbol_checkBox5 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_5);
        listbol_checkBox6 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_6);
        listbol_checkBox7 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_7);
        listbol_checkBox8 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_8);
        listbol_checkBox9 = (CheckBox) findViewById(R.id.checkbox_listelenenblomler_9);
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
    String aa = "";


    /*
    String ab = listbol_checkBox0.toString();
            System.out.println(ab);
            ValueEventListener postListener = new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // Get Post object and use the values to update the UI
                    User users = dataSnapshot.getValue(User.class);
                    users.tercih_listesi_list.add(ab);
                    System.out.println(users.tercih_listesi_list.get(0));
                    // ..
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            };
     */


    public void tercihlistemeekle_func() {
        if (listbol_checkBox0.isChecked()) {
            System.out.println("deneme");
            aa = listbol_checkBox1.toString();
            db.collection("/1/JKR7wLb334TYX4lK59t6").document().set(aa);

        }
        if (listbol_checkBox1.isChecked()) {
            aa = listbol_checkBox1.toString();
            db.collection("/1/JKR7wLb334TYX4lK59t6").add(aa);
        }


        if (listbol_checkBox2.isChecked()) {
            aa = listbol_checkBox2.toString();
        }
        if (listbol_checkBox3.isChecked()) {
            aa = listbol_checkBox3.toString().toString();
        }
        if (listbol_checkBox4.isChecked()) {
            aa = listbol_checkBox4.toString().toString();
        }
        if (listbol_checkBox5.isChecked()) {
            aa = listbol_checkBox5.toString().toString();
        }
        if (listbol_checkBox6.isChecked()) {
            aa = listbol_checkBox6.toString().toString();
        }
        if (listbol_checkBox7.isChecked()) {
            aa = listbol_checkBox7.toString().toString();
        }
        if (listbol_checkBox8.isChecked()) {
            aa = listbol_checkBox8.toString().toString();
        }
        if (listbol_checkBox9.isChecked()) {
            aa = listbol_checkBox9.toString().toString();
        }
        if (listbol_checkBox10.isChecked()) {
            aa = listbol_checkBox10.toString().toString();
        }
        if (listbol_checkBox11.isChecked()) {
            aa = listbol_checkBox11.toString().toString();
        }
        if (listbol_checkBox12.isChecked()) {
            aa = listbol_checkBox12.toString().toString();
        }
        if (listbol_checkBox13.isChecked()) {
            aa = listbol_checkBox13.toString().toString();
        }
        if (listbol_checkBox14.isChecked()) {
            aa = listbol_checkBox14.toString().toString();
        }
        if (listbol_checkBox15.isChecked()) {
            aa = listbol_checkBox15.toString().toString();
        }
        if (listbol_checkBox16.isChecked()) {
            aa = listbol_checkBox16.toString().toString();
        }
        if (listbol_checkBox17.isChecked()) {
            aa = listbol_checkBox17.toString().toString();
        }
        if (listbol_checkBox18.isChecked()) {
            aa = listbol_checkBox18.toString().toString();
        }
        if (listbol_checkBox19.isChecked()) {
            aa = listbol_checkBox19.toString().toString();
        }
        if (listbol_checkBox20.isChecked()) {
            aa = listbol_checkBox20.toString().toString();
        }
        if (listbol_checkBox21.isChecked()) {
            aa = listbol_checkBox21.toString().toString();
        }
        if (listbol_checkBox22.isChecked()) {
            aa = listbol_checkBox22.toString().toString();
        }
        if (listbol_checkBox23.isChecked()) {
            aa = listbol_checkBox23.toString().toString();
        }
        if (listbol_checkBox24.isChecked()) {
            aa = listbol_checkBox24.toString().toString();
        } else {
            //toast for tercih_liste.
        }
    }
}