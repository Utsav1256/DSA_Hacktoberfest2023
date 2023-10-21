package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		/*
		 1
		 23
		 345
		 4567
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the tringular pattern : ");
		int N = scan.nextInt();

//		for(int i = 1; i <= N; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(i+j-1);
//			}
//			System.out.println();
//		}
		
//		OR,
		
		for(int i = 1; i <= N; i++) {
			int startingNum = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(startingNum);
				startingNum++;
			}
			System.out.println();
		}
	}

}
