import java.util.Scanner;
class Temperature
{
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the celsius value=");
         float d = sc.nextFloat();
         float fahrenheit = (d*9/5)+32;
         System.out.println("The fahrenheit value is = "+ fahrenheit);
   }
}    

       