package com.jeetu.testApp.advanceDataStructure;

public class ListStack<T> {
	
	Node head ;
	Node tail;
	int n;
		
	public T push(T x){
		Node<T> node = new Node<T>();
		node.x = x;
		node.next = head;
		head = node;
		if(n == 0){
			tail = node;
		}
		n++;
		return x;
	}
 /*
  * FIFO Queue Operation
  */
	
	public boolean add(T x){
			Node<T> node = new Node<T>();
			node.x = x ;
			if(n == 0){
			head = node;
		}else{
			tail.next = node;
		}
			tail = node;
			n++;
			return true;
	}
	
	/*
	 * Fifo remove Element;
	 *
	 */
	public T remove(){
       if(n == 0) return null;
       T x = (T) head.x;
       head = head.next;
       
       if(--n == 0) tail = null;
       return x;
	}
	public T pop(){
		if(n == 0){
			return null;
		}
		T x = (T) head.x;
		head.next = head.next;
		if(--n == 0)tail = null;
		return x;
	}
	private class Node<T>{
		T x;
		Node next;
	}

}
