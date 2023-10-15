package PatternProgram;

import java.util.Scanner;

public class RightHollowPyramid {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int n = s.nextInt();

		for (int i = 1; i <= n * 2 - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n || i + j == n + 1 || i - j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}

	}

}
