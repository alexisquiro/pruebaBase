package com;

import java.util.ArrayList;

public class Products
{
    //variable declarations
    public ArrayList<Product> consumableProductList = new ArrayList<>();
    public ArrayList<Product> nonConsumableProductList = new ArrayList<>();
    //end of variable declarations


    //Getters&Setters
    public ArrayList<Product> getConsumableProductList()
    {
        return consumableProductList;
    }

    public void setConsumableProductList(ArrayList<Product> consumableProductList)
    {
        this.consumableProductList = consumableProductList;
    }

    public ArrayList<Product> getNonConsumableProductList()
    {
        return nonConsumableProductList;
    }

    public void setNonConsumableProductList(ArrayList<Product> nonConsumableProductList)
    {
        this.nonConsumableProductList = nonConsumableProductList;
    }
}
