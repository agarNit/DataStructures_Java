package ds;

public class MyLinkedList {
    private int length = 0;
    private Node head = null;
    private Node tail = null;

    private static class Node {
        private Integer data;
        private Node prev;
        private Node next;

        public Node(Integer data, Node prev, Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Integer get(int index) throws Exception {
        if(isEmpty() || index > length || index < 1)
            throw new Exception("IndexOutOfBounds");
        Node trav = head;
        int i = 1;
        while(i != index){
            trav = trav.next;
            i++;
        }
        return trav.data;
    }

    public Integer first() throws Exception{
        if (isEmpty())
            throw new Exception("IndexOutOfBounds");
        return head.data;
    }

    public Integer last() throws Exception{
        if (isEmpty())
            throw new Exception("IndexOutOfBounds");
        return tail.data;
    }

    public void addAtHead(Integer data){
        if (isEmpty()) {
            head = tail = new Node (data, null, null);
        }
        else {
            head.prev = new Node (data, null, head);
            head = head.prev;
        }
        length++;
    }

    public void addAtTail(Integer data){
        if(isEmpty()){
            head = tail = new Node(data, null, null);
        }
        else{
            tail.next = new Node (data, tail, null);
            tail = tail.next;
        }
        length++;
    }

    public void addAtIndex(Integer data, int index) throws Exception{
        if(index < 1 || index > length ){
            throw new Exception("IndexOutOfBounds");
        }
        else if (isEmpty())
            head = tail = new Node(data, null, null);
        else{
            Node trav = head;
            int i = 1;
            while(i != index-1){
                trav = trav.next;
                i++;
            }
            Node val = trav.next;
            Node temp = new Node(data, trav, val);
            trav.next = temp;
            val.prev = temp;
        }
        length++;
    }

    public void removeAtHead() throws Exception {
        if (isEmpty()) {
            throw new Exception("No element to remove");
        }
        head = head.next;
        head.prev = null;
        length--;
    }

    public void removeAtTail() throws Exception {
        if (isEmpty()) {
            throw new Exception("No element to remove");
        }
        tail = tail.prev;
        tail.next = null;
        length--;
    }

    public void removeAtIndex(int index) throws Exception {
        if(isEmpty() || index <1 || index > length)
            throw new Exception("No element to remove");
        Node trav = head;
        int i = 1;
        while(i != index){
            trav = trav.next;
            i++;
        }
        if (trav.next != null){
            Node val = trav.next;
            Node temp = trav.prev;
            temp.next = val;
            val.prev = temp;
            length--;
        }
        else if(length == 1){
            head = null;
            length--;
        }
        else {
            removeAtTail();
        }

    }

    public void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
