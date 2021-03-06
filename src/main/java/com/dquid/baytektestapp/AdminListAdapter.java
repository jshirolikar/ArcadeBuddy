package com.dquid.baytektestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by shobhitg on 2/28/2015.
 */
public class AdminListAdapter extends BaseAdapter {

    Context context;
    AdminModel[] devices;
    private static LayoutInflater inflater = null;

    public AdminListAdapter(Context context, AdminModel[] devices) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.devices = devices;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return devices.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return devices[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.device_item, null);
        TextView text = (TextView) vi.findViewById(R.id.text);
        ImageView imageView = (ImageView) vi.findViewById(R.id.imageView1);

        text.setText(devices[position].getDeviceName());
        Picasso.with(context).load(devices[position].getPhotoUrl()).into(imageView);

        return vi;
    }
}