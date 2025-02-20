public class NumDigits{
      public static void main(String[] args){
      
      int count=0,num=122345;
      while(num != 0){
       num = num/10;
        // num/=10;
          ++count;
        }

       
      System.out.println("Number of digits : " +count );

     }
}      