package hackerrank.integer;


public class ConvertToBinary {

	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<Integer>();
		int n=125; int k=0;
		int count=0, m=0;
		while(n>0) {
			k = n%2;
			n = n/2;
			list.add(k);
		}
		for(int i=list.size()-1; i >=0 ; i--) {
			if(list.get(i) ==1) {
				count++;
				if(count > m) {
					m=count;
				}
			}else {
				count=0; 
			}
			System.out.print(list.get(i));
		}
		System.out.print("Max count of 1 in this binary number is   :"+m);
	}*/

		int n = 9;
		
		/* Logic No - 1*/
		int consec1=0;
	    String strBinary = Integer.toString(n, 2);
	    System.out.println(strBinary);
	    
	   // above is binary of given in in string
	    String[] strparts = strBinary.split("0");
	    
	    //above we get all strings of ones, below find max from them
	    for(int i=0;i<strparts.length;i++ ){
	        if(consec1 < strparts[i].length()){
	        	consec1 = strparts[i].length();
	        }
	    }
	    System.out.println(consec1);  //result
	    
	    
		/* Logic No - 2*/
        int rem=0,min=0,max=0;
        while(n >0){
        	rem = n%2;
            n = n/2;
            if(rem==1){
            	min++;
            	if(min>max){
            		max=min;
            	}
            }else{
            	min=0;
            }
        }
        System.out.println(max);
	}
}
