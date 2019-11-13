
public class BookTester
{
   public static void main(String[] args)
   { Book b1 = new Book("Old Man and the Sea", "Ernest Hemmingway", 345);
      System.out.println(b1.toString());
      System.out.println(b1.getAuthor());
      b1.setAuthor("man");
      System.out.println(b1.getAuthor());
      System.out.println(b1.toString());
   }
}
