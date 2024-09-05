package Question_Solutions;

import java.util.Scanner;

public class Remove_whitespaces_from_string_method1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Please enter the string
        System.out.println("Please enter the string");
        String str = sc.nextLine();

        String strwithoutspace= str.replaceAll("\\s","");

        System.out.println("Input String = "+str);
        System.out.println("Output String = "+strwithoutspace);
    }
}
