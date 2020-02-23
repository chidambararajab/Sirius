package Day2Assignment;

import java.util.Scanner;

public class A8_add_matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int r = sc.nextInt();
		
		System.out.println("Enter the column number: ");
		int c = sc.nextInt();
		
		int[][] numb1 = new int[r][c];
		int[][] numb2 = new int[r][c];
		int[][] result = new int[r][c];
		
		//insert matrix one
		System.out.println("Enter the 1st matrix: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				numb1[i][j] = sc.nextInt();
			}
		}
		
		//insert matrix two
		System.out.println("Enter the 2nd matrix: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				numb2[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < r; i++) {
			
			for (int j = 0; j < c; j++) {
				result[i][j] = numb1[i][j] + numb2[i][j];
				System.out.print(result[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}
}
