package Question_Solutions;
import java.util.Scanner;
import static Question_Solutions.Armstrong_Number.isArmstrong;

public class Armstrong_Number
{
    public static boolean isArmstrong(int n)
    {
        //declaring variables for evaluation of teh armstromg number
        int temp=0,last=0,sum=0,digit=0;

        //calculating the number of digits
        temp=n;
        while(n>0)
        {
            temp=temp/10;
            digit++;
        }

        
        temp=n;
        while(temp>0)
        {
            last=temp%10;
            sum+= (Math.pow(last,digit));
            temp=temp/10;
        }

        if (n==sum)
        {
            return true;

        }
        else
        {
            return false;
        }

    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number to be checked");
        int n = sc.nextInt();

        System.out.println("the number is "+n);

        if (isArmstrong(n))
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Non Armstrong number");
        }
    }
}

