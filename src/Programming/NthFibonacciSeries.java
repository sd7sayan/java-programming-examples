package Programming;

import java.util.Scanner;

public class NthFibonacciSeries {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the target of value");
		int target= s.nextInt();
		int a=0;
		int b=1;
/*	     for(int i=1;i<count;i++) {
			 int c =a+b;
		     a=b;
		     b=c;	
		    }
	      System.out.println(a); */
		
		for(int i=1;i<=target;i++) {
			if(i==target)
			{
				System.out.println(a);
			}
			int c =a+b;
			a=b;
			b=c;
		
		}
		


	}

}
