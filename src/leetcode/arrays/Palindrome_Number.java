package leetcode.arrays;

public class Palindrome_Number {

	public static boolean isPalindrome(int x) {
		int max = Integer.MAX_VALUE / 10, min = Integer.MIN_VALUE / 10;
		int k = 0, orig=x;

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
		if(k==orig) return true;
		else return false;
    }
	public static void main(String[] args) {

		int i=126;
		System.out.println(Palindrome_Number.isPalindrome(i));
	}

}
