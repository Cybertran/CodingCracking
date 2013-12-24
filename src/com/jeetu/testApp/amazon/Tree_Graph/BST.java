package com.jeetu.testApp.amazon.Tree_Graph;

import java.util.Comparator;

public class BST<T> {

	private static class Node<T> {
		private Node<T> left, right;
		private T data;

		public Node(T data, Node<T> left, Node<T> right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

	}

	private Node<T> root;
	private int n;
	private Comparator<T> comparator;

	public BST(Comparator<T> comp) {
		assert comp != null;

		this.n = 0;
		this.root = null;
		this.comparator = comp;
	}

	public void insert(T item) {
		if (item == null)
			return;

		if (root == null) {
			Node<T> node = new Node<T>(item, null, null);
			root = node;
			root.left = null;
			root.right = null;
		} else {
			insert(item, root);
		}
		n++;
	}

	private void insert(T item, Node<T> root) {
		int res = comparator.compare(item, root.data);
		if (res > 0) {
			if (root.right == null) {
				Node<T> node = new Node<T>(item, null, null);
				root.right = node;
			} else {
				insert(item, root.right);
			}
		} else {
			if (root.left == null) {
				Node<T> node = new Node<T>(item, null, null);
				root.left = node;
			} else {
				insert(item, root.left);
			}
		}

	}

	public void displayPreOrder() {
		displayPreOrder(root);
	}

	private void displayPreOrder(Node<T> root) {
		if (root == null)
			return;
		System.out.println(root.data);
		if (root.left != null) {
			displayPreOrder(root.left);
		}
		if (root.right != null) {
			displayPreOrder(root.right);
		}
	}
	
	public void postOrder(){
		displayPost(root);
		
	}

	private void displayPost(Node<T> root){
		if(root == null) return ;
           if(root.left !=null){
        	   displayPost(root.left);
           }
           if(root.right != null){
        	   displayPost(root.right);
           }
           System.out.println(root.data);
	}
	public void inOrder(){
		displayInorder(root);
	}
	private void displayInorder(Node<T> root){
		if(root == null) return ;
		if(root.left !=null){
			displayInorder(root.left);
		}
		System.out.println(root.data);
		if(root.right !=null){
			displayInorder(root.right);
		}
	}
	
	public void searchItem(T item){
		if(root == null) return;
         T data =	search(root , item);
         if(data !=null)
			System.out.println(data +" is found");
         else
			System.out.println("item not found");
	}
	private T search(Node<T> root , T item){
		T itemData = null;
	       int res = comparator.compare(item,root.data);
            if(res > 0){
            	if(root.right !=null)
            	return search(root.right, item);
            	else
            		itemData = root.data;
            } else if(res < 0){
				if (root.left != null)
					return search(root.left, item);
				else
					itemData = root.data;
            }
		
		 return itemData;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testCase = { 10, 6, 4, 8, 12, 11, 15,9};

		BST<Integer> tree = new BST<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a != null && b != null) {
					return a - b;
				} else if (a != null && b == null) {
					return a;
				} else if (a == null && b != null) {
					return b;
				}
				return 0;
			}
		});
		for (int i = 0; i < testCase.length; i++) {
			tree.insert(testCase[i]);
		}
		System.out.println("pre order");
		tree.displayPreOrder();
		System.out.println("post order");
		tree.postOrder();
		System.out.println("in order");
		tree.inOrder();
		
		tree.searchItem(7);

	}

}
