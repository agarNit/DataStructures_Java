package ds;

public class MyArrayList {
    private Integer[] array;
    private int length;
    private int capacity;
    public MyArrayList() throws Exception {
        this(16);
    }
    public MyArrayList(int capacity) throws Exception {
        if(capacity < 0) {
            throw new Exception("IndexOutOfBounds");
        }
        this.capacity = capacity;
        array = new Integer[capacity];
    }

    public void add(Integer data){
        if(length == capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;
            Integer[] new_array = new Integer[capacity];
            for(int i=0;i<length;i++){
                new_array[i] = array[i];
            }
            array = new_array;
        }
        array[length++] = data;
    }

    public void addAt(int index, Integer data) throws Exception {
        if(index > length){
            throw new Exception("IndexOutOfBounds");
        }
        if(length == capacity) {
            if (capacity == 0)
                capacity = 1;
            else
                capacity *= 2;
            Integer[] new_array = new Integer[capacity];
            for(int i=0;i<length;i++){
                new_array[i] = array[i];
            }
            array = new_array;
        }
        for(int i=length-1;i>=index;i--){
            array[i+1] = array[i];
        }
        array[index] = data;
        length++;
    }

    public void removeAt(int index) throws Exception {
        if(index >= length){
            throw new Exception("IndexOutOfBounds");
        }
        int i;
        for(i=index;i<length-1;i++) {
            array[i] = array[i+1];
        }
        length--;
    }

    public void remove(Integer data) throws Exception {
        for(int i=0;i<length;i++){
            if(array[i] == data)
                removeAt(i);
        }
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public Integer get(int index){
        return array[index];
    }

    public void set(int index, Integer data) {
        array[index] = data;
    }

    public void print(int start, int end) {
        for(int i= start;i<end;i++) {
            System.out.print(this.get(i) + " ");
        }
    }
}
