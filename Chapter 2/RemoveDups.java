import java.util.LinkedList;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Node;
// 8:22

public class RemoveDups {
    // class

    // buffer strategy - place all elements of list in hashmap. If collision, remove node. 
    // this will run in O(n) time but O(2n) space
    // no buffer strategy - brute force dup search.
    // this will run in O(n^2) time but o(1) space
    public LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Node prev = new Node<Integer>();
        for(int e:list) {
            if(list.contains(e)) {

            }
        }

        return list;

    }
    public LinkedList<Integer> removeDuplicatesNoBuffer(LinkedList<Integer> list) {

        return list;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}