package leetcode.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Given an array of integers nums. A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs. 
 * 
 * Example 1:  Input: nums = [1,2,3,1,1,3] Output: 4 
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed. 
 * 
 * Example 2: Input: nums = [1,1,1,1] Output: 6 
 * Explanation: Each pair in the array are good. 
 * 
 * Example 3: Input: nums = [1,2,3] Output: 0 
 * 
 * Constraints: 
 * 1 <= nums.length <= 100 
 * 1 <= nums[i] <= 100
 * 
 * @author manishkumar
 *
 */
public class IdenticalPairs {

	public static int numIdenticalPairs(int[] nums) {
		/* Brute Force Logic to solve this problem */
		/*int count=0;
		for(int i=0; i< nums.length; i++){
			for(int j=0; j<nums.length; j++){
				if(nums[i] == nums[j] && i<j){
					count++;
				}
			}
		}		
		return count;*/
		
		/* Optimized solution to this Problem */
		//Hint: Count how many times each number appears. 
		//If a number appears n times, then n * (n – 1) // 2 good pairs can be made with this number.
		int sum =0, j=0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< nums.length; i++){
			Integer freq = map.get(nums[i]);
			map.put(nums[i], (freq == null) ? 1 : freq + 1);
		}
		//System.out.println(map);
		
		// get entrySet
        //Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        //System.out.println("EntrySet: "+entrySet);
 
        // get keySet
        //Set<Integer> keySet = map.keySet();
        //System.out.println("keySet: "+keySet);
 
        // get values
        //Collection<Integer> values = map.values();
       // System.out.println("values: "+values);
        
        //System.out.println("Iterating over HashMap's entrySet with iterator");
		
		    // Iterating HashMap through for loop
        for (Map.Entry<Integer, Integer> set :
            map.entrySet()) {
            //System.out.println(set.getKey() + " = " + set.getValue());
            j = set.getValue();
            sum = sum + ((j*(j-1))/2);
        }
        /*Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Entry<Integer, Integer> next = iterator.next();
            j = next.getValue();
            //System.out.println(next.getKey()+" --> "+next.getValue());
            sum = sum + ((j*(j-1))/2);
        }*/
		return sum;
    }

	public static void main(String[] args) {
		int[] num ={1,2,3,1,1,3};
		System.out.println(IdenticalPairs.numIdenticalPairs(num));
	}
}
