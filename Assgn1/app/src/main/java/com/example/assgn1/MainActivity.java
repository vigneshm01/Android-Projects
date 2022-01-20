package com.example.assgn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {


    CheckBox conditions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conditions = (CheckBox) findViewById(R.id.checkBox2);
    }

    public void register(View view){
        if(conditions.isChecked()){
            Intent i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"Agree to terms and conditions",Toast.LENGTH_LONG).show();
        }

    }

}