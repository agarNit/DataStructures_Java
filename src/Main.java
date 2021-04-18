
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
        System.out.println();
        System.out.println("MyArrayStack Implementation starts");
        testMyArrayStack();
        System.out.println("MyArrayStack Implementation ends");
        System.out.println();
        System.out.println("MyLinkedListStack Implementation starts");
        testMyLinkedListStack();
        System.out.println("MyLinkedListStack Implementation ends");
        System.out.println();
        System.out.println("MyArrayQueue Implementation starts");
        testMyArrayQueue();
        System.out.println("MyArrayQueue Implementation ends");
    }

    public static void testMyArrayList() throws Exception {
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
        list.printList();
        System.out.println();
        list.addAtIndex(2,2);
        list.addAtIndex(3,3);
        list.addAtIndex(5,4);
        list.addAtIndex(6,5);
        list.printList();
        System.out.println();
        list.addAtIndex(4,4);
        list.printList();
        System.out.println();
        list.removeAtIndex(5);
        list.removeAtTail();
        list.removeAtHead();
        list.printList();
        System.out.println();
        System.out.println( list.size());
    }

    public static void testMyArrayStack() throws Exception {
       MyArrayStack sa  = new MyArrayStack();
       System.out.println(sa.isEmpty());
       sa.push(1);
       sa.push(2);
       sa.push(3);
       sa.push(4);
       sa.push(5);
       sa.printStack();
       System.out.println();
       System.out.println(sa.pop());
       sa.printStack();
       System.out.println();
       System.out.println(sa.peek());
       System.out.println(sa.size());
    }

    public static void testMyLinkedListStack() throws Exception {
        MyLinkedListStack sl = new MyLinkedListStack();
        System.out.println(sl.isEmpty());
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.push(5);
        sl.printStack();
        System.out.println();
        System.out.println(sl.pop());
        sl.printStack();
        System.out.println();
        System.out.println(sl.peek());
        System.out.println(sl.size());
    }

    public static void testMyArrayQueue() throws Exception{
        MyArrayQueue aq = new MyArrayQueue();
        System.out.println(aq.isEmpty());
        aq.enQueue(1);
        aq.enQueue(2);
        aq.enQueue(3);
        aq.enQueue(4);
        aq.enQueue(5);
        aq.printQueue();
        System.out.println();
        System.out.println(aq.deQueue());
        aq.printQueue();
        System.out.println();
        System.out.println(aq.peek());
        System.out.println(aq.size());
    }
}
