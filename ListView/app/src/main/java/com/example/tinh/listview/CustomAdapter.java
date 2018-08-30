package com.example.tinh.listview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tinh on 28/08/2018.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private Activity context;
    private int resource;
    private List<String> ds;

    public CustomAdapter(@NonNull Activity context, int resource, @NonNull List<String> ds) {
        super(context, resource, ds);
        this.context=context;
        this.resource=resource;
        this.ds=ds;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = context.getLayoutInflater().inflate(resource, null);
        TextView txt = v.findViewById(R.id.txtDulieu);
        txt.setText(ds.get(position));
        return v;
    }
}
