package hackerrank.strings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigSorting {

	/*
     * Complete the 'bigSorting' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY unsorted as parameter.
     */

    public static List<String> bigSorting(List<String> unsorted) {
		//System.out.println(unsorted);
    	BigInteger[] sorted = new BigInteger[unsorted.size()] ;
		for(int i=0; i < unsorted.size(); i++) {
			//System.out.println(BigInteger.Parse(unsorted.get(i)));
			//sorted[i] = BigInteger.p(unsorted.get(i));
		}
		System.out.println(sorted.toString());
		//Collections.sort(unsorted);
		
		//System.out.println("after sorting..........");
    	return unsorted;
    }
    
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		
		str.add("8"); str.add("1"); str.add("2");
		str.add("100"); str.add("12303479849857341718340192371");
		str.add("3084193741082937"); str.add("3084193741082938");
		str.add("111"); str.add("200");
		
		System.out.println(BigSorting.bigSorting(str));
	}

}
