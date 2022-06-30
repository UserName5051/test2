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

import com.example.test5.Model.AddRoomElement;
import com.example.test5.R;

import java.util.ArrayList;

public class AddRoomAdapter extends ArrayAdapter<AddRoomElement> {

    public AddRoomAdapter(@NonNull Context context, ArrayList<AddRoomElement> addRoomElementArrayList) {
        super(context, R.layout.listitem_addroom, addRoomElementArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AddRoomElement addRoomElement = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_addroom, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.la_image);
        TextView textView = convertView.findViewById(R.id.la_text);

        imageView.setImageResource(addRoomElement.icon);
        textView.setText(addRoomElement.roomName);

        return convertView;
    }
}
