package Day2Assignment;

public class A14_upper_right_triangle_add_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		int total = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (i <= j)  
				{ 
					total += input[i][j]; 
				} 
			} 
		}
		System.out.println("Upper sum is " + total); 
	}
}