package Question_Solutions;

import java.util.Scanner;
import java.lang.String;
public class Remove_whitespaces_from_string_method2
{
    public static void main(String[] args) {


        //Receive the string to be processed
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        String str = sc.nextLine();


        char [] charArray= str.toCharArray();

        String strwithoutspace="";


        for (int i = 0; i < charArray.length; i++)
        {
            if(charArray[i]!=' ' && charArray[i]!= '\t')
            {
                strwithoutspace = strwithoutspace + charArray[i];

            }

        }

        System.out.println("Input String ="+ str);
        System.out.println("Output String ="+ strwithoutspace);
    }

}
