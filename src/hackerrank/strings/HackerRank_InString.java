package hackerrank.strings;

public class HackerRank_InString {

	/*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    	String hack = "hackerrank";
    	int j = 0;
    	
    	if (s.length() < hack.length()) return "NO";
                
        for (int i = 0; i < s.length(); i++) {
            if (j < hack.length() && s.charAt(i) == hack.charAt(j)) {
            	j++;
            }
        }
        if(j == hack.length())
        	return "YES";
        else return "NO";
    }
    
	public static void main(String[] args) {
		System.out.println(HackerRank_InString.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
	}
}
