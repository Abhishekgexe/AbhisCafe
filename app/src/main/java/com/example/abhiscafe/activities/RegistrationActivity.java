package com.example.abhiscafe.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abhiscafe.MainActivity;
import com.example.abhiscafe.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
//    EditText mEmail, mPassword, mName;
//    Button mRegistration;
//    FirebaseAuth fAuth;
//    ProgressBar progressBar;

    private EditText name;
    private EditText email;
    private EditText password;
    private Button register;

    private FirebaseAuth auth;




//
    private TextView SignIn;
    private Button Register;


    public RegistrationActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();


//        mName=findViewById(R.id.editText2);
//        mEmail=findViewById(R.id.editText3);
//        mPassword=findViewById(R.id.editText);
//        fAuth=FirebaseAuth.getInstance();
//        progressBar=findViewById(R.id.progressBar);
//        mRegistration=findViewById(R.id.registration);


        setContentView(R.layout.activity_registration);

        name=findViewById(R.id.editText2);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        register=findViewById(R.id.registration);


        auth=FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    Toast.makeText(RegistrationActivity.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
                } else if (txt_password.length() < 6 ){
                    Toast.makeText(RegistrationActivity.this, "Password too Short!", Toast.LENGTH_SHORT).show();
                }else{
                    registerUser(txt_email,txt_password);
                    
                }
            }
        });

        SignIn = findViewById(R.id.textView7);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegistrationActivity.this, "Please Sign In", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        });

    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(RegistrationActivity.this , new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(RegistrationActivity.this, "Registered Successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(RegistrationActivity.this, LoginActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(RegistrationActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    public void mainActivity(View view) {
//        Toast.makeText(RegistrationActivity.this, "Abhi welcomes you to his cafe", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
//        startActivity(intent);

    }



