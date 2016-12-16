package com.example.slawek.struktaapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Slawek on 11/12/2016.
 */

public class ProductGroupAdapter extends RecyclerView.Adapter<ProductGroupAdapter.ViewHolder> {

    public static  class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public ImageView imageView;


        public ViewHolder(View itemView)
        {
            super(itemView);

           nameTextView = (TextView) itemView.findViewById(R.id.group_name_text);
           imageView =(ImageView) itemView.findViewById(R.id.group_image);
        }
    }

    private List<ProductGroup> productGroups;

    public ProductGroupAdapter(List<ProductGroup> productGroups){
        this.productGroups =  productGroups;
    }

    @Override
    public ProductGroupAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.products_group_card_layout,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ProductGroupAdapter.ViewHolder holder, int position)
    {
        ProductGroup pg =  productGroups.get(position);

        TextView textView = holder.nameTextView;
        textView.setText(pg.getName());

        ImageView imageView = holder.imageView;
        imageView.setImageResource(pg.getImage());

    }

    @Override
    public int getItemCount() {
        return productGroups.size();
    }
}
