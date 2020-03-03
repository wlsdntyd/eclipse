package selfnode;

public class NodeSelf<T> {

	T data;
	NodeSelf<T> next;

	public NodeSelf(T data) {
		this.data = data;
		next = null;
	}
}
