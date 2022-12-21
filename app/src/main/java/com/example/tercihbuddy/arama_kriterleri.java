/*
Author: Mustafa Can Ince
 */
package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class arama_kriterleri extends AppCompatActivity {

    private Button bolumlerigoster_aramakriterleri_button;
    private Button alanbolum_ana_menu_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arama_kriterleri);

        bolumlerigoster_aramakriterleri_button = (Button) findViewById(R.id.bolumlerigoster_aramakriterleri_button);
        alanbolum_ana_menu_button = (Button) findViewById(R.id.alanbolum_ana_menu_button);
        bolumlerigoster_aramakriterleri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bolumlerigoster_aramakriterleri_activitystart();
            }
        });
        alanbolum_ana_menu_button.setOnClickListener(new View.OnClickListener() {
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

    public void bolumlerigoster_aramakriterleri_activitystart(){
        Intent intent = new Intent(this, listelenen_bolumler.class);
        startActivity(intent);
    }
}