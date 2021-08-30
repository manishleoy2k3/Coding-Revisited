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
		
		Map<Integer,Integer> m=new HashMap<>();
		
	    int n=nums.length;
	    for(int i=0;i<n;i++){
	        if(m.containsKey(nums[i])){
	            int x=m.get(nums[i]);
	            m.put(nums[i],x+1);
	        }else{
	            m.put(nums[i],1);
	        }
	    }
	    
	    List<Map.Entry<Integer,Integer>> l=new LinkedList<>(m.entrySet());
	    
	    Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
	        public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
	            if(o1.getValue()-o2.getValue()==0){
	                return o2.getKey()-o1.getKey();
	            }else{
	                return o1.getValue()-o2.getValue();
	            }
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
	    return nums;
		
		/*int[] res = null;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>(nums.length);
		//System.out.println(list.size());
		for(int i=0; i < nums.length; i++) {
        	list.add(i, nums[i]);
        }
		//System.out.println(list.toString());
        Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
        Map<Integer, Integer> mpindex= new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (mp.containsKey(nums[i])) {
        		mp.put(nums[i], mp.get(nums[i]) + 1);
        	}
        	else
        	{
        		mp.put(nums[i], 1);
        		mpindex.put(nums[i], i);
        	}
        }
        
        // custom Comparator
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2)
            {
                int freq1 = mp.get(n1);
                int freq2 = mp.get(n2);
                if (freq1 != freq2) {
                    return freq1 - freq2;
                }
                else {
                	if(n1 > n2) {
                		return n1;
                	}else {
                		return n2;
                	}else {
                		// Elements with lesser index gets higher priority
                        return mpindex.get(n2) - mpindex.get(n1);
                	}
                }
            }
        });
        System.out.println(list);
        res = new int[list.size()];
        for(int i=0; i<res.length; i++) {
        	res[i] = list.get(i); 
        }
        return res;*/
    }
	public static void main(String[] args) {
		int arr[] = {1,5,0,5};
		SortArrayIncreasing_Frequency.frequencySort(arr);
	}

}
