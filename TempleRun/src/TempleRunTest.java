
public class TempleRunTest
{

   
    public static void main(String[] args) 
    {
          for(int i=1; i!=TempleRun_LevelOne.coin(); i++)
        {
           TempleRun_LevelOne.levelone();
           
           if (TempleRun_LevelOne.coin > 30) break;
           
        }
        
        if(TempleRun_LevelOne.coin() >30)
        {
             TempleRun_LevelTwo.leveltwo();
        }
        
        else
        {
            System.out.println("not sufficient score");
        }
    }
}
    
    

