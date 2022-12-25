/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alanlarbolumler extends AppCompatActivity {

    private Button bolumlerigoster_button;
    private Button alanbolum_ana_menu_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alanlarbolumler);

        bolumlerigoster_button    = findViewById(R.id.bolumlerigoster_button);
        alanbolum_ana_menu_button = findViewById(R.id.alanbolum_ana_menu_button);

        alanbolum_ana_menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain_activity();
            }
        });

        bolumlerigoster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlistelenen_bolumler();
            }
        });
    }

    public void openMain_activity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

    public void openlistelenen_bolumler(){
        Intent intent = new Intent (this, listelenen_bolumler.class);
        startActivity(intent);
    }
}