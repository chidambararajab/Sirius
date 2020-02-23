package Day1Assignment;

public class P1 {

	public static void main(String[] args) {

		int a = 5;
//		int space = a-1;
		for (int i=0; i<a; i++) 
		{
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=(2*i); j++)
			{
				System.out.print("*");
			}
			System.out.println();
//			space--;
		}	
	}
}
