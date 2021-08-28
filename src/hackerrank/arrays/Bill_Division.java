package hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;

public class Bill_Division {

	/*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    	int bill_sum =0, bill_charged=0;    	
    	for(int i=0; i<bill.size(); i++){
    		if(i!=k){
    			bill_sum = bill_sum + bill.get(i);
    		}
    	}
    	bill_charged = bill_sum/2;
    	if(bill_charged == b){
    		System.out.println("Bon Appetit");
    	}else{
    		System.out.println(b-bill_charged);
    	}
    }
    
	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<Integer>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);
		Bill_Division.bonAppetit(bill, 1, 7);
	}
}
