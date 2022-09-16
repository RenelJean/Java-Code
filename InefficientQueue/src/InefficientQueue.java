/***
 * Author: Renel Jean-Baptiste
 * Program: the stack pops the most recent enqueued item since stacks are LIFO ds.
 *  I wasn't sure if I was supposed to mimic array queue in this program but that
 *  would make it a FIFO ds instead of a LIFO ds so I created the program to a LIFO ds when dequeuing.
 *
 * @param <E>
 */
public class InefficientQueue<E> implements Queue<E> {
    private E[] data;
    private int capacity=1000;
    private int size =0;
    private int f = 0;
    private int t = -1; // top element in stack

    public InefficientQueue(){
        this(1000);
    }

    public InefficientQueue(int capacity){
        data =(E[]) new Object[capacity];

    }

    @Override
    public void enqueue(E e) {
        data[size] = e;
        size++;
    }

    @Override
    public  E dequeue() {  if (isEmpty()) {
        return null;
    }
        E temp = data[size - 1];
        data[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return (t + 1);
    }
    public boolean isEmpty(){
        if (size > 0)
            return false;
        else
            return true;
    }

    @Override
    public E first() {
        return data[f];
    }

    public void push(E e) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is at capacity");
        data[++t] = e;
    }
    public E top(){
        if (isEmpty())
        {
            return null;
        }
        return data[t];
    }
    public E pop(){
        if(isEmpty()){return  null;}
        E ans = data[t];
        data[t] = null;
        t--;
        return ans;
    }
}
