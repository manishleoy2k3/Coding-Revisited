package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. 
 * She tabulates the number of times she breaks her season record for most points and least points in a game. 
 * Points scored in the first game establish her record for the season, and she begins counting from there.
	Example: 
	scores = [12, 24, 10, 24]
	Scores are in the same order as the games played. She tabulates her results as follows:
                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
	Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.
 * 
 * @author manishkumar
 *
 */
public class Breaking_the_Records {

	public static List<Integer> breakingRecords(List<Integer> scores) {
	    int min = 0,max = 0, minCount = 0, maxCount = 0;
	    min = max = scores.get(0);
	    
	    for(int i=1; i< scores.size(); i++){    	
	    	if(scores.get(i) > max){
	    		max= scores.get(i);
	    		maxCount++;
	    	}
	    	if(scores.get(i) < min){
	    		min= scores.get(i);
	    		minCount++;
	    	}
	    }
	    List<Integer> list= new ArrayList<>();
	    list.add(maxCount);
	    list.add(minCount);
	    return list;
	}
	
	public static void main(String[] args) {

		List<Integer> list= new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(21);
		list.add(36);
		list.add(10);
		list.add(28);
		list.add(35);
		list.add(5);
		list.add(24);
		list.add(42);
		
		List<Integer> result= new ArrayList<>();
		
		result = Breaking_the_Records.breakingRecords(list);
		for(int i=0; i< result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}
