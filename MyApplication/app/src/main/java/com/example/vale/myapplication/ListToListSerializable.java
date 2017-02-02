package com.example.vale.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListToListSerializable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_to_list_serializable);

        ListView lv = (ListView)findViewById(R.id.lista);
        lv.setAdapter(new MyListAdapter(this));

    }
}
