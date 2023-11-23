//
//package com.bitspedia.oop.assignment;
//
//import java.util.Scanner;
//
//public class EmployeeTest {
//
//    public static void main(String[] args) 
//    {
//        Scanner int_scan = new Scanner(System.in);
//        Scanner string_scan = new Scanner(System.in);
//        
//        System.out.println("enter the elements you want to store ");
//        int elements = int_scan.nextInt();
//        
//        Employee [] employee = new Employee [elements];
//        
//        for (int i = 0; i < employee.length; i++) 
//        {
//            System.out.println("enter 1 for salaried employee // 2 for hourly employee // 3 comission employee // 4 for base plus comission employee // "
//                    + "enter 5 for piece worker ");
//            
//            int choice = int_scan.nextInt();
//            
//            System.out.print("\n");
//            
//            if (choice == 1)
//            {
//                System.out.println("print information of salaried employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of salaried employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of salaried employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of salaried employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the  the weekly salary of salaried employee ");
//                double weekly_salary = int_scan.nextDouble();
//                
//                System.out.println("enter the birth month of salaried employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of salaried employee ");
//                String salary_month = string_scan.nextLine();
//               
//                new Salaried_Employee(firstname, lastname, SSN, weekly_salary);
//                
//                 Date date_1 = new Date(birth_month, salary_month);
//                 
//                 new Salaried_Employee(firstname, lastname, SSN, weekly_salary).setDate_of_birth(date_1);
//                 
//                   employee [i] = new Salaried_Employee(firstname, lastname, SSN, weekly_salary);
//                 
//            }
//            
//            else if (choice == 2)
//            {
//                 System.out.println("print information of hourly employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of hourly employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of hourly employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of hourly employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the hourly wage of hourly employee ");
//                double hourly_wage = int_scan.nextDouble();
//                
//                System.out.println("enter the number of hours worked by an hourly employee ");
//                double hours = int_scan.nextDouble();
//                
//                System.out.println("enter the birth month of hourly employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of hourly employee ");
//                String salary_month = string_scan.nextLine();
//                
//                new  Hourly_Employee(firstname, lastname, SSN, hourly_wage, hours);
//                        
//                Date date_2 = new Date(birth_month, salary_month);
//                 
//                 new  Hourly_Employee(firstname, lastname, SSN, hourly_wage, hours).setDate_of_birth(date_2);
//                 
//                employee [i] = new  Hourly_Employee(firstname, lastname, SSN, hourly_wage, hours);
//            }
//            
//            else if(choice == 3)
//            {
//                System.out.println("print information of comission employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of comission employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of comission employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of comission employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the gross sales of comission employee ");
//                double gross_sales = int_scan.nextDouble();
//                
//                System.out.println("enter the comission rate of an comission employee ");
//                double rate = int_scan.nextDouble();
//                
//                 
//                System.out.println("enter the birth month of comission employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of comission employee ");
//                String salary_month = string_scan.nextLine();
//                
//                new Comission_Employee(firstname, lastname, SSN, gross_sales, rate);
//                
//                Date date_3 = new Date(birth_month, salary_month);
//                 
//                 new  Comission_Employee(firstname, lastname, SSN, gross_sales, rate).setDate_of_birth(date_3);
//                 
//                employee [i] = new Comission_Employee(firstname, lastname, SSN, gross_sales, rate);
//            }
//            
//            else if(choice == 4)
//            {
//                System.out.println("print information of base plus comission employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of base plus comission employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of base plus comission employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of base plus comission employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the gross sales of base plus comission employee ");
//                double gross_sales = int_scan.nextDouble();
//                
//                System.out.println("enter the comission rate of a base plus comission employee ");
//                double comission_rate = int_scan.nextDouble();
//                
//                System.out.println("enter the base salary of base plus comission employee ");
//                double base_salary = int_scan.nextDouble();
//                
//                System.out.println("enter the birth month of base plus comission employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of base plus comission employee ");
//                String salary_month = string_scan.nextLine();
//                
//                new BasePlus_Comission_Employee(firstname, lastname, SSN, gross_sales, comission_rate, base_salary);
//                
//                Date date_4 = new Date(birth_month, salary_month);
//                 
//                 new  BasePlus_Comission_Employee(firstname, lastname, SSN, gross_sales, comission_rate, base_salary).setDate_of_birth(date_4);
//                 
//                
//                employee [i] = new BasePlus_Comission_Employee(firstname, lastname, SSN, gross_sales, comission_rate, base_salary);
//            }
//            
//            else if(choice == 5)
//            {
//               System.out.println("print information of piece worker employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of piece worker employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of base piece worker employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of piece worker employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the wages of piece worker employee ");
//                double wages = int_scan.nextDouble();
//                
//                System.out.println("enter the number of pieces produced by a piece worker employee ");
//                double pieces_number = int_scan.nextDouble();
//                
//                System.out.println("enter the birth month of piece worker employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of piece worker employee ");
//                String salary_month = string_scan.nextLine();
//                
//                new Piece_Worker(firstname, lastname, SSN, wages, pieces_number);
//                
//                Date date_5 = new Date(birth_month, salary_month);
//                 
//                 new  Piece_Worker(firstname, lastname, SSN, wages, pieces_number).setDate_of_birth(date_5);
//                 
//               
//                employee [i] = new Piece_Worker(firstname, lastname, SSN, wages, pieces_number); 
//            }
//        }
//        
//        for (int i = 0; i < employee.length; i++) 
//        {
//           if(employee [i].getDate_of_birth().getBirth_date().equals(employee [i].getDate_of_birth().getReceiving_salary_date()))
//          {
//              System.out.println(employee[i].toString());
//              
//              System.out.println("the earnings of base plus comission employee are " + employee[i].earnings());
//              
//              System.out.println( );
//          }
//          
//           else if(employee [i] instanceof  BasePlus_Comission_Employee)
//           {
//               System.out.println(employee[i].toString());
//               
//               System.out.println("the earnings of a piece worker employee are " + (employee[i].earnings() + 100));
//               
//               System.out.println( );
//           }
//           
//           else
//          {
//              System.out.println(employee[i].toString());
//              
//              System.out.println("the earnings of base plus comission employee are " + employee[i].earnings());
//              
//              System.out.println( );
//          }
//        }
//        
//      }
//   }
//
//

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//

