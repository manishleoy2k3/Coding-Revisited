package hackerrank.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* Given two strings, determine if they share a common substring. A substring may be as small as one character.
* Return YES if it shares a common substring else return NO
*/
public class TwoString {

	/*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

	public static String twoStrings(String s1, String s2) {
    	
    	/* Logic 1: Not very much Optimized*/
    	
    	/*for(int i=0; i < s1.length(); i++){    		
    		if(s2.contains(Character.toString(s1.charAt(i)))){
    			return "YES";
    		}
    	}
		return "NO";*/
    	
    	/* Logic 2: Optimized*/
    	
    	Set<String> set1 = new HashSet<String>(Arrays.asList(s1.split("")));
        Set<String> set2 = new HashSet<String>(Arrays.asList(s2.split("")));

        Set<String> set3 = new HashSet<String>(set1);
        set3.addAll(set2);
        return set3.size() == set1.size() + set2.size() ? "NO" : "YES";
    }
    
	public static void main(String[] args) {
		
		String s1 = "hi";
		String s2 = "world";
		
		System.out.println(TwoString.twoStrings(s1, s2));
	}
}
