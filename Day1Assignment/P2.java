package Day1Assignment;

public class P2{

	public static void main(String[] args) {
		String star = "*";
		int a =5;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		for (int i = a; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}	
	}
}
