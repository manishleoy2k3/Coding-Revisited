package arrays;


class RotateLeft_Arrays {  
    
    public static void main(String[] args) {  
      
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 5};   
    	
        //n determine the number of times an array should be rotated  
        int n = 3;  
          
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){
            //Stores the first element of the array  
        	int j=0, first = arr[0];
            for( ; j < arr.length-1; j++){  
                //Shift element of array by one  
            	int h= arr[j+1];
                arr[j] = h;  
            }  
            //First element of array will be added to the end  
            arr[j] = first;
        }
        System.out.println();
          
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation of count : "+n);  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
