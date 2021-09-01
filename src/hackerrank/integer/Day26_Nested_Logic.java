package hackerrank.integer;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Day26_Nested_Logic {
	
	private static int calculateFine(List<Integer> date_returned, List<Integer> due_date) {
		
		int fine=0;
		int due_year = due_date.get(2);
		int year_returned = date_returned.get(2);
		if(year_returned > due_year) { // year is different
			fine = 10000;
		}else if(year_returned < due_year){
			fine = 0;
		}else { // year is same
			if(date_returned.get(1) <= due_date.get(1)) { // month is same
				if(date_returned.get(0) <= due_date.get(0)){
					fine = 0;
				}else{
					fine = 15 * Math.abs(date_returned.get(0) - due_date.get(0));
				}
			}else if(date_returned.get(1) > due_date.get(1)){ //month is different
				fine = 500 * Math.abs(date_returned.get(1) - due_date.get(1));
			}
		}
		return fine;
	}
	
	public static void main(String[] args) throws IOException { 
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> date_returned = new ArrayList<Integer>();
        List<Integer> due_date = new ArrayList<>();
        try {
        	date_returned = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());                             
        	due_date = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());                
        } catch (IOException ex) {
        	throw new RuntimeException(ex);
        }
        System.out.println(calculateFine(date_returned, due_date));
        
        bufferedReader.close();
	}
}
