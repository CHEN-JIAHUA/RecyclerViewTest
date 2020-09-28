package com.chenjiahua.recyclerviewtest;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.InnerHolder> {


    private List<String> mStringData;

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_recycler_view_contain, parent, false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        TextView item = holder.itemView.findViewById(R.id.item_string);
        item.setText(mStringData.get(position));
    }

    @Override
    public int getItemCount() {
        return mStringData.size();
    }

    public void setData(List<String> datas) {
        mStringData = new ArrayList<>();
        if (!mStringData.containsAll(datas)) {
            this.mStringData = datas;
        }
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
