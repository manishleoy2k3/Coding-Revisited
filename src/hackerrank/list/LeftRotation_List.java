package hackerrank.list;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation_List {
	/*
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {
    	   	
    	for(int k=0; k<d; k++){
    		int i;
    		int first = a.get(0);
    		for(i=0; i<a.size()-1; i++){
    			a.set(i, a.get(i+1));
    		}
    		a.set(i, first);
    	}    	    	
    	return a;
    }
    
    
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> rot = new ArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		rot = LeftRotation_List.rotLeft(ll, 4);
		
		for(int i=0; i< rot.size(); i++){
			System.out.println(rot.get(i));
		}
	}
}
