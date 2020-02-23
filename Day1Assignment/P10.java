package Day1Assignment;

public class P10 {

	public static void main(String[] args) {
		int a = 5;
		int numb = 1;


		for (int i=a-1; i>=0; i--) 
		{
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=(2*i); j++)
			{
				System.out.print(numb);
				numb++;
			}
			numb = a-i+1;
			System.out.println();
		}	
		
		
		for (int i=0; i<a; i++) 
		{
			for (int j = i; j < a; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=(2*i); j++)
			{
				System.out.print(numb);
			}
			numb = 1;
			System.out.println();
		}	




	}

}
