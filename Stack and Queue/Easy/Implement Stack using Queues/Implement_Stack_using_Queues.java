import java.util.*;

class MyStack {
    Deque<Integer> stack;

    public MyStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }
    
    public int top() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
