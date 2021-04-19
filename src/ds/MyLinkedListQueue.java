package ds;

public class MyLinkedListQueue {
    MyLinkedList queue = new MyLinkedList();

    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public void enQueue(Integer data){
        queue.addAtTail(data);
    }

    public Integer peek() throws Exception {
        return queue.get(1);
    }

    public Integer deQueue() throws Exception {
        Integer temp = queue.get(1);
        queue.removeAtHead();
        return temp;
    }

    public void printQueue(){
        queue.printList();
    }
}
