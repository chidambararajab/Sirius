package Day2Assignment;

public class A4_check_particular_value_array {
	public static void main(String[] args) {
		
		int[] numb = {1,2,3,4,5,6,2,3,4};
		int val = 4;
		int count = 0;
		
		for (int i = 0; i < numb.length; i++) {
			if(numb[i] == val)
				count++;
		}
		if (count != 0) {
			System.out.println(val +" is present inside an Array " + count +" times");
		}
	}
}
