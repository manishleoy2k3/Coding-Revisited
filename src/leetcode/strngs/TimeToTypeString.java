package leetcode.strngs;

/**
 * https://leetcode.com/problems/single-row-keyboard (premium)
 * 
 * Imagine you have a special keyboard with all keys in a single row. 
 * The layout of characters on a keyboard is denoted by a string keyboard of length 26. 
 * Initially your finger is at index 0. To type a character, 
 * you have to move your finger to the index of the desired character. 
 * The time taken to move your finger from index i to index j is abs(j - i).
 * 
 * Given a string keyboard that describe the keyboard layout and a string text, 
 * return an integer denoting the time taken to type string text.
 * 
 * Example 1: Input: keyboard = "abcdefghijklmnopqrstuvwxy", text = "cba"   Output: 4
 * 
 * Explanation:
 * Initially your finger is at index 0. First you have to type 'c'. 
 * The time taken to type 'c' will be abs(2 - 0) = 2 because character 'c' is at index 2.
 * The second character is 'b' and your finger is now at index 2. 
 * The time taken to type 'b' will be abs(1 - 2) = 1 because character 'b' is at index 1.
 * The third character is 'a' and your finger is now at index 1. 
 * The time taken to type 'a' will be abs(0 - 1) = 1 because character 'a' is at index 0.
 * The total time will therefore be 2 + 1 + 1 = 4.
 * 
 */
public class TimeToTypeString {

	public static void main(String[] args) {
		
		String keyboard = "abcdefghijklmnopqrstuvwxy";
		String text = "cba";
		
		
		
	}
}
