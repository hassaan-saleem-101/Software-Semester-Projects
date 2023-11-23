
package com.bitspedia.oop.assignment;

public class Hourly_Employee extends Employee
{
    private double hourly_wage;
    private double hours_worked;

    public Hourly_Employee(String firstname, String lastname, String social_security_number, double hourly_wage, double hours_worked) {
        super(firstname, lastname, social_security_number);
        this.hourly_wage = hourly_wage;
        this.hours_worked = hours_worked;
    }
    
    public double getHourly_wage() {
        return hourly_wage;
    }

    public void setHourly_wage(double hourly_wage) {
        this.hourly_wage = hourly_wage;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

   @Override
    public double earnings() 
    {
        double amount = 0;
        
        if(hours_worked > 0 && hours_worked <= 40)
        {
            amount = hourly_wage * hours_worked;
            return amount;
        }
        
         if(hours_worked > 40)
        {
            amount = (40 * hourly_wage) + (hours_worked - 40) * (hourly_wage * 1.5);
            
            return amount;
        }
         
        return amount;
    }
   
    @Override
    public String toString() {
        return super.toString() + "Hourly_Employee{" + "hourly_wage=" + hourly_wage + ", hours_worked=" + hours_worked + '}';
    }
}
