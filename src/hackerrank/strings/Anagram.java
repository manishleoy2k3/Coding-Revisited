package hackerrank.strings;

import java.util.Arrays;

public class Anagram {

	/* check if two atrings are Anagram or not */
    public static void isAnagram(String s1, String s2) {
    	char[] arr1 = s1.replace("\\s", "").toLowerCase().toCharArray();
    	char[] arr2 = s2.replace("\\s", "").toLowerCase().toCharArray();
    	
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	
    	if(s1.length() != s2.length())
            System.out.println("Strings are not equal");
    	else if(Arrays.equals(arr1, arr2)){
        	System.out.println("Anagram");
        }else{
        	System.out.println("Not Anagram");
        }	
    }
	/*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER
     * The function accepts STRING s as parameter.
     */
    public static int anagram(String s) {
    	int len = s.length(), count = 0;
    	if (len % 2 != 0)
    		return -1;
    	else{
        	String s1 = s.substring(0,len/2);
            String s2 = s.substring(len/2,len);
            // store the count of character
            int char_count[] = new int[26];
      
            // iterate though the first String and update count
            for (int i = 0; i < s1.length(); i++) 
                char_count[s1.charAt(i) - 'a']++;        
      
            // iterate through the second string and update char_count.
            // if character is not found in char_count then increase count
            for (int i = 0; i < s2.length(); i++)
                char_count[s2.charAt(i) - 'a']--;
            
            
            for(int i = 0; i < 26; ++i) {
              if(char_count[i] != 0)
                count+= Math.abs(char_count[i]);
            }
    	}
    	return count/2;
    }
    /* shows the count of character from both the string whose deletion will make the two string anagram */
    public static int makingAnagrams(String s1, String s2) {
        // store the count of character
        int char_count[] = new int[26];
  
        // iterate though the first String and update count
        for (int i = 0; i < s1.length(); i++) 
            char_count[s1.charAt(i) - 'a']++;        
  
        // iterate through the second string and update char_count.
        // if character is not found in char_count then increase count
        for (int i = 0; i < s2.length(); i++)
            char_count[s2.charAt(i) - 'a']--;
        
        int count=0;
        for(int i = 0; i < 26; ++i) {
          if(char_count[i] != 0)
            count+= Math.abs(char_count[i]);
        }
    	return count;
    }
	public static void main(String[] args) {
		System.out.println(Anagram.makingAnagrams("cde", "abc"));
	}
}
