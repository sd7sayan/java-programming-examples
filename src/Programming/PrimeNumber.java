package Programming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int repeat=1;
		do{
			System.out.println("Enter the Number");
			int num=s.nextInt();
		    if(primeNumber(num)==true) {
		    	System.out.println("It is prime number");
		    }
		    else {
		    	System.out.println("It is not a prime number");
		    }
		    System.out.println("To continue press 1 or to exit press 2");
		    repeat=s.nextInt();
		   }
		while(repeat==1);
	}

	public static boolean primeNumber(int num) {
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
