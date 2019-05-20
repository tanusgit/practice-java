package linkedlist;

public class Createlinkedlist<E> {
	class Node<E>{
		private Node<E> next;
		private Node<E> prev;
		private E data;
		private int size;
		public Node(){
			
		}
		public Node(Node<E> anyNode, E data){
			this.data = data;
			next = anyNode;
		}
		public E getdata(){
			return data;
		}
		public void setdata(E n){
			 data = n;
		}
		public Node<E> getnext(){
			return next;
		}
		public void setnext(Node<E> n){
			 next = n;
		}
		public int size(){
			return size;
		}
		public boolean isEmpty(){
			return size == 0;
		}
		public void addLast(Node<E> newNode, E data){
			if (next == null){
				return;
			}else{
				next = newNode;
				next.data = data;	
			}		
		}
		public void removeLast(){
			if (next == null){
				return;
			}
			else{
				next = next.prev;
			}
		}
	}
	/*
	 * Create variables for linkedlist class
	 * Linkedlist should have a reference variable called start and a variable to
		store size of linkedlist
	 */
	Node<E> start;
	 private int size;
	//
	public Createlinkedlist(){
		start = null;
		size = 0;
		
	}
	public void printlist(){
		Node<E> t;
		t = start;
		for(int i = 1; i <= size; i++){
			System.out.println(t.getdata());
			t = t.getnext();
		}
	}
	public void insertFirst(E value){
		Node<E >n = new Node<E>();
		n.setdata(value);
		n.setnext(start);
		start = n;
		size++;
	}
	public void insertLast(E value){
		Node<E >n = null;
		n.setdata(value);
		start.setnext(n);
		size++;
	}
}
		

