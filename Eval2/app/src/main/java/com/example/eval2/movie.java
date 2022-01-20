package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class movie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
    }

    public void book(View v){
        Toast toast = Toast.makeText(getApplicationContext(), "Movie Booked", Toast.LENGTH_SHORT);
        toast.show();
    }
}