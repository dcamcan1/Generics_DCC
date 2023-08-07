package linkedlist;
/**
 * This class models a Node object which contains objects. Each
 * node has its internal data and pointers to the next node in 
 * the list. Supports creating GenericNode objects that can hold 
 * any type of object and are parameterized (integer, string, etc.).
 * 
 * @author rkelley/njohnson/Danny Cannon
 * Module 3 Programming Project
 * CS131ON
 */

public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode nextGenericNode; //pointer to the nextGenericNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextGenericNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextGenericNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return parameterized object (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode getGenericNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextGenericNode(GenericNode nextGenericNode)
	{
		this.nextGenericNode=nextGenericNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode getNextGenericNode() {
		return nextGenericNode;
	}//end getNextNode
	
}//end class
