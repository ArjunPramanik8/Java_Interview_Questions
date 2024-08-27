import java.util.Scanner;

public class Palindrome_Number_method1
{
    public static void main(String[] args) {

        int r;
        int sum=0;
        int temp= 0;

        System.out.println("PLease enter the number to be checked");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        //Reversing the number
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        //System.out.println(temp);
        if (temp==sum)
        {
            System.out.println("The number is Palindrome");
        }
        else
        {
            System.out.println("The number is Non Palindrome");
        }
    }
}
