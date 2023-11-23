
import java.util.Scanner;

public class TempleRun_LevelOne 
{
    String playername;
    static int coin = 10;
    
    static void levelone()
    {
         String mr = "moveRight";
    
      String ml = "moveLeft";
    
     String jump = "jump";
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("press 1 for move right press 2 for move left press 3 for jump");
    
      s.nextLine();
     
      String word1 = s.nextLine();
      
      switch (word1) 
        {
            case "press1":
            {
                System.out.println(mr);
               coin = coin - 2;
               
                System.out.printf("the coin is %d \n",coin);
            }
                break;
                
            case "press2":
            {
                System.out.println(ml);
               coin = coin - 3;
                System.out.printf("the coin is %d \n",coin);   
            }
                break;
                
            case "press3":
            {
                System.out.println(jump);
             coin = coin + 5;
                System.out.printf("the coin is %d \n",coin);   
            }
                break;
                
            default:
            {
                System.out.println("in valid");
            }
                break;
        }
   }
    
static int coin()
               
   {
       return coin;
   }

}
   
      
      
    
      
    
    
    
    
    

