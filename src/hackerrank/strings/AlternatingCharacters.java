package hackerrank.strings;

/**
 * You are given a string containing characters A and B only. 
 * Your task is to change it into a string such that there are no matching adjacent characters. 
 * To do this, you are allowed to delete zero or more characters in the string.
 * Your task is to find the minimum number of required deletions.
 * 
 * @author manishkumar
 *
 */
public class AlternatingCharacters {

    public static int alternatingCharacters(String s) {
    	int count=0, j=1;
    	StringBuilder sbldr = new StringBuilder(s);
    	for(int i=0; i< sbldr.length() && j<sbldr.length(); ){
    		Character ch = Character.toLowerCase(sbldr.charAt(i));
    		Character chNext = Character.toLowerCase(sbldr.charAt(j));
    		if(ch == chNext){
    			sbldr.deleteCharAt(j);
    			count++;    			
    		}else {
    			i++;
    			j++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		 System.out.println(AlternatingCharacters.alternatingCharacters("AAABBB"));
	}
}
