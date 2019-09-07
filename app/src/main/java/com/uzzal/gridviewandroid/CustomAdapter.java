package com.uzzal.gridviewandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {



     Context context;
     int[] images;
     String[] programmingName;
     private LayoutInflater inflater;

    public CustomAdapter(Context context,String[] programmingName, int[] images) {
        this.context = context;
        this.programmingName = programmingName;
        this.images = images;
    }

    @Override
    public int getCount() {
        return programmingName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_layout,parent,false);
        }
        ImageView iv =  convertView.findViewById(R.id.imageView);
        TextView tv = convertView.findViewById(R.id.textView);

        iv.setImageResource(images[position]);
        tv.setText(programmingName[position]);
        return convertView;
    }
}
