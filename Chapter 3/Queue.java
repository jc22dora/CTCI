
public class Queue {
    Node first, last;
    public class Node {
        Node next;
        Object data;
        public Node(Object item) {
            next = null;
            data = item;
        }
    }
    public void enqueue(Object item){
        Node enqueued = new Node(item);
        if(first != null) {
            last.next = enqueued;
            last = last.next;
        }
        else{
            first = enqueued;
            last = first;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Stack obj = new Stack();
        
    }
    
}
