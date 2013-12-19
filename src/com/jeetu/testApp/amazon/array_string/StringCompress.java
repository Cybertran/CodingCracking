package com.jeetu.testApp.amazon.array_string;


public class StringCompress {
	
	public String getCompressedString(String str){
		char[]arr = str.toCharArray();
		StringBuffer bf = new StringBuffer();
		for(int i= 0;i<arr.length;){
			String sub = str.substring(i);
			int count = countChar(arr[i],sub.toCharArray());
			if(count >1)
			bf.append(arr[i]).append(count);
			else
				bf.append(arr[i]);
			i = i+count;
		}
		   if(str.length() < bf.toString().length()){
			   return str;
		   }else{
			   return bf.toString();
		   }
	}
	
	public int countChar(char ch,char[]sub){
		int count =0;
		for(char c: sub){
			if(c == ch)
				count++;
			else
				break;
		}
		return count;
	}
	
	public static void main(String[]args){
		StringCompress com = new StringCompress();
		String[] testCase = {"aaabccccaaddr","aaaaaaaaaaaabbb","fffcsddsgnjdkfnggfs","sgkgfdsjidsfsadfds","jitendra"};
		for(int i = 0;i<testCase.length ;i++)
		System.out.println("case :"+i+" \t "+testCase[i]+" ===> "+com.getCompressedString(testCase[i]));
	}

}
