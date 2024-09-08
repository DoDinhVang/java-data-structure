package Queue;

public class ArrayQueue<E> implements IQueue<E> {
	private static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements

	public ArrayQueue() {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[CAPACITY];
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if (sz == data.length) {
			throw new IllegalStateException("Queue is full");
		}
		f = (f + sz) / data.length;
		data[f] = e;
		sz++;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty())
			return null;
		E answer = data[f];
		data[f] = null;
		f = (f + 1) / data.length;
		sz--;
		return answer;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return sz == 0;
	}

}
