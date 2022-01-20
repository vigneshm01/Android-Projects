package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redirect(View v){
        Intent i = new Intent(this, menu.class);
        EditText username = (EditText) findViewById(R.id.username);
        EditText phone = (EditText) findViewById(R.id.phone);
        String un = username.getText().toString();
        String ph = phone.getText().toString();
        i.putExtra("un",un);
        i.putExtra("ph",ph);
        startActivity(i);
    }
}