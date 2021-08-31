package hackerrank.integer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day26_Nested_Logic {

	/*private static char[] calculateFine(int[][] arr) {
		
		return null;
	}*/
	
	private static char[] calculateFine(List<List<Integer>> date_returned, List<List<Integer>> due_date) {
		
		for(int i=0; i < date_returned.size()-1; i++) {
			System.out.println(date_returned.get(i));
			System.out.println(due_date.get(i));
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		/*Scanner scan = new Scanner(System.in);
        int arr[][] = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        System.out.println(calculateFine(arr));
        System.out.println(arr);*/
        
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> date_returned = new ArrayList<>();
        List<List<Integer>> due_date = new ArrayList<>();
        
        IntStream.range(0, 2).forEach(i -> {
            try {
                date_returned.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList()));
                due_date.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList()));
                //System.out.println(date_returned);
                //System.out.println(due_date);
                System.out.println(calculateFine(date_returned, due_date));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
	}
}