package com.example.formofarmor;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RViewHolder extends RecyclerView.ViewHolder {
    private EditText name, password;
    private List<PersonModel> list;

    public RViewHolder(@NonNull View itemView, List<PersonModel> list ) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        password = itemView.findViewById(R.id.password);
        this.list = list;

    }

    public void bind(PersonModel model, int position) {
        name.setText(model.getName());

        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    model.setName(name.getText().toString());
                }
            }
        });

        password.setText(model.getFriendsCount());
        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    model.setName(password.getText().toString());
                }
            }
        });
    }
}

