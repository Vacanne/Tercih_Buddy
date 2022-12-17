package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login_button;
    private TextView login_register;
    private EditText login_username, login_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_button = (Button) findViewById(R.id.login_button) ;
        login_register = (TextView) findViewById(R.id.txt_dont_have_account);
        login_register.setOnClickListener(this);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainAc();
            }
        });


    }

    public void openMainAc(){
        Intent intent = new Intent (this, MainActivity2.class);
        startActivity(intent);

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txt_dont_have_account:
                startActivity(new Intent(this, register.class));
        }
    }
}