package com.bitspedia.oop.assignment;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) 
    {
        Scanner int_scan = new Scanner(System.in);
        Scanner string_scan = new Scanner(System.in);
        
        System.out.println("enter the elements you want to store ");
        int elements = int_scan.nextInt();
        
        Employee [] employee = new Employee [elements];
        
        for (int i = 0; i < employee.length; i++) 
        {
            System.out.println( );
            
            System.out.println("enter 1 for salaried employee // 2 for hourly employee // 3 comission employee // 4 for base plus comission employee // "
                    + "enter 5 for piece worker ");
            
            int choice = int_scan.nextInt();
            
            System.out.println( );
            
            System.out.println("enter the birth month of the employee ");
                String birth_month = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the salary month of the employee ");
                String salary_month = string_scan.nextLine();
               
                 Date months = new Date(birth_month, salary_month);
            
            if (choice == 1)
            {
                System.out.println( );
                
                System.out.println("print information of salaried employee ");
                System.out.println( );
                
                System.out.println("enter the first name of salaried employee ");
                String firstname = string_scan.nextLine();
                
                System.out.println( );
                
                 System.out.println("enter the last name of salaried employee ");
                String lastname = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  SSN of salaried employee ");
                String SSN = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  the weekly salary of salaried employee ");
                double weekly_salary = int_scan.nextDouble();
                
                
              Salaried_Employee salaried_employee = new Salaried_Employee(firstname, lastname, SSN, weekly_salary);
                
                 salaried_employee.setDate_of_birth(months);

                 employee [i] = salaried_employee;
            
                 System.out.println( );
            }
            
            else if (choice == 2)
            {
                System.out.println( );
                
                 System.out.println("print information of hourly employee ");
                System.out.println( );
                
                System.out.println("enter the first name of hourly employee ");
                String firstname = string_scan.nextLine();
                
                System.out.println( );
                
                 System.out.println("enter the last name of hourly employee ");
                String lastname = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  SSN of hourly employee ");
                String SSN = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the hourly wage of hourly employee ");
                double hourly_wage = int_scan.nextDouble();
                
                System.out.println( );
                
                System.out.println("enter the number of hours worked by an hourly employee ");
                double hours = int_scan.nextDouble();
                
                Hourly_Employee hourly_employee = new  Hourly_Employee(firstname, lastname, SSN, hourly_wage, hours);
                        
                 hourly_employee.setDate_of_birth(months);
                 
                employee [i] = hourly_employee;
                
                System.out.println( );
            }
            
            else if(choice == 3)
            {
                System.out.println( );
                
                System.out.println("print information of comission employee ");
                System.out.println( );
                
                System.out.println("enter the first name of comission employee ");
                String firstname = string_scan.nextLine();
                
                System.out.println( );
                
                 System.out.println("enter the last name of comission employee ");
                String lastname = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  SSN of comission employee ");
                String SSN = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the gross sales of comission employee ");
                double gross_sales = int_scan.nextDouble();
                
                System.out.println( );
                
                System.out.println("enter the comission rate of an comission employee ");
                double rate = int_scan.nextDouble();
                
                System.out.println( );
               
               Comission_Employee comission_employee = new Comission_Employee(firstname, lastname, SSN, gross_sales, rate);
                
                comission_employee.setDate_of_birth(months);
                 
                employee [i] = comission_employee;
                
                System.out.println( );
            
            }
            
            else if(choice == 4)
            {
                System.out.println( );
                
                System.out.println("print information of base plus comission employee ");
                System.out.println( );
                
                System.out.println("enter the first name of base plus comission employee ");
                String firstname = string_scan.nextLine();
                
                System.out.println( );
                
                 System.out.println("enter the last name of base plus comission employee ");
                String lastname = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  SSN of base plus comission employee ");
                String SSN = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the gross sales of base plus comission employee ");
                double gross_sales = int_scan.nextDouble();
                
                System.out.println( );
                
                System.out.println("enter the comission rate of a base plus comission employee ");
                double comission_rate = int_scan.nextDouble();
                
                System.out.println( );
                
                System.out.println("enter the base salary of base plus comission employee ");
                double base_salary = int_scan.nextDouble();
                
              BasePlus_Comission_Employee base_plus_comission_employee = new BasePlus_Comission_Employee(firstname, lastname, SSN, gross_sales, 
                                                                                                         comission_rate, base_salary);
         
                 base_plus_comission_employee.setDate_of_birth(months);

                employee [i] = base_plus_comission_employee;
                
                System.out.println( );
            
            }
            
            else if(choice == 5)
            {
                System.out.println( );
               System.out.println("print information of piece worker employee ");
                System.out.println( );
                
                System.out.println("enter the first name of piece worker employee ");
                String firstname = string_scan.nextLine();
                
                System.out.println( );
                
                 System.out.println("enter the last name of base piece worker employee ");
                String lastname = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the  SSN of piece worker employee ");
                String SSN = string_scan.nextLine();
                
                System.out.println( );
                
                System.out.println("enter the wages of piece worker employee ");
                double wages = int_scan.nextDouble();
                
                System.out.println( );
                
                System.out.println("enter the number of pieces produced by a piece worker employee ");
                double pieces_number = int_scan.nextDouble();
                
                System.out.println( );
                
               Piece_Worker piece_worker = new Piece_Worker(firstname, lastname, SSN, wages, pieces_number);
              
                 piece_worker.setDate_of_birth(months);
                 
               
                employee [i] = piece_worker;
                
                System.out.println( );
            }
        }
        
         for (Employee employees_s : employee) 
        {
            if (employees_s.getDate_of_birth().getBirth_date().equals(employees_s.getDate_of_birth().getReceiving_salary_date())) 
            {
                System.out.println( );
                System.out.println(employees_s.toString());
                System.out.println( );
                System.out.println("pay roll of the employee is " + (employees_s.earnings() + 100));
                System.out.println( );
            }
            
            else if (employees_s instanceof BasePlus_Comission_Employee) 
            {
                System.out.println( );
                System.out.println(employees_s.toString());
                System.out.println( );
                System.out.println("total earnings of the base plus comission employee are " + (employees_s.earnings() + 100));
                System.out.println( );
            } 
            
            else 
            {
                System.out.println( );
                System.out.println(employees_s.toString());
                System.out.println( );
                System.out.println("total earnings of the employee are " + employees_s.earnings());
                System.out.println( );
            }
        }
         
      }
   }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//        for (int i = 0; i < employee.length; i++) 
