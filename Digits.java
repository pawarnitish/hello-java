

//intput 2345 ---4 digits
import java.util.Scanner;
class Digits
{
    public static void main(String[] args)
         {
            int n,count=0;
            System.out.print("Enter any Number");
            Scanner r = new Scanner(System.in);
            n=r.nextInt();

            while(n>0)
            {
               n=n/10;
               count++;
             }
             System.out.print("No. of Digits "+count);
             }
}