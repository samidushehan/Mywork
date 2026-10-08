import java.util.Scanner;
public class Example2{
      public static void main (String []agrs){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number 1 : ");
      int num1 = input.nextInt();
   
      System.out.print("Enter number 2 :" );
      int num2 = input.nextInt(); 
      
      System.out.println("A : Addition : " );
      System.out.println("B : Substraction : " );
      System.out.println("C : Multiplication : " );
      System.out.println("D : Division : " );

      String letter = input.next();
    
      switch (letter){
         case "A":
           add(num1 , num2);
         break;
         case "B":
           sub(num1 , num2);
         break;
         case "C":
            mul(num1 , num2);
         break;
         case"D":
             div(num1,num2);
         break;
         default:
            System.out.print("Invalid entry" );
          }




      }
      
       public static void add(int num1 , int num2){
           int tot = num1 + num2 ;
           System.out.println ("The addition is "+ tot);    
   }

     public static void sub(int num1 , int num2){
           if (num1 > num2){
           int tot = num1 - num2 ;
           System.out.println ("The Subtraction is "+ tot); 
           }
           else{
           int tot = num2-num1;
           System.out.println("The subtraction is "+tot);
           }

      }
      public static void mul(int num1 , int num2){
           int tot = num1 * num2 ;
           System.out.println ("The Multification is "+ tot); 
       }
      public static void div(int num1 , int num2){
           if (num1 > num2){
           int tot = num1 / num2 ;
           System.out.println ("The division is "+ tot); 
           }
           else{
           int tot = num2 / num1 ;
           System.out.println ("The division is "+ tot);}
   }
}