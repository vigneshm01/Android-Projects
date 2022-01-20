package com.example.eval3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] name;
    private final String[] price;

    public ListAdapter(Activity context, String[] name,String[] price) {
        super(context, R.layout.list, name);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.name=name;
        this.price=price;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(name[position]);
        subtitleText.setText(price[position]);

        return rowView;

    };
}
