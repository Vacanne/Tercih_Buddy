/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sehirveuniversitesecimi extends AppCompatActivity {
    private Button seherveuni_ana_menu_button;
    private Button bolumlerigoster_sehiruni_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sehirveuniversitesecimi);
        seherveuni_ana_menu_button      = findViewById(R.id.seherveuni_ana_menu_button);
        bolumlerigoster_sehiruni_button = findViewById(R.id.bolumlerigoster_sehiruni_button);

        seherveuni_ana_menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain_activity();
            }
        });

        bolumlerigoster_sehiruni_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openListelenenBolumler();
            }
        });
    }
    public void openMain_activity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

    public void openListelenenBolumler(){
        Intent intent = new Intent (this, listelenen_bolumler.class);
        startActivity(intent);

    }

}