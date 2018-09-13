package TripleByte;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringIsCorrectlyMatched {
/**
 * Given an array of strings containing three types of braces: round (), square [] and curly {}
 *  Your task is to write a function that checks whether the braces in each string are correctly 
 *  matched. Prints no of braces it would take to make the string matched and if it is matched print 0
 * @param args
 */
	final static String NO = "NO";
	final static String YES = "YES";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // String s="({})";
        	//String s = "{{[[(())]]}}";
        	String s = "{[(])}";
         //balancedOrNot(s);
		
		System.out.println( balancedOrNot(s));
		
	}
	
	public static String balancedOrNot(String s) {
		if(s==null || s.equals("")) {
			return NO;
		}
		Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<s.length();i++) {
			if((s.charAt(i)=='{') || (s.charAt(i)=='(' ) || (s.charAt(i)=='[')) {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i)=='}') {
				if(stack.isEmpty() || stack.peek() !='{') {
					return NO;
				}
				stack.pop();
				
			}
			else if(s.charAt(i)==')') {
				if(stack.isEmpty() || stack.peek() !='(' ) {
					return NO;
				}
				stack.pop();
			}
			else if(s.charAt(i)==']') {
				if(stack.isEmpty() || stack.peek() !='[' ) {
					return NO;
				}
				stack.pop();
			}
		
		}

		if(stack.isEmpty()) {
			return YES;	
		}
		return NO;
		
		
	}
}
