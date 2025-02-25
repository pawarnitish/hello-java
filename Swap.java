import java.util.Scanner;
class Swap
   {
       public static void main(String[] args)
       {
           int a,b;
           System.out.print("Enter any two Numbers");
           Scanner ref = new Scanner(System.in);
           a = ref.nextInt();
           b = ref.nextInt();
           System.out.println("Before swapping " +a+ " "+b);
            a=a+b;
            b=a-b;
            a=a-b;
           System.out.println("After swapping " +a +" "+b);
       }
   }