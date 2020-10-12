package com.capg;

public class Node<K> implements INode<K>{
	private INode next;
	private K key;
	
	public Node(K k) {
		this.key=k;
		this.next=null;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public K getKey() {
		return key;
	}
	
	public INode getNext() {
		return next;
	}
	
	public void setNext(INode next) {
		this.next=next;
	}

}
