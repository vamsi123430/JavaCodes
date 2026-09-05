import java.util.Scanner;


public class ReverseaString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String line = sc.nextLine();
        String rev = " ";
        for(int i=line.length()-1;i>=0;i--)
        {
            rev = rev+line.charAt(i);
        }
        System.out.println("reversed string is " +rev);
    }

}
