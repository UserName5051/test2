package com.example.test5.Controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.test5.Model.Room;
import com.example.test5.R;

import java.util.ArrayList;

public class HomeAdapter extends ArrayAdapter<Room> {

    public HomeAdapter(@NonNull Context context, ArrayList<Room> roomArrayList) {
        super(context, R.layout.listitem_home, roomArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Room room = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_home, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.lh_image);
        TextView textView = convertView.findViewById(R.id.lh_roomname);
        TextView devices = convertView.findViewById(R.id.lh_numdevices);

        imageView.setImageResource(room.icon);
        textView.setText(room.roomName);
        devices.setText(room.numDevices);
        return convertView;
    }
}
