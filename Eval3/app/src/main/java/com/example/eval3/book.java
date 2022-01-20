package com.example.eval3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class book extends AppCompatActivity {

    ListView list;

    String[] name ={
            "tomato","brinjal",
            "carrot","potato",
    };

    String[] price ={
            "Rs.40", "Rs.30", "Rs.60","Rs.15",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ListAdapter adapter = new ListAdapter(this, name , price);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }



}