package TripleByte;

public class PalindromeScore {
/**
 * 
 * palindrome score of a string is the no of chracter that did not match, not makint it palindome
 * for eg fox its reverse is xof so its score is 2 because chart at 0 and2nd index did not match
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		String str = "ctrabc" ;//"fox";
		
		int lastIndex = str.length()-1;
		for(int i =0;i<(str.length())/2;i++) {
			if(str.charAt(i)!=str.charAt(lastIndex-i)) {
				counter = counter+2;
			}
		}
		System.out.println(counter);
	}

}
