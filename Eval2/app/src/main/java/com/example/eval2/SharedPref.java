package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SharedPref extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
    }
    EditText uname;
    EditText mno;
    EditText email;


    public void getval(View v){
        uname=findViewById(R.id.un);
        mno=findViewById(R.id.mn);
        email=findViewById(R.id.em);
        SharedPreferences sf=getSharedPreferences("myfile", Context.MODE_PRIVATE);
        String p=sf.getString("Username","NA");
        String q=sf.getString("Email","NA");
        String r=sf.getString("Mobile","NA");
        uname.setText(p);
        mno.setText(r);
        email.setText(q);
    }
}