package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Example 1: Input: nums = [2,2,1] Output: 1 
 * Example 2: Input: nums = [4,1,2,1,2] Output: 4 
 * Example 3: Input: nums = [1] Output: 1
 * 
 * @author manishkumar
 *
 */
public class Single_Number {

	public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
        	if(!set.contains(nums[i])){
        		set.add(nums[i]);
        	}else{
        		set.remove(nums[i]);
        	}
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        return array[0];
    }

	public static void main(String[] args) {
		int[] num ={1};
		System.out.println(Single_Number.singleNumber(num));
	}
}
