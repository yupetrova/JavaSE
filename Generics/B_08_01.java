class Stack<T> {
    private T data;
    private Stack<T> next;
    
    public Stack() {
        this.data = null;
        this.next = null;
    }
    
    public void push(T value) {
        Stack<T> newNode = new Stack<>();
        newNode.data = value;
        newNode.next = this.next;
        this.next = newNode;
    }
    
    public T pop() {
        if (next == null) return null;
        T value = next.data;
        next = next.next;
        return value;
    }
    
    public void display() {
        if (next != null) {
            System.out.println(next.data);
            next.display();
        }
    }
}

public class B_08_01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        Stack<String> stack1 = new Stack<>();
        stack1.push("Hello");
        stack1.push("World");
        stack1.display();
    }
}