import java.util.Scanner;

public class Palindrome_String_Method1
{
    public static void main(String[] args)
    {
        System.out.println("Please enter the string to be checked");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        String rev= "";
        for (int i =(str.length()-1); i>=0;i--)
        {
            rev= rev+ str.charAt(i);
        }

        System.out.println(rev);

        if(str.equals(rev))
        {
            System.out.println("The String is Palindrome");
        }
        else
        {
            System.out.println("The String is non-Palindrome");
        }

    }
}
