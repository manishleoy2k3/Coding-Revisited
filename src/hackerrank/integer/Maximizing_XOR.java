package hackerrank.integer;

import java.util.ArrayList;
import java.util.List;

public class Maximizing_XOR {

	private static void convertToBinary(int n){
		List<Integer> list = new ArrayList<Integer>();
		int k=0;
		while(n>0) {
			k = n%2;
			n = n/2;
			list.add(k);
		}
	}
	static int pow(int base , int exponent)
    {
        int result = 1;
        while( exponent != 0)
        {
            result *= base;
            --exponent;
        }
        return result;
    }

    public static int maximizingXor(int l, int r) {
    	int max=0;
    	int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		long k=0; int j=arr.length-1;		
		//converting decimal to binary
		
		for(int i=l; i< r; i++){
			
		}
		/*while(n>0) {
			k = n%2;
			n = n/2;
			arr[j] = (int) k;
			j--;
		}*/
		
		//converting binary back to decimal
		int decimal = 0; int exp = 0;
        for( int i = arr.length - 1; i > -1; i--){
            decimal += arr[i] * pow(2, exp);
            exp++;
        }
        return decimal;
    }
    
	public static void main(String[] args) {
		System.out.println(Maximizing_XOR.maximizingXor(11, 12));
	}
}
