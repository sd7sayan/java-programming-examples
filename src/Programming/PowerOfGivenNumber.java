package Programming;

import java.util.Scanner;

public class PowerOfGivenNumber {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=s.nextInt();
		 System.out.println("Enter the power of the number");
		 int m=s.nextInt();
		 int power=1;
		 for(int i=1;i<=m;i++) {
			 power=power * n;
		 }
         System.out.println(power+ " is the power of given number");
	}

}
