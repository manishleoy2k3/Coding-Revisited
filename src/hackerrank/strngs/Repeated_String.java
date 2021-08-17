package strings;

/**
 * There is a string, s , of lowercase English letters that is repeated infinitely many times. 
 * Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.
 * 
 * Example: s= "abcac" n=10
 * The substring we consider is abcacabcac, the first 10 characters of the infinite string. 
 * There are 4 occurrences of a in the substring.

 * @author manishkumar
 *
 */
public class Repeated_String {

	 /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	long numberOfReps = n/s.length();
        long remainder = n%s.length();
        long total = 0;
        for(int a = 0; a < s.length(); a++){
            if(s.charAt(a) == 'a'){
                total++;
            }
        }
        total = total * numberOfReps;
        for(int a = 0; a < remainder; a++){
             if(s.charAt(a) == 'a'){
                total++;
            }
        }
        System.out.println(total);
    	return total;
    	
    	/*long ret=0;
    	int repCount=0;
    	char[] inp = s.toCharArray();
    	long len=s.length();
    	
    	if(s.length() == 0) return 0;
    	if(s.length() == 1) return n;
    	
    	for (int i = 0; i < s.length(); i++) {
    			if (inp[i] == 'a')	repCount++;
    	}
    	ret= ((n/len)*repCount)  + n%len;
    	return ret;	*/   
  
    }

	public static void main(String[] args) {
		String s="aba";
		long n =10;
		System.out.println(Repeated_String.repeatedString(s, 10));
	}
}
