
import java.util.Random;

import java.util.Scanner;

public class TheLuckyRacerGame 
{
    public static void main(String[] args)
    {
        int i;
        AutomaticCar car1 = new AutomaticCar();
        AutomaticCar car2 = new AutomaticCar(); 
        AutomaticCar car3 = new AutomaticCar();
         AutomaticCar car4 = new AutomaticCar();
         AutomaticCar car5 = new AutomaticCar();
         
        Scanner auto = new Scanner(System.in);
        
        System.out.println("insert the models from car 1 to car 5");
        auto.nextLine();
        
        car1.setModel(auto.nextLine());
        car2.setModel(auto.nextLine());
         car3.setModel(auto.nextLine());
          car4.setModel(auto.nextLine());
           car5.setModel(auto.nextLine());
           
           System.out.println("insert the year from car 1 to car 5");
           
           car1.setYear(auto.nextInt());
           car2.setYear(auto.nextInt());
           car3.setYear(auto.nextInt());
           car4.setYear(auto.nextInt());
           car5.setYear(auto.nextInt());
           
           Random Ran = new Random();
          
           int limit = 500;
           
           for(i=1; i<=10; i++)
           {
               car1.setSpeed(limit);
               car1.getGear();
               
               car2.setSpeed(limit);
               car2.getGear();
               
               car3.setSpeed(limit);
               car3.getGear();
               
               car4.setSpeed(limit);
               car4.getGear();
               
               car5.setSpeed(limit);
               car5.getGear();
               
               
           }
    }
    
}
