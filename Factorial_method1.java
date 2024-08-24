import java.util.Scanner;

public class Factorial_method1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Receiving input for the factorial number
        System.out.println("Please enter the number");
        int n = sc.nextInt();

        int f=1;
        for (int i = 1; i <= n ; i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+ n+" = "+f);
    }


}
