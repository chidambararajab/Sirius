package Day2;

public class ArrayOne {

	public static void main(String[] args) {
		int odd = 7;
		int[] arr = new int[odd];
		int a = 1;
		int count =0;
		
		for (int i = 0; i < odd; i++) {
				if(count <= 7) {
				arr[i] = a;
				a = a +2;
				count++;
				}
		}
		
		for (int i = 0; i < odd; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
