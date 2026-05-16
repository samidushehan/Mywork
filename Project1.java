import java.util.Scanner;
public class Project1 {
    public static void main(String[]agrs){
        final double pi = 3.14;
        try (Scanner samidu = new Scanner (System.in)) {
            System.out.println("Enter a Radius");
            int Radius = samidu.nextInt();
            int area = (int)(pi * Radius * Radius);
            System.out.println("The area of the circle :" + area);
        }
    }

    
}
