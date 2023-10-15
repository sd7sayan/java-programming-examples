package Programming;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =s.nextInt();
		int temp= n;
		int reverse= 0;
		while(n!=0) {
			int last_digit = n%10;
			reverse= reverse*10 + last_digit;
			n= n/10;
		}
		if(temp==reverse) {
			System.out.println("It is a palindrome Number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}

}
