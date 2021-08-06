import java.util.LinkedList;
public class LinkedListImp {

    Node head;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data=d;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(12);
        list.add(14);
        System.out.println(list);
    }
}
