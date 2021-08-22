package hackerrank.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Calculator{
	int power(int n, int p) throws Exception {
		if(n<0 || p<0) {
			throw new Exception("n and p should be non-negative");
		}
		long result = 1;

	    for (; p != 0; --p) {
	      result *= n;
	    }
		return (int) result;
	}
	
	/*
	 * Complete the 'closestNumbers' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static List<Integer> closestNumbers(List<Integer> arr) {
		List<Integer> result = new ArrayList<Integer>();
		
		Collections.sort(arr);
		result.add(arr.get(0));
		result.add(arr.get(1));
		
		int diff1=0;
		int diff= Math.abs((result.get(1) - result.get(0)));
		
		for(int i=2; i< arr.size()-1; i++) {
			diff1 = Math.abs((result.get(i) - result.get(i-1)));
			if(diff == diff1) {
				result.add(arr.get(i));
				result.add(arr.get(i+1));
			}
		}
		return result;
	}
}

public class Calculator_Example {
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		System.out.println(Calculator.closestNumbers(arr));
		
		/*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();*/
	}

}
