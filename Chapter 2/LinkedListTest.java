import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTest {


    public void fillList(LinkedList<String> list, String str) {
        String[] strArray = str.split("");
        for(int i=0;i<str.length();i++) {
            list.addLast(strArray[i]);
        }
    }
    public void fillList(LinkedList<Integer> list, int[] vals) {
        for(int i=0;i<vals.length;i++) {
            list.addLast(i);
        }
    }

    public int findLength() {
        Iterator<E> iter = list.iterator();
        int length = 0;
        while(iter.hasNext()) {
            length += 1;
        }
        return length;
    }



    public static void main(String[] args) {
        System.out.println("Hello");

        LinkedList<Integer> intList = new LinkedList<>();
        LinkedList<String> strList = new LinkedList<>();

        LinkedListTest strTest = new LinkedListTest();
        LinkedListTest intTest = new LinkedListTest();

        strTest.fillList(strList,"abcdefg");
        intTest.fillList(intList,new int[20]);
        System.out.println(intList);
        System.out.println(strList);
        System.out.println(intList.size());
    }
}