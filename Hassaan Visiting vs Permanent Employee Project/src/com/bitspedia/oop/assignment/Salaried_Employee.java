
package com.bitspedia.oop.assignment;

public class Salaried_Employee extends Employee
{
    private double weekly_salary;

    public Salaried_Employee(String firstname, String lastname,String social_security_number, double weekly_salary) {
        super(firstname, lastname, social_security_number);
        this.weekly_salary = weekly_salary;
    }

    public double getWeekly_salary() {
        return weekly_salary;
    }

    public void setWeekly_salary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }

    @Override
    public double earnings() {
        
        return weekly_salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Salaried_Employee{" + "weekly_salary=" + weekly_salary + '}';
    }   
}
