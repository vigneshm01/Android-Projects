package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lv = null;

        ContentResolver cr = getContentResolver();

        Cursor c = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);

        List<Map<String, String>> list = new ArrayList<>();

        HashMap<String,String> map ;



        if (c.moveToFirst()) {

            do {

//                numbers.add(c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));

//                contacts.add(c.getString((c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))));

                map = new HashMap<String, String>();

                map.put("numbers", c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));

                map.put("contacts", c.getString((c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))));

                list.add(map);



            } while (c.moveToNext());

        }

        String [] from = {"contacts", "numbers"};

        int [] to = {android.R.id.text1,

                android.R.id.text2};



        SimpleAdapter ad = new SimpleAdapter(this, list,android.R.layout.simple_list_item_2, from,to);

        lv.setAdapter(ad);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView phonetv=view.findViewById(android.R.id.text2);

                //Toast.makeText(MainActivity.this, contactstv.getText().toString(), Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phonetv.getText().toString()));

                startActivity(intent);

            }

        });
    }
}