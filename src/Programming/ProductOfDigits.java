package Programming;
import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
			
		 Scanner s= new Scanner(System.in);
		 int repeat=1;
		 do {
			 System.out.println("Enter the Number");
			 int n=s.nextInt();
			 System.out.println(product(n));
			 System.out.println("For continue press 1 and to exit press 2");
			 repeat=s.nextInt();
		}while(repeat==1);
	}
		 public static int product(int n) {
			  int mul=1;
			 while(n!=0) {
				 int last=n%10;
				 mul=mul*last;
				  n=n/10;
			 }return mul;
		 }
		 
	}
