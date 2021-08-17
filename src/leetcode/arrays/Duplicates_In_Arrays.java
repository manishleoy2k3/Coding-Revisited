package arrays;


public class Duplicates_In_Arrays {

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
		for(;j<nums.length; ){
        	if(nums[i] != nums[j]){
        		i++;
        		nums[i]=nums[j];
        	}
        	j++;
        }
		return i+1;
    }
	
	/**
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
	 * The relative order of the elements may be changed.
	 * Since it is impossible to change the length of the array in some languages, 
	 * you must instead have the result be placed in the first part of the array nums. 
	 * More formally, if there are k elements after removing the duplicates, 
	 * then the first k elements of nums should hold the final result. 
	 * 
	 * It does not matter what you leave beyond the first k elements.
	 * Return k after placing the final result in the first k slots of nums.
	 * Do not allocate extra space for another array. You must do this by modifying the 
	 * input array in-place with O(1) extra memory.
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
		int n = nums.length;
        if(n==0) return 0;
        if(n==1 && nums[0]!=val) return 1;
        if(n==1 && nums[0]==val) return 0;
        
		int i=0, j=n-1;
		
		while(i<j){
        	if(nums[i] == val){
        		int tmp = nums[i];
        		nums[i] = nums[j];
        		nums[j] = tmp;
        		j--;
        	}
        	else i++;
        }
		
		while(i>=0 && nums[i] == val) i--;
        if (i == 0 && nums[i]==val) return 0; 
                
		return i+1;
    }

	public static void main(String[] args) {

		int[] nums = {3,6,3,6,7,8,3};
		
		System.out.println(Duplicates_In_Arrays.removeElement(nums, 3));
		//System.out.println(Remove_duplicates.removeDuplicates(nums));
	}
}
