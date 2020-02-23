package Day3_Methods_Overloading;

/**
 * Description: Check for Armstrong number program using methods.
 *
 */
public class Amstrong {	
	/**
	 * Description: Armstrong number program methods for 
	 * find the digit.
	 * @param temp
	 * @param power
	 * @return
	 */
	public int powerMethod(int temp, int power) {

		while(temp/10 != 0) {
			power = power + 1;
			temp = temp/10;
		}

		return power;
	}

	/**
	 * Description: Armstrong number program methods for 
	 * find the power of digit and and the values.
	 * @param sum
	 * @param mul
	 * @param power
	 * @param temp
	 * @param numb
	 */
	public void checkMethod(int sum,int mul,int power, int temp, int numb) {
		while(temp != 0) {
			int a = temp%10;
			int b = a;
			mul = power;

			while(mul-1 != 0){
				a =a*b;
				mul--;
			}
			sum = sum + a;
			temp = temp/10;
		}
		String res = (numb==sum)?"A-N":"Not";
		System.out.println(res);
	}
	
	/**
	 * * Description: driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = 153;
		int power = 1;
		int sum = 0;
		int temp = numb;
		int mul = 0;
		Amstrong obj = new Amstrong();
		obj.powerMethod(temp, power);
		temp = numb;
		obj.checkMethod(sum, mul, power, temp,numb);

	}
}