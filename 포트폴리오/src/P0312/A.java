package P0312;

import java.util.Stack;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("1");
		System.out.println(stack);
		stack.add("2");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	
	}

}
