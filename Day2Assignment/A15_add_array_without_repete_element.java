package Day2Assignment;

import java.util.Scanner;

public class A15_add_array_without_repete_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array One Size: ");
		int n1 = sc.nextInt();

		System.out.println("Enter Array Second Size: ");
		int n2 = sc.nextInt();

		int[] a = new int[n1];
		int[] b = new int[n2];
		int[] c = new int[n1+n2];
		
		//insert array one
		for (int i = 0; i < n1; i++) {
			a[i] = sc.nextInt();
			c[i] = a[i];
		}
		
		//insert array two
		for (int i = 0; i < n2; i++) {
			b[i] = sc.nextInt();
		}
		
		boolean bool;
		int numb = n1;
		for (int i = 0; i < n2; i++) {
			bool = true;
			for (int j = 0; j < numb; j++) {
				if(b[i] == a[j]) {
					bool = false;
				}	
			}
			if(bool) {
				c[n1] = b[i];
				n1++;
			}
		}
		for (int i = 0; i < n1; i++) {
			System.out.print(c[i] +"  ");
		}
	}
}
