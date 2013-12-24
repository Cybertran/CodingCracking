package com.jeetu.testApp.amazon.linkedList;

public class Node<T> {
	Node<T> next = null;
	T data;
	
	public Node(T d){
		data = d;
	}
	
	public boolean addNode(T data){
		Node<T> node = new Node<T>(data);
		node.next = node;
		while(node.next != null){
			node = node.next;
		}
		node.next = node;
		return true;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
