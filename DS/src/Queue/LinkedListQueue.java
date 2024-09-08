package Queue;

import list.SingleLinkedList;

public class LinkedListQueue<E> implements IQueue<E> {
	SingleLinkedList<E> list = new SingleLinkedList<>();

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		list.addLast(e);
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.getSize() == 0;
	}

}
