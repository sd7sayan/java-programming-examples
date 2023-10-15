package Programming;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		System.out.println(factorial(num));
		}
	public static int factorial(int num) {
		int product=1;
		for(int i=num;i>=1;i--) {
			product=product*i;
		}
		return product;
	}

}
