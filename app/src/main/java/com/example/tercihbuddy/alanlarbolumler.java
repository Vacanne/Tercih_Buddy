package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alanlarbolumler extends AppCompatActivity {

    private Button bolumlerigoster_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alanlarbolumler);

        bolumlerigoster_button = (Button) findViewById(R.id.bolumlerigoster_button);

        bolumlerigoster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlistelenen_bolumler();
            }
        });
    }
    public void openlistelenen_bolumler(){
        Intent intent = new Intent (this, listelenen_bolumler.class);
        startActivity(intent);
    }
}