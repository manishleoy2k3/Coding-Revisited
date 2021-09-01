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
		for(int i=l; i<= r; i++){
			for(int j=l; j< r; j++){
				max = Math.max(max, (i ^ j));
				//System.out.print(i +" + "+ j +" => "+ max);
				//System.out.println("");
			}
		}
		max = Math.max(max, (r^r));
        return max;
    }
 
	public static void main(String[] args) {
		System.out.println(Maximizing_XOR.maximizingXor(11, 100));
	}
}
