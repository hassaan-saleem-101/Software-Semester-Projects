
public class AutomaticCar 
{
    private String model;
    private int year;
    private int gear;
    private double speed;
    
    public AutomaticCar()
    {
        
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public void setYear(int year)
    {
        if(year>0)
        {
           this.year = year; 
        }
        
        else
        {
            System.out.println("invalid input");
        }
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setGear(int gear)
    {
        if(gear>0)
        {
            this.gear = gear;
        }
        
        else
        {
            System.out.println("invalid input");
        }
    }
    
    public int getGear()
    {
        return gear;
    }
    
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    
    public double getSpeed()
    {
        return speed;
    }
}
