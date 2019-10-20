package com;

class Valuation
{
    //variable declarations
    private long normalQuantity;
    private int valuationNumber;
    private String valuationDescription;
    private long quantityIncrease;
    private String workInformation;
    private long extraWorks;
    //end of variable declarations

    //main constructor
    public Valuation(long normalQuantity,
                     int valuationNumber,
                     String valuationDescription,
                     long quantityIncrease,
                     String workInformation,
                     long extraWorks)
    {
        this.normalQuantity = normalQuantity;
        this.valuationNumber = valuationNumber;
        this.valuationDescription = valuationDescription;
        this.quantityIncrease = quantityIncrease;
        this.workInformation = workInformation;
        this.extraWorks =extraWorks;
    }

    //getters&setters
    public long getNormalQuantity()
    {
        return normalQuantity;
    }

    public void setNormalQuantity(long normalQuantity)
    {
        this.normalQuantity = normalQuantity;
    }

    public int getValuationNumber()
    {
        return valuationNumber;
    }

    public void setValuationNumber(int valuationNumber)
    {
        this.valuationNumber = valuationNumber;
    }

    public String getValuationDescription()
    {
        return valuationDescription;
    }

    public void setValuationDescription(String valuationDescription)
    {
        this.valuationDescription = valuationDescription;
    }

    public long getQuantityIncrease()
    {
        return quantityIncrease;
    }

    public void setQuantityIncrease(long quantityIncrease)
    {
        this.quantityIncrease = quantityIncrease;
    }

    public String getWorkInformation()
    {
        return workInformation;
    }

    public void setWorkInformation(String workInformation)
    {
        this.workInformation = workInformation;
    }

    public long getExtraWorks()
    {
        return extraWorks;
    }

    public void setExtraWorks(long extraWorks)
    {
        this.extraWorks = extraWorks;
    }
}
