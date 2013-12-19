package com.jeetu.testApp;

public class CustomString {
	String str ="Hey how  are you ";
	
	public void printEncrypted() {
		StringBuilder sbBuilder=new StringBuilder();
		str=str.trim();
		String[]arrStrings=str.split(" ");
	for(int i=0;i<arrStrings.length-1;i++) {
		sbBuilder.append(arrStrings[i]);
		sbBuilder.append("%20");
//		System.out.println(sbBuilder.toString());
	}
	sbBuilder.append(arrStrings[arrStrings.length-1]);
		System.out.println(sbBuilder.toString());
	}
	

}
