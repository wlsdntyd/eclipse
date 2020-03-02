package node;

public class SingleLinkedList<T> {
	
	public Node<T> head; 
	public int size;
	
	public SingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = head;
		head = temp;
		size++;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}
	
	public T removeFirst() {
		if(head == null)
			return null;
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public T removeAfter(Node<T> current) {
		if(current.next == null)
			return null;
		T temp = current.next.data;
		current.next = current.next.next;
		size--;
		return temp;
	}
	
	public void add(int index, T item) {
		if(index < 0 || index > size)
			return;
		if(index == 0)
			addFirst(item);
		else {
			Node<T> q = getNode(index-1);
			addAfter(q, item);
		}
	}
	
	public T remove(int index) {
		if(index < 0 || index >= size)
			return null;
		if(index == 0)
			return removeFirst();
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
	}
	
	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while(p != null) {
			if(p.data.equals(item))
				return index;
			p = p.next;
			index++;
		}
		return -1;
	}
	
	public Node<T> getNode(int index) {
		if(index < 0 || index >= size)
			return null;
		Node<T> p = head;
		for(int i = 0; i < index; i++)
			p = p.next;
		return p;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size)
			return null;
		Node<T> p = head;
		for(int i = 0; i < size; i++)
			p = p.next;
		return p.data;
	}
	
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday");	// M, S, F
		list.add(2, "Tuesday");	// M, S, T, F
		
		// str = "Tuesday"
		list.remove(2);
		int pos = list.indexOf("Friday");

	}
}
