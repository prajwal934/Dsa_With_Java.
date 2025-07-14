package praj;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println("The Pattern like this");
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
