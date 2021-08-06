import java.util.LinkedList;

// 2:30

public class RemoveDups {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } 

    public static LinkedList<Integer> removeDups(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<Integer>();
        Node temp = list.getFirst();

        return list;
    }



    public static void main(String[] args) {
        System.out.println("Hello");
    }
}