package leetcode.arrays;


public class Remove_duplicates {

	/*
	Remove Duplicates from Sorted Array.

	Algorithm:
	1. let i and j be two pointers
	2. initially i=0th index
	             j=1st index
	3. if value at ith and jth index are same then increment j
	4. if values are not same then we increment i and copy value from jth index to ith index and then increment j
	*/
	public static int removeDuplicates(int[] nums) {
		int i=0, j=1;
		if(nums.length==1 ||nums.length==0 )
        {
            return nums.length;
        }
		for(; j<nums.length; ){
        	if(nums[i] != nums[j]){
        		i++;
        		nums[i]=nums[j];
        	}
        	j++;
        }
		return i+1;
    }

	public static void main(String[] args) {

		int[] nums = {1,1,1,2};
		
		System.out.println(Remove_duplicates.removeDuplicates(nums));
	}

}
