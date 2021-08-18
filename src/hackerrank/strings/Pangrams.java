package hackerrank.strngs;

import java.util.HashSet;

public class Pangrams {

	/*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    
    	int count=0;
    	HashSet<Character> hs = new HashSet<Character>();
    	
    	for(int i=0; i<s.length(); i++){
    		if(hs.add(Character.toLowerCase(s.charAt(i))) && s.charAt(i) != ' ')
    		count++;
    		
    	}
    	System.out.println("Count is :" +count);
    	System.out.print(hs.toString());
    	if(count==26) return "pangram";
    	else return "not pangram";
    }
    //qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun
    
	public static void main(String[] args) {
		String test="qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";
		
		System.out.println(Pangrams.pangrams(test));
	}
}
