package hackerrank.list;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Given two arrays of integers, find which elements in the second array are
 * missing from the first array.
 * 
 * @author manishkumar
 *
 */
public class MissingNumber {

	/*
	 * Complete the 'missingNumbers' function below. The function is expected to
	 * return an INTEGER_ARRAY. The function accepts following parameters:
	 * INTEGER_ARRAY arr and INTEGER_ARRAY brr
	 */

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		
		//optimized code
		List<Integer> result = null; //MissingNumber.missingNumbers(arr, brr);
		
		HashSet<Integer> hs=new HashSet<Integer>(arr);
        for(int i:hs) {
        	if(Collections.frequency(arr,i)!=Collections.frequency(brr,i)){
        		//System.out.print(i+" ");
        		result.add(i);
        	}
        }
        
		/* Brute force code:
		Collections.sort(arr);
		Collections.sort(brr);

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < brr.size(); j++) {
				if (brr.get(j).equals(arr.get(i))) {
					System.out.print(arr.get(i) + " , " + brr.get(j) + " ");
					brr.remove(j);
					break;
				}
			}
		}*/
		return result;

		/*
		 * List<Integer> real = new ArrayList<Integer>(); for(int i = 0; i <
		 * brr.size(); i++){ real.add(brr.get(i)); } Collections.sort(real);
		 * Collections.sort(arr); for(int j = 0; j < arr.size(); j++){ for(int k
		 * = 0; k < arr.size(); k++){ if(arr.get(j) == real.get(k)){
		 * real.remove(new Integer(arr.get(j))); break; } } } List<Integer>
		 * finalreal = real.stream().distinct().collect(Collectors.toList());
		 * Collections.sort(finalreal); return finalreal;
		 */

		// hash map implementation
		/*
		 * int[] myArray = new int[finalreal.size()]; for(int h = 0; h <
		 * finalreal.size(); h++){ myArray[h] = finalreal.get(h); }
		 * Arrays.sort(myArray); return myArray;
		 */
		/*
		 * Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		 * Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		 * 
		 * Collections.sort(arr); Collections.sort(brr);
		 * 
		 * System.out.print(arr + " "); System.out.println();
		 * System.out.print(brr + " "); System.out.println();
		 * 
		 * List<Integer> crr=null;
		 * 
		 * for(int i=0; i < arr.size(); i++){ if(map1.containsKey(arr.get(i))){
		 * map1.put(arr.get(i), map1.get(arr.get(i))+1); }else{
		 * map1.put(arr.get(i), 1); } } System.out.println(map1);
		 * 
		 * for(int j=0; j< brr.size(); j++){ if(map2.containsKey(brr.get(j))){
		 * map2.put(brr.get(j), map2.get(brr.get(j))+1); }else{
		 * map2.put(brr.get(j), 1); } } System.out.println(map2);
		 * 
		 * crr.add(1); return crr;
		 */
	}

	static int[] missingNumbers(int[] arr, int[] brr) {
		List<Integer> real = new ArrayList<Integer>();
		for (int i = 0; i < brr.length; i++) {
			real.add(brr[i]);
		}
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[j] == real.get(k)) {
					real.remove(new Integer(arr[j]));
					break;
				}
			}
		}
		List<Integer> finalreal = real.stream().distinct().collect(Collectors.toList());
		// Collections.sort(finalreal);
		// System.out.print(finalreal);

		int[] myArray = new int[finalreal.size()];
		for (int h = 0; h < finalreal.size(); h++) {
			myArray[h] = finalreal.get(h);
		}
		Arrays.sort(myArray);
		return myArray;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int m = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = MissingNumber.missingNumbers(arr, brr);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();

		/*
		 * List<Integer> arr = new ArrayList<Integer>(); arr.add(203);
		 * arr.add(204); arr.add(205); arr.add(206); arr.add(207); arr.add(208);
		 * arr.add(203); arr.add(204); arr.add(205); arr.add(206);
		 * 
		 * List<Integer> brr = new ArrayList<Integer>(); brr.add(203);
		 * brr.add(204); brr.add(204); brr.add(205); brr.add(206); brr.add(207);
		 * brr.add(205); brr.add(208); brr.add(203); brr.add(206); brr.add(205);
		 * brr.add(206); brr.add(204);
		 * 
		 * System.out.println(MissingNumber.missingNumbers(arr, brr));
		 */
	}
}
