package Programming;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the range of value");
		int count= s.nextInt();
		int a=0;
		int b=1;
		int n=0;
		for(int i=1;i<=count;i++) {
			System.out.println(a);
			int c =a+b;
			a=b;
			b=c;
		
		}
		
	}

}
