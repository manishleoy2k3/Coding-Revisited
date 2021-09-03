package hackerrank.integer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class SumXOR {

	/*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    	int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1; // divides by 2
        }
    	return count;
    }

    /*
     * Complete the 'theGreatXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER x as parameter.
     */

    public static long theGreatXor(long x) {
    	/*int count = 0;
		int xor=0;
        for(int i=1; i < x; i++){
        	xor = i ^ x;
        	if(xor > x)
        		count++;
        }
    	return count;*/
    	
    	// did not understand but it is working awesome
    	return (Long.highestOneBit(x)<<1)-x-1;
    }
    
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("src\\Test.txt");
		System.out.println(file);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long x = Long.parseLong(bufferedReader.readLine().trim());

                long result = SumXOR.theGreatXor(x);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
	}
}
