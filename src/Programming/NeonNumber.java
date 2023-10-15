package Programming;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
	

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int sum= 0;
		int square=num*num;
		while(square!=0) {
			int last= square%10;
			sum=sum+last;
			square=square/10;
		}
		
		if(sum==num) {
			System.out.println("It is a Neon number");
		}
		else {
			System.out.println("It is not a Neon number");
		}
	}

}
