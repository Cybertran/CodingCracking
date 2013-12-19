package com.jeetu.testApp.amazon.array_string;


public class UniqueString {
	
	public boolean isUnique(String name){
		boolean dup = true;
		char[]str = name.toCharArray();
		for( char s: str){
			if(isDuplicate(s,str))
				dup = false;
		}
		return dup;
	}
	
	private boolean isDuplicate(char c,char[] str){
		int count = 0;
		for(char ch : str){
			if(ch == c)
				count++;
		}
		if(count >1)
			return true;
		else
			return false;
	}

}
