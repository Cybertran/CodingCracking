package com.jeetu.testApp.amazon.array_string;

public class StringPermutation {
	

	public boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
		return false;
		}
		 int[] letters = new int[256]; // Assumption
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
		letters[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
		int c = (int) t.charAt(i);
		if (--letters[c] < 0) {
		return false;
		}
		}
		return true;
	}
	
	public static void main(String[]args){
		StringPermutation param = new StringPermutation();
		System.out.println(param.permutation("jitendra", "jitendra"));
	}
}
