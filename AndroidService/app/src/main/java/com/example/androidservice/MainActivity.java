package com.example.androidservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1 = root.findViewById(R.id.t1);
    TextView text2 = root.findViewById(R.id.t2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        text1.setText("started playing");
    }
    public void stop (View v){
        text2.setText("stoped playing");
    }

}