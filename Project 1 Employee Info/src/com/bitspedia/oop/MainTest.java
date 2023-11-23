package com.bitspedia.oop;

import java.util.Scanner;
import java.util.ArrayList;

public class MainTest 
{
    
    public static void main(String[] args) 
    {
        ArrayList<Department> Department = new ArrayList<>(); 
        
        InsertData(Department);
        displaydata(Department);
    }
    public static void InsertData(ArrayList<Department> Department /*,String EmployeeStatus*/)
    {
      
        ///Department dep = new Department();
       //// Employee emp = new Employee();
        Scanner inputint = new Scanner(System.in);
        Scanner inputstring = new Scanner(System.in);
        System.out.println("Enter number of departments:");
        int noOfDepartments = inputint.nextInt();
        
        inputstring.nextLine();
        
        for(int i=0;i<noOfDepartments;i++)
        {
             System.out.println("enter employee id ");
        String empid = inputstring.nextLine();
        
        System.out.println("enter the employee name ");
        String empname = inputstring.nextLine();
        
            System.out.println("enter the empoyee status ");
            String statuses = inputstring.nextLine();
            
            switch(statuses)
            {
                case "PermanentEmployee":
                    System.out.println("permanent emplyee ");
                    break;
                    
                case "VisitingEmployee":
                    System.out.println(" Visiting Employee ");
                    break;
            }
            
         Employee emp1 = new Employee(empid,empname);
        
        System.out.println("enter the department name");
        String depname = inputstring.nextLine();
        
        Department dep1 = new Department(depname,emp1);
        
            Department.add(dep1);
        }
    }
    
    public static void deletedata()
    {
         ArrayList<Department> Department = new ArrayList<>();
        Scanner intscan = new Scanner(System.in);
        System.out.println("enter the index of student yu want to delete ");
        int index = intscan.nextInt();
        
        if(index < Department.size())
        {
            System.out.println("student removed");
            Department.remove(index);
        }
        
        else if(index > Department.size())
        {
             System.out.println("student not removed");
        }
    }
    
    public static void updatedata()
    {
         ArrayList<Department> Department = new ArrayList<>();
                ///Department dep = new Department();
       //// Employee emp = new Employee();
        Scanner inputint = new Scanner(System.in);
        Scanner inputstring = new Scanner(System.in);
        System.out.println("Enter number of departments:");
        int noOfDepartments = inputint.nextInt();
        
        inputstring.nextLine();
        
        for(int i=0;i<noOfDepartments;i++)
        {
             System.out.println("enter employee id ");
        String empid = inputstring.nextLine();
        
        System.out.println("enter the employee name ");
        String empname = inputstring.nextLine();
        
            System.out.println("enter the empoyee status ");
            String statuses = inputstring.nextLine();
            
            switch(statuses)
            {
                case "PermanentEmployee":
                    System.out.println("permanent emplyee ");
                    break;
                    
                case "VisitingEmployee":
                    System.out.println(" Visiting Employee ");
                    break;
            }
            
         Employee emp1 = new Employee(empid,empname);
        
        System.out.println("enter the department name");
        String depname = inputstring.nextLine();
        
        Department dep1 = new Department(depname,emp1);
        
            Department.add(dep1);
        }
    }
    
    public static void displaydata(ArrayList<Department> Department)
    {
        /// InsertData();
       
        for(Department deepa : Department) 
        {
            System.out.println(deepa.getDepEmployees().getEmpName()  + " " + deepa.getDepEmployees().getEmpID() + " ");
        }
        
        System.out.println( );
    }  
}
    

