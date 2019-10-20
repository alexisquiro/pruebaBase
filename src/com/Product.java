package com;

public class Product
{
    //variable declarations
    protected String productName;
    protected String productDescription;
    protected String productCode;
    protected long productPrice;
    protected int quantity;
    //end of varaible declarations

    //main constructor
    public Product(String productName,
                   String productDescription,
                   String productCode,
                   long productPrice,
                   int quantity)
    {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    //getters&setters
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductDescription()
    {
        return productDescription;
    }

    public void setProductDescription(String productDescription)
    {
        this.productDescription = productDescription;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public long getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(long productPrice)
    {
        this.productPrice = productPrice;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
