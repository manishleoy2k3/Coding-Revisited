package leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortArrayIncreasing_Frequency {

	public static int[] frequencySort(int[] nums) {
		
		/*Map<Integer,Integer> m=new HashMap<>();
	    for(int i=0;i<nums.length;i++){
	        if(m.containsKey(nums[i]))
	            m.put(nums[i],m.get(nums[i])+1);
	        else
	            m.put(nums[i],1);
	    }
	    
	    List<Map.Entry<Integer,Integer>> l=new LinkedList<>(m.entrySet());
	    Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
	        public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
	            if(o1.getValue()-o2.getValue()==0)
	                return o2.getKey()-o1.getKey();
	            else
	                return o1.getValue()-o2.getValue();
	        }
	    });
	    int k=0;
	    for(int i=0;i<l.size();i++){
	        int x=l.get(i).getValue();
	        while(x>0){
	            nums[k++]=l.get(i).getKey();
	            x--;
	        }
	    }
	    for(int a=0; a<nums.length; a++) {
	    	System.out.print(nums[a]);
	    }
	    return nums;*/
		
		//Logic2:
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>(nums.length);
		for(int i=0; i < nums.length; i++) {
        	list.add(i, nums[i]);
        }
        Map<Integer, Integer> mp= new HashMap<Integer, Integer>();        
        for (int i = 0; i < nums.length; i++) {
        	if (mp.containsKey(nums[i]))
        		mp.put(nums[i], mp.get(nums[i]) + 1);
        	else
        		mp.put(nums[i], 1);
        }
        // custom Comparator to sort array
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                if (mp.get(n1) - mp.get(n2) ==0)
                	return n2 - n1;
                else
                	return mp.get(n1) - mp.get(n2);
            }
        });
        int[] res = new int[list.size()];
        for(int i=0; i<res.length; i++) {
        	res[i] = list.get(i); 
        }
        return res;
    }
	public static void main(String[] args) {
		int arr[] = {-1,1,-6,4,5,-6,1,4,1}; //{1,5,0,5};
		SortArrayIncreasing_Frequency.frequencySort(arr);
	}

}
