
public class StringProcessor2
{
    public static String withoutEnds(String str)
    {
       return str.substring(1, str.length()-1);
        
    }
    
    public static String front2(String str)
    {
        return str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2);
    }
    
    public static String firstFour(String str)
    {
        if (str.length() == 1)
            return str + "#" + "#" +"#";
        if (str.length() == 2)
            return str + "#" + "#";
        if (str.length() == 3)
            return str + "#";
        else
            return str.substring(0,4);
    }
    
    public static boolean frontAgain(String str)
    {
        String front = str.substring(0,2);
        String last = str.substring(str.length()-2, str.length());
        return (front.equals(last)); 
    }
    
    public static String removeFirstWord(String str)
    {
        int pos = str.indexOf(" ");
        if (pos == -1)
            return "";
        else
            return str.substring(pos +1);
    }
    
    public static String emailName(String str)
    {
        int pos = str.indexOf("@");
        return str.substring(0, pos);
    }
}
