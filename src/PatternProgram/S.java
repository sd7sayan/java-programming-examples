package PatternProgram;

import java.util.Scanner;

public class S {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int n = s.nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-2;j++) {
				if((i==1 &&j>1) || (i==n && j>1 && j!=n)|| (j==1 && (i==n-5||i==n-4)) || (j==n &&(i==n-1||i==n-2)) ||(i==n-3 && j>1 &&j!=n)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
