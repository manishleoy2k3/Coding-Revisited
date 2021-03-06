package leetcode.integer;


public class Reverse_Integer {

	/**
	 * Given a signed 32-bit integer x, return x with its digits reversed. If
	 * reversing x causes the value to go outside the signed 32-bit integer range
	 * [-231, 231 - 1], then return 0. Assume the environment does not allow you to
	 * store 64-bit integers (signed or unsigned). 
	 * 
	 * Example 1: Input: x = 123 Output: 321
	 * Example 2: Input: x = -123 Output: -321
	 * Example 3: Input: x = 120 Output: 21
	 * 
	 * Constraints: -231 <= x <= 231 - 1
	 * 
	 * @param x
	 * @return
	 */
	public static int reverse_Integer(int x) {		
		int max = Integer.MAX_VALUE / 10, min = Integer.MIN_VALUE / 10;
		int k = 0;

		while (x != 0) {
			k = k * 10 + (x % 10);
			x = x / 10;

			//Handling edge/exceptional cases
			if (x != 0 && (k > max || k < min)) {
				return 0;
			} else if (k == max) {
				if (x > 7)
					return 0;
			} else if (k == min) {
				if (x < -8)
					return 0;
			}
		}
		return k;
	}
	
	public boolean isPalindrome(int x) {
		int i=x;
		int max = Integer.MAX_VALUE / 10, min = Integer.MIN_VALUE / 10;
		int k = 0;
		//for negative values and number multiple of 10 or ending with 0
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
		while (x != 0) {
			k = k * 10 + (x % 10);
			x = x / 10;
			//Handling edge/exceptional cases
			if (x != 0 && (k > max || k < min)) {
				return false;
			} else if (k == max) {
				if (x > 7)
					return false;
			} else if (k == min) {
				if (x < -8)
					return false;
			}
		}
		if(k==i)return true;
		else return false;
	}
	
	public static String isPallindrom(int x, int y){
	if(x==y) 
		return "palindrom";
	else return "Not Pallindrom";
	}
	public static void main(String[] args) {

		int num1 = -121;
		System.out.println(Reverse_Integer.isPallindrom(num1, Reverse_Integer.reverse_Integer(num1)));
		System.out.println(Reverse_Integer.reverse_Integer(num1));
	}
}
