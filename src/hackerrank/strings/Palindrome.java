package hackerrank.strings;

public class Palindrome {

	// New logic to check for Palindrome
	public static void isPalindromeWord(String str){
		int count=0, i=0, j=str.length()-1;
    	while(i<j){    		
    		count = count + Math.abs(str.charAt(i) - str.charAt(j));
    		i++; j--;
    	}
    	if(count ==0)
    		System.out.println("Palindrome");
    	else
    		System.out.println("Not a Palindrome");
	}
	
	public static boolean isPalindrome(String s) {
        boolean bool = true;
        int len = s.length();
        int i=0, j=len-1;
        
        s= s.toLowerCase();
        if(len ==0){
        	return true;
        }
        while(i < len && j >=0){
        	if(!Character.isLetterOrDigit(s.charAt(i))){
        		i++;
        		continue;
        	}
        	if(!Character.isLetterOrDigit(s.charAt(j))){
        		j--;
        		continue;
        	}
        	if(s.charAt(i) == s.charAt(j)){
        		i++;
        		j--;
    		}else{
                return false;
            }
        }
        return bool;
    }

	public static void main(String[] args) {
		
		String str = "A man, a plan, a canal: Panama";
		//System.out.println(Palindrome.isPalindrome(str));
		
		Palindrome.isPalindromeWord("cat");
	}
}
