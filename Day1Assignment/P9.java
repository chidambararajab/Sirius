package Day1Assignment;

public class P9 {
	
	public static void main(String[] args) {
		int val = 5;
		int a = 0;
		
		for (int i = 0; i <val; i++) {
			for (int j = 0; j <val; j++) {
				System.out.print(a);
				a = (a==0)?1:0;
			}
			System.out.println();
		}
	}
}
