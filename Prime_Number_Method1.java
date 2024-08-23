public class Prime_Number_Method1
{
    public static void main(String[] args) {

        // Below is the number to be checked
        int n=17;
        int c=0;

        //checkingif the number is Prime or not
        if (n==0|| n==1)
        {
            System.out.println(n+" is Non Prime Number");

        } else{
            for (int i = 2; i < n-1; i++) {

                if (n % i == 0) {
                    c++;
                }
            }
            if (c > 0) {
                System.out.println(n + " is Non Prime Number");
            } else {
                {
                    System.out.println(n + " is Prime Number");
                }
            }

        }


    }
}
