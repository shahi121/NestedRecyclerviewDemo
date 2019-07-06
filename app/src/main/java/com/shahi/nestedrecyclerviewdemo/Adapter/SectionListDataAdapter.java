package com.shahi.nestedrecyclerviewdemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahi.nestedrecyclerviewdemo.Model.SingleItemModel;
import com.shahi.nestedrecyclerviewdemo.R;
import com.shahi.nestedrecyclerviewdemo.ViewHolder.SingleItemRowHolder;

import java.util.ArrayList;

public class SectionListDataAdapter extends RecyclerView.Adapter<SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context mContext;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;
    }


    @NonNull
    @Override
    public SingleItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_card, null);
        return new SingleItemRowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SingleItemRowHolder holder, int position) {
        SingleItemModel singleItem = itemsList.get(position);

        holder.tvTitle.setText(singleItem.getName());

    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }
}
