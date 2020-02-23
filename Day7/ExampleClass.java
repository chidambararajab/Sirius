package Day7;

public class ExampleClass {
	static int a=0;
	
	public static void a() {
			a = 80/0;
	}

	public static void b() {
		a();
		System.out.println("b");
	}
	
	public static void c() {
		try{
		b();
		}catch(Exception e) {
			System.out.println("");
		}
		System.out.println("c");
	}

	public static void main(String[] args) {
		c();
	}
}
