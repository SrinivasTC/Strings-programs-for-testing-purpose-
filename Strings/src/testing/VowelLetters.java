package testing;

public class VowelLetters {

	public static void main(String[] args) {
		
		 // Given string word 

		String word="upparasrinivasulu";  
		
		 // Representing vowels as array
		
		char[]vowels= {'a','e','i','o','u'};  
		
		
		  //Writing for loop the word  to store all  individual character in char c variable 
		
		for(int i=0;i<word.length();i++) {   
			
			
			char c=word.charAt(i);
			
			// writing for loop for vowels array in which we can print all vowels from array 
		
		for(int j=0;j<vowels.length;j++) { 
			
			if(c==vowels[j]) {// comparing string characters with vowels variable j 
				
				// printing c variables with spliting characters with , in console 
			
			
				System.out.print(c+ "," );
				
	
		}}}}}
		
	


