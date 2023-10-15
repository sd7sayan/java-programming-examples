package Programming;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0) {
			int remove = n%10;
			int factorial = 1;
			for(int i = 1;i<=remove;i++) {
				
				factorial = factorial*i;
			}
			sum= sum + factorial;
			n=n/10;
			
		}
		if(sum==temp) {
			System.out.println("it is a strong number");
		}
		else {
			System.out.println("It is not strong number");
		}
	}

}
