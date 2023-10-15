package Programming;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= s.nextInt();
		int sq=n*n;
		while(n>0) {
			if(n%10==sq%10) {
				n=n/10;
				sq=sq/10;
			}
			else {
				break;
			}
			
		}
		if(n==0) {
			System.out.println("It is a automorphic number");
		}
		else {
			System.out.println("It is not a automorphic number");
		}

	}

}
