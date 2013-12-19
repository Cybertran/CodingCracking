package com.jeetu.testApp.advanceDataStructure;

public class ArrayDeque<T> {
	T[]a;
	int j;
	int n;
	
	public T get(int i){
		T y = a[(j+i)% a.length];
		return y;
	}
	
	public T set(int i ,T x){
		T y = a[(j+i)% a.length];
		a[(j+i)% a.length] = x;
		return y;
	}
	
	public void add(int i , T x){
		if( n+1 > a.length) resize();
		if(i <  n/2){
			// move element left side from i make free space
			j = (j == 0)? a.length -1:j-1;
			for( int k = 0; k< i-1 ;k++ ){
				a[(k+j)% a.length] = a[(k+j+1) % a.length];
			}
			
		}else{
			// move element Right from i side and search free space
			for( int k = n ; k >i ;k--){
				a[(k+j)% a.length] = a[(k+j-1)% a.length];
			}
			a[(j+i) % a.length] = x;
			n++;
		}
	}
	
	private void resize(){
		
	}

}
