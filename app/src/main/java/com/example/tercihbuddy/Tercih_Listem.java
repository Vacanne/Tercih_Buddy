package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tercih_Listem extends AppCompatActivity {

    private Button anamenu_button;
    private Button tercihlistemdenkaldir_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercih_listem);

        anamenu_button = (Button) findViewById(R.id.ana_menü);
        tercihlistemdenkaldir_button    = (Button) findViewById(R.id.tercih_listemden_kaldır);

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