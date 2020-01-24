package com.example.formofarmor;


import androidx.recyclerview.widget.DiffUtil;

import java.util.List;

public class ListItemDiffCallback extends DiffUtil.Callback {
    private List<PersonModel> oldList, newList;

    public ListItemDiffCallback(List<PersonModel> oldList, List<PersonModel> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }
}
