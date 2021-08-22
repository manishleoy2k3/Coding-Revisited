package hackerrank.strings;

/**
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:
 * 
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given , determine the number of words in .
 * 
 * Example:
 * There are  words in the string: 'one', 'Two', 'Three'.
 * 
 * Returns:  int: the number of words in S

 * @author manishkumar
 *
 */
public class CamelCase {

	/*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    	int wordCount=1;
    	
    	for(int i=0; i< s.length(); i++){
    		if(Character.isUpperCase(s.charAt(i))){
    			wordCount++;
    		}
    	}
    	return wordCount;
    }
    
	public static void main(String[] args) {

		String s = "oneTwoTHREE";
		System.out.println(CamelCase.camelcase(s));
	}
}
