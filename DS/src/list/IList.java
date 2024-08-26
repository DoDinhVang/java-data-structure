package list;

public interface IList <E> {
	void addFirst(E data); // mặc định modifier là public và là abstract
	void addLast(E data);
	void add (int index, E data);
	E removeFirst();
	E removeLast();
	E remove(int index);
	E getFirst();
	E getLast();
	E get(int index);
	int getSize();
}
