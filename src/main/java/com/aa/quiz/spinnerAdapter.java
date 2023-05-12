package com.aa.quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class spinnerAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    public spinnerAdapter(LayoutInflater inflater, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = inflater.inflate(R.layout.custom_spinner,null);
        TextView vieww = view1.findViewById(R.id.textView);
        return  view1;
    }
}
