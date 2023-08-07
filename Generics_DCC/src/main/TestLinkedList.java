package main;
import linkedlist.*;

public class TestLinkedList {

	public static void main(String[] args) {
		
		//Non-Generic Test Group
		LinkedList myList = new LinkedList();
		Node aNode = new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		Node tempnode = myList.getList();
		do {
			System.out.println(tempnode.getData());
			tempnode = tempnode.getNextNode();
		} while (tempnode != null);

		//Generic Integer Test Group
		GenericLinkedList genInt = new GenericLinkedList();
		GenericNode<Integer> intNode = new GenericNode<Integer>();
		intNode.setData(3);
		genInt.addGenericNode(intNode);
		intNode = new GenericNode();
		intNode.setData(8);
		genInt.addGenericNode(intNode);
		GenericNode tempIntNode = genInt.getGenList();
		do {
			System.out.println(tempIntNode.getData());
			tempIntNode = tempIntNode.getNextGenericNode();
		} while (tempIntNode != null);
		
		//Generic Double Test Group
		GenericLinkedList genDouble = new GenericLinkedList();
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		doubleNode.setData(5.29);
		genDouble.addGenericNode(doubleNode);
		doubleNode = new GenericNode();
		doubleNode.setData(10.321);
		genDouble.addGenericNode(doubleNode);
		GenericNode tempDoubleNode = genDouble.getGenList();
		do {
			System.out.println(tempDoubleNode.getData());
			tempDoubleNode = tempDoubleNode.getNextGenericNode();
		} while (tempDoubleNode != null);
		
		//Generic String Test Group
		GenericLinkedList genString = new GenericLinkedList();
		GenericNode<String> stringNode = new GenericNode<String>();
		stringNode.setData("Oh my");
		genString.addGenericNode(stringNode);
		stringNode = new GenericNode();
		stringNode.setData("Sheesh");
		genString.addGenericNode(stringNode);
		GenericNode tempStringNode = genString.getGenList();
		do {
			System.out.println(tempStringNode.getData());
			tempStringNode = tempStringNode.getNextGenericNode();
		} while (tempStringNode != null);
		
	}//end main

}//end class
