package arrays;

public class PlusOne {
		
	public static int[] plusOne(int[] digits){
		for (int i = digits.length-1; i>=0; i--) { 
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i] += 1;
                return digits;
            }     
        }
        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
	}
	
	public static void main(String[] args) {
		
		int[] digits = {9,9,9};
		int[] result = new int[3];
		result = PlusOne.plusOne(digits);
		
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}
