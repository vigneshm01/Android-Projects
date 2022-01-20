package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText uname;
    EditText mno;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onClick(View v){
        uname=findViewById(R.id.uname);
        mno=findViewById(R.id.mno);
        email=findViewById(R.id.email);
        SharedPreferences sf=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sf.edit();
        edit.putString("Username",uname.getText().toString());
        edit.putString("Mobile",mno.getText().toString());
        edit.putString("Email",email.getText().toString());
        edit.commit();
    }

    public void users(View view){
        Intent i = new Intent(this, SharedPref.class);
        startActivity(i);
    }

    public void login(View v){
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}