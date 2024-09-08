package stack;

public class TestStack {
	public static void main(String[] args) {
		testArrayStack();
	}

	public static void testArrayStack() {
		ArrayStack<Integer> stack = new ArrayStack<>(); // cotent()
		stack.push(5); // content(5)
		stack.push(3); // content(5,3)
		System.out.println(stack.size()); // content(5,3) output 2
		System.out.println(stack.pop()); // content(5) output 3
		System.out.println(stack.isEmpty()); // content(5) output false
		System.out.println(stack.pop()); // content() output 5
		System.out.println(stack.isEmpty()); // content() output true
		System.out.println(stack.pop()); // content() output null
		stack.push(5);
		stack.push(9);
		System.out.println(stack.top()); // content(5,9) output 9
		System.out.println("");
	}
}
