package Day2Assignment;

public class A17_prime_number {

	public static void main(String[] args) {
		int input = 1000;
		
		String  primenumb = "";

		for (int i = 1; i <= input; i++)         
		{ 		  	  
			int counter=0; 	  
			for(int j =i; j>=1; j--)
			{
				if(i%j==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primenumb = primenumb + i + " ";
			}	
		}	
		System.out.println(primenumb);
	}
}
