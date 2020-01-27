package com.example.formofarmor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<RViewHolder> {

    private ArrayList<PersonModel> retData;

    public ArrayList<PersonModel> getRetData() {
        return retData;
    }

    public void setRetData(ArrayList<PersonModel> retData) {
        this.retData = retData;
        notifyDataSetChanged();
    }

    public Adapter(ArrayList<PersonModel> retData, Window window) {
        this.retData = retData;
    }

    @NonNull
    @Override
    public RViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new RViewHolder(view, retData);
    }

    @Override
    public void onBindViewHolder(@NonNull RViewHolder holder, int position) {
        holder.bind(retData.get(position),position);
    }

    @Override
    public int getItemCount() {
        return retData.size();
    }

    public List<PersonModel> getRetData(ArrayList<PersonModel> list) {
        this.retData = list;
        notifyDataSetChanged();
        return retData;
    }
}
