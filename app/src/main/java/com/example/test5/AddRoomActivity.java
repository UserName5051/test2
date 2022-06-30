package com.example.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toolbar;

import com.example.test5.Controller.AddRoomAdapter;
import com.example.test5.Model.AddRoomElement;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class AddRoomActivity extends AppCompatActivity {

    private Button savebtn;
    private MaterialToolbar materialToolbar;
    private GridView gridView;

    AddRoomAdapter addRoomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);

        gridView = findViewById(R.id.addroom_gridview);


        int[] icon = {R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground};

        String[] roomName = {"Kitchen", "BedRoom", "BatchRoom", "Office", "LivingRoom", "TV Room",
                "Garage", "Toilet", "Office"};

        ArrayList<AddRoomElement> addRoomElementArrayList = new ArrayList<>();
        for (int i= 0; i<icon.length; i++){
            AddRoomElement addRoomElement = new AddRoomElement(icon[i], roomName[i]);
            addRoomElementArrayList.add(addRoomElement);
        }

        addRoomAdapter = new AddRoomAdapter(this, addRoomElementArrayList);
        gridView.setAdapter(addRoomAdapter);

        materialToolbar = findViewById(R.id.addroom_toolbar);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        savebtn = findViewById(R.id.addroom_save);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}