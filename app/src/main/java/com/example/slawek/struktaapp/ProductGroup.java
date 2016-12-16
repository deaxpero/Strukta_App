package com.example.slawek.struktaapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Slawek on 11/12/2016.
 */

public class ProductGroup
{
    private String name;
    private int image;


    public ProductGroup(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName()
    {
        return  name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage()
    {
        return image;
    }

}
