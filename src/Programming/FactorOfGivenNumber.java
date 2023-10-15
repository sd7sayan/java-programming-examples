package Programming;

import java.util.Scanner;

public class FactorOfGivenNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int repeat=1;
		do{
			System.out.println("Enter the Number");
			int num=s.nextInt();
		    factor(num);
		    System.out.println("To continue press 1 or to exit press 2");
		    repeat=s.nextInt();
		   }
		while(repeat==1);
	}

	public static void factor(int num) {
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
