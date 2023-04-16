package testing;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arraynumbersrange {

	public static void main(String[] args) {
	

	
	System.out.println(Arrays.toString(between(1,10)));
	
	}

	
	public static int[]between(int a,int b) {
		
		return IntStream.rangeClosed(a,b).toArray();
		
	}
	
}
