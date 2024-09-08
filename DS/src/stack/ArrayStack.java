package stack;

public class ArrayStack<E> implements IStack<E> {
	private static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1; // index of the top element in stack

	public ArrayStack() {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[CAPACITY];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t + 1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return t == -1;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (isEmpty())
			return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if (size() == data.length)
			throw new IllegalStateException("Stack is full");
		data[++t] = e;

	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		return data[t];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (E e : data) {
			sb.append(e);
		}
		return sb.toString();
	}

}
