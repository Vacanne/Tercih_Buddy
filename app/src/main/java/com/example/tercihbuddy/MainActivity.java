package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button tercihlistem_button;
    private Button aramakriterleri_button;
    private Button alanlarbolumler_button;
    private Button sehirveuniversitesecimi_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sehirveuniversitesecimi_button = findViewById(R.id.sehir_ve_universite_secimi_button);
        tercihlistem_button = findViewById(R.id.tercih_listem);
        aramakriterleri_button = findViewById(R.id.arama_kriterleri_button);
        alanlarbolumler_button = findViewById(R.id.alanlar_bölümler_button);


        sehirveuniversitesecimi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sehirveuniversitesecimi.class);
                startActivity(intent);
            }
        });

        tercihlistem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercihlistemactivityopen();
            }
        });
        aramakriterleri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aramakriterleri_activityyopen();
            }
        });

        alanlarbolumler_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alanlarbolumler_activityopen();
            }
        });
    }

    public void opensehirveuniversitesecimi() {

    }

    public void tercihlistemactivityopen() {
        Intent intent = new Intent(this, Tercih_Listem.class);
        startActivity(intent);
    }

    public void aramakriterleri_activityyopen() {
        Intent intent = new Intent(this, arama_kriterleri.class);
        startActivity(intent);
    }

    public void alanlarbolumler_activityopen() {
        Intent intent = new Intent(this, alanlarbolumler.class);
        startActivity(intent);
    }

  /*  Button yourButton = (Button) findViewById(R.id.tercih_listem);

        yourButton.setOnClickListener(new OnClickListener(){
        public void onClick(View v){
            startActivity(new Intent(MainActivity.this, second.class));
        }
    });
    public void buttonTercihListesi(View view){
        Intent intent_TercihListesi_Button = new Intent(Intent.ACTION_MAIN);

        intent_TercihListesi_Button.addCategory(Intent.CATEGORY_HOME);
        intent_TercihListesi_Button.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent_TercihListesi_Button.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(intent_TercihListesi_Button);
    }*/

}