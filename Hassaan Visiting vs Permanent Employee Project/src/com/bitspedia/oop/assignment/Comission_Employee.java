
package com.bitspedia.oop.assignment;

public class Comission_Employee extends Employee
{
    private double gross_sales;
    private double comission_rate;

    public Comission_Employee(String firstname, String lastname, String social_security_number, double gross_sales, double comission_rate) {
        super(firstname, lastname, social_security_number);
        this.gross_sales = gross_sales;
        this.comission_rate = comission_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getComission_rate() {
        return comission_rate;
    }

    public void setComission_rate(double comission_rate) {
        this.comission_rate = comission_rate;
    }

    
    @Override
    public double earnings() 
    {
       return (getGross_sales() * getComission_rate());
    }

    @Override
    public String toString() {
        return super.toString() + "Comission_Employee{" + "gross_sales=" + gross_sales + ", comission_rate=" + comission_rate + '}';
    }
}
