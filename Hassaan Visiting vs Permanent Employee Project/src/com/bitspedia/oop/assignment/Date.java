
package com.bitspedia.oop.assignment;

public class Date {
    private String birth_date;
    private String receiving_salary_date;
    
    public Date(String birth_date,String receiving_salary_date)
    {
        this.setBirth_date(birth_date);
        this.setReceiving_salary_date(receiving_salary_date);
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
    public String getReceiving_salary_date() {
        return receiving_salary_date;
    }

    public void setReceiving_salary_date(String receiving_salary_date) {
        this.receiving_salary_date = receiving_salary_date;
    }
}