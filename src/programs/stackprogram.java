package programs;

import java.util.Stack;

public class stackprogram {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("apple");
        stack.push("banana");//adding
        stack.push("mango");
        stack.push("orange");// top position 1 (last in 1st out)
        int position=stack.search("banana");
        System.out.println(position);
        boolean isempty=stack.empty();// to check whether stack is empty
        System.out.println(isempty);
        System.out.println(stack.pop()); //remove the top element from the stack and return it back to you
        System.out.println(stack.peek()); // it doesn't remove the element it will return the the element
        System.out.println(stack); // to check whether element is removed or not
    }
}
