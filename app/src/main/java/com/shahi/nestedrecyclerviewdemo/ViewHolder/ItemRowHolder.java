package com.shahi.nestedrecyclerviewdemo.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahi.nestedrecyclerviewdemo.R;

public class ItemRowHolder extends RecyclerView.ViewHolder {

    public TextView itemTitle;

    public RecyclerView recycler_view_list;

    public Button btnMore;

    public ItemRowHolder(@NonNull View itemView) {
        super(itemView);
        this.itemTitle = (TextView) itemView.findViewById(R.id.itemTitle);
        this.recycler_view_list = (RecyclerView) itemView.findViewById(R.id.recycler_view_list);
        this.btnMore= (Button) itemView.findViewById(R.id.btnMore);
    }
}
