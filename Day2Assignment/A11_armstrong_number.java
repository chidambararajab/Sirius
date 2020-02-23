package Day2Assignment;

public class A11_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 153;
		int power =1;
		int sum = 0;
		
		int temp = numb;
		
		while(temp/10 != 0) {
			power = power +1;
			temp = temp/10;
		}
		
		temp = numb;
		while(temp != 0) {
			int a = temp%10;
			int b = a;//3
			int mul = power;//3
			
			while(mul-1 != 0){
				a =a*b;//25*5 = 125
				mul--;
			}
			sum = sum + a;//27+125+1
			temp = temp/10;
		}
		String res = (numb==sum)?"A-N":"Not";
		System.out.println(res);
	}

}
