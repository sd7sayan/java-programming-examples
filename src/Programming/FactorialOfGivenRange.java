package Programming;

import java.util.Scanner;

public class FactorialOfGivenRange {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the starting number");
		int num = s.nextInt();
		System.out.println("Enter the ending Number");
		int num2=s.nextInt();
		factorial(num,num2);
		}
	public static void factorial(int num, int num2) {
		for(int j=num;j<=num2;j++) {
		int product=1;
		for(int i=j;i>=1;i--) {
			product=product*i;
		}
		System.out.println(product);
		}
	}


}
