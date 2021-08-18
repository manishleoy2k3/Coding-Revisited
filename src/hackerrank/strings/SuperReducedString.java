package hackerrank.strngs;

/**
 * Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. 
 * In each operation, select a pair of adjacent letters that match, and delete them.
 * 
 * Delete as many characters as possible using this method and return the resulting string. 
 * If the final string is empty, return Empty String
 * 
 * Example. aab shortens to b in one operation: remove the adjacent a characters.
 * Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.
 * 
 * @author manishkumar
 *
 */
public class SuperReducedString {

	public static String superReducedString(String s) {	    
	    for(int i=1; i<s.length(); i++){
	        if(s.charAt(i)==s.charAt(i-1)){
	        	s = s.substring(0, i-1) + s.substring(i+1);
                i = 0;
	        }
	    }
	    if (s.length() == 0) return "";
        else return s;
	}
	    
	public static void main(String[] args) {
		System.out.println(SuperReducedString.superReducedString("abaabamkm"));
		
		/*String s="SachinTendulkar";    
		System.out.println("Original String: " + s);  
		System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
		System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
		 */
	}
}
