package com.example.foodorder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class first extends Fragment {


    ListView l;
    String[] Menu = new String[] {
            "Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb",
            "Ice Cream SandWich","Jelly Bean","KitKat" };

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        // Inflate the layout for this fragment
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1,Menu);
         l= view.findViewById(R.id.menu);
         l.setAdapter(adapter);
        return view;
    }
}