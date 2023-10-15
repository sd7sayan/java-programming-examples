package Programming;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a =s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		System.out.println("**************Before swapping************* ");
		System.out.println("first number = "+a);
		System.out.println("second number ="+b);

		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("**************After swapping************* ");
		System.out.println("first number = "+a);
		System.out.println("second number ="+b);

	}

}
