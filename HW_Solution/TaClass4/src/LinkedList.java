public class LinkedList<T> {
	
	private class Node{
		public T t;
		public Node next;
		public Node(T t, Node next) {
			this.t = t;
			this.next = next;
		}
	}
	
	private int index = 0;
	private int size = 0;
	private Node current;
	private Node head;
	
	
	public boolean isEmpty() {
		//
		
		
		return size == 0;
		
	}
	
	public int size() {
		//
		return size;
	}
	public void resetIndex() {
		index = 0;
		current = head;
	}
	public void add(T t)
	{
		if(size==0) 
		{
			head = new Node(t, null);
			size = 1;
			System.out.println("!");
		}
		else
		{
			System.out.println("!!");
			current = head;
			while(current.next != null)
			{
				current = current.next;
				System.out.println("!!!");
			}
			current.next = new Node(t, null);
			size++;
		}
		resetIndex();
		
	}
	public void add(int index, T t) 
	{
		//head.next = new Node(t, head.next)
		if(size < index) 
		{
			System.out.println("InvalidOperation5");
		}
		else 
		{
			System.out.println("!!!!!");
			current = head;
			if(index!=0)
			{
				System.out.println("!!!!!!");
				for(int i = 0; i <index-1;i++)
				{
					current = current.next;
				}
				current.next = new Node(t,current.next);
			}
			else 
			{
				System.out.println("!!!!!!!");
				head = new Node(t,head);
			}
		}
		
		
		resetIndex();
		size++;
	}
	
	public T get(int index)
	{
		if(size < index)
		{
			System.out.println("InvalidOperation4");
			return null;
			
		}
		else
		{
			current = head;
			for(int i = 0; i <index;i++) {
				current = current.next;
			}
			return current.t;
		}
		
		
		
		
	}
	
	public T remove(int index) 
	{
		resetIndex();
		if(index<size)
		{
			if(index>1)				
			{
				for(int i=0;i<index-1;i++)
				{
					current = current.next;
				}
				T result=current.next.t;
				current.next=current.next.next;
				size--;
				return result;
			}
			else if(index==1)
			{
				T result=current.t;
				head=current.next;
				size--;
				return result;
			}
			else
			{
				T result = head.t;
				head = head.next;
				size--;
				
				System.out.println("請輸入大於等於1的數字");
				return result;
			}
		}
		else
			System.out.println("輸入值過大2");
		return null;
		
	}
	
	public void printList() 
	{
		//print the list 
		current = head;
		while(current!=null)
		{
			System.out.println(current.t);
			current = current.next;
			
		}
		System.out.println("size:"+size);
	}
	
	public void printHead()
	{
		System.out.println(head.t);
	}
	
	public void printCurrent()
	{
		System.out.println(current.t);
	}
	

}