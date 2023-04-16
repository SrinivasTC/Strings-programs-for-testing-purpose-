package testing;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word="upparasrinivasulu";
    char vowels[]= {'a','e','i','o','u'};
    
   for(int i=0;i<word.length();i++) {
	   
	   char letters=word.charAt(i);
	   for(int j=0;j<vowels.length;j++) {
		   
		   
		   if(letters==vowels[j]) {
			   System.out.print(letters+",");
		   }
	   }
	   
   }
	
	
	}}

	
