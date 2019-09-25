
/**
 * Classwork 8: Practice Assessment Problems 11 and 12
 */
public class Classwork8
{
    public static void main(String[] args)
    {
        System.out.println(raceToday(30, true));
        System.out.println(raceToday(700, true));
        System.out.println(raceToday(850, true));
        System.out.println(raceToday(450, false));
         
        System.out.println(numValue(10));
        System.out.println(numValue(9));
        System.out.println(numValue(15));
    }
    
    /** Question 11: Define a function that determines if a rider can race their dirtbike today. A dirtbike race only 
    ** happens on Fridays, and the motor requirements for the cc’s (or cubic centimeters) specify that the motor has ** a minimum of 150cc and a maximum of 800cc to be able to race. The method should return true if you are  
    ** racing today.
    **
    **@param size describes the cc’s for the dirt bike
    **@param isFriday boolean data that is true if it is Friday
    **
    **@return True if the size is between 150 and 800 (inclusive) and it’s Friday
    **/
    public static boolean raceToday(int size, boolean isFriday) 
    {               

        return ((size>= 150 & size <= 800 & isFriday == true));
     
    }
    
    /** Question 12: Define a function to determine if a number entered is even, then returns that number times 5. If ** the number entered is odd and is divisible by 5, then the function returns that number divided by five. If the 
    ** number is odd and is not divisible by 5, then the function returns three times that number. 
    **
    **@param number the number that determines the outputs to the function
    **
    **@return five times number if the number is even, number/five if number is odd and 
    ** divisible by five, and three times number if the number is odd and not divisible by five
    **/

    public static int numValue(int number)
    {               

        if (number % 2 == 1)
            if (number % 5 == 0)
                return number/5;
            else
                return number*3;
        else
            return number *5;

    }
}