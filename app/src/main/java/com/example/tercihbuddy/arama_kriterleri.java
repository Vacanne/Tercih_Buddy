package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class arama_kriterleri extends AppCompatActivity {

    private Button bölumlerigoster_aramakriterleri_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arama_kriterleri);

        bölumlerigoster_aramakriterleri_button = (Button) findViewById(R.id.bolumlerigoster_aramakriterleri_button);

        bölumlerigoster_aramakriterleri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bolumlerigoster_aramakriterleri_activitystart();
            }
        });

    }
    public void bolumlerigoster_aramakriterleri_activitystart(){
        Intent intent = new Intent(this, listelenen_bolumler.class);
        startActivity(intent);
    }
}