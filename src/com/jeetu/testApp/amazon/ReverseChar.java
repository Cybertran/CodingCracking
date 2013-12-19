package com.jeetu.testApp.amazon;

public class ReverseChar {
	
	public String reverseIt(String str){
		char[] chr = str.toCharArray();
		StringBuffer bf = new StringBuffer();
		for(int i = chr.length-1 ; i>=0 ;i--){
			bf.append(chr[i]);
		}
		return bf.toString();
	}

}
