package selfnode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SelfSingleLinkedList<T> {

	NodeSelf<T> head;
	int size;

	public SelfSingleLinkedList() {
		size = 0;
		head = null;
	}

	public void addFirst(T data) {		// complete
		NodeSelf<T> firstnode = new NodeSelf<>(data);
		firstnode.next = head;
		head = firstnode;
		size++;
	}

	public void addAfter(NodeSelf<T> bf, T data) {		// complete
		NodeSelf<T> newnode = new NodeSelf<>(data);		// 객체 이름받는거라 쓸데 없을듯
		newnode.next = bf.next;
		bf.next = newnode;
		size++;
	}

	public void addLast(T data) {	// complete
		if(size == 0) {
			addFirst(data);
			size++;
		}
		else if(size == 1) {
			NodeSelf<T> newnode = new NodeSelf<>(data);
			newnode.next = head.next;
			head.next = newnode;
			size++;
		}
		else {
			NodeSelf<T> p = head;
			for(int i = 0; i < size-1; i++)
				p = p.next;
			NodeSelf<T> newnode = new NodeSelf<>(data);
			newnode.next = p.next;
			p.next = newnode;
			size++;
		}
	}

	public boolean addIndex(int index, T data) {	// complete
		if(index < 0 || index >= size)
			return false;
		if(index == 0) {
			addFirst(data);
			return true;
		}
		else {
			NodeSelf<T> newnode = new NodeSelf<>(data);
			NodeSelf<T> p = head;
			NodeSelf<T> q = p;
			for(int i = 0; i < index; i++) {
				q = p;
				p = p.next;
			}
			newnode.next = q.next;
			q.next = newnode;
			size++;
			return true;
		}
	}

	public void DataPrint(int index) {		// complete
		if(index == 0) {
			System.out.println(head.data);
		}
		else {
			NodeSelf<T> p = head;
			for(int i = 0; i < index; i++)
				p = p.next;
			System.out.println(p.data);
		}
	}

	public int getIndex(NodeSelf<T> sc) {	// complete
		if(head.data.equals(sc.data))
			return 0;
		int i = 0;
		NodeSelf<T> p = head;
		while(i < size-1) {
			p = p.next;
			if(p.data.equals(sc.data))
				return i+1;
			i++;
		}
		return -1;
	}
	public void remove(int index) {		// complete
		if(index == 0) {
			head = head.next;
			size--;
		}
		else if(index == 1) {
			head.next = head.next.next;
			size--;
		}
		else {
			NodeSelf<T> p = head;
			NodeSelf<T> q = p;
			for(int i = 0; i < index; i++) {
				q = p;
				p = p.next;
			}
			q.next = p.next;
			size--;
			System.out.println("delete");
		}
	}

	public void AllDataPrint() {
		NodeSelf<T> p = head;
		for(int i = 0; i < size-1; i++) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println(p.data);
	}

	public NodeSelf<T> getNode(int index){
		if(index == 0)
			return head;
		else if(index == 1)
			return head.next;
		else {
			NodeSelf<T> p = head;
			for(int i = 0; i < index; i++)
				p = p.next;
			return p;
		}
	}

	public T getData(int index) {
		if(index == 0)
			return head.data;
		else if(index == 1)
			return head.next.data;
		else {
			NodeSelf<T> p = head;
			for(int i = 0; i < index; i++)
				p = p.next;
			return p.data;
		}
	}
	// 3/15 Iterator 반복자 구현
	public Iterator<T> iterator(){
		return new MyIterator();
	}
	
	private class MyIterator implements Iterator<T> {
		private NodeSelf<T> nextNode;
		
		public MyIterator() {
			nextNode = head;
		}
		
		@Override
		public boolean hasNext() {	
			return (nextNode != null);
		}

		@Override
		public T next() {
			if(nextNode == null)
				throw new NoSuchElementException();
			T val = nextNode.data;
			nextNode = nextNode.next;
			return val;
		}
		
		public void remove() {
			// later
		}
		
	}

	public static void main(String[] args) {

		SelfSingleLinkedList<String> linkedList = new SelfSingleLinkedList<>();
		linkedList.addFirst("jinwoo");
		linkedList.addFirst("111");
		linkedList.addLast("tired");
		System.out.println(linkedList.size);
		linkedList.addLast("123");
		linkedList.addLast("456");
		boolean a = linkedList.addIndex(3, "hi");
		System.out.println(a);
		linkedList.addLast("d");
		linkedList.AllDataPrint();
		linkedList.DataPrint(2);
		linkedList.remove(2);
		linkedList.AllDataPrint();
		NodeSelf<String> i = linkedList.getNode(0);
		System.out.println(i);
//		Object b = linkedList.getData(2);
//		System.out.println(b);
	}
}
