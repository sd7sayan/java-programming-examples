package PatternProgram;

import java.util.Scanner;

public class ReverseSpacePyramid {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int n = s.nextInt();

	
		for (int i = 1; i <= n; i++) {
			int sum= n-2;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i<=j && i+j<= n*2 && j-i==sum) {
					System.out.print("* ");
					sum=sum+2;
				}
				else {
					System.out.print("  ");
				}
			
			}
			System.out.println();

		}


	}

}
