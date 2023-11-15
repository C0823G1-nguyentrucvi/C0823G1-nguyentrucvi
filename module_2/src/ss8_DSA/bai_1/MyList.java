package ss8_DSA.bai_1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity:"+capacity);
        }
    }

    int Size(){
        return this.size;
    }private  void clear(){
        size=0;
        for (int i = 0; i < elements.length; i++) {
            elements[i]=null;
        }
    }
    public boolean add(E elements)  {
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = elements;
        size++;
        return true;
    }

    void add(E element, int index){
        if (index>element.lenght){
        throw new IllegalArgumentException("index"+index);
    }else if(element.length==size){
            this.ensureCapacity(5);
        }if(element[index]==null){
            elements[index]=element;
            size++;
        }else {
            for (int i = 0; i >= index; i--) {
                elements[i]=element[i-1]
            }
            elements[index]=element;
            size++;
        }


    }
    private void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize= this.elements.length+minCapacity;
            elements=Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("mincapacity"+minCapacity);
        }
    }


    public Test.Student get(int i) {

        return null;
    }

    public boolean indexOf(E student1) {
        return false;
    }

    public boolean contains(E student3) {
        return true;
    }

    public int size() {

        return 0;
    }
}






