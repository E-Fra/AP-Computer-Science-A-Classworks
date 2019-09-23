import java.util.Scanner;
public class Classwork6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many chuggas before the choo choo?");
        int numChug = scan.nextInt();
        System.out.println(numChuggas(numChug));
        System.out.println(findSum(2,3));
        System.out.println(canVote(17));
        System.out.println(canVote(21));
        System.out.println(canDrive(15));
        System.out.println(powerCalc(81, .25));
        System.out.println(absltValue(-66));
        
    }
    
    public static double findSum(int a, int b)
    {
        return a + b;
    }
    
    public static String canVote(int age)
    {
        if (age >= 18)
            return "You can vote";
        else
            return"You cant vote";
    }
    
    public static boolean canDrive(int age)
    {
        return age >= 16;
    }
    
    public static double powerCalc(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }
    
    public static int absltValue(int number)
    {
        if (number < 0)
            return number * -1;
        else
            return number;
    }
    
    public static String numChuggas(int numChug)
    {
         if (numChug<= 3)
            return "Youre a monster";
         if (numChug >= 12)
            return "Hmmmmmm, passable.";
         else
            return "That is an acceptable amount";
    }
}