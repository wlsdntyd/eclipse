package node;

public class Node<T> {
	public T data;
	public Node<T> next;	// �ּҰ��� �ڱ� �ڽ��̾�� �ؼ� Ŭ���� ��ü
	
	public Node(T item) {
		data = item;
		next = null;
	}
}
