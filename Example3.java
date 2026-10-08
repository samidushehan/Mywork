import java.util.Scanner;

public class Example3{
   public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] number = {10 , 20 , 30 , 40 , 50 };
	addFive(number);
	for (int j = 0 ; j < number.length ; j++){
		System.out.println(number[j]);	
	}
	       
	} 
	
	public static void addFive(int [] num){
		for (int i = 0 ; i < num.length ; i++){
			num[i] = num[i] + 5;
			
		}
	}
}