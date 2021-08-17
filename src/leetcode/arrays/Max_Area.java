package leetcode.arrays;

/**
 * you are given an array of positive integers where each integer represents the height
 * of a vertical line on a chart. Find two lines which together with the x-axis forms a
 * container that would hold the greatest amount of water.Return the area of water it
 * would hold.
 *  
 * @author Manish
 *
 */
public class Max_Area {

	public static void main(String[] args) {

		int[] arr= {4,8,1,2,3,9};
		int max_area=0;
		int new_area=0;
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			new_area = Math.min(arr[i], arr[j]) * (j-i);
			max_area = Math.max(new_area , max_area);
			if(arr[i]<= arr[j])
				i++;
			else
				j--;
		}
		System.out.println(max_area);
	}

}
