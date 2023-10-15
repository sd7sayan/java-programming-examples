package Programming;

import java.util.Scanner;

public class SumOfFactors {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int repeat=1;
		do{
			System.out.println("Enter the Number");
			int num=s.nextInt();
		    System.out.println(factor(num));
		    System.out.println("To continue press 1 or to exit press 2");
		    repeat=s.nextInt();
		   }
		while(repeat==1);
	}

	public static int factor(int num) {
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum= sum+i;
			}
		}
		return sum;
	}

}

