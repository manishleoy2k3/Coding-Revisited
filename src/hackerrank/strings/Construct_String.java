package hackerrank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Construct_String {

	/**
 * Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :

Append a character to the end of string  at a cost of  dollar.
Choose any substring of  and append it to the end of  at no charge.
Given  strings , find and print the minimum cost of copying each  to  on a new line.

For example, given a string , it can be copied for  dollars. Start by copying ,  and  individually at a cost of  dollar per character. String  at this time. Copy  to the end of  at no cost to complete the copy.

Function Description

Complete the stringConstruction function in the editor below. It should return the minimum cost of copying a string.
 * @author manishkumar
 *
 */

    public static int stringConstruction(String s) {
    	if (s.length() < 2)
        	return 1;
    	return (int) s.chars().distinct().count();
    }
    
    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    	if(s.isEmpty()) return "NO";
        if(s.length() <= 3) return "YES";
        
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i=0;
        while(letters[i]==0){
            i++;
        }
        
        int min = letters[i];   //the smallest frequency of some letter
        int max = letters[25]; // the largest frequency of some letter
        String ret = "NO";
        if(min == max) ret = "YES";
        else{
            // remove one letter at higher frequency or the lower frequency
            if(((max - min == 1) && (max > letters[24])) ||
                (min == 1) && (letters[i+1] == max))
                ret = "YES";
        }
        return ret;
        
        //HashMap Implementation
    	/*HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	boolean bool = true;
    	for(char ch : s.toCharArray()) {
	        if (map.containsKey(ch))
	        	map.put(ch, map.get(ch) + 1);
	        else
	        	map.put(ch, 1);
	    }
    	for(Entry<Character, Integer> itr : map.entrySet()) {
	        if (itr.getValue() != 1){
	        	if(itr.getValue() > 2)
	        		bool = false;
	        }
	    }
    	if(bool)
    		return "NO";
    	else
    		return "YES";*/
    }
	public static void main(String[] args) {
		//System.out.println(Construct_String.stringConstruction("abnabn"));
		System.out.println(Construct_String.isValid("abccc"));
	}
}
