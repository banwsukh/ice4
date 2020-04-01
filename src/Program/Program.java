/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author vicba
 */
public class Program {
	//calculate num of times c appears in s	
	public int numOfOccurences(char c, String s) {
		if (s.length() == 0) return 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
			};
			
		}	
		return count;
	}
	
	//Find the highest value char in a string. Return 0 in case of empty string
	public char maxChar(String s) {
		if (s.length() == 0) return 0;
		char highestVal = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (highestVal < s.charAt(i)) {
				highestVal = s.charAt(i);
			};
			
		}	
		return highestVal;
	
	}

	public boolean charExists(char c, String s) {
		if (s.length() == 0) return false;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				return true;
			};
			
		}	
		return false;
	
	}


}
