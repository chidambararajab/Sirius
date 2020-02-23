package Day2Assignment;

/*
 * Description: Reversing the words in a sentence.
 */
public class A6_reversing_words_sentence {
	/**
	 * Description: Given Input String get reversed as an letters in the words without spaces.
	 * 
	 */
public static void main(String[] args) {
	String sentence = "my name is chidambararajab";
    int length = sentence.length()-1;
    String reverse = "", temp = "";
    
    for(int i = 0; i <= length; i++){
    	
        temp = temp + sentence.charAt(i);
        if((sentence.charAt(i) == ' ') || (i == length)){
        	
            for(int j = temp.length()-1; j >= 0; j--){
                reverse = reverse + temp.charAt(j);
                if((j == 0) && (i != length))
                    reverse = reverse + " ";
            }
            
            temp = "";
        }
        
    }
    System.out.println(reverse);
}
}