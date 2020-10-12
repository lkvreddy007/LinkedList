package com.capg;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		Node<Integer> myFirstNode=new Node<>(70);
		Node<Integer> mySecondNode=new Node<>(30);
		Node<Integer> myThirdNode=new Node<>(56);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		Assert.assertEquals(mySecondNode, myFirstNode.getNext());
		Assert.assertEquals(myThirdNode, mySecondNode.getNext());
	}
}
