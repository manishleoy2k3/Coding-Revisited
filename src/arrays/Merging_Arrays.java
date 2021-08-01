package arrays;

import java.util.HashMap;
import java.util.Map;

public class Merging_Arrays {
	public static void main(String[] args) {

		int[] num1= {1,3,5,7};
		int[] num2= {2,4,6};
		//int[] num3= new int[num1.length+num2.length];
		
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i=0; i<num1.length; i++) {
			map.put(num1[i], true);
		}
		
		for(int j=0; j<num2.length; j++) {
			map.put(num2[j], true);
		}
		for(Map.Entry<Integer, Boolean> me: map.entrySet()) {
			System.out.println(me.getKey());
		}
	}

}
