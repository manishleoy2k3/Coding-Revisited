package hackerrank.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * There is a large pile of socks that must be paired by color. 
 * Given an array of integers representing the color of each sock, 
 * determine how many pairs of socks with matching colors there are.
 * 
 * Example: n=7, ar=[1,2,1,2,1,3,2]
 * There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. 
 * The number of pairs is 2
 * 
 * Function Description: 
 * Complete the sockMerchant function in the editor below.sockMerchant has the following parameter(s):
 * int n: the number of socks in the pile 
 * int ar[n]: the colors of each sock 
 * Returns : int: the number of pairs
 * 
 * @author manishkumar
 *
 */
public class SocksMerchant {

	/*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar.get(i))) {
                colors.add(ar.get(i));
            } else {
                pairs++;
                colors.remove(ar.get(i));
            }
        }
        return pairs;
    }
    
	public static void main(String[] args) {
		int n=9;
		List<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(20);
		System.out.println("Pair of socks are: "+SocksMerchant.sockMerchant(n, ar));
	}

}
