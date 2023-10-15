package Programming;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int sq=1;
		int last=0;
		while(true) {
			int sum=0;
			while(n>0) {
		last =n%10;
	    sq = last*last;
		sum=sum+sq;
		n=n/10;
		
		}
			n=sum;
			if(n==1) {
				System.out.println("It is happy Number");
				break;
			}
			else if(n==4) {
				System.out.println("It is a sad number");
				break;
			}
		}
			
	}

}
