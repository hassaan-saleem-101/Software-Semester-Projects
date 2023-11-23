/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitspedia.oop;

import java.util.Scanner;
/**
 *
 * @author Dr Saleem
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
         Scanner striscan = new Scanner(System.in);
        /// Gender gender1 = null;
        
        Department [] department1 = new Department[2];
        
        System.out.println("Department1 information ");
        
        System.out.println("enter the number of students ");
        int numberstudents = scan.nextInt();
        
        Student[] student1 = new Student [numberstudents];
        
       striscan.nextLine();
       
        for (int i = 0; i < student1.length; i++) 
        {
            System.out.println("enter the id of student " + (i+1));
            String id = striscan.nextLine();
            
            System.out.println("enter the name of student " + (i+1));
            String name = striscan.nextLine();
            
            System.out.println("enter the cgpa of student "+ (i+1));
            double cgpa = scan.nextDouble();
            
            striscan.nextLine();
            System.out.println("enter the gender of student "+ (i+1));
            String gender = striscan.nextLine();
            
           if(gender.equals("MALE"))
           {
               System.out.println(Gender.MALE);
           }
           
           else if(gender.equals("FEMALE"))
           {
               System.out.println(Gender.FEMALE);
           }
            
        }
        
    }
    
}
