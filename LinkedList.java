package linklist;

public class LinkedList {
	private class Node{
		Node next;
		Node prev;
		int value;
		
		//constructor to make a node
		public Node(int value){
			this.value = value;
		}
	}//end of Node class
	
	LinkedList list;
	int count;
	//new node would be created with value = val and for loop would make node until it 
	//reached num amount
	/*LinkedList(int num, int val){
		for(int i = 0; i <num; i++) {
			Node node = new Node(val);
		}
	}*/
	

	Node head;
	Node tail;
	int size = 0;
	
	LinkedList(){
		size++;
	}
	
public int size() {
	return size;
}
	
public boolean isEmpty() {
	return (size == 0);
}
	
	public void Add(int value) {
		Node n = new Node(value);
		if(head == null && tail == null) {
			head = n;
		}
		else {
		
		head.next = n ;
		}
	}
	String res = " ";
	public String toString() {
		while(true) {
		//if(head!= null) {
			res = res + head.value +" ";
			head = head.next;
			res = res + " "+ head.value +" "+ tail.value;
			if(tail.next == null) {
				break;		
			}
		}
		return res;
	}
	
	public void addFirst(int value) {
		if(head == null) {
			Node n = new Node(value);
			head = n;
			
		}

	}
	
	public void addLast(int item) {
		Node n = new Node(item);
		if(head == null) {
			head = tail = n;		
			}
		else {
		tail.next = n;
		tail = n;
		//n = tail;
		}
		
	}
	public void removeFirst() {
		if (head == null) {
			return;
		}
		head = head.next;
	}
	public void removeLast() {
		if (head == null) {
			return;
		}
		tail = tail.prev;
	}
	
	
	
	public void remove(int index) {
		while(head != null) {

		}
		
	}
}
