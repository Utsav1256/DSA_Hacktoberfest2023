package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		/*
		 1
		 23
		 456
		 78910
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the tringular pattern : ");
		int N = scan.nextInt();

		int count = 1;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

}
