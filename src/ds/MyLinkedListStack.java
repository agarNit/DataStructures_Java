package ds;

public class MyLinkedListStack {
    MyLinkedList stack = new MyLinkedList();

    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public void push(Integer data){
        stack.addAtTail(data);
    }

    public Integer peek() throws Exception {
        return stack.get(stack.size());
    }

    public Integer pop() throws Exception {
        Integer temp = stack.get(stack.size());
        stack.removeAtTail();
        return temp;
    }

    public void printStack(){
        stack.printList();
    }

}
