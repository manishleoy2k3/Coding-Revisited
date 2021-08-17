package hackerrank.integer;

public class CatAndMouse {

	// Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
    	
    	String str="";
    	if(Math.abs(z-x) == Math.abs(z-y)){
    		str="Mouse C";
    	}else if(Math.abs(z-x) > Math.abs(z-y)){
    		str="Cat B";
    	}else{
    		str="Cat A";
    	}
    	return str;
    }
    
	public static void main(String[] args) {
		
		System.out.println(CatAndMouse.catAndMouse(1, 3, 2));
	}
}
