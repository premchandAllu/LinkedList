package com.blz.LinkedList;

public class LinkedListTest<K> {

	public INode head;
	public INode tail;
	public int size = 0;

	public LinkedListTest() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			} else {
				tempNode = tempNode.getNext();
			}
		}
		return null;
	}

	public INode searchAndInsert(K key, INode newNode) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			} else {
				tempNode = tempNode.getNext();
			}
		}
		INode tempNode1 = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(tempNode1);
		return tempNode;
	}

	public void deleteAndReturnSizeOfList(INode deleteNode) {
		INode tempNode = this.head;
		INode prev = null;

		while (tempNode!= null && tempNode.getKey()!=deleteNode.getKey()) {
			prev = tempNode;
			tempNode = tempNode.getNext();
		}
		prev.setNext(tempNode.getNext());
		tempNode.setNext(null);
	}

	public int size() {
		INode<K> n = head;
		// for each node in the linked list
		while (n != null) {
			size++;
			n = n.getNext();
		}
		// if it is not found in list, return false
		return size;
	}

	public <K extends Comparable<K>> void sortList() {
		INode<K> current = this.head;
		INode<K> index = null;
		K temp = null;
		if (this.head == null) {
			return;
		} else {
			while (current != null) {
				index = current.getNext();
				while(index!=null) {
					if(maximum(index.getKey(),current.getKey())) {
						temp=current.getKey();
						current.setKey(index.getKey());
						index.setKey(temp);
					}
					index=index.getNext();
				}
				current=current.getNext();
			}
		}
	}

	private static <K extends Comparable<K>> boolean maximum(K key1, K key2) {
		K max=key1;
		if(key2.compareTo(max)>0) {
			return true;
		}
		else
			return false;
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}