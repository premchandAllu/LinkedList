package com.blz.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	@Test
	public void given3NumbersShouldPassLinkedListTest() {
		MyNode<Integer> firstNode=new MyNode<Integer>(56);
		MyNode<Integer> secondNode=new MyNode<Integer>(30);
		MyNode<Integer> thirdNode=new MyNode<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && 
				secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}

}