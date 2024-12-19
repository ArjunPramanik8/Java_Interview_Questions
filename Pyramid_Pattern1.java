package Question_Solutions;
import java.util.Scanner;

public class Pyramid_Pattern1
{
    public static void main(String[] args)
    {

        //Get the number of rows
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed");
        int Noofrow = sc.nextInt();

        int rowcount = 1;
        //Implementing the pyramid logic


        for (int i = Noofrow; i >0 ; i--)
        {
            //For printing the space before
            for (int j = 1; j <=i; j++)
            {
                System.out.print(" ");

            }


            for (int j = 1; j <=rowcount; j++)
            {
                System.out.print(rowcount+" ");
            }
            System.out.println();
            rowcount++;
            
        }

    }

}
