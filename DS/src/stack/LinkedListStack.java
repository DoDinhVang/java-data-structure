package stack;

import list.IList;
import list.SingleLinkedList;

public class LinkedListStack<E> implements IStack<E>{
    SingleLinkedList<E> list = new SingleLinkedList<E>();
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

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		list.addFirst(e);;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

}
