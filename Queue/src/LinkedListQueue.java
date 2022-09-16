public class LinkedListQueue<E> implements Queue<E> {
    SingleLinkedList<E> data = new SingleLinkedList<>();
    private static int capacity;
    private int size = 0;
    private int f = 0;

    public LinkedListQueue(int capacity){
        SingleLinkedList<E> data = new SingleLinkedList<>();

    }
    @Override
    public void enqueue(E e) {

        data.addLast(e);
    }

    @Override
    public E dequeue()
    {
      E answer =  data.first().getElement();
      data.removeFirst();
      return answer;

    }

    @Override
    public int size() {
        return data.getLength();
    }

    @Override
    public boolean isEmpty() {
        if( data.getLength() == 0){
            return isEmpty();
        } else
            return true;

    }

    @Override
    public E first() {
        return data.first().getElement();
    }
}
