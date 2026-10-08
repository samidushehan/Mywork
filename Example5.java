import java.util.Scanner;
public class Example5{
     
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first number :");
       int num1 = input.nextInt();
       System.out.print("Enter second number :");
       int num2 = input.nextInt();

       System.out.println("A - Addition");
       System.out.println("B - Subdtraction");
       System.out.println("C - Devision");
       System.out.println("D - multiplication");

       char letter = input.next().charAt(0);
       
       switch (letter){
		case 'A':
		add(num1 , num2);
                break;
              
                case 'B':
		sub(num1 , num2);
                break;

		case 'c':
		dev(num1 , num2);
		break;

		case 'D':
		mul(num1 , num2);
		break;

		//default:
		}
	}
	public static void add(int number1 , int number2){
		int total = number1 + number2;
		System.out.println(number1+" + "+number2+" = "+total);
	}

	public static void sub(int number1 , int number2){
		int answer = 0;
		if (number1 >= number2){
			answer = number1  - number2;
			System.out.println(number1+" - "+number2+" = "+answer);
		}else{
			answer = number2 - number1;
			System.out.println(number2+" - "+number1+" = "+answer);
		}
		
	}

	public static void dev(int number1 , int number2){
		int answer = 0;
		if (number1 > number2){
			answer = number1/number2;
			System.out.println(number1+" / "+number2+" = "+answer);
		}else{
			answer = number2/number1;
			System.out.println(number2+ " / "+number1+" = "+answer);
		}
	} 

	public static void mul(int number1 , int number2){
		int answer = number1 * number2;
		System.out.println(number1+" * "+number2+" = "+answer); 
		}
}