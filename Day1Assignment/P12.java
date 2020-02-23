package Day1Assignment;

public class P12 {


		public static void main(String[] args) {

			int a = 5;
			for (int i=0; i<a; i++) 
			{
				for (int j = i; j < a; j++) {
					System.out.print(" ");
				}
				for (int j=0; j<=(2*i); j++)
				{
					if(j==0 || j==2*i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}	
			
			
		for (int i=a-2; i>=0; i--) 
	{
		for (int j = i; j < a; j++) {
			System.out.print(" ");
		
		}
		for (int j=0; j<=(2*i); j++)
		{
			if(j==0 || j==2*i)
				System.out.print("*");
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}		
		}
}
