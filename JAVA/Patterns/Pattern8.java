package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
//		Character pattern
		/*
		 ABCD
		 ABCD
		 ABCD
		 ABCD
		*/
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the square character pattern : ");
		int N = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				//System.out.print('A'+j-1);// --> it will print integer(ascii values)
				System.out.print((char)('A' + j - 1));// --> we have to explicitly type-cast it
				
			}
			System.out.println();
		}
	}

}
