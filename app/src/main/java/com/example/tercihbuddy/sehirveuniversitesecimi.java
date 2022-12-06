package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sehirveuniversitesecimi extends AppCompatActivity {

    private Button bölumlerigoster_sehiruni_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        bölumlerigoster_sehiruni_button = (Button) findViewById(R.id.bölumlerigoster_sehiruni_button);

        bölumlerigoster_sehiruni_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bölumlerigoster_sehiruni_activitystart();
            }
        });
    }

    public void bölumlerigoster_sehiruni_activitystart(){
        Intent intent = new Intent(this, listelenen_bolumler.class);
        startActivity(intent);
    }
}