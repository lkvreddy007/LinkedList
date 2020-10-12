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
	
	public void append(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	
	public int size() {
		INode<K> temp=head;
		while(temp!=null) {
			size=size+1;
			temp=temp.getNext();
		}
		return size;
	}
	
	public void insert(INode<K> previousNode, INode<K> newNode,INode<K> nextNode) {
		previousNode.setNext(newNode);
		newNode.setNext(nextNode);
	}
	
	public void insertInMid(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			int mid=size()/2;
			int i=0;
			INode<K> temp=this.head;
			while(i++!=mid) {
				temp=temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}
	
	public void print() {
		INode<K> x=head;
		while(x!=null) {
			System.out.println(x.getKey());
			x=x.getNext();
		}
	}
}
