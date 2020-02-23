package Day1Assignment;

public class P11 {
	public static void main(String[] args) {
		char ch = 'A';
		int a =5;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch +" ");
				ch++;
			}
			ch = 'A';
			System.out.println();
			System.out.println();
		}
	}
}
