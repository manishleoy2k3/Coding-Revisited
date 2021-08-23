package leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrentNumber {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		//Arrays.sort(nums); 
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j< nums.length; j++) {
				if(j != i && nums[j] < nums[i]) {
					
				}
			}
		}
		return nums;
    }

	public static void main(String[] args) {
		
		int[] nums = {8,1,2,2,3};
		System.out.println(SmallerThanCurrentNumber.smallerNumbersThanCurrent(nums));
	}

}
