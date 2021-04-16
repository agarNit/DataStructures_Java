
import ds.*;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Array Implementation starts");
        testMyArrayList();
        System.out.println("Array Implementation ends");
        System.out.println();
        System.out.println("LinkedList Implementation starts");
        testMyLinkedList();
        System.out.println("LinkedList Implementation ends");
    }

    public static void testMyArrayList () throws Exception {
        MyArrayList arr = new MyArrayList();
        System.out.println(arr.isEmpty());
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(6);
        arr.printArray();
        System.out.println();
        arr.set(2,3);
        arr.addAt(4,5);
        arr.printArray();
        System.out.println();
        arr.remove(6) ;
        arr.printArray();
        System.out.println();
        System.out.println( arr.size());
    }

    public static void testMyLinkedList() throws Exception {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.isEmpty());
        list.addAtHead(1);
        list.addAtTail(7);
        list.printlist();
        System.out.println();
        list.addAtIndex(2,2);
        list.addAtIndex(3,3);
        list.addAtIndex(5,4);
        list.addAtIndex(6,5);
        list.printlist();
        System.out.println();
        list.addAtIndex(4,4);
        list.printlist();
        System.out.println();
        list.removeAtIndex(5);
        list.removeAtTail();
        list.removeAtHead();
        list.printlist();
        System.out.println();
        System.out.println( list.size());
    }

}
