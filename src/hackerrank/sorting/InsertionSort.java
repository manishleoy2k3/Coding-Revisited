package hackerrank.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {

	public static void insertionSort2(int n, List<Integer> arr) {
		int runtime=0;
		for(int i = 1; i < arr.size(); i++){
            int value = arr.get(i);
            int j = i - 1;
            while(j >= 0 && arr.get(j) > value){
            	arr.set(j+1, arr.get(j));
                j = j - 1;
                runtime++;
            }
            arr.set(j+1, value);
            for(int k: arr){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
		//return runtime;
	}
	public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }
	static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
	/*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    	int tmp=arr.get(arr.size()-1);
    	boolean b=true;
    	
    	for(int i=arr.size()-1; i> 0 && b; i--){
    		if(tmp < arr.get(i-1)){
    			arr.set(i, arr.get(i-1));
    		}else{
    			arr.set(i, tmp);
    			b=false;
    		}
    		for(int j=0; j<= arr.size()-1; j++){
    			System.out.print(arr.get(j) + " ");
    		}
    		System.out.println();
    	}
    	if(b){
    		arr.set(0, tmp);
    		for(int j=0; j<= arr.size()-1; j++){
    			System.out.print(arr.get(j) + " ");
    		}
    		System.out.println();
    	}
    }
    
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		//2 3 4 5 6 7 8 9 10 1
		//3 4 7 5 6 2 1
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		arr.add(1);
		//arr.add(9);
		//arr.add(10);
		//arr.add(1);
		InsertionSort.insertionSort1(5, arr);
	}
}
