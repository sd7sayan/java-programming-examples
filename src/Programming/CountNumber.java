package Programming;
import java.util.Scanner;
public class CountNumber {

	public static void main(String[] args) {
		int reapt=0;
		do {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		System.out.println(count(n));
		System.out.println("To continue press 1 or to exit press 2");
		reapt=s.nextInt();
		}
		while(reapt==1);
		System.out.println("Thank You");
	}
	
	public static int count(int n) {
		
		int count = 0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	

}
