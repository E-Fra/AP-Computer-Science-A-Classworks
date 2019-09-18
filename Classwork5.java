
import java.util.Scanner;

public class Classwork5
{
    public static void main(String[] args)
    {
       /*for(int i = 0; i < 50; i += 1)
        {
            int dice1 = (int)(Math.random() * 6 + 1);
            int dice2 = (int)(Math.random() * 6 + 1);
            int sum = dice1 + dice2;
            if (sum == 7 || sum == 11)
                System.out.println("You Win");
            else if (sum == 2 || sum == 3 || sum ==12)
                System.out.println("You Lose");
            else 
                System.out.println("Keep Playing");
        }
        // Exercise 3
       Scanner scan = new Scanner(System.in);
       System.out.println("Ask me a question");
       String answer = scan.nextLine();
       
        int rollNum = (int)(Math.random() *7);
        if (rollNum == 0)
            System.out.println("Response 1");
        else if (rollNum == 1)
            System.out.println("Response 2");
         else if (rollNum == 2)
            System.out.println("Response 3");
             else if (rollNum == 3)
            System.out.println("Response 4");
             else if (rollNum == 4)
            System.out.println("Response 5");
            else if (rollNum == 5)
            System.out.println("Response 6");
            else 
            System.out.println("Response 7");
            
            
        //Exercise 4
       System.out.println("How many sides on the dice?");
       double s = scan.nextDouble();
       int rollValue = (int)(Math.random() * s + 1);
       if (s <= 0)
            System.out.println("Invalid Entry");
       else
       System.out.println("Your roll is a " + rollValue);
       */
       
       //Exercise 5
       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to Blackjack");
       int card1 = (int)(Math.random() * 11 +1);
       int card2 = (int)(Math.random() * 11 +1);
       int sum = card1 + card2;
       
       if (sum > 21)
             System.out.println("You lose");
       else
        System.out.println("You're at " + sum);
        System.out.println("Hit or stay?");
        String answer = scan.nextLine();
        if (answer == "Hit" || answer == "hit")
            sum += card1;
        else
            if (sum < 18)
                   
                   System.out.println(sum +"You lose");
            else
             
                 System.out.println(sum +"You win");
                 
           
    }
}
