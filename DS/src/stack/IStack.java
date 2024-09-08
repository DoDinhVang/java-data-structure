package stack;

public interface IStack<E> {
	int size();
	boolean isEmpty();
	E pop();
	void push(E e);
	E top();
	
}
