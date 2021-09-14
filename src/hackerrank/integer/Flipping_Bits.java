package hackerrank.integer;

public class Flipping_Bits {
	static long pow(int base , int exponent)
    {
        long result = 1;
        while( exponent != 0)
        {
            result *= base;
            --exponent;
        }
        return result;
    }
	
	public static long flippingBits(long n){
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		long k=0; int j=arr.length-1;		
		//converting decimal to binary
		while(n>0) {
			k = n%2;
			n = n/2;
			arr[j] = (int) k;
			j--;
		}
		//flip the bits
		for(int i=0; i < arr.length; i++) {
			if(arr[i] ==1)
				arr[i] = 0;
			else
				arr[i] = 1;
		}
		//converting binary back to decimal
		long decimal = 0; int exp = 0;
        for( int i = arr.length - 1; i > -1; i--){
            decimal += arr[i] * pow(2, exp);
            exp++;
        }
        return decimal;
	}
	public static void main(String[] args) {
		long n=2;
		System.out.println(Flipping_Bits.flippingBits(n));
	}
}
