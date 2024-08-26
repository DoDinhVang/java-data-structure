package list;

public class ArrayList<E> implements IList<E>, Iterable {
	public static final int DEFAULT_OPACITY = 16;
	private E[] data = (E[]) new Object[DEFAULT_OPACITY];
	private int size = 0;

	public ArrayList() {
	}

	@Override
	public void addFirst(E data) {
		// TODO Auto-generated method stub
		ensureCapacity();
		for (int i = size - 1; i >= 0; i--) {
			this.data[i + 1] = this.data[i];
		}
		this.data[0] = data;
		size++;
	}

	@Override
	public void addLast(E data) {
		// TODO Auto-generated method stub
		ensureCapacity();
		this.data[size++] = data;
	}

	@Override
	public void add(int index, E data) {
		// TODO Auto-generated method stub
		ensureCapacity();
		for (int i = size - 1; i >= index; i--) {
			this.data[i + 1] = this.data[i];
		}
		this.data[index] = data;
		size++;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if (size == 0)
			return null;
		E e = this.data[0];
		for (int i = 0; i < size; i++) {
			this.data[i] = this.data[i + 1];
		}
		this.data[size - 1] = null;
		size--;
		return e;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		if (size == 0)
			return null;
		E e = this.data[size - 1];
		this.data[size - 1] = null;
		size--;
		return e;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		checkBoundary(index);
		E e = this.data[index];
		for (int i = index; i < size; i++) {
			this.data[i] = this.data[i + 1];
		}
		this.data[size - 1] = null;
		size--;
		return e;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		if (size == 0)
			return null;
		return data[0];
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		if (size == 0)
			return null;
		return data[size - 1];
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		checkBoundary(index);
		return data[index];
	}

	@Override
	public Iterator interator() {
		// TODO Auto-generated method stub
		return new ArrayIterator();
	}

	private class ArrayIterator implements Iterator {
		private int current = 0; // current index

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current < size;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return data[current++];
		}

	}

	private void ensureCapacity() {
		if (size >= data.length) {
			E[] newData = (E[]) new Object[size * 2];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	private void checkBoundary(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index" + index + " out of bounds");
		}
	}

}
