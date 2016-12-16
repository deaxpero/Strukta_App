package com.example.slawek.struktaapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * Created by Slawek on 10/12/2016.
 */

public class HomeViewPagerAdapter extends PagerAdapter {

    private int[] images = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3};
    private Context context;
    private LayoutInflater layoutInflater;

    HomeViewPagerAdapter(Context context)
    {
        this.context = context;

    }
    @Override
    public Object instantiateItem(ViewGroup collection , int position)
    {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_swipe_layout,collection,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.swipe_image);
        imageView.setImageResource(images[position]);
        collection.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view)
    {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return (view == object);
    }

    @Override
    public void destroyItem(View collection , int position , Object object)
    {

    }

}
