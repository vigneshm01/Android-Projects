package com.example.eval3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    EditText uname;
    EditText mno;
    EditText email;
    private DBHandler dbHandler;

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

        dbHandler = new DBHandler(register.this);

        String name = uname.getText().toString();
        String mobile = mno.getText().toString();
        String mail = email.getText().toString();

        dbHandler.adduser(name,mobile,mail);
        Toast.makeText(this,"Registered Succesfully",Toast.LENGTH_LONG).show();
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