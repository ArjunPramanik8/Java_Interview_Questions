package Question_Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_whitespaces_from_string_method3 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str =sc.nextLine();

        String [] strnew= str.split(" ");
        String newstr= " ";

        for (int i = 0; i <strnew.length ; i++)
        {
            newstr = newstr + strnew[i];
        }

        System.out.println("Input String ="+ strnew);
        System.out.println("Output String ="+ newstr);
    }
    //Receive the string


}
