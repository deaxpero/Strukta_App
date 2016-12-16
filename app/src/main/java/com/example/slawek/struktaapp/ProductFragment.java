package com.example.slawek.struktaapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ProductFragment extends Fragment{

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        view = inflater.inflate(R.layout.fragment_product_layout,container,false);

        List<ProductGroup> productGroups = new ArrayList<>();

        ProductGroup gruop1 = new ProductGroup("GROUNDWORKS AND DRAINAGE",R.drawable.image);
        ProductGroup group2 = new ProductGroup("BUILDING MATERIALS",R.drawable.hassin);
        ProductGroup group3 = new ProductGroup("CHEMICALS AND ADHESIVES" , R.drawable.stablin);
        ProductGroup group4 = new ProductGroup("LINTEL AND METALWORK", R.drawable.stablin);
        ProductGroup gruop5 = new ProductGroup("ROOFING AND GUTTERING",R.drawable.image);
        ProductGroup group6 = new ProductGroup("SITE SUPPLIES AND SAFETY",R.drawable.hassin);
        ProductGroup group7 = new ProductGroup("NAILS,SCREWS AND FIXING" , R.drawable.stablin);
        ProductGroup group8 = new ProductGroup("TOOLS , DECORATING AND FINISHING", R.drawable.stablin);


        productGroups.add(gruop1);
        productGroups.add(group2);
        productGroups.add(group3);
        productGroups.add(group4);
        productGroups.add(gruop5);
        productGroups.add(group6);
        productGroups.add(group7);
        productGroups.add(group8);

        recyclerView = (RecyclerView) view.findViewById(R.id.products_recycler_view);
        recyclerView.setHasFixedSize(true);
        //layoutManager = new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false);
        layoutManager = new GridLayoutManager(this.getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ProductGroupAdapter(productGroups);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
