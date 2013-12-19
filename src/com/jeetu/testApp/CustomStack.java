package com.jeetu.testApp;

import java.util.Arrays;

public class CustomStack<E> {
	
	protected Object[] elementData;
	protected int elementCount=-1;
	private int capacityInc;
	
	
	public CustomStack (int capacity){
		this.capacityInc=capacity;
		elementData= new Object[capacity];
	}
	
	public CustomStack() {
	elementData=new Object[5];
		
	}
	
	public void push(E item) {
		addElement(item);
		
	}
	public E  pop(int pos) {
		return (E) elementData[pos];
	}
	
	public E  pop() {
		Object itemObject=null;
		if(elementCount!=-1) {
			itemObject = elementData[elementCount--];
		}
		return (E) itemObject;
	}
	
	
	private void addElement(E item) {
			ensureCapacityHelper(elementCount+1);
			elementData[++elementCount]=item;
		
		
	}
	private void ensureCapacityHelper(int minCapacity) {
		if(minCapacity - elementData.length >= 0) {
			grow(minCapacity);
		}
	}
	
	private void grow(int size) {
		int oldCapacity=elementData.length;
		int newCapacity=oldCapacity+ ((capacityInc>0) ? capacityInc:oldCapacity);
		 if (newCapacity - size < 0)
	            newCapacity = size;
		  elementData = Arrays.copyOf(elementData, newCapacity);
	}

}
