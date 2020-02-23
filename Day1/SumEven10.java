package Day1;

public class SumEven10 {

	public static void main(String[] args) {
//		byte by = 0;
		int Even = 2;
		int total = 0;
		int counter=0;
		
		 while(counter<=10) {
			 if(Even%2 == 0)
				 {
				 total = total + Even;
				 counter++;
				 }
			 Even++;
		 }
		 System.out.println(total);
		 

	}
}
