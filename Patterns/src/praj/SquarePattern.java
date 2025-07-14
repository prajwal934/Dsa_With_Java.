package praj;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
//		Now, We're going to print the patterns
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
