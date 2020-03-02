package node;

public class Node<T> {
	public T data;
	public Node<T> next;	// 주소값은 자기 자신이어야 해서 클래스 객체
	
	public Node(T item) {
		data = item;
		next = null;
	}
}
