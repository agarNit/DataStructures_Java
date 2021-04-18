package ds;

public class MyArrayQueue {
    MyArrayList queue;

    public MyArrayQueue() throws Exception{
        this(16);
    }

    public MyArrayQueue(int capacity) throws Exception{
        queue = new MyArrayList(capacity);
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void enQueue(Integer data){
        queue.add(data);
    }

    public Integer peek(){
        return queue.get(queue.size() - 1);
    }

    public Integer deQueue() throws Exception {
        Integer temp = queue.get(0);
        queue.removeAt(0);
        return temp;
    }

    public void printQueue(){
        queue.printArray();
    }
}
