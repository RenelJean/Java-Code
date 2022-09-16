
public class ArrayQueue<E> implements Queue<E> {
    private E[] data;
    private static int capacity;
    private int size = 0;
    private int f = 0;
    public ArrayQueue(int capacity){
       data =(E[])new Object[capacity];
    }

    public ArrayQueue(){
        this(capacity);
    }
   //Violates queue rule only supposed to the 1 item in queue
    public void printQueue(){
        for (int i = 0; i<= size;i++)
        System.out.println(" " +data[i]);
    }
    @Override
    public void enqueue(E e) throws IllegalStateException
    {
        if(size == capacity)throw new IllegalStateException("Queue is full");
        int insertlocation = (f+size) %capacity;
        data[insertlocation] = e;
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            return null;
        }
        E ans = data[f];
        data[f] = null;
        if( f == capacity) {
            f = (f++) % data.length;
        }
        //f++;
        size--;
       // System.out.println("F: " +f);
        return ans;

    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) {
            return false;
        } else
            return true;
    }

    @Override
    public E first() {
        return data[f];
    }
}
