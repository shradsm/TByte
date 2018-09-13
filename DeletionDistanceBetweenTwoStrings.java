package TripleByte;

import java.util.ArrayList;
import java.util.List;

public class DeletionDistanceBetweenTwoStrings {
/**
 * Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings equal.
Example 1:
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(ascii_deletion("sea","eat"));
	}
	
	public static int ascii_deletion(String s1,String s2) {
		int sum =0;
		//assume is s2 is longer string
		List<Integer> chars = new ArrayList<>();
		StringBuilder builder = new StringBuilder(s2);
		
		List<Integer> charsIndexOfCommonCharInSecondString = new ArrayList<>();
		for(int i =0;i<s1.length();i++) {
			char c = s1.charAt(i);
			int indexofCharinOtherString = s2.indexOf(c);
			int charval = c;
			if(indexofCharinOtherString==-1) {
				chars.add(charval);
				sum = sum+charval;
			}
			else {
				//int index= s1.indexOf(c);
				builder.deleteCharAt(builder.indexOf(String.valueOf(c)));
			//	charsIndexOfCommonCharInSecondString.add(s2.indexOf(c));
			}
		}
		for(int i =0;i<builder.length();i++) {
			sum = sum+Integer.valueOf(builder.charAt(i));
		}
		
		
		return sum;
		
		
	}

}
