
package com.bitspedia.oop;

public class Department 
{
    private String depName;
    private Employee depEmployees;

    public Department(String depName, Employee depEmployees) 
    {
        this.depName = depName;
        this.depEmployees = depEmployees;
    }

    Department() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepName() 
    {
        return depName;
    }

    public void setDepName(String depName) 
    {
        this.depName = depName;
    }

    public Employee getDepEmployees() 
    {
        return depEmployees;
    }

    public void setDepEmployees(Employee depEmployees) 
    {
        this.depEmployees = depEmployees;
    }
}
