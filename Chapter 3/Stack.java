public class Stack {
    public class Node {
        Node next;
        Object data;
        public Node(Object item) {
            next = null;
            data = item;
        }
    }

    Node top;
    public void push(Object item) {
        Node pushed = new Node(item);
        if(top!=null) {
            pushed.next = top;
            top = pushed;
        }
        else{
            top = pushed;
        }
    }
    public Object pop() {
        Node popped = top;
        top = top.next;
        popped.next = null;
        return popped.data;
    }
    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.printStack();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
    
}
