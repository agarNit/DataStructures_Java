
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
        System.out.println();
        System.out.println("MyLinkedListQueue Implementation starts");
        testMyLinkedListQueue();
        System.out.println("MyLinkedListQueue Implementation ends");
        System.out.println();
        System.out.println("MyHeap Implementation starts");
        testMyHeap();
        System.out.println("MyHeap Implementation ends");
        System.out.println();
        System.out.println("UnionFind Implementation starts");
        testMyUnionFind();
        System.out.println("UnionFind Implementation ends");
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
        MyArrayQueue qa = new MyArrayQueue();
        System.out.println(qa.isEmpty());
        qa.enQueue(1);
        qa.enQueue(2);
        qa.enQueue(3);
        qa.enQueue(4);
        qa.enQueue(5);
        qa.printQueue();
        System.out.println();
        System.out.println(qa.deQueue());
        qa.printQueue();
        System.out.println();
        System.out.println(qa.peek());
        System.out.println(qa.size());
    }

    public static void testMyLinkedListQueue() throws Exception{
        MyLinkedListQueue ql = new MyLinkedListQueue();
        System.out.println(ql.isEmpty());
        ql.enQueue(1);
        ql.enQueue(2);
        ql.enQueue(3);
        ql.enQueue(4);
        ql.enQueue(5);
        ql.printQueue();
        System.out.println();
        System.out.println(ql.deQueue());
        ql.printQueue();
        System.out.println();
        System.out.println(ql.peek());
        System.out.println(ql.size());
    }

    public static void testMyHeap() throws Exception {
        MyHeap heap = new MyHeap();
        System.out.println(heap.isEmpty());
        heap.insert(10);
        heap.insert(4);
        heap.insert(9);
        heap.insert(1);
        heap.insert(7);
        heap.insert(5);
        heap.insert(3);
        heap.printHeap();
        System.out.println();
        heap.remove(1);
        heap.printHeap();
        System.out.println();
        heap.insert(11);
        heap.printHeap();
        System.out.println();
        System.out.println(heap.max());
        System.out.println(heap.maxChild(1));
        System.out.println(heap.min());
        System.out.println(heap.kthChild(1,2));
        System.out.println(heap.size());
    }

    public static void testMyUnionFind() throws Exception {
        MyUnionFind uf = new MyUnionFind(6);
        System.out.println(uf.isEmpty());
        uf.insert(0,1);
        uf.insert(1,3);
        uf.insert(2,5);
        uf.insert(3,7);
        uf.insert(4,9);
        uf.insert(5,11);
        uf.printUnion();
        System.out.println();
        System.out.println(uf.getComp());
        uf.unify(3,5);
        System.out.println(uf.getComp());
        System.out.println(uf.find(3));
        System.out.println(uf.connected(3,5));
    }
}
