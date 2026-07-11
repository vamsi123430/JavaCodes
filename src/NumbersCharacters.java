import java.util.Scanner;

public class NumbersCharacters
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String values = sc.nextLine();
      String letters = " ";
      String numbers = " ";
       for(char ch:values.toCharArray())
       {
           if(Character.isLetter(ch))
           {
               letters+=ch;
           }
           else if(Character.isDigit(ch))
           {
               numbers+=ch;
           }

       }
       System.out.println("Letters are :"+letters);
       System.out.println("numbers are : "+numbers);

   }

}
