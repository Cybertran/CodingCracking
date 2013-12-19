package com.jeetu.testApp;

import java.util.ArrayList;

import com.jeetu.testApp.amazon.ReverseChar;
import com.jeetu.testApp.amazon.UniqueString;






public class Program {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> testCase = new ArrayList<String>();
		testCase.add("Jitendra");
		testCase.add("jitendrra");
		testCase.add("jitenierda");
		testCase.add("jjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		testCase.add("unique");
		testCase.add("Final test case is");
		UniqueString st = new UniqueString();
		ReverseChar  rChar = new ReverseChar();
		for(String s: testCase){
		System.out.println(s +" ==> "+ rChar.reverseIt(s));;
		}
		
	
		
	   
	}
	
	
}
