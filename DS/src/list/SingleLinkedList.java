package list;

public class SingleLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;

	public SingleLinkedList() {

	}

	public SingleLinkedList(Node<E> head, Node<E> tail) {
		this.head = head;
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public E getFirst() {
		return head.getData();
	}

	public E getLast() {
		return tail.getData();
	}

	public E get(int index) {
		if (index < 0 || index > size) {
			return null;
		}
		if (index == 0) {
			return getFirst();
		}
		if (index == size - 1) {
			return getLast();
		}
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	public E removeFirst() {
		if (size == 0) {
			return null;
		}
		Node<E> temp = head; // temp là viết tắt của tempotary (tạm thời)
		head = head.getNext();
		size--;
		return temp.getData();
	}

	public E removeLast() {
		if (size == 0) {
			return null;
		}
		if (size == 1) {
			Node<E> temp = head;
			head = tail = null;
			size = 0;
			return temp.getData();
		}
		Node<E> current = head;
		for (int i = 1; i < size - 1; i++) {
			current = current.getNext();
		}
		Node<E> temp = tail;
		tail = current;
		tail.setNext(null);
		size--;
		return temp.getData();
	}

	public E remove(int index) {
		if (index < 0 || index >= size) {
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == size - 1) {
			return removeLast();
		} else {
			Node<E> previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.getNext();
			}
			Node<E> current = previous.getNext();
			previous.setNext(current.getNext());
			size--;
			return current.getData();
		}

	}

	public void addFirst(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.setNext(head);
		head = newNode;
		if (size == 0) { // the new node is the only node in list
			tail = head;
		}
		size++;
	}

	public void addLast(E data) {
		Node<E> newNode = new Node<E>(data);
		if (size == 0) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
		size++;
	}

	public void add(int index, E data) {
		if (index == 0)
			addFirst(data);
		else if (index >= size)
			addLast(data);
		else {
			Node<E> currentNode = head;
			for (int i = 1; i < index; i++) {
				currentNode = currentNode.getNext();
			}
			Node<E> temp = currentNode.getNext();
			currentNode.setNext(new Node<E>(data));
			(currentNode.getNext()).setNext(temp);
			size++;
		}

	}

	private class LinkedListIterator implements Iterator {
		private Node<E> currentNode;

		public LinkedListIterator() {
			currentNode = head;
		}

		public boolean hasNext() {
			return currentNode != null;
		}

		public E next() {
			E data = currentNode.getData();
			currentNode = currentNode.getNext();
			return data;
		}

	}

	public LinkedListIterator iterator() {
		return new LinkedListIterator();
	}
}
