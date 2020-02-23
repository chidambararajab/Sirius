package Day2Assignment;

public class A9_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numb = {1,2,3,4,5};
		
		for (int i = 0; i < numb.length-1; i++) {
			for (int j = i+1; j < numb.length; j++) {
				int temp = numb[i];
				numb[i] = numb[j];
				numb[j] = temp;
			}
		}
//		System.out.print("{");
		for (int i = 0; i < numb.length; i++) {
			System.out.print(numb[i]+", ");
		}
//		System.out.print("}");
		
	}
}
