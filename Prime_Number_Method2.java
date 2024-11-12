import java.util.Scanner;

public class Prime_Number_Method2
{

    public static void checkPrime(int n)
    {
        int c=0;

        if (n == 0||n==1)
        {
            System.out.println(n +" is a Non Prime Number");

        }
        else 
        {
            for (int i = 2; i < n-1; i++) {
                if (n % i == 0) {
                    c++;
                }

            }
            if (c>0) {
                System.out.println(n + " is a Non Prime Number");
            } else {
                System.out.println(n + " is a  Prime Number");
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= s.nextInt();

        checkPrime(n);

    }
}
