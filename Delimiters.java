import java.util.*;
public class Delimiters
{
   private String openDel;
   private String closeDel;
   
   public Delimiters(String open, String close)
   {
     openDel = open;  
     closeDel = close;
   }
   public ArrayList<String> getDelimitersList(String[] tokens)
   {
       ArrayList<String> d = new ArrayList<String>();
       for (String str : tokens)
       {
           if (str.equals(openDel) || str.equals(closeDel))
           {
               d.add(str);
            }
        }
        return d;
    }

   public boolean isBalanced(ArrayList<String> delimiters)
   {
       int openCount = 0;
       int closeCount = 0;
       for (String str : delimiters)
       {
           if (str.equals(openDel))
           {
               openCount++;
           }
           else
           {
               closeCount++;
           }
           if (closeCount > openCount)
           {
               return false;
           }
       }
       if (openCount == closeCount)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
