import java.util.Stack;

class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (maxStack.isEmpty() || val >= maxStack.peek()) {
            maxStack.push(val);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            int removed = mainStack.pop();
            if (removed == maxStack.peek()) {
                maxStack.pop();
            }
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack stack = new MaxStack();
        stack.push(10);  
        stack.push(5);   
        stack.push(20);  
        stack.push(15);  

        System.out.println("Top element: " + stack.top());       
        System.out.println("Max element: " + stack.getMax());    

        stack.pop();  
        System.out.println("Top element after pop: " + stack.top());    
        System.out.println("Max element after pop: " + stack.getMax()); 

        stack.pop();  
        System.out.println("Max element after popping max: " + stack.getMax()); 
    }
}
