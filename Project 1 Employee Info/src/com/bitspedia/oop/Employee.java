
package com.bitspedia.oop;


public class Employee 
{
    private String empID;
    private String empName;

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    enum Status{PermanentEmployee,VisitingEmployee}

    public Employee(String empID, String empName) 
    {
        this.empID = empID;
        this.empName = empName;
    }

    public String getEmpID()
    {
        return empID;
    }

    public void setEmpID(String empID) 
    {
        this.empID = empID;
    }

    public String getEmpName() 
    {
        return empName;
    }

    public void setEmpName(String empName) 
    {
        this.empName = empName;
    }
}
