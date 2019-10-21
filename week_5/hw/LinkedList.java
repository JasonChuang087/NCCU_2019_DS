
public class LinkedList<T> {
	
	private class Node{
		public T t;
		public Node next;
	}
	
	private int index = 0;
	private int size = 0;
	private Node current;
	private Node head;
	
	
	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
		return 0;
	}
	public void resetIndex() {
		index = 0;
		current = head;
	}
	public void add(T t) {
		
	}
	public void add(int index, T t) {
		
	}
	
	public T get(int index) {
		return null;
	}
	public T remove(int index) {
		return null;
	}
	
	public void printList() {
		//print the list 
	}
	

}
