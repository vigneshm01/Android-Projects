package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText un;
    EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginuser(View view){
        un = findViewById(R.id.un);
        pwd =findViewById(R.id.pwd);
        int n=0;
        if (un.getText().toString().isEmpty() || pwd.getText().toString().isEmpty() ) {
            Toast.makeText(getApplicationContext(),"Please Fill All the Details", Toast.LENGTH_SHORT).show();
            n++;
        }
        if (n == 0){
            String name = un.getText().toString();
            String pass = pwd.getText().toString();
            DBHandler dbHandler = new DBHandler(login.this);
            boolean val = dbHandler.checkuser(name,pass);
            System.out.println(val);
        }
    }
}