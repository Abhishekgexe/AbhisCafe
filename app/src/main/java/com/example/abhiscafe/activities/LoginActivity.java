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
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;

    private FirebaseAuth mauth;


    private TextView Register;
  //  private Button Signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



//        Signin=findViewById(R.id.login);
//       Signin.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
//               Intent intent=new Intent(LoginActivity.this, MainActivity.class);
//               startActivity(intent);
//           }
//       });


        email = findViewById(R.id.editText3);
        password = findViewById(R.id.editText);
        login = findViewById(R.id.login);

        mauth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerformLogin();
            }
        });

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String txt_email = email.getText().toString();
//                String txt_password = password.getText().toString();
//                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)) {
//                    Toast.makeText(LoginActivity.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
//                } else if (txt_password.length() < 6) {
//                    Toast.makeText(LoginActivity.this, "Password too Short!", Toast.LENGTH_SHORT).show();
//                } else {
//                    //loginUser(txt_email,txt_password);
//                }
//            }
//        });

        getSupportActionBar().hide();
        Register = findViewById(R.id.textView7);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

    }

    private void PerformLogin() {
        String txt_email = email.getText().toString();
        String txt_password = password.getText().toString();

        if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
            Toast.makeText(LoginActivity.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
        } else if (txt_password.length() < 6 ){
            Toast.makeText(LoginActivity.this, "Password too Short!", Toast.LENGTH_SHORT).show();
        }else{
            mauth.signInWithEmailAndPassword(txt_email,txt_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        sendUserToNextActivity();
                        Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(LoginActivity.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }

                }
            });
           // registerUser(txt_email,txt_password);

        }
    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(LoginActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        
    }
}
//
//    private void loginUser(String email, String password) {
//        mauth.signInWithEmailAndPassword(email , password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//            @Override
//            public void onSuccess(AuthResult authResult) {
//                Toast.makeText(LoginActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
//                Intent intent= (new Intent(LoginActivity.this, MainActivity.class));
//                startActivity(intent);
//                finish();
//            }
//        });
//
//    }

//    public void onStart() {
//        super.onStart();
//        FirebaseUser currentUser = mauth.getCurrentUser();
//        updateUI(currentUser);
//    }
//
//    private void updateUI(FirebaseUser currentUser) {
//        if (currentUser.isEmailVerified()) {
//            Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
//            Intent intent=new Intent(LoginActivity.this, MainActivity.class);
//        }else {
//            Toast.makeText(LoginActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
