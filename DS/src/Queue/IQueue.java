package Queue;

public interface IQueue<E> {
	void enqueue(E e);
	E dequeue();
	E first();
	int size();
	boolean isEmpty();
}
