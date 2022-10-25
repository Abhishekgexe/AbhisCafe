package com.example.abhiscafe;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainNavHeader extends AppCompatActivity {

    private TextView useremail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);

        useremail=findViewById(R.id.loggedinuseremail);
        useremail.setText("abhishekgajare25@gmail.com");


}}
