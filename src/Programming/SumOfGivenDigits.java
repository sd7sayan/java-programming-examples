package Programming;

import java.util.Scanner;

public class SumOfGivenDigits {

	public static void main(String[] args) {
		
	 Scanner s= new Scanner(System.in);
	 int reapt=1;
	 do {
		 System.out.println("Enter the Number");
		 int n=s.nextInt();
		 System.out.println(sum(n));
		 System.out.println("For continue press 1 and to exit press 2");
		 reapt=s.nextInt();
	 }while(reapt==1);
	}
	 
	 public static int sum(int n) {
		  int add=0;
		 while(n!=0) {
			 int last=n%10;
			 add=add+last;
			  n=n/10;
		 }return add;
	 }
	 
}
