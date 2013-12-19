package com.jeetu.testApp.advanceDataStructure;

import java.lang.reflect.Array;
import java.util.List;


public class RootisArray<T> {
	List<T[]>  blocks;
	int n;
	Class<T> type ;
	
	public RootisArray(Class<T> type){
		this.type = type;
	}
	private int i2b(int i){
		double db = (-3+ Math.sqrt(9+8*i))/2.0;
		int block =(int)Math.ceil(db);
		return block;
	}
	
	public T get(int i){
		int b = i2b(i);
		int k = i - b*(b+1)/2;
		return blocks.get(b)[k];
	}
	public T set(int i, T x){
		int b = i2b(i);
		int k = i-b*(b+1)/2;
		T y = blocks.get(b)[k];
		blocks.get(b)[k] = x;
		return y;
		
	}
	
	public void add(int i , T x){
		int r = blocks.size() ;
		if(r*(r+1)/2 == n+1) grow();
		n++;
		for(int j = n-1;j >i ; j-- ){
			set(j,get(j-1));
		}
		set(i,x);
	}
	public T remove(int i){
           T x = get(i);
           /*
            * shift element left side
            */
           
           for(int j = i;j< n-1 ;j++){
        	   set(j , get(j+1));
           }
           n--;
           int r = blocks.size();
           if((r-2)*(r-1)/2 >= n) shrink();
           return x;
	}
	@SuppressWarnings("unchecked")
	private void grow(){
		blocks.add((T[]) Array.newInstance(type, 1));
		
	}
	private void shrink(){
		int  r =blocks.size();
		while (r >0 && (r-1)*(r-2)/2 >=n){
			blocks.remove(blocks.size()-1);
			r--;
		}
	}

}
