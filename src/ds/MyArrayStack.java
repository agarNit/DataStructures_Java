package ds;


public class MyArrayStack {
    MyArrayList stack;

    public MyArrayStack() throws Exception {
        this(16);
    }

    public MyArrayStack(int capacity) throws Exception {
        stack = new MyArrayList(capacity);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(Integer data){
        stack.add(data);
    }

    public Integer peek(){
        return stack.get(stack.size() - 1);
    }

    public Integer pop() throws Exception {
        Integer temp = stack.get(stack.size() - 1);
        stack.removeAt(stack.size() - 1);
        return temp;
    }

    public void printStack(){
        stack.printArray();
    }
}
