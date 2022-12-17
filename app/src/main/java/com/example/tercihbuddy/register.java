package com.example.tercihbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {
    private TextView register_button;
    private EditText register_username, register_phone, register_email, register_password, register_password_confirm;
    private Button have_account ;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        //register_button = (TextView) findViewById(R.id.register_button);

        //register_button.setOnClickListener(( View.OnClickListener) this);




        have_account = (Button) findViewById(R.id.txt_have_account);
        register_username = (EditText) findViewById(R.id.register_username);
        register_phone = (EditText) findViewById(R.id.register_phone);
        register_email = (EditText) findViewById(R.id.register_email);
        register_password = (EditText) findViewById(R.id.register_Password);
        register_password_confirm = (EditText) findViewById(R.id.register_confirmPassword);



        have_account.setOnClickListener(new View.OnClickListener() {
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

    private void registerUser(){
        String email = register_email.getText().toString().trim();
        String password = register_password.getText().toString().trim();
        String password_confirm = register_password_confirm.getText().toString().trim();
        String phone_number = register_phone.getText().toString().trim();
        String username = register_username.getText().toString().trim();

        if (username.isEmpty()){
            register_username.setError("User name is required!");
            register_username.requestFocus();
            return;
        }
        if (password.isEmpty()){
            register_password.setError("Password is required!");
            register_password.requestFocus();
            return;
        }
        if (password.length() < 6){
            register_password.setError("Minimum password length should be 6 characters!");
            register_password.requestFocus();
            return;
        }
        if (password_confirm != password){
            register_password_confirm.setError("Passwords do not match!");
            register_password_confirm.requestFocus();
            return;
        }
        if (phone_number.isEmpty()){
            register_phone.setError("Phone number is required!");
            register_phone.requestFocus();
            return;
        }
        if (email.isEmpty()){
            register_email.setError("Email is required!");
            register_email.requestFocus();
            return;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            register_email.setError("Please provide valid email!");
            register_email.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            User user = new User(username, phone_number, email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {

                                            if (task.isSuccessful()){
                                                Toast.makeText(register.this,"User has been registered successfully!",Toast.LENGTH_LONG).show();

                                                // Redirect to Login layout.
                                            }else{
                                                Toast.makeText(register.this,"Failed to register! Try again!",Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    });
                        }else{
                            Toast.makeText(register.this,"Failed to register! Try again!",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}