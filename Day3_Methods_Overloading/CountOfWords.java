package Day3_Methods_Overloading;

import java.util.Scanner;

/**
 * Description: Write a Java method to count all words in a string.i
 *
 */
public class CountOfWords {

	/**
	 * Description: Write a Java method to count all words in a string.
	 * @param sentence
	 */
	public void countWords(String sentence) {

		int count=0;  
		char ch[]= new char[sentence.length()];

		for(int i=0;i<sentence.length()-1;i++){  
			ch[i]= sentence.charAt(i);  
			if(ch[i] == ' ' || ch[i+1] != ' ') {
				count++;  
			}
		} 
		System.out.println(count);
	}
	
	/**
	 * Driver method.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		CountOfWords obj = new CountOfWords();
		obj.countWords(sentence);
	}
}
