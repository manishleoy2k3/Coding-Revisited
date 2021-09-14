package hackerrank.strings;

public class BeautifulBinaryString {
    /*
     * Complete the 'beautifulBinaryString' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING b as parameter.
     */

    public static int beautifulBinaryString(String b) {
    	int len =b.length(), newLength = b.replaceAll("010", "").length();
    	
    	return (len - newLength)/3;
    }
    
    public static void main(String[] args) {
	System.out.println(BeautifulBinaryString.beautifulBinaryString("0100101010"));
    }
}
