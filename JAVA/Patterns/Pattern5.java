package Patterns;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[]args) {
		
		/*
		 1
		 12
		 123
		 1234
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the tringular pattern : ");
		int N = scan.nextInt();
		
		for(int i =1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
}
