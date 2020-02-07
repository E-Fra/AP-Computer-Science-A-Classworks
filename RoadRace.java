import java.util.*;

public class RoadRace
{
    public static void main(String[] args)
    {
        ArrayList<String> racers = new ArrayList<String>();
        racers.add("7");
        racers.add("46 F");
        racers.add("39 F");
        racers.add("41 M");
        racers.add("29 M");
        racers.add("30 M");
        racers.add("31 F");
        racers.add("53 M");
        
        System.out.println(overall(racers));
        
        System.out.println(firstFemale(racers));
        System.out.println(firstMale(racers));
        System.out.println(secondMale(racers));
    }
    public static int overall(ArrayList<String> input)
    {
        int min = 99;
        String data = "";
        int value = 0;
        int index = 0;
        for(int i = 1; i < Integer.parseInt(input.get(0))+1; i++)
            {
            data = input.get(i);
            value = Integer.parseInt(data.substring(0,2));
            if(value < min)
            {
                min = value;
                index = i;
            }
            }
        input.remove(index);
        return min;
    }
    public static int firstFemale(ArrayList<String> input)
    {
        int min = 99;
        String data = "";
        int value = 0;
        int index = 0;
        for(int i = 1; i < Integer.parseInt(input.get(0)); i++)
            {
            data = input.get(i);
            if(data.substring(3,4).equals("F"))
            {
                value = Integer.parseInt(data.substring(0,2));
                if(value < min)
                {
                min = value;
                index = i;
            }
            }
            else
                min = min;
            }
        input.remove(index);
        return min;
    }
    public static int firstMale(ArrayList<String> input)
    {
        int min = 99;
        String data = "";
        int value = 0;
        int index = 0;
        for(int i = 1; i < Integer.parseInt(input.get(0))-1; i++)
            {
            data = input.get(i);
            if(data.substring(3,4).equals("M"))
            {
                value = Integer.parseInt(data.substring(0,2));
                if(value < min)
                {
                min = value;
                index = i;
            }
            }
            else
                min = min;
            }
        input.remove(index);
        return min;
    }
    public static int secondMale(ArrayList<String> input)
    {
        int min = 99;
        String data = "";
        int value = 0;
        int index = 0;
        for(int i = 1; i < Integer.parseInt(input.get(0))-2; i++)
            {
            data = input.get(i);
            if(data.substring(3,4).equals("M"))
            {
                value = Integer.parseInt(data.substring(0,2));
                if(value < min)
                {
                min = value;
                index = i;
            }
            }
            else
                min = min;
            }
        input.remove(index);
        return min;
    }
}
