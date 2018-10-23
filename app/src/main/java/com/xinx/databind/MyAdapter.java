package com.xinx.databind;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.xinx.databind.databinding.ViewUserBinding;

import java.util.List;

public class MyAdapter<T> extends RecyclerView.Adapter<MyViewHolder> {


    private List<T> datas;

    public MyAdapter(List<T> datas) {
        this.datas = datas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ViewUserBinding binding = ViewUserBinding.inflate(inflater, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        T t = datas.get(position);
        holder.bind(t);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
