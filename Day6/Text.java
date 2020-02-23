package Day6;

/**
 * Decleration: Implement the equals method in if conditon to print true or false.
 *
 */
public class Text {
	protected int a= 1;
	protected int b= 2;
	
	/**
	 * equalTo method to check the object variable is equal or not.
	 * @param k
	 * @return
	 */
	protected boolean equalTo(Text k) {
		if(this.a == k.a && this.b == k.b) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Decleration: Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text obj = new Text(); 
		Text obj1 = new Text();
		
		if (obj.equalTo(obj1)) {
			System.out.println("Equal");
		}else{
			System.out.println("Object(obj) is not equal");
		}
	}
}

