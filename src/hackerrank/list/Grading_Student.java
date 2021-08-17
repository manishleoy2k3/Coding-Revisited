package hackerrank.list;

import java.util.ArrayList;
import java.util.List;

public class Grading_Student {

	/*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> finalGrades = new ArrayList<Integer>();
    	int val=0, remainder =0;
    	
    	for(int i=0; i<grades.size(); i++){
    		val = grades.get(i);
    		remainder = val %5;
			if((5 - remainder) < 3 && val >= 38){
				finalGrades.add(val+(5-remainder));
			}else {
				finalGrades.add(val);
			}
		}
    	return finalGrades;
    }

    
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list_finalGrades = new ArrayList<Integer>();
		list.add(70);
		list.add(67);
		list.add(39);
		list.add(37);
				
		list_finalGrades = Grading_Student.gradingStudents(list);
		
		for(int i=0; i<list_finalGrades.size(); i++){
			System.out.println(list_finalGrades.get(i));
		}
	}
}
