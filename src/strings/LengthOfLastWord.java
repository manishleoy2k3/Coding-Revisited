package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s consists of some words separated by some number of spaces, 
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * Example 1: Input: s = "Hello World" Output: 5 
 * Example 2: Input: s = "   fly me   to   the moon  " Output: 4 
 * Example 3: Input: s = "luffy is still joyboy" Output: 6 
 * 
 * Constraints: 
 * 1 <= s.length <= 104 
 * s consists of only English letters and spaces ' '.
 * There will be at most one word in s

 * @author manishkumar
 *
 */
public class LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		//Logic 1:
		//String[] str=s.split(" ");
		//return str[str.length-1].length();
		
		//Logic 2:
		int count=0;		
		for(int i=s.length()-1; i>=0;i--){
			if(s.charAt(i) != ' '){
				count++;
			}
			else{
				if(count >0) return count;
			}
		}
		return count;
	}

	public static String angryProfessor(int k, List<Integer> a) {
		int count=0;
	    for(int i=0; i < a.size();i++){
	    	if(a.get(i) <= 0){
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    if(count >= k){
	    	return "NO";
	    }else return "YES";
		
		//return Arrays.stream(a).filter(i -> i <= 0).count() >= k ? "NO" : "YES";
	}
	
	public static void main(String[] args) {
		
		List<Integer> in= new ArrayList<Integer>();
		in.add(0);
		in.add(-1);
		in.add(2);
		in.add(1);
		
		
		//LengthOfLastWord lword =  new LengthOfLastWord();
		System.out.println(LengthOfLastWord.angryProfessor(2, in));
		
		/*String s = "Hello world    y  ";
		LengthOfLastWord lword =  new LengthOfLastWord();
		System.out.println(lword.lengthOfLastWord(s));*/
	}
}
