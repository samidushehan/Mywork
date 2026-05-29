import java .util.Scanner;
public class pactrical3_2 {
    public static void main (String[] agrs){
        try(Scanner input = new Scanner(System.in);){
        System.out.print("Enter your maths marks : ");
        int maths = input.nextInt();
        System.out.print("Enater your Physics marks : ");
        int physics = input.nextInt();
        System.out.print("Enter youe chemestry marks : ");
        int Chemistry = input.nextInt();

        int Totalmarks = maths + physics + Chemistry ;
        
        
        double Averagemarks = Totalmarks / 3.0 ;
        
        System.out.println("----------------------------------------");
        System.out.println("           Advanced level - 2020               ");
        System.out.println("----------------------------------------");
        System.out.printf ("Subject                        Marks           ");
        System.out.println ("\n----------------------------------------");
        System.out.printf ("Mathematics %22d" , maths);
        System.out.printf ("\nPhysics %26d" , physics);
        System.out.printf ("\nChemistry %24d" , Chemistry);
        System.out.print("\n----------------------------------------");
        System.out.printf ("\nTotal Marks %22d" , Totalmarks);
        System.out.print("\n----------------------------------------");
        System.out.printf ("\nAverage Marks %20.2f" , Averagemarks);

        } 
        
    }
    
}
