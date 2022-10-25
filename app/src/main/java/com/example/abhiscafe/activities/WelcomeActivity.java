package com.example.abhiscafe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.abhiscafe.MainActivity;
import com.example.abhiscafe.R;
import com.google.firebase.auth.FirebaseAuth;


public class WelcomeActivity extends AppCompatActivity {
    //    Button b1;
//    TextView t1;
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome);
//        getSupportActionBar().hide();
//
//        b1=findViewById(R.id.W1);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(WelcomeActivity.this, "", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(WelcomeActivity.this, RegistrationActivity.class);
//                startActivity(intent);
//            }
//        });
//        t1=findViewById(R.id.w2);
//        t1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(WelcomeActivity.this, "", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//
//    public void mainActivity(View view) {
//
//    }
//}
    private Button Register;
    private TextView SignIn;
    private FirebaseAuth firebaseAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
        Register = findViewById(R.id.W1);
        SignIn = findViewById(R.id.textView3);
        getSupportActionBar().hide();
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WelcomeActivity.this, "Abhi welcomes you to his cafe", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(WelcomeActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WelcomeActivity.this, "Please Sign In", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

}
