package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listelenen_bolumler extends AppCompatActivity {

    private Button tercihlistemeekle_button;
    private Button listbol_ana_menu_button;
    private Button tercih_listem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listelenen_bolumler);

        tercihlistemeekle_button  = (Button) findViewById(R.id.listbol_tercih_listeme_ekle_button);
        listbol_ana_menu_button = (Button) findViewById(R.id.listbol_ana_menu_button);
        tercih_listem = (Button) findViewById(R.id.listbol_tercih_listem_button);

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

    }

    public void openMain_activity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

    public void tercihlistemactivityopen() {
        Intent intent = new Intent(this, Tercih_Listem.class);
        startActivity(intent);
    }
}