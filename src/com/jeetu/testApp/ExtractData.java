package com.jeetu.testApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class ExtractData {
	private String value;
	private String pattern;
	

	public ExtractData(String value,String pattern) {
		this.value=value;
		this.pattern=pattern;
	}
	
	public ExtractData() {
		
	}
	
	
	
	public Map<String, String> getMap(String text,String pattern){
		Map<String, String> map = new HashMap<String, String>();
		StringTokenizer textToken = new StringTokenizer(text);
		StringTokenizer patternTokens = new StringTokenizer(pattern);
		Stack<String> tokens = new Stack<String>();
		Stack<String> patterns = new Stack<String>();
		while (textToken.hasMoreElements()) {
			String token = (String) textToken.nextElement();
			tokens.push(token);

		}
		
		while (patternTokens.hasMoreElements()) {
			String token = (String) patternTokens.nextElement();
			patterns.push(token);

		}
		
		for(int i=0;i < tokens.size();i++) {
			String val=tokens.get(i);
			String patt=patterns.get(i);
			map.put(patt, val);
		}
		
		
		return map;
	}
	
	


}
