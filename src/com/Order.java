package com;

import java.util.ArrayList;

public class Order
{
    //variable declarations
 private String orderDescription;
 private String contractorName;
 private String contractorPhone;
 private String contractorAddress;
 private String workName;
 private String residentEngineerName;
 private int contractNumber;
 private ArrayList<Valuation> valuations = new ArrayList<>();
 private int contractAmount;
 private Boolean advancePayment;
 private long advancePaymentAmount;
 private int iva;
 private int subtotal;
 private int total;

 protected ArrayList<Order> orders = new ArrayList<>();
    //end of variable declarations

    //main constructor
    public Order(String orderDescription,
                 String contractorName,
                 String contractorPhone,
                 String contractorAddress,
                 String workName,
                 String residentEngineerName,
                 int contractNumber,
                 int contractAmount,
                 Boolean advancePayment,
                 long advancePaymentAmount,
                 int iva,
                 int subtotal,
                 int total)
    {
        this.orderDescription = orderDescription;
        this.contractorName = contractorName;
        this.contractorPhone = contractorPhone;
        this.contractorAddress = contractorAddress;
        this.workName = workName;
        this.residentEngineerName = residentEngineerName;
        this.contractNumber = contractNumber;
        this.contractAmount = contractAmount;
        this.advancePayment = advancePayment;
        this.advancePaymentAmount = advancePaymentAmount;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    //Getters & Setters
    public String getOrderDescription()
    {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription)
    {
        this.orderDescription = orderDescription;
    }

    public String getContractorName()
    {
        return contractorName;
    }

    public void setContractorName(String contractorName)
    {
        this.contractorName = contractorName;
    }

    public String getContractorPhone()
    {
        return contractorPhone;
    }

    public void setContractorPhone(String contractorPhone)
    {
        this.contractorPhone = contractorPhone;
    }

    public String getContractorAddress()
    {
        return contractorAddress;
    }

    public void setContractorAddress(String contractorAddress)
    {
        this.contractorAddress = contractorAddress;
    }

    public String getWorkName()
    {
        return workName;
    }

    public void setWorkName(String workName)
    {
        this.workName = workName;
    }

    public String getResidentEngineerName()
    {
        return residentEngineerName;
    }

    public void setResidentEngineerName(String residentEngineerName) {
        this.residentEngineerName = residentEngineerName;
    }

    public int getContractNumber()
    {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber)
    {
        this.contractNumber = contractNumber;
    }

    public ArrayList<Valuation> getValuations()
    {
        return valuations;
    }

    public void setValuations(ArrayList<Valuation> valuations)
    {
        this.valuations = valuations;
    }

    public int getContractAmount()
    {
        return contractAmount;
    }

    public void setContractAmount(int contractAmount)
    {
        this.contractAmount = contractAmount;
    }

    public Boolean getAdvancePayment()
    {
        return advancePayment;
    }

    public void setAdvancePayment(Boolean advancePayment)
    {
        this.advancePayment = advancePayment;
    }

    public long getAdvancePaymentAmount()
    {
        return advancePaymentAmount;
    }

    public void setAdvancePaymentAmount(long advancePaymentAmount)
    {
        this.advancePaymentAmount = advancePaymentAmount;
    }

    public int getIva()
    {
        return iva;
    }

    public void setIva(int iva)
    {
        this.iva = iva;
    }

    public int getSubtotal()
    {
        return subtotal;
    }

    public void setSubtotal(int subtotal)
    {
        this.subtotal = subtotal;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }
}
