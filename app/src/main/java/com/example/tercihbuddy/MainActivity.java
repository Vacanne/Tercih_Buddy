package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button tercihlistem_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tercihlistem_button =(Button) findViewById(R.id.tercih_listem);
        tercihlistem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent (this, Tercih_Listem.class);
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