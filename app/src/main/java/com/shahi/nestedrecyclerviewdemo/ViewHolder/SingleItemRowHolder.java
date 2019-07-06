package com.shahi.nestedrecyclerviewdemo.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahi.nestedrecyclerviewdemo.R;

public class SingleItemRowHolder extends RecyclerView.ViewHolder {

    public TextView tvTitle;

    public ImageView itemImage;

    public SingleItemRowHolder(@NonNull View itemView) {
        super(itemView);

        this.tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        this.itemImage = (ImageView) itemView.findViewById(R.id.itemImage);


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
