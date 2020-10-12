package com.capg;

public class MyLinkedList<K> {
	public INode head;
	public INode tail;
	int size=0;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void setHead(INode head) {
		this.head=head;
	}
	
	public INode getHead() {
		return this.head;
	}
}
