package Programming;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int temp = n;
		int count= 0;
		while(n>0) {
			n=n/10;
			count ++;
			}
		n=temp;
		int sum=0;
		while(n>0) {
			int d = n%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*d;
			}
			sum=sum+power;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("It is a Armstrong number");
		}
		else {
			System.out.println("It is not a Armstrong number");
		}
	}

}
