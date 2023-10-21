package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		/*
		 1234
		 1234
		 1234
		 1234
		*/
				
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Enter number of rows for the square pattern : ");
				int N = scan.nextInt();
				
				for(int i = 1; i <= N; i++) {
					for(int j = 1; j <= N; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
			}

}
