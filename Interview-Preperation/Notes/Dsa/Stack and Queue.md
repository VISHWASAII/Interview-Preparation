- Last In first out
- Push - to insert data
- Pop - the last element will remove the element
- Peak - Only used to check last element not remove

## Normal Way of Implementing Stack 

```
import java.util.*;

public class Main {
    
    static class Stack<T> {
        private static final int MAX_SIZE = 10;
        private T[] buffer;
        private int top;
        
        @SuppressWarnings("unchecked")
        Stack() {
            buffer = (T[]) new Object[MAX_SIZE];
            top = -1;
        }
        
        public void push(T val) {
            if (top == MAX_SIZE - 1) {
                throw new IndexOutOfBoundsException("Buffer is full");
            }
            buffer[++top] = val;
        }
        
        public T pop() {
            if (top == -1) {
                throw new IndexOutOfBoundsException("Buffer is empty");
            }
            return buffer[top--];
        }
        
        public T peek() {
            if (top == -1) {
                throw new IndexOutOfBoundsException("Buffer is empty");
            }
            return buffer[top];
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.pop());   // 12
        System.out.println(stack.peek());  // 11
    }
}

```

## Implementing using LinkedList

