package hackerrank.strings;

/**
 * In this challenge, you will determine whether a string is funny or not. 
 * To determine whether a string is funny, create a copy of the string in reverse e.g. abc->cba. 
 * Iterating through each string, compare the absolute difference in the ascii values of 
 * the characters at positions 0 and 1, 1 and 2 and so on to the end. 
 * 
 * If the list of absolute differences is the same for both strings, they are funny.
 * 
 * Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny. 
 * 
 * Example:
 * S="lmnop"
 * 
 * The ordinal values of the characters are [108,109,110,111,112]. reverse="ponml" and the ordinals are [112,111,11,109,108]. 
 * The absolute differences of the adjacent elements for both strings are [1,1,1,1], so the answer is Funny.
 * 
 * @author Manish Kumar
 *
 */
public class FunnyStrings {

    public static String funnyString(String s) {    	
    	StringBuilder input1 = new StringBuilder();
    	String rev = input1.append(s).reverse().toString();
    	
    	int[] ar1 = new int[s.length()];
    	int[] ar2 = new int[s.length()];
    	
    	int[] diff1 = new int[s.length()-1];
    	int[] diff2 = new int[s.length()-1];
    	
        for(int i=0; i< s.length(); i++){
        	ar1[i] =(int) (s.charAt(i));
        	ar2[i] =(int) (rev.charAt(i));
        }
        System.out.println(" ");
        for(int i=1; i< s.length(); i++){
        	diff1[i-1] = Math.abs(ar1[i] - ar1[i-1]);
        	diff2[i-1] = Math.abs(ar2[i] - ar2[i-1]);
        }
        int j=0;
        for(; j < diff1.length; j++){
        	if(diff1[j] != diff2[j])
        		break;
        }
        if(j == diff1.length) return "Funny";
        else return "Not Funny";
    }

    
	public static void main(String[] args) {
		System.out.println(FunnyStrings.funnyString("bcxz"));
	}
}
