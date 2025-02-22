// input n=5
// power p=3
//5*5*5=125
import java.util.Scanner;
class Power
{
   public static void main(String[] args){
       
       int n,p,result = 1;
       System.out.println("Enter No. ");
       Scanner r = new Scanner(System.in);
       n = r.nextInt();
       System.out.println("Enter Power ");
       p = r.nextInt();

       for(int i=1; i<=p; i++)
          {
             result = n*result;
          }
       System.out.print("Power"+result);
    }
}