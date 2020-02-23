package Day7;

public class ExpectionExample3 {
	public static void main(String[] args) {
		
		int a=0;
		
		try {
			a = 25/0;
		}catch(NullPointerException np) {
			System.out.println("Null");
		}finally {
			System.out.println("Finally");
		}
	}
}
