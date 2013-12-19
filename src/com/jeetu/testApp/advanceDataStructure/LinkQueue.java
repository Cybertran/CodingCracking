package com.jeetu.testApp.advanceDataStructure;

public class LinkQueue<T> {
	
	Node head;
	Node tail;
	int n;
	
	public boolean add(T x){
		Node<T> node = new Node<T>();
		node.x = x;
		/*
		 * if Queue is Empty then new node will be my first Node
		 */
		if(n == 0){
          head = node;
		}else{
			tail.next = node;
		}
		tail = node;
		n++;
		
		return true;
	}
	public T remove(){
		T x = (T) head.x;
		head = head.next;
		if(--n == 0) tail = null;
			return x;
	}
}
