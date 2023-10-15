package Programming;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = s.nextInt();
		System.out.println("Enter the second number");
		int n2 = s.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(i%7==0||i%10==7) {
				System.out.println(i);
			}
		}

	}

}
