package com.jeetu.testApp.advanceDataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;




public class ArrayStack<T> {
	T[]a;
	int n;
	Class<T> type;
	Stack<Integer> s= new Stack<Integer>();
	@SuppressWarnings("unchecked")
	public ArrayStack(Class<T> type){
		a = (T[]) Array.newInstance(type, 0);
		this.type = type;
	}
	public int getSize(){
		return n;
	}
	
	public T get(int i){
		return a[i];
	}
	
	public T set(int i,T x){
		T y = a[i];
		a[i] = x;
		return y;
	}
	
	public void add (int i,T x){
		if(n +1 > a.length) resize();
		for( int j = n ;j < i ;j--){
			a[j] = a[j-1];
			a[i] = x;
			n++;
			
		}
		
	}
	public T remove(int i){
		T y = a[i];
		for(int j =i; j< n-1 ;j++ ){
			a[j] = a[j+1];
			n--;
		}
		if(a.length >= 3*n) resize();
		return y;
	}
	
	private void resize(){
	@SuppressWarnings("unchecked")
	T[]b = (T[]) Array.newInstance(type, n*2);
	for( int i =0;i < n;i++){
		b[i] = a[i];
	}
	 a= b;
	}
	
	/*Highly optimize method for copying array */
	
	private void  resizeOptimize(){
		T[]b =(T[]) new Object[n*2];
		System.arraycopy(a, 0, b, 0, n);
		a=b;
		
	}
	
	public void addOptimize(int i, T x){
		if(n+1 > a.length) resize();
		System.arraycopy(a, i, a, i+1, n-1);
		a[i] = x;
		n++;
	}
	public T removeOptimize(int i){
		T y =a[i];
		System.arraycopy(a, i, a, i-1, n-1);
		n--;
		if(a.length >= 3*n) resize();
		return y;
	}
	
	public void display(){
		for(int i =0; i<a.length ; i++){
			System.out.print(a[i]);
			System.out.print("\t");
		}
	}
	
	


}
