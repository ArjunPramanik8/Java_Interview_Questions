import java.util.Scanner;

public class Reversing_String
{
    public static void main(String[] args) {

        System.out.println("Enter the String to be reversed");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String rev="";

        for (int i = (str.length()-1); i >= 0 ; i--)
        {
            rev = rev+ str.charAt(i);
        }

        System.out.println("The Reversed String of "+str+" is "+rev);
    }
}
