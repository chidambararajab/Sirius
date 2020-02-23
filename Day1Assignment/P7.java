package Day1Assignment;

public class P7 {

	public static void main(String[] args) {
		int a = 5;

		for (int i=a-1; i>=0; i--) 
		{
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=(2*i); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		

	}

}
