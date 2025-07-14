package praj;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println("Exactly, Look like this");
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n-i+1;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
