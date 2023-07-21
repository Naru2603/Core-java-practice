package com.string.practical;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		
		String s1="Listen";
		String s2="Silent";
		
		String res=isAnagramString(s1, s2)?"Anagram String":"Not Anagram String";
		
		System.err.println(res);
	}

	private static boolean isAnagramString(String s1, String s2) {
		
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			if(s1 != null && s2 != null) {
			
				if(s2.length()==s2.length()) {
					char [] s1Chars=s1.toCharArray();
					char [] s2Chars=s2.toCharArray();
					
					Arrays.sort(s1Chars);
					Arrays.sort(s2Chars);
					
					if(Arrays.equals(s1Chars, s2Chars)) {
						return true;
					}
				
			}
				
		
	}
			else 
				return false;
			
			return false;
	}
}
