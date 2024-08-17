package list;

public class Node {
	private Node next;
	private Object data;

	public Node() {
	}

	public Node(Node next, Object data) {
		this.next = next;
		this.data = data;
	}

	public Node(Node next) {
		this.next = next;
		this.data = null;
	}

	public Node(Object data) {
		this.data = data;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
