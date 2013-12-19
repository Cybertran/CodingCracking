package com.jeetu.testApp;

public class Node<E> {
	private E data;
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	private Node next;
	

	

}
