package list;

public class TestList {
	public static void main(String[] args) {
//		testLinkedList();
		testArrayList();
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

	public static void testArrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);
		list.add(4, 5);
		list.remove(2); // 1 2 4 5
		list.removeFirst(); //2 4 5
		list.addFirst(10); //10 2 4 5
		list.add(0, 11); //11 10 2 4 5
		list.addLast(20); // 11 10 2 4 5 20
		System.out.println(list.get(1));//10
//		list.get(10); // index 10 of bounds
		Iterator iterator = list.interator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
