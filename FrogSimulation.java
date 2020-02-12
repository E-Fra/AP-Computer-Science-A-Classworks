

public class FrogSimulation
{
   private int goalDistance;
   private int maxHops;
   
   public FrogSimulation(int dist, int hops)
   {
       goalDistance = dist;
       maxHops = hops;
   }
   
   public boolean simulate()
   {
       int position = 0;
       for(int i = 0; i < maxHops; i++)
       {
           position += hopDistance();
           if(position >= goalDistance)
            return true;
           if(position < 0)
            return false;
       }
       return false;
   }
   public double runSimulations(int num)
   {
       int simValue = 0;
       for(int i = 0; i < num; i++)
       {
           if(simulate() == true)
            simValue++;
       }
       return((double)simValue / num);
   }
}
