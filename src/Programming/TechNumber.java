package Programming;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int temp = n;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		if(count%2==0) {
			count= count/2;
			int power=1;
			for(int i =1;i<=count;i++) {
				power=power*10;
			}
			int first= n/power;
			int second= n%power;
			int sum= first + second;
			if(sum*sum==temp) {
				System.out.println("It is a tech number");
			}
			else {
				System.out.println("It is not a tech number");
			}
		}
		else {
			System.out.println("It is not a tech number");
		}

	}

}
