package list;


public class TestList {
	public static void main(String[] args) {
		testLinkedList();
	}

	public static void testLinkedList() {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addLast(4);
		list.add(0, 0);
		list.add(1, 7);
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
