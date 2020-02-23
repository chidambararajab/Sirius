package Day2Assignment;

//Done.

public class A12_total_individual_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 90909;
		int numbtotal = 0;
		
		while(numb > 0) {
			int temp = numb%10;
			numbtotal = numbtotal + temp;
			numb = numb/10;
		}
		System.out.println(numbtotal);
	}

}
