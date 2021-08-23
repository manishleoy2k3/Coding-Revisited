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
		Long diff = Long.MAX_VALUE;
        //String output =  "";
        for(int i=0;i<arr.size()-1;i++) {
           if((arr.get(i+1)-arr.get(i))  <= diff)
        	   diff = (long) (arr.get(i+1)-arr.get(i));
        }
        for(int i=0;i<arr.size()-1;i++) {
             if((arr.get(i+1)-arr.get(i)) == diff) {
            	 result.add(arr.get(i));
            	 result.add(arr.get(i+1));
                 //output += arr.get(i) + " " +arr.get(i+1)+" ";
             }
		}
		//List<Integer> result = new ArrayList<Integer>();
		/*		
		Collections.sort(arr);
		System.out.print(arr);
		result.add(arr.get(0));
		result.add(arr.get(1));		
		int diff1=0;
		int diff= Math.abs((arr.get(1) - arr.get(0)));
		
		System.out.println(diff);
		for(int i=2; i < arr.size(); i++) {
			diff1 = Math.abs((arr.get(i) - arr.get(i-1))); 
			if(diff == diff1) {
				result.add(arr.get(i-1));
				result.add(arr.get(i)); 
			}
		}
*/		return result;
	}
}
public class Calculator_Example {	
	public static void main(String[] args) {		
		List<Integer> arr = new ArrayList<Integer>();
		//-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470
		arr.add(-20); arr.add(-3916237); arr.add(-357920); arr.add(-3620601);
		arr.add(7374819); arr.add(-7330761); arr.add(30); arr.add(6246457);
		arr.add(-6461594); arr.add(-266854); arr.add(-520); arr.add(-470);
		
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
