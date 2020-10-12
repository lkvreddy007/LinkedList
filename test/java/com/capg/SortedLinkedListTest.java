package com.capg;

import org.junit.Test;

public class SortedLinkedListTest {
	@Test
	public void test() {
		Node<Integer> myFirstNode=new Node<>(70);
		Node<Integer> mySecondNode=new Node<>(30);
		Node<Integer> myThirdNode=new Node<>(56);
		SortedLinkedList<Integer> linkedList =new SortedLinkedList<Integer>();
		linkedList.sortedAdd(myFirstNode);
		linkedList.sortedAdd(mySecondNode);
		linkedList.sortedAdd(myThirdNode);
		linkedList.print();
	}
}
