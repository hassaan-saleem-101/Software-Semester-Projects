
package com.bitspedia.oop.assignment;

public abstract class Employee {
    
    private String firstname;
    private String lastname;
    private String social_security_number;
    private Date date_of_birth; 

    public Employee(String firstname, String lastname,String social_security_number) {
        this.firstname = firstname;
        this.lastname = lastname;
         this.social_security_number = social_security_number;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocial_security_number() {
        return social_security_number;
    }

    public void setSocial_security_number(String social_security_number) {
        this.social_security_number = social_security_number;
    }
    
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" + "firstname=" + firstname + ", lastname=" + lastname + ", social_security_number=" + social_security_number + '}';
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}