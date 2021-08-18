package hackerrank.strngs;

public class FunnyStrings {

	/*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

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
