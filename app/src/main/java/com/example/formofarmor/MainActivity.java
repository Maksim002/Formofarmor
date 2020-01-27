package com.example.formofarmor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private Button button;
    ArrayList<PersonModel> list = new ArrayList<>();
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bottomAdd);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter = new Adapter(list,window));
        recyclerView.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);

        button.setOnClickListener(v ->
                adapter.setRetData(getList(adapter.getRetData())));
    }

    public ArrayList<PersonModel> getList(ArrayList<PersonModel> list) {
        list.add(new PersonModel(1, "", ""));
        return list;
    }
}
