public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } 

    public static LinkedList insert(LinkedList list, int data) {
        // list is empty
        if(list.head == null) {
            list.head = new Node(data);

        }
        else {
            // list is not empty
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new Node(data);


        }
        return list;
    }

    public static LinkedList removeDups(LinkedList list) {
        // create new empty linkedlist
        // iterate through list and adding every unique node to the new list
        // remove every node from og list after adding/passing

        LinkedList newList;
        Node temp = list.head;
        while(temp != null) {
            
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node temp = list.head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
        LinkedList list = new LinkedList();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        printList(list);
    }
}
