package com.xinx.databind;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private final ViewDataBinding binding;

    public MyViewHolder(@NonNull ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Object o) {
        binding.setVariable(BR.itemUser, o);
        binding.executePendingBindings();
    }
}
