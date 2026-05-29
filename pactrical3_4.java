import java.util.Scanner;
public class pactrical3_4 {
    public static void main(String[]agrs){
        try(Scanner input = new Scanner (System.in);){
        System.out.println("-----------------------------------");
        System.out.print("Please Enter withdorw amount : ");
        int amount = input.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("Number of note claficatiion");
        System.out.println("-----------------------------------");
        
        int note5000 = amount / 5000 ;
        int note1000 = (amount % 5000) / 1000;
        int note500  = ((amount%5000)%1000)/500 ;
        int note100  = (((amount%5000)%1000)%500)/100 ;

        System.out.printf("5000 note : %20d" , note5000);
        System.out.printf("\n1000 note : %20d" , note1000);
        System.out.printf("\n500 note : %22d" , note500);
        System.out.printf("\n100 note : %22d" , note100);
        System.out.println("\n-----------------------------------");
        }
    }
}
