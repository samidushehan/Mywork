import java.util.Scanner;
public class Example{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        
        while (true){       

        System.out.println("Do you want add new student ? (Y/N)");
        char letter = input.next().charAt(0);
        
        if (letter == 'Y'){
            System.out.print("Enter Student name : ");
            String name = input.next();

            System.out.print("Enetr Student Address : ");
            String Address = input.next();

            System.out.print("Enetr number of subject : ");
            int num_subject = input.nextInt();

            int [] subject = new int [num_subject];

            double total = 0.0;
            for (int i = 0 ; i < subject.length ; i++){
		System.out.print("Enter mark of subject : ");
                subject[i] = input.nextInt();
                total = total + subject[i];
            }
            double average = total / subject.length;

  	   boolean flag2 = true; 
           while (flag2){

           System.out.println("A - Show student details .");
           System.out.println("B - Show all marks .");
           System.out.println("C - show result .");
           System.out.println("E - Exits .");

           String mode = input.next();

           
           switch(mode){
              case "A":
                 System.out.println(name);
                 System.out.println(Address);
                 break;
             
              case "B":
                 int count = 1;
                 for (int j = 0 ; j < subject.length ; j++){
                      System.out.println("Mark of subject "+count+ " : "+subject[j]);
                      count++;
                 }
                 break;

              case "C":
                 if (average > 50.0){
                     System.out.println("Pass");
                 }else {
                     System.out.println("Fail"); 
                 }
                 break;

              case "E":
                 System.out.println("Good Bye....");
                 flag2 = false;
                 break;
              
              default:
                 System.out.println("Invalid Entry");
            } 
          }
        }else if (letter == 'N'){
            System.out.println("Good bye....");
            return;
            }
         else {
            System.out.println("Invalid Entry....");
         }   
      }
   }
 }    
