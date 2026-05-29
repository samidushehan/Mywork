import java.util.Scanner;
public class pactrical3_1{
    public static void main(String[] agrs){
       try( Scanner sc = new Scanner(System.in);){
        System.out.print("Enter your age : ");
        byte age = (byte) sc.nextInt();
        // not byte lost
        //System.out.println("Your age is: " + age);
        System.out.print("Enter your weight : ");
        float height = sc.nextFloat();
        System.out.print("Enter your weight : ");
        Float weight = sc.nextFloat();
        System.out.print("Enter your Gender(G/M) : ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter your nickname : ");
        String nickname = sc.next();
        System.out.print("Enter your full name : ");
        String fullname = sc.next();
        System.out.print("Enter your mobile number : ");
        Long mobile = sc.nextLong();
        System.out.println("email : ");
        String email = sc.next();
        System.out.print("Enter your postal code : ");
        int postal_code = sc.nextInt();
        System.out.println("Your age is :" + age);
        System.out.println("Your height is :" + height);
        System.out.println("Your weight is :" + weight);
        System.out.println("Your gender is :" + gender);
        System.out.println("Your nickname is :" + nickname);
        System.out.println("Your full name is :" + fullname);
        System.out.println("Your mobile number is :" + mobile);
        System.out.println("Your email is :" + email);
        System.out.println("Your postal code is :" + postal_code);

    }
  }
}

    

