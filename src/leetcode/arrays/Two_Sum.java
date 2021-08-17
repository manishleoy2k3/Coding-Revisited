package arrays;

import java.util.HashMap;

/**
 * given an array of integer values. Find the sum of two indices value equal to given target value.
 * print the indices of such pair in the given array.
 * 
 * @author Manish
 *
 */
public class Two_Sum {
	
	public static void main(String[] args) {

		int target=11;
		int[] arr = {1,3,5,7,9,2};
		int ntf=target - arr[0];		
		
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0; i<= arr.length-1; i++) {
			ntf= target - arr[i];
			 if( map.containsKey(ntf)) {
				 System.out.println(map.get(ntf)+","+i);
			 }else {
				 map.put(arr[i], i );
			 }
		}		
	}

}
