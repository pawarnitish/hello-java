import java.util.Scanner;
class ReverseNum{
     public static void main(String[] args){

     int num,r ;
     System.out.println("Enter any number");
     Scanner ref=new Scanner(System.in);
     num=ref.nextInt();
     
     while(num>0)
     {
       r=num%10;
       System.out.print(r);
       num=num/10;
       }
    }
}