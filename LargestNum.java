import java.io.*;

class LargestNum{

      static int LargestNum(int a,int b,int c)
     /* {      //using ternary operator
        return c>(a>b?a:b)?c:((a>b)?a:b);
       }
       */

      {      //using if-else 
       if(a>=b && a>=c)
         {
           return a;
          }
        else if(b>=a && b>=c)
          {
           return b;
          }
        else 
          {
            return c;
           }
         }
      public static void main(String[] args)
      {
       int a,b,c;

       int largest;
       a=12;
       b=45;
       c=22;

       largest = LargestNum(a,b,c);

       System.out.println(largest +"is the largest number.");
       }
}