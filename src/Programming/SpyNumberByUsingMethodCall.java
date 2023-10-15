package Programming;

import java.util.Scanner;

public class SpyNumberByUsingMethodCall {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int repeat=1;
     do{
		System.out.println("Enter the number");
		int num = s.nextInt();
		if (spy(num)==true) {
			System.out.println("It is a spy number");
		}
		else {
			System.out.println("It is not a spy number");
		}
		System.out.println("To continue press 1 or to exit press 2");
		repeat=s.nextInt();
	  }while(repeat==1);
	}
	
	public static boolean spy(int num) {
		int sum= 0;
		int product=1;
		while(num!=0) {
			int last= num%10;
			sum=sum+last;
			product=product*last;
			num=num/10;
		}
		if (sum==product) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
