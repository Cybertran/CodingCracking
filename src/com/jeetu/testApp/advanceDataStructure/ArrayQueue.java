package com.jeetu.testApp.advanceDataStructure;

import java.util.NoSuchElementException;

public class ArrayQueue<T> {
	T[]a ;
	int j;
	int n;
	

	public boolean add(T x){
		if(n+1 > a.length) resize();
		a[(j+n) % a.length] =x;
		n++;
		return true;
	}
	
	public T remove(){
		if(n == 0) throw new NoSuchElementException();
		T x = a[j];
		j = (j+1)% a.length;
		n--;
		if(a.length >= 3*n) resize();
		return x;
	}
	
	public void resize(){
		T[]b =(T[]) new Object[n*2];
		for (int k = 0; k < n; k++)
		b[k] = a[(j+k) % a.length];
		a = b;
		j = 0;
		
		
	}
	public void displayQueue(){
		for( int i =0 ;i < a.length; i++){
			System.out.print(a[i]);
			System.out.print("\t");
		}
	}

}
