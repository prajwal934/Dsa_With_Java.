package praj;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println("It, look like this.");
		
		for(int i=0;i<n;i++) {
			// for the space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" "); 
			}
//			for the star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
//			for the space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
