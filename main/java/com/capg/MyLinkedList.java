package com.capg;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	int size=0;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void setHead(INode<K> head) {
		this.head=head;
	}
	
	public INode<K> getHead() {
		return this.head;
	}
	
	public void add(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			INode<K> tempNode=this.head;
			this.head=node;
			this.head.setNext(tempNode);
		}
	}
}
