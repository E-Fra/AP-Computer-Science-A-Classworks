import java.util.*;
public class Classwork2_ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        
        System.out.println("Question 1: ");
        printElements(sports);
        System.out.println("Question 2: ");
        insertElement(sports, "Golf");
        System.out.println("Question 3: ");
        System.out.println(returnElement(sports, 3));
        System.out.println("Question 4: ");
        removeThirdElement(sports);
        System.out.println("Question 5: ");
        System.out.println(searchForElement(sports, "Soccer"));
        System.out.println("Question 6: ");
        System.out.println(searchAndCountElement(sports, "Soccer"));
        System.out.println("Question 7: ");
        System.out.println(copyAndReturnList(sports));
        System.out.println("Question 8: ");
        shuffleElements(sports);
        System.out.println("Question 9: ");
        reverseElements(sports);
    }
    
    //Number 1
    public static void printElements(ArrayList<String> inputList)
    {
        for(int i = 0; i < inputList.size(); i++)
        {
            System.out.println(inputList.get(i));
        }
    }
    
    //Number 2
    public static void insertElement(ArrayList<String> inputList, String input)
    {
        inputList.add(input);
        printElements(inputList);
    }
    
    // Number 3
    public static String returnElement(ArrayList<String> inputList, int i)
    {
        return inputList.get(i);
    }
    
    //Number 4
    public static void removeThirdElement(ArrayList<String> inList)
    {
        inList.remove(2);
        printElements(inList);
    }
    
    //Number 5
    public static int searchForElement(ArrayList<String> inputList, String input)
    {
        for(int i = 0; i < inputList.size(); i++)
        {
            if(inputList.get(i).equals(input))
                return 1;
        }
        return -1;
    }
    
    //Number 6
    public static int searchAndCountElement(ArrayList<String> inputList, String input)
    {
        int count = 0;
        for(int i = 0; i < inputList.size(); i++)
        {
            if(inputList.get(i).equals(input))
               count += 1;
        }
        return count;
    }
    
    //Number 7
    public static ArrayList<String> copyAndReturnList(ArrayList<String> inputList)
    {
        ArrayList<String> copy = new ArrayList<String>();
        for(int i = 0; i < inputList.size(); i++)
        {
            copy.add(inputList.get(i));
        }
        return copy;
    }
    
    //Number 8
    public static void shuffleElements(ArrayList<String> inputList)
    {
        Collections.shuffle(inputList);
        printElements(inputList);
    }
    
    //Number 9
    public static void reverseElements(ArrayList<String> inputList)
    {
        for(int i = inputList.size() -1; i >= 0; i--)
        {
            System.out.println(inputList.get(i));
        }
    }
}
