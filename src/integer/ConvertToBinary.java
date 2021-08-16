package integer;


public class ConvertToBinary {
	
	public static void main(String[] args) {
		int n = 125;
		
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
