import java.util.Scanner;
public class Multiplication{
      public static void main(String []args){
        int number;
      System.out.print("Enter number for multiplication table:" );
      Scanner sc = new Scanner(System.in);

      number = sc.nextInt();

      for(int i=1;i<=10;i++)
          System.out.println(number+"*"+i+"="+(number*i) );
       }
}



//num*i
//num fix * i change

