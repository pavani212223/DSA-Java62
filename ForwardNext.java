import java.util.stack;
public class ForwardNext {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<String> tempStack = new Stack<>();
        stack.push("Page 1");
        stack.push("Page 2");
        stack.push("Page 3");
        stack.push("Page 4");

        System.out.println("Current page: " + stack.peek());

        tempStack.push(stack.peek());
        stack.pop();
        System.out.println("Previous page: " + stack.peek());

        tempStack.push(stack.peek());
        stack.pop();
        System.out.println("Previous page: " + stack.peek());

        stack.push(tempStack.peek());
        tempStack.pop();
        System.out.println("Next page: " + stack.peek());
    }
} 
        
