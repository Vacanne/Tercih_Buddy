package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listelenen_bolumler extends AppCompatActivity {

    private Button tercihlistemeekle_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listelenen_bolumler);

        tercihlistemeekle_button        = (Button) findViewById(R.id.tercih_listeme_ekle_button);

       /* tercihlistemeekle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });*/
    }

    /*public void openlistelenen_bolumler(){
        Intent intent = new Intent (this, listelenen_bolumler.class);
        startActivity(intent);
    }*/

}