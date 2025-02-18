import java.util.Scanner; 
class Evenodd{

       public static void main(String []args){

        int n ;

        System.out.println(" Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
          System.out.println("Even number");
         }
        else
        {
           System.out.println("odd number");
         }
       }
}