
public class kthToLast {
    // 12:45
    // kthToLast is singly linkedlist implementation
        Node head;
        // implement node
        public class Node {
            int data;
            Node next;

            public Node(int d) {
                data = d;
                next = null;
            }
        }

        public kthToLast insert(kthToLast list, int d) {

            if(list.head != null) {
                // list is not empty
                Node temp = list.head;
                while(temp.next != null) {
                    temp=temp.next;
                }
                temp.next = new Node(d);
                
            }
            else{
                // list is empty
                list.head = new Node(d);
            }
            return list;
        }

        public void printList(kthToLast list) {
            Node temp = list.head;
            while(temp != null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        public void findKth(kthToLast list, int k) {
            // first iterator which is k nodes ahead
            Node first = list.head;
            // last iterator 
            Node last = list.head;

            for(int i=0;i<=k;i++) {
                first = first.next;
            }
            while(first != null) {
                first = first.next;
                last = last.next;
            }
            System.out.println(last.data);

            
        }
    

    
    // fill 

    // kth to last function
    public static void main(String[] args){
        System.out.println("Hello");
        kthToLast kth = new kthToLast();
        

        for(int i = 0;i<10;i++) {
            kth = kth.insert(kth,i+1);
        }
        kth.printList(kth);
        kth.findKth(kth, 3);

    }
    
}
