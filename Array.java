import java.util.Iterator;

public class Array<T> implements Iterable<T> {
    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity" + capacity);
   this.capacity=capacity;
   arr=(T[]) new Object [capacity];


    }
    public int size(){ return len;}
    public boolean isEmpty (){return size()==0;}

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");String name ="scss";int jin=0;
        hello<String,Integer>  refer=new  hello<String,Integer>(name,jin);
        refer.print();
        //CREATING GENERIC METHODS


    }