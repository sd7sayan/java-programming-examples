package Programming;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int sum= 0;
		int product=1;
		while(num!=0) {
			int last= num%10;
			sum=sum+last;
			product=product*last;
			num=num/10;
		}
		
		if(sum==product) {
			System.out.println("It is a spy number");
		}
		else {
			System.out.println("It is not a spy number");
		}
	}

}
