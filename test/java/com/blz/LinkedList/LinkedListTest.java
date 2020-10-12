package com.blz.LinkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3NumbersAddedFromTopTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersAppendedFromLastTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		boolean result = myLinkedList.head.equals(thirdNode) && myLinkedList.head.getNext().equals(secondNode)
				&& myLinkedList.tail.equals(firstNode);
		Assert.assertTrue(result);
	}
}