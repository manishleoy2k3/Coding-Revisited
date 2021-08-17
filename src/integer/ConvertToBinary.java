package integer;

import java.util.ArrayList;
import java.util.List;

public class ConvertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		int n=125; int k=0;
		int count=0;
		while(n>0) {
			k = n%2;
			n = n/2;
			list.add(k);
		}
		for(int i=list.size()-1; i >=0 ; i--) {
			if(list.get(i) ==1) {
				count++;
			}else {
				count=0; 
			}
			System.out.print(list.get(i));
		}
		System.out.print("   :"+count);
	}

}
