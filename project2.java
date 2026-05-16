import java .util.Scanner;
public class project2{
    public static void main(String []agrs){
        try (Scanner input1 = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = input1.nextLine();
            System.out.println("Enter your age :");
            int age = input1.nextInt();
            System.out.println("My name is " + name + "\n" + "I am " + age + " years old");
        }
    }
}
