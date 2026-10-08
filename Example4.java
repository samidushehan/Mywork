import java.util.Scanner;
public class Example4 {
   public static void main (String[]args){
   Scanner input = new Scanner(System.in);
   
   while(true){

   System.out.print("Enter student name :");
   String name = input.next();
 
   System.out.print("Enter Studen Address :");
   String address = input.next();
 
   System.out.print("Enter number of Subject :");
   int num_subject = input.nextInt();

   double total = 0.0;
   int mark = 0;
   int max = 0;
   for(int i = 0; i < num_subject; i++){
      System.out.print("Enter marks of Subjects :");
      mark = input.nextInt();
      total = total + mark;
      if (max < mark){
        max = mark;
         }
      }
    double average = total / num_subject;

   System.out.println("A - Show student details");
   System.out.println("B - Show maximum mark");
   System.out.println("C - show Average mark");
   System.out.println("D - show result");
   System.out.println("E - Exits");
      

   String letter = input.next();

   switch(letter){
      case "A":
        System.out.println(name);
        System.out.println(address);
        break;
      case "B":
        System.out.println(max);
        break;
      case "C":
        System.out.println(average);
        break;
      case "D":
        if (average > 50.0){
           System.out.println("pass");
        }else{
           System.out.println("Fail");
           }
        break;
      case "E":
         System.out.println("Good bye");
         return;
            default:
         System.out.println("Invalid Entry");
      
         }   
            
       }
    }

}