package Programming;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= s.nextInt();
		int num2 = num+1;
		boolean flag= false;
		for(int i=1;i<=num2;i++) {
			if(i*i==num2) {
				flag=true;
				System.out.println(num+ " is sunny number");
				break;
			}
		}
		if(flag==false) {
			System.out.println(num+ " is not a sunny number");
		}

	}

}
