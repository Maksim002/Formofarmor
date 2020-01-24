package com.example.formofarmor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private Adapter adapter;
    private Button button;
    ArrayList<PersonModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bottomAdd);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter = new Adapter());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setItemList(getList(adapter.getItemList()));

            }
        });
    }

    ArrayList<PersonModel> getList(ArrayList<PersonModel> aaa ) {
        aaa.add(new PersonModel(1,"",""));
        return list;
    }
}
