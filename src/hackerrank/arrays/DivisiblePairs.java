package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers and a positive integer k, 
 * determine the number of (i,j) pairs where i<j and ar[i] + ar[j] is divisible by k.
 * 
 * Example:
 * ar = [1,2,3,4,5,6]
 * k=5
 * 
 * Three pairs meet the criteria: [1,4], [2,3] and [4,6].
 * 
 * @author manishkumar
 *
 */
public class DivisiblePairs {

	/*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    	int count=0;
    	for(int i=0; i< n-1; i++){
    		for(int j=n-1; i<j && j>0; j--){
    			if(((ar.get(i)+ar.get(j))% k) == 0){
    				count++;
    				//System.out.println(ar.get(i) + "+"+ ar.get(j));
    			}
    		}
    	}
    	return count;
    }
    
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(1);
		list.add(2);
		System.out.println(DivisiblePairs.divisibleSumPairs(6, 3, list));
	}
}
