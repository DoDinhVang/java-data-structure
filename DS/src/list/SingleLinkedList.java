package list;

public class SingleLinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	public SingleLinkedList() {

	}

	public SingleLinkedList(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public Object getFirst() {
		return head.getData();
	}

	public Object getLast() {
		return tail.getData();
	}

	public Object get(int index) {
		Node current = head;
		if (index < 0 || index > size) {
			return null;
		}
		if (index == 0) {
			return head;
		}
		if (index == size - 1) {
			return tail;
		}

		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current;
	}

	public Object removeFirst() {
		if (size == 0) {
			return null;
		}
		Node temp = head; // temp là viết tắt của tempotary (tạm thời)
		head = head.getNext();
		size--;
		return temp.getData();
	}

	public Object removeLast() {
		if (size == 0) {
			return null;
		}
		Node temp = head;
		for (int i = 1; i < getSize() - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		size--;
		return temp.getData();
	}

	public Object remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		}
		if (size == 0) {
			return null;
		}
		Node temp = head;
		for (int i = 1; i < index - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		size--;
		return temp.getData();
	}

	public void addFirst(Node data) {
		if (size == 0) {
			head = tail = data;
		} else {
			Node temp = head;
			head = data;
			head.setNext(temp);
		}
		size++;
	}

	public void addLast(Node data) {
		if (size == 0) {
			head = tail = data;
		} else {
			Node currentNode = head;
			for (int i = 1; i < size; i++) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(data);
		}
		size++;
	}

	public void add(int index, Node data) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index" + index + "out of bound");
		}
		Node currentNode = head;
		for (int i = 1; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		Node temp = currentNode.getNext();
		data.setNext(temp);
		currentNode.setNext(data);
		size++;

	}

	private class LinkedListIterator implements Iterator {
		private Node currentNode;
		
		public LinkedListIterator() {
			currentNode = head;
		}
		public boolean hasNext() {
			return currentNode.getNext() != null;
		}

		public Node next() {
			Node temp = currentNode;
			currentNode = currentNode.getNext();
			return temp;
		}
		
	}

	public LinkedListIterator iterator() {
		return new LinkedListIterator();
	}
}