//        {
//           if(employee [i].getDate_of_birth().getBirth_date() == employee [i].getDate_of_birth().getReceiving_salary_date())
//          {
//              System.out.println(employee[i].toString());
//              
//              System.out.println("pay roll of the employee is " + (employee[i].earnings() + 100));
//              
//              System.out.println( );
//          }
//          
//           else if(employee [i] instanceof  BasePlus_Comission_Employee)
//           {
//               System.out.println(employee[i].toString());
//               
//               System.out.println("total earnings of the base plus comission employee are " + (employee[i].earnings() + 100));
//               
//               System.out.println( );
//           }
//           
//           else
//          {
//              System.out.println(employee[i].toString());
//              
//              System.out.println("total earnings of the employee are " + employee[i].earnings());
//              
//              System.out.println( );
//          }
//        }
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//package com.bitspedia.oop.assignment;
//
//import java.util.Scanner;
//
//public class EmployeeTest {
//
//    public static void main(String[] args) 
//    {
//        Scanner int_scan = new Scanner(System.in);
//        Scanner string_scan = new Scanner(System.in);
//        
//        System.out.println("enter the elements you want to store ");
//        int elements = int_scan.nextInt();
//        
//        Employee [] employee = new Employee [elements];
//        
//        for (int i = 0; i < employee.length; i++) 
//        {
//            System.out.println("enter 1 for salaried employee // 2 for hourly employee // 3 comission employee // 4 for base plus comission employee // "
//                    + "enter 5 for piece worker ");
//            
//            int choice = int_scan.nextInt();
//            
//            System.out.print("\n");
//            
//            if (choice == 1)
//            {
//                System.out.println("print information of salaried employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of salaried employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of salaried employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of salaried employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the  the weekly salary of salaried employee ");
//                double weekly_salary = int_scan.nextDouble();
//                
//                    
//            System.out.println("enter the birth month of the employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of the employee ");
//                String salary_month = string_scan.nextLine();
//           
//                
//                
//              Salaried_Employee salaried_employee = new Salaried_Employee(firstname, lastname, SSN, weekly_salary);
//              
//               Date months = new Date(birth_month, salary_month);
//                
//                 salaried_employee.setDate_of_birth(months);
//
//                 employee [i] = salaried_employee;
//            
//            }
//            
//            else if (choice == 2)
//            {
//                 System.out.println("print information of hourly employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of hourly employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of hourly employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of hourly employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the hourly wage of hourly employee ");
//                double hourly_wage = int_scan.nextDouble();
//                
//                System.out.println("enter the number of hours worked by an hourly employee ");
//                double hours = int_scan.nextDouble();
//                
//                    
//            System.out.println("enter the birth month of the employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of the employee ");
//                String salary_month = string_scan.nextLine();
//           
//                
//                Hourly_Employee hourly_employee = new  Hourly_Employee(firstname, lastname, SSN, hourly_wage, hours);
//                
//                 Date months = new Date(birth_month, salary_month);
//                        
//                 hourly_employee.setDate_of_birth(months);
//                 
//                employee [i] = hourly_employee;
//            
//            }
//            
//            else if(choice == 3)
//            {
//                System.out.println("print information of comission employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of comission employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of comission employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of comission employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the gross sales of comission employee ");
//                double gross_sales = int_scan.nextDouble();
//                
//                System.out.println("enter the comission rate of an comission employee ");
//                double rate = int_scan.nextDouble();
//                
//                    
//            System.out.println("enter the birth month of the employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of the employee ");
//                String salary_month = string_scan.nextLine();
//           
//               
//               Comission_Employee comission_employee = new Comission_Employee(firstname, lastname, SSN, gross_sales, rate);
//               
//                Date months = new Date(birth_month, salary_month);
//                
//                comission_employee.setDate_of_birth(months);
//                 
//                employee [i] = comission_employee;
//            
//            }
//            
//            else if(choice == 4)
//            {
//                System.out.println("print information of base plus comission employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of base plus comission employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of base plus comission employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of base plus comission employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the gross sales of base plus comission employee ");
//                double gross_sales = int_scan.nextDouble();
//                
//                System.out.println("enter the comission rate of a base plus comission employee ");
//                double comission_rate = int_scan.nextDouble();
//                
//                System.out.println("enter the base salary of base plus comission employee ");
//                double base_salary = int_scan.nextDouble();
//                
//                    
//            System.out.println("enter the birth month of the employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of the employee ");
//                String salary_month = string_scan.nextLine();
//           
//                
//              BasePlus_Comission_Employee base_plus_comission_employee = new BasePlus_Comission_Employee(firstname, lastname, SSN, gross_sales, 
//                                                                                                         comission_rate, base_salary);
//              
//               Date months = new Date(birth_month, salary_month);
//               
//                 base_plus_comission_employee.setDate_of_birth(months);
//
//                employee [i] = base_plus_comission_employee;
//            
//            }
//            
//            else if(choice == 5)
//            {
//               System.out.println("print information of piece worker employee ");
//                System.out.print("\n");
//                
//                System.out.println("enter the first name of piece worker employee ");
//                String firstname = string_scan.nextLine();
//                
//                 System.out.println("enter the last name of base piece worker employee ");
//                String lastname = string_scan.nextLine();
//                
//                System.out.println("enter the  SSN of piece worker employee ");
//                String SSN = string_scan.nextLine();
//                
//                System.out.println("enter the wages of piece worker employee ");
//                double wages = int_scan.nextDouble();
//                
//                System.out.println("enter the number of pieces produced by a piece worker employee ");
//                double pieces_number = int_scan.nextDouble();
//                
//                    
//            System.out.println("enter the birth month of the employee ");
//                String birth_month = string_scan.nextLine();
//                
//                System.out.println("enter the salary month of the employee ");
//                String salary_month = string_scan.nextLine();
//           
//                
//               Piece_Worker piece_worker = new Piece_Worker(firstname, lastname, SSN, wages, pieces_number);
//               
//                Date months = new Date(birth_month, salary_month);
//              
//                 piece_worker.setDate_of_birth(months);
//                 
//                employee [i] = piece_worker; 
//            }
//        }
        
//        for (Employee employees_s : employee) 
//        {
//            if (employees_s.getDate_of_birth().getBirth_date().equals(employees_s.getDate_of_birth().getReceiving_salary_date())) 
//            {
//                System.out.println(employees_s.toString());
//                System.out.println("pay roll of the employee is " + (employees_s.earnings() + 100));
//                System.out.println( );
//            }
//            
//            else if (employees_s instanceof BasePlus_Comission_Employee) 
//            {
//                System.out.println(employees_s.toString());
//                System.out.println("total earnings of the base plus comission employee are " + (employees_s.earnings() + 100));
//                System.out.println( );
//            } 
//            
//            else 
//            {
//                System.out.println(employees_s.toString());
//                System.out.println("total earnings of the employee are " + employees_s.earnings());
//                System.out.println( );
//            }
//        }
//        
//      }
//   }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
