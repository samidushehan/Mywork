import java.util.Scanner;
public class Project3 {
    public static void main(String[]agrs){
        try(Scanner Ssj = new Scanner (System.in)){
        System.out.println("Enter count of seconds :");
        int seconds = Ssj.nextInt();
        int minutes = seconds / 60;
        int seconds2 = seconds % 60;
        System.out.println(minutes+" minutes and "+seconds2+"seconds");
        }
    }
    
}
