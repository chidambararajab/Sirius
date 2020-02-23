package Day7;

/**
 *IOException.
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionPresentation5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader file = new FileReader("‎⁨chikhgad⁩gc/jf");
			BufferedReader input = new BufferedReader(file);
			System.out.println("a");
			System.out.println(input.readLine());
			System.out.println("b");
			input.close();
		} catch (IOException io) {
			System.out.println("IOException");
			io.printStackTrace();
		}
	}
}
