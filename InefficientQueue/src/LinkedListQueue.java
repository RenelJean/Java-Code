public class LinkedListQueue<E> implements Queue<E> {
    SingleLinkedList<E> data = new SingleLinkedList<>();

    @Override
    public void enqueue(E e) {
     data.addLast(e);
    }

    @Override
    public E dequeue() {
        E answer = data.first().getElement();
        data.removeFirst();
        return answer;
    }

    @Override
    public int size() {
        return data.getLength();
    }

    @Override
    public boolean isEmpty() {
        return (data.getLength() == 0);
    }

    @Override
    public E first(){
        return data.first().getElement();
    }
}
