
package com.bitspedia.oop.assignment;


public class BasePlus_Comission_Employee extends Comission_Employee
{
    private double base_salary;

    public BasePlus_Comission_Employee(String firstname, String lastname, String social_security_number, double gross_sales, double comission_rate,double base_salary) 
    {
        super(firstname, lastname, social_security_number, gross_sales, comission_rate);
        this.base_salary = base_salary;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }
    
    @Override
    public double earnings() {
        double earn;
        
        earn = ((getComission_rate() * getGross_sales()) + getBase_salary());
        
        return earn;
    }

    @Override
    public String toString() {
        return super.toString() + "BasePlus_Comission_Employee{" + "base_salary=" + base_salary + '}';
    }
}
