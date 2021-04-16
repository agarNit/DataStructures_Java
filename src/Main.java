
import ds.MyArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        testMyArrayList();
    }
    public static void testMyArrayList () throws Exception {
        MyArrayList arr = new MyArrayList();
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        arr.add(4);
        arr.add(5);
        System.out.println(arr.size());
        arr.add(6);
        arr.add(9);
        System.out.println(arr.size());
        arr.add(6);
        arr.add(9);
        System.out.println(arr.size());
        arr.set(4,10);
        arr.addAt(3,11);


        System.out.println(arr.isEmpty());
        arr.print(0,arr.size());
        System.out.println();
        arr.addAt(7,100);
        arr.print(0,arr.size());
        arr.remove(9) ;
        System.out.println();
        arr.print(0,arr.size());

    }

}
