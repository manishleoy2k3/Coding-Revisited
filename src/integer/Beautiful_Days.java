package integer;

import java.util.ArrayList;
import java.util.List;

public class Beautiful_Days {

	/*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
    	int m=0, num=0;
    	for(int l=i; l <=j; l++){
    		num=l;
    		int rev=0;
    		
    		while (num != 0) {
    			rev = rev * 10 + (num % 10);
    			num = num / 10;
    		}    		
    		if((Math.abs(l-rev)%k) == 0) m++;
    	}
    	return m;
    }
    
	public static void main(String[] args) {
		
		//Printing staircase
		/*for (int i=1; i<=6; i++) {
	    	System.out.println(new String(new char[6-i]).replace("\0", " ") + new String(new char[i]).replace("\0", "#"));
	    }*/
		
		
		 //long min=0, max=0;
		 List<Integer> arr = new ArrayList<Integer>();
		 arr.add(7);
		 arr.add(7);
		 arr.add(17);
		 arr.add(69);
		 arr.add(2);
		 arr.add(1);
		 arr.add(3);
		 arr.add(221);
		 arr.add(74);
		 /*arr.sort(null);
		 for(int i=0; i<arr.size(); i++){
			 if(i != arr.size()-1) min=min+arr.get(i);
			 if(i!=0) max=max+arr.get(i);
		 }
		 System.out.print(min +"  " + max);
		*/ 
		
		int max=0, count=0;
        for(int i=0; i<arr.size(); i++){
           if(arr.get(i) >=max){
               max=arr.get(i);
               count++;
           }
        }
        System.out.println(count);
        
		//System.out.println(Beautiful_Days.beautifulDays(10, 23, 6));
	}
}
