package Programming;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =s.nextInt();
		int reverse= 0;
		while(n!=0) {
			int last_digit = n%10;
			reverse= reverse*10 + last_digit;
			n= n/10;
		}
		System.out.println(reverse);
	}

}
