
package com.bitspedia.oop.assignment;

//////////////////////////////////////


public class Piece_Worker extends Employee
{
    private double wage; //// employee's wage per piece
    private double pieces; //// number of pieces produced

    public Piece_Worker(String firstname, String lastname,String social_security_number, double wage, double pieces) {
        super(firstname,lastname,social_security_number);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }
    
    @Override
    public double earnings()
    {
        return (getWage() * getPieces());
    }

    @Override
    public String toString() {
        return super.toString() + "Piece_Worker{" + "wage=" + wage + ", pieces=" + pieces + '}';
    }
